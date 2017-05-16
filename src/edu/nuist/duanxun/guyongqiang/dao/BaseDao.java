package edu.nuist.duanxun.guyongqiang.dao;

import edu.nuist.duanxun.guyongqiang.util.JDBCUtil;
import org.apache.commons.beanutils.BeanUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {

	/**
	 * 该方法是一个宏观更新的方法
	 * 
	 * @param connection
	 * @param sql
	 * @param params
	 */
	public void update(Connection connection, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			// 为编译的SQL语句填充占位符的值
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(null, preparedStatement, null);
		}
	}

	/**
	 * 查询一个实体的方法
	 * @return
	 */
	public <T> T get(Connection connection, Class<T> cls, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		T entity = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			resultSet = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			if (resultSet.next()) {
				// 通过反射构造一个对象
				entity = cls.newInstance();
				// 为对象的属性赋值
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String columnName = rsmd.getColumnLabel(i + 1);
					Object columnValue = resultSet.getObject(i + 1);
					BeanUtils.setProperty(entity, columnName, columnValue);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(resultSet, preparedStatement, null);
		}
		return entity;
	}

	public <T> List<T> getAll(Connection connection, Class<T> cls, String sql, Object... params) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<T> entityList = new ArrayList<T>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				preparedStatement.setObject(i + 1, params[i]);
			}
			resultSet = preparedStatement.executeQuery();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			while (resultSet.next()) {
				T entity = cls.newInstance();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					String columnName = rsmd.getColumnLabel(i + 1);
					Object columnValue = resultSet.getObject(i + 1);
					BeanUtils.setProperty(entity, columnName, columnValue);
				}
				entityList.add(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.releaseResources(resultSet, preparedStatement, null);
		}
		return entityList;
	}

}

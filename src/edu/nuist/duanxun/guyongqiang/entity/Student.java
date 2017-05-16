package edu.nuist.duanxun.guyongqiang.entity;

import java.util.Date;

/**
 * Created by John on 2017/5/16.
 */
public class Student {
    private Integer id;
    private String account;
    private String name;
    private String password;
    private String studyNumber;
    private boolean gender;
    private String phone;
    private String email;
    private Date birthday;
    private String interest;
    private String birthPlace;
    private String introduction;

    public Student() {
        super();
    }

    public Student(String account, String name, String password, String studyNumber, boolean gender, String phone, String email, Date birthday, String interest, String birthPlace, String introduction) {
        this.account = account;
        this.name = name;
        this.password = password;
        this.studyNumber = studyNumber;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.interest = interest;
        this.birthPlace = birthPlace;
        this.introduction = introduction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }

    public boolean isGender() {
        return gender;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}

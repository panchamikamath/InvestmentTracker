package com.vp.investment_tracker.model;

import java.util.List;

public class User {
    private String document_id;
    private String username;
    private String password;
    private String email;
    private long phoneNumber;
    private List<MutualFund> mutualFundList;

    public String getDocumentID() {
        return document_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setDocumentID(String document_id) {
        this.document_id = document_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<MutualFund> getMutualFundList() {
        return mutualFundList;
    }

    public void setMutualFundList(List<MutualFund> mutualFundList) {
        this.mutualFundList = mutualFundList;
    }
}

package org.select.dto;

import org.select.enums.UserEnum;

public class LoginResult {
    private int state;
    private String stateinfo;

    public int getState() {
        return state;
    }

    public String getStateinfo() {
        return stateinfo;
    }

    public LoginResult(UserEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateinfo = stateEnum.getStateinfo();
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "state=" + state +
                ", stateinfo='" + stateinfo + '\'' +
                '}';
    }
}

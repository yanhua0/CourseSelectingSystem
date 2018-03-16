package org.select.enums;

public enum UserEnum {
   NOUSER(-1,"账户不存在") ,
    STUDENT(0,"学生登陆成功"),
    TEACHER(1,"教师登陆成功"),
    ADMINISTRATOR(2,"管理员登陆成功"),
    FAIL(3,"密码错误");
    private int state;
    private String stateinfo;

    public int getState() {
        return state;
    }

    public String getStateinfo() {
        return stateinfo;
    }

    UserEnum(int state, String stateinfo) {
        this.state = state;
        this.stateinfo = stateinfo;
    }
    public static UserEnum stateof(int index)
    {
        for(UserEnum state:values())
        {
            if(state.getState()==index)
            {
                return state;
            }
        }
        return  null;
    }
}

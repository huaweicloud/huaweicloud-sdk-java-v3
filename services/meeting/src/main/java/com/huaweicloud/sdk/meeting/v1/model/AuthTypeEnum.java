package com.huaweicloud.sdk.meeting.v1.model;

public enum AuthTypeEnum {

    /**
     * 账号密码鉴权方式
     */
    ACCOUNT(0),

    /**
     * APPID鉴权方式
     */
    APP_ID(1);

    /**
     * Comment for <code>value</code><br>
     * 枚举值
     */
    private final int type;

    private AuthTypeEnum(int type) {
        this.type = type;
    }

    /**
     * <p>获取命令对象值 .</p>
     */
    public int getValue() {
        return type;
    }

    public Integer getIntegerValue() {
        return this.type;
    }
}

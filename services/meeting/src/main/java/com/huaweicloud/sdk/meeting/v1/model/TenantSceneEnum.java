package com.huaweicloud.sdk.meeting.v1.model;

public enum TenantSceneEnum {

    /**
     * 但租户
     */
    SINGLE_TENANT(0),

    /**
     * APPID鉴权方式
     */
    MULTI_TENANT(1);

    /**
     * Comment for <code>value</code><br>
     * 枚举值
     */
    private final int type;

    private TenantSceneEnum(int type) {
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

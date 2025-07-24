package com.huaweicloud.sdk.clouddc.v1.model;

import java.util.Objects;

/**
 * 设置实例的管理员账户初始登录密码，其中，Linux管理员账户为root，Windows管理员账户为Administrator。
 */
public class Password {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Password {\n");
        sb.append("}");
        return sb.toString();
    }

}

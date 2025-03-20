package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * IAM用户下次登录时是否需要修改密码。
 */
public class PasswordResetRequired {

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
        sb.append("class PasswordResetRequired {\n");
        sb.append("}");
        return sb.toString();
    }

}

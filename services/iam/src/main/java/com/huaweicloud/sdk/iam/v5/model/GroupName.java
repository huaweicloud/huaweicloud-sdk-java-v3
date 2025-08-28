package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 用户组名，长度为1到128个字符，可包含中文、英文、数字、空格、\&quot;_\&quot;、\&quot;-\&quot;、\&quot;{\&quot;和\&quot;}\&quot;的字符串。
 */
public class GroupName {

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
        sb.append("class GroupName {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 信任委托ID，长度为1到64个字符，只包含字母、数字和\&quot;-\&quot;的字符串。
 */
public class TrustAgencyId {

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
        sb.append("class TrustAgencyId {\n");
        sb.append("}");
        return sb.toString();
    }

}

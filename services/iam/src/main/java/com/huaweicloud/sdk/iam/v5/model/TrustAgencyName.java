package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 信任委托名称，长度为1到64个字符，只包含字母、数字、\&quot;_\&quot;、\&quot;+\&quot;、\&quot;&#x3D;\&quot;、\&quot;,\&quot;、\&quot;.\&quot;、\&quot;@\&quot;和\&quot;-\&quot;的字符串。
 */
public class TrustAgencyName {

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
        sb.append("class TrustAgencyName {\n");
        sb.append("}");
        return sb.toString();
    }

}

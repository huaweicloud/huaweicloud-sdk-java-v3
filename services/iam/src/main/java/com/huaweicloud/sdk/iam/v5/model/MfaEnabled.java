package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 虚拟MFA设备是否开启。
 */
public class MfaEnabled {

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
        sb.append("class MfaEnabled {\n");
        sb.append("}");
        return sb.toString();
    }

}

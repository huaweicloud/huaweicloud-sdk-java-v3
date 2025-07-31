package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 动态网页防篡改防护状态   - opened : 防护中   - closed : 未防护
 */
public class RaspProtectStatus {

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
        sb.append("class RaspProtectStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}

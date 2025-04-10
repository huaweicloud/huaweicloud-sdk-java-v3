package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 防护状态，包含如下2种。   - closed ：关闭。   - opened ：开启。
 */
public class ProtectStatus {

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
        sb.append("class ProtectStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}

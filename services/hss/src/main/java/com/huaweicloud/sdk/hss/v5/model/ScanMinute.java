package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 扫描分钟数（仅启动类型为period时有值）
 */
public class ScanMinute {

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
        sb.append("class ScanMinute {\n");
        sb.append("}");
        return sb.toString();
    }

}

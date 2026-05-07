package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 威胁等级，包含如下:   - Security：安全   - Low: 低危   - Medium: 中危   - High: 高危   - Critical: 危急
 */
public class Severity {

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
        sb.append("class Severity {\n");
        sb.append("}");
        return sb.toString();
    }

}

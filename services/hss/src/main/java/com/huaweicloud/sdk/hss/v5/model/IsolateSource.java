package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 隔离来源，包含如下:   - event : 安全告警事件   - antivirus : 病毒查杀
 */
public class IsolateSource {

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
        sb.append("class IsolateSource {\n");
        sb.append("}");
        return sb.toString();
    }

}

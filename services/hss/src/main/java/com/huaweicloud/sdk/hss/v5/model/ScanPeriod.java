package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 启动类型，包含如下:   - day ：每天   - week : 每周   - month : 每月
 */
public class ScanPeriod {

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
        sb.append("class ScanPeriod {\n");
        sb.append("}");
        return sb.toString();
    }

}

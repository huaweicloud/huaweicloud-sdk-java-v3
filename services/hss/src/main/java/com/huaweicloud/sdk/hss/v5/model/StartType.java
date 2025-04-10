package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 启动类型，包含如下:   - now : 立即启动   - later : 稍后启动   - period : 周期启动
 */
public class StartType {

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
        sb.append("class StartType {\n");
        sb.append("}");
        return sb.toString();
    }

}

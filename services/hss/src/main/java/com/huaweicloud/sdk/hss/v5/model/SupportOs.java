package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 支持的操作系统，包含如下:   - Linux ：支持Linux系统   - Windows : 支持Windows系统
 */
public class SupportOs {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
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
        sb.append("class SupportOs {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
 */
public class OsType {

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
        sb.append("class OsType {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
 */
public class GroupID {

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
        sb.append("class GroupID {\n");
        sb.append("}");
        return sb.toString();
    }

}

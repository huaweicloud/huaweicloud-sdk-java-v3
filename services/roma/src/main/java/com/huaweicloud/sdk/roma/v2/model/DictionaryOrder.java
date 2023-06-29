package com.huaweicloud.sdk.roma.v2.model;

import java.util.Objects;

/**
 * 字典排序，值越小顺序越靠前
 */
public class DictionaryOrder {

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
        sb.append("class DictionaryOrder {\n");
        sb.append("}");
        return sb.toString();
    }

}

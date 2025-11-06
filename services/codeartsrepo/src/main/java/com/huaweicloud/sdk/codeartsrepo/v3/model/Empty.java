package com.huaweicloud.sdk.codeartsrepo.v3.model;

import java.util.Objects;

/**
 * Empty
 */
public class Empty {

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
        sb.append("class Empty {\n");
        sb.append("}");
        return sb.toString();
    }

}

package com.huaweicloud.sdk.codehub.v3.model;

import java.util.Objects;

/** Empty */
public class Empty {

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
        sb.append("class Empty {\n");
        sb.append("}");
        return sb.toString();
    }

}

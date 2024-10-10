package com.huaweicloud.sdk.aad.v2.model;

import java.util.Objects;

/**
 * EmptyJsonResponse
 */
public class EmptyJsonResponse {

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
        sb.append("class EmptyJsonResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

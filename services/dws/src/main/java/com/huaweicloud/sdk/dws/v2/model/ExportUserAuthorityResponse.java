package com.huaweicloud.sdk.dws.v2.model;

import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportUserAuthorityResponse extends SdkStreamResponse {

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
        sb.append("class ExportUserAuthorityResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

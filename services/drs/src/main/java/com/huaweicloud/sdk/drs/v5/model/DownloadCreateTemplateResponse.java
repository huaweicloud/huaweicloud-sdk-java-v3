package com.huaweicloud.sdk.drs.v5.model;

import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DownloadCreateTemplateResponse extends SdkStreamResponse {

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
        sb.append("class DownloadCreateTemplateResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

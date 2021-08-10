package com.huaweicloud.sdk.devstar.v1.model;

import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/** Response Object */
public class DownloadApplicationCodeResponse extends SdkStreamResponse {

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
        sb.append("class DownloadApplicationCodeResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

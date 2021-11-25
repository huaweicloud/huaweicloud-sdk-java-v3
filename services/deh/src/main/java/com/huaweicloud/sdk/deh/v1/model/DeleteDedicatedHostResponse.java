package com.huaweicloud.sdk.deh.v1.model;

import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class DeleteDedicatedHostResponse extends SdkResponse {

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
        sb.append("class DeleteDedicatedHostResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

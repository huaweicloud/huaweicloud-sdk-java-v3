package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DownloadAccessoriesResponse extends SdkStreamResponse {


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
        sb.append("class DownloadAccessoriesResponse {\n");
        sb.append("}");
        return sb.toString();
    }
    
}


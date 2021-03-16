package com.huaweicloud.sdk.scm.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class PushCertificateResponse extends SdkResponse {


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
        sb.append("class PushCertificateResponse {\n");
        sb.append("}");
        return sb.toString();
    }
    
}


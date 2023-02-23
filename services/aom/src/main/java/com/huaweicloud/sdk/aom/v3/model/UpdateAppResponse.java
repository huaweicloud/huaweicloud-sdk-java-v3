package com.huaweicloud.sdk.aom.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "UpdateAppResponse")
public class UpdateAppResponse extends SdkResponse {


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
        sb.append("class UpdateAppResponse {\n");
        sb.append("}");
        return sb.toString();
    }
    
    
    
}


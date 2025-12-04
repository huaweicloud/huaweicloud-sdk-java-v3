package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DownloadHttpCertResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content-type")

    private String contentType;

    public DownloadHttpCertResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadHttpCertResponse that = (DownloadHttpCertResponse) obj;
        return Objects.equals(this.contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadHttpCertResponse {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

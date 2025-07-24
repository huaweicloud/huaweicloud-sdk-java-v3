package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DownloadServerLogsResponse extends SdkStreamResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Disposition")

    private String contentDisposition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Transfer-Encoding")

    private String contentTransferEncoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Type")

    private String contentType;

    public DownloadServerLogsResponse withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get contentDisposition
     * @return contentDisposition
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public DownloadServerLogsResponse withContentTransferEncoding(String contentTransferEncoding) {
        this.contentTransferEncoding = contentTransferEncoding;
        return this;
    }

    /**
     * Get contentTransferEncoding
     * @return contentTransferEncoding
     */
    public String getContentTransferEncoding() {
        return contentTransferEncoding;
    }

    public void setContentTransferEncoding(String contentTransferEncoding) {
        this.contentTransferEncoding = contentTransferEncoding;
    }

    public DownloadServerLogsResponse withContentType(String contentType) {
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
        DownloadServerLogsResponse that = (DownloadServerLogsResponse) obj;
        return Objects.equals(this.contentDisposition, that.contentDisposition)
            && Objects.equals(this.contentTransferEncoding, that.contentTransferEncoding)
            && Objects.equals(this.contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentDisposition, contentTransferEncoding, contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadServerLogsResponse {\n");
        sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
        sb.append("    contentTransferEncoding: ").append(toIndentedString(contentTransferEncoding)).append("\n");
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

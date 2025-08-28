package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PreviewDocumentSegmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<DocumentSegmentInfo> body = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public PreviewDocumentSegmentResponse withBody(List<DocumentSegmentInfo> body) {
        this.body = body;
        return this;
    }

    public PreviewDocumentSegmentResponse addBodyItem(DocumentSegmentInfo bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public PreviewDocumentSegmentResponse withBody(Consumer<List<DocumentSegmentInfo>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<DocumentSegmentInfo> getBody() {
        return body;
    }

    public void setBody(List<DocumentSegmentInfo> body) {
        this.body = body;
    }

    public PreviewDocumentSegmentResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewDocumentSegmentResponse that = (PreviewDocumentSegmentResponse) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewDocumentSegmentResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

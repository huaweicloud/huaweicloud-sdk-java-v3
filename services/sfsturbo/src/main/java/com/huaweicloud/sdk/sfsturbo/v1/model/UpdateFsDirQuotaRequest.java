package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFsDirQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFsDirQuotaRequestBody body;

    public UpdateFsDirQuotaRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * 文件系统id
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public UpdateFsDirQuotaRequest withBody(UpdateFsDirQuotaRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFsDirQuotaRequest withBody(Consumer<UpdateFsDirQuotaRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFsDirQuotaRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFsDirQuotaRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFsDirQuotaRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFsDirQuotaRequest updateFsDirQuotaRequest = (UpdateFsDirQuotaRequest) o;
        return Objects.equals(this.shareId, updateFsDirQuotaRequest.shareId)
            && Objects.equals(this.body, updateFsDirQuotaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFsDirQuotaRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

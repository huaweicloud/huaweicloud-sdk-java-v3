package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadFilesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "USER_ID")

    @JacksonXmlProperty(localName = "USER_ID")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UploadGroupPackageReq body;

    public UploadFilesRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UploadFilesRequest withBody(UploadGroupPackageReq body) {
        this.body = body;
        return this;
    }

    public UploadFilesRequest withBody(Consumer<UploadGroupPackageReq> bodySetter) {
        if (this.body == null) {
            this.body = new UploadGroupPackageReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadGroupPackageReq getBody() {
        return body;
    }

    public void setBody(UploadGroupPackageReq body) {
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
        UploadFilesRequest uploadFilesRequest = (UploadFilesRequest) o;
        return Objects.equals(this.userId, uploadFilesRequest.userId)
            && Objects.equals(this.body, uploadFilesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFilesRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadFilePublisherRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-publisher-token")

    private String xPublisherToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadFilePublisherRequestBody body;

    public UploadFilePublisherRequest withXPublisherToken(String xPublisherToken) {
        this.xPublisherToken = xPublisherToken;
        return this;
    }

    /**
     * 发布商凭证,x-publisher-token和X-Auth-Token必传一个
     * @return xPublisherToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-publisher-token")
    public String getXPublisherToken() {
        return xPublisherToken;
    }

    public void setXPublisherToken(String xPublisherToken) {
        this.xPublisherToken = xPublisherToken;
    }

    public UploadFilePublisherRequest withBody(UploadFilePublisherRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadFilePublisherRequest withBody(Consumer<UploadFilePublisherRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadFilePublisherRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadFilePublisherRequestBody getBody() {
        return body;
    }

    public void setBody(UploadFilePublisherRequestBody body) {
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
        UploadFilePublisherRequest uploadFilePublisherRequest = (UploadFilePublisherRequest) o;
        return Objects.equals(this.xPublisherToken, uploadFilePublisherRequest.xPublisherToken)
            && Objects.equals(this.body, uploadFilePublisherRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPublisherToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFilePublisherRequest {\n");
        sb.append("    xPublisherToken: ").append(toIndentedString(xPublisherToken)).append("\n");
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

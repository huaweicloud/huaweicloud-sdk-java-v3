package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateStoredQueryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")

    private String xAuthToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StoredQueryRequestBody body;

    public CreateStoredQueryRequest withXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
        return this;
    }

    /**
     * 用户Token。 获取Token，请参考《统一身份认证服务API参考》的“获取用户Token”章节。请求响应成功后在响应消息头中包含的“X-Subject-Token”的值即为Token值。
     * @return xAuthToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")
    public String getXAuthToken() {
        return xAuthToken;
    }

    public void setXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
    }

    public CreateStoredQueryRequest withBody(StoredQueryRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateStoredQueryRequest withBody(Consumer<StoredQueryRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new StoredQueryRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StoredQueryRequestBody getBody() {
        return body;
    }

    public void setBody(StoredQueryRequestBody body) {
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
        CreateStoredQueryRequest createStoredQueryRequest = (CreateStoredQueryRequest) o;
        return Objects.equals(this.xAuthToken, createStoredQueryRequest.xAuthToken)
            && Objects.equals(this.body, createStoredQueryRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAuthToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStoredQueryRequest {\n");
        sb.append("    xAuthToken: ").append(toIndentedString(xAuthToken)).append("\n");
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

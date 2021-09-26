package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateKmsTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateKmsTagRequestBody body;

    public CreateKmsTagRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API版本号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreateKmsTagRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /** 凭据ID
     * 
     * @return secretId */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public CreateKmsTagRequest withBody(CreateKmsTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateKmsTagRequest withBody(Consumer<CreateKmsTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateKmsTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateKmsTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreateKmsTagRequestBody body) {
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
        CreateKmsTagRequest createKmsTagRequest = (CreateKmsTagRequest) o;
        return Objects.equals(this.versionId, createKmsTagRequest.versionId)
            && Objects.equals(this.secretId, createKmsTagRequest.secretId)
            && Objects.equals(this.body, createKmsTagRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, secretId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKmsTagRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

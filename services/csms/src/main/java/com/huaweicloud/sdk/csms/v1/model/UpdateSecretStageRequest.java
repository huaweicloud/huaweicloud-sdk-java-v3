package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSecretStageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSecretStageRequestBody body;

    public UpdateSecretStageRequest withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public UpdateSecretStageRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 凭据版本状态的名称。满足 '^[a-zA-Z0-9._-]{1,64}$'
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public UpdateSecretStageRequest withBody(UpdateSecretStageRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSecretStageRequest withBody(Consumer<UpdateSecretStageRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSecretStageRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSecretStageRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSecretStageRequestBody body) {
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
        UpdateSecretStageRequest updateSecretStageRequest = (UpdateSecretStageRequest) o;
        return Objects.equals(this.secretName, updateSecretStageRequest.secretName)
            && Objects.equals(this.stageName, updateSecretStageRequest.stageName)
            && Objects.equals(this.body, updateSecretStageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretName, stageName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretStageRequest {\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
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

package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSecretStageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    @JacksonXmlProperty(localName = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    @JacksonXmlProperty(localName = "stage_name")

    private String stageName;

    public DeleteSecretStageRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 凭据的资源标识符。
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public DeleteSecretStageRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 凭据版本状态的名称。
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecretStageRequest deleteSecretStageRequest = (DeleteSecretStageRequest) o;
        return Objects.equals(this.secretId, deleteSecretStageRequest.secretId)
            && Objects.equals(this.stageName, deleteSecretStageRequest.stageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretId, stageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecretStageRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
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

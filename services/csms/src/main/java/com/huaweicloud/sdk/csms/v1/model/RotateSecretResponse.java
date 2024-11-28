package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RotateSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_task_id")

    private String rotationTaskId;

    public RotateSecretResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 凭据的版本号标识符。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public RotateSecretResponse withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据的名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public RotateSecretResponse withRotationTaskId(String rotationTaskId) {
        this.rotationTaskId = rotationTaskId;
        return this;
    }

    /**
     * 凭据轮转任务ID。
     * @return rotationTaskId
     */
    public String getRotationTaskId() {
        return rotationTaskId;
    }

    public void setRotationTaskId(String rotationTaskId) {
        this.rotationTaskId = rotationTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RotateSecretResponse that = (RotateSecretResponse) obj;
        return Objects.equals(this.versionId, that.versionId) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.rotationTaskId, that.rotationTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, secretName, rotationTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RotateSecretResponse {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    rotationTaskId: ").append(toIndentedString(rotationTaskId)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 密钥挂载。
 */
public class SecretVolumeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_value")

    private String secretValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    public SecretVolumeResponse withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释：** 密钥名称。 **取值范围：** 不涉及。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public SecretVolumeResponse withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * **参数解释：** 密钥key。 **取值范围：** 长度不大于63。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SecretVolumeResponse withSecretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
    }

    /**
     * **参数解释：** 密钥值。 **取值范围：** 长度不大于32768。
     * @return secretValue
     */
    public String getSecretValue() {
        return secretValue;
    }

    public void setSecretValue(String secretValue) {
        this.secretValue = secretValue;
    }

    public SecretVolumeResponse withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释：** 挂载路径。 **取值范围：** 不涉及。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecretVolumeResponse that = (SecretVolumeResponse) obj;
        return Objects.equals(this.secretName, that.secretName) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.secretValue, that.secretValue) && Objects.equals(this.mountPath, that.mountPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretName, secretKey, secretValue, mountPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretVolumeResponse {\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    secretValue: ").append(toIndentedString(secretValue)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
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

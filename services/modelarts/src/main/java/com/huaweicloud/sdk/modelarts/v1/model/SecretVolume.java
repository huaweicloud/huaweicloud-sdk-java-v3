package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 密钥挂载。 **约束限制：** 不涉及。
 */
public class SecretVolume {

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

    public SecretVolume withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释：** 密钥名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public SecretVolume withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * **参数解释：** 密钥key。 **约束限制：** 匹配一个长度在1到63之间的字符串，只能包含字母、数字、点、下划线和连字符，并且不能以两个连续的点（..）开头。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SecretVolume withSecretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
    }

    /**
     * **参数解释：** 密钥值。 **约束限制：** 长度在1~32768，Base64编码后的密钥值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return secretValue
     */
    public String getSecretValue() {
        return secretValue;
    }

    public void setSecretValue(String secretValue) {
        this.secretValue = secretValue;
    }

    public SecretVolume withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释：** 挂载路径。 **约束限制：** 不涉及。 **取值范围：** 以(/)开头和结尾，可包含字母、数字、中划线、下划线，整个挂载路径长度不能超过255位。 **默认取值：** 不涉及。
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
        SecretVolume that = (SecretVolume) obj;
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
        sb.append("class SecretVolume {\n");
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

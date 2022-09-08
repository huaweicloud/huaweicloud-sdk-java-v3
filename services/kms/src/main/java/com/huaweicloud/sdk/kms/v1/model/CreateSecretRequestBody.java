package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建凭据请求消息体。
 */
public class CreateSecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_binary")

    private String secretBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_string")

    private String secretString;

    public CreateSecretRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 凭据名称。  约束：取值范围为1到64个字符，满足正则匹配“^[a-zA-Z0-9._-]{1,64}$”。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSecretRequestBody withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * 用于加密保护凭据值的KMS主密钥ID，如果您未指定此参数，凭据管理服务将默认使用名为csms/default的默认主密钥，用于加密您账号在本项目中创建的凭据值。如果用户账号下不存在该名称的主密钥，则凭据管理服务自动为您创建该名称的密钥。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public CreateSecretRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 凭据的描述信息。  约束：2048字节。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecretRequestBody withSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    /**
     * 二进制类型凭据在base64编码后的明文，凭据管理服务将其加密后，存入凭据的初始版本中。  类型：base64编码的二进制数据对象。  约束：secret_binary和secret_string必须且只能设置一个，最大32K。 
     * @return secretBinary
     */
    public String getSecretBinary() {
        return secretBinary;
    }

    public void setSecretBinary(String secretBinary) {
        this.secretBinary = secretBinary;
    }

    public CreateSecretRequestBody withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    /**
     * 文本类型凭据的明文，凭据管理服务将其加密后，存入凭据的初始版本中。  约束：secret_binary和secret_string必须且只能设置一个，最大32K。 
     * @return secretString
     */
    public String getSecretString() {
        return secretString;
    }

    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretRequestBody createSecretRequestBody = (CreateSecretRequestBody) o;
        return Objects.equals(this.name, createSecretRequestBody.name)
            && Objects.equals(this.kmsKeyId, createSecretRequestBody.kmsKeyId)
            && Objects.equals(this.description, createSecretRequestBody.description)
            && Objects.equals(this.secretBinary, createSecretRequestBody.secretBinary)
            && Objects.equals(this.secretString, createSecretRequestBody.secretString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kmsKeyId, description, secretBinary, secretString);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    secretBinary: ").append(toIndentedString(secretBinary)).append("\n");
        sb.append("    secretString: ").append(toIndentedString(secretString)).append("\n");
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

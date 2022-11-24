package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 密钥
 */
public class UpdateSecretDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private Map<String, String> secrets = null;

    public UpdateSecretDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 密钥描述,最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateSecretDetail withSecrets(Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }

    public UpdateSecretDetail putSecretsItem(String key, String secretsItem) {
        if (this.secrets == null) {
            this.secrets = new HashMap<>();
        }
        this.secrets.put(key, secretsItem);
        return this;
    }

    public UpdateSecretDetail withSecrets(Consumer<Map<String, String>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new HashMap<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * secrets是一个字典，由多个键值对组成，json化后最大总长度为1048576，key和value均为字符串。键值对中key由大小写字母或中划线开头，由数字、大小写字母、点号（.）、中划线（-）、下划线（_）组成，最小长度为1，最大长度63个字符， 键值对中的value必须为base64字符。 注：secrets字典的长度即字典转为标准的字符串后的长度，例如字典{\"a\": \"b\"}转为标准字符串后为'{\"a\": \"b\"}'，长度为10
     * @return secrets
     */
    public Map<String, String> getSecrets() {
        return secrets;
    }

    public void setSecrets(Map<String, String> secrets) {
        this.secrets = secrets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecretDetail updateSecretDetail = (UpdateSecretDetail) o;
        return Objects.equals(this.description, updateSecretDetail.description)
            && Objects.equals(this.secrets, updateSecretDetail.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretDetail {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

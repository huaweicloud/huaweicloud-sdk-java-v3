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
public class SecretDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private Map<String, String> secrets = null;

    public SecretDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 密钥名称，以小写英文字母开头，4-64位，可以使用小写英文、数字、中划线（-），不能以中划线结尾
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecretDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 密钥类型，目前只支持“Opaque”类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SecretDetail withDescription(String description) {
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

    public SecretDetail withSecrets(Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }

    public SecretDetail putSecretsItem(String key, String secretsItem) {
        if (this.secrets == null) {
            this.secrets = new HashMap<>();
        }
        this.secrets.put(key, secretsItem);
        return this;
    }

    public SecretDetail withSecrets(Consumer<Map<String, String>> secretsSetter) {
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
        SecretDetail secretDetail = (SecretDetail) o;
        return Objects.equals(this.name, secretDetail.name) && Objects.equals(this.type, secretDetail.type)
            && Objects.equals(this.description, secretDetail.description)
            && Objects.equals(this.secrets, secretDetail.secrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, secrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

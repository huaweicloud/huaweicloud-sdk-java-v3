package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建密钥或者更更新密钥请求体中的secret对象
 */
public class SecretObjectInSecretRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrets")

    private List<Secret> secrets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public SecretObjectInSecretRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 密钥名称，以小写英文字母开头，4-64位，可以使用小写英文、数字、中划线（-），不能以中划线结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecretObjectInSecretRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 密钥描述,最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecretObjectInSecretRequestBody withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    public SecretObjectInSecretRequestBody addSecretsItem(Secret secretsItem) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        this.secrets.add(secretsItem);
        return this;
    }

    public SecretObjectInSecretRequestBody withSecrets(Consumer<List<Secret>> secretsSetter) {
        if (this.secrets == null) {
            this.secrets = new ArrayList<>();
        }
        secretsSetter.accept(this.secrets);
        return this;
    }

    /**
     * secrets是一个列表，由多个字典组成，数量上限为100个。字典的key和value均为字符串。key由大小写字母，中划线（`-`）开头，由数字、大小写字母、点号（`.`）、中划线（`-`）、下划线（`_`）组成，最小长度为1，最大长度63个字符, value不能含有字符不允许^ ~ # $ \\|% & < > ( ) [ ] { } ' \" \\，最大长度10000个字符。
     * @return secrets
     */
    public List<Secret> getSecrets() {
        return secrets;
    }

    public void setSecrets(List<Secret> secrets) {
        this.secrets = secrets;
    }

    public SecretObjectInSecretRequestBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public SecretObjectInSecretRequestBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SecretObjectInSecretRequestBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tags是一个列表，由多个字典组成，数量上限为20个。字典的key和value均为字符串。key由数字、大小写字母、点号（`.`）、中划线（`-`）、下划线（`_`）组成，最小长度为1，最大长度36个字符, value由数字、大小写字母、点号（`.`）、中划线（`-`）、下划线（`_`）, 斜线（`\\`）组成，最小长度为0，最大长度43个字符。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretObjectInSecretRequestBody secretObjectInSecretRequestBody = (SecretObjectInSecretRequestBody) o;
        return Objects.equals(this.name, secretObjectInSecretRequestBody.name)
            && Objects.equals(this.description, secretObjectInSecretRequestBody.description)
            && Objects.equals(this.secrets, secretObjectInSecretRequestBody.secrets)
            && Objects.equals(this.tags, secretObjectInSecretRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, secrets, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretObjectInSecretRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

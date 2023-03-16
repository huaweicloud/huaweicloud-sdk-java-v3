package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePolicy 操作的请求体。
 */
public class UpdatePolicyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public UpdatePolicyReqBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 要添加到新策略的策略文本内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UpdatePolicyReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 要分配给策略的可选说明。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePolicyReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 要分配给策略的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyReqBody updatePolicyReqBody = (UpdatePolicyReqBody) o;
        return Objects.equals(this.content, updatePolicyReqBody.content)
            && Objects.equals(this.description, updatePolicyReqBody.description)
            && Objects.equals(this.name, updatePolicyReqBody.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyReqBody {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

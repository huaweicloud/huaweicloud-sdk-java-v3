package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 边缘节点组证书基本信息
 */
public class EdgeGroupCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public EdgeGroupCertRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称。只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeGroupCertRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型，支持填写： - system：创建节点时会默认创建一套系统证书 - application：应用证书 - device：设备证书
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EdgeGroupCertRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 证书描述。最大长度为255个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeGroupCertRequest edgeGroupCertRequest = (EdgeGroupCertRequest) o;
        return Objects.equals(this.name, edgeGroupCertRequest.name)
            && Objects.equals(this.type, edgeGroupCertRequest.type)
            && Objects.equals(this.description, edgeGroupCertRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeGroupCertRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

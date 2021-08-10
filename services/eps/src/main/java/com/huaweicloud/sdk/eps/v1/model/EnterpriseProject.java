package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 企业项目 */
public class EnterpriseProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public EnterpriseProject withName(String name) {
        this.name = name;
        return this;
    }

    /** 只能由中文字符、英文字母（a~zA~Z）、数字（0~9）、下划线（_）、中划线（-）组成，且长度为[1-64]个字符。名称不能为大小写混合的default，且在租户账号内唯一。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseProject withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 最大长度512个字符。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnterpriseProject withType(String type) {
        this.type = type;
        return this;
    }

    /** 企业项目类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterpriseProject enterpriseProject = (EnterpriseProject) o;
        return Objects.equals(this.name, enterpriseProject.name)
            && Objects.equals(this.description, enterpriseProject.description)
            && Objects.equals(this.type, enterpriseProject.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseProject {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

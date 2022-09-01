package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建路由表请求体
 */
public class CreateRoutetableOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public CreateRoutetableOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 路由表名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRoutetableOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 路由表所在的虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateRoutetableOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由表描述信息  取值范围：0-255个字符，不能包含“<”和“>”
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
        CreateRoutetableOption createRoutetableOption = (CreateRoutetableOption) o;
        return Objects.equals(this.name, createRoutetableOption.name)
            && Objects.equals(this.vpcId, createRoutetableOption.vpcId)
            && Objects.equals(this.description, createRoutetableOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vpcId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoutetableOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

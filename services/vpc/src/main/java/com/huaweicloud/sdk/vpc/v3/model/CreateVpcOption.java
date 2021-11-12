package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 创建VPC的请求体 */
public class CreateVpcOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 功能描述：VPC的名称信息 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVpcOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 功能说明：VPC的描述信息 取值范围：0-255个字符，不能包含“<”和“>”。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /** 功能说明：vpc下可用子网的范围 取值范围： −10.0.0.0/8~10.255.255.240/28 −172.16.0.0/12 ~ 172.31.255.240/28 −192.168.0.0/16 ~
     * 192.168.255.240/28 约束：必须是cidr格式，例如:192.168.0.0/16
     * 
     * @return cidr */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateVpcOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 功能说明：企业项目ID。创建vpc时，给vpc绑定企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateVpcOption withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVpcOption addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVpcOption withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 功能说明：VPC的标签信息，详情参见Tag对象 取值范围：0-10个标签键值对
     * 
     * @return tags */
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
        CreateVpcOption createVpcOption = (CreateVpcOption) o;
        return Objects.equals(this.name, createVpcOption.name)
            && Objects.equals(this.description, createVpcOption.description)
            && Objects.equals(this.cidr, createVpcOption.cidr)
            && Objects.equals(this.enterpriseProjectId, createVpcOption.enterpriseProjectId)
            && Objects.equals(this.tags, createVpcOption.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, cidr, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

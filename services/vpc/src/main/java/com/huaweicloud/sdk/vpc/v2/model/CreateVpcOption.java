package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * vpc对象
 */
public class CreateVpcOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CreateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：虚拟私有云下可用子网的范围 取值范围： - 10.0.0.0/8 ~ 10.255.255.240/28 - 172.16.0.0/12 ~ 172.31.255.240/28 - 192.168.0.0/16 ~ 192.168.255.240/28 约束：必须是ipv4 cidr格式，例如:192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：虚拟私有云名称 取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点） 约束：如果名称不为空，则同一个租户下的名称不能重复
     * @return name
     */
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

    /**
     * 功能说明：虚拟私有云的描述 取值范围：0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVpcOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：企业项目ID。创建虚拟私有云时，给虚拟私有云绑定企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 默认值：\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateVpcOption withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVpcOption addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVpcOption withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能说明：VPC资源标签。创建VPC时，给VPC添加资源标签。 取值范围：最大10个标签, key：标签名称; value：标签值。 格式：[key*value]，每一个标签的key和value之间用*连接
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcOption that = (CreateVpcOption) obj;
        return Objects.equals(this.cidr, that.cidr) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr, name, description, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcOption {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建全球加速器实例的详细信息。
 */
public class CreateAcceleratorOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_sets")

    private List<CreateAcceleratorOptionIpSets> ipSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public CreateAcceleratorOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 全球加速器名称，取值范围：1~64个字符之间，只能由数字、字母、中划线和中文组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAcceleratorOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 全球加速器描述信息，取值范围：0~255个字符之间，禁止输入字符：<>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAcceleratorOption withIpSets(List<CreateAcceleratorOptionIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }

    public CreateAcceleratorOption addIpSetsItem(CreateAcceleratorOptionIpSets ipSetsItem) {
        if (this.ipSets == null) {
            this.ipSets = new ArrayList<>();
        }
        this.ipSets.add(ipSetsItem);
        return this;
    }

    public CreateAcceleratorOption withIpSets(Consumer<List<CreateAcceleratorOptionIpSets>> ipSetsSetter) {
        if (this.ipSets == null) {
            this.ipSets = new ArrayList<>();
        }
        ipSetsSetter.accept(this.ipSets);
        return this;
    }

    /**
     * 全球加速器IP列表。
     * @return ipSets
     */
    public List<CreateAcceleratorOptionIpSets> getIpSets() {
        return ipSets;
    }

    public void setIpSets(List<CreateAcceleratorOptionIpSets> ipSets) {
        this.ipSets = ipSets;
    }

    public CreateAcceleratorOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 租户的企业项目ID，最大长度36个字符，带\"-\"连字符的UUID格式，或者是字符串\"0\"。\"0\"表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateAcceleratorOption withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateAcceleratorOption addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateAcceleratorOption withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
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
        CreateAcceleratorOption createAcceleratorOption = (CreateAcceleratorOption) o;
        return Objects.equals(this.name, createAcceleratorOption.name)
            && Objects.equals(this.description, createAcceleratorOption.description)
            && Objects.equals(this.ipSets, createAcceleratorOption.ipSets)
            && Objects.equals(this.enterpriseProjectId, createAcceleratorOption.enterpriseProjectId)
            && Objects.equals(this.tags, createAcceleratorOption.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, ipSets, enterpriseProjectId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAcceleratorOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipSets: ").append(toIndentedString(ipSets)).append("\n");
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

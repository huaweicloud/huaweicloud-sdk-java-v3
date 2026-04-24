package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建单个订阅任务的请求体
 */
public class SingleCreateSubscriptionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint_info")

    private SubscriptionSourceEndpointInfo sourceEndpointInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_grant_new_agency")

    private Boolean isGrantNewAgency;

    public SingleCreateSubscriptionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称 约束：任务名称在4位到50位之间，不区分大小写，可以包含字母、数字、中划线或下划线，不能包括其他特殊字符。 - 最小长度：4 - 最大长度：50
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleCreateSubscriptionReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SingleCreateSubscriptionReq withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型，仅支持rds
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public SingleCreateSubscriptionReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SingleCreateSubscriptionReq withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public SingleCreateSubscriptionReq addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SingleCreateSubscriptionReq withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public SingleCreateSubscriptionReq withSourceEndpointInfo(SubscriptionSourceEndpointInfo sourceEndpointInfo) {
        this.sourceEndpointInfo = sourceEndpointInfo;
        return this;
    }

    public SingleCreateSubscriptionReq withSourceEndpointInfo(
        Consumer<SubscriptionSourceEndpointInfo> sourceEndpointInfoSetter) {
        if (this.sourceEndpointInfo == null) {
            this.sourceEndpointInfo = new SubscriptionSourceEndpointInfo();
            sourceEndpointInfoSetter.accept(this.sourceEndpointInfo);
        }

        return this;
    }

    /**
     * Get sourceEndpointInfo
     * @return sourceEndpointInfo
     */
    public SubscriptionSourceEndpointInfo getSourceEndpointInfo() {
        return sourceEndpointInfo;
    }

    public void setSourceEndpointInfo(SubscriptionSourceEndpointInfo sourceEndpointInfo) {
        this.sourceEndpointInfo = sourceEndpointInfo;
    }

    public SingleCreateSubscriptionReq withIsGrantNewAgency(Boolean isGrantNewAgency) {
        this.isGrantNewAgency = isGrantNewAgency;
        return this;
    }

    /**
     * 是否创建委托，取值： - true：创建 - false：不创建 默认为false
     * @return isGrantNewAgency
     */
    public Boolean getIsGrantNewAgency() {
        return isGrantNewAgency;
    }

    public void setIsGrantNewAgency(Boolean isGrantNewAgency) {
        this.isGrantNewAgency = isGrantNewAgency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SingleCreateSubscriptionReq that = (SingleCreateSubscriptionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.sourceEndpointInfo, that.sourceEndpointInfo)
            && Objects.equals(this.isGrantNewAgency, that.isGrantNewAgency);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, instanceType, enterpriseProjectId, tags, sourceEndpointInfo, isGrantNewAgency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleCreateSubscriptionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sourceEndpointInfo: ").append(toIndentedString(sourceEndpointInfo)).append("\n");
        sb.append("    isGrantNewAgency: ").append(toIndentedString(isGrantNewAgency)).append("\n");
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

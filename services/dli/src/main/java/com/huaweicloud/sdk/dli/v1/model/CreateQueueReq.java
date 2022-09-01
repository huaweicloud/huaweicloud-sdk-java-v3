package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建队列的请求参数。
 */
public class CreateQueueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    @JacksonXmlProperty(localName = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_count")

    @JacksonXmlProperty(localName = "cu_count")

    private Integer cuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    @JacksonXmlProperty(localName = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    @JacksonXmlProperty(localName = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_mode")

    @JacksonXmlProperty(localName = "resource_mode")

    private Integer resourceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    @JacksonXmlProperty(localName = "labels")

    private List<Object> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    @JacksonXmlProperty(localName = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    @JacksonXmlProperty(localName = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    public CreateQueueReq withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 新建的队列名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。 说明：  队列名称不区分大小写，系统会自动转换为小写。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public CreateQueueReq withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列的类型,。有如下两种类型： sql general 如果不指定，默认为sql。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public CreateQueueReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 队列的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateQueueReq withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /**
     * 与队列绑定的最小计算单元个数。设置值当前只支持16，64，256。
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    public CreateQueueReq withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 队列的收费模式。只能设置为“1”，表示按照CU时收费。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateQueueReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，“0”表示default，即默认的企业项目。 说明： 开通了企业管理服务的用户可设置该参数绑定指定的项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateQueueReq withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 队列计算资源的cpu架构。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public CreateQueueReq withResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }

    /**
     * 队列资源模式。支持以下两种类型：0：共享资源模式1：专属资源模式
     * @return resourceMode
     */
    public Integer getResourceMode() {
        return resourceMode;
    }

    public void setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
    }

    public CreateQueueReq withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    public CreateQueueReq addLabelsItem(Object labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateQueueReq withLabels(Consumer<List<Object>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 创建队列的标签信息，目前包括队列是否跨AZ的标签信息（Json字符串），且只支持值为“2”，即创建一个计算资源分布在2个可用区的双AZ队列
     * @return labels
     */
    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public CreateQueueReq withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 队列特性。支持以下两种类型：basic：基础型ai：AI增强型（仅SQL的x86_64专属队列支持选择）默认值为“basic”。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public CreateQueueReq withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public CreateQueueReq addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateQueueReq withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 队列的标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
        this.tags = tags;
    }

    public CreateQueueReq withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 新建的弹性资源池名称，名称只能包含数字、小写英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateQueueReq createQueueReq = (CreateQueueReq) o;
        return Objects.equals(this.queueName, createQueueReq.queueName)
            && Objects.equals(this.queueType, createQueueReq.queueType)
            && Objects.equals(this.description, createQueueReq.description)
            && Objects.equals(this.cuCount, createQueueReq.cuCount)
            && Objects.equals(this.chargingMode, createQueueReq.chargingMode)
            && Objects.equals(this.enterpriseProjectId, createQueueReq.enterpriseProjectId)
            && Objects.equals(this.platform, createQueueReq.platform)
            && Objects.equals(this.resourceMode, createQueueReq.resourceMode)
            && Objects.equals(this.labels, createQueueReq.labels)
            && Objects.equals(this.feature, createQueueReq.feature) && Objects.equals(this.tags, createQueueReq.tags)
            && Objects.equals(this.elasticResourcePoolName, createQueueReq.elasticResourcePoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName,
            queueType,
            description,
            cuCount,
            chargingMode,
            enterpriseProjectId,
            platform,
            resourceMode,
            labels,
            feature,
            tags,
            elasticResourcePoolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQueueReq {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    resourceMode: ").append(toIndentedString(resourceMode)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
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

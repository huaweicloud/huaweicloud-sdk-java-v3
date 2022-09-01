package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDataStoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    @JacksonXmlProperty(localName = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    @JacksonXmlProperty(localName = "metrics")

    private List<Metric> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private List<Property> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    @JacksonXmlProperty(localName = "modified_time")

    private String modifiedTime;

    public UpdateDataStoreResponse withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /**
     * 存储 ID
     * @return dataStoreId
     */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public UpdateDataStoreResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDataStoreResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 存储 ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateDataStoreResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDataStoreResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDataStoreResponse withTags(Consumer<List<Tag>> tagsSetter) {
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
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public UpdateDataStoreResponse withMetrics(List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public UpdateDataStoreResponse addMetricsItem(Metric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public UpdateDataStoreResponse withMetrics(Consumer<List<Metric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标
     * @return metrics
     */
    public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    public UpdateDataStoreResponse withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    public UpdateDataStoreResponse addPropertiesItem(Property propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public UpdateDataStoreResponse withProperties(Consumer<List<Property>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 属性
     * @return properties
     */
    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public UpdateDataStoreResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateDataStoreResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 更新时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDataStoreResponse updateDataStoreResponse = (UpdateDataStoreResponse) o;
        return Objects.equals(this.dataStoreId, updateDataStoreResponse.dataStoreId)
            && Objects.equals(this.name, updateDataStoreResponse.name)
            && Objects.equals(this.groupId, updateDataStoreResponse.groupId)
            && Objects.equals(this.tags, updateDataStoreResponse.tags)
            && Objects.equals(this.metrics, updateDataStoreResponse.metrics)
            && Objects.equals(this.properties, updateDataStoreResponse.properties)
            && Objects.equals(this.createdTime, updateDataStoreResponse.createdTime)
            && Objects.equals(this.modifiedTime, updateDataStoreResponse.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId, name, groupId, tags, metrics, properties, createdTime, modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataStoreResponse {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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

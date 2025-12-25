package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新模块请求体
 */
public class ModuleUpdateRequestPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_id")

    private String cloudPackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_name")

    private String cloudPackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_version")

    private String cloudPackVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_json")

    private String moduleJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private String thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_type")

    private String moduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_ids")

    private String metricIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_query")

    private String dataQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    public ModuleUpdateRequestPojo withCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
        return this;
    }

    /**
     * 订阅包id
     * @return cloudPackId
     */
    public String getCloudPackId() {
        return cloudPackId;
    }

    public void setCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
    }

    public ModuleUpdateRequestPojo withCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
        return this;
    }

    /**
     * 订阅包名称
     * @return cloudPackName
     */
    public String getCloudPackName() {
        return cloudPackName;
    }

    public void setCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
    }

    public ModuleUpdateRequestPojo withCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
        return this;
    }

    /**
     * 订阅包版本
     * @return cloudPackVersion
     */
    public String getCloudPackVersion() {
        return cloudPackVersion;
    }

    public void setCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
    }

    public ModuleUpdateRequestPojo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModuleUpdateRequestPojo withModuleJson(String moduleJson) {
        this.moduleJson = moduleJson;
        return this;
    }

    /**
     * 布局模块相关信息
     * @return moduleJson
     */
    public String getModuleJson() {
        return moduleJson;
    }

    public void setModuleJson(String moduleJson) {
        this.moduleJson = moduleJson;
    }

    public ModuleUpdateRequestPojo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModuleUpdateRequestPojo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ModuleUpdateRequestPojo withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 模块缩略图
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ModuleUpdateRequestPojo withModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    /**
     * 模块类型,tab/section
     * @return moduleType
     */
    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public ModuleUpdateRequestPojo withMetricIds(String metricIds) {
        this.metricIds = metricIds;
        return this;
    }

    /**
     * section类模块关联的指标id
     * @return metricIds
     */
    public String getMetricIds() {
        return metricIds;
    }

    public void setMetricIds(String metricIds) {
        this.metricIds = metricIds;
    }

    public ModuleUpdateRequestPojo withDataQuery(String dataQuery) {
        this.dataQuery = dataQuery;
        return this;
    }

    /**
     * 数据查询方式
     * @return dataQuery
     */
    public String getDataQuery() {
        return dataQuery;
    }

    public void setDataQuery(String dataQuery) {
        this.dataQuery = dataQuery;
    }

    public ModuleUpdateRequestPojo withBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
        return this;
    }

    /**
     * BOA底座版本
     * @return boaVersion
     */
    public String getBoaVersion() {
        return boaVersion;
    }

    public void setBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModuleUpdateRequestPojo that = (ModuleUpdateRequestPojo) obj;
        return Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.moduleJson, that.moduleJson)
            && Objects.equals(this.name, that.name) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.thumbnail, that.thumbnail) && Objects.equals(this.moduleType, that.moduleType)
            && Objects.equals(this.metricIds, that.metricIds) && Objects.equals(this.dataQuery, that.dataQuery)
            && Objects.equals(this.boaVersion, that.boaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudPackId,
            cloudPackName,
            cloudPackVersion,
            description,
            moduleJson,
            name,
            updateTime,
            thumbnail,
            moduleType,
            metricIds,
            dataQuery,
            boaVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleUpdateRequestPojo {\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    moduleJson: ").append(toIndentedString(moduleJson)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
        sb.append("    metricIds: ").append(toIndentedString(metricIds)).append("\n");
        sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
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

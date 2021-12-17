package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class UpdateGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_data_usage")

    private Long warmDataUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_count")

    private Long dataStoreCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cold_data_usage")

    private Long coldDataUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_data_retention_policy")

    private String warmDataRetentionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cold_data_retention_policy")

    private String coldDataRetentionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public UpdateGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 存储组 ID
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 存储组名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateGroupResponse withWarmDataUsage(Long warmDataUsage) {
        this.warmDataUsage = warmDataUsage;
        return this;
    }

    /** 温数据存储用量 minimum: 0 maximum: 1099511627776
     * 
     * @return warmDataUsage */
    public Long getWarmDataUsage() {
        return warmDataUsage;
    }

    public void setWarmDataUsage(Long warmDataUsage) {
        this.warmDataUsage = warmDataUsage;
    }

    public UpdateGroupResponse withDataStoreCount(Long dataStoreCount) {
        this.dataStoreCount = dataStoreCount;
        return this;
    }

    /** 此存储组下存储实例的个数 minimum: 0 maximum: 1024
     * 
     * @return dataStoreCount */
    public Long getDataStoreCount() {
        return dataStoreCount;
    }

    public void setDataStoreCount(Long dataStoreCount) {
        this.dataStoreCount = dataStoreCount;
    }

    public UpdateGroupResponse withColdDataUsage(Long coldDataUsage) {
        this.coldDataUsage = coldDataUsage;
        return this;
    }

    /** 冷数据存储用量 minimum: 0 maximum: 1099511627776
     * 
     * @return coldDataUsage */
    public Long getColdDataUsage() {
        return coldDataUsage;
    }

    public void setColdDataUsage(Long coldDataUsage) {
        this.coldDataUsage = coldDataUsage;
    }

    public UpdateGroupResponse withWarmDataRetentionPolicy(String warmDataRetentionPolicy) {
        this.warmDataRetentionPolicy = warmDataRetentionPolicy;
        return this;
    }

    /** 温数据老化策略，单位只支持d（天），且只支持整数，如365天则可配置为“365d”，如“365h”或“360.5d”等均不被支持
     * 
     * @return warmDataRetentionPolicy */
    public String getWarmDataRetentionPolicy() {
        return warmDataRetentionPolicy;
    }

    public void setWarmDataRetentionPolicy(String warmDataRetentionPolicy) {
        this.warmDataRetentionPolicy = warmDataRetentionPolicy;
    }

    public UpdateGroupResponse withColdDataRetentionPolicy(String coldDataRetentionPolicy) {
        this.coldDataRetentionPolicy = coldDataRetentionPolicy;
        return this;
    }

    /** 冷数据老化策略，单位只支持d（天），且只支持整数，如365天则可配置为“365d”，如“365h”或“360.5d”等均不被支持
     * 
     * @return coldDataRetentionPolicy */
    public String getColdDataRetentionPolicy() {
        return coldDataRetentionPolicy;
    }

    public void setColdDataRetentionPolicy(String coldDataRetentionPolicy) {
        this.coldDataRetentionPolicy = coldDataRetentionPolicy;
    }

    public UpdateGroupResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateGroupResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /** 修改时间
     * 
     * @return modifiedTime */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public UpdateGroupResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 存储类型，有资产存储(取值:AssetStorage)、设备存储(取值:DeviceStorage)两种类型
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
        UpdateGroupResponse updateGroupResponse = (UpdateGroupResponse) o;
        return Objects.equals(this.groupId, updateGroupResponse.groupId)
            && Objects.equals(this.name, updateGroupResponse.name)
            && Objects.equals(this.description, updateGroupResponse.description)
            && Objects.equals(this.warmDataUsage, updateGroupResponse.warmDataUsage)
            && Objects.equals(this.dataStoreCount, updateGroupResponse.dataStoreCount)
            && Objects.equals(this.coldDataUsage, updateGroupResponse.coldDataUsage)
            && Objects.equals(this.warmDataRetentionPolicy, updateGroupResponse.warmDataRetentionPolicy)
            && Objects.equals(this.coldDataRetentionPolicy, updateGroupResponse.coldDataRetentionPolicy)
            && Objects.equals(this.createdTime, updateGroupResponse.createdTime)
            && Objects.equals(this.modifiedTime, updateGroupResponse.modifiedTime)
            && Objects.equals(this.type, updateGroupResponse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            name,
            description,
            warmDataUsage,
            dataStoreCount,
            coldDataUsage,
            warmDataRetentionPolicy,
            coldDataRetentionPolicy,
            createdTime,
            modifiedTime,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    warmDataUsage: ").append(toIndentedString(warmDataUsage)).append("\n");
        sb.append("    dataStoreCount: ").append(toIndentedString(dataStoreCount)).append("\n");
        sb.append("    coldDataUsage: ").append(toIndentedString(coldDataUsage)).append("\n");
        sb.append("    warmDataRetentionPolicy: ").append(toIndentedString(warmDataRetentionPolicy)).append("\n");
        sb.append("    coldDataRetentionPolicy: ").append(toIndentedString(coldDataRetentionPolicy)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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

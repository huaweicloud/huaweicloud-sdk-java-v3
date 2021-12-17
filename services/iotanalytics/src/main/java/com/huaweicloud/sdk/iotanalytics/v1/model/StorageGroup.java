package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 存储组信息 */
public class StorageGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_data_retention_policy")

    private String warmDataRetentionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cold_data_retention_policy")

    private String coldDataRetentionPolicy;

    public StorageGroup withName(String name) {
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

    public StorageGroup withDescription(String description) {
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

    public StorageGroup withWarmDataRetentionPolicy(String warmDataRetentionPolicy) {
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

    public StorageGroup withColdDataRetentionPolicy(String coldDataRetentionPolicy) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageGroup storageGroup = (StorageGroup) o;
        return Objects.equals(this.name, storageGroup.name)
            && Objects.equals(this.description, storageGroup.description)
            && Objects.equals(this.warmDataRetentionPolicy, storageGroup.warmDataRetentionPolicy)
            && Objects.equals(this.coldDataRetentionPolicy, storageGroup.coldDataRetentionPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, warmDataRetentionPolicy, coldDataRetentionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    warmDataRetentionPolicy: ").append(toIndentedString(warmDataRetentionPolicy)).append("\n");
        sb.append("    coldDataRetentionPolicy: ").append(toIndentedString(coldDataRetentionPolicy)).append("\n");
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

package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ComputingResource */
public class ComputingResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    private String computingResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_name")

    private String computingResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_type")

    private String computingResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_count")

    private Integer cuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_mode")

    private Integer resourceMode;

    public ComputingResource withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /** 计算资源ID。
     * 
     * @return computingResourceId */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    public ComputingResource withComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
        return this;
    }

    /** 计算资源名称。
     * 
     * @return computingResourceName */
    public String getComputingResourceName() {
        return computingResourceName;
    }

    public void setComputingResourceName(String computingResourceName) {
        this.computingResourceName = computingResourceName;
    }

    public ComputingResource withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 计算资源描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComputingResource withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /** 创建计算资源的用户。
     * 
     * @return owner */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ComputingResource withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建计算资源的时间。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss'Z'
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ComputingResource withComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
        return this;
    }

    /** 计算资源的类型,。目前支持：sql
     * 
     * @return computingResourceType */
    public String getComputingResourceType() {
        return computingResourceType;
    }

    public void setComputingResourceType(String computingResourceType) {
        this.computingResourceType = computingResourceType;
    }

    public ComputingResource withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /** 与该计算资源绑定的计算单元数。设置值当前只支持16，64，256。
     * 
     * @return cuCount */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    public ComputingResource withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 计算资源的收费模式。“1”表示按照CU时收费。“2”表示按照包年包月收费。
     * 
     * @return chargingMode */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ComputingResource withResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }

    /** 计算资源类型。0：共享资源 1：专属资源
     * 
     * @return resourceMode */
    public Integer getResourceMode() {
        return resourceMode;
    }

    public void setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComputingResource computingResource = (ComputingResource) o;
        return Objects.equals(this.computingResourceId, computingResource.computingResourceId)
            && Objects.equals(this.computingResourceName, computingResource.computingResourceName)
            && Objects.equals(this.description, computingResource.description)
            && Objects.equals(this.owner, computingResource.owner)
            && Objects.equals(this.createdTime, computingResource.createdTime)
            && Objects.equals(this.computingResourceType, computingResource.computingResourceType)
            && Objects.equals(this.cuCount, computingResource.cuCount)
            && Objects.equals(this.chargingMode, computingResource.chargingMode)
            && Objects.equals(this.resourceMode, computingResource.resourceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceId,
            computingResourceName,
            description,
            owner,
            createdTime,
            computingResourceType,
            cuCount,
            chargingMode,
            resourceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputingResource {\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
        sb.append("    computingResourceName: ").append(toIndentedString(computingResourceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    computingResourceType: ").append(toIndentedString(computingResourceType)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceMode: ").append(toIndentedString(resourceMode)).append("\n");
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

package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询用量返回数据模型。
 */
public class UsageVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_name")

    private String usageMeasureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type")

    private String usageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_subtype")

    private String usageSubtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Float usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Float capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_unit_type")

    private String usageUnitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public UsageVo withUsageMeasureName(String usageMeasureName) {
        this.usageMeasureName = usageMeasureName;
        return this;
    }

    /**
     * 用量度量名称，通常与KooMap的计费项保持一致。当前支持以下用量度量名称： - 时空专属存储 - 实景三维生产服务基础版 - 实景三维生产服务专业版
     * @return usageMeasureName
     */
    public String getUsageMeasureName() {
        return usageMeasureName;
    }

    public void setUsageMeasureName(String usageMeasureName) {
        this.usageMeasureName = usageMeasureName;
    }

    public UsageVo withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * 用量类型。 - 该值为“DATA”时表示时空专属存储对应的用量消耗。 - 该值为“REAL3D”时表示处理三维建模任务对应的用量消耗。
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public UsageVo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用量所属租户ID，为32位UUID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UsageVo withUsageSubtype(String usageSubtype) {
        this.usageSubtype = usageSubtype;
        return this;
    }

    /**
     * 用量子类型，用于区分同一用量类型下的多个子用量，目前usage_type为“REAL3D”时才需要设置该值。 - REAL3D_BASIC：实景三维生产服务基础版用量 - REAL3D_PRO：实景三维生产服务专业版用量
     * @return usageSubtype
     */
    public String getUsageSubtype() {
        return usageSubtype;
    }

    public void setUsageSubtype(String usageSubtype) {
        this.usageSubtype = usageSubtype;
    }

    public UsageVo withUsage(Float usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 租户当前的使用量数值。
     * @return usage
     */
    public Float getUsage() {
        return usage;
    }

    public void setUsage(Float usage) {
        this.usage = usage;
    }

    public UsageVo withCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 租户购买的套餐总量值，按需使用取值为0。
     * @return capacity
     */
    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public UsageVo withUsageUnitType(String usageUnitType) {
        this.usageUnitType = usageUnitType;
        return this;
    }

    /**
     * 用量的计量单位类型。 - “VOLUME”：容量。 - “NUMBER”：数量。 - “COUNT”：次数。
     * @return usageUnitType
     */
    public String getUsageUnitType() {
        return usageUnitType;
    }

    public void setUsageUnitType(String usageUnitType) {
        this.usageUnitType = usageUnitType;
    }

    public UsageVo withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 用量的计量单位。 - 当用量单位类型为“VOLUME”时，单位为存储量相关的单位，如：GB。 - 当用量单位类型为“NUMBER”时，单位为十亿像素点，“GP”。 - 当用量单位类型为“COUNT”时，单位为“次”。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public UsageVo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 用量记录的创建时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UsageVo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 用量记录的更新时间。格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsageVo that = (UsageVo) obj;
        return Objects.equals(this.usageMeasureName, that.usageMeasureName)
            && Objects.equals(this.usageType, that.usageType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.usageSubtype, that.usageSubtype) && Objects.equals(this.usage, that.usage)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.usageUnitType, that.usageUnitType)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usageMeasureName,
            usageType,
            domainId,
            usageSubtype,
            usage,
            capacity,
            usageUnitType,
            unit,
            createdTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageVo {\n");
        sb.append("    usageMeasureName: ").append(toIndentedString(usageMeasureName)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    usageSubtype: ").append(toIndentedString(usageSubtype)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    usageUnitType: ").append(toIndentedString(usageUnitType)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

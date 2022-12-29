package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用量基本信息。
 */
public class UsageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_name")

    private String usageMeasureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_unit_type")

    private String usageUnitType;

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
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public UsageInfo withUsageMeasureName(String usageMeasureName) {
        this.usageMeasureName = usageMeasureName;
        return this;
    }

    /**
     * 用量度量名称，通常与KooMap的计费项保持一致。当前支持以下用量度量名称： - 时空专属存储 - 基础处理：色彩增强与粗纠正L2 - 基础处理：正射纠正L4 - 基础处理：影像镶嵌L5
     * @return usageMeasureName
     */
    public String getUsageMeasureName() {
        return usageMeasureName;
    }

    public void setUsageMeasureName(String usageMeasureName) {
        this.usageMeasureName = usageMeasureName;
    }

    public UsageInfo withUsageUnitType(String usageUnitType) {
        this.usageUnitType = usageUnitType;
        return this;
    }

    /**
     * 用量单位类型，表示单条用量单位所对应的类型。  - 该值为“VOLUME”时表示用量单位是存储量。  - 该值为“TIME”时表示用量单位是次数。
     * @return usageUnitType
     */
    public String getUsageUnitType() {
        return usageUnitType;
    }

    public void setUsageUnitType(String usageUnitType) {
        this.usageUnitType = usageUnitType;
    }

    public UsageInfo withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * 用量类型。 - 该值为“DATA”时表示时空专属存储服务对应的用量。 - 该值为“TASK”时表示处理任务服务对应的用量。
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public UsageInfo withDomainId(String domainId) {
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

    public UsageInfo withUsageSubtype(String usageSubtype) {
        this.usageSubtype = usageSubtype;
        return this;
    }

    /**
     * 用量子类型，用于区分同一用量类型下的多个子用量，目前usage_type为“TASK”时才需要设置该值。 - L2：L2等级处理服务。 - L4：L4等级处理服务。 - L5：L5等级处理服务。
     * @return usageSubtype
     */
    public String getUsageSubtype() {
        return usageSubtype;
    }

    public void setUsageSubtype(String usageSubtype) {
        this.usageSubtype = usageSubtype;
    }

    public UsageInfo withUsage(Float usage) {
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

    public UsageInfo withCapacity(Float capacity) {
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

    public UsageInfo withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 用量的计量单位。 - 当用量单位类型为“VOLUME”时，单位为存储量相关的单位，如：GB。 - 当用量单位类型为“TIME”时，单位为“次”。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public UsageInfo withCreatedTime(String createdTime) {
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

    public UsageInfo withUpdateTime(String updateTime) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageInfo usageInfo = (UsageInfo) o;
        return Objects.equals(this.usageMeasureName, usageInfo.usageMeasureName)
            && Objects.equals(this.usageUnitType, usageInfo.usageUnitType)
            && Objects.equals(this.usageType, usageInfo.usageType) && Objects.equals(this.domainId, usageInfo.domainId)
            && Objects.equals(this.usageSubtype, usageInfo.usageSubtype) && Objects.equals(this.usage, usageInfo.usage)
            && Objects.equals(this.capacity, usageInfo.capacity) && Objects.equals(this.unit, usageInfo.unit)
            && Objects.equals(this.createdTime, usageInfo.createdTime)
            && Objects.equals(this.updateTime, usageInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usageMeasureName,
            usageUnitType,
            usageType,
            domainId,
            usageSubtype,
            usage,
            capacity,
            unit,
            createdTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageInfo {\n");
        sb.append("    usageMeasureName: ").append(toIndentedString(usageMeasureName)).append("\n");
        sb.append("    usageUnitType: ").append(toIndentedString(usageUnitType)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    usageSubtype: ").append(toIndentedString(usageSubtype)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

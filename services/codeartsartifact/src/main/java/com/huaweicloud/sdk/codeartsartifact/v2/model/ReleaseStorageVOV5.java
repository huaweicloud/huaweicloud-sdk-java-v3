package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReleaseStorageVOV5
 */
public class ReleaseStorageVOV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity")

    private String usedCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_capacity")

    private String totalCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity_size")

    private Long usedCapacitySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_capacity_size")

    private Long totalCapacitySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ReleaseStorageVOV5 withUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    /**
     * **参数解释**: 已使用存储量 ---带单位。 **取值范围**: 不涉及。 
     * @return usedCapacity
     */
    public String getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public ReleaseStorageVOV5 withTotalCapacity(String totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * **参数解释**: 租户存储最大量 ---带单位。 **取值范围**: 不涉及。 
     * @return totalCapacity
     */
    public String getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public ReleaseStorageVOV5 withUsedCapacitySize(Long usedCapacitySize) {
        this.usedCapacitySize = usedCapacitySize;
        return this;
    }

    /**
     * **参数解释**: 已使用存储量 ---字节。 **取值范围**: 不涉及。 
     * @return usedCapacitySize
     */
    public Long getUsedCapacitySize() {
        return usedCapacitySize;
    }

    public void setUsedCapacitySize(Long usedCapacitySize) {
        this.usedCapacitySize = usedCapacitySize;
    }

    public ReleaseStorageVOV5 withTotalCapacitySize(Long totalCapacitySize) {
        this.totalCapacitySize = totalCapacitySize;
        return this;
    }

    /**
     * **参数解释**: 租户存储最大量 ---字节。 **取值范围**: 不涉及。 
     * @return totalCapacitySize
     */
    public Long getTotalCapacitySize() {
        return totalCapacitySize;
    }

    public void setTotalCapacitySize(Long totalCapacitySize) {
        this.totalCapacitySize = totalCapacitySize;
    }

    public ReleaseStorageVOV5 withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * **参数解释**: 包周期套餐类型(0.no_package 1.basic 2.professional 3.platinum)。 **取值范围**: 不涉及。 
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ReleaseStorageVOV5 withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 项目仓库数量。 **取值范围**: 不涉及。 
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReleaseStorageVOV5 that = (ReleaseStorageVOV5) obj;
        return Objects.equals(this.usedCapacity, that.usedCapacity)
            && Objects.equals(this.totalCapacity, that.totalCapacity)
            && Objects.equals(this.usedCapacitySize, that.usedCapacitySize)
            && Objects.equals(this.totalCapacitySize, that.totalCapacitySize)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedCapacity, totalCapacity, usedCapacitySize, totalCapacitySize, packageType, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReleaseStorageVOV5 {\n");
        sb.append("    usedCapacity: ").append(toIndentedString(usedCapacity)).append("\n");
        sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
        sb.append("    usedCapacitySize: ").append(toIndentedString(usedCapacitySize)).append("\n");
        sb.append("    totalCapacitySize: ").append(toIndentedString(totalCapacitySize)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

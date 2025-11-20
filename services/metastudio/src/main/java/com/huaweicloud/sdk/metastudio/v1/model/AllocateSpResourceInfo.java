package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分配给租户的资源。
 */
public class AllocateSpResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_record_id")

    private String assignmentRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_num")

    private Double resourceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_used_num")

    private Double resourceUsedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_allocate_time")

    private Long resourceAllocateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expire_time")

    private Long resourceExpireTime;

    public AllocateSpResourceInfo withAssignmentRecordId(String assignmentRecordId) {
        this.assignmentRecordId = assignmentRecordId;
        return this;
    }

    /**
     * 资源分配id。
     * @return assignmentRecordId
     */
    public String getAssignmentRecordId() {
        return assignmentRecordId;
    }

    public void setAssignmentRecordId(String assignmentRecordId) {
        this.assignmentRecordId = assignmentRecordId;
    }

    public AllocateSpResourceInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public AllocateSpResourceInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 资源计费类型。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public AllocateSpResourceInfo withResourceNum(Double resourceNum) {
        this.resourceNum = resourceNum;
        return this;
    }

    /**
     * 资源数量。
     * minimum: 0
     * maximum: 2147483647
     * @return resourceNum
     */
    public Double getResourceNum() {
        return resourceNum;
    }

    public void setResourceNum(Double resourceNum) {
        this.resourceNum = resourceNum;
    }

    public AllocateSpResourceInfo withResourceUsedNum(Double resourceUsedNum) {
        this.resourceUsedNum = resourceUsedNum;
        return this;
    }

    /**
     * 资源已使用数量。
     * minimum: 0
     * maximum: 2147483647
     * @return resourceUsedNum
     */
    public Double getResourceUsedNum() {
        return resourceUsedNum;
    }

    public void setResourceUsedNum(Double resourceUsedNum) {
        this.resourceUsedNum = resourceUsedNum;
    }

    public AllocateSpResourceInfo withResourceAllocateTime(Long resourceAllocateTime) {
        this.resourceAllocateTime = resourceAllocateTime;
        return this;
    }

    /**
     * 资源分配时间（UTC时间）,unix时间,精确到秒。
     * minimum: 0
     * maximum: 2147483647
     * @return resourceAllocateTime
     */
    public Long getResourceAllocateTime() {
        return resourceAllocateTime;
    }

    public void setResourceAllocateTime(Long resourceAllocateTime) {
        this.resourceAllocateTime = resourceAllocateTime;
    }

    public AllocateSpResourceInfo withResourceExpireTime(Long resourceExpireTime) {
        this.resourceExpireTime = resourceExpireTime;
        return this;
    }

    /**
     * 资源到期时间(UTC时间),unix时间,精确到秒。
     * minimum: 0
     * maximum: 2147483647
     * @return resourceExpireTime
     */
    public Long getResourceExpireTime() {
        return resourceExpireTime;
    }

    public void setResourceExpireTime(Long resourceExpireTime) {
        this.resourceExpireTime = resourceExpireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllocateSpResourceInfo that = (AllocateSpResourceInfo) obj;
        return Objects.equals(this.assignmentRecordId, that.assignmentRecordId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceNum, that.resourceNum)
            && Objects.equals(this.resourceUsedNum, that.resourceUsedNum)
            && Objects.equals(this.resourceAllocateTime, that.resourceAllocateTime)
            && Objects.equals(this.resourceExpireTime, that.resourceExpireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentRecordId,
            resourceSpecCode,
            chargingMode,
            resourceNum,
            resourceUsedNum,
            resourceAllocateTime,
            resourceExpireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllocateSpResourceInfo {\n");
        sb.append("    assignmentRecordId: ").append(toIndentedString(assignmentRecordId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceNum: ").append(toIndentedString(resourceNum)).append("\n");
        sb.append("    resourceUsedNum: ").append(toIndentedString(resourceUsedNum)).append("\n");
        sb.append("    resourceAllocateTime: ").append(toIndentedString(resourceAllocateTime)).append("\n");
        sb.append("    resourceExpireTime: ").append(toIndentedString(resourceExpireTime)).append("\n");
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

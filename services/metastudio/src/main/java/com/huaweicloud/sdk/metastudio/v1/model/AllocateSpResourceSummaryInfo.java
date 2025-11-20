package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分配给租户的资源概览。
 */
public class AllocateSpResourceSummaryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_num")

    private Double resourceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_used_num")

    private Double resourceUsedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_remind_quota")

    private Double resourceRemindQuota;

    public AllocateSpResourceSummaryInfo withResourceSpecCode(String resourceSpecCode) {
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

    public AllocateSpResourceSummaryInfo withResourceNum(Double resourceNum) {
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

    public AllocateSpResourceSummaryInfo withResourceUsedNum(Double resourceUsedNum) {
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

    public AllocateSpResourceSummaryInfo withResourceRemindQuota(Double resourceRemindQuota) {
        this.resourceRemindQuota = resourceRemindQuota;
        return this;
    }

    /**
     * 资源在TMS上的剩余量
     * minimum: 0
     * maximum: 2147483647
     * @return resourceRemindQuota
     */
    public Double getResourceRemindQuota() {
        return resourceRemindQuota;
    }

    public void setResourceRemindQuota(Double resourceRemindQuota) {
        this.resourceRemindQuota = resourceRemindQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllocateSpResourceSummaryInfo that = (AllocateSpResourceSummaryInfo) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.resourceNum, that.resourceNum)
            && Objects.equals(this.resourceUsedNum, that.resourceUsedNum)
            && Objects.equals(this.resourceRemindQuota, that.resourceRemindQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, resourceNum, resourceUsedNum, resourceRemindQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllocateSpResourceSummaryInfo {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceNum: ").append(toIndentedString(resourceNum)).append("\n");
        sb.append("    resourceUsedNum: ").append(toIndentedString(resourceUsedNum)).append("\n");
        sb.append("    resourceRemindQuota: ").append(toIndentedString(resourceRemindQuota)).append("\n");
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

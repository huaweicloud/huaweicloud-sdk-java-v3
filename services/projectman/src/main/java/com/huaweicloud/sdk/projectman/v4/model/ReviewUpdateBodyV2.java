package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReviewUpdateBodyV2
 */
public class ReviewUpdateBodyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_status")

    private String oldStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    public ReviewUpdateBodyV2 withOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    /**
     * 评审单更新前状态。 0~32个字符。
     * @return oldStatus
     */
    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public ReviewUpdateBodyV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 评审单目标流转状态。 0~32个字符。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReviewUpdateBodyV2 withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划完成时间，unix时间戳，单位：毫秒，示例：\"1759420799999\"。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewUpdateBodyV2 that = (ReviewUpdateBodyV2) obj;
        return Objects.equals(this.oldStatus, that.oldStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.planEndDate, that.planEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldStatus, status, planEndDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewUpdateBodyV2 {\n");
        sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
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

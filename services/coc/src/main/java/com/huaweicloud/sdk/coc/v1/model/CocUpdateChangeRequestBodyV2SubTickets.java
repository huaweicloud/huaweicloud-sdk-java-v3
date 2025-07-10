package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CocUpdateChangeRequestBodyV2SubTickets
 */
public class CocUpdateChangeRequestBodyV2SubTickets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_result")

    private String changeResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_verified_in_change_time")

    private Boolean isVerifiedInChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_docs")

    private String verifiedDocs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_fail_type")

    private String changeFailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_start_time")

    private Long rollbackStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback_end_time")

    private Long rollbackEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_rollback_success")

    private Boolean isRollbackSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_monitor_found")

    private Boolean isMonitorFound;

    public CocUpdateChangeRequestBodyV2SubTickets withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 子单ID
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withChangeResult(String changeResult) {
        this.changeResult = changeResult;
        return this;
    }

    /**
     * 变更结果
     * @return changeResult
     */
    public String getChangeResult() {
        return changeResult;
    }

    public void setChangeResult(String changeResult) {
        this.changeResult = changeResult;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withIsVerifiedInChangeTime(Boolean isVerifiedInChangeTime) {
        this.isVerifiedInChangeTime = isVerifiedInChangeTime;
        return this;
    }

    /**
     * 在时间窗内是否可验证
     * @return isVerifiedInChangeTime
     */
    public Boolean getIsVerifiedInChangeTime() {
        return isVerifiedInChangeTime;
    }

    public void setIsVerifiedInChangeTime(Boolean isVerifiedInChangeTime) {
        this.isVerifiedInChangeTime = isVerifiedInChangeTime;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withVerifiedDocs(String verifiedDocs) {
        this.verifiedDocs = verifiedDocs;
        return this;
    }

    /**
     * 文档ID
     * @return verifiedDocs
     */
    public String getVerifiedDocs() {
        return verifiedDocs;
    }

    public void setVerifiedDocs(String verifiedDocs) {
        this.verifiedDocs = verifiedDocs;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 失败原因描述
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withChangeFailType(String changeFailType) {
        this.changeFailType = changeFailType;
        return this;
    }

    /**
     * 变更失败类型
     * @return changeFailType
     */
    public String getChangeFailType() {
        return changeFailType;
    }

    public void setChangeFailType(String changeFailType) {
        this.changeFailType = changeFailType;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withRollbackStartTime(Long rollbackStartTime) {
        this.rollbackStartTime = rollbackStartTime;
        return this;
    }

    /**
     * 回退开始时间
     * minimum: 0
     * maximum: 9999999999999
     * @return rollbackStartTime
     */
    public Long getRollbackStartTime() {
        return rollbackStartTime;
    }

    public void setRollbackStartTime(Long rollbackStartTime) {
        this.rollbackStartTime = rollbackStartTime;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withRollbackEndTime(Long rollbackEndTime) {
        this.rollbackEndTime = rollbackEndTime;
        return this;
    }

    /**
     * 回退结束时间
     * minimum: 0
     * maximum: 9999999999999
     * @return rollbackEndTime
     */
    public Long getRollbackEndTime() {
        return rollbackEndTime;
    }

    public void setRollbackEndTime(Long rollbackEndTime) {
        this.rollbackEndTime = rollbackEndTime;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withIsRollbackSuccess(Boolean isRollbackSuccess) {
        this.isRollbackSuccess = isRollbackSuccess;
        return this;
    }

    /**
     * 是否回退成功
     * @return isRollbackSuccess
     */
    public Boolean getIsRollbackSuccess() {
        return isRollbackSuccess;
    }

    public void setIsRollbackSuccess(Boolean isRollbackSuccess) {
        this.isRollbackSuccess = isRollbackSuccess;
    }

    public CocUpdateChangeRequestBodyV2SubTickets withIsMonitorFound(Boolean isMonitorFound) {
        this.isMonitorFound = isMonitorFound;
        return this;
    }

    /**
     * 是否监控发现
     * @return isMonitorFound
     */
    public Boolean getIsMonitorFound() {
        return isMonitorFound;
    }

    public void setIsMonitorFound(Boolean isMonitorFound) {
        this.isMonitorFound = isMonitorFound;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocUpdateChangeRequestBodyV2SubTickets that = (CocUpdateChangeRequestBodyV2SubTickets) obj;
        return Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.changeResult, that.changeResult)
            && Objects.equals(this.isVerifiedInChangeTime, that.isVerifiedInChangeTime)
            && Objects.equals(this.verifiedDocs, that.verifiedDocs) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.changeFailType, that.changeFailType)
            && Objects.equals(this.rollbackStartTime, that.rollbackStartTime)
            && Objects.equals(this.rollbackEndTime, that.rollbackEndTime)
            && Objects.equals(this.isRollbackSuccess, that.isRollbackSuccess)
            && Objects.equals(this.isMonitorFound, that.isMonitorFound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId,
            changeResult,
            isVerifiedInChangeTime,
            verifiedDocs,
            comment,
            changeFailType,
            rollbackStartTime,
            rollbackEndTime,
            isRollbackSuccess,
            isMonitorFound);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocUpdateChangeRequestBodyV2SubTickets {\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    changeResult: ").append(toIndentedString(changeResult)).append("\n");
        sb.append("    isVerifiedInChangeTime: ").append(toIndentedString(isVerifiedInChangeTime)).append("\n");
        sb.append("    verifiedDocs: ").append(toIndentedString(verifiedDocs)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    changeFailType: ").append(toIndentedString(changeFailType)).append("\n");
        sb.append("    rollbackStartTime: ").append(toIndentedString(rollbackStartTime)).append("\n");
        sb.append("    rollbackEndTime: ").append(toIndentedString(rollbackEndTime)).append("\n");
        sb.append("    isRollbackSuccess: ").append(toIndentedString(isRollbackSuccess)).append("\n");
        sb.append("    isMonitorFound: ").append(toIndentedString(isMonitorFound)).append("\n");
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

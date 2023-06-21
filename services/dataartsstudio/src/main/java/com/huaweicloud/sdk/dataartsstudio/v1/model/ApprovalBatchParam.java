package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApprovalBatchParam
 */
public class ApprovalBatchParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_infos")

    private List<BizInfoVO> bizInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_user_id")

    private String approverUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_user_name")

    private String approverUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fast_approval")

    private Boolean fastApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_time")

    private String scheduleTime;

    public ApprovalBatchParam withBizInfos(List<BizInfoVO> bizInfos) {
        this.bizInfos = bizInfos;
        return this;
    }

    public ApprovalBatchParam addBizInfosItem(BizInfoVO bizInfosItem) {
        if (this.bizInfos == null) {
            this.bizInfos = new ArrayList<>();
        }
        this.bizInfos.add(bizInfosItem);
        return this;
    }

    public ApprovalBatchParam withBizInfos(Consumer<List<BizInfoVO>> bizInfosSetter) {
        if (this.bizInfos == null) {
            this.bizInfos = new ArrayList<>();
        }
        bizInfosSetter.accept(this.bizInfos);
        return this;
    }

    /**
     * 业务信息列表.
     * @return bizInfos
     */
    public List<BizInfoVO> getBizInfos() {
        return bizInfos;
    }

    public void setBizInfos(List<BizInfoVO> bizInfos) {
        this.bizInfos = bizInfos;
    }

    public ApprovalBatchParam withApproverUserId(String approverUserId) {
        this.approverUserId = approverUserId;
        return this;
    }

    /**
     * 审批人user id
     * @return approverUserId
     */
    public String getApproverUserId() {
        return approverUserId;
    }

    public void setApproverUserId(String approverUserId) {
        this.approverUserId = approverUserId;
    }

    public ApprovalBatchParam withApproverUserName(String approverUserName) {
        this.approverUserName = approverUserName;
        return this;
    }

    /**
     * 审批人user name
     * @return approverUserName
     */
    public String getApproverUserName() {
        return approverUserName;
    }

    public void setApproverUserName(String approverUserName) {
        this.approverUserName = approverUserName;
    }

    public ApprovalBatchParam withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 审批人邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ApprovalBatchParam withFastApproval(Boolean fastApproval) {
        this.fastApproval = fastApproval;
        return this;
    }

    /**
     * 快速审批, 非正式场景，用于快速上手体验，仅在当前用户有审批权限时提供
     * @return fastApproval
     */
    public Boolean getFastApproval() {
        return fastApproval;
    }

    public void setFastApproval(Boolean fastApproval) {
        this.fastApproval = fastApproval;
    }

    public ApprovalBatchParam withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * 作业调度时间
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApprovalBatchParam approvalBatchParam = (ApprovalBatchParam) o;
        return Objects.equals(this.bizInfos, approvalBatchParam.bizInfos)
            && Objects.equals(this.approverUserId, approvalBatchParam.approverUserId)
            && Objects.equals(this.approverUserName, approvalBatchParam.approverUserName)
            && Objects.equals(this.email, approvalBatchParam.email)
            && Objects.equals(this.fastApproval, approvalBatchParam.fastApproval)
            && Objects.equals(this.scheduleTime, approvalBatchParam.scheduleTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bizInfos, approverUserId, approverUserName, email, fastApproval, scheduleTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalBatchParam {\n");
        sb.append("    bizInfos: ").append(toIndentedString(bizInfos)).append("\n");
        sb.append("    approverUserId: ").append(toIndentedString(approverUserId)).append("\n");
        sb.append("    approverUserName: ").append(toIndentedString(approverUserName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fastApproval: ").append(toIndentedString(fastApproval)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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

package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApprovalActionTypeDto
 */
public class ApprovalActionTypeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_comment")

    private String approverComment;

    public ApprovalActionTypeDto withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释：** 审核/检视操作动作 - approve，审核通过 - reject，审核拒绝 - complete，检视通过 - reset，重置审核/检视结果
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public ApprovalActionTypeDto withApproverComment(String approverComment) {
        this.approverComment = approverComment;
        return this;
    }

    /**
     * **参数解释：** 审核备注 **取值范围：** 不涉及。
     * @return approverComment
     */
    public String getApproverComment() {
        return approverComment;
    }

    public void setApproverComment(String approverComment) {
        this.approverComment = approverComment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApprovalActionTypeDto that = (ApprovalActionTypeDto) obj;
        return Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.approverComment, that.approverComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType, approverComment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalActionTypeDto {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    approverComment: ").append(toIndentedString(approverComment)).append("\n");
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

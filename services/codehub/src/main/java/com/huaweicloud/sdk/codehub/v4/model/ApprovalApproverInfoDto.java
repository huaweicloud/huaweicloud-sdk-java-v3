package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApprovalApproverInfoDto
 */
public class ApprovalApproverInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_ids")

    private String approverIds;

    public ApprovalApproverInfoDto withApproverIds(String approverIds) {
        this.approverIds = approverIds;
        return this;
    }

    /**
     * **参数解释：** 需要更新的审核人ID列表 数字以英文逗号分隔 111,222 **取值范围：** 不涉及。
     * @return approverIds
     */
    public String getApproverIds() {
        return approverIds;
    }

    public void setApproverIds(String approverIds) {
        this.approverIds = approverIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApprovalApproverInfoDto that = (ApprovalApproverInfoDto) obj;
        return Objects.equals(this.approverIds, that.approverIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approverIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApprovalApproverInfoDto {\n");
        sb.append("    approverIds: ").append(toIndentedString(approverIds)).append("\n");
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

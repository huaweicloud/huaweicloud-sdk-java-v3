package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityApprovalsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvals")

    private List<PermissionApprovalOpenapiDTO> approvals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListSecurityApprovalsResponse withApprovals(List<PermissionApprovalOpenapiDTO> approvals) {
        this.approvals = approvals;
        return this;
    }

    public ListSecurityApprovalsResponse addApprovalsItem(PermissionApprovalOpenapiDTO approvalsItem) {
        if (this.approvals == null) {
            this.approvals = new ArrayList<>();
        }
        this.approvals.add(approvalsItem);
        return this;
    }

    public ListSecurityApprovalsResponse withApprovals(Consumer<List<PermissionApprovalOpenapiDTO>> approvalsSetter) {
        if (this.approvals == null) {
            this.approvals = new ArrayList<>();
        }
        approvalsSetter.accept(this.approvals);
        return this;
    }

    /**
     * 工单列表
     * @return approvals
     */
    public List<PermissionApprovalOpenapiDTO> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<PermissionApprovalOpenapiDTO> approvals) {
        this.approvals = approvals;
    }

    public ListSecurityApprovalsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 规则组总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityApprovalsResponse that = (ListSecurityApprovalsResponse) obj;
        return Objects.equals(this.approvals, that.approvals) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvals, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityApprovalsResponse {\n");
        sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

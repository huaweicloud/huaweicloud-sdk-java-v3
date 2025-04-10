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
public class ListSecurityTableApproversResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<TableApprover> approvers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_table_rule")

    private Boolean hasTableRule;

    public ListSecurityTableApproversResponse withApprovers(List<TableApprover> approvers) {
        this.approvers = approvers;
        return this;
    }

    public ListSecurityTableApproversResponse addApproversItem(TableApprover approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public ListSecurityTableApproversResponse withApprovers(Consumer<List<TableApprover>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 审批人列表
     * @return approvers
     */
    public List<TableApprover> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<TableApprover> approvers) {
        this.approvers = approvers;
    }

    public ListSecurityTableApproversResponse withHasTableRule(Boolean hasTableRule) {
        this.hasTableRule = hasTableRule;
        return this;
    }

    /**
     * 是否已经有权限
     * @return hasTableRule
     */
    public Boolean getHasTableRule() {
        return hasTableRule;
    }

    public void setHasTableRule(Boolean hasTableRule) {
        this.hasTableRule = hasTableRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityTableApproversResponse that = (ListSecurityTableApproversResponse) obj;
        return Objects.equals(this.approvers, that.approvers) && Objects.equals(this.hasTableRule, that.hasTableRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvers, hasTableRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityTableApproversResponse {\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
        sb.append("    hasTableRule: ").append(toIndentedString(hasTableRule)).append("\n");
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

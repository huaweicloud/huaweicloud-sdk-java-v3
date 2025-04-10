package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取表审批人列表参数
 */
public class ApplyTableAuthorityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private TableApprover approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_info")

    private ListTableApproversRequestBody tableInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposers")

    private List<TableProposers> proposers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public ApplyTableAuthorityRequestBody withApprover(TableApprover approver) {
        this.approver = approver;
        return this;
    }

    public ApplyTableAuthorityRequestBody withApprover(Consumer<TableApprover> approverSetter) {
        if (this.approver == null) {
            this.approver = new TableApprover();
            approverSetter.accept(this.approver);
        }

        return this;
    }

    /**
     * Get approver
     * @return approver
     */
    public TableApprover getApprover() {
        return approver;
    }

    public void setApprover(TableApprover approver) {
        this.approver = approver;
    }

    public ApplyTableAuthorityRequestBody withTableInfo(ListTableApproversRequestBody tableInfo) {
        this.tableInfo = tableInfo;
        return this;
    }

    public ApplyTableAuthorityRequestBody withTableInfo(Consumer<ListTableApproversRequestBody> tableInfoSetter) {
        if (this.tableInfo == null) {
            this.tableInfo = new ListTableApproversRequestBody();
            tableInfoSetter.accept(this.tableInfo);
        }

        return this;
    }

    /**
     * Get tableInfo
     * @return tableInfo
     */
    public ListTableApproversRequestBody getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(ListTableApproversRequestBody tableInfo) {
        this.tableInfo = tableInfo;
    }

    public ApplyTableAuthorityRequestBody withProposers(List<TableProposers> proposers) {
        this.proposers = proposers;
        return this;
    }

    public ApplyTableAuthorityRequestBody addProposersItem(TableProposers proposersItem) {
        if (this.proposers == null) {
            this.proposers = new ArrayList<>();
        }
        this.proposers.add(proposersItem);
        return this;
    }

    public ApplyTableAuthorityRequestBody withProposers(Consumer<List<TableProposers>> proposersSetter) {
        if (this.proposers == null) {
            this.proposers = new ArrayList<>();
        }
        proposersSetter.accept(this.proposers);
        return this;
    }

    /**
     * 申请人列表
     * @return proposers
     */
    public List<TableProposers> getProposers() {
        return proposers;
    }

    public void setProposers(List<TableProposers> proposers) {
        this.proposers = proposers;
    }

    public ApplyTableAuthorityRequestBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 申请理由
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyTableAuthorityRequestBody that = (ApplyTableAuthorityRequestBody) obj;
        return Objects.equals(this.approver, that.approver) && Objects.equals(this.tableInfo, that.tableInfo)
            && Objects.equals(this.proposers, that.proposers) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approver, tableInfo, proposers, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyTableAuthorityRequestBody {\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    tableInfo: ").append(toIndentedString(tableInfo)).append("\n");
        sb.append("    proposers: ").append(toIndentedString(proposers)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

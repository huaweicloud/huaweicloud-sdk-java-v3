package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteReq
 */
public class DeleteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<JobApprover> approvers = null;

    public DeleteReq withApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
        return this;
    }

    public DeleteReq addApproversItem(JobApprover approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public DeleteReq withApprovers(Consumer<List<JobApprover>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段，表示作业（或脚本）审批人。
     * @return approvers
     */
    public List<JobApprover> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteReq that = (DeleteReq) obj;
        return Objects.equals(this.approvers, that.approvers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteReq {\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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

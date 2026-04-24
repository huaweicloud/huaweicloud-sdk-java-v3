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
public class ListFactoryWorkspacesApprovalResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_apply_search_list")

    private List<ListFactoryWorkspacesApprovalRespJobApplySearchList> jobApplySearchList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListFactoryWorkspacesApprovalResponse withJobApplySearchList(
        List<ListFactoryWorkspacesApprovalRespJobApplySearchList> jobApplySearchList) {
        this.jobApplySearchList = jobApplySearchList;
        return this;
    }

    public ListFactoryWorkspacesApprovalResponse addJobApplySearchListItem(
        ListFactoryWorkspacesApprovalRespJobApplySearchList jobApplySearchListItem) {
        if (this.jobApplySearchList == null) {
            this.jobApplySearchList = new ArrayList<>();
        }
        this.jobApplySearchList.add(jobApplySearchListItem);
        return this;
    }

    public ListFactoryWorkspacesApprovalResponse withJobApplySearchList(
        Consumer<List<ListFactoryWorkspacesApprovalRespJobApplySearchList>> jobApplySearchListSetter) {
        if (this.jobApplySearchList == null) {
            this.jobApplySearchList = new ArrayList<>();
        }
        jobApplySearchListSetter.accept(this.jobApplySearchList);
        return this;
    }

    /**
     * 审批详细信息。
     * @return jobApplySearchList
     */
    public List<ListFactoryWorkspacesApprovalRespJobApplySearchList> getJobApplySearchList() {
        return jobApplySearchList;
    }

    public void setJobApplySearchList(List<ListFactoryWorkspacesApprovalRespJobApplySearchList> jobApplySearchList) {
        this.jobApplySearchList = jobApplySearchList;
    }

    public ListFactoryWorkspacesApprovalResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 审批总数量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
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
        ListFactoryWorkspacesApprovalResponse that = (ListFactoryWorkspacesApprovalResponse) obj;
        return Objects.equals(this.jobApplySearchList, that.jobApplySearchList)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobApplySearchList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryWorkspacesApprovalResponse {\n");
        sb.append("    jobApplySearchList: ").append(toIndentedString(jobApplySearchList)).append("\n");
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

package com.huaweicloud.sdk.iam.v5.model;

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
public class GetServiceLinkedAgencyDeletionStatusV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private DeletionTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_usage_list")

    private List<AgencyUsage> agencyUsageList = null;

    public GetServiceLinkedAgencyDeletionStatusV5Response withStatus(DeletionTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public DeletionTaskStatus getStatus() {
        return status;
    }

    public void setStatus(DeletionTaskStatus status) {
        this.status = status;
    }

    public GetServiceLinkedAgencyDeletionStatusV5Response withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 删除失败的原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public GetServiceLinkedAgencyDeletionStatusV5Response withAgencyUsageList(List<AgencyUsage> agencyUsageList) {
        this.agencyUsageList = agencyUsageList;
        return this;
    }

    public GetServiceLinkedAgencyDeletionStatusV5Response addAgencyUsageListItem(AgencyUsage agencyUsageListItem) {
        if (this.agencyUsageList == null) {
            this.agencyUsageList = new ArrayList<>();
        }
        this.agencyUsageList.add(agencyUsageListItem);
        return this;
    }

    public GetServiceLinkedAgencyDeletionStatusV5Response withAgencyUsageList(
        Consumer<List<AgencyUsage>> agencyUsageListSetter) {
        if (this.agencyUsageList == null) {
            this.agencyUsageList = new ArrayList<>();
        }
        agencyUsageListSetter.accept(this.agencyUsageList);
        return this;
    }

    /**
     * 该服务关联委托正在被使用的场景列表。
     * @return agencyUsageList
     */
    public List<AgencyUsage> getAgencyUsageList() {
        return agencyUsageList;
    }

    public void setAgencyUsageList(List<AgencyUsage> agencyUsageList) {
        this.agencyUsageList = agencyUsageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetServiceLinkedAgencyDeletionStatusV5Response that = (GetServiceLinkedAgencyDeletionStatusV5Response) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.agencyUsageList, that.agencyUsageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, agencyUsageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetServiceLinkedAgencyDeletionStatusV5Response {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    agencyUsageList: ").append(toIndentedString(agencyUsageList)).append("\n");
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

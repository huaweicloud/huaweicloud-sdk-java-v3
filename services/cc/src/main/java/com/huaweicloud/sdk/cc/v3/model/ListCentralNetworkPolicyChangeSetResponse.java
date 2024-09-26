package com.huaweicloud.sdk.cc.v3.model;

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
public class ListCentralNetworkPolicyChangeSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_policy_change_set")

    private List<CentralNetworkElementChange> centralNetworkPolicyChangeSet = null;

    public ListCentralNetworkPolicyChangeSetResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCentralNetworkPolicyChangeSetResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkPolicyChangeSetResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListCentralNetworkPolicyChangeSetResponse withCentralNetworkPolicyChangeSet(
        List<CentralNetworkElementChange> centralNetworkPolicyChangeSet) {
        this.centralNetworkPolicyChangeSet = centralNetworkPolicyChangeSet;
        return this;
    }

    public ListCentralNetworkPolicyChangeSetResponse addCentralNetworkPolicyChangeSetItem(
        CentralNetworkElementChange centralNetworkPolicyChangeSetItem) {
        if (this.centralNetworkPolicyChangeSet == null) {
            this.centralNetworkPolicyChangeSet = new ArrayList<>();
        }
        this.centralNetworkPolicyChangeSet.add(centralNetworkPolicyChangeSetItem);
        return this;
    }

    public ListCentralNetworkPolicyChangeSetResponse withCentralNetworkPolicyChangeSet(
        Consumer<List<CentralNetworkElementChange>> centralNetworkPolicyChangeSetSetter) {
        if (this.centralNetworkPolicyChangeSet == null) {
            this.centralNetworkPolicyChangeSet = new ArrayList<>();
        }
        centralNetworkPolicyChangeSetSetter.accept(this.centralNetworkPolicyChangeSet);
        return this;
    }

    /**
     * 网络策略变化列表。
     * @return centralNetworkPolicyChangeSet
     */
    public List<CentralNetworkElementChange> getCentralNetworkPolicyChangeSet() {
        return centralNetworkPolicyChangeSet;
    }

    public void setCentralNetworkPolicyChangeSet(List<CentralNetworkElementChange> centralNetworkPolicyChangeSet) {
        this.centralNetworkPolicyChangeSet = centralNetworkPolicyChangeSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkPolicyChangeSetResponse that = (ListCentralNetworkPolicyChangeSetResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkPolicyChangeSet, that.centralNetworkPolicyChangeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkPolicyChangeSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkPolicyChangeSetResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkPolicyChangeSet: ")
            .append(toIndentedString(centralNetworkPolicyChangeSet))
            .append("\n");
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

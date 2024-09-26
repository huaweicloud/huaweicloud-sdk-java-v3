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
public class ListCentralNetworksByTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_networks")

    private List<CentralNetwork> centralNetworks = null;

    public ListCentralNetworksByTagsResponse withRequestId(String requestId) {
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

    public ListCentralNetworksByTagsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworksByTagsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworksByTagsResponse withCentralNetworks(List<CentralNetwork> centralNetworks) {
        this.centralNetworks = centralNetworks;
        return this;
    }

    public ListCentralNetworksByTagsResponse addCentralNetworksItem(CentralNetwork centralNetworksItem) {
        if (this.centralNetworks == null) {
            this.centralNetworks = new ArrayList<>();
        }
        this.centralNetworks.add(centralNetworksItem);
        return this;
    }

    public ListCentralNetworksByTagsResponse withCentralNetworks(Consumer<List<CentralNetwork>> centralNetworksSetter) {
        if (this.centralNetworks == null) {
            this.centralNetworks = new ArrayList<>();
        }
        centralNetworksSetter.accept(this.centralNetworks);
        return this;
    }

    /**
     * 中心网络列表。
     * @return centralNetworks
     */
    public List<CentralNetwork> getCentralNetworks() {
        return centralNetworks;
    }

    public void setCentralNetworks(List<CentralNetwork> centralNetworks) {
        this.centralNetworks = centralNetworks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworksByTagsResponse that = (ListCentralNetworksByTagsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworks, that.centralNetworks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworksByTagsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworks: ").append(toIndentedString(centralNetworks)).append("\n");
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

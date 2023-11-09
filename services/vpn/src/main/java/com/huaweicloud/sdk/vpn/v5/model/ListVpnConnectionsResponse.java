package com.huaweicloud.sdk.vpn.v5.model;

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
public class ListVpnConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connections")

    private List<ResponseVpnConnection> vpnConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public ListVpnConnectionsResponse withVpnConnections(List<ResponseVpnConnection> vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }

    public ListVpnConnectionsResponse addVpnConnectionsItem(ResponseVpnConnection vpnConnectionsItem) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        this.vpnConnections.add(vpnConnectionsItem);
        return this;
    }

    public ListVpnConnectionsResponse withVpnConnections(Consumer<List<ResponseVpnConnection>> vpnConnectionsSetter) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        vpnConnectionsSetter.accept(this.vpnConnections);
        return this;
    }

    /**
     * Get vpnConnections
     * @return vpnConnections
     */
    public List<ResponseVpnConnection> getVpnConnections() {
        return vpnConnections;
    }

    public void setVpnConnections(List<ResponseVpnConnection> vpnConnections) {
        this.vpnConnections = vpnConnections;
    }

    public ListVpnConnectionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVpnConnectionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListVpnConnectionsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVpnConnectionsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 租户下连接总数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListVpnConnectionsResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpnConnectionsResponse that = (ListVpnConnectionsResponse) obj;
        return Objects.equals(this.vpnConnections, that.vpnConnections) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnections, pageInfo, requestId, totalCount, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpnConnectionsResponse {\n");
        sb.append("    vpnConnections: ").append(toIndentedString(vpnConnections)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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

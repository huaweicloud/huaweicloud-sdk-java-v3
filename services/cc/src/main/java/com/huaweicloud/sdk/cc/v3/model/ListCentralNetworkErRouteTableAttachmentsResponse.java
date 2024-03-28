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
public class ListCentralNetworkErRouteTableAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_er_route_table_attachments")

    private List<CentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachments = null;

    public ListCentralNetworkErRouteTableAttachmentsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCentralNetworkErRouteTableAttachmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworkErRouteTableAttachmentsResponse withCentralNetworkErRouteTableAttachments(
        List<CentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachments) {
        this.centralNetworkErRouteTableAttachments = centralNetworkErRouteTableAttachments;
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsResponse addCentralNetworkErRouteTableAttachmentsItem(
        CentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachmentsItem) {
        if (this.centralNetworkErRouteTableAttachments == null) {
            this.centralNetworkErRouteTableAttachments = new ArrayList<>();
        }
        this.centralNetworkErRouteTableAttachments.add(centralNetworkErRouteTableAttachmentsItem);
        return this;
    }

    public ListCentralNetworkErRouteTableAttachmentsResponse withCentralNetworkErRouteTableAttachments(
        Consumer<List<CentralNetworkErRouteTableAttachment>> centralNetworkErRouteTableAttachmentsSetter) {
        if (this.centralNetworkErRouteTableAttachments == null) {
            this.centralNetworkErRouteTableAttachments = new ArrayList<>();
        }
        centralNetworkErRouteTableAttachmentsSetter.accept(this.centralNetworkErRouteTableAttachments);
        return this;
    }

    /**
     * 创建路由表附件的返回体
     * @return centralNetworkErRouteTableAttachments
     */
    public List<CentralNetworkErRouteTableAttachment> getCentralNetworkErRouteTableAttachments() {
        return centralNetworkErRouteTableAttachments;
    }

    public void setCentralNetworkErRouteTableAttachments(
        List<CentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachments) {
        this.centralNetworkErRouteTableAttachments = centralNetworkErRouteTableAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkErRouteTableAttachmentsResponse that =
            (ListCentralNetworkErRouteTableAttachmentsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkErRouteTableAttachments, that.centralNetworkErRouteTableAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkErRouteTableAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkErRouteTableAttachmentsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkErRouteTableAttachments: ")
            .append(toIndentedString(centralNetworkErRouteTableAttachments))
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

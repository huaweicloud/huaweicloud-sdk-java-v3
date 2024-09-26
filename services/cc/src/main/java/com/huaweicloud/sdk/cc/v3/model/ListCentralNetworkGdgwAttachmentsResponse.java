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
public class ListCentralNetworkGdgwAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_gdgw_attachments")

    private List<CentralNetworkGdgwAttachment> centralNetworkGdgwAttachments = null;

    public ListCentralNetworkGdgwAttachmentsResponse withRequestId(String requestId) {
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

    public ListCentralNetworkGdgwAttachmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkGdgwAttachmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworkGdgwAttachmentsResponse withCentralNetworkGdgwAttachments(
        List<CentralNetworkGdgwAttachment> centralNetworkGdgwAttachments) {
        this.centralNetworkGdgwAttachments = centralNetworkGdgwAttachments;
        return this;
    }

    public ListCentralNetworkGdgwAttachmentsResponse addCentralNetworkGdgwAttachmentsItem(
        CentralNetworkGdgwAttachment centralNetworkGdgwAttachmentsItem) {
        if (this.centralNetworkGdgwAttachments == null) {
            this.centralNetworkGdgwAttachments = new ArrayList<>();
        }
        this.centralNetworkGdgwAttachments.add(centralNetworkGdgwAttachmentsItem);
        return this;
    }

    public ListCentralNetworkGdgwAttachmentsResponse withCentralNetworkGdgwAttachments(
        Consumer<List<CentralNetworkGdgwAttachment>> centralNetworkGdgwAttachmentsSetter) {
        if (this.centralNetworkGdgwAttachments == null) {
            this.centralNetworkGdgwAttachments = new ArrayList<>();
        }
        centralNetworkGdgwAttachmentsSetter.accept(this.centralNetworkGdgwAttachments);
        return this;
    }

    /**
     * 中心网络GDGW附件列表。
     * @return centralNetworkGdgwAttachments
     */
    public List<CentralNetworkGdgwAttachment> getCentralNetworkGdgwAttachments() {
        return centralNetworkGdgwAttachments;
    }

    public void setCentralNetworkGdgwAttachments(List<CentralNetworkGdgwAttachment> centralNetworkGdgwAttachments) {
        this.centralNetworkGdgwAttachments = centralNetworkGdgwAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkGdgwAttachmentsResponse that = (ListCentralNetworkGdgwAttachmentsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkGdgwAttachments, that.centralNetworkGdgwAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkGdgwAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkGdgwAttachmentsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkGdgwAttachments: ")
            .append(toIndentedString(centralNetworkGdgwAttachments))
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

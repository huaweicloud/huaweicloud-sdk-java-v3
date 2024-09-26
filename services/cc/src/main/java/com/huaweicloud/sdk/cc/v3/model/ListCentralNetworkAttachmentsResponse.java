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
public class ListCentralNetworkAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_attachments")

    private List<CentralNetworkAttachment> centralNetworkAttachments = null;

    public ListCentralNetworkAttachmentsResponse withRequestId(String requestId) {
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

    public ListCentralNetworkAttachmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkAttachmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworkAttachmentsResponse withCentralNetworkAttachments(
        List<CentralNetworkAttachment> centralNetworkAttachments) {
        this.centralNetworkAttachments = centralNetworkAttachments;
        return this;
    }

    public ListCentralNetworkAttachmentsResponse addCentralNetworkAttachmentsItem(
        CentralNetworkAttachment centralNetworkAttachmentsItem) {
        if (this.centralNetworkAttachments == null) {
            this.centralNetworkAttachments = new ArrayList<>();
        }
        this.centralNetworkAttachments.add(centralNetworkAttachmentsItem);
        return this;
    }

    public ListCentralNetworkAttachmentsResponse withCentralNetworkAttachments(
        Consumer<List<CentralNetworkAttachment>> centralNetworkAttachmentsSetter) {
        if (this.centralNetworkAttachments == null) {
            this.centralNetworkAttachments = new ArrayList<>();
        }
        centralNetworkAttachmentsSetter.accept(this.centralNetworkAttachments);
        return this;
    }

    /**
     * 接入网络实例连接列表。
     * @return centralNetworkAttachments
     */
    public List<CentralNetworkAttachment> getCentralNetworkAttachments() {
        return centralNetworkAttachments;
    }

    public void setCentralNetworkAttachments(List<CentralNetworkAttachment> centralNetworkAttachments) {
        this.centralNetworkAttachments = centralNetworkAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkAttachmentsResponse that = (ListCentralNetworkAttachmentsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkAttachments, that.centralNetworkAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkAttachmentsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkAttachments: ").append(toIndentedString(centralNetworkAttachments)).append("\n");
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

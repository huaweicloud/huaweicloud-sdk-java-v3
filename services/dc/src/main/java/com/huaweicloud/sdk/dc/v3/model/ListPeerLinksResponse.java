package com.huaweicloud.sdk.dc.v3.model;

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
public class ListPeerLinksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_links")

    private List<PeerLinkEntry> peerLinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListPeerLinksResponse withPeerLinks(List<PeerLinkEntry> peerLinks) {
        this.peerLinks = peerLinks;
        return this;
    }

    public ListPeerLinksResponse addPeerLinksItem(PeerLinkEntry peerLinksItem) {
        if (this.peerLinks == null) {
            this.peerLinks = new ArrayList<>();
        }
        this.peerLinks.add(peerLinksItem);
        return this;
    }

    public ListPeerLinksResponse withPeerLinks(Consumer<List<PeerLinkEntry>> peerLinksSetter) {
        if (this.peerLinks == null) {
            this.peerLinks = new ArrayList<>();
        }
        peerLinksSetter.accept(this.peerLinks);
        return this;
    }

    /**
     * 专线关联连接列表。
     * @return peerLinks
     */
    public List<PeerLinkEntry> getPeerLinks() {
        return peerLinks;
    }

    public void setPeerLinks(List<PeerLinkEntry> peerLinks) {
        this.peerLinks = peerLinks;
    }

    public ListPeerLinksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPeerLinksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListPeerLinksResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPeerLinksResponse that = (ListPeerLinksResponse) obj;
        return Objects.equals(this.peerLinks, that.peerLinks) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerLinks, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPeerLinksResponse {\n");
        sb.append("    peerLinks: ").append(toIndentedString(peerLinks)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

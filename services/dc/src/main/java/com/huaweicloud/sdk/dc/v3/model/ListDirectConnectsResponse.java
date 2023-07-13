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
public class ListDirectConnectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connects")

    private List<DirectConnect> directConnects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListDirectConnectsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListDirectConnectsResponse withDirectConnects(List<DirectConnect> directConnects) {
        this.directConnects = directConnects;
        return this;
    }

    public ListDirectConnectsResponse addDirectConnectsItem(DirectConnect directConnectsItem) {
        if (this.directConnects == null) {
            this.directConnects = new ArrayList<>();
        }
        this.directConnects.add(directConnectsItem);
        return this;
    }

    public ListDirectConnectsResponse withDirectConnects(Consumer<List<DirectConnect>> directConnectsSetter) {
        if (this.directConnects == null) {
            this.directConnects = new ArrayList<>();
        }
        directConnectsSetter.accept(this.directConnects);
        return this;
    }

    /**
     * 物理专线对象列表
     * @return directConnects
     */
    public List<DirectConnect> getDirectConnects() {
        return directConnects;
    }

    public void setDirectConnects(List<DirectConnect> directConnects) {
        this.directConnects = directConnects;
    }

    public ListDirectConnectsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListDirectConnectsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDirectConnectsResponse that = (ListDirectConnectsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.directConnects, that.directConnects) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, directConnects, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectConnectsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    directConnects: ").append(toIndentedString(directConnects)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

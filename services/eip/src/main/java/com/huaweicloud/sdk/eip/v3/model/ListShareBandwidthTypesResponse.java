package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListShareBandwidthTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_bandwidth_types")

    private List<ShareBandwidthTypeShowResp> shareBandwidthTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoOption pageInfo;

    public ListShareBandwidthTypesResponse withShareBandwidthTypes(
        List<ShareBandwidthTypeShowResp> shareBandwidthTypes) {
        this.shareBandwidthTypes = shareBandwidthTypes;
        return this;
    }

    public ListShareBandwidthTypesResponse addShareBandwidthTypesItem(
        ShareBandwidthTypeShowResp shareBandwidthTypesItem) {
        if (this.shareBandwidthTypes == null) {
            this.shareBandwidthTypes = new ArrayList<>();
        }
        this.shareBandwidthTypes.add(shareBandwidthTypesItem);
        return this;
    }

    public ListShareBandwidthTypesResponse withShareBandwidthTypes(
        Consumer<List<ShareBandwidthTypeShowResp>> shareBandwidthTypesSetter) {
        if (this.shareBandwidthTypes == null) {
            this.shareBandwidthTypes = new ArrayList<>();
        }
        shareBandwidthTypesSetter.accept(this.shareBandwidthTypes);
        return this;
    }

    /** 功能说明：共享带宽类型对象
     * 
     * @return shareBandwidthTypes */
    public List<ShareBandwidthTypeShowResp> getShareBandwidthTypes() {
        return shareBandwidthTypes;
    }

    public void setShareBandwidthTypes(List<ShareBandwidthTypeShowResp> shareBandwidthTypes) {
        this.shareBandwidthTypes = shareBandwidthTypes;
    }

    public ListShareBandwidthTypesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 本次请求的编号
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListShareBandwidthTypesResponse withPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListShareBandwidthTypesResponse withPageInfo(Consumer<PageInfoOption> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoOption();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /** Get pageInfo
     * 
     * @return pageInfo */
    public PageInfoOption getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListShareBandwidthTypesResponse listShareBandwidthTypesResponse = (ListShareBandwidthTypesResponse) o;
        return Objects.equals(this.shareBandwidthTypes, listShareBandwidthTypesResponse.shareBandwidthTypes)
            && Objects.equals(this.requestId, listShareBandwidthTypesResponse.requestId)
            && Objects.equals(this.pageInfo, listShareBandwidthTypesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareBandwidthTypes, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareBandwidthTypesResponse {\n");
        sb.append("    shareBandwidthTypes: ").append(toIndentedString(shareBandwidthTypes)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

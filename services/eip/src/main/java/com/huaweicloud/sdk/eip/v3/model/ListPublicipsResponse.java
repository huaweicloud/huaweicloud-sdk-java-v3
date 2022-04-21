package com.huaweicloud.sdk.eip.v3.model;

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
public class ListPublicipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicipSingleShowResp> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoOption pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPublicipsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListPublicipsResponse withPublicips(List<PublicipSingleShowResp> publicips) {
        this.publicips = publicips;
        return this;
    }

    public ListPublicipsResponse addPublicipsItem(PublicipSingleShowResp publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public ListPublicipsResponse withPublicips(Consumer<List<PublicipSingleShowResp>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 功能说明：弹性公网IP对象
     * @return publicips
     */
    public List<PublicipSingleShowResp> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicipSingleShowResp> publicips) {
        this.publicips = publicips;
    }

    public ListPublicipsResponse withPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPublicipsResponse withPageInfo(Consumer<PageInfoOption> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoOption();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoOption getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListPublicipsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 公网IP总条目数
     * minimum: 0
     * maximum: 999999
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicipsResponse listPublicipsResponse = (ListPublicipsResponse) o;
        return Objects.equals(this.requestId, listPublicipsResponse.requestId)
            && Objects.equals(this.publicips, listPublicipsResponse.publicips)
            && Objects.equals(this.pageInfo, listPublicipsResponse.pageInfo)
            && Objects.equals(this.totalCount, listPublicipsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, publicips, pageInfo, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

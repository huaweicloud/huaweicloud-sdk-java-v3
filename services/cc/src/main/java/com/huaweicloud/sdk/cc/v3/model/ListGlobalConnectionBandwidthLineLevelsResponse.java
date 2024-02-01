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
public class ListGlobalConnectionBandwidthLineLevelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_levels")

    private List<GlobalConnectionBandwidthLineLevel> lineLevels = null;

    public ListGlobalConnectionBandwidthLineLevelsResponse withRequestId(String requestId) {
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

    public ListGlobalConnectionBandwidthLineLevelsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListGlobalConnectionBandwidthLineLevelsResponse withLineLevels(
        List<GlobalConnectionBandwidthLineLevel> lineLevels) {
        this.lineLevels = lineLevels;
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsResponse addLineLevelsItem(
        GlobalConnectionBandwidthLineLevel lineLevelsItem) {
        if (this.lineLevels == null) {
            this.lineLevels = new ArrayList<>();
        }
        this.lineLevels.add(lineLevelsItem);
        return this;
    }

    public ListGlobalConnectionBandwidthLineLevelsResponse withLineLevels(
        Consumer<List<GlobalConnectionBandwidthLineLevel>> lineLevelsSetter) {
        if (this.lineLevels == null) {
            this.lineLevels = new ArrayList<>();
        }
        lineLevelsSetter.accept(this.lineLevels);
        return this;
    }

    /**
     * 线路分级列表响应体。
     * @return lineLevels
     */
    public List<GlobalConnectionBandwidthLineLevel> getLineLevels() {
        return lineLevels;
    }

    public void setLineLevels(List<GlobalConnectionBandwidthLineLevel> lineLevels) {
        this.lineLevels = lineLevels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthLineLevelsResponse that = (ListGlobalConnectionBandwidthLineLevelsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.lineLevels, that.lineLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, lineLevels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthLineLevelsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    lineLevels: ").append(toIndentedString(lineLevels)).append("\n");
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

package com.huaweicloud.sdk.ga.v1.model;

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
public class ListLogtanksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtanks")

    private List<LogtankDetail> logtanks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListLogtanksResponse withLogtanks(List<LogtankDetail> logtanks) {
        this.logtanks = logtanks;
        return this;
    }

    public ListLogtanksResponse addLogtanksItem(LogtankDetail logtanksItem) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        this.logtanks.add(logtanksItem);
        return this;
    }

    public ListLogtanksResponse withLogtanks(Consumer<List<LogtankDetail>> logtanksSetter) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        logtanksSetter.accept(this.logtanks);
        return this;
    }

    /**
     * Get logtanks
     * @return logtanks
     */
    public List<LogtankDetail> getLogtanks() {
        return logtanks;
    }

    public void setLogtanks(List<LogtankDetail> logtanks) {
        this.logtanks = logtanks;
    }

    public ListLogtanksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListLogtanksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListLogtanksResponse withRequestId(String requestId) {
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
        ListLogtanksResponse that = (ListLogtanksResponse) obj;
        return Objects.equals(this.logtanks, that.logtanks) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtanks, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogtanksResponse {\n");
        sb.append("    logtanks: ").append(toIndentedString(logtanks)).append("\n");
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

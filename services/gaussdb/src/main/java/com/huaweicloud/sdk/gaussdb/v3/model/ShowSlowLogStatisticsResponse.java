package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowSlowLogStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_list")

    private List<ShowSlowLogStatisticsItem> slowLogList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowSlowLogStatisticsResponse withSlowLogList(List<ShowSlowLogStatisticsItem> slowLogList) {
        this.slowLogList = slowLogList;
        return this;
    }

    public ShowSlowLogStatisticsResponse addSlowLogListItem(ShowSlowLogStatisticsItem slowLogListItem) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        this.slowLogList.add(slowLogListItem);
        return this;
    }

    public ShowSlowLogStatisticsResponse withSlowLogList(Consumer<List<ShowSlowLogStatisticsItem>> slowLogListSetter) {
        if (this.slowLogList == null) {
            this.slowLogList = new ArrayList<>();
        }
        slowLogListSetter.accept(this.slowLogList);
        return this;
    }

    /**
     * 慢日志统计信息列表。
     * @return slowLogList
     */
    public List<ShowSlowLogStatisticsItem> getSlowLogList() {
        return slowLogList;
    }

    public void setSlowLogList(List<ShowSlowLogStatisticsItem> slowLogList) {
        this.slowLogList = slowLogList;
    }

    public ShowSlowLogStatisticsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogStatisticsResponse that = (ShowSlowLogStatisticsResponse) obj;
        return Objects.equals(this.slowLogList, that.slowLogList) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogStatisticsResponse {\n");
        sb.append("    slowLogList: ").append(toIndentedString(slowLogList)).append("\n");
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

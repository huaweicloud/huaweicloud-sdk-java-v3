package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListHistoryOnlineInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_counts")

    private List<String> timeCounts = null;

    public ListHistoryOnlineInfoResponse withTimeCounts(List<String> timeCounts) {
        this.timeCounts = timeCounts;
        return this;
    }

    public ListHistoryOnlineInfoResponse addTimeCountsItem(String timeCountsItem) {
        if (this.timeCounts == null) {
            this.timeCounts = new ArrayList<>();
        }
        this.timeCounts.add(timeCountsItem);
        return this;
    }

    public ListHistoryOnlineInfoResponse withTimeCounts(Consumer<List<String>> timeCountsSetter) {
        if (this.timeCounts == null) {
            this.timeCounts = new ArrayList<>();
        }
        timeCountsSetter.accept(this.timeCounts);
        return this;
    }

    /**
     * 返回前端历史登录信息。查询的时间和计数之间用冒号分隔。查询的时间，按Day查询或时间段在同一天时，按小时计数，其他场景为按天计数。
     * @return timeCounts
     */
    public List<String> getTimeCounts() {
        return timeCounts;
    }

    public void setTimeCounts(List<String> timeCounts) {
        this.timeCounts = timeCounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryOnlineInfoResponse that = (ListHistoryOnlineInfoResponse) obj;
        return Objects.equals(this.timeCounts, that.timeCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOnlineInfoResponse {\n");
        sb.append("    timeCounts: ").append(toIndentedString(timeCounts)).append("\n");
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

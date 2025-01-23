package com.huaweicloud.sdk.das.v3.model;

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
public class ListTopSlowLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_slow_log_list")

    private List<TopSlowLogTopSlowLogList> topSlowLogList = null;

    public ListTopSlowLogResponse withTopSlowLogList(List<TopSlowLogTopSlowLogList> topSlowLogList) {
        this.topSlowLogList = topSlowLogList;
        return this;
    }

    public ListTopSlowLogResponse addTopSlowLogListItem(TopSlowLogTopSlowLogList topSlowLogListItem) {
        if (this.topSlowLogList == null) {
            this.topSlowLogList = new ArrayList<>();
        }
        this.topSlowLogList.add(topSlowLogListItem);
        return this;
    }

    public ListTopSlowLogResponse withTopSlowLogList(Consumer<List<TopSlowLogTopSlowLogList>> topSlowLogListSetter) {
        if (this.topSlowLogList == null) {
            this.topSlowLogList = new ArrayList<>();
        }
        topSlowLogListSetter.accept(this.topSlowLogList);
        return this;
    }

    /**
     * TOP慢SQL列表
     * @return topSlowLogList
     */
    public List<TopSlowLogTopSlowLogList> getTopSlowLogList() {
        return topSlowLogList;
    }

    public void setTopSlowLogList(List<TopSlowLogTopSlowLogList> topSlowLogList) {
        this.topSlowLogList = topSlowLogList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopSlowLogResponse that = (ListTopSlowLogResponse) obj;
        return Objects.equals(this.topSlowLogList, that.topSlowLogList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topSlowLogList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopSlowLogResponse {\n");
        sb.append("    topSlowLogList: ").append(toIndentedString(topSlowLogList)).append("\n");
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

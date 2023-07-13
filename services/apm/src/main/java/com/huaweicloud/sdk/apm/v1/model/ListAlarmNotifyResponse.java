package com.huaweicloud.sdk.apm.v1.model;

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
public class ListAlarmNotifyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_alarm_notify_results")

    private List<FrontAlarmNotifyResult> frontAlarmNotifyResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAlarmNotifyResponse withFrontAlarmNotifyResults(List<FrontAlarmNotifyResult> frontAlarmNotifyResults) {
        this.frontAlarmNotifyResults = frontAlarmNotifyResults;
        return this;
    }

    public ListAlarmNotifyResponse addFrontAlarmNotifyResultsItem(FrontAlarmNotifyResult frontAlarmNotifyResultsItem) {
        if (this.frontAlarmNotifyResults == null) {
            this.frontAlarmNotifyResults = new ArrayList<>();
        }
        this.frontAlarmNotifyResults.add(frontAlarmNotifyResultsItem);
        return this;
    }

    public ListAlarmNotifyResponse withFrontAlarmNotifyResults(
        Consumer<List<FrontAlarmNotifyResult>> frontAlarmNotifyResultsSetter) {
        if (this.frontAlarmNotifyResults == null) {
            this.frontAlarmNotifyResults = new ArrayList<>();
        }
        frontAlarmNotifyResultsSetter.accept(this.frontAlarmNotifyResults);
        return this;
    }

    /**
     * 告警通知列表。
     * @return frontAlarmNotifyResults
     */
    public List<FrontAlarmNotifyResult> getFrontAlarmNotifyResults() {
        return frontAlarmNotifyResults;
    }

    public void setFrontAlarmNotifyResults(List<FrontAlarmNotifyResult> frontAlarmNotifyResults) {
        this.frontAlarmNotifyResults = frontAlarmNotifyResults;
    }

    public ListAlarmNotifyResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 消息总数。
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
        ListAlarmNotifyResponse that = (ListAlarmNotifyResponse) obj;
        return Objects.equals(this.frontAlarmNotifyResults, that.frontAlarmNotifyResults)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontAlarmNotifyResults, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmNotifyResponse {\n");
        sb.append("    frontAlarmNotifyResults: ").append(toIndentedString(frontAlarmNotifyResults)).append("\n");
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

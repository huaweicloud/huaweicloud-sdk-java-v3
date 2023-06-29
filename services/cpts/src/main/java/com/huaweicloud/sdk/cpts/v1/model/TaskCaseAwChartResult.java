package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskCaseAwChartResult
 */
public class TaskCaseAwChartResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broken_list")

    private BrokenList brokenList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_message")

    private String errMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resp_time_range")

    private Map<String, String> respTimeRange = null;

    public TaskCaseAwChartResult withBrokenList(BrokenList brokenList) {
        this.brokenList = brokenList;
        return this;
    }

    public TaskCaseAwChartResult withBrokenList(Consumer<BrokenList> brokenListSetter) {
        if (this.brokenList == null) {
            this.brokenList = new BrokenList();
            brokenListSetter.accept(this.brokenList);
        }

        return this;
    }

    /**
     * Get brokenList
     * @return brokenList
     */
    public BrokenList getBrokenList() {
        return brokenList;
    }

    public void setBrokenList(BrokenList brokenList) {
        this.brokenList = brokenList;
    }

    public TaskCaseAwChartResult withErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errMessage
     */
    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public TaskCaseAwChartResult withRespTimeRange(Map<String, String> respTimeRange) {
        this.respTimeRange = respTimeRange;
        return this;
    }

    public TaskCaseAwChartResult putRespTimeRangeItem(String key, String respTimeRangeItem) {
        if (this.respTimeRange == null) {
            this.respTimeRange = new HashMap<>();
        }
        this.respTimeRange.put(key, respTimeRangeItem);
        return this;
    }

    public TaskCaseAwChartResult withRespTimeRange(Consumer<Map<String, String>> respTimeRangeSetter) {
        if (this.respTimeRange == null) {
            this.respTimeRange = new HashMap<>();
        }
        respTimeRangeSetter.accept(this.respTimeRange);
        return this;
    }

    /**
     * 响应时间区间与出现次数的汇总信息
     * @return respTimeRange
     */
    public Map<String, String> getRespTimeRange() {
        return respTimeRange;
    }

    public void setRespTimeRange(Map<String, String> respTimeRange) {
        this.respTimeRange = respTimeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskCaseAwChartResult that = (TaskCaseAwChartResult) obj;
        return Objects.equals(this.brokenList, that.brokenList) && Objects.equals(this.errMessage, that.errMessage)
            && Objects.equals(this.respTimeRange, that.respTimeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokenList, errMessage, respTimeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCaseAwChartResult {\n");
        sb.append("    brokenList: ").append(toIndentedString(brokenList)).append("\n");
        sb.append("    errMessage: ").append(toIndentedString(errMessage)).append("\n");
        sb.append("    respTimeRange: ").append(toIndentedString(respTimeRange)).append("\n");
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

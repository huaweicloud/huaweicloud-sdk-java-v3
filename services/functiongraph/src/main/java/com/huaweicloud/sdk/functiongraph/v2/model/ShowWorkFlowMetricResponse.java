package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ShowWorkFlowMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private List<SlaReportsValue> count = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private List<SlaReportsValue> duration = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_count")

    private List<SlaReportsValue> failCount = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private List<SlaReportsValue> runningCount = null;

    public ShowWorkFlowMetricResponse withCount(List<SlaReportsValue> count) {
        this.count = count;
        return this;
    }

    public ShowWorkFlowMetricResponse addCountItem(SlaReportsValue countItem) {
        if (this.count == null) {
            this.count = new ArrayList<>();
        }
        this.count.add(countItem);
        return this;
    }

    public ShowWorkFlowMetricResponse withCount(Consumer<List<SlaReportsValue>> countSetter) {
        if (this.count == null) {
            this.count = new ArrayList<>();
        }
        countSetter.accept(this.count);
        return this;
    }

    /**
     * 执行次数
     * @return count
     */
    public List<SlaReportsValue> getCount() {
        return count;
    }

    public void setCount(List<SlaReportsValue> count) {
        this.count = count;
    }

    public ShowWorkFlowMetricResponse withDuration(List<SlaReportsValue> duration) {
        this.duration = duration;
        return this;
    }

    public ShowWorkFlowMetricResponse addDurationItem(SlaReportsValue durationItem) {
        if (this.duration == null) {
            this.duration = new ArrayList<>();
        }
        this.duration.add(durationItem);
        return this;
    }

    public ShowWorkFlowMetricResponse withDuration(Consumer<List<SlaReportsValue>> durationSetter) {
        if (this.duration == null) {
            this.duration = new ArrayList<>();
        }
        durationSetter.accept(this.duration);
        return this;
    }

    /**
     * 平均时延，单位毫秒
     * @return duration
     */
    public List<SlaReportsValue> getDuration() {
        return duration;
    }

    public void setDuration(List<SlaReportsValue> duration) {
        this.duration = duration;
    }

    public ShowWorkFlowMetricResponse withFailCount(List<SlaReportsValue> failCount) {
        this.failCount = failCount;
        return this;
    }

    public ShowWorkFlowMetricResponse addFailCountItem(SlaReportsValue failCountItem) {
        if (this.failCount == null) {
            this.failCount = new ArrayList<>();
        }
        this.failCount.add(failCountItem);
        return this;
    }

    public ShowWorkFlowMetricResponse withFailCount(Consumer<List<SlaReportsValue>> failCountSetter) {
        if (this.failCount == null) {
            this.failCount = new ArrayList<>();
        }
        failCountSetter.accept(this.failCount);
        return this;
    }

    /**
     * 错误次数
     * @return failCount
     */
    public List<SlaReportsValue> getFailCount() {
        return failCount;
    }

    public void setFailCount(List<SlaReportsValue> failCount) {
        this.failCount = failCount;
    }

    public ShowWorkFlowMetricResponse withRunningCount(List<SlaReportsValue> runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    public ShowWorkFlowMetricResponse addRunningCountItem(SlaReportsValue runningCountItem) {
        if (this.runningCount == null) {
            this.runningCount = new ArrayList<>();
        }
        this.runningCount.add(runningCountItem);
        return this;
    }

    public ShowWorkFlowMetricResponse withRunningCount(Consumer<List<SlaReportsValue>> runningCountSetter) {
        if (this.runningCount == null) {
            this.runningCount = new ArrayList<>();
        }
        runningCountSetter.accept(this.runningCount);
        return this;
    }

    /**
     * 运行中数量
     * @return runningCount
     */
    public List<SlaReportsValue> getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(List<SlaReportsValue> runningCount) {
        this.runningCount = runningCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkFlowMetricResponse showWorkFlowMetricResponse = (ShowWorkFlowMetricResponse) o;
        return Objects.equals(this.count, showWorkFlowMetricResponse.count)
            && Objects.equals(this.duration, showWorkFlowMetricResponse.duration)
            && Objects.equals(this.failCount, showWorkFlowMetricResponse.failCount)
            && Objects.equals(this.runningCount, showWorkFlowMetricResponse.runningCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, duration, failCount, runningCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkFlowMetricResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
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

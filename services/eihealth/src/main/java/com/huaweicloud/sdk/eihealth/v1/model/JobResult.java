package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业运行结果信息
 */
public class JobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tasks_duration")

    private List<Float> subTasksDuration = null;

    public JobResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 输入总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public JobResult withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败个数
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public JobResult withSubTasksDuration(List<Float> subTasksDuration) {
        this.subTasksDuration = subTasksDuration;
        return this;
    }

    public JobResult addSubTasksDurationItem(Float subTasksDurationItem) {
        if (this.subTasksDuration == null) {
            this.subTasksDuration = new ArrayList<>();
        }
        this.subTasksDuration.add(subTasksDurationItem);
        return this;
    }

    public JobResult withSubTasksDuration(Consumer<List<Float>> subTasksDurationSetter) {
        if (this.subTasksDuration == null) {
            this.subTasksDuration = new ArrayList<>();
        }
        subTasksDurationSetter.accept(this.subTasksDuration);
        return this;
    }

    /**
     * 子任务运行时长（秒）。
     * @return subTasksDuration
     */
    public List<Float> getSubTasksDuration() {
        return subTasksDuration;
    }

    public void setSubTasksDuration(List<Float> subTasksDuration) {
        this.subTasksDuration = subTasksDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResult that = (JobResult) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.subTasksDuration, that.subTasksDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, failedCount, subTasksDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResult {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    subTasksDuration: ").append(toIndentedString(subTasksDuration)).append("\n");
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

package com.huaweicloud.sdk.functiongraph.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.SlaReportsValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 函数指标
 */
public class ListFunctionStatisticsResponseBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private List<SlaReportsValue> count = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private List<SlaReportsValue> duration = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_count")
    
    private List<SlaReportsValue> failCount = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_duration")
    
    private List<SlaReportsValue> maxDuration = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_duration")
    
    private List<SlaReportsValue> minDuration = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reject_count")
    
    private List<SlaReportsValue> rejectCount = null;
    
    public ListFunctionStatisticsResponseBody withCount(List<SlaReportsValue> count) {
        this.count = count;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addCountItem(SlaReportsValue countItem) {
        if(this.count == null) {
            this.count = new ArrayList<>();
        }
        this.count.add(countItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withCount(Consumer<List<SlaReportsValue>> countSetter) {
        if(this.count == null) {
            this.count = new ArrayList<>();
        }
        countSetter.accept(this.count);
        return this;
    }

    /**
     * 调用次数
     * @return count
     */
    public List<SlaReportsValue> getCount() {
        return count;
    }

    public void setCount(List<SlaReportsValue> count) {
        this.count = count;
    }

    

    public ListFunctionStatisticsResponseBody withDuration(List<SlaReportsValue> duration) {
        this.duration = duration;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addDurationItem(SlaReportsValue durationItem) {
        if(this.duration == null) {
            this.duration = new ArrayList<>();
        }
        this.duration.add(durationItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withDuration(Consumer<List<SlaReportsValue>> durationSetter) {
        if(this.duration == null) {
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

    

    public ListFunctionStatisticsResponseBody withFailCount(List<SlaReportsValue> failCount) {
        this.failCount = failCount;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addFailCountItem(SlaReportsValue failCountItem) {
        if(this.failCount == null) {
            this.failCount = new ArrayList<>();
        }
        this.failCount.add(failCountItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withFailCount(Consumer<List<SlaReportsValue>> failCountSetter) {
        if(this.failCount == null) {
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

    

    public ListFunctionStatisticsResponseBody withMaxDuration(List<SlaReportsValue> maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addMaxDurationItem(SlaReportsValue maxDurationItem) {
        if(this.maxDuration == null) {
            this.maxDuration = new ArrayList<>();
        }
        this.maxDuration.add(maxDurationItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withMaxDuration(Consumer<List<SlaReportsValue>> maxDurationSetter) {
        if(this.maxDuration == null) {
            this.maxDuration = new ArrayList<>();
        }
        maxDurationSetter.accept(this.maxDuration);
        return this;
    }

    /**
     * 最大时延，单位毫秒
     * @return maxDuration
     */
    public List<SlaReportsValue> getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(List<SlaReportsValue> maxDuration) {
        this.maxDuration = maxDuration;
    }

    

    public ListFunctionStatisticsResponseBody withMinDuration(List<SlaReportsValue> minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addMinDurationItem(SlaReportsValue minDurationItem) {
        if(this.minDuration == null) {
            this.minDuration = new ArrayList<>();
        }
        this.minDuration.add(minDurationItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withMinDuration(Consumer<List<SlaReportsValue>> minDurationSetter) {
        if(this.minDuration == null) {
            this.minDuration = new ArrayList<>();
        }
        minDurationSetter.accept(this.minDuration);
        return this;
    }

    /**
     * 最小时延，单位毫秒
     * @return minDuration
     */
    public List<SlaReportsValue> getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(List<SlaReportsValue> minDuration) {
        this.minDuration = minDuration;
    }

    

    public ListFunctionStatisticsResponseBody withRejectCount(List<SlaReportsValue> rejectCount) {
        this.rejectCount = rejectCount;
        return this;
    }

    
    public ListFunctionStatisticsResponseBody addRejectCountItem(SlaReportsValue rejectCountItem) {
        if(this.rejectCount == null) {
            this.rejectCount = new ArrayList<>();
        }
        this.rejectCount.add(rejectCountItem);
        return this;
    }

    public ListFunctionStatisticsResponseBody withRejectCount(Consumer<List<SlaReportsValue>> rejectCountSetter) {
        if(this.rejectCount == null) {
            this.rejectCount = new ArrayList<>();
        }
        rejectCountSetter.accept(this.rejectCount);
        return this;
    }

    /**
     * 被拒绝次数
     * @return rejectCount
     */
    public List<SlaReportsValue> getRejectCount() {
        return rejectCount;
    }

    public void setRejectCount(List<SlaReportsValue> rejectCount) {
        this.rejectCount = rejectCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionStatisticsResponseBody listFunctionStatisticsResponseBody = (ListFunctionStatisticsResponseBody) o;
        return Objects.equals(this.count, listFunctionStatisticsResponseBody.count) &&
            Objects.equals(this.duration, listFunctionStatisticsResponseBody.duration) &&
            Objects.equals(this.failCount, listFunctionStatisticsResponseBody.failCount) &&
            Objects.equals(this.maxDuration, listFunctionStatisticsResponseBody.maxDuration) &&
            Objects.equals(this.minDuration, listFunctionStatisticsResponseBody.minDuration) &&
            Objects.equals(this.rejectCount, listFunctionStatisticsResponseBody.rejectCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, duration, failCount, maxDuration, minDuration, rejectCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionStatisticsResponseBody {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
        sb.append("    minDuration: ").append(toIndentedString(minDuration)).append("\n");
        sb.append("    rejectCount: ").append(toIndentedString(rejectCount)).append("\n");
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


package com.huaweicloud.sdk.functiongraph.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


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
 * Response Object
 */
public class ListFunctionStatisticsResponse extends SdkResponse {



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
    
    public ListFunctionStatisticsResponse withCount(List<SlaReportsValue> count) {
        this.count = count;
        return this;
    }

    
    public ListFunctionStatisticsResponse addCountItem(SlaReportsValue countItem) {
        if (this.count == null) {
            this.count = new ArrayList<>();
        }
        this.count.add(countItem);
        return this;
    }

    public ListFunctionStatisticsResponse withCount(Consumer<List<SlaReportsValue>> countSetter) {
        if(this.count == null ){
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

    public ListFunctionStatisticsResponse withDuration(List<SlaReportsValue> duration) {
        this.duration = duration;
        return this;
    }

    
    public ListFunctionStatisticsResponse addDurationItem(SlaReportsValue durationItem) {
        if (this.duration == null) {
            this.duration = new ArrayList<>();
        }
        this.duration.add(durationItem);
        return this;
    }

    public ListFunctionStatisticsResponse withDuration(Consumer<List<SlaReportsValue>> durationSetter) {
        if(this.duration == null ){
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

    public ListFunctionStatisticsResponse withFailCount(List<SlaReportsValue> failCount) {
        this.failCount = failCount;
        return this;
    }

    
    public ListFunctionStatisticsResponse addFailCountItem(SlaReportsValue failCountItem) {
        if (this.failCount == null) {
            this.failCount = new ArrayList<>();
        }
        this.failCount.add(failCountItem);
        return this;
    }

    public ListFunctionStatisticsResponse withFailCount(Consumer<List<SlaReportsValue>> failCountSetter) {
        if(this.failCount == null ){
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

    public ListFunctionStatisticsResponse withMaxDuration(List<SlaReportsValue> maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    
    public ListFunctionStatisticsResponse addMaxDurationItem(SlaReportsValue maxDurationItem) {
        if (this.maxDuration == null) {
            this.maxDuration = new ArrayList<>();
        }
        this.maxDuration.add(maxDurationItem);
        return this;
    }

    public ListFunctionStatisticsResponse withMaxDuration(Consumer<List<SlaReportsValue>> maxDurationSetter) {
        if(this.maxDuration == null ){
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

    public ListFunctionStatisticsResponse withMinDuration(List<SlaReportsValue> minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    
    public ListFunctionStatisticsResponse addMinDurationItem(SlaReportsValue minDurationItem) {
        if (this.minDuration == null) {
            this.minDuration = new ArrayList<>();
        }
        this.minDuration.add(minDurationItem);
        return this;
    }

    public ListFunctionStatisticsResponse withMinDuration(Consumer<List<SlaReportsValue>> minDurationSetter) {
        if(this.minDuration == null ){
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

    public ListFunctionStatisticsResponse withRejectCount(List<SlaReportsValue> rejectCount) {
        this.rejectCount = rejectCount;
        return this;
    }

    
    public ListFunctionStatisticsResponse addRejectCountItem(SlaReportsValue rejectCountItem) {
        if (this.rejectCount == null) {
            this.rejectCount = new ArrayList<>();
        }
        this.rejectCount.add(rejectCountItem);
        return this;
    }

    public ListFunctionStatisticsResponse withRejectCount(Consumer<List<SlaReportsValue>> rejectCountSetter) {
        if(this.rejectCount == null ){
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
        ListFunctionStatisticsResponse listFunctionStatisticsResponse = (ListFunctionStatisticsResponse) o;
        return Objects.equals(this.count, listFunctionStatisticsResponse.count) &&
            Objects.equals(this.duration, listFunctionStatisticsResponse.duration) &&
            Objects.equals(this.failCount, listFunctionStatisticsResponse.failCount) &&
            Objects.equals(this.maxDuration, listFunctionStatisticsResponse.maxDuration) &&
            Objects.equals(this.minDuration, listFunctionStatisticsResponse.minDuration) &&
            Objects.equals(this.rejectCount, listFunctionStatisticsResponse.rejectCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, duration, failCount, maxDuration, minDuration, rejectCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionStatisticsResponse {\n");
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


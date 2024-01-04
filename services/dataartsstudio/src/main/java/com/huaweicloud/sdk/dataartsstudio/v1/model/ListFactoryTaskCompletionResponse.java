package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactoryTaskCompletionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yesterday")

    private List<ListFactoryTaskCompletionResYesterday> yesterday = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private List<ListFactoryTaskCompletionResAverage> average = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today")

    private List<ListFactoryTaskCompletionResToday> today = null;

    public ListFactoryTaskCompletionResponse withYesterday(List<ListFactoryTaskCompletionResYesterday> yesterday) {
        this.yesterday = yesterday;
        return this;
    }

    public ListFactoryTaskCompletionResponse addYesterdayItem(ListFactoryTaskCompletionResYesterday yesterdayItem) {
        if (this.yesterday == null) {
            this.yesterday = new ArrayList<>();
        }
        this.yesterday.add(yesterdayItem);
        return this;
    }

    public ListFactoryTaskCompletionResponse withYesterday(
        Consumer<List<ListFactoryTaskCompletionResYesterday>> yesterdaySetter) {
        if (this.yesterday == null) {
            this.yesterday = new ArrayList<>();
        }
        yesterdaySetter.accept(this.yesterday);
        return this;
    }

    /**
     * 昨天的任务信息
     * @return yesterday
     */
    public List<ListFactoryTaskCompletionResYesterday> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<ListFactoryTaskCompletionResYesterday> yesterday) {
        this.yesterday = yesterday;
    }

    public ListFactoryTaskCompletionResponse withAverage(List<ListFactoryTaskCompletionResAverage> average) {
        this.average = average;
        return this;
    }

    public ListFactoryTaskCompletionResponse addAverageItem(ListFactoryTaskCompletionResAverage averageItem) {
        if (this.average == null) {
            this.average = new ArrayList<>();
        }
        this.average.add(averageItem);
        return this;
    }

    public ListFactoryTaskCompletionResponse withAverage(
        Consumer<List<ListFactoryTaskCompletionResAverage>> averageSetter) {
        if (this.average == null) {
            this.average = new ArrayList<>();
        }
        averageSetter.accept(this.average);
        return this;
    }

    /**
     * 近7天的平均任务信息
     * @return average
     */
    public List<ListFactoryTaskCompletionResAverage> getAverage() {
        return average;
    }

    public void setAverage(List<ListFactoryTaskCompletionResAverage> average) {
        this.average = average;
    }

    public ListFactoryTaskCompletionResponse withToday(List<ListFactoryTaskCompletionResToday> today) {
        this.today = today;
        return this;
    }

    public ListFactoryTaskCompletionResponse addTodayItem(ListFactoryTaskCompletionResToday todayItem) {
        if (this.today == null) {
            this.today = new ArrayList<>();
        }
        this.today.add(todayItem);
        return this;
    }

    public ListFactoryTaskCompletionResponse withToday(Consumer<List<ListFactoryTaskCompletionResToday>> todaySetter) {
        if (this.today == null) {
            this.today = new ArrayList<>();
        }
        todaySetter.accept(this.today);
        return this;
    }

    /**
     * 当天的任务信息
     * @return today
     */
    public List<ListFactoryTaskCompletionResToday> getToday() {
        return today;
    }

    public void setToday(List<ListFactoryTaskCompletionResToday> today) {
        this.today = today;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryTaskCompletionResponse that = (ListFactoryTaskCompletionResponse) obj;
        return Objects.equals(this.yesterday, that.yesterday) && Objects.equals(this.average, that.average)
            && Objects.equals(this.today, that.today);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yesterday, average, today);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryTaskCompletionResponse {\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    today: ").append(toIndentedString(today)).append("\n");
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

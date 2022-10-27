package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListRestoreTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restorable_time_periods")

    private List<RestorableTime> restorableTimePeriods = null;

    public ListRestoreTimeResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 实例可恢复时间段总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListRestoreTimeResponse withRestorableTimePeriods(List<RestorableTime> restorableTimePeriods) {
        this.restorableTimePeriods = restorableTimePeriods;
        return this;
    }

    public ListRestoreTimeResponse addRestorableTimePeriodsItem(RestorableTime restorableTimePeriodsItem) {
        if (this.restorableTimePeriods == null) {
            this.restorableTimePeriods = new ArrayList<>();
        }
        this.restorableTimePeriods.add(restorableTimePeriodsItem);
        return this;
    }

    public ListRestoreTimeResponse withRestorableTimePeriods(
        Consumer<List<RestorableTime>> restorableTimePeriodsSetter) {
        if (this.restorableTimePeriods == null) {
            this.restorableTimePeriods = new ArrayList<>();
        }
        restorableTimePeriodsSetter.accept(this.restorableTimePeriods);
        return this;
    }

    /**
     * 实例可恢复的时间段
     * @return restorableTimePeriods
     */
    public List<RestorableTime> getRestorableTimePeriods() {
        return restorableTimePeriods;
    }

    public void setRestorableTimePeriods(List<RestorableTime> restorableTimePeriods) {
        this.restorableTimePeriods = restorableTimePeriods;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRestoreTimeResponse listRestoreTimeResponse = (ListRestoreTimeResponse) o;
        return Objects.equals(this.totalCount, listRestoreTimeResponse.totalCount)
            && Objects.equals(this.restorableTimePeriods, listRestoreTimeResponse.restorableTimePeriods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, restorableTimePeriods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreTimeResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    restorableTimePeriods: ").append(toIndentedString(restorableTimePeriods)).append("\n");
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

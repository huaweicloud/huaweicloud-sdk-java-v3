package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowAvalibleTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restorable_time_intervals")

    private List<RestoreTimeInterval> restorableTimeIntervals = null;

    public ShowAvalibleTimeResponse withRestorableTimeIntervals(List<RestoreTimeInterval> restorableTimeIntervals) {
        this.restorableTimeIntervals = restorableTimeIntervals;
        return this;
    }

    public ShowAvalibleTimeResponse addRestorableTimeIntervalsItem(RestoreTimeInterval restorableTimeIntervalsItem) {
        if (this.restorableTimeIntervals == null) {
            this.restorableTimeIntervals = new ArrayList<>();
        }
        this.restorableTimeIntervals.add(restorableTimeIntervalsItem);
        return this;
    }

    public ShowAvalibleTimeResponse withRestorableTimeIntervals(
        Consumer<List<RestoreTimeInterval>> restorableTimeIntervalsSetter) {
        if (this.restorableTimeIntervals == null) {
            this.restorableTimeIntervals = new ArrayList<>();
        }
        restorableTimeIntervalsSetter.accept(this.restorableTimeIntervals);
        return this;
    }

    /**
     * 可恢复时间点。
     * @return restorableTimeIntervals
     */
    public List<RestoreTimeInterval> getRestorableTimeIntervals() {
        return restorableTimeIntervals;
    }

    public void setRestorableTimeIntervals(List<RestoreTimeInterval> restorableTimeIntervals) {
        this.restorableTimeIntervals = restorableTimeIntervals;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvalibleTimeResponse that = (ShowAvalibleTimeResponse) obj;
        return Objects.equals(this.restorableTimeIntervals, that.restorableTimeIntervals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restorableTimeIntervals);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvalibleTimeResponse {\n");
        sb.append("    restorableTimeIntervals: ").append(toIndentedString(restorableTimeIntervals)).append("\n");
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

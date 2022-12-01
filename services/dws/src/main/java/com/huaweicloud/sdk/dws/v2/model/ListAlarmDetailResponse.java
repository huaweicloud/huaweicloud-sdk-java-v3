package com.huaweicloud.sdk.dws.v2.model;

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
public class ListAlarmDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_details")

    private List<AlarmDetailResponse> alarmDetails = null;

    public ListAlarmDetailResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警详情总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAlarmDetailResponse withAlarmDetails(List<AlarmDetailResponse> alarmDetails) {
        this.alarmDetails = alarmDetails;
        return this;
    }

    public ListAlarmDetailResponse addAlarmDetailsItem(AlarmDetailResponse alarmDetailsItem) {
        if (this.alarmDetails == null) {
            this.alarmDetails = new ArrayList<>();
        }
        this.alarmDetails.add(alarmDetailsItem);
        return this;
    }

    public ListAlarmDetailResponse withAlarmDetails(Consumer<List<AlarmDetailResponse>> alarmDetailsSetter) {
        if (this.alarmDetails == null) {
            this.alarmDetails = new ArrayList<>();
        }
        alarmDetailsSetter.accept(this.alarmDetails);
        return this;
    }

    /**
     * 告警列表
     * @return alarmDetails
     */
    public List<AlarmDetailResponse> getAlarmDetails() {
        return alarmDetails;
    }

    public void setAlarmDetails(List<AlarmDetailResponse> alarmDetails) {
        this.alarmDetails = alarmDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmDetailResponse listAlarmDetailResponse = (ListAlarmDetailResponse) o;
        return Objects.equals(this.count, listAlarmDetailResponse.count)
            && Objects.equals(this.alarmDetails, listAlarmDetailResponse.alarmDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, alarmDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmDetailResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    alarmDetails: ").append(toIndentedString(alarmDetails)).append("\n");
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

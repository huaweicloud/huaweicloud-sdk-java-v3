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
public class ListFactoryAlarmInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_info")

    private List<AlarmInfoResponseAlarmInfo> alarmInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListFactoryAlarmInfoResponse withAlarmInfo(List<AlarmInfoResponseAlarmInfo> alarmInfo) {
        this.alarmInfo = alarmInfo;
        return this;
    }

    public ListFactoryAlarmInfoResponse addAlarmInfoItem(AlarmInfoResponseAlarmInfo alarmInfoItem) {
        if (this.alarmInfo == null) {
            this.alarmInfo = new ArrayList<>();
        }
        this.alarmInfo.add(alarmInfoItem);
        return this;
    }

    public ListFactoryAlarmInfoResponse withAlarmInfo(Consumer<List<AlarmInfoResponseAlarmInfo>> alarmInfoSetter) {
        if (this.alarmInfo == null) {
            this.alarmInfo = new ArrayList<>();
        }
        alarmInfoSetter.accept(this.alarmInfo);
        return this;
    }

    /**
     * 通知记录信息
     * @return alarmInfo
     */
    public List<AlarmInfoResponseAlarmInfo> getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(List<AlarmInfoResponseAlarmInfo> alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    public ListFactoryAlarmInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 通知记录数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryAlarmInfoResponse that = (ListFactoryAlarmInfoResponse) obj;
        return Objects.equals(this.alarmInfo, that.alarmInfo) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmInfo, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryAlarmInfoResponse {\n");
        sb.append("    alarmInfo: ").append(toIndentedString(alarmInfo)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

package com.huaweicloud.sdk.hilens.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDeviceAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<GetDeviceAlarmArrayObject> data = null;

    public ListDeviceAlarmsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 满足条件的设备告警总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDeviceAlarmsResponse withData(List<GetDeviceAlarmArrayObject> data) {
        this.data = data;
        return this;
    }

    public ListDeviceAlarmsResponse addDataItem(GetDeviceAlarmArrayObject dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListDeviceAlarmsResponse withData(Consumer<List<GetDeviceAlarmArrayObject>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** Get data
     * 
     * @return data */
    public List<GetDeviceAlarmArrayObject> getData() {
        return data;
    }

    public void setData(List<GetDeviceAlarmArrayObject> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceAlarmsResponse listDeviceAlarmsResponse = (ListDeviceAlarmsResponse) o;
        return Objects.equals(this.total, listDeviceAlarmsResponse.total)
            && Objects.equals(this.data, listDeviceAlarmsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceAlarmsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

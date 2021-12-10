package com.huaweicloud.sdk.hilens.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListDeviceAlarmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    public ListDeviceAlarmsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的起始位置，取值范围为非负整数，默认为0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDeviceAlarmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，取值范围1~100，默认为100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDeviceAlarmsRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID
     * 
     * @return deviceId */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceAlarmsRequest listDeviceAlarmsRequest = (ListDeviceAlarmsRequest) o;
        return Objects.equals(this.offset, listDeviceAlarmsRequest.offset)
            && Objects.equals(this.limit, listDeviceAlarmsRequest.limit)
            && Objects.equals(this.deviceId, listDeviceAlarmsRequest.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, deviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceAlarmsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

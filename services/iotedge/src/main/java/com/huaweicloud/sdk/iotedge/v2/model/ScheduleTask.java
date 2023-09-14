package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调度计划结构体
 */
public class ScheduleTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ids")

    private List<String> deviceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paras")

    private Object paras;

    public ScheduleTask withDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }

    public ScheduleTask addDeviceIdsItem(String deviceIdsItem) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public ScheduleTask withDeviceIds(Consumer<List<String>> deviceIdsSetter) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        deviceIdsSetter.accept(this.deviceIds);
        return this;
    }

    /**
     * 设备id数组
     * @return deviceIds
     */
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    public ScheduleTask withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 任务执行的动作，当前支持SetProperties
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ScheduleTask withParas(Object paras) {
        this.paras = paras;
        return this;
    }

    /**
     * 对应action的参数
     * @return paras
     */
    public Object getParas() {
        return paras;
    }

    public void setParas(Object paras) {
        this.paras = paras;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleTask that = (ScheduleTask) obj;
        return Objects.equals(this.deviceIds, that.deviceIds) && Objects.equals(this.action, that.action)
            && Objects.equals(this.paras, that.paras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceIds, action, paras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleTask {\n");
        sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
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

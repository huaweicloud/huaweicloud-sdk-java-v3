package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventResponseExecuteOptions
 */
public class EventResponseExecuteOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wwn")

    private String wwn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_target_flavor_id")

    private String resizeTargetFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_policy")

    private String migratePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    public EventResponseExecuteOptions withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 本地盘设备名
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public EventResponseExecuteOptions withWwn(String wwn) {
        this.wwn = wwn;
        return this;
    }

    /**
     * 本地盘挂载唯一标识
     * @return wwn
     */
    public String getWwn() {
        return wwn;
    }

    public void setWwn(String wwn) {
        this.wwn = wwn;
    }

    public EventResponseExecuteOptions withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 本地盘序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public EventResponseExecuteOptions withResizeTargetFlavorId(String resizeTargetFlavorId) {
        this.resizeTargetFlavorId = resizeTargetFlavorId;
        return this;
    }

    /**
     * flavorID
     * @return resizeTargetFlavorId
     */
    public String getResizeTargetFlavorId() {
        return resizeTargetFlavorId;
    }

    public void setResizeTargetFlavorId(String resizeTargetFlavorId) {
        this.resizeTargetFlavorId = resizeTargetFlavorId;
    }

    public EventResponseExecuteOptions withMigratePolicy(String migratePolicy) {
        this.migratePolicy = migratePolicy;
        return this;
    }

    /**
     * 实例迁移策略
     * @return migratePolicy
     */
    public String getMigratePolicy() {
        return migratePolicy;
    }

    public void setMigratePolicy(String migratePolicy) {
        this.migratePolicy = migratePolicy;
    }

    public EventResponseExecuteOptions withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行器
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventResponseExecuteOptions that = (EventResponseExecuteOptions) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.wwn, that.wwn)
            && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.resizeTargetFlavorId, that.resizeTargetFlavorId)
            && Objects.equals(this.migratePolicy, that.migratePolicy) && Objects.equals(this.executor, that.executor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, wwn, serialNumber, resizeTargetFlavorId, migratePolicy, executor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventResponseExecuteOptions {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    wwn: ").append(toIndentedString(wwn)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    resizeTargetFlavorId: ").append(toIndentedString(resizeTargetFlavorId)).append("\n");
        sb.append("    migratePolicy: ").append(toIndentedString(migratePolicy)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
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

package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AsyncDeviceListCommand
 */
public class AsyncDeviceListCommand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_id")

    private String commandId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Integer expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sent_time")

    private String sentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delivered_time")

    private String deliveredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_strategy")

    private String sendStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private String responseTime;

    public AsyncDeviceListCommand withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID，用于唯一标识一个设备，在注册设备时由物联网平台分配获得。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public AsyncDeviceListCommand withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * 设备命令ID，用于唯一标识一条命令，在下发设备命令时由物联网平台分配获得。
     * @return commandId
     */
    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public AsyncDeviceListCommand withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 设备命令所属的设备服务ID，在设备关联的产品模型中定义。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public AsyncDeviceListCommand withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * 设备命令名称，在设备关联的产品模型中定义。
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public AsyncDeviceListCommand withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 物联网平台缓存命令的时长， 单位秒。
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public AsyncDeviceListCommand withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 下发命令的状态。 ·PENDING表示未下发,在物联网平台缓存着 ·EXPIRED表示命令已经过期，即缓存的时间超过设定的expire_time ·SENT表示命令正在下发 ·DELIVERED表示命令已送达设备 ·SUCCESSFUL表示命令已经成功执行 ·FAILED表示命令执行失败 ·TIMEOUT表示命令下发之后，没有收到设备确认或者响应结果一定时间后超时 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AsyncDeviceListCommand withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 命令的创建时间，\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public AsyncDeviceListCommand withSentTime(String sentTime) {
        this.sentTime = sentTime;
        return this;
    }

    /**
     * 物联网平台发送命令的时间，如果命令是立即下发， 则该时间与命令创建时间一致， 如果是缓存命令， 则是命令实际下发的时间。\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return sentTime
     */
    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public AsyncDeviceListCommand withDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
        return this;
    }

    /**
     * 物联网平台将命令送达到设备的时间，\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return deliveredTime
     */
    public String getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public AsyncDeviceListCommand withSendStrategy(String sendStrategy) {
        this.sendStrategy = sendStrategy;
        return this;
    }

    /**
     * 下发策略， immediately表示立即下发，delay表示缓存起来，等数据上报或者设备上线之后下发。
     * @return sendStrategy
     */
    public String getSendStrategy() {
        return sendStrategy;
    }

    public void setSendStrategy(String sendStrategy) {
        this.sendStrategy = sendStrategy;
    }

    public AsyncDeviceListCommand withResponseTime(String responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 设备响应命令的时间，\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return responseTime
     */
    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncDeviceListCommand that = (AsyncDeviceListCommand) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.commandId, that.commandId)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.commandName, that.commandName)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.sentTime, that.sentTime)
            && Objects.equals(this.deliveredTime, that.deliveredTime)
            && Objects.equals(this.sendStrategy, that.sendStrategy)
            && Objects.equals(this.responseTime, that.responseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId,
            commandId,
            serviceId,
            commandName,
            expireTime,
            status,
            createdTime,
            sentTime,
            deliveredTime,
            sendStrategy,
            responseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncDeviceListCommand {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
        sb.append("    deliveredTime: ").append(toIndentedString(deliveredTime)).append("\n");
        sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
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

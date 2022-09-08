package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAsyncCommandResponse extends SdkResponse {

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
    @JsonProperty(value = "paras")

    private Object paras;

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
    @JsonProperty(value = "send_strategy")

    private String sendStrategy;

    public CreateAsyncCommandResponse withDeviceId(String deviceId) {
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

    public CreateAsyncCommandResponse withCommandId(String commandId) {
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

    public CreateAsyncCommandResponse withServiceId(String serviceId) {
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

    public CreateAsyncCommandResponse withCommandName(String commandName) {
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

    public CreateAsyncCommandResponse withParas(Object paras) {
        this.paras = paras;
        return this;
    }

    /**
     * 设备执行的命令，Json格式，里面是一个个健值对，如果service_id不为空，每个健都是profile中命令的参数名（paraName）;如果service_id为空则由用户自定义命令格式。设备命令示例：{\"value\":\"1\"}，具体格式需要应用和设备约定。 
     * @return paras
     */
    public Object getParas() {
        return paras;
    }

    public void setParas(Object paras) {
        this.paras = paras;
    }

    public CreateAsyncCommandResponse withExpireTime(Integer expireTime) {
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

    public CreateAsyncCommandResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 设备命令状态,如果命令被缓存，返回PENDING, 如果命令下发给设备，返回SENT。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateAsyncCommandResponse withCreatedTime(String createdTime) {
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

    public CreateAsyncCommandResponse withSendStrategy(String sendStrategy) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAsyncCommandResponse createAsyncCommandResponse = (CreateAsyncCommandResponse) o;
        return Objects.equals(this.deviceId, createAsyncCommandResponse.deviceId)
            && Objects.equals(this.commandId, createAsyncCommandResponse.commandId)
            && Objects.equals(this.serviceId, createAsyncCommandResponse.serviceId)
            && Objects.equals(this.commandName, createAsyncCommandResponse.commandName)
            && Objects.equals(this.paras, createAsyncCommandResponse.paras)
            && Objects.equals(this.expireTime, createAsyncCommandResponse.expireTime)
            && Objects.equals(this.status, createAsyncCommandResponse.status)
            && Objects.equals(this.createdTime, createAsyncCommandResponse.createdTime)
            && Objects.equals(this.sendStrategy, createAsyncCommandResponse.sendStrategy);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(deviceId, commandId, serviceId, commandName, paras, expireTime, status, createdTime, sendStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAsyncCommandResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
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

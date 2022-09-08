package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AsyncDeviceCommandRequest
 */
public class AsyncDeviceCommandRequest {

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
    @JsonProperty(value = "send_strategy")

    private String sendStrategy;

    public AsyncDeviceCommandRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * **参数说明**：设备命令所属的设备服务ID，在设备关联的产品模型中定义。如设备需要编解码插件来解析命令，此参数为必填项。 **取值范围**：长度不超过64的字符串。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public AsyncDeviceCommandRequest withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * **参数说明**：设备命令名称，在设备关联的产品模型中定义。如设备需要编解码插件来解析命令，此参数为必填项。 **取值范围**：长度不超过128的字符串。
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public AsyncDeviceCommandRequest withParas(Object paras) {
        this.paras = paras;
        return this;
    }

    /**
     * **参数说明**：设备执行的命令，Json格式，里面是一个个健值对，如果service_id不为空，每个健都是profile中命令的参数名（paraName）;如果service_id为空则由用户自定义命令格式。设备命令示例：{\"value\":\"1\"}，具体格式需要应用和设备约定， 最大32K。
     * @return paras
     */
    public Object getParas() {
        return paras;
    }

    public void setParas(Object paras) {
        this.paras = paras;
    }

    public AsyncDeviceCommandRequest withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数说明**：物联网平台缓存命令的时长， 单位秒, 平台最多缓存20条消息（即最多缓存20条PENDING状态的命令） 该参数在send_strategy字段为delay时有效，默认缓存24小时，最大缓存2天。
     * minimum: 0
     * maximum: 172800
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public AsyncDeviceCommandRequest withSendStrategy(String sendStrategy) {
        this.sendStrategy = sendStrategy;
        return this;
    }

    /**
     * **参数说明**：下发策略，默认缓存下发。 **取值范围**： - immediately:表示立即下发，此时expire_time无效。 - delay:表示缓存下发，等数据上报或者设备上线之后下发。expire_time为0或空时，命令会默认缓存24小时。
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
        AsyncDeviceCommandRequest asyncDeviceCommandRequest = (AsyncDeviceCommandRequest) o;
        return Objects.equals(this.serviceId, asyncDeviceCommandRequest.serviceId)
            && Objects.equals(this.commandName, asyncDeviceCommandRequest.commandName)
            && Objects.equals(this.paras, asyncDeviceCommandRequest.paras)
            && Objects.equals(this.expireTime, asyncDeviceCommandRequest.expireTime)
            && Objects.equals(this.sendStrategy, asyncDeviceCommandRequest.sendStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, commandName, paras, expireTime, sendStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncDeviceCommandRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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

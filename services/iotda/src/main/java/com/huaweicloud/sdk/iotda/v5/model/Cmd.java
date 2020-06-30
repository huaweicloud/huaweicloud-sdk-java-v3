package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 给设备下发命令的命令内容，在动作的type为“DEVICE_CMD”时有效，且为必选
 */
public class Cmd  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_name")
    
    private String commandName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_body")
    
    private Object commandBody = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="buffer_timeout")
    
    private Integer bufferTimeout = 172800;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="response_timeout")
    
    private Integer responseTimeout = 1800;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;

    public Cmd withCommandName(String commandName) {
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

    public Cmd withCommandBody(Object commandBody) {
        this.commandBody = commandBody;
        return this;
    }

    


    /**
     * 设备命令参数，Json格式。 使用LWM2M协议设备命令示例：{\"value\":\"1\"}，里面是一个个健值对，每个健都是产品模型中命令的参数名（paraName）。 使用MQTT协议设备命令示例：{\"header\": {\"mode\": \"ACK\",\"from\": \"/users/testUser\",\"method\": \"SET_TEMPERATURE_READ_PERIOD\",\"to\":\"/devices/{device_id}/services/{service_id}\"},\"body\": {\"value\" : \"1\"}}。 - mode：必选，设备收到命令后是否需要回复确认消息，默认为ACK模式。ACK表示需要回复确认消息，NOACK表示不需要回复确认消息，其它值无效。 - from：可选，命令发送方的地址。App发起请求时格式为/users/{userId} ，应用服务器发起请求时格式为/{serviceName}，物联网平台发起请求时格式为/cloud/{serviceName}。 - to：可选，命令接收方的地址，格式为/devices/{device_id}/services/{service_id}。 - method：可选，产品模型中定义的命令名称。 - body：可选，命令的消息体，里面是一个个键值对，每个键都是产品模型中命令的参数名（paraName）。具体格式需要应用和设备约定。 
     * @return commandBody
     */
    public Object getCommandBody() {
        return commandBody;
    }

    public void setCommandBody(Object commandBody) {
        this.commandBody = commandBody;
    }

    public Cmd withServiceId(String serviceId) {
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

    public Cmd withBufferTimeout(Integer bufferTimeout) {
        this.bufferTimeout = bufferTimeout;
        return this;
    }

    


    /**
     * 设备命令的缓存时间，单位为秒，表示物联网平台在把命令下发给设备前缓存命令的有效时间，超过这个时间后命令将不再下发，默认值为172800s（48小时）。 如果buffer_timeout设置为0，则无论物联网平台上设置的命令下发模式是什么，该命令都会立即下发给设备。 
     * minimum: 0
     * maximum: 31536000
     * @return bufferTimeout
     */
    public Integer getBufferTimeout() {
        return bufferTimeout;
    }

    public void setBufferTimeout(Integer bufferTimeout) {
        this.bufferTimeout = bufferTimeout;
    }

    public Cmd withResponseTimeout(Integer responseTimeout) {
        this.responseTimeout = responseTimeout;
        return this;
    }

    


    /**
     * 命令响应的有效时间，单位为秒，表示设备接收到命令后，在response_timeout时间内响应有效，超过这个时间未收到命令的响应，则认为命令响应超时，默认值为1800s。
     * minimum: 1
     * maximum: 31536000
     * @return responseTimeout
     */
    public Integer getResponseTimeout() {
        return responseTimeout;
    }

    public void setResponseTimeout(Integer responseTimeout) {
        this.responseTimeout = responseTimeout;
    }

    public Cmd withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 设备命令的下发模式，仅当buffer_timeout的值大于0时有效。 - ACTIVE：主动模式，物联网平台主动将命令下发给设备。 - PASSIVE：被动模式，物联网平台创建设备命令后，会直接缓存命令。等到设备再次上线或者上报上一条命令的执行结果后才下发命令。 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cmd CMD = (Cmd) o;
        return Objects.equals(this.commandName, CMD.commandName) &&
            Objects.equals(this.commandBody, CMD.commandBody) &&
            Objects.equals(this.serviceId, CMD.serviceId) &&
            Objects.equals(this.bufferTimeout, CMD.bufferTimeout) &&
            Objects.equals(this.responseTimeout, CMD.responseTimeout) &&
            Objects.equals(this.mode, CMD.mode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commandName, commandBody, serviceId, bufferTimeout, responseTimeout, mode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cmd {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    commandBody: ").append(toIndentedString(commandBody)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    bufferTimeout: ").append(toIndentedString(bufferTimeout)).append("\n");
        sb.append("    responseTimeout: ").append(toIndentedString(responseTimeout)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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


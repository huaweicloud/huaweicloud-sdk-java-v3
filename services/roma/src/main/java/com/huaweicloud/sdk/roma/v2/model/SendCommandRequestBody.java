package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.RequestParameter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SendCommandRequestBody
 */
public class SendCommandRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private Integer serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_id")
    
    private Integer commandId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_sync")
    
    private Boolean isSync;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="requests")
    
    private List<RequestParameter> requests = null;
    
    public SendCommandRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 服务ID，自动向下取整
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public SendCommandRequestBody withCommandId(Integer commandId) {
        this.commandId = commandId;
        return this;
    }

    


    /**
     * 命令ID，自动向下取整
     * @return commandId
     */
    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public SendCommandRequestBody withIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }

    


    /**
     * 命令是否同步 true-同步 false-异步 同步命令会将命令以MQTT消息发送给设备后等待设备的MQTT命令响应，收到响应后再回复响应（默认超时5秒），异步命令则以立即返回响应
     * @return isSync
     */
    public Boolean getIsSync() {
        return isSync;
    }

    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    public SendCommandRequestBody withRequests(List<RequestParameter> requests) {
        this.requests = requests;
        return this;
    }

    
    public SendCommandRequestBody addRequestsItem(RequestParameter requestsItem) {
        if (this.requests == null) {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requestsItem);
        return this;
    }

    public SendCommandRequestBody withRequests(Consumer<List<RequestParameter>> requestsSetter) {
        if(this.requests == null ){
            this.requests = new ArrayList<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    /**
     * 请求参数列表
     * @return requests
     */
    public List<RequestParameter> getRequests() {
        return requests;
    }

    public void setRequests(List<RequestParameter> requests) {
        this.requests = requests;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendCommandRequestBody sendCommandRequestBody = (SendCommandRequestBody) o;
        return Objects.equals(this.serviceId, sendCommandRequestBody.serviceId) &&
            Objects.equals(this.commandId, sendCommandRequestBody.commandId) &&
            Objects.equals(this.isSync, sendCommandRequestBody.isSync) &&
            Objects.equals(this.requests, sendCommandRequestBody.requests);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, commandId, isSync, requests);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendCommandRequestBody {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    isSync: ").append(toIndentedString(isSync)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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


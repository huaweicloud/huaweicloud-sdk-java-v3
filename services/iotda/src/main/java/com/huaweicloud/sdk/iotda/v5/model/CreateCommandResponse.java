package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateCommandResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_id")
    
    private String commandId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="response")
    
    private Object response = null;

    public CreateCommandResponse withCommandId(String commandId) {
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

    public CreateCommandResponse withResponse(Object response) {
        this.response = response;
        return this;
    }

    


    /**
     * 设备上报的命令执行结果。Json格式，具体格式需要应用和设备约定。
     * @return response
     */
    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCommandResponse createCommandResponse = (CreateCommandResponse) o;
        return Objects.equals(this.commandId, createCommandResponse.commandId) &&
            Objects.equals(this.response, createCommandResponse.response);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commandId, response);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCommandResponse {\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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


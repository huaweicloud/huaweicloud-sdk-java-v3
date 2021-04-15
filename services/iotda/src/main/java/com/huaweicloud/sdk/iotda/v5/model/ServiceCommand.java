package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ServiceCommandPara;
import com.huaweicloud.sdk.iotda.v5.model.ServiceCommandResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 命令服务对象。
 */
public class ServiceCommand  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_name")
    
    private String commandName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paras")
    
    private List<ServiceCommandPara> paras = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="responses")
    
    private List<ServiceCommandResponse> responses = null;
    
    public ServiceCommand withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    


    /**
     * 设备命令名称。
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    

    public ServiceCommand withParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
        return this;
    }

    
    public ServiceCommand addParasItem(ServiceCommandPara parasItem) {
        if(this.paras == null) {
            this.paras = new ArrayList<>();
        }
        this.paras.add(parasItem);
        return this;
    }

    public ServiceCommand withParas(Consumer<List<ServiceCommandPara>> parasSetter) {
        if(this.paras == null) {
            this.paras = new ArrayList<>();
        }
        parasSetter.accept(this.paras);
        return this;
    }

    /**
     * 设备命令的参数列表。
     * @return paras
     */
    public List<ServiceCommandPara> getParas() {
        return paras;
    }

    public void setParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
    }

    

    public ServiceCommand withResponses(List<ServiceCommandResponse> responses) {
        this.responses = responses;
        return this;
    }

    
    public ServiceCommand addResponsesItem(ServiceCommandResponse responsesItem) {
        if(this.responses == null) {
            this.responses = new ArrayList<>();
        }
        this.responses.add(responsesItem);
        return this;
    }

    public ServiceCommand withResponses(Consumer<List<ServiceCommandResponse>> responsesSetter) {
        if(this.responses == null) {
            this.responses = new ArrayList<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 设备命令的响应列表。
     * @return responses
     */
    public List<ServiceCommandResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<ServiceCommandResponse> responses) {
        this.responses = responses;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceCommand serviceCommand = (ServiceCommand) o;
        return Objects.equals(this.commandName, serviceCommand.commandName) &&
            Objects.equals(this.paras, serviceCommand.paras) &&
            Objects.equals(this.responses, serviceCommand.responses);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commandName, paras, responses);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCommand {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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


package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.ComandParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCommandResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_name")
    
    private String commandName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_param")
    
    private ComandParam commandParam;

    public ShowCommandResponse withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    


    /**
     * 命令名称，分为：START、STOP、DELETE、SYNC
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    

    public ShowCommandResponse withCommandParam(ComandParam commandParam) {
        this.commandParam = commandParam;
        return this;
    }

    public ShowCommandResponse withCommandParam(Consumer<ComandParam> commandParamSetter) {
        if(this.commandParam == null ){
            this.commandParam = new ComandParam();
            commandParamSetter.accept(this.commandParam);
        }
        
        return this;
    }


    /**
     * Get commandParam
     * @return commandParam
     */
    public ComandParam getCommandParam() {
        return commandParam;
    }

    public void setCommandParam(ComandParam commandParam) {
        this.commandParam = commandParam;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCommandResponse showCommandResponse = (ShowCommandResponse) o;
        return Objects.equals(this.commandName, showCommandResponse.commandName) &&
            Objects.equals(this.commandParam, showCommandResponse.commandParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(commandName, commandParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommandResponse {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    commandParam: ").append(toIndentedString(commandParam)).append("\n");
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


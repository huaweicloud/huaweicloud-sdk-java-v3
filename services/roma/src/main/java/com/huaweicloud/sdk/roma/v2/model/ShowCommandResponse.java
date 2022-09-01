package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    @JacksonXmlProperty(localName = "service_id")

    private Integer serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_id")

    @JacksonXmlProperty(localName = "command_id")

    private Integer commandId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    @JacksonXmlProperty(localName = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public ShowCommandResponse withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 命令所属服务id
     * minimum: 0
     * maximum: 999999999999999999
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public ShowCommandResponse withCommandId(Integer commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * 命令id
     * minimum: 0
     * maximum: 999999999999999999
     * @return commandId
     */
    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public ShowCommandResponse withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * 命令名称
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public ShowCommandResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 命令描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return Objects.equals(this.serviceId, showCommandResponse.serviceId)
            && Objects.equals(this.commandId, showCommandResponse.commandId)
            && Objects.equals(this.commandName, showCommandResponse.commandName)
            && Objects.equals(this.description, showCommandResponse.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, commandId, commandName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommandResponse {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

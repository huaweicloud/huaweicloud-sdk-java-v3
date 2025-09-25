package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCicdConfigurationCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_command")

    private String cicdCommand;

    public CreateCicdConfigurationCommandResponse withCicdCommand(String cicdCommand) {
        this.cicdCommand = cicdCommand;
        return this;
    }

    /**
     * **参数解释**： cicd接入配置命令 **取值范围**： 字符长度1-1024位 
     * @return cicdCommand
     */
    public String getCicdCommand() {
        return cicdCommand;
    }

    public void setCicdCommand(String cicdCommand) {
        this.cicdCommand = cicdCommand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCicdConfigurationCommandResponse that = (CreateCicdConfigurationCommandResponse) obj;
        return Objects.equals(this.cicdCommand, that.cicdCommand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cicdCommand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCicdConfigurationCommandResponse {\n");
        sb.append("    cicdCommand: ").append(toIndentedString(cicdCommand)).append("\n");
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

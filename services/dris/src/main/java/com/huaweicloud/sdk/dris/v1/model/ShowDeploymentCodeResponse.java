package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeploymentCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    public ShowDeploymentCodeResponse withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * **参数说明**：生成的安装命令。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeploymentCodeResponse showDeploymentCodeResponse = (ShowDeploymentCodeResponse) o;
        return Objects.equals(this.cmd, showDeploymentCodeResponse.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentCodeResponse {\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
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

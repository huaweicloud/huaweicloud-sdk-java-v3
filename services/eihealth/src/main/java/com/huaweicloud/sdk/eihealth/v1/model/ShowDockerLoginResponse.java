package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDockerLoginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_cmd")

    private String loginCmd;

    public ShowDockerLoginResponse withLoginCmd(String loginCmd) {
        this.loginCmd = loginCmd;
        return this;
    }

    /**
     * 临时登录指令
     * @return loginCmd
     */
    public String getLoginCmd() {
        return loginCmd;
    }

    public void setLoginCmd(String loginCmd) {
        this.loginCmd = loginCmd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDockerLoginResponse that = (ShowDockerLoginResponse) obj;
        return Objects.equals(this.loginCmd, that.loginCmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginCmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDockerLoginResponse {\n");
        sb.append("    loginCmd: ").append(toIndentedString(loginCmd)).append("\n");
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

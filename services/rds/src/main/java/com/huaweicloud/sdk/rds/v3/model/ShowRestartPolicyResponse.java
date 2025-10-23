package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRestartPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_server")

    private Boolean restartServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_policy")

    private Object restartPolicy;

    public ShowRestartPolicyResponse withRestartServer(Boolean restartServer) {
        this.restartServer = restartServer;
        return this;
    }

    /**
     * 是否重启虚拟机。
     * @return restartServer
     */
    public Boolean getRestartServer() {
        return restartServer;
    }

    public void setRestartServer(Boolean restartServer) {
        this.restartServer = restartServer;
    }

    public ShowRestartPolicyResponse withRestartPolicy(Object restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * 重启策略。
     * @return restartPolicy
     */
    public Object getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(Object restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRestartPolicyResponse that = (ShowRestartPolicyResponse) obj;
        return Objects.equals(this.restartServer, that.restartServer)
            && Objects.equals(this.restartPolicy, that.restartPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartServer, restartPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestartPolicyResponse {\n");
        sb.append("    restartServer: ").append(toIndentedString(restartServer)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
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

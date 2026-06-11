package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 远程接入训练作业时需要的相关配置。
 */
public class JobEndpointsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh")

    private SSHReq ssh;

    public JobEndpointsReq withSsh(SSHReq ssh) {
        this.ssh = ssh;
        return this;
    }

    public JobEndpointsReq withSsh(Consumer<SSHReq> sshSetter) {
        if (this.ssh == null) {
            this.ssh = new SSHReq();
            sshSetter.accept(this.ssh);
        }

        return this;
    }

    /**
     * Get ssh
     * @return ssh
     */
    public SSHReq getSsh() {
        return ssh;
    }

    public void setSsh(SSHReq ssh) {
        this.ssh = ssh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobEndpointsReq that = (JobEndpointsReq) obj;
        return Objects.equals(this.ssh, that.ssh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEndpointsReq {\n");
        sb.append("    ssh: ").append(toIndentedString(ssh)).append("\n");
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

package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：创建后端服务器检测任务请求参数。
 */
public class CreateMemberHealthCheckJobOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    public CreateMemberHealthCheckJobOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所关联的监听器，查询在该监听器下后端服务器的状态。  **取值范围**：不涉及
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateMemberHealthCheckJobOption withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 参数法解释：检查项。  **取值范围**： - securityGroup：安全组检查。 - networkAcl：子网ACL配置检查。 - config：健康检查端口配置检查。 - all：所有检查项。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMemberHealthCheckJobOption that = (CreateMemberHealthCheckJobOption) obj;
        return Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberHealthCheckJobOption {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

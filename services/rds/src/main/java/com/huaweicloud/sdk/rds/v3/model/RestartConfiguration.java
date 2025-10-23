package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestartConfiguration
 */
public class RestartConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_server")

    private Boolean restartServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forcible")

    private Boolean forcible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_policy")

    private RestartPolicy restartPolicy;

    public RestartConfiguration withRestartServer(Boolean restartServer) {
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

    public RestartConfiguration withForcible(Boolean forcible) {
        this.forcible = forcible;
        return this;
    }

    /**
     * 是否强制重启, 强制重启会导致数据库服务中未提交的事务强制中断。
     * @return forcible
     */
    public Boolean getForcible() {
        return forcible;
    }

    public void setForcible(Boolean forcible) {
        this.forcible = forcible;
    }

    public RestartConfiguration withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 是否在可维护时间段内重启。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public RestartConfiguration withRestartPolicy(RestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    public RestartConfiguration withRestartPolicy(Consumer<RestartPolicy> restartPolicySetter) {
        if (this.restartPolicy == null) {
            this.restartPolicy = new RestartPolicy();
            restartPolicySetter.accept(this.restartPolicy);
        }

        return this;
    }

    /**
     * Get restartPolicy
     * @return restartPolicy
     */
    public RestartPolicy getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
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
        RestartConfiguration that = (RestartConfiguration) obj;
        return Objects.equals(this.restartServer, that.restartServer) && Objects.equals(this.forcible, that.forcible)
            && Objects.equals(this.delay, that.delay) && Objects.equals(this.restartPolicy, that.restartPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartServer, forcible, delay, restartPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartConfiguration {\n");
        sb.append("    restartServer: ").append(toIndentedString(restartServer)).append("\n");
        sb.append("    forcible: ").append(toIndentedString(forcible)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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

package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 应用实例配置
 */
public class PodConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_network")

    @JacksonXmlProperty(localName = "host_network")

    private Boolean hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_pid")

    @JacksonXmlProperty(localName = "host_pid")

    private Boolean hostPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration")

    @JacksonXmlProperty(localName = "migration")

    private Boolean migration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_policy")

    @JacksonXmlProperty(localName = "restart_policy")

    private String restartPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "toleration_seconds")

    @JacksonXmlProperty(localName = "toleration_seconds")

    private Integer tolerationSeconds;

    public PodConfigs withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * 应用实例是否启用主机网络，不启用则使用端口映射，默认值false
     * @return hostNetwork
     */
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public PodConfigs withHostPid(Boolean hostPid) {
        this.hostPid = hostPid;
        return this;
    }

    /**
     * 应用实例是否与主机共PID命名空间，默认值false
     * @return hostPid
     */
    public Boolean getHostPid() {
        return hostPid;
    }

    public void setHostPid(Boolean hostPid) {
        this.hostPid = hostPid;
    }

    public PodConfigs withMigration(Boolean migration) {
        this.migration = migration;
        return this;
    }

    /**
     * 应用实例故障是否迁移，指定节点组部署时必选，默认值false
     * @return migration
     */
    public Boolean getMigration() {
        return migration;
    }

    public void setMigration(Boolean migration) {
        this.migration = migration;
    }

    public PodConfigs withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * 应用实例重启策略，可选值Always、OnFailure、Never
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public PodConfigs withTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    /**
     * 应用实例故障容忍时间，容忍时间到达后迁移应用实例，只在指定节点组部署时生效
     * @return tolerationSeconds
     */
    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PodConfigs podConfigs = (PodConfigs) o;
        return Objects.equals(this.hostNetwork, podConfigs.hostNetwork)
            && Objects.equals(this.hostPid, podConfigs.hostPid) && Objects.equals(this.migration, podConfigs.migration)
            && Objects.equals(this.restartPolicy, podConfigs.restartPolicy)
            && Objects.equals(this.tolerationSeconds, podConfigs.tolerationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostNetwork, hostPid, migration, restartPolicy, tolerationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodConfigs {\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    hostPid: ").append(toIndentedString(hostPid)).append("\n");
        sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
        sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
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

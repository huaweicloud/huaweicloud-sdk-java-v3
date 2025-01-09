package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 客户端。
 */
public class PoliciesClient {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic_reconnection_interval")

    private Integer automaticReconnectionInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence_time")

    private Integer sessionPersistenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoclose_monitor_after_locked")

    private Boolean autocloseMonitorAfterLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoclose_monitor_options")

    private PoliciesClientAutocloseMonitorOptions autocloseMonitorOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbid_screen_capture")

    private Boolean forbidScreenCapture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_machine_join_domain")

    private Boolean clientMachineJoinDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type")

    private PoliciesClientClientType clientType;

    public PoliciesClient withAutomaticReconnectionInterval(Integer automaticReconnectionInterval) {
        this.automaticReconnectionInterval = automaticReconnectionInterval;
        return this;
    }

    /**
     * 自动重连间隔（秒）。取值范围为[1-50]。默认：5。
     * minimum: 1
     * maximum: 50
     * @return automaticReconnectionInterval
     */
    public Integer getAutomaticReconnectionInterval() {
        return automaticReconnectionInterval;
    }

    public void setAutomaticReconnectionInterval(Integer automaticReconnectionInterval) {
        this.automaticReconnectionInterval = automaticReconnectionInterval;
    }

    public PoliciesClient withSessionPersistenceTime(Integer sessionPersistenceTime) {
        this.sessionPersistenceTime = sessionPersistenceTime;
        return this;
    }

    /**
     * 自动重连会话保持时长（秒）。取值范围为[0-180]。默认：180。
     * minimum: 0
     * maximum: 180
     * @return sessionPersistenceTime
     */
    public Integer getSessionPersistenceTime() {
        return sessionPersistenceTime;
    }

    public void setSessionPersistenceTime(Integer sessionPersistenceTime) {
        this.sessionPersistenceTime = sessionPersistenceTime;
    }

    public PoliciesClient withAutocloseMonitorAfterLocked(Boolean autocloseMonitorAfterLocked) {
        this.autocloseMonitorAfterLocked = autocloseMonitorAfterLocked;
        return this;
    }

    /**
     * 锁屏后自动关闭本地显示器。取值为： false：表示关闭。 true：表示开启。
     * @return autocloseMonitorAfterLocked
     */
    public Boolean getAutocloseMonitorAfterLocked() {
        return autocloseMonitorAfterLocked;
    }

    public void setAutocloseMonitorAfterLocked(Boolean autocloseMonitorAfterLocked) {
        this.autocloseMonitorAfterLocked = autocloseMonitorAfterLocked;
    }

    public PoliciesClient withAutocloseMonitorOptions(PoliciesClientAutocloseMonitorOptions autocloseMonitorOptions) {
        this.autocloseMonitorOptions = autocloseMonitorOptions;
        return this;
    }

    public PoliciesClient withAutocloseMonitorOptions(
        Consumer<PoliciesClientAutocloseMonitorOptions> autocloseMonitorOptionsSetter) {
        if (this.autocloseMonitorOptions == null) {
            this.autocloseMonitorOptions = new PoliciesClientAutocloseMonitorOptions();
            autocloseMonitorOptionsSetter.accept(this.autocloseMonitorOptions);
        }

        return this;
    }

    /**
     * Get autocloseMonitorOptions
     * @return autocloseMonitorOptions
     */
    public PoliciesClientAutocloseMonitorOptions getAutocloseMonitorOptions() {
        return autocloseMonitorOptions;
    }

    public void setAutocloseMonitorOptions(PoliciesClientAutocloseMonitorOptions autocloseMonitorOptions) {
        this.autocloseMonitorOptions = autocloseMonitorOptions;
    }

    public PoliciesClient withForbidScreenCapture(Boolean forbidScreenCapture) {
        this.forbidScreenCapture = forbidScreenCapture;
        return this;
    }

    /**
     * 防截屏策略开关。 false：表示关闭。 true：表示开启。
     * @return forbidScreenCapture
     */
    public Boolean getForbidScreenCapture() {
        return forbidScreenCapture;
    }

    public void setForbidScreenCapture(Boolean forbidScreenCapture) {
        this.forbidScreenCapture = forbidScreenCapture;
    }

    public PoliciesClient withClientMachineJoinDomain(Boolean clientMachineJoinDomain) {
        this.clientMachineJoinDomain = clientMachineJoinDomain;
        return this;
    }

    /**
     * 终端机器加域校验开关。 false：表示关闭。 true：表示开启。
     * @return clientMachineJoinDomain
     */
    public Boolean getClientMachineJoinDomain() {
        return clientMachineJoinDomain;
    }

    public void setClientMachineJoinDomain(Boolean clientMachineJoinDomain) {
        this.clientMachineJoinDomain = clientMachineJoinDomain;
    }

    public PoliciesClient withClientType(PoliciesClientClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    public PoliciesClient withClientType(Consumer<PoliciesClientClientType> clientTypeSetter) {
        if (this.clientType == null) {
            this.clientType = new PoliciesClientClientType();
            clientTypeSetter.accept(this.clientType);
        }

        return this;
    }

    /**
     * Get clientType
     * @return clientType
     */
    public PoliciesClientClientType getClientType() {
        return clientType;
    }

    public void setClientType(PoliciesClientClientType clientType) {
        this.clientType = clientType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesClient that = (PoliciesClient) obj;
        return Objects.equals(this.automaticReconnectionInterval, that.automaticReconnectionInterval)
            && Objects.equals(this.sessionPersistenceTime, that.sessionPersistenceTime)
            && Objects.equals(this.autocloseMonitorAfterLocked, that.autocloseMonitorAfterLocked)
            && Objects.equals(this.autocloseMonitorOptions, that.autocloseMonitorOptions)
            && Objects.equals(this.forbidScreenCapture, that.forbidScreenCapture)
            && Objects.equals(this.clientMachineJoinDomain, that.clientMachineJoinDomain)
            && Objects.equals(this.clientType, that.clientType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automaticReconnectionInterval,
            sessionPersistenceTime,
            autocloseMonitorAfterLocked,
            autocloseMonitorOptions,
            forbidScreenCapture,
            clientMachineJoinDomain,
            clientType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesClient {\n");
        sb.append("    automaticReconnectionInterval: ")
            .append(toIndentedString(automaticReconnectionInterval))
            .append("\n");
        sb.append("    sessionPersistenceTime: ").append(toIndentedString(sessionPersistenceTime)).append("\n");
        sb.append("    autocloseMonitorAfterLocked: ")
            .append(toIndentedString(autocloseMonitorAfterLocked))
            .append("\n");
        sb.append("    autocloseMonitorOptions: ").append(toIndentedString(autocloseMonitorOptions)).append("\n");
        sb.append("    forbidScreenCapture: ").append(toIndentedString(forbidScreenCapture)).append("\n");
        sb.append("    clientMachineJoinDomain: ").append(toIndentedString(clientMachineJoinDomain)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
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

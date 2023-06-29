package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
    @JsonProperty(value = "forbid_screen_capture")

    private Boolean forbidScreenCapture;

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
            && Objects.equals(this.forbidScreenCapture, that.forbidScreenCapture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automaticReconnectionInterval, sessionPersistenceTime, forbidScreenCapture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesClient {\n");
        sb.append("    automaticReconnectionInterval: ")
            .append(toIndentedString(automaticReconnectionInterval))
            .append("\n");
        sb.append("    sessionPersistenceTime: ").append(toIndentedString(sessionPersistenceTime)).append("\n");
        sb.append("    forbidScreenCapture: ").append(toIndentedString(forbidScreenCapture)).append("\n");
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

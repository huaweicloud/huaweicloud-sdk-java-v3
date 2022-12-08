package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EdgeGeneralConfigInResponse
 */
public class EdgeGeneralConfigInResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avp_enabled")

    private Boolean avpEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsm_enabled")

    private Boolean rsmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_compensate")

    private Boolean timeCompensate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsi_positioning_enabled")

    private Boolean rsiPositioningEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_level")

    private String logLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "road_detection_length")

    private Double roadDetectionLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ramp_detection_length")

    private Double rampDetectionLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gat1400_username")

    private String gat1400Username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public EdgeGeneralConfigInResponse withAvpEnabled(Boolean avpEnabled) {
        this.avpEnabled = avpEnabled;
        return this;
    }

    /**
     * **参数说明**：AVP场景。
     * @return avpEnabled
     */
    public Boolean getAvpEnabled() {
        return avpEnabled;
    }

    public void setAvpEnabled(Boolean avpEnabled) {
        this.avpEnabled = avpEnabled;
    }

    public EdgeGeneralConfigInResponse withRsmEnabled(Boolean rsmEnabled) {
        this.rsmEnabled = rsmEnabled;
        return this;
    }

    /**
     * **参数说明**：RSM上报：默认不上报。
     * @return rsmEnabled
     */
    public Boolean getRsmEnabled() {
        return rsmEnabled;
    }

    public void setRsmEnabled(Boolean rsmEnabled) {
        this.rsmEnabled = rsmEnabled;
    }

    public EdgeGeneralConfigInResponse withTimeCompensate(Boolean timeCompensate) {
        this.timeCompensate = timeCompensate;
        return this;
    }

    /**
     * **参数说明**：时延补偿：是否启动Edge时延补偿功能。
     * @return timeCompensate
     */
    public Boolean getTimeCompensate() {
        return timeCompensate;
    }

    public void setTimeCompensate(Boolean timeCompensate) {
        this.timeCompensate = timeCompensate;
    }

    public EdgeGeneralConfigInResponse withRsiPositioningEnabled(Boolean rsiPositioningEnabled) {
        this.rsiPositioningEnabled = rsiPositioningEnabled;
        return this;
    }

    /**
     * **参数说明**：RSI事件定位功能。
     * @return rsiPositioningEnabled
     */
    public Boolean getRsiPositioningEnabled() {
        return rsiPositioningEnabled;
    }

    public void setRsiPositioningEnabled(Boolean rsiPositioningEnabled) {
        this.rsiPositioningEnabled = rsiPositioningEnabled;
    }

    public EdgeGeneralConfigInResponse withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * **参数说明**：应用日志级别  **取值范围**：on/off，默认关闭。
     * @return logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public EdgeGeneralConfigInResponse withRoadDetectionLength(Double roadDetectionLength) {
        this.roadDetectionLength = roadDetectionLength;
        return this;
    }

    /**
     * **参数说明**：道路检测长度，单位：米。
     * minimum: 1
     * maximum: 1E+3
     * @return roadDetectionLength
     */
    public Double getRoadDetectionLength() {
        return roadDetectionLength;
    }

    public void setRoadDetectionLength(Double roadDetectionLength) {
        this.roadDetectionLength = roadDetectionLength;
    }

    public EdgeGeneralConfigInResponse withRampDetectionLength(Double rampDetectionLength) {
        this.rampDetectionLength = rampDetectionLength;
        return this;
    }

    /**
     * **参数说明**：匝道检测长度，单位：米。
     * minimum: 1
     * maximum: 1E+3
     * @return rampDetectionLength
     */
    public Double getRampDetectionLength() {
        return rampDetectionLength;
    }

    public void setRampDetectionLength(Double rampDetectionLength) {
        this.rampDetectionLength = rampDetectionLength;
    }

    public EdgeGeneralConfigInResponse withGat1400Username(String gat1400Username) {
        this.gat1400Username = gat1400Username;
        return this;
    }

    /**
     * **参数说明**：1400接口用户名。  **取值范围**：长度不小于8，不大于32，只允许数字字母下划线组合，且不能以数字下划线开头，不能有中文和特殊字符，gat1400用户名不能与gat1400密码相同。
     * @return gat1400Username
     */
    public String getGat1400Username() {
        return gat1400Username;
    }

    public void setGat1400Username(String gat1400Username) {
        this.gat1400Username = gat1400Username;
    }

    public EdgeGeneralConfigInResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数说明**：ITS800鉴权用的用户名和密码。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeGeneralConfigInResponse edgeGeneralConfigInResponse = (EdgeGeneralConfigInResponse) o;
        return Objects.equals(this.avpEnabled, edgeGeneralConfigInResponse.avpEnabled)
            && Objects.equals(this.rsmEnabled, edgeGeneralConfigInResponse.rsmEnabled)
            && Objects.equals(this.timeCompensate, edgeGeneralConfigInResponse.timeCompensate)
            && Objects.equals(this.rsiPositioningEnabled, edgeGeneralConfigInResponse.rsiPositioningEnabled)
            && Objects.equals(this.logLevel, edgeGeneralConfigInResponse.logLevel)
            && Objects.equals(this.roadDetectionLength, edgeGeneralConfigInResponse.roadDetectionLength)
            && Objects.equals(this.rampDetectionLength, edgeGeneralConfigInResponse.rampDetectionLength)
            && Objects.equals(this.gat1400Username, edgeGeneralConfigInResponse.gat1400Username)
            && Objects.equals(this.userName, edgeGeneralConfigInResponse.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avpEnabled,
            rsmEnabled,
            timeCompensate,
            rsiPositioningEnabled,
            logLevel,
            roadDetectionLength,
            rampDetectionLength,
            gat1400Username,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeGeneralConfigInResponse {\n");
        sb.append("    avpEnabled: ").append(toIndentedString(avpEnabled)).append("\n");
        sb.append("    rsmEnabled: ").append(toIndentedString(rsmEnabled)).append("\n");
        sb.append("    timeCompensate: ").append(toIndentedString(timeCompensate)).append("\n");
        sb.append("    rsiPositioningEnabled: ").append(toIndentedString(rsiPositioningEnabled)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    roadDetectionLength: ").append(toIndentedString(roadDetectionLength)).append("\n");
        sb.append("    rampDetectionLength: ").append(toIndentedString(rampDetectionLength)).append("\n");
        sb.append("    gat1400Username: ").append(toIndentedString(gat1400Username)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * agent install script
 */
public class TwoFactorLoginHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_switch")

    private Boolean authSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_display_name")

    private String topicDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_host")

    private Boolean outsideHost;

    public TwoFactorLoginHostResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public TwoFactorLoginHostResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public TwoFactorLoginHostResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public TwoFactorLoginHostResponseInfo withAuthSwitch(Boolean authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }

    /**
     * 是否开启双因子认证
     * @return authSwitch
     */
    public Boolean getAuthSwitch() {
        return authSwitch;
    }

    public void setAuthSwitch(Boolean authSwitch) {
        this.authSwitch = authSwitch;
    }

    public TwoFactorLoginHostResponseInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型 - sms ： 短信邮件验证 - code ： 验证码验证
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public TwoFactorLoginHostResponseInfo withTopicDisplayName(String topicDisplayName) {
        this.topicDisplayName = topicDisplayName;
        return this;
    }

    /**
     * 主题别名
     * @return topicDisplayName
     */
    public String getTopicDisplayName() {
        return topicDisplayName;
    }

    public void setTopicDisplayName(String topicDisplayName) {
        this.topicDisplayName = topicDisplayName;
    }

    public TwoFactorLoginHostResponseInfo withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题唯一资源标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public TwoFactorLoginHostResponseInfo withOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
        return this;
    }

    /**
     * 是否为外部（非华为云）机器
     * @return outsideHost
     */
    public Boolean getOutsideHost() {
        return outsideHost;
    }

    public void setOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TwoFactorLoginHostResponseInfo that = (TwoFactorLoginHostResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.authSwitch, that.authSwitch)
            && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.topicDisplayName, that.topicDisplayName)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.outsideHost, that.outsideHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, osType, authSwitch, authType, topicDisplayName, topicUrn, outsideHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TwoFactorLoginHostResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    authSwitch: ").append(toIndentedString(authSwitch)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    topicDisplayName: ").append(toIndentedString(topicDisplayName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    outsideHost: ").append(toIndentedString(outsideHost)).append("\n");
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

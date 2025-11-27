package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 防护配置对应的主机信息 **取值范围**： 不涉及 
 */
public class WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_private_ip")

    private String hostPrivateIp;

    public WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **取值范围**: 字符长度1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 主机名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo withHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
        return this;
    }

    /**
     * **参数解释**: 主机私网ip **取值范围**: 字符长度1-128位 
     * @return hostPrivateIp
     */
    public String getHostPrivateIp() {
        return hostPrivateIp;
    }

    public void setHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo that =
            (WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostPrivateIp, that.hostPrivateIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostPrivateIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionConfigResponseInfoContainerWtpInfoHostInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostPrivateIp: ").append(toIndentedString(hostPrivateIp)).append("\n");
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

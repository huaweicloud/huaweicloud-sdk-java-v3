package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机访问信息。
 */
public class PhoneAccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ip")

    private String deviceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ip")

    private String phoneIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_port")

    private Integer listenPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ip")

    private String accessIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_ip")

    private String intranetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_port")

    private Integer accessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ipv6")

    private String phoneIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ipv6")

    private String serverIpv6;

    public PhoneAccessInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义端口类型，不超过16个字节。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PhoneAccessInfo withDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }

    /**
     * 云手机IP（过期）。
     * @return deviceIp
     */
    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public PhoneAccessInfo withPhoneIp(String phoneIp) {
        this.phoneIp = phoneIp;
        return this;
    }

    /**
     * 云手机IP。
     * @return phoneIp
     */
    public String getPhoneIp() {
        return phoneIp;
    }

    public void setPhoneIp(String phoneIp) {
        this.phoneIp = phoneIp;
    }

    public PhoneAccessInfo withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 服务监听端口。
     * minimum: 0
     * maximum: 65535
     * @return listenPort
     */
    public Integer getListenPort() {
        return listenPort;
    }

    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public PhoneAccessInfo withAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }

    /**
     * 云手机服务器的访问IP（过期）。
     * @return accessIp
     */
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public PhoneAccessInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 云手机服务器的公网IP，如果端口设置了非公网访问，该字段返回空字符串。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PhoneAccessInfo withIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }

    /**
     * 云手机服务器的内网IP（过期）。
     * @return intranetIp
     */
    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
    }

    public PhoneAccessInfo withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 云手机服务器的内网IP。
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public PhoneAccessInfo withAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
        return this;
    }

    /**
     * 服务映射到公网的访问端口。
     * minimum: 0
     * maximum: 65535
     * @return accessPort
     */
    public Integer getAccessPort() {
        return accessPort;
    }

    public void setAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
    }

    public PhoneAccessInfo withPhoneIpv6(String phoneIpv6) {
        this.phoneIpv6 = phoneIpv6;
        return this;
    }

    /**
     * 云手机IPv6 IP，新增字段。
     * @return phoneIpv6
     */
    public String getPhoneIpv6() {
        return phoneIpv6;
    }

    public void setPhoneIpv6(String phoneIpv6) {
        this.phoneIpv6 = phoneIpv6;
    }

    public PhoneAccessInfo withServerIpv6(String serverIpv6) {
        this.serverIpv6 = serverIpv6;
        return this;
    }

    /**
     * 云手机服务器IPv6 IP，新增字段。
     * @return serverIpv6
     */
    public String getServerIpv6() {
        return serverIpv6;
    }

    public void setServerIpv6(String serverIpv6) {
        this.serverIpv6 = serverIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneAccessInfo that = (PhoneAccessInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.deviceIp, that.deviceIp)
            && Objects.equals(this.phoneIp, that.phoneIp) && Objects.equals(this.listenPort, that.listenPort)
            && Objects.equals(this.accessIp, that.accessIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.intranetIp, that.intranetIp) && Objects.equals(this.serverIp, that.serverIp)
            && Objects.equals(this.accessPort, that.accessPort) && Objects.equals(this.phoneIpv6, that.phoneIpv6)
            && Objects.equals(this.serverIpv6, that.serverIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            deviceIp,
            phoneIp,
            listenPort,
            accessIp,
            publicIp,
            intranetIp,
            serverIp,
            accessPort,
            phoneIpv6,
            serverIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneAccessInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deviceIp: ").append(toIndentedString(deviceIp)).append("\n");
        sb.append("    phoneIp: ").append(toIndentedString(phoneIp)).append("\n");
        sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    intranetIp: ").append(toIndentedString(intranetIp)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
        sb.append("    phoneIpv6: ").append(toIndentedString(phoneIpv6)).append("\n");
        sb.append("    serverIpv6: ").append(toIndentedString(serverIpv6)).append("\n");
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

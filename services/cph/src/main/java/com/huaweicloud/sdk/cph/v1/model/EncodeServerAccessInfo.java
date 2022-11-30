package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 编码服务访问信息。
 */
public class EncodeServerAccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_port")

    private Integer listenPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ip")

    private String accessIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_ip")

    private String intranetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_port")

    private Integer accessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public EncodeServerAccessInfo withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 编码服务监听端口
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

    public EncodeServerAccessInfo withAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }

    /**
     * 编码服务访问的公网IP（过期）
     * @return accessIp
     */
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public EncodeServerAccessInfo withIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }

    /**
     * 编码服务访问的内网IP（过期）
     * @return intranetIp
     */
    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
    }

    public EncodeServerAccessInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 编码服务访问的公网IP（新增）
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public EncodeServerAccessInfo withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 编码服务访问的内网IP（新增）
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public EncodeServerAccessInfo withAccessPort(Integer accessPort) {
        this.accessPort = accessPort;
        return this;
    }

    /**
     * 编码服务公网的访问端口
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

    public EncodeServerAccessInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 编码服务的端口类型，取值如下： - adb：云手机的ADB端口 - vnc：云手机的VNC端口 - cph_app_server：云游戏客户端接入端 - cph_h5_server：云游戏H5 web网页接入端口 - 其他值：用户自定义端口
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncodeServerAccessInfo encodeServerAccessInfo = (EncodeServerAccessInfo) o;
        return Objects.equals(this.listenPort, encodeServerAccessInfo.listenPort)
            && Objects.equals(this.accessIp, encodeServerAccessInfo.accessIp)
            && Objects.equals(this.intranetIp, encodeServerAccessInfo.intranetIp)
            && Objects.equals(this.publicIp, encodeServerAccessInfo.publicIp)
            && Objects.equals(this.serverIp, encodeServerAccessInfo.serverIp)
            && Objects.equals(this.accessPort, encodeServerAccessInfo.accessPort)
            && Objects.equals(this.type, encodeServerAccessInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenPort, accessIp, intranetIp, publicIp, serverIp, accessPort, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncodeServerAccessInfo {\n");
        sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    intranetIp: ").append(toIndentedString(intranetIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

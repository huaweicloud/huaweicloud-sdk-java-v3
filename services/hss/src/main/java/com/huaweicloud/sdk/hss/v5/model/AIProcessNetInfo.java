package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** AI应用进程监听的网络信息 
 */
public class AIProcessNetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_ip")

    private String listenIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_protocol")

    private String listenProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_port")

    private Long listenPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_status")

    private String listenStatus;

    public AIProcessNetInfo withListenIp(String listenIp) {
        this.listenIp = listenIp;
        return this;
    }

    /**
     * **参数解释**： 应用进程监听IP **取值范围**： 取值0-2147483647 
     * @return listenIp
     */
    public String getListenIp() {
        return listenIp;
    }

    public void setListenIp(String listenIp) {
        this.listenIp = listenIp;
    }

    public AIProcessNetInfo withListenProtocol(String listenProtocol) {
        this.listenProtocol = listenProtocol;
        return this;
    }

    /**
     * **参数解释**： 应用进程监听对应的网络协议 **取值范围**： - tcp：tcp协议 - udp：udp协议 
     * @return listenProtocol
     */
    public String getListenProtocol() {
        return listenProtocol;
    }

    public void setListenProtocol(String listenProtocol) {
        this.listenProtocol = listenProtocol;
    }

    public AIProcessNetInfo withListenPort(Long listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * **参数解释**： 应用进程监听端口 **取值范围**： 取值0-2147483647 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return listenPort
     */
    public Long getListenPort() {
        return listenPort;
    }

    public void setListenPort(Long listenPort) {
        this.listenPort = listenPort;
    }

    public AIProcessNetInfo withListenStatus(String listenStatus) {
        this.listenStatus = listenStatus;
        return this;
    }

    /**
     * **参数解释**： 应用进程监听状态 **取值范围**： - established：已建立连接 - closed：连接已关闭 - listening：监听中 - other：连接中间态 
     * @return listenStatus
     */
    public String getListenStatus() {
        return listenStatus;
    }

    public void setListenStatus(String listenStatus) {
        this.listenStatus = listenStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIProcessNetInfo that = (AIProcessNetInfo) obj;
        return Objects.equals(this.listenIp, that.listenIp) && Objects.equals(this.listenProtocol, that.listenProtocol)
            && Objects.equals(this.listenPort, that.listenPort) && Objects.equals(this.listenStatus, that.listenStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenIp, listenProtocol, listenPort, listenStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIProcessNetInfo {\n");
        sb.append("    listenIp: ").append(toIndentedString(listenIp)).append("\n");
        sb.append("    listenProtocol: ").append(toIndentedString(listenProtocol)).append("\n");
        sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
        sb.append("    listenStatus: ").append(toIndentedString(listenStatus)).append("\n");
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

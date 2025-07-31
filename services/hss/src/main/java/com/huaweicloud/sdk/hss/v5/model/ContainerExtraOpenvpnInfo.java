package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 沙箱类型,VPN引流沙箱专用
 */
public class ContainerExtraOpenvpnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_ip")

    private String outsideIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_port")

    private String outsidePort;

    public ContainerExtraOpenvpnInfo withOutsideIp(String outsideIp) {
        this.outsideIp = outsideIp;
        return this;
    }

    /**
     * 映射ip
     * @return outsideIp
     */
    public String getOutsideIp() {
        return outsideIp;
    }

    public void setOutsideIp(String outsideIp) {
        this.outsideIp = outsideIp;
    }

    public ContainerExtraOpenvpnInfo withOutsidePort(String outsidePort) {
        this.outsidePort = outsidePort;
        return this;
    }

    /**
     * 映射端口
     * @return outsidePort
     */
    public String getOutsidePort() {
        return outsidePort;
    }

    public void setOutsidePort(String outsidePort) {
        this.outsidePort = outsidePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerExtraOpenvpnInfo that = (ContainerExtraOpenvpnInfo) obj;
        return Objects.equals(this.outsideIp, that.outsideIp) && Objects.equals(this.outsidePort, that.outsidePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outsideIp, outsidePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerExtraOpenvpnInfo {\n");
        sb.append("    outsideIp: ").append(toIndentedString(outsideIp)).append("\n");
        sb.append("    outsidePort: ").append(toIndentedString(outsidePort)).append("\n");
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

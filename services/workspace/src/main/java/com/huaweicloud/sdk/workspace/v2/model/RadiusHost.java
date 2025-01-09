package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Radius主机配置信息
 */
public class RadiusHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_ip")

    private String radiusIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_port")

    private Integer authPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_port")

    private Integer acceptPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nas_id")

    private String nasId;

    public RadiusHost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RadiusHost withRadiusIp(String radiusIp) {
        this.radiusIp = radiusIp;
        return this;
    }

    /**
     * IP地址
     * @return radiusIp
     */
    public String getRadiusIp() {
        return radiusIp;
    }

    public void setRadiusIp(String radiusIp) {
        this.radiusIp = radiusIp;
    }

    public RadiusHost withAuthPort(Integer authPort) {
        this.authPort = authPort;
        return this;
    }

    /**
     * 认证端口
     * minimum: 1
     * maximum: 65535
     * @return authPort
     */
    public Integer getAuthPort() {
        return authPort;
    }

    public void setAuthPort(Integer authPort) {
        this.authPort = authPort;
    }

    public RadiusHost withAcceptPort(Integer acceptPort) {
        this.acceptPort = acceptPort;
        return this;
    }

    /**
     * 接收端口
     * minimum: 1
     * maximum: 66635
     * @return acceptPort
     */
    public Integer getAcceptPort() {
        return acceptPort;
    }

    public void setAcceptPort(Integer acceptPort) {
        this.acceptPort = acceptPort;
    }

    public RadiusHost withNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }

    /**
     * NAS ID
     * @return nasId
     */
    public String getNasId() {
        return nasId;
    }

    public void setNasId(String nasId) {
        this.nasId = nasId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RadiusHost that = (RadiusHost) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.radiusIp, that.radiusIp)
            && Objects.equals(this.authPort, that.authPort) && Objects.equals(this.acceptPort, that.acceptPort)
            && Objects.equals(this.nasId, that.nasId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radiusIp, authPort, acceptPort, nasId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadiusHost {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    radiusIp: ").append(toIndentedString(radiusIp)).append("\n");
        sb.append("    authPort: ").append(toIndentedString(authPort)).append("\n");
        sb.append("    acceptPort: ").append(toIndentedString(acceptPort)).append("\n");
        sb.append("    nasId: ").append(toIndentedString(nasId)).append("\n");
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

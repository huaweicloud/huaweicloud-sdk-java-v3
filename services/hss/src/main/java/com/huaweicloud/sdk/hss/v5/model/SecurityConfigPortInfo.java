package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 危险端口信息
 */
public class SecurityConfigPortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_status")

    private Integer portStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_desc")

    private String portDesc;

    public SecurityConfigPortInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口号 **取值范围**： 0-65535 
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SecurityConfigPortInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型 **取值范围**： 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SecurityConfigPortInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 端口危险程度 **取值范围**： - normal：正常端口 - danger：危险端口 - unknown：未知端口 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SecurityConfigPortInfo withPortStatus(Integer portStatus) {
        this.portStatus = portStatus;
        return this;
    }

    /**
     * **参数解释**： 端口状态 **取值范围**： - 0：未处理 - 1：已忽略 - 2：无需处理 
     * @return portStatus
     */
    public Integer getPortStatus() {
        return portStatus;
    }

    public void setPortStatus(Integer portStatus) {
        this.portStatus = portStatus;
    }

    public SecurityConfigPortInfo withPortDesc(String portDesc) {
        this.portDesc = portDesc;
        return this;
    }

    /**
     * **参数解释**： 端口描述 **取值范围**： 不涉及 
     * @return portDesc
     */
    public String getPortDesc() {
        return portDesc;
    }

    public void setPortDesc(String portDesc) {
        this.portDesc = portDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigPortInfo that = (SecurityConfigPortInfo) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.portStatus, that.portStatus)
            && Objects.equals(this.portDesc, that.portDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, type, status, portStatus, portDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigPortInfo {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    portStatus: ").append(toIndentedString(portStatus)).append("\n");
        sb.append("    portDesc: ").append(toIndentedString(portDesc)).append("\n");
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

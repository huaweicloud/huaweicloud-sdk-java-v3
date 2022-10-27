package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消息体。
 */
public class DeletePortResponseModelData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    public DeletePortResponseModelData withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。  
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public DeletePortResponseModelData withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 通道号类型。 - 1：普通 - 3：前缀号段 - 5：后缀号段  
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePortResponseModelData deletePortResponseModelData = (DeletePortResponseModelData) o;
        return Objects.equals(this.port, deletePortResponseModelData.port)
            && Objects.equals(this.portType, deletePortResponseModelData.portType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, portType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePortResponseModelData {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
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

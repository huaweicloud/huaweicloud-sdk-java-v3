package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 开放端口统计信息 
 */
public class PortStatisticResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public PortStatisticResponseInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 端口号 **取值范围**: 最小值0，最大值65535 
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

    public PortStatisticResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 端口类型 **取值范围**: - UDP - UDP6 - TCP - TCP6 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PortStatisticResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**: 端口数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 10000
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public PortStatisticResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 危险类型 **取值范围**: - danger: 危险端口 - normal: 正常端口 - unknown: 无已知危险的端口 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortStatisticResponseInfo that = (PortStatisticResponseInfo) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.type, that.type)
            && Objects.equals(this.num, that.num) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, type, num, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortStatisticResponseInfo {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DCS数据源配置内容
 */
public class DcsContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_id")

    @JacksonXmlProperty(localName = "endpoint_service_id")

    private String endpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_name")

    @JacksonXmlProperty(localName = "endpoint_service_name")

    private String endpointServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    @JacksonXmlProperty(localName = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_type")

    @JacksonXmlProperty(localName = "dcs_type")

    private String dcsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    public DcsContentReq withEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
        return this;
    }

    /**
     * VPC-EP服务端id
     * @return endpointServiceId
     */
    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public DcsContentReq withEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /**
     * VPC-EP服务端名称
     * @return endpointServiceName
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public DcsContentReq withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * VPC-EP客户端Port
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

    public DcsContentReq withDcsType(String dcsType) {
        this.dcsType = dcsType;
        return this;
    }

    /**
     * redis实例类型
     * @return dcsType
     */
    public String getDcsType() {
        return dcsType;
    }

    public void setDcsType(String dcsType) {
        this.dcsType = dcsType;
    }

    public DcsContentReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * redis访问密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DcsContentReq dcsContentReq = (DcsContentReq) o;
        return Objects.equals(this.endpointServiceId, dcsContentReq.endpointServiceId)
            && Objects.equals(this.endpointServiceName, dcsContentReq.endpointServiceName)
            && Objects.equals(this.port, dcsContentReq.port) && Objects.equals(this.dcsType, dcsContentReq.dcsType)
            && Objects.equals(this.password, dcsContentReq.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointServiceId, endpointServiceName, port, dcsType, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DcsContentReq {\n");
        sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
        sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    dcsType: ").append(toIndentedString(dcsType)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** redis数据源配置内容 */
public class DcsContentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointServiceId")

    private String endpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointServiceName")

    private String endpointServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointIp")

    private String endpointIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcsType")

    private String dcsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public DcsContentRsp withEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
        return this;
    }

    /** VPC-EP服务端id
     * 
     * @return endpointServiceId */
    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public DcsContentRsp withEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /** VPC-EP服务端名称
     * 
     * @return endpointServiceName */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public DcsContentRsp withEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
        return this;
    }

    /** VPC-EP客户端IP
     * 
     * @return endpointIp */
    public String getEndpointIp() {
        return endpointIp;
    }

    public void setEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
    }

    public DcsContentRsp withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** VPC-EP客户端Port minimum: 1 maximum: 65535
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public DcsContentRsp withDcsType(String dcsType) {
        this.dcsType = dcsType;
        return this;
    }

    /** redis实例类型
     * 
     * @return dcsType */
    public String getDcsType() {
        return dcsType;
    }

    public void setDcsType(String dcsType) {
        this.dcsType = dcsType;
    }

    public DcsContentRsp withPassword(String password) {
        this.password = password;
        return this;
    }

    /** redis访问密码
     * 
     * @return password */
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
        DcsContentRsp dcsContentRsp = (DcsContentRsp) o;
        return Objects.equals(this.endpointServiceId, dcsContentRsp.endpointServiceId)
            && Objects.equals(this.endpointServiceName, dcsContentRsp.endpointServiceName)
            && Objects.equals(this.endpointIp, dcsContentRsp.endpointIp)
            && Objects.equals(this.port, dcsContentRsp.port) && Objects.equals(this.dcsType, dcsContentRsp.dcsType)
            && Objects.equals(this.password, dcsContentRsp.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointServiceId, endpointServiceName, endpointIp, port, dcsType, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DcsContentRsp {\n");
        sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
        sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
        sb.append("    endpointIp: ").append(toIndentedString(endpointIp)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    dcsType: ").append(toIndentedString(dcsType)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

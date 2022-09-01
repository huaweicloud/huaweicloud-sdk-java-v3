package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 新测试类型服务信息
 */
public class ServiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    @JacksonXmlProperty(localName = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_host")

    @JacksonXmlProperty(localName = "server_host")

    private String serverHost;

    public ServiceRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 测试类型名称，用于界面显示，不能使用当前保留名，长度小于等于16位字符
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceRequestBody withServerHost(String serverHost) {
        this.serverHost = serverHost;
        return this;
    }

    /**
     * server_host是由用户提供的域名。 我们会通过此域名进行接口调用，请以https/http开头,长度小于等于128位字符。 TestHub将会通过此域名下的接口，保证云测数据与用户系统数据的一致性。
     * @return serverHost
     */
    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceRequestBody serviceRequestBody = (ServiceRequestBody) o;
        return Objects.equals(this.serviceName, serviceRequestBody.serviceName)
            && Objects.equals(this.serverHost, serviceRequestBody.serverHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, serverHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceRequestBody {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serverHost: ").append(toIndentedString(serverHost)).append("\n");
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

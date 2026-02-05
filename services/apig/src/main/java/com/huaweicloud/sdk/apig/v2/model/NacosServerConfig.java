package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * nacos服务端配置信息。
 */
public class NacosServerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grpc_port")

    private Integer grpcPort;

    public NacosServerConfig withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * nacos服务端IP地址。不包含中文字符。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public NacosServerConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * nacos服务端端口号。取值范围1 ~ 65535。
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public NacosServerConfig withGrpcPort(Integer grpcPort) {
        this.grpcPort = grpcPort;
        return this;
    }

    /**
     * nacos服务端gRPC端口号，默认为port+1000。取值范围1 ~ 65535。
     * minimum: 1
     * maximum: 65535
     * @return grpcPort
     */
    public Integer getGrpcPort() {
        return grpcPort;
    }

    public void setGrpcPort(Integer grpcPort) {
        this.grpcPort = grpcPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NacosServerConfig that = (NacosServerConfig) obj;
        return Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.port, that.port)
            && Objects.equals(this.grpcPort, that.grpcPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, port, grpcPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NacosServerConfig {\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    grpcPort: ").append(toIndentedString(grpcPort)).append("\n");
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

package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 类型
 */
public class RouteServerParm  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="back_protocol")
    
    private String backProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;

    public RouteServerParm withBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    


    /**
     * 协议
     * @return backProtocol
     */
    public String getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
    }

    

    public RouteServerParm withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * ip信息
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    public RouteServerParm withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口信息
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouteServerParm routeServerParm = (RouteServerParm) o;
        return Objects.equals(this.backProtocol, routeServerParm.backProtocol) &&
            Objects.equals(this.ip, routeServerParm.ip) &&
            Objects.equals(this.port, routeServerParm.port);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backProtocol, ip, port);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteServerParm {\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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


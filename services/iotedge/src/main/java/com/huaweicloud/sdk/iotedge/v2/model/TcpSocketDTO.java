package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TcpSocketDTO
 */
public class TcpSocketDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    

    private Integer port;

    public TcpSocketDTO withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TcpSocketDTO tcpSocketDTO = (TcpSocketDTO) o;
        return Objects.equals(this.port, tcpSocketDTO.port);
    }
    @Override
    public int hashCode() {
        return Objects.hash(port);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TcpSocketDTO {\n");
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


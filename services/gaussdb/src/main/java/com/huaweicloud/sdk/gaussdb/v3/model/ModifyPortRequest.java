package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModifyPortRequest
 */
public class ModifyPortRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private Integer port;

    public ModifyPortRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口号。  GaussDB(for MySQL)端口号范围：大于等于1024，小于等于65535，不包含端口5342-5345、12017、20000、20201、20202、33062。 
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
        ModifyPortRequest modifyPortRequest = (ModifyPortRequest) o;
        return Objects.equals(this.port, modifyPortRequest.port);
    }
    @Override
    public int hashCode() {
        return Objects.hash(port);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPortRequest {\n");
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


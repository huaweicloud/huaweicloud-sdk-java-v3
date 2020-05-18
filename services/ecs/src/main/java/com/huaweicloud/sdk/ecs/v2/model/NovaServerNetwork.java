package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class NovaServerNetwork  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uuid")
    
    private String uuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ip")
    
    private String fixedIp;

    public NovaServerNetwork withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 网络port uuid。  没有指定网络uuid时必须指定。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public NovaServerNetwork withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * 网络uuid。  没有指定网络port时必须指定。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public NovaServerNetwork withFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }

    


    /**
     * 指定的IP地址。网络的三个参数（port、uuid和fixed_ip）中，port优先级最高；指定fixed_ip时必须指明uuid。
     * @return fixedIp
     */
    public String getFixedIp() {
        return fixedIp;
    }

    public void setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerNetwork novaServerNetwork = (NovaServerNetwork) o;
        return Objects.equals(this.port, novaServerNetwork.port) &&
            Objects.equals(this.uuid, novaServerNetwork.uuid) &&
            Objects.equals(this.fixedIp, novaServerNetwork.fixedIp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(port, uuid, fixedIp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerNetwork {\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
            sb.append("    fixedIp: ").append(toIndentedString(fixedIp)).append("\n");
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


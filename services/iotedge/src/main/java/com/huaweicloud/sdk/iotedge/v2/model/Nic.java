package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 网络网卡信息
 */
public class Nic  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eth")
    
    
    private String eth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    
    private String ip;

    public Nic withEth(String eth) {
        this.eth = eth;
        return this;
    }

    


    /**
     * 网卡信息，如eth0,eth1
     * @return eth
     */
    public String getEth() {
        return eth;
    }

    public void setEth(String eth) {
        this.eth = eth;
    }

    

    public Nic withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * 网卡ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nic nic = (Nic) o;
        return Objects.equals(this.eth, nic.eth) &&
            Objects.equals(this.ip, nic.ip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eth, ip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Nic {\n");
        sb.append("    eth: ").append(toIndentedString(eth)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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


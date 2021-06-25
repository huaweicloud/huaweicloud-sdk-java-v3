package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 独享模式回源服务器配置
 */
public class PremiumWafServer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="front_protocol")
    
    private String frontProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="back_protocol")
    
    private String backProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;

    public PremiumWafServer withFrontProtocol(String frontProtocol) {
        this.frontProtocol = frontProtocol;
        return this;
    }

    


    /**
     * 对外协议
     * @return frontProtocol
     */
    public String getFrontProtocol() {
        return frontProtocol;
    }

    public void setFrontProtocol(String frontProtocol) {
        this.frontProtocol = frontProtocol;
    }

    

    public PremiumWafServer withBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    


    /**
     * 源站协议
     * @return backProtocol
     */
    public String getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
    }

    

    public PremiumWafServer withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 源站地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public PremiumWafServer withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 源站端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public PremiumWafServer withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 源站地址为ipv4或ipv6
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public PremiumWafServer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 源站所在VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafServer premiumWafServer = (PremiumWafServer) o;
        return Objects.equals(this.frontProtocol, premiumWafServer.frontProtocol) &&
            Objects.equals(this.backProtocol, premiumWafServer.backProtocol) &&
            Objects.equals(this.address, premiumWafServer.address) &&
            Objects.equals(this.port, premiumWafServer.port) &&
            Objects.equals(this.type, premiumWafServer.type) &&
            Objects.equals(this.vpcId, premiumWafServer.vpcId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(frontProtocol, backProtocol, address, port, type, vpcId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafServer {\n");
        sb.append("    frontProtocol: ").append(toIndentedString(frontProtocol)).append("\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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


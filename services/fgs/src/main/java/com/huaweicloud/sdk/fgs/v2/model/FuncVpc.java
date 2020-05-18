package com.huaweicloud.sdk.fgs.v2.model;

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
 * 函数vpc配置。
 */
public class FuncVpc  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_name")
    
    private String vpcName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_name")
    
    private String subnetName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway")
    
    private String gateway;

    public FuncVpc withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    


    /**
     * 虚拟私有云名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public FuncVpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云唯一标识。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public FuncVpc withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    


    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public FuncVpc withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网编号。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public FuncVpc withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 子网掩码。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public FuncVpc withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    


    /**
     * 网关。
     * @return gateway
     */
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuncVpc funcVpc = (FuncVpc) o;
        return Objects.equals(this.vpcName, funcVpc.vpcName) &&
            Objects.equals(this.vpcId, funcVpc.vpcId) &&
            Objects.equals(this.subnetName, funcVpc.subnetName) &&
            Objects.equals(this.subnetId, funcVpc.subnetId) &&
            Objects.equals(this.cidr, funcVpc.cidr) &&
            Objects.equals(this.gateway, funcVpc.gateway);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vpcName, vpcId, subnetName, subnetId, cidr, gateway);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncVpc {\n");
            sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
            sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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


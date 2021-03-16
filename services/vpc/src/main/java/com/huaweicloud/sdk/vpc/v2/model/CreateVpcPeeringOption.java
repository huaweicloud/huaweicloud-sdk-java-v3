package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.VpcInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * peering对象
 */
public class CreateVpcPeeringOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_vpc_info")
    
    private VpcInfo requestVpcInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accept_vpc_info")
    
    private VpcInfo acceptVpcInfo;

    public CreateVpcPeeringOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：对等连接名称 取值范围：支持1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateVpcPeeringOption withRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
        return this;
    }

    public CreateVpcPeeringOption withRequestVpcInfo(Consumer<VpcInfo> requestVpcInfoSetter) {
        if(this.requestVpcInfo == null ){
            this.requestVpcInfo = new VpcInfo();
            requestVpcInfoSetter.accept(this.requestVpcInfo);
        }
        
        return this;
    }


    /**
     * Get requestVpcInfo
     * @return requestVpcInfo
     */
    public VpcInfo getRequestVpcInfo() {
        return requestVpcInfo;
    }

    public void setRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
    }

    

    public CreateVpcPeeringOption withAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
        return this;
    }

    public CreateVpcPeeringOption withAcceptVpcInfo(Consumer<VpcInfo> acceptVpcInfoSetter) {
        if(this.acceptVpcInfo == null ){
            this.acceptVpcInfo = new VpcInfo();
            acceptVpcInfoSetter.accept(this.acceptVpcInfo);
        }
        
        return this;
    }


    /**
     * Get acceptVpcInfo
     * @return acceptVpcInfo
     */
    public VpcInfo getAcceptVpcInfo() {
        return acceptVpcInfo;
    }

    public void setAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVpcPeeringOption createVpcPeeringOption = (CreateVpcPeeringOption) o;
        return Objects.equals(this.name, createVpcPeeringOption.name) &&
            Objects.equals(this.requestVpcInfo, createVpcPeeringOption.requestVpcInfo) &&
            Objects.equals(this.acceptVpcInfo, createVpcPeeringOption.acceptVpcInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, requestVpcInfo, acceptVpcInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcPeeringOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    requestVpcInfo: ").append(toIndentedString(requestVpcInfo)).append("\n");
        sb.append("    acceptVpcInfo: ").append(toIndentedString(acceptVpcInfo)).append("\n");
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


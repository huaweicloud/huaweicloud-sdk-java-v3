package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.PostPaidServerIpv6Bandwidth;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 待创建云服务器的网卡信息。
 */
public class PostPaidServerNic  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private PostPaidServerIpv6Bandwidth ipv6Bandwidth = null;

    public PostPaidServerNic withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 待创建云服务器的网卡信息。   需要指定vpcid对应VPC下已创建的网络（network）的ID，UUID格式。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public PostPaidServerNic withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    


    /**
     * 待创建云服务器网卡的IP地址，IPv4格式。  约束：  - 不填或空字符串，默认在子网（subnet）中自动分配一个未使用的IP作网卡的IP地址。 - 若指定IP地址，该IP地址必须在子网（subnet）对应的网段内，且未被使用。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public PostPaidServerNic withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 是否支持ipv6。  取值为true时，标识此网卡支持ipv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public PostPaidServerNic withIpv6Bandwidth(PostPaidServerIpv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public PostPaidServerNic withIpv6Bandwidth(Consumer<PostPaidServerIpv6Bandwidth> ipv6BandwidthSetter) {
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new PostPaidServerIpv6Bandwidth();
        }
        ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public PostPaidServerIpv6Bandwidth getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(PostPaidServerIpv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerNic postPaidServerNic = (PostPaidServerNic) o;
        return Objects.equals(this.subnetId, postPaidServerNic.subnetId) &&
            Objects.equals(this.ipAddress, postPaidServerNic.ipAddress) &&
            Objects.equals(this.ipv6Enable, postPaidServerNic.ipv6Enable) &&
            Objects.equals(this.ipv6Bandwidth, postPaidServerNic.ipv6Bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress, ipv6Enable, ipv6Bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerNic {\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
            sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
            sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
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


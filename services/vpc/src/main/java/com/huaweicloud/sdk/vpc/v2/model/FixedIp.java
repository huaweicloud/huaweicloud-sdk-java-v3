package com.huaweicloud.sdk.vpc.v2.model;

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
public class FixedIp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;

    public FixedIp withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    


    /**
     * 功能说明：端口IP地址,如果同时指定子网ID和IP地址，会尝试将该子网上的IP地址分配给该端口。 如果仅指定子网ID，会将该子网中的可用IP分配给该端口。 如果仅指定IP地址，会尝试分配IP地址（如果该地址是指定网络上任何子网的有效IP）
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public FixedIp withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 功能说明：端口所属子网ID,如果同时指定子网ID和IP地址，会尝试将该子网上的IP地址分配给该端口。 如果仅指定子网ID，会将该子网中的可用IP分配给该端口。 如果仅指定IP地址，会尝试分配IP地址（如果该地址是指定网络上任何子网的有效IP）
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FixedIp fixedIp = (FixedIp) o;
        return Objects.equals(this.ipAddress, fixedIp.ipAddress) &&
            Objects.equals(this.subnetId, fixedIp.subnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, subnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FixedIp {\n");
            sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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


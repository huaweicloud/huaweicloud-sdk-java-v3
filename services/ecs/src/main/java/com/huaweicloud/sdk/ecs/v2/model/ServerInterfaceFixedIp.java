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
 * ServerInterfaceFixedIp
 */
public class ServerInterfaceFixedIp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;

    public ServerInterfaceFixedIp withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    


    /**
     * 网卡私网IP信息。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ServerInterfaceFixedIp withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 网卡私网IP对应子网信息。
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
        ServerInterfaceFixedIp serverInterfaceFixedIp = (ServerInterfaceFixedIp) o;
        return Objects.equals(this.ipAddress, serverInterfaceFixedIp.ipAddress) &&
            Objects.equals(this.subnetId, serverInterfaceFixedIp.subnetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, subnetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerInterfaceFixedIp {\n");
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


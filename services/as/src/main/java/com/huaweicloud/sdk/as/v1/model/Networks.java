package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.Ipv6Bandwidth;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 网络信息
 */
public class Networks  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_enable")
    
    private Boolean ipv6Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private Ipv6Bandwidth ipv6Bandwidth = null;

    public Networks withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 网络ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Networks withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    


    /**
     * 是否启用IPv6。取值为true时，标识此网卡已启用IPv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public Networks withIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public Networks withIpv6Bandwidth(Consumer<Ipv6Bandwidth> ipv6BandwidthSetter) {
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new Ipv6Bandwidth();
        }
        ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public Ipv6Bandwidth getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
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
        Networks networks = (Networks) o;
        return Objects.equals(this.id, networks.id) &&
            Objects.equals(this.ipv6Enable, networks.ipv6Enable) &&
            Objects.equals(this.ipv6Bandwidth, networks.ipv6Bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ipv6Enable, ipv6Bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Networks {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
public class Route  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination")
    
    private String destination;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nexthop")
    
    private String nexthop;

    public Route withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    


    /**
     * 功能说明：路由目的地 取值范围：IP地址段 约束：仅支持配置默认路由，且其取值只能是0.0.0.0/0
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Route withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    


    /**
     * 功能说明：路由下一跳IP地址 取值范围：ipv4地址格式 约束：nexthop仅支持所关联的子网范围内IP地址
     * @return nexthop
     */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Route route = (Route) o;
        return Objects.equals(this.destination, route.destination) &&
            Objects.equals(this.nexthop, route.nexthop);
    }
    @Override
    public int hashCode() {
        return Objects.hash(destination, nexthop);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Route {\n");
            sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
            sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
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


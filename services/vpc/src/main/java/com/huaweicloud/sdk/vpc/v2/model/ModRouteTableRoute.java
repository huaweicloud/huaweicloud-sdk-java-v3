package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改路由条目的字段
 */
public class ModRouteTableRoute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ModRouteTableRoute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 功能说明：路由的类型 取值范围： ecs：弹性云服务器 eni：网卡 vip：虚拟IP nat：NAT网关 peering：对等连接 vpn：虚拟专用网络 dc：云专线 cc：云连接 egw：VPC终端节点 er：企业路由器 subeni：辅助弹性网卡 local：保留网段，用户下发路由的目的网段不能和local类型路由的目的网段有重叠
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModRouteTableRoute withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 功能说明：路由目的网段 约束：合法的CIDR格式
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ModRouteTableRoute withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    /**
     * 功能说明：路由下一跳对象的ID 取值范围： 当type为ecs时，传入ecs实例ID； 当type为eni时，取值为从网卡ID； 当type为vip时，取值为vip对应的IP地址； 当type为nat时，取值为nat实例对应的ID； 当type为peering时，取值为peering对应实例ID； 当type为vpn时，取值为vpn实例ID； 当type为dc时，取值为dc实例ID; 当type为cc时，取值为cc的实例ID； 当type为egw时，取值为vpc终端节点的实例ID； 当type为er时，取值为企业路由器的实例ID； 当type为subeni时，取值为辅助弹性网卡的实例ID。
     * @return nexthop
     */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public ModRouteTableRoute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：路由的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModRouteTableRoute that = (ModRouteTableRoute) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.nexthop, that.nexthop) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, destination, nexthop, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModRouteTableRoute {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

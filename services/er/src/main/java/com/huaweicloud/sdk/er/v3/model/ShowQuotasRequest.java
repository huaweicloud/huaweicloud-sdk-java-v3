package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "erId")

    private List<String> erId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routeTableId")

    private List<String> routeTableId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private List<String> vpcId = null;

    public ShowQuotasRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ShowQuotasRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ShowQuotasRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 支持过滤的配额类型： - er_instance: 企业路由器实例的配额和使用量 - dc_attachment: 云专线网关连接的配额和使用量 - vpc_attachment: VPC连接的配额和使用量 - vpn_attachment: VPN网关连接的配额和使用量 - peering_attachment：云连接实例连接的配额和使用量 - can_attachment: 智能接入网关连接的配额和使用量 - route_table: 路由表的配额和使用量 - static_route: 静态路由的配额和使用量 - vpc_er: 每个vpc可以接入的企业路由器数量和当前使用量 - flow_log: 每个连接可以创建的流日志数量
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ShowQuotasRequest withErId(List<String> erId) {
        this.erId = erId;
        return this;
    }

    public ShowQuotasRequest addErIdItem(String erIdItem) {
        if (this.erId == null) {
            this.erId = new ArrayList<>();
        }
        this.erId.add(erIdItem);
        return this;
    }

    public ShowQuotasRequest withErId(Consumer<List<String>> erIdSetter) {
        if (this.erId == null) {
            this.erId = new ArrayList<>();
        }
        erIdSetter.accept(this.erId);
        return this;
    }

    /**
     * Get erId
     * @return erId
     */
    public List<String> getErId() {
        return erId;
    }

    public void setErId(List<String> erId) {
        this.erId = erId;
    }

    public ShowQuotasRequest withRouteTableId(List<String> routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    public ShowQuotasRequest addRouteTableIdItem(String routeTableIdItem) {
        if (this.routeTableId == null) {
            this.routeTableId = new ArrayList<>();
        }
        this.routeTableId.add(routeTableIdItem);
        return this;
    }

    public ShowQuotasRequest withRouteTableId(Consumer<List<String>> routeTableIdSetter) {
        if (this.routeTableId == null) {
            this.routeTableId = new ArrayList<>();
        }
        routeTableIdSetter.accept(this.routeTableId);
        return this;
    }

    /**
     * Get routeTableId
     * @return routeTableId
     */
    public List<String> getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(List<String> routeTableId) {
        this.routeTableId = routeTableId;
    }

    public ShowQuotasRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ShowQuotasRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ShowQuotasRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasRequest that = (ShowQuotasRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.erId, that.erId)
            && Objects.equals(this.routeTableId, that.routeTableId) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, erId, routeTableId, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
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

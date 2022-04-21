package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class RouteTableResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    private List<RouteTableRoute> routes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<SubnetList> subnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RouteTableResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：路由表ID  取值范围：标准UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RouteTableResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：路由表名称  取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouteTableResp withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 功能说明：是否为默认路由表  取值范围：true表示默认路由表；false表示自定义路由表
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public RouteTableResp withRoutes(List<RouteTableRoute> routes) {
        this.routes = routes;
        return this;
    }

    public RouteTableResp addRoutesItem(RouteTableRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public RouteTableResp withRoutes(Consumer<List<RouteTableRoute>> routesSetter) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 功能说明：路由对象，参见route字段说明。  约束：每个路由表最大关联200条路由
     * @return routes
     */
    public List<RouteTableRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteTableRoute> routes) {
        this.routes = routes;
    }

    public RouteTableResp withSubnets(List<SubnetList> subnets) {
        this.subnets = subnets;
        return this;
    }

    public RouteTableResp addSubnetsItem(SubnetList subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public RouteTableResp withSubnets(Consumer<List<SubnetList>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 功能说明：路由表所关联的子网  约束：只能关联路由表所属VPC下的子网
     * @return subnets
     */
    public List<SubnetList> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<SubnetList> subnets) {
        this.subnets = subnets;
    }

    public RouteTableResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public RouteTableResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 路由表所在的虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RouteTableResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：路由表描述信息  取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RouteTableResp routeTableResp = (RouteTableResp) o;
        return Objects.equals(this.id, routeTableResp.id) && Objects.equals(this.name, routeTableResp.name)
            && Objects.equals(this._default, routeTableResp._default)
            && Objects.equals(this.routes, routeTableResp.routes)
            && Objects.equals(this.subnets, routeTableResp.subnets)
            && Objects.equals(this.tenantId, routeTableResp.tenantId)
            && Objects.equals(this.vpcId, routeTableResp.vpcId)
            && Objects.equals(this.description, routeTableResp.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, _default, routes, subnets, tenantId, vpcId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteTableResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

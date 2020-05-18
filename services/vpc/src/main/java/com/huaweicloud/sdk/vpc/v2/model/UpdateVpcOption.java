package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.Route;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class UpdateVpcOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="routes")
    
    private List<Route> routes = null;
    
    public UpdateVpcOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：虚拟私有云名称  取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）  约束：如果名称不为空，则同一个租户下的VPC不允许重名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVpcOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：虚拟私有云的描述  取值范围：0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVpcOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 功能说明：虚拟私有云下可用子网的范围  取值范围：  - 10.0.0.0/8 ~ 10.255.255.240/28 - 172.16.0.0/12 ~ 172.31.255.240/28 - 192.168.0.0/16 ~ 192.168.255.240/28  约束：必须是ipv4 cidr格式，例如：192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public UpdateVpcOption withRoutes(List<Route> routes) {
        this.routes = routes;
        return this;
    }

    
    public UpdateVpcOption addRoutesItem(Route routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public UpdateVpcOption withRoutes(Consumer<List<Route>> routesSetter) {
        if(this.routes == null ){
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 功能说明：路由信息列表，详情参见route对象
     * @return routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcOption updateVpcOption = (UpdateVpcOption) o;
        return Objects.equals(this.name, updateVpcOption.name) &&
            Objects.equals(this.description, updateVpcOption.description) &&
            Objects.equals(this.cidr, updateVpcOption.cidr) &&
            Objects.equals(this.routes, updateVpcOption.routes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, cidr, routes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcOption {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
            sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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


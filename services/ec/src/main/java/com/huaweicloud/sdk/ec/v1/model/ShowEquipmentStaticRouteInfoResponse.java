package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEquipmentStaticRouteInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_routes")

    private List<StaticRouteItem> staticRoutes = null;

    public ShowEquipmentStaticRouteInfoResponse withStaticRoutes(List<StaticRouteItem> staticRoutes) {
        this.staticRoutes = staticRoutes;
        return this;
    }

    public ShowEquipmentStaticRouteInfoResponse addStaticRoutesItem(StaticRouteItem staticRoutesItem) {
        if (this.staticRoutes == null) {
            this.staticRoutes = new ArrayList<>();
        }
        this.staticRoutes.add(staticRoutesItem);
        return this;
    }

    public ShowEquipmentStaticRouteInfoResponse withStaticRoutes(Consumer<List<StaticRouteItem>> staticRoutesSetter) {
        if (this.staticRoutes == null) {
            this.staticRoutes = new ArrayList<>();
        }
        staticRoutesSetter.accept(this.staticRoutes);
        return this;
    }

    /**
     * 设备静态路由配置列表
     * @return staticRoutes
     */
    public List<StaticRouteItem> getStaticRoutes() {
        return staticRoutes;
    }

    public void setStaticRoutes(List<StaticRouteItem> staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEquipmentStaticRouteInfoResponse that = (ShowEquipmentStaticRouteInfoResponse) obj;
        return Objects.equals(this.staticRoutes, that.staticRoutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staticRoutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentStaticRouteInfoResponse {\n");
        sb.append("    staticRoutes: ").append(toIndentedString(staticRoutes)).append("\n");
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

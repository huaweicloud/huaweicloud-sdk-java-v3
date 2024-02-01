package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改数据库代理路由模式请求体。
 */
public class ModifyMySqlProxyRouteModeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_weight")

    private Integer masterWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_instances")

    private List<InstancesWeight> readonlyInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private Integer routeMode;

    public ModifyMySqlProxyRouteModeRequest withMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
        return this;
    }

    /**
     * 数据库主实例读权重。     - 当route_mode选择0（权重负载）时，该字段取值范围为0~1000。     - 当route_mode选择1或2（负载均衡）时，该字段不生效。
     * @return masterWeight
     */
    public Integer getMasterWeight() {
        return masterWeight;
    }

    public void setMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
    }

    public ModifyMySqlProxyRouteModeRequest withReadonlyInstances(List<InstancesWeight> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
        return this;
    }

    public ModifyMySqlProxyRouteModeRequest addReadonlyInstancesItem(InstancesWeight readonlyInstancesItem) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        this.readonlyInstances.add(readonlyInstancesItem);
        return this;
    }

    public ModifyMySqlProxyRouteModeRequest withReadonlyInstances(
        Consumer<List<InstancesWeight>> readonlyInstancesSetter) {
        if (this.readonlyInstances == null) {
            this.readonlyInstances = new ArrayList<>();
        }
        readonlyInstancesSetter.accept(this.readonlyInstances);
        return this;
    }

    /**
     * 数据库节点的读权重设置。      - 只能为只读实例选择权重。     - 该列表可以为空列表。
     * @return readonlyInstances
     */
    public List<InstancesWeight> getReadonlyInstances() {
        return readonlyInstances;
    }

    public void setReadonlyInstances(List<InstancesWeight> readonlyInstances) {
        this.readonlyInstances = readonlyInstances;
    }

    public ModifyMySqlProxyRouteModeRequest withRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 数据库代理路由模式。 取值范围:     0：表示权重负载模式。     1：表示负载均衡模式（数据库主实例不接受读请求）。     2：表示负载均衡模式（数据库主实例接受读请求）。      - 如需使用负载均衡模式，请联系客服申请
     * @return routeMode
     */
    public Integer getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyMySqlProxyRouteModeRequest that = (ModifyMySqlProxyRouteModeRequest) obj;
        return Objects.equals(this.masterWeight, that.masterWeight)
            && Objects.equals(this.readonlyInstances, that.readonlyInstances)
            && Objects.equals(this.routeMode, that.routeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterWeight, readonlyInstances, routeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyMySqlProxyRouteModeRequest {\n");
        sb.append("    masterWeight: ").append(toIndentedString(masterWeight)).append("\n");
        sb.append("    readonlyInstances: ").append(toIndentedString(readonlyInstances)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
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

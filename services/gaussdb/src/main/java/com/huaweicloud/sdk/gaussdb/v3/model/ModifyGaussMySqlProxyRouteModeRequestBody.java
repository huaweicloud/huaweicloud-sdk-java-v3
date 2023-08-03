package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * proxy实例修改路由模式请求体
 */
public class ModifyGaussMySqlProxyRouteModeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private Integer routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_weight")

    private Integer masterWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_nodes")

    private List<ModifyProxyRouteWeightReadonlyNode> readonlyNodes = null;

    public ModifyGaussMySqlProxyRouteModeRequestBody withRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 数据库代理路由模式。  取值范围： - 0，表示权重负载模式。 - 1，表示负载均衡模式（数据库主节点不接受读请求）。 - 2，表示负载均衡模式（数据库主节点接受读请求）。
     * @return routeMode
     */
    public Integer getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
    }

    public ModifyGaussMySqlProxyRouteModeRequestBody withMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
        return this;
    }

    /**
     * 主节点权重： - 如果路由模式为0，取值为0~1000。 - 如果路由模式为1，取值为0。 - 如果路由模式为2，取值为1。
     * @return masterWeight
     */
    public Integer getMasterWeight() {
        return masterWeight;
    }

    public void setMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
    }

    public ModifyGaussMySqlProxyRouteModeRequestBody withReadonlyNodes(
        List<ModifyProxyRouteWeightReadonlyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
        return this;
    }

    public ModifyGaussMySqlProxyRouteModeRequestBody addReadonlyNodesItem(
        ModifyProxyRouteWeightReadonlyNode readonlyNodesItem) {
        if (this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        this.readonlyNodes.add(readonlyNodesItem);
        return this;
    }

    public ModifyGaussMySqlProxyRouteModeRequestBody withReadonlyNodes(
        Consumer<List<ModifyProxyRouteWeightReadonlyNode>> readonlyNodesSetter) {
        if (this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        readonlyNodesSetter.accept(this.readonlyNodes);
        return this;
    }

    /**
     * 只读节点权重配置信息。
     * @return readonlyNodes
     */
    public List<ModifyProxyRouteWeightReadonlyNode> getReadonlyNodes() {
        return readonlyNodes;
    }

    public void setReadonlyNodes(List<ModifyProxyRouteWeightReadonlyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyGaussMySqlProxyRouteModeRequestBody that = (ModifyGaussMySqlProxyRouteModeRequestBody) obj;
        return Objects.equals(this.routeMode, that.routeMode) && Objects.equals(this.masterWeight, that.masterWeight)
            && Objects.equals(this.readonlyNodes, that.readonlyNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeMode, masterWeight, readonlyNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyGaussMySqlProxyRouteModeRequestBody {\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    masterWeight: ").append(toIndentedString(masterWeight)).append("\n");
        sb.append("    readonlyNodes: ").append(toIndentedString(readonlyNodes)).append("\n");
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

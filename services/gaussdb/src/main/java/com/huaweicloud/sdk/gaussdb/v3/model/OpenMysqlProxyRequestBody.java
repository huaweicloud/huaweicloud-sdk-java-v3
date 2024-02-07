package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenMysqlProxyRequestBody
 */
public class OpenMysqlProxyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_name")

    private String proxyName;

    /**
     * 代理实例类型。默认类型为readwrite。
     */
    public static final class ProxyModeEnum {

        /**
         * Enum READWRITE for value: "readwrite"
         */
        public static final ProxyModeEnum READWRITE = new ProxyModeEnum("readwrite");

        /**
         * Enum READONLY for value: "readonly"
         */
        public static final ProxyModeEnum READONLY = new ProxyModeEnum("readonly");

        private static final Map<String, ProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProxyModeEnum> createStaticFields() {
            Map<String, ProxyModeEnum> map = new HashMap<>();
            map.put("readwrite", READWRITE);
            map.put("readonly", READONLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProxyModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProxyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProxyModeEnum(value));
        }

        public static ProxyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProxyModeEnum) {
                return this.value.equals(((ProxyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_mode")

    private ProxyModeEnum proxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private Integer routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes_read_weight")

    private List<NodesWeight> nodesReadWeight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_node_auto_add_status")

    private String newNodeAutoAddStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_node_weight")

    private Integer newNodeWeight;

    public OpenMysqlProxyRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 代理规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public OpenMysqlProxyRequestBody withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 代理实例节点数，取值整数2-32。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public OpenMysqlProxyRequestBody withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    /**
     * 代理实例名称。用于表示实例的名称，同一租户下，同类型的实例名可重名。  取值范围：最小为4个字符，最大为64个字符且不超过64个字节（注意：一个中文字符占用3个字节），必须以字母或中文开头，区分大小写，可以包含字母、数字、中划线、下划线或中文，不能包含其他特殊字符。
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public OpenMysqlProxyRequestBody withProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }

    /**
     * 代理实例类型。默认类型为readwrite。
     * @return proxyMode
     */
    public ProxyModeEnum getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(ProxyModeEnum proxyMode) {
        this.proxyMode = proxyMode;
    }

    public OpenMysqlProxyRequestBody withRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 数据库代理路由模式，默认为权重负载模式。  取值范围: - 0，表示权重负载模式; - 1，表示负载均衡模式（数据库主节点不接受读请求）； - 2，表示负载均衡模式（数据库主节点接受读请求）。
     * @return routeMode
     */
    public Integer getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
    }

    public OpenMysqlProxyRequestBody withNodesReadWeight(List<NodesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
        return this;
    }

    public OpenMysqlProxyRequestBody addNodesReadWeightItem(NodesWeight nodesReadWeightItem) {
        if (this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        this.nodesReadWeight.add(nodesReadWeightItem);
        return this;
    }

    public OpenMysqlProxyRequestBody withNodesReadWeight(Consumer<List<NodesWeight>> nodesReadWeightSetter) {
        if (this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        nodesReadWeightSetter.accept(this.nodesReadWeight);
        return this;
    }

    /**
     * 数据库节点的读权重设置。  在proxy_mode为readonly时，只能为只读节点选择权重。
     * @return nodesReadWeight
     */
    public List<NodesWeight> getNodesReadWeight() {
        return nodesReadWeight;
    }

    public void setNodesReadWeight(List<NodesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
    }

    public OpenMysqlProxyRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 数据库VPC下的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public OpenMysqlProxyRequestBody withNewNodeAutoAddStatus(String newNodeAutoAddStatus) {
        this.newNodeAutoAddStatus = newNodeAutoAddStatus;
        return this;
    }

    /**
     * 是否开启新增节点自动加入该Proxy。如果需要设置是否开启新增节点自动加入该Proxy，请联系客服人员添加白名单，加入白名单后，方可输入该字段。  取值范围： - ON：开启。 - OFF：关闭。
     * @return newNodeAutoAddStatus
     */
    public String getNewNodeAutoAddStatus() {
        return newNodeAutoAddStatus;
    }

    public void setNewNodeAutoAddStatus(String newNodeAutoAddStatus) {
        this.newNodeAutoAddStatus = newNodeAutoAddStatus;
    }

    public OpenMysqlProxyRequestBody withNewNodeWeight(Integer newNodeWeight) {
        this.newNodeWeight = newNodeWeight;
        return this;
    }

    /**
     * 新增节点的读权重：    - 如果路由模式为0，新增节点自动加入为ON，取值为0~1000。 - 如果路由模式不为0或新增节点自动加入为OFF，则可不输入读权重。
     * @return newNodeWeight
     */
    public Integer getNewNodeWeight() {
        return newNodeWeight;
    }

    public void setNewNodeWeight(Integer newNodeWeight) {
        this.newNodeWeight = newNodeWeight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenMysqlProxyRequestBody that = (OpenMysqlProxyRequestBody) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.proxyName, that.proxyName) && Objects.equals(this.proxyMode, that.proxyMode)
            && Objects.equals(this.routeMode, that.routeMode)
            && Objects.equals(this.nodesReadWeight, that.nodesReadWeight)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.newNodeAutoAddStatus, that.newNodeAutoAddStatus)
            && Objects.equals(this.newNodeWeight, that.newNodeWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef,
            nodeNum,
            proxyName,
            proxyMode,
            routeMode,
            nodesReadWeight,
            subnetId,
            newNodeAutoAddStatus,
            newNodeWeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenMysqlProxyRequestBody {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    nodesReadWeight: ").append(toIndentedString(nodesReadWeight)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    newNodeAutoAddStatus: ").append(toIndentedString(newNodeAutoAddStatus)).append("\n");
        sb.append("    newNodeWeight: ").append(toIndentedString(newNodeWeight)).append("\n");
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

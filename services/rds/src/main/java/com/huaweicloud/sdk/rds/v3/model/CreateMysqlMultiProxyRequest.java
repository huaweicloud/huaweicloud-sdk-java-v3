package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 开启数据库代理请求体。
 */
public class CreateMysqlMultiProxyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_name")

    private String proxyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_mode")

    private String proxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private Integer routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes_read_weight")

    private List<InstancesWeight> nodesReadWeight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    public CreateMysqlMultiProxyRequest withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 数据库代理规格码。      - 当局点支持主备模式数据库代理时，该字段不生效。     - 当局点支持集群模式数据库代理时，该字段请参考查询数据库代理规格信息接口返回体中，[规格信息]中的code字段。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateMysqlMultiProxyRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 数据库代理节点数量。      - 当局点支持主备模式数据库代理时，请设置该字段为固定值2。     - 当局点支持集群模式数据库代理时，该字段最小值为2，最大值请参考查询数据库代理信息列表接口返回体中，[数据库代理信息列表]中的max_proxy_node_num字段值。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateMysqlMultiProxyRequest withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    /**
     * 数据库代理名称。用于表示实例的名称，同一租户下，同类型的实例名可重名。  取值范围：最小长度为4个字符，最大不超过64个字节，以字母或中文字符开头，只能包含字母、数字、中划线、下划线、英文句号和中文。  当不选择该参数或局点仅支持主备模式数据库代理时，将随机生成名称。
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public CreateMysqlMultiProxyRequest withProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }

    /**
     * 数据库代理读写模式。 取值范围:     readwrite：读写模式。     readonly：只读模式。
     * @return proxyMode
     */
    public String getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
    }

    public CreateMysqlMultiProxyRequest withRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 数据库代理路由模式。 取值范围:     0：表示权重负载模式。     1：表示负载均衡模式（数据库主节点不接受读请求）。     2：表示负载均衡模式（数据库主节点接受读请求）。      - 如需使用负载均衡模式，请联系客服申请
     * @return routeMode
     */
    public Integer getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(Integer routeMode) {
        this.routeMode = routeMode;
    }

    public CreateMysqlMultiProxyRequest withNodesReadWeight(List<InstancesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
        return this;
    }

    public CreateMysqlMultiProxyRequest addNodesReadWeightItem(InstancesWeight nodesReadWeightItem) {
        if (this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        this.nodesReadWeight.add(nodesReadWeightItem);
        return this;
    }

    public CreateMysqlMultiProxyRequest withNodesReadWeight(Consumer<List<InstancesWeight>> nodesReadWeightSetter) {
        if (this.nodesReadWeight == null) {
            this.nodesReadWeight = new ArrayList<>();
        }
        nodesReadWeightSetter.accept(this.nodesReadWeight);
        return this;
    }

    /**
     * 数据库节点的读权重设置。      - 在proxy_mode（数据库代理读写模式）为readonly（只读模式）或者在route_mode（路由模式）>0时，只能为只读节点选择权重。     - 在proxy_mode（数据库代理读写模式）为readonly（只读模式）时，需要至少为一个只读实例配置权重。     - 在route_mode（路由模式）>0时，为主实例配置的权重将不生效。     - 该列表可以为空列表。
     * @return nodesReadWeight
     */
    public List<InstancesWeight> getNodesReadWeight() {
        return nodesReadWeight;
    }

    public void setNodesReadWeight(List<InstancesWeight> nodesReadWeight) {
        this.nodesReadWeight = nodesReadWeight;
    }

    public CreateMysqlMultiProxyRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 数据库VPC下的子网ID。 取值范围为该实例所在VPC下的所有子网ID。      - 如需使用该参数，请联系客服申请。     - 获取子网ID请参考[创建VPC和子网](https://support.huaweicloud.com/api-cce/cce_02_0100.html)
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMysqlMultiProxyRequest that = (CreateMysqlMultiProxyRequest) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.proxyName, that.proxyName) && Objects.equals(this.proxyMode, that.proxyMode)
            && Objects.equals(this.routeMode, that.routeMode)
            && Objects.equals(this.nodesReadWeight, that.nodesReadWeight)
            && Objects.equals(this.subnetId, that.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, nodeNum, proxyName, proxyMode, routeMode, nodesReadWeight, subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMysqlMultiProxyRequest {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    nodesReadWeight: ").append(toIndentedString(nodesReadWeight)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

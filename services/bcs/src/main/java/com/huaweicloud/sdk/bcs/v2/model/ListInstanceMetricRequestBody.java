package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BCS组织实例监控数据详情查询请求结构
 */
public class ListInstanceMetricRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_name")

    private String entityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    public ListInstanceMetricRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实体类型，[可选值如下: org(包括代理节点baas-agent、共识节点orderer、记账节点peer), plugin(插件)] 默认为org 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListInstanceMetricRequestBody withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * 所属实体的名称，即区块链服务详情页面的“区块链实例”中各节点的名称（代理节点、共识节点、记账节点）
     * @return entityName
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public ListInstanceMetricRequestBody withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 具体实例的名称。若当前区块链服务部署在CCE集群上，该名称为各节点对应的负载（pod）名称；若当前区块链服务部署在IEF集群上，可进入“智能边缘平台”服务，进入“边缘应用”->“容器应用”，查询负载名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceMetricRequestBody that = (ListInstanceMetricRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.entityName, that.entityName)
            && Objects.equals(this.instanceName, that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, entityName, instanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceMetricRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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

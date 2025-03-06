package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIpNumRequirementRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public ShowIpNumRequirementRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 创建实例或扩容节点的个数。最大支持输入200。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowIpNumRequirementRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 数据库引擎名称。没有传入实例ID的时候该字段为必传。 - 取值为“cassandra”，表示GeminiDB Cassandra数据库引擎。 - 取值为“mongodb”，表示GeminiDB Mongo数据库引擎。 - 取值为“influxdb”，表示GeminiDB Influx数据库引擎。 - 取值为“redis”，表示GeminiDB Redis数据库引擎。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ShowIpNumRequirementRequest withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 实例类型。没有传入实例ID的时候该字段为必传。   -  取值为“Cluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis Proxy经典部署模式集群实例类型。   -  取值为“CloudNativeCluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis云原生部署模式集群实例类型。   -  取值为“RedisCluster”，表示GeminiDB Redis Cluster经典部署模式集群实例类型。   -  取值为“Replication”，表示GeminiDB Redis经典部署模式主备实例类型。   -  取值为“InfluxdbSingle”，表示GeminiDB Influx经典部署模式单节点实例类型。   -  取值为“ReplicaSet”，表示GeminiDB Mongo副本集实例类型。
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public ShowIpNumRequirementRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例Id，可以调用5.3.3 查询实例列表和详情接口获取。如果未申请实例，可以调用5.3.1 创建实例接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpNumRequirementRequest that = (ShowIpNumRequirementRequest) obj;
        return Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.instanceMode, that.instanceMode) && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, engineName, instanceMode, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpNumRequirementRequest {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

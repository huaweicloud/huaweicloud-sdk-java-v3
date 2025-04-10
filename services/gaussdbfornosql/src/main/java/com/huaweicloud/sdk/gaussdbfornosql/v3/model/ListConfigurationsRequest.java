package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConfigurationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public ListConfigurationsRequest withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 【参数解释】 数据库名称。 【约束限制】 不限制。 【取值范围】 cassandra：表示支持GeminiDB Cassandra实例。 redis：表示支持GeminiDB Redis实例。 influxdb：表示支持GeminiDB Influx实例。 mongodb： 表示支持GeminiDB Mongo实例。 【默认取值】 不传该参数，则表示查询所有数据库类型。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ListConfigurationsRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 【参数解释】 数据库实例类型。 【约束限制】 不限制。 【取值范围】 * 取值为“CloudNativeCluster”, 表示查询支持GeminiDB Cassandra云原生部署模式实例的参数模板。 * 取值为“Cluster”, 表示查询GeminiDB Cassandra经典部署模式实例、GeminiDB Influx经典部署模式实例、GeminiDB Redis Proxy集群经典部署模式实例支持的参数模板。 * 取值为“Replication”, 表示查询支持GeminiDB Redis经典部署模式主备类型实例的参数组。 * 取值为“InfluxdbSingle”, 表示查询支持GeminiDB Influx经典部署模式单节点类型实例的参数组。 * 取值为“ReplicaSet”, 表示查询支持GeminiDB Mongo副本集类型实例的参数组。 * 取值为“All”， 表示查询所有部署模式的参数模板。 【默认取值】 不传该参数，则表示查询经典部署模式实例支持的参数组。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigurationsRequest that = (ListConfigurationsRequest) obj;
        return Objects.equals(this.datastoreName, that.datastoreName) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreName, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsRequest {\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

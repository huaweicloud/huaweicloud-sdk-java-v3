package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    public ShowQuotasRequest withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型。 取值为“cassandra”，表示查询GeminiDB Cassandra数据库实例配额。 取值为“mongodb”，表示GeminiDB Mongo查询数据库实例配额。 取值为“influxdb”，表示查询GeminiDB Influx数据库实例配额。 取值为“redis”，表示查询GeminiDB Redis数据库实例配额。 如果不传该参数，表示查询所有数据库实例配额。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ShowQuotasRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型。   - 取值为“Cluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis Proxy经典部署模式集群实例类型。   - 取值为“CloudNativeCluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis云原生部署模式集群实例类型。   - 取值为“RedisCluster”，表示GeminiDB Redis Cluster经典部署模式集群实例类型。   - 取值为“Replication”，表示GeminiDB Redis经典部署模式主备实例类型。   - 取值为“InfluxdbSingle”，表示GeminiDB Influx经典部署模式单节点实例类型。   - 取值为“ReplicaSet”，表示GeminiDB Mongo副本集实例类型。   - 如果不传datastore_type参数，自动忽略该参数设置。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ShowQuotasRequest withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 产品类型。   -  Capacity 容量型   -  Standard 标准型 当查询GeminiDB redis云原生部署模式集群类型配额必传此参数。
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasRequest that = (ShowQuotasRequest) obj;
        return Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.productType, that.productType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, mode, productType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRequest {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

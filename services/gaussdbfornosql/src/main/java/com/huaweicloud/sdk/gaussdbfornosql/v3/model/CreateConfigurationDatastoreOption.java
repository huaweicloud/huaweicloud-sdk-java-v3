package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库对象。
 */
public class CreateConfigurationDatastoreOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public CreateConfigurationDatastoreOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 数据库类型。 **约束限制：** 不涉及。 **取值范围：** - GeminiDB Cassandra实例取值为“cassandra”。 - GeminiDB Mongo实例取值为\"mongodb\"。 - GeminiDB Influx实例取值为\"influxdb\"。 - GeminiDB Redis实例取值为\"redis\"。 - GeminiDB DynamoDB实例取值为\"dynamodb\"。 - GeminiDB HBase实例取值为\"hbase\"。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateConfigurationDatastoreOption withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 数据库版本。 **约束限制：** 不涉及。 **取值范围：** - GeminiDB Cassandra实例支持3.11版本，取值为“3.11”。 - GeminiDB Mongo实例支持4.0版本，取值为\\\"4.0\\\"。 - GeminiDB Influx实例支持1.8版本，取值\\\"1.8\\\"。 - GeminiDB Redis实例支持5.0版本，取值\\\"5.0\\\"。 **默认取值：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateConfigurationDatastoreOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释：** 数据库实例类型。 **约束限制：** 当创建支持GeminiDB Mongo、GeminiDB Cassandra云原生部署模式实例的参数模板， 该参数必选。 **取值范围：** - GeminiDB Mongo副本集实例取值为\\\"ReplicaSet\\\"。 - GeminiDB Influx 单节点实例取值为\\\"InfluxdbSingle\\\"。 - GeminiDB Influx 集群增强版实例取值为\\\"EnhancedCluster\\\"。 - GeminiDB Cassandra云原生部署模式实例取值为\\\"CloudNativeCluster\\\"。 - GeminiDB Influx 云原生部署模式实例取值为\\\"CloudNativeCluster\\\"。 - GeminiDB Redis云原生部署模式实例取值为\\\"CloudNativeCluster\\\"。 **默认取值：** 不传该参数，对GeminiDB Cassandra实例默认创建支持经典部署模式实例的参数模板。
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
        CreateConfigurationDatastoreOption that = (CreateConfigurationDatastoreOption) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationDatastoreOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

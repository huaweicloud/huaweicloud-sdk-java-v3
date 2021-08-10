package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 数据库对象。 */
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

    /** 数据库类型。 - GaussDB(for Cassandra)实例取值为“cassandra”。 - GaussDB(for Mongo)实例取值为\"mongodb\"。 - GaussDB(for
     * Influx)实例取值为\"influxdb\"。
     * 
     * @return type */
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

    /** 数据库版本。 - GaussDB(for Cassandra)实例支持3.11版本，取值为“3.11”。 - GaussDB(for Mongo)实例支持3.4、4.0版本，取值为\"3.4\"或\"4.0\"。 -
     * GaussDB(for Influx)实例支持1.7版本，取值\"1.7\"。
     * 
     * @return version */
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

    /** 数据库部署模式，GaussDB(for Mongo)该参数必选。 - GaussDB(for Mongo) 集群实例取值为\"Sharding\"。 - GaussDB(for Mongo)
     * 副本集实例取值为\"ReplicaSet\"。
     * 
     * @return mode */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationDatastoreOption createConfigurationDatastoreOption = (CreateConfigurationDatastoreOption) o;
        return Objects.equals(this.type, createConfigurationDatastoreOption.type)
            && Objects.equals(this.version, createConfigurationDatastoreOption.version)
            && Objects.equals(this.mode, createConfigurationDatastoreOption.mode);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

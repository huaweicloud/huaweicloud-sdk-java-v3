package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 引擎类型，目前只支持elasticsearch。
 */
public class CreateClusterDatastoreBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateClusterDatastoreBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * CSS集群引擎版本号。详细请参考CSS[支持的集群版本](css_03_0056.xml)。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateClusterDatastoreBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 引擎类型，支持elasticsearch。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterDatastoreBody createClusterDatastoreBody = (CreateClusterDatastoreBody) o;
        return Objects.equals(this.version, createClusterDatastoreBody.version)
            && Objects.equals(this.type, createClusterDatastoreBody.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterDatastoreBody {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

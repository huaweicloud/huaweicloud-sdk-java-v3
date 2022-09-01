package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatastoresRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    @JacksonXmlProperty(localName = "datastore_name")

    private String datastoreName;

    public ListDatastoresRequest withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 数据库类型。   - GaussDB(for Cassandra)数据库实例，取值为“cassandra”。   - GaussDB(for Mongo)数据库实例，取值为“mongodb”。   - GaussDB(for Influx)数据库实例，取值为“influxdb”。   - GaussDB(for Redis)数据库实例，取值为“redis”。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatastoresRequest listDatastoresRequest = (ListDatastoresRequest) o;
        return Objects.equals(this.datastoreName, listDatastoresRequest.datastoreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoresRequest {\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
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

package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建实例，单转主备，创建只读实例时返回。
 */
public class GetJobInfoResponseBodyJobEntitiesInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private GetJobInfoResponseBodyJobEntitiesInstanceDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_of")

    private String replicaOf;

    public GetJobInfoResponseBodyJobEntitiesInstance withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 实例的连接地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public GetJobInfoResponseBodyJobEntitiesInstance withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetJobInfoResponseBodyJobEntitiesInstance withDatastore(
        GetJobInfoResponseBodyJobEntitiesInstanceDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public GetJobInfoResponseBodyJobEntitiesInstance withDatastore(
        Consumer<GetJobInfoResponseBodyJobEntitiesInstanceDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new GetJobInfoResponseBodyJobEntitiesInstanceDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public GetJobInfoResponseBodyJobEntitiesInstanceDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(GetJobInfoResponseBodyJobEntitiesInstanceDatastore datastore) {
        this.datastore = datastore;
    }

    public GetJobInfoResponseBodyJobEntitiesInstance withReplicaOf(String replicaOf) {
        this.replicaOf = replicaOf;
        return this;
    }

    /**
     * 主实例ID，仅创建只读实例的时候返回。
     * @return replicaOf
     */
    public String getReplicaOf() {
        return replicaOf;
    }

    public void setReplicaOf(String replicaOf) {
        this.replicaOf = replicaOf;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetJobInfoResponseBodyJobEntitiesInstance that = (GetJobInfoResponseBodyJobEntitiesInstance) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.type, that.type)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.replicaOf, that.replicaOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, type, datastore, replicaOf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobInfoResponseBodyJobEntitiesInstance {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    replicaOf: ").append(toIndentedString(replicaOf)).append("\n");
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

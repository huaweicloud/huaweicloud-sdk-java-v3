package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDatabaseUserInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DatabaseUserInfoReq body;

    public UpdateDatabaseUserInfoRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * cluster_id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateDatabaseUserInfoRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDatabaseUserInfoRequest withBody(DatabaseUserInfoReq body) {
        this.body = body;
        return this;
    }

    public UpdateDatabaseUserInfoRequest withBody(Consumer<DatabaseUserInfoReq> bodySetter) {
        if (this.body == null) {
            this.body = new DatabaseUserInfoReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DatabaseUserInfoReq getBody() {
        return body;
    }

    public void setBody(DatabaseUserInfoReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatabaseUserInfoRequest updateDatabaseUserInfoRequest = (UpdateDatabaseUserInfoRequest) o;
        return Objects.equals(this.clusterId, updateDatabaseUserInfoRequest.clusterId)
            && Objects.equals(this.name, updateDatabaseUserInfoRequest.name)
            && Objects.equals(this.body, updateDatabaseUserInfoRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, name, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseUserInfoRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

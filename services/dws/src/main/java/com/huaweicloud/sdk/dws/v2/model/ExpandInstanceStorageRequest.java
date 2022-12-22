package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExpandInstanceStorageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExpandInstanceStorage body;

    public ExpandInstanceStorageRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群的ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ExpandInstanceStorageRequest withBody(ExpandInstanceStorage body) {
        this.body = body;
        return this;
    }

    public ExpandInstanceStorageRequest withBody(Consumer<ExpandInstanceStorage> bodySetter) {
        if (this.body == null) {
            this.body = new ExpandInstanceStorage();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExpandInstanceStorage getBody() {
        return body;
    }

    public void setBody(ExpandInstanceStorage body) {
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
        ExpandInstanceStorageRequest expandInstanceStorageRequest = (ExpandInstanceStorageRequest) o;
        return Objects.equals(this.clusterId, expandInstanceStorageRequest.clusterId)
            && Objects.equals(this.body, expandInstanceStorageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandInstanceStorageRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

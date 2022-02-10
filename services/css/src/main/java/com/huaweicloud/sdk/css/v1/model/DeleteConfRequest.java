package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DeleteConfRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteConfReq body;

    public DeleteConfRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 指定查询集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteConfRequest withBody(DeleteConfReq body) {
        this.body = body;
        return this;
    }

    public DeleteConfRequest withBody(Consumer<DeleteConfReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteConfReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DeleteConfReq getBody() {
        return body;
    }

    public void setBody(DeleteConfReq body) {
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
        DeleteConfRequest deleteConfRequest = (DeleteConfRequest) o;
        return Objects.equals(this.clusterId, deleteConfRequest.clusterId)
            && Objects.equals(this.body, deleteConfRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConfRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class RemoveNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RemoveNodesTask body;

    public RemoveNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群 ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RemoveNodeRequest withBody(RemoveNodesTask body) {
        this.body = body;
        return this;
    }

    public RemoveNodeRequest withBody(Consumer<RemoveNodesTask> bodySetter) {
        if (this.body == null) {
            this.body = new RemoveNodesTask();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RemoveNodesTask getBody() {
        return body;
    }

    public void setBody(RemoveNodesTask body) {
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
        RemoveNodeRequest removeNodeRequest = (RemoveNodeRequest) o;
        return Objects.equals(this.clusterId, removeNodeRequest.clusterId)
            && Objects.equals(this.body, removeNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNodeRequest {\n");
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

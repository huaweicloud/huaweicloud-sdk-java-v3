package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class MigrateNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cluster_id")

    private String targetClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private MigrateNodesTask body;

    public MigrateNodeRequest withClusterId(String clusterId) {
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

    public MigrateNodeRequest withTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }

    /** 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * 
     * @return targetClusterId */
    public String getTargetClusterId() {
        return targetClusterId;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    public MigrateNodeRequest withBody(MigrateNodesTask body) {
        this.body = body;
        return this;
    }

    public MigrateNodeRequest withBody(Consumer<MigrateNodesTask> bodySetter) {
        if (this.body == null) {
            this.body = new MigrateNodesTask();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public MigrateNodesTask getBody() {
        return body;
    }

    public void setBody(MigrateNodesTask body) {
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
        MigrateNodeRequest migrateNodeRequest = (MigrateNodeRequest) o;
        return Objects.equals(this.clusterId, migrateNodeRequest.clusterId)
            && Objects.equals(this.targetClusterId, migrateNodeRequest.targetClusterId)
            && Objects.equals(this.body, migrateNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, targetClusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    targetClusterId: ").append(toIndentedString(targetClusterId)).append("\n");
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

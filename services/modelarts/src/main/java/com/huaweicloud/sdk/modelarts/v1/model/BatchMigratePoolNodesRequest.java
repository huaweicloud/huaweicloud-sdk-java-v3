package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchMigratePoolNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NodeBatchMigrationRequest body;

    public BatchMigratePoolNodesRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称。该字段取自资源池metadata.name字段的值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public BatchMigratePoolNodesRequest withBody(NodeBatchMigrationRequest body) {
        this.body = body;
        return this;
    }

    public BatchMigratePoolNodesRequest withBody(Consumer<NodeBatchMigrationRequest> bodySetter) {
        if (this.body == null) {
            this.body = new NodeBatchMigrationRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NodeBatchMigrationRequest getBody() {
        return body;
    }

    public void setBody(NodeBatchMigrationRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchMigratePoolNodesRequest that = (BatchMigratePoolNodesRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchMigratePoolNodesRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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

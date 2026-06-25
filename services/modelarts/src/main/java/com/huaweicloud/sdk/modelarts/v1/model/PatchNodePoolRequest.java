package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PatchNodePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_name")

    private String nodepoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PatchNodePoolRequestBody body;

    public PatchNodePoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public PatchNodePoolRequest withNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
        return this;
    }

    /**
     * **参数解释**：节点池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodepoolName
     */
    public String getNodepoolName() {
        return nodepoolName;
    }

    public void setNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
    }

    public PatchNodePoolRequest withBody(PatchNodePoolRequestBody body) {
        this.body = body;
        return this;
    }

    public PatchNodePoolRequest withBody(Consumer<PatchNodePoolRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PatchNodePoolRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PatchNodePoolRequestBody getBody() {
        return body;
    }

    public void setBody(PatchNodePoolRequestBody body) {
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
        PatchNodePoolRequest that = (PatchNodePoolRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.nodepoolName, that.nodepoolName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, nodepoolName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchNodePoolRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    nodepoolName: ").append(toIndentedString(nodepoolName)).append("\n");
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

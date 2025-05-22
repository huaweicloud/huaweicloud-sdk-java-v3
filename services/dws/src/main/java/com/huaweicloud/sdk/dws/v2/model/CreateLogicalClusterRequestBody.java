package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建逻辑集群对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class CreateLogicalClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster")

    private CreateLogicalClusterInfo logicalCluster;

    public CreateLogicalClusterRequestBody withLogicalCluster(CreateLogicalClusterInfo logicalCluster) {
        this.logicalCluster = logicalCluster;
        return this;
    }

    public CreateLogicalClusterRequestBody withLogicalCluster(Consumer<CreateLogicalClusterInfo> logicalClusterSetter) {
        if (this.logicalCluster == null) {
            this.logicalCluster = new CreateLogicalClusterInfo();
            logicalClusterSetter.accept(this.logicalCluster);
        }

        return this;
    }

    /**
     * Get logicalCluster
     * @return logicalCluster
     */
    public CreateLogicalClusterInfo getLogicalCluster() {
        return logicalCluster;
    }

    public void setLogicalCluster(CreateLogicalClusterInfo logicalCluster) {
        this.logicalCluster = logicalCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogicalClusterRequestBody that = (CreateLogicalClusterRequestBody) obj;
        return Objects.equals(this.logicalCluster, that.logicalCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogicalClusterRequestBody {\n");
        sb.append("    logicalCluster: ").append(toIndentedString(logicalCluster)).append("\n");
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

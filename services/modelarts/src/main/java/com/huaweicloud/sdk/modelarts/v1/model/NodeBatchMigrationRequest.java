package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：批量迁移节点请求体。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeBatchMigrationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrateNodeNames")

    private List<String> migrateNodeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fromClusterName")

    private String fromClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "toClusterName")

    private String toClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "toPoolName")

    private String toPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpec")

    private MigrateResourceSpec resourceSpec;

    public NodeBatchMigrationRequest withMigrateNodeNames(List<String> migrateNodeNames) {
        this.migrateNodeNames = migrateNodeNames;
        return this;
    }

    public NodeBatchMigrationRequest addMigrateNodeNamesItem(String migrateNodeNamesItem) {
        if (this.migrateNodeNames == null) {
            this.migrateNodeNames = new ArrayList<>();
        }
        this.migrateNodeNames.add(migrateNodeNamesItem);
        return this;
    }

    public NodeBatchMigrationRequest withMigrateNodeNames(Consumer<List<String>> migrateNodeNamesSetter) {
        if (this.migrateNodeNames == null) {
            this.migrateNodeNames = new ArrayList<>();
        }
        migrateNodeNamesSetter.accept(this.migrateNodeNames);
        return this;
    }

    /**
     * **参数解释**：待迁移的节点名称列表。 **约束限制**：不涉及。
     * @return migrateNodeNames
     */
    public List<String> getMigrateNodeNames() {
        return migrateNodeNames;
    }

    public void setMigrateNodeNames(List<String> migrateNodeNames) {
        this.migrateNodeNames = migrateNodeNames;
    }

    public NodeBatchMigrationRequest withFromClusterName(String fromClusterName) {
        this.fromClusterName = fromClusterName;
        return this;
    }

    /**
     * **参数解释**：迁移起始集群名称。 专属算力资源时该字段与源资源池名称相同，取自源资源池metadata.name字段的值； 轻量算力集群时该字段取自迁移节点metadata.labels[os.modelarts.node/cluster]字段的值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return fromClusterName
     */
    public String getFromClusterName() {
        return fromClusterName;
    }

    public void setFromClusterName(String fromClusterName) {
        this.fromClusterName = fromClusterName;
    }

    public NodeBatchMigrationRequest withToClusterName(String toClusterName) {
        this.toClusterName = toClusterName;
        return this;
    }

    /**
     * **参数解释**：迁移目标集群名称。 专属算力资源时该字段与源资源池名称相同，取自目标资源池metadata.name字段的值； 轻量算力集群时该字段取自目标资源池内节点metadata.labels[os.modelarts.node/cluster]字段的值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return toClusterName
     */
    public String getToClusterName() {
        return toClusterName;
    }

    public void setToClusterName(String toClusterName) {
        this.toClusterName = toClusterName;
    }

    public NodeBatchMigrationRequest withToPoolName(String toPoolName) {
        this.toPoolName = toPoolName;
        return this;
    }

    /**
     * **参数解释**：迁移目标资源池名称。该字段取自目标资源池metadata.name字段的值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return toPoolName
     */
    public String getToPoolName() {
        return toPoolName;
    }

    public void setToPoolName(String toPoolName) {
        this.toPoolName = toPoolName;
    }

    public NodeBatchMigrationRequest withResourceSpec(MigrateResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    public NodeBatchMigrationRequest withResourceSpec(Consumer<MigrateResourceSpec> resourceSpecSetter) {
        if (this.resourceSpec == null) {
            this.resourceSpec = new MigrateResourceSpec();
            resourceSpecSetter.accept(this.resourceSpec);
        }

        return this;
    }

    /**
     * Get resourceSpec
     * @return resourceSpec
     */
    public MigrateResourceSpec getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(MigrateResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeBatchMigrationRequest that = (NodeBatchMigrationRequest) obj;
        return Objects.equals(this.migrateNodeNames, that.migrateNodeNames)
            && Objects.equals(this.fromClusterName, that.fromClusterName)
            && Objects.equals(this.toClusterName, that.toClusterName)
            && Objects.equals(this.toPoolName, that.toPoolName) && Objects.equals(this.resourceSpec, that.resourceSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrateNodeNames, fromClusterName, toClusterName, toPoolName, resourceSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeBatchMigrationRequest {\n");
        sb.append("    migrateNodeNames: ").append(toIndentedString(migrateNodeNames)).append("\n");
        sb.append("    fromClusterName: ").append(toIndentedString(fromClusterName)).append("\n");
        sb.append("    toClusterName: ").append(toIndentedString(toClusterName)).append("\n");
        sb.append("    toPoolName: ").append(toIndentedString(toPoolName)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
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

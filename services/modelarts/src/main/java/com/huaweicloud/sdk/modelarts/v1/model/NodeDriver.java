package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点驱动。
 */
public class NodeDriver {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateStrategy")

    private String updateStrategy;

    public NodeDriver withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：节点上驱动的版本号。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public NodeDriver withUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    /**
     * **参数解释**：节点驱动升级策略。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeDriver that = (NodeDriver) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.updateStrategy, that.updateStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, updateStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeDriver {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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

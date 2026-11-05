package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：待更新的节点配置插件实例请求信息。 **约束限制**：不涉及。
 */
public class NodeconfigUpdateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private NodeconfigUpdateSpecConfigs configs;

    public NodeconfigUpdateSpec withConfigs(NodeconfigUpdateSpecConfigs configs) {
        this.configs = configs;
        return this;
    }

    public NodeconfigUpdateSpec withConfigs(Consumer<NodeconfigUpdateSpecConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new NodeconfigUpdateSpecConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public NodeconfigUpdateSpecConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(NodeconfigUpdateSpecConfigs configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigUpdateSpec that = (NodeconfigUpdateSpec) obj;
        return Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigUpdateSpec {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

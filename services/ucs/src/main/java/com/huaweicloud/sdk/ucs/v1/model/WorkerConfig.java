package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkerConfig
 */
public class WorkerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private NodeUpgradeStrategy strategy;

    public WorkerConfig withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * 节点个数
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public WorkerConfig withStrategy(NodeUpgradeStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public WorkerConfig withStrategy(Consumer<NodeUpgradeStrategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new NodeUpgradeStrategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public NodeUpgradeStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(NodeUpgradeStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkerConfig that = (WorkerConfig) obj;
        return Objects.equals(this.replicas, that.replicas) && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicas, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkerConfig {\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

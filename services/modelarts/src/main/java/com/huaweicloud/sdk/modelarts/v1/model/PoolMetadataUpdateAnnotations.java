package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源池的注释信息。
 */
public class PoolMetadataUpdateAnnotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/description")

    private String osModelartsDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.id")

    private String osModelartsOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/scheduler.queue.strategy")

    private String osModelartsPoolSchedulerQueueStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/scheduler.queue.strategy.config")

    private String osModelartsPoolSchedulerQueueStrategyConfig;

    public PoolMetadataUpdateAnnotations withOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
        return this;
    }

    /**
     * **参数解释**：资源池描述信息，用于说明资源池用于某种指定场景。不能包含特殊字符!<>=&\"'。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsDescription
     */
    public String getOsModelartsDescription() {
        return osModelartsDescription;
    }

    public void setOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
    }

    public PoolMetadataUpdateAnnotations withOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
        return this;
    }

    /**
     * **参数解释**：订单id，包周期创建和变更的时候需要传递该参数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsOrderId
     */
    public String getOsModelartsOrderId() {
        return osModelartsOrderId;
    }

    public void setOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
    }

    public PoolMetadataUpdateAnnotations withOsModelartsPoolSchedulerQueueStrategy(
        String osModelartsPoolSchedulerQueueStrategy) {
        this.osModelartsPoolSchedulerQueueStrategy = osModelartsPoolSchedulerQueueStrategy;
        return this;
    }

    /**
     * **参数解释**：资源池的调度算法。 **约束限制**：不涉及。 **取值范围**：可选值如下： - FIFO：先进先出，默认值 - Range：遍历调度 - Step: 阶梯轮询 - Rank: 分级调度 **默认取值**：FIFO。
     * @return osModelartsPoolSchedulerQueueStrategy
     */
    public String getOsModelartsPoolSchedulerQueueStrategy() {
        return osModelartsPoolSchedulerQueueStrategy;
    }

    public void setOsModelartsPoolSchedulerQueueStrategy(String osModelartsPoolSchedulerQueueStrategy) {
        this.osModelartsPoolSchedulerQueueStrategy = osModelartsPoolSchedulerQueueStrategy;
    }

    public PoolMetadataUpdateAnnotations withOsModelartsPoolSchedulerQueueStrategyConfig(
        String osModelartsPoolSchedulerQueueStrategyConfig) {
        this.osModelartsPoolSchedulerQueueStrategyConfig = osModelartsPoolSchedulerQueueStrategyConfig;
        return this;
    }

    /**
     * **参数解释**：资源池的调度策略配置。 **约束限制**：仅当调度策略为Step或Rank时生效。 **取值范围**：Json字符串，自行配置，示例如下： - Step: {\"step_config\":{\"timeout\":300}} - Rank: {\"rank_config\":[{\"max_priority\":3,\"min_priority\":3,\"rank_strategy\":\"Step\",\"step_config\":{\"timeout\":300}},{\"max_priority\":2,\"min_priority\":1,\"rank_strategy\":\"Range\"}]} **默认取值**：不涉及。
     * @return osModelartsPoolSchedulerQueueStrategyConfig
     */
    public String getOsModelartsPoolSchedulerQueueStrategyConfig() {
        return osModelartsPoolSchedulerQueueStrategyConfig;
    }

    public void setOsModelartsPoolSchedulerQueueStrategyConfig(String osModelartsPoolSchedulerQueueStrategyConfig) {
        this.osModelartsPoolSchedulerQueueStrategyConfig = osModelartsPoolSchedulerQueueStrategyConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMetadataUpdateAnnotations that = (PoolMetadataUpdateAnnotations) obj;
        return Objects.equals(this.osModelartsDescription, that.osModelartsDescription)
            && Objects.equals(this.osModelartsOrderId, that.osModelartsOrderId)
            && Objects.equals(this.osModelartsPoolSchedulerQueueStrategy, that.osModelartsPoolSchedulerQueueStrategy)
            && Objects.equals(this.osModelartsPoolSchedulerQueueStrategyConfig,
                that.osModelartsPoolSchedulerQueueStrategyConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsDescription,
            osModelartsOrderId,
            osModelartsPoolSchedulerQueueStrategy,
            osModelartsPoolSchedulerQueueStrategyConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetadataUpdateAnnotations {\n");
        sb.append("    osModelartsDescription: ").append(toIndentedString(osModelartsDescription)).append("\n");
        sb.append("    osModelartsOrderId: ").append(toIndentedString(osModelartsOrderId)).append("\n");
        sb.append("    osModelartsPoolSchedulerQueueStrategy: ")
            .append(toIndentedString(osModelartsPoolSchedulerQueueStrategy))
            .append("\n");
        sb.append("    osModelartsPoolSchedulerQueueStrategyConfig: ")
            .append(toIndentedString(osModelartsPoolSchedulerQueueStrategyConfig))
            .append("\n");
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

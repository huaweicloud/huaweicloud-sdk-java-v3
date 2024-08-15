package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateNodePoolStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentNode")

    private Integer currentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatingNode")

    private Integer creatingNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletingNode")

    private Integer deletingNode;

    /**
     * 节点池状态。 - 空值：可用（节点池当前节点数已达到预期，且无伸缩中的节点） - Synchronizing：伸缩中（节点池当前节点数未达到预期，且无伸缩中的节点） - Synchronized：伸缩等待中（节点池当前节点数未达到预期，或者存在伸缩中的节点） - SoldOut：节点池当前不可扩容（兼容字段，标记节点池资源售罄、资源配额不足等不可扩容状态） > 上述节点池状态已废弃，仅兼容保留，不建议使用，替代感知方式如下： > - 节点池扩缩状态：可通过currentNode/creatingNode/deletingNode节点状态统计信息，精确感知当前节点池扩缩状态。 > - 节点池可扩容状态：可通过conditions感知节点池详细状态，其中\"Scalable\"可替代SoldOut语义。 - Deleting：删除中 - Error：错误 
     */
    public static final class PhaseEnum {

        /**
         * Enum SYNCHRONIZING for value: "Synchronizing"
         */
        public static final PhaseEnum SYNCHRONIZING = new PhaseEnum("Synchronizing");

        /**
         * Enum SYNCHRONIZED for value: "Synchronized"
         */
        public static final PhaseEnum SYNCHRONIZED = new PhaseEnum("Synchronized");

        /**
         * Enum SOLDOUT for value: "SoldOut"
         */
        public static final PhaseEnum SOLDOUT = new PhaseEnum("SoldOut");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final PhaseEnum DELETING = new PhaseEnum("Deleting");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final PhaseEnum ERROR = new PhaseEnum("Error");

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("Synchronizing", SYNCHRONIZING);
            map.put("Synchronized", SYNCHRONIZED);
            map.put("SoldOut", SOLDOUT);
            map.put("Deleting", DELETING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PhaseEnum(value));
        }

        public static PhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private PhaseEnum phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<NodePoolCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleGroupStatuses")

    private List<ScaleGroupStatus> scaleGroupStatuses = null;

    public UpdateNodePoolStatus withCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    /**
     * 当前节点池中所有节点数量（不含删除中的节点）。
     * @return currentNode
     */
    public Integer getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Integer currentNode) {
        this.currentNode = currentNode;
    }

    public UpdateNodePoolStatus withCreatingNode(Integer creatingNode) {
        this.creatingNode = creatingNode;
        return this;
    }

    /**
     * 当前节点池中处于创建流程中的节点数量。
     * @return creatingNode
     */
    public Integer getCreatingNode() {
        return creatingNode;
    }

    public void setCreatingNode(Integer creatingNode) {
        this.creatingNode = creatingNode;
    }

    public UpdateNodePoolStatus withDeletingNode(Integer deletingNode) {
        this.deletingNode = deletingNode;
        return this;
    }

    /**
     * 当前节点池中删除中的节点数量。
     * @return deletingNode
     */
    public Integer getDeletingNode() {
        return deletingNode;
    }

    public void setDeletingNode(Integer deletingNode) {
        this.deletingNode = deletingNode;
    }

    public UpdateNodePoolStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 节点池状态。 - 空值：可用（节点池当前节点数已达到预期，且无伸缩中的节点） - Synchronizing：伸缩中（节点池当前节点数未达到预期，且无伸缩中的节点） - Synchronized：伸缩等待中（节点池当前节点数未达到预期，或者存在伸缩中的节点） - SoldOut：节点池当前不可扩容（兼容字段，标记节点池资源售罄、资源配额不足等不可扩容状态） > 上述节点池状态已废弃，仅兼容保留，不建议使用，替代感知方式如下： > - 节点池扩缩状态：可通过currentNode/creatingNode/deletingNode节点状态统计信息，精确感知当前节点池扩缩状态。 > - 节点池可扩容状态：可通过conditions感知节点池详细状态，其中\"Scalable\"可替代SoldOut语义。 - Deleting：删除中 - Error：错误 
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    public UpdateNodePoolStatus withConditions(List<NodePoolCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateNodePoolStatus addConditionsItem(NodePoolCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateNodePoolStatus withConditions(Consumer<List<NodePoolCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 节点池当前详细状态列表，详情参见Condition类型定义。 
     * @return conditions
     */
    public List<NodePoolCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<NodePoolCondition> conditions) {
        this.conditions = conditions;
    }

    public UpdateNodePoolStatus withScaleGroupStatuses(List<ScaleGroupStatus> scaleGroupStatuses) {
        this.scaleGroupStatuses = scaleGroupStatuses;
        return this;
    }

    public UpdateNodePoolStatus addScaleGroupStatusesItem(ScaleGroupStatus scaleGroupStatusesItem) {
        if (this.scaleGroupStatuses == null) {
            this.scaleGroupStatuses = new ArrayList<>();
        }
        this.scaleGroupStatuses.add(scaleGroupStatusesItem);
        return this;
    }

    public UpdateNodePoolStatus withScaleGroupStatuses(Consumer<List<ScaleGroupStatus>> scaleGroupStatusesSetter) {
        if (this.scaleGroupStatuses == null) {
            this.scaleGroupStatuses = new ArrayList<>();
        }
        scaleGroupStatusesSetter.accept(this.scaleGroupStatuses);
        return this;
    }

    /**
     * 伸缩组当前详细状态信息，详情参见ScaleGroupStatus类型定义
     * @return scaleGroupStatuses
     */
    public List<ScaleGroupStatus> getScaleGroupStatuses() {
        return scaleGroupStatuses;
    }

    public void setScaleGroupStatuses(List<ScaleGroupStatus> scaleGroupStatuses) {
        this.scaleGroupStatuses = scaleGroupStatuses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNodePoolStatus that = (UpdateNodePoolStatus) obj;
        return Objects.equals(this.currentNode, that.currentNode)
            && Objects.equals(this.creatingNode, that.creatingNode)
            && Objects.equals(this.deletingNode, that.deletingNode) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.scaleGroupStatuses, that.scaleGroupStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentNode, creatingNode, deletingNode, phase, conditions, scaleGroupStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodePoolStatus {\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
        sb.append("    creatingNode: ").append(toIndentedString(creatingNode)).append("\n");
        sb.append("    deletingNode: ").append(toIndentedString(deletingNode)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    scaleGroupStatuses: ").append(toIndentedString(scaleGroupStatuses)).append("\n");
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

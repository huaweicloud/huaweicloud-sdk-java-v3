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
 * 伸缩组当前详细状态信息
 */
public class ScaleGroupStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    /**
     * 伸缩组状态。 - 空值：可用（伸缩组当前节点数已达到预期，且无伸缩中的节点） - Synchronizing：伸缩中（伸缩组当前节点数未达到预期，且无伸缩中的节点） - Synchronized：伸缩等待中（伸缩组当前节点数未达到预期，或者存在伸缩中的节点） - SoldOut：伸缩组当前不可扩容（兼容字段，标记节点池资源售罄、资源配额不足等不可扩容状态） > 上述伸缩组状态已废弃，仅兼容保留，不建议使用，替代感知方式如下： > - 伸缩组扩缩状态：可通过desiredNodeCount/existingNodeCount/upcomingNodeCount节点状态统计信息，精确感知当前伸缩组扩缩状态。 > - 伸缩组可扩容状态：可通过conditions感知伸缩组详细状态，其中\"Scalable\"可替代SoldOut语义。 - Deleting：删除中 - Error：错误 
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
    @JsonProperty(value = "desiredNodeCount")

    private Integer desiredNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unpaidScaleNodeCount")

    private Integer unpaidScaleNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existingNodeCount")

    private ScaleGroupStatusExistingNodeCount existingNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upcomingNodeCount")

    private ScaleGroupStatusUpcomingNodeCount upcomingNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleDownDisabledNodeCount")

    private Integer scaleDownDisabledNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<NodePoolCondition> conditions = null;

    public ScaleGroupStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 伸缩组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScaleGroupStatus withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 伸缩组uuid
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ScaleGroupStatus withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 伸缩组创建时间
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public ScaleGroupStatus withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 伸缩组更新时间
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public ScaleGroupStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 伸缩组状态。 - 空值：可用（伸缩组当前节点数已达到预期，且无伸缩中的节点） - Synchronizing：伸缩中（伸缩组当前节点数未达到预期，且无伸缩中的节点） - Synchronized：伸缩等待中（伸缩组当前节点数未达到预期，或者存在伸缩中的节点） - SoldOut：伸缩组当前不可扩容（兼容字段，标记节点池资源售罄、资源配额不足等不可扩容状态） > 上述伸缩组状态已废弃，仅兼容保留，不建议使用，替代感知方式如下： > - 伸缩组扩缩状态：可通过desiredNodeCount/existingNodeCount/upcomingNodeCount节点状态统计信息，精确感知当前伸缩组扩缩状态。 > - 伸缩组可扩容状态：可通过conditions感知伸缩组详细状态，其中\"Scalable\"可替代SoldOut语义。 - Deleting：删除中 - Error：错误 
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    public ScaleGroupStatus withDesiredNodeCount(Integer desiredNodeCount) {
        this.desiredNodeCount = desiredNodeCount;
        return this;
    }

    /**
     * 伸缩组期望节点数
     * @return desiredNodeCount
     */
    public Integer getDesiredNodeCount() {
        return desiredNodeCount;
    }

    public void setDesiredNodeCount(Integer desiredNodeCount) {
        this.desiredNodeCount = desiredNodeCount;
    }

    public ScaleGroupStatus withUnpaidScaleNodeCount(Integer unpaidScaleNodeCount) {
        this.unpaidScaleNodeCount = unpaidScaleNodeCount;
        return this;
    }

    /**
     * 订单未支付节点个数
     * @return unpaidScaleNodeCount
     */
    public Integer getUnpaidScaleNodeCount() {
        return unpaidScaleNodeCount;
    }

    public void setUnpaidScaleNodeCount(Integer unpaidScaleNodeCount) {
        this.unpaidScaleNodeCount = unpaidScaleNodeCount;
    }

    public ScaleGroupStatus withExistingNodeCount(ScaleGroupStatusExistingNodeCount existingNodeCount) {
        this.existingNodeCount = existingNodeCount;
        return this;
    }

    public ScaleGroupStatus withExistingNodeCount(Consumer<ScaleGroupStatusExistingNodeCount> existingNodeCountSetter) {
        if (this.existingNodeCount == null) {
            this.existingNodeCount = new ScaleGroupStatusExistingNodeCount();
            existingNodeCountSetter.accept(this.existingNodeCount);
        }

        return this;
    }

    /**
     * Get existingNodeCount
     * @return existingNodeCount
     */
    public ScaleGroupStatusExistingNodeCount getExistingNodeCount() {
        return existingNodeCount;
    }

    public void setExistingNodeCount(ScaleGroupStatusExistingNodeCount existingNodeCount) {
        this.existingNodeCount = existingNodeCount;
    }

    public ScaleGroupStatus withUpcomingNodeCount(ScaleGroupStatusUpcomingNodeCount upcomingNodeCount) {
        this.upcomingNodeCount = upcomingNodeCount;
        return this;
    }

    public ScaleGroupStatus withUpcomingNodeCount(Consumer<ScaleGroupStatusUpcomingNodeCount> upcomingNodeCountSetter) {
        if (this.upcomingNodeCount == null) {
            this.upcomingNodeCount = new ScaleGroupStatusUpcomingNodeCount();
            upcomingNodeCountSetter.accept(this.upcomingNodeCount);
        }

        return this;
    }

    /**
     * Get upcomingNodeCount
     * @return upcomingNodeCount
     */
    public ScaleGroupStatusUpcomingNodeCount getUpcomingNodeCount() {
        return upcomingNodeCount;
    }

    public void setUpcomingNodeCount(ScaleGroupStatusUpcomingNodeCount upcomingNodeCount) {
        this.upcomingNodeCount = upcomingNodeCount;
    }

    public ScaleGroupStatus withScaleDownDisabledNodeCount(Integer scaleDownDisabledNodeCount) {
        this.scaleDownDisabledNodeCount = scaleDownDisabledNodeCount;
        return this;
    }

    /**
     * 伸缩组禁止缩容的节点数
     * @return scaleDownDisabledNodeCount
     */
    public Integer getScaleDownDisabledNodeCount() {
        return scaleDownDisabledNodeCount;
    }

    public void setScaleDownDisabledNodeCount(Integer scaleDownDisabledNodeCount) {
        this.scaleDownDisabledNodeCount = scaleDownDisabledNodeCount;
    }

    public ScaleGroupStatus withConditions(List<NodePoolCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ScaleGroupStatus addConditionsItem(NodePoolCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ScaleGroupStatus withConditions(Consumer<List<NodePoolCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 伸缩组当前详细状态列表，详情参见Condition类型定义。
     * @return conditions
     */
    public List<NodePoolCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<NodePoolCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleGroupStatus that = (ScaleGroupStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.desiredNodeCount, that.desiredNodeCount)
            && Objects.equals(this.unpaidScaleNodeCount, that.unpaidScaleNodeCount)
            && Objects.equals(this.existingNodeCount, that.existingNodeCount)
            && Objects.equals(this.upcomingNodeCount, that.upcomingNodeCount)
            && Objects.equals(this.scaleDownDisabledNodeCount, that.scaleDownDisabledNodeCount)
            && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            uid,
            creationTimestamp,
            updateTimestamp,
            phase,
            desiredNodeCount,
            unpaidScaleNodeCount,
            existingNodeCount,
            upcomingNodeCount,
            scaleDownDisabledNodeCount,
            conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleGroupStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    desiredNodeCount: ").append(toIndentedString(desiredNodeCount)).append("\n");
        sb.append("    unpaidScaleNodeCount: ").append(toIndentedString(unpaidScaleNodeCount)).append("\n");
        sb.append("    existingNodeCount: ").append(toIndentedString(existingNodeCount)).append("\n");
        sb.append("    upcomingNodeCount: ").append(toIndentedString(upcomingNodeCount)).append("\n");
        sb.append("    scaleDownDisabledNodeCount: ").append(toIndentedString(scaleDownDisabledNodeCount)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

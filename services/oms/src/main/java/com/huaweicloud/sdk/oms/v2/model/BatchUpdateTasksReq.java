package com.huaweicloud.sdk.oms.v2.model;

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
 * This is a auto create Body Object
 */
public class BatchUpdateTasksReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<Long> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_policy")

    private List<BandwidthPolicyDto> bandwidthPolicy = null;

    /**
     * 任务优先级配置，存在高中低三个优先级档次，限制仅在等待中、已暂停、已失败的任务进行修改 HIGH：高优先级 MEDIUM：中优先级 LOW：低优先级
     */
    public static final class TaskPriorityEnum {

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final TaskPriorityEnum HIGH = new TaskPriorityEnum("HIGH");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final TaskPriorityEnum MEDIUM = new TaskPriorityEnum("MEDIUM");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final TaskPriorityEnum LOW = new TaskPriorityEnum("LOW");

        private static final Map<String, TaskPriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskPriorityEnum> createStaticFields() {
            Map<String, TaskPriorityEnum> map = new HashMap<>();
            map.put("HIGH", HIGH);
            map.put("MEDIUM", MEDIUM);
            map.put("LOW", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskPriorityEnum(String value) {
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
        public static TaskPriorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskPriorityEnum(value));
        }

        public static TaskPriorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskPriorityEnum) {
                return this.value.equals(((TaskPriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_priority")

    private TaskPriorityEnum taskPriority;

    public BatchUpdateTasksReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 迁移任务组ID，表示批量更新该任务组下所有任务。 group_id和ids为二选一参数，不可同时存在或同时缺失。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BatchUpdateTasksReq withIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public BatchUpdateTasksReq addIdsItem(Long idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public BatchUpdateTasksReq withIds(Consumer<List<Long>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 迁移任务id数组，包含所有需要批量更新操作的任务id。 group_id和ids为二选一参数，不可同时存在或同时缺失。
     * @return ids
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public BatchUpdateTasksReq withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    public BatchUpdateTasksReq addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public BatchUpdateTasksReq withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /**
     * 配置流量控制策略。数组中一个元素对应一个时段的最大带宽，最多允许5个时段，且时段不能重叠。
     * @return bandwidthPolicy
     */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    public BatchUpdateTasksReq withTaskPriority(TaskPriorityEnum taskPriority) {
        this.taskPriority = taskPriority;
        return this;
    }

    /**
     * 任务优先级配置，存在高中低三个优先级档次，限制仅在等待中、已暂停、已失败的任务进行修改 HIGH：高优先级 MEDIUM：中优先级 LOW：低优先级
     * @return taskPriority
     */
    public TaskPriorityEnum getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriorityEnum taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateTasksReq that = (BatchUpdateTasksReq) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.bandwidthPolicy, that.bandwidthPolicy)
            && Objects.equals(this.taskPriority, that.taskPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, ids, bandwidthPolicy, taskPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateTasksReq {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
        sb.append("    taskPriority: ").append(toIndentedString(taskPriority)).append("\n");
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

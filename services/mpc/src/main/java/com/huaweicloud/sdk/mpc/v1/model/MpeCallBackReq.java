package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MpeCallBackReq
 */
public class MpeCallBackReq {

    /**
     * 任务类型
     */
    public static final class TaskTypeEnum {

        /**
         * Enum CONCAT for value: "CONCAT"
         */
        public static final TaskTypeEnum CONCAT = new TaskTypeEnum("CONCAT");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final TaskTypeEnum AUDIO = new TaskTypeEnum("AUDIO");

        /**
         * Enum CUT for value: "CUT"
         */
        public static final TaskTypeEnum CUT = new TaskTypeEnum("CUT");

        /**
         * Enum PARSE for value: "PARSE"
         */
        public static final TaskTypeEnum PARSE = new TaskTypeEnum("PARSE");

        /**
         * Enum MD5 for value: "MD5"
         */
        public static final TaskTypeEnum MD5 = new TaskTypeEnum("MD5");

        /**
         * Enum SNAPSHOT for value: "SNAPSHOT"
         */
        public static final TaskTypeEnum SNAPSHOT = new TaskTypeEnum("SNAPSHOT");

        /**
         * Enum REMUX for value: "REMUX"
         */
        public static final TaskTypeEnum REMUX = new TaskTypeEnum("REMUX");

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final TaskTypeEnum ANIMATION = new TaskTypeEnum("ANIMATION");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("CONCAT", CONCAT);
            map.put("AUDIO", AUDIO);
            map.put("CUT", CUT);
            map.put("PARSE", PARSE);
            map.put("MD5", MD5);
            map.put("SNAPSHOT", SNAPSHOT);
            map.put("REMUX", REMUX);
            map.put("ANIMATION", ANIMATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_ratio")

    private Integer completeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MpeMetaData metaData;

    public MpeCallBackReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public MpeCallBackReq withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MpeCallBackReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MpeCallBackReq withCompleteRatio(Integer completeRatio) {
        this.completeRatio = completeRatio;
        return this;
    }

    /**
     * 任务完成进度百分比值。 
     * minimum: 0
     * maximum: 100
     * @return completeRatio
     */
    public Integer getCompleteRatio() {
        return completeRatio;
    }

    public void setCompleteRatio(Integer completeRatio) {
        this.completeRatio = completeRatio;
    }

    public MpeCallBackReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务执行描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MpeCallBackReq withMetaData(MpeMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public MpeCallBackReq withMetaData(Consumer<MpeMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MpeMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MpeMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MpeMetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MpeCallBackReq that = (MpeCallBackReq) obj;
        return Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.completeRatio, that.completeRatio)
            && Objects.equals(this.description, that.description) && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, taskId, status, completeRatio, description, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MpeCallBackReq {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    completeRatio: ").append(toIndentedString(completeRatio)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

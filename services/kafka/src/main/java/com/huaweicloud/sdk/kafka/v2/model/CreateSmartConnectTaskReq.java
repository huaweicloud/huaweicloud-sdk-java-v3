package com.huaweicloud.sdk.kafka.v2.model;

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
 * CreateSmartConnectTaskReq
 */
public class CreateSmartConnectTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_later")

    private Boolean startLater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private String topics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics_regex")

    private String topicsRegex;

    /**
     * **参数解释**： SmartConnect任务的源端类型。 **约束限制**： 不涉及。 **取值范围**： - KAFKA_REPLICATOR_SOURCE：Kafka数据复制。 - NONE：不配置。 **默认取值**： 不涉及。
     */
    public static final class SourceTypeEnum {

        /**
         * Enum KAFKA_REPLICATOR_SOURCE for value: "KAFKA_REPLICATOR_SOURCE"
         */
        public static final SourceTypeEnum KAFKA_REPLICATOR_SOURCE = new SourceTypeEnum("KAFKA_REPLICATOR_SOURCE");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final SourceTypeEnum NONE = new SourceTypeEnum("NONE");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("KAFKA_REPLICATOR_SOURCE", KAFKA_REPLICATOR_SOURCE);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_task")

    private SmartConnectTaskReqSourceConfig sourceTask;

    /**
     * **参数解释**： SmartConnect任务的目标端类型。 **约束限制**： 不涉及。 **取值范围**： - OBS_SINK：转储。 - NONE：不配置。 **默认取值**： 不涉及。
     */
    public static final class SinkTypeEnum {

        /**
         * Enum OBS_SINK for value: "OBS_SINK"
         */
        public static final SinkTypeEnum OBS_SINK = new SinkTypeEnum("OBS_SINK");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final SinkTypeEnum NONE = new SinkTypeEnum("NONE");

        private static final Map<String, SinkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SinkTypeEnum> createStaticFields() {
            Map<String, SinkTypeEnum> map = new HashMap<>();
            map.put("OBS_SINK", OBS_SINK);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SinkTypeEnum(String value) {
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
        public static SinkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SinkTypeEnum(value));
        }

        public static SinkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SinkTypeEnum) {
                return this.value.equals(((SinkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_type")

    private SinkTypeEnum sinkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_task")

    private SmartConnectTaskReqSinkConfig sinkTask;

    public CreateSmartConnectTaskReq withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * SmartConnect任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateSmartConnectTaskReq withStartLater(Boolean startLater) {
        this.startLater = startLater;
        return this;
    }

    /**
     * 是否稍后再启动任务。如需要创建任务后立即启动，请填false；如希望稍后在任务列表中手动开启任务，请填true。
     * @return startLater
     */
    public Boolean getStartLater() {
        return startLater;
    }

    public void setStartLater(Boolean startLater) {
        this.startLater = startLater;
    }

    public CreateSmartConnectTaskReq withTopics(String topics) {
        this.topics = topics;
        return this;
    }

    /**
     * SmartConnect任务配置的Topic。
     * @return topics
     */
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public CreateSmartConnectTaskReq withTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
        return this;
    }

    /**
     * SmartConnect任务配置的Topic正则表达式。
     * @return topicsRegex
     */
    public String getTopicsRegex() {
        return topicsRegex;
    }

    public void setTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
    }

    public CreateSmartConnectTaskReq withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释**： SmartConnect任务的源端类型。 **约束限制**： 不涉及。 **取值范围**： - KAFKA_REPLICATOR_SOURCE：Kafka数据复制。 - NONE：不配置。 **默认取值**： 不涉及。
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public CreateSmartConnectTaskReq withSourceTask(SmartConnectTaskReqSourceConfig sourceTask) {
        this.sourceTask = sourceTask;
        return this;
    }

    public CreateSmartConnectTaskReq withSourceTask(Consumer<SmartConnectTaskReqSourceConfig> sourceTaskSetter) {
        if (this.sourceTask == null) {
            this.sourceTask = new SmartConnectTaskReqSourceConfig();
            sourceTaskSetter.accept(this.sourceTask);
        }

        return this;
    }

    /**
     * Get sourceTask
     * @return sourceTask
     */
    public SmartConnectTaskReqSourceConfig getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(SmartConnectTaskReqSourceConfig sourceTask) {
        this.sourceTask = sourceTask;
    }

    public CreateSmartConnectTaskReq withSinkType(SinkTypeEnum sinkType) {
        this.sinkType = sinkType;
        return this;
    }

    /**
     * **参数解释**： SmartConnect任务的目标端类型。 **约束限制**： 不涉及。 **取值范围**： - OBS_SINK：转储。 - NONE：不配置。 **默认取值**： 不涉及。
     * @return sinkType
     */
    public SinkTypeEnum getSinkType() {
        return sinkType;
    }

    public void setSinkType(SinkTypeEnum sinkType) {
        this.sinkType = sinkType;
    }

    public CreateSmartConnectTaskReq withSinkTask(SmartConnectTaskReqSinkConfig sinkTask) {
        this.sinkTask = sinkTask;
        return this;
    }

    public CreateSmartConnectTaskReq withSinkTask(Consumer<SmartConnectTaskReqSinkConfig> sinkTaskSetter) {
        if (this.sinkTask == null) {
            this.sinkTask = new SmartConnectTaskReqSinkConfig();
            sinkTaskSetter.accept(this.sinkTask);
        }

        return this;
    }

    /**
     * Get sinkTask
     * @return sinkTask
     */
    public SmartConnectTaskReqSinkConfig getSinkTask() {
        return sinkTask;
    }

    public void setSinkTask(SmartConnectTaskReqSinkConfig sinkTask) {
        this.sinkTask = sinkTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSmartConnectTaskReq that = (CreateSmartConnectTaskReq) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.startLater, that.startLater)
            && Objects.equals(this.topics, that.topics) && Objects.equals(this.topicsRegex, that.topicsRegex)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceTask, that.sourceTask)
            && Objects.equals(this.sinkType, that.sinkType) && Objects.equals(this.sinkTask, that.sinkTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, startLater, topics, topicsRegex, sourceType, sourceTask, sinkType, sinkTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSmartConnectTaskReq {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    startLater: ").append(toIndentedString(startLater)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    topicsRegex: ").append(toIndentedString(topicsRegex)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceTask: ").append(toIndentedString(sourceTask)).append("\n");
        sb.append("    sinkType: ").append(toIndentedString(sinkType)).append("\n");
        sb.append("    sinkTask: ").append(toIndentedString(sinkTask)).append("\n");
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

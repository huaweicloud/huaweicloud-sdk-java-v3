package com.huaweicloud.sdk.eg.v1.model;

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
 * EventStreamingDetail
 */
public class EventStreamingDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private EventStreamingSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink")

    private EventStreamingSink sink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_config")

    private EventStreamingCreateReqRuleConfig ruleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private RunOption option;

    /**
     * 事件流状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATED", CREATED);
            map.put("RUNNING", RUNNING);
            map.put("ERROR", ERROR);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_id")

    private String streamingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    public EventStreamingDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件流名称，租户下唯一，由字母、数字、点、下划线和中划线组成，必须字母或数字开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventStreamingDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件流描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventStreamingDetail withSource(EventStreamingSource source) {
        this.source = source;
        return this;
    }

    public EventStreamingDetail withSource(Consumer<EventStreamingSource> sourceSetter) {
        if (this.source == null) {
            this.source = new EventStreamingSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public EventStreamingSource getSource() {
        return source;
    }

    public void setSource(EventStreamingSource source) {
        this.source = source;
    }

    public EventStreamingDetail withSink(EventStreamingSink sink) {
        this.sink = sink;
        return this;
    }

    public EventStreamingDetail withSink(Consumer<EventStreamingSink> sinkSetter) {
        if (this.sink == null) {
            this.sink = new EventStreamingSink();
            sinkSetter.accept(this.sink);
        }

        return this;
    }

    /**
     * Get sink
     * @return sink
     */
    public EventStreamingSink getSink() {
        return sink;
    }

    public void setSink(EventStreamingSink sink) {
        this.sink = sink;
    }

    public EventStreamingDetail withRuleConfig(EventStreamingCreateReqRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }

    public EventStreamingDetail withRuleConfig(Consumer<EventStreamingCreateReqRuleConfig> ruleConfigSetter) {
        if (this.ruleConfig == null) {
            this.ruleConfig = new EventStreamingCreateReqRuleConfig();
            ruleConfigSetter.accept(this.ruleConfig);
        }

        return this;
    }

    /**
     * Get ruleConfig
     * @return ruleConfig
     */
    public EventStreamingCreateReqRuleConfig getRuleConfig() {
        return ruleConfig;
    }

    public void setRuleConfig(EventStreamingCreateReqRuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    public EventStreamingDetail withOption(RunOption option) {
        this.option = option;
        return this;
    }

    public EventStreamingDetail withOption(Consumer<RunOption> optionSetter) {
        if (this.option == null) {
            this.option = new RunOption();
            optionSetter.accept(this.option);
        }

        return this;
    }

    /**
     * Get option
     * @return option
     */
    public RunOption getOption() {
        return option;
    }

    public void setOption(RunOption option) {
        this.option = option;
    }

    public EventStreamingDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 事件流状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public EventStreamingDetail withStreamingId(String streamingId) {
        this.streamingId = streamingId;
        return this;
    }

    /**
     * 事件流ID
     * @return streamingId
     */
    public String getStreamingId() {
        return streamingId;
    }

    public void setStreamingId(String streamingId) {
        this.streamingId = streamingId;
    }

    public EventStreamingDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public EventStreamingDetail withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventStreamingDetail that = (EventStreamingDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sink, that.sink)
            && Objects.equals(this.ruleConfig, that.ruleConfig) && Objects.equals(this.option, that.option)
            && Objects.equals(this.status, that.status) && Objects.equals(this.streamingId, that.streamingId)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, source, sink, ruleConfig, option, status, streamingId, createdTime, updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventStreamingDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
        sb.append("    ruleConfig: ").append(toIndentedString(ruleConfig)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    streamingId: ").append(toIndentedString(streamingId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

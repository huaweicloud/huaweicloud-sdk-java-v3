package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowSinkTaskDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 是否包含topic信息。默认是false。
     */
    public static final class TopicInfoEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final TopicInfoEnum TRUE = new TopicInfoEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final TopicInfoEnum FALSE = new TopicInfoEnum("false");

        private static final Map<String, TopicInfoEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TopicInfoEnum> createStaticFields() {
            Map<String, TopicInfoEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TopicInfoEnum(String value) {
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
        public static TopicInfoEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TopicInfoEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TopicInfoEnum(value);
            }
            return result;
        }

        public static TopicInfoEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TopicInfoEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TopicInfoEnum) {
                return this.value.equals(((TopicInfoEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic-info")

    private TopicInfoEnum topicInfo;

    public ShowSinkTaskDetailRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 实例转储ID。 请参考[实例生命周期][查询实例]接口返回的数据。
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowSinkTaskDetailRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 转储任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowSinkTaskDetailRequest withTopicInfo(TopicInfoEnum topicInfo) {
        this.topicInfo = topicInfo;
        return this;
    }

    /**
     * 是否包含topic信息。默认是false。
     * @return topicInfo
     */
    public TopicInfoEnum getTopicInfo() {
        return topicInfo;
    }

    public void setTopicInfo(TopicInfoEnum topicInfo) {
        this.topicInfo = topicInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSinkTaskDetailRequest showSinkTaskDetailRequest = (ShowSinkTaskDetailRequest) o;
        return Objects.equals(this.connectorId, showSinkTaskDetailRequest.connectorId)
            && Objects.equals(this.taskId, showSinkTaskDetailRequest.taskId)
            && Objects.equals(this.topicInfo, showSinkTaskDetailRequest.topicInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorId, taskId, topicInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinkTaskDetailRequest {\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    topicInfo: ").append(toIndentedString(topicInfo)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowTrainingJobLogsFromAomRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_job_id")

    private String trainingJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_line")

    private String baseLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private Integer lines;

    /**
     * **参数解释**：日志排序方式。 **约束限制**：不涉及。 **取值范围**：枚举值如下： - asc：升序（从旧到新） - desc：降序（从新到旧） **默认取值**：desc。
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    public ShowTrainingJobLogsFromAomRequest withTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }

    /**
     * 训练作业ID。获取方法请参见[查询训练作业列表](ListTrainingJobs.xml)。
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return trainingJobId;
    }

    public void setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
    }

    public ShowTrainingJobLogsFromAomRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 训练作业的任务名称。可从训练作业详情中的status.tasks字段中获取。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTrainingJobLogsFromAomRequest withBaseLine(String baseLine) {
        this.baseLine = baseLine;
        return this;
    }

    /**
     * **参数解释**：日志查询的基线行号，用于分页查询。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及（从最新日志开始查询）。
     * @return baseLine
     */
    public String getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(String baseLine) {
        this.baseLine = baseLine;
    }

    public ShowTrainingJobLogsFromAomRequest withLines(Integer lines) {
        this.lines = lines;
        return this;
    }

    /**
     * **参数解释**：返回的日志行数。 **约束限制**：不涉及。 **取值范围**：1 ~ 500。 **默认取值**：50。
     * @return lines
     */
    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public ShowTrainingJobLogsFromAomRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**：日志排序方式。 **约束限制**：不涉及。 **取值范围**：枚举值如下： - asc：升序（从旧到新） - desc：降序（从新到旧） **默认取值**：desc。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingJobLogsFromAomRequest that = (ShowTrainingJobLogsFromAomRequest) obj;
        return Objects.equals(this.trainingJobId, that.trainingJobId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.baseLine, that.baseLine) && Objects.equals(this.lines, that.lines)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingJobId, taskId, baseLine, lines, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingJobLogsFromAomRequest {\n");
        sb.append("    trainingJobId: ").append(toIndentedString(trainingJobId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    baseLine: ").append(toIndentedString(baseLine)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Execution
 */
public class Execution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_urn")

    private String graphUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_urn")

    private String executionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_at")

    private String startedAt;

    /**
     * 工作流执行方式。APICALL代表为通过API方式触发。
     */
    public static final class ExecutionTypeEnum {

        /**
         * Enum APICALL for value: "APICALL"
         */
        public static final ExecutionTypeEnum APICALL = new ExecutionTypeEnum("APICALL");

        private static final Map<String, ExecutionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecutionTypeEnum> createStaticFields() {
            Map<String, ExecutionTypeEnum> map = new HashMap<>();
            map.put("APICALL", APICALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecutionTypeEnum(String value) {
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
        public static ExecutionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExecutionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecutionTypeEnum(value);
            }
            return result;
        }

        public static ExecutionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExecutionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecutionTypeEnum) {
                return this.value.equals(((ExecutionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_type")

    private ExecutionTypeEnum executionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped_at")

    private String stoppedAt;

    /**
     * 工作流运行状态。success,fail,running,timeout,cancel
     */
    public static final class ExecutionStateEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ExecutionStateEnum SUCCESS = new ExecutionStateEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final ExecutionStateEnum FAIL = new ExecutionStateEnum("fail");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final ExecutionStateEnum RUNNING = new ExecutionStateEnum("running");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final ExecutionStateEnum TIMEOUT = new ExecutionStateEnum("timeout");

        /**
         * Enum CANCEL for value: "cancel"
         */
        public static final ExecutionStateEnum CANCEL = new ExecutionStateEnum("cancel");

        private static final Map<String, ExecutionStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExecutionStateEnum> createStaticFields() {
            Map<String, ExecutionStateEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("running", RUNNING);
            map.put("timeout", TIMEOUT);
            map.put("cancel", CANCEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExecutionStateEnum(String value) {
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
        public static ExecutionStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExecutionStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExecutionStateEnum(value);
            }
            return result;
        }

        public static ExecutionStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExecutionStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExecutionStateEnum) {
                return this.value.equals(((ExecutionStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_state")

    private ExecutionStateEnum executionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_name")

    private String executionName;

    public Execution withGraphUrn(String graphUrn) {
        this.graphUrn = graphUrn;
        return this;
    }

    /**
     * 工作流URN
     * @return graphUrn
     */
    public String getGraphUrn() {
        return graphUrn;
    }

    public void setGraphUrn(String graphUrn) {
        this.graphUrn = graphUrn;
    }

    public Execution withExecutionUrn(String executionUrn) {
        this.executionUrn = executionUrn;
        return this;
    }

    /**
     * 工作流实例URN
     * @return executionUrn
     */
    public String getExecutionUrn() {
        return executionUrn;
    }

    public void setExecutionUrn(String executionUrn) {
        this.executionUrn = executionUrn;
    }

    public Execution withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * 工作流实例启动时间
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public Execution withExecutionType(ExecutionTypeEnum executionType) {
        this.executionType = executionType;
        return this;
    }

    /**
     * 工作流执行方式。APICALL代表为通过API方式触发。
     * @return executionType
     */
    public ExecutionTypeEnum getExecutionType() {
        return executionType;
    }

    public void setExecutionType(ExecutionTypeEnum executionType) {
        this.executionType = executionType;
    }

    public Execution withStoppedAt(String stoppedAt) {
        this.stoppedAt = stoppedAt;
        return this;
    }

    /**
     * 工作流停止时间。
     * @return stoppedAt
     */
    public String getStoppedAt() {
        return stoppedAt;
    }

    public void setStoppedAt(String stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    public Execution withExecutionState(ExecutionStateEnum executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * 工作流运行状态。success,fail,running,timeout,cancel
     * @return executionState
     */
    public ExecutionStateEnum getExecutionState() {
        return executionState;
    }

    public void setExecutionState(ExecutionStateEnum executionState) {
        this.executionState = executionState;
    }

    public Execution withExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }

    /**
     * 工作流名称。
     * @return executionName
     */
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Execution execution = (Execution) o;
        return Objects.equals(this.graphUrn, execution.graphUrn)
            && Objects.equals(this.executionUrn, execution.executionUrn)
            && Objects.equals(this.startedAt, execution.startedAt)
            && Objects.equals(this.executionType, execution.executionType)
            && Objects.equals(this.stoppedAt, execution.stoppedAt)
            && Objects.equals(this.executionState, execution.executionState)
            && Objects.equals(this.executionName, execution.executionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphUrn, executionUrn, startedAt, executionType, stoppedAt, executionState, executionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Execution {\n");
        sb.append("    graphUrn: ").append(toIndentedString(graphUrn)).append("\n");
        sb.append("    executionUrn: ").append(toIndentedString(executionUrn)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
        sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
        sb.append("    executionState: ").append(toIndentedString(executionState)).append("\n");
        sb.append("    executionName: ").append(toIndentedString(executionName)).append("\n");
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

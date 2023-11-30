package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TransferTask
 */
public class TransferTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 转储任务状态。  - ERROR：错误。 - STARTING：启动中。 - PAUSED：已停止。 - RUNNING：运行中。 - DELETE：已删除。 - ABNORMAL：异常。
     */
    public static final class StateEnum {

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StateEnum ERROR = new StateEnum("ERROR");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StateEnum STARTING = new StateEnum("STARTING");

        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final StateEnum PAUSED = new StateEnum("PAUSED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final StateEnum DELETE = new StateEnum("DELETE");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StateEnum ABNORMAL = new StateEnum("ABNORMAL");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ERROR", ERROR);
            map.put("STARTING", STARTING);
            map.put("PAUSED", PAUSED);
            map.put("RUNNING", RUNNING);
            map.put("DELETE", DELETE);
            map.put("ABNORMAL", ABNORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * 转储任务类型。  - OBS：转储到OBS。 - MRS：转储到MRS。 - DLI：转储到DLI。 - CLOUDTABLE：转储到CloudTable。 - DWS：转储到DWS。
     */
    public static final class DestinationTypeEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final DestinationTypeEnum OBS = new DestinationTypeEnum("OBS");

        /**
         * Enum MRS for value: "MRS"
         */
        public static final DestinationTypeEnum MRS = new DestinationTypeEnum("MRS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DestinationTypeEnum DLI = new DestinationTypeEnum("DLI");

        /**
         * Enum CLOUDTABLE for value: "CLOUDTABLE"
         */
        public static final DestinationTypeEnum CLOUDTABLE = new DestinationTypeEnum("CLOUDTABLE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DestinationTypeEnum DWS = new DestinationTypeEnum("DWS");

        private static final Map<String, DestinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationTypeEnum> createStaticFields() {
            Map<String, DestinationTypeEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("MRS", MRS);
            map.put("DLI", DLI);
            map.put("CLOUDTABLE", CLOUDTABLE);
            map.put("DWS", DWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DestinationTypeEnum(String value) {
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
        public static DestinationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DestinationTypeEnum(value));
        }

        public static DestinationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_transfer_timestamp")

    private Long lastTransferTimestamp;

    public TransferTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 转储任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TransferTask withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 转储任务状态。  - ERROR：错误。 - STARTING：启动中。 - PAUSED：已停止。 - RUNNING：运行中。 - DELETE：已删除。 - ABNORMAL：异常。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TransferTask withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转储任务类型。  - OBS：转储到OBS。 - MRS：转储到MRS。 - DLI：转储到DLI。 - CLOUDTABLE：转储到CloudTable。 - DWS：转储到DWS。
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public TransferTask withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 转储任务创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TransferTask withLastTransferTimestamp(Long lastTransferTimestamp) {
        this.lastTransferTimestamp = lastTransferTimestamp;
        return this;
    }

    /**
     * 转储任务最近一次转储时间。
     * @return lastTransferTimestamp
     */
    public Long getLastTransferTimestamp() {
        return lastTransferTimestamp;
    }

    public void setLastTransferTimestamp(Long lastTransferTimestamp) {
        this.lastTransferTimestamp = lastTransferTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferTask that = (TransferTask) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastTransferTimestamp, that.lastTransferTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, state, destinationType, createTime, lastTransferTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferTask {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastTransferTimestamp: ").append(toIndentedString(lastTransferTimestamp)).append("\n");
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

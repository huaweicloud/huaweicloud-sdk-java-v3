package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 工单操作对象 operation_type为 CANCEL_INSTANCE：取消实例，instance_id 不能为空； SKIP_BATCH： 跳过当前批次，batch_index不能为空； CANCEL_ORDER：取消工单，batch_index和instance_id可为空； PAUSE_ORDER：暂停工单，batch_index和instance_id可为空； CONTINUE_ORDER：继续工单，batch_index和instance_id可为空
 */
public class JobScriptOrderOperationBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_index")

    private Integer batchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    /**
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单 CANCEL_INSTANCE：取消实例 SKIP_BATCH：跳过批次 CANCEL_ORDER：取消整个工单 PAUSE_ORDER：暂停整个工单 CONTINUE_ORDER：继续整个工单
     */
    public static final class OperationTypeEnum {

        /**
         * Enum CANCEL_INSTANCE for value: "CANCEL_INSTANCE"
         */
        public static final OperationTypeEnum CANCEL_INSTANCE = new OperationTypeEnum("CANCEL_INSTANCE");

        /**
         * Enum SKIP_BATCH for value: "SKIP_BATCH"
         */
        public static final OperationTypeEnum SKIP_BATCH = new OperationTypeEnum("SKIP_BATCH");

        /**
         * Enum CANCEL_ORDER for value: "CANCEL_ORDER"
         */
        public static final OperationTypeEnum CANCEL_ORDER = new OperationTypeEnum("CANCEL_ORDER");

        /**
         * Enum PAUSE_ORDER for value: "PAUSE_ORDER"
         */
        public static final OperationTypeEnum PAUSE_ORDER = new OperationTypeEnum("PAUSE_ORDER");

        /**
         * Enum CONTINUE_ORDER for value: "CONTINUE_ORDER"
         */
        public static final OperationTypeEnum CONTINUE_ORDER = new OperationTypeEnum("CONTINUE_ORDER");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("CANCEL_INSTANCE", CANCEL_INSTANCE);
            map.put("SKIP_BATCH", SKIP_BATCH);
            map.put("CANCEL_ORDER", CANCEL_ORDER);
            map.put("PAUSE_ORDER", PAUSE_ORDER);
            map.put("CONTINUE_ORDER", CONTINUE_ORDER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    public JobScriptOrderOperationBody withBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }

    /**
     * 适用于批次操作时
     * minimum: 1
     * maximum: 20
     * @return batchIndex
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public JobScriptOrderOperationBody withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 适用于实例操作时 非script_execute_instance_do中iD，需要新增字段
     * minimum: 1
     * maximum: 9223372036854775807
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public JobScriptOrderOperationBody withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型：取消实例、跳过批次、取消整个工单、暂停整个工单、继续整个工单 CANCEL_INSTANCE：取消实例 SKIP_BATCH：跳过批次 CANCEL_ORDER：取消整个工单 PAUSE_ORDER：暂停整个工单 CONTINUE_ORDER：继续整个工单
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptOrderOperationBody that = (JobScriptOrderOperationBody) obj;
        return Objects.equals(this.batchIndex, that.batchIndex) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.operationType, that.operationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIndex, instanceId, operationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptOrderOperationBody {\n");
        sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

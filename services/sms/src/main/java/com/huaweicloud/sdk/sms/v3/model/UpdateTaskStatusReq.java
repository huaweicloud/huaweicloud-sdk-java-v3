package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateTaskStatusReq {

    /**
     * 操作任务的具体动作 start:开始任务 stop:停止任务 test:测试 clone_test:克隆测试 restart:重新开始 network_check:网络质量检测 skip:跳过一致性校验子任务 clear:清理快照资源 migration_test: 开始迁移演练
     */
    public static final class OperationEnum {

        /**
         * Enum START for value: "start"
         */
        public static final OperationEnum START = new OperationEnum("start");

        /**
         * Enum STOP for value: "stop"
         */
        public static final OperationEnum STOP = new OperationEnum("stop");

        /**
         * Enum TEST for value: "test"
         */
        public static final OperationEnum TEST = new OperationEnum("test");

        /**
         * Enum CLONE_TEST for value: "clone_test"
         */
        public static final OperationEnum CLONE_TEST = new OperationEnum("clone_test");

        /**
         * Enum RESTART for value: "restart"
         */
        public static final OperationEnum RESTART = new OperationEnum("restart");

        /**
         * Enum NETWORK_CHECK for value: "network_check"
         */
        public static final OperationEnum NETWORK_CHECK = new OperationEnum("network_check");

        /**
         * Enum SKIP for value: "skip"
         */
        public static final OperationEnum SKIP = new OperationEnum("skip");

        /**
         * Enum CLEAR for value: "clear"
         */
        public static final OperationEnum CLEAR = new OperationEnum("clear");

        /**
         * Enum MIGRATION_TEST for value: "migration_test"
         */
        public static final OperationEnum MIGRATION_TEST = new OperationEnum("migration_test");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("start", START);
            map.put("stop", STOP);
            map.put("test", TEST);
            map.put("clone_test", CLONE_TEST);
            map.put("restart", RESTART);
            map.put("network_check", NETWORK_CHECK);
            map.put("skip", SKIP);
            map.put("clear", CLEAR);
            map.put("migration_test", MIGRATION_TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationEnum(value));
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private OperationEnum operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_hce")

    private Boolean switchHce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_consistency_check")

    private Boolean isNeedConsistencyCheck;

    public UpdateTaskStatusReq withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作任务的具体动作 start:开始任务 stop:停止任务 test:测试 clone_test:克隆测试 restart:重新开始 network_check:网络质量检测 skip:跳过一致性校验子任务 clear:清理快照资源 migration_test: 开始迁移演练
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public UpdateTaskStatusReq withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public UpdateTaskStatusReq withSwitchHce(Boolean switchHce) {
        this.switchHce = switchHce;
        return this;
    }

    /**
     * 是否切换hce
     * @return switchHce
     */
    public Boolean getSwitchHce() {
        return switchHce;
    }

    public void setSwitchHce(Boolean switchHce) {
        this.switchHce = switchHce;
    }

    public UpdateTaskStatusReq withIsNeedConsistencyCheck(Boolean isNeedConsistencyCheck) {
        this.isNeedConsistencyCheck = isNeedConsistencyCheck;
        return this;
    }

    /**
     * 是否进行一致性校验
     * @return isNeedConsistencyCheck
     */
    public Boolean getIsNeedConsistencyCheck() {
        return isNeedConsistencyCheck;
    }

    public void setIsNeedConsistencyCheck(Boolean isNeedConsistencyCheck) {
        this.isNeedConsistencyCheck = isNeedConsistencyCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskStatusReq that = (UpdateTaskStatusReq) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.switchHce, that.switchHce)
            && Objects.equals(this.isNeedConsistencyCheck, that.isNeedConsistencyCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, templateId, switchHce, isNeedConsistencyCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskStatusReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    switchHce: ").append(toIndentedString(switchHce)).append("\n");
        sb.append("    isNeedConsistencyCheck: ").append(toIndentedString(isNeedConsistencyCheck)).append("\n");
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

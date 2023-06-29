package com.huaweicloud.sdk.drs.v5.model;

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
 * 测试连接、预检查、启动、暂停、续传、重置、对比、结束等操作任务请求体。
 */
public class ActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 操作任务动作名称。取值： - network：测试连接源库/目标库。 - precheck：执行预检查。 - start：启动任务。 - stop：暂停任务。 - restart：重试任务。 - reset：重置任务。 - terminate：结束任务。 - skip_precheck：跳过预检查。 - create_compare：创建对比任务。 - cancel_compare：取消对比任务。
     */
    public static final class ActionNameEnum {

        /**
         * Enum NETWORK for value: "network"
         */
        public static final ActionNameEnum NETWORK = new ActionNameEnum("network");

        /**
         * Enum PRECHECK for value: "precheck"
         */
        public static final ActionNameEnum PRECHECK = new ActionNameEnum("precheck");

        /**
         * Enum START for value: "start"
         */
        public static final ActionNameEnum START = new ActionNameEnum("start");

        /**
         * Enum STOP for value: "stop"
         */
        public static final ActionNameEnum STOP = new ActionNameEnum("stop");

        /**
         * Enum RESTART for value: "restart"
         */
        public static final ActionNameEnum RESTART = new ActionNameEnum("restart");

        /**
         * Enum RESET for value: "reset"
         */
        public static final ActionNameEnum RESET = new ActionNameEnum("reset");

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final ActionNameEnum TERMINATE = new ActionNameEnum("terminate");

        /**
         * Enum SKIP_PRECHECK for value: "skip_precheck"
         */
        public static final ActionNameEnum SKIP_PRECHECK = new ActionNameEnum("skip_precheck");

        /**
         * Enum CREATE_COMPARE for value: "create_compare"
         */
        public static final ActionNameEnum CREATE_COMPARE = new ActionNameEnum("create_compare");

        /**
         * Enum CANCEL_COMPARE for value: "cancel_compare"
         */
        public static final ActionNameEnum CANCEL_COMPARE = new ActionNameEnum("cancel_compare");

        private static final Map<String, ActionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionNameEnum> createStaticFields() {
            Map<String, ActionNameEnum> map = new HashMap<>();
            map.put("network", NETWORK);
            map.put("precheck", PRECHECK);
            map.put("start", START);
            map.put("stop", STOP);
            map.put("restart", RESTART);
            map.put("reset", RESET);
            map.put("terminate", TERMINATE);
            map.put("skip_precheck", SKIP_PRECHECK);
            map.put("create_compare", CREATE_COMPARE);
            map.put("cancel_compare", CANCEL_COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionNameEnum(String value) {
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
        public static ActionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionNameEnum(value));
        }

        public static ActionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionNameEnum) {
                return this.value.equals(((ActionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private ActionNameEnum actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_params")

    private ActionParams actionParams;

    public ActionReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID (对比任务相关操作，多任务场景传父任务详情返回的master_job_id)，批量操作时必填
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ActionReq withActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 操作任务动作名称。取值： - network：测试连接源库/目标库。 - precheck：执行预检查。 - start：启动任务。 - stop：暂停任务。 - restart：重试任务。 - reset：重置任务。 - terminate：结束任务。 - skip_precheck：跳过预检查。 - create_compare：创建对比任务。 - cancel_compare：取消对比任务。
     * @return actionName
     */
    public ActionNameEnum getActionName() {
        return actionName;
    }

    public void setActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
    }

    public ActionReq withActionParams(ActionParams actionParams) {
        this.actionParams = actionParams;
        return this;
    }

    public ActionReq withActionParams(Consumer<ActionParams> actionParamsSetter) {
        if (this.actionParams == null) {
            this.actionParams = new ActionParams();
            actionParamsSetter.accept(this.actionParams);
        }

        return this;
    }

    /**
     * Get actionParams
     * @return actionParams
     */
    public ActionParams getActionParams() {
        return actionParams;
    }

    public void setActionParams(ActionParams actionParams) {
        this.actionParams = actionParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionReq that = (ActionReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.actionName, that.actionName)
            && Objects.equals(this.actionParams, that.actionParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, actionName, actionParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    actionParams: ").append(toIndentedString(actionParams)).append("\n");
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

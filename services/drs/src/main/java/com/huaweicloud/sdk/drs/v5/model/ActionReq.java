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
     * 操作任务动作名称。取值： - network：测试连接源库/目标库。 - precheck：执行预检查。 - start：启动任务。 - stop：暂停任务。 - restart：重试任务。 - reset：重置任务，需要先调用预检查接口并且预检查通过率为100%。 - terminate：结束任务。 - skip_precheck：跳过预检查。 - create_compare：创建对比任务。 - cancel_compare：取消对比任务。 - column_limit：字段过滤。 - reload_parameters：重新加载任务参数。 - bind_eip：绑定公网IP。 - unbind_eip：解绑公网IP。 - set_writable：目标库解除只读。 - cloud_connection：录制回放他云连通性测试。 - set_readonly: 灾备任务目标库设置只读。 - diagnosis：一键诊断。 - start_repair：开始数据修复。 - stop_repair：停止数据修复。
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

        /**
         * Enum COLUMN_LIMIT for value: "column_limit"
         */
        public static final ActionNameEnum COLUMN_LIMIT = new ActionNameEnum("column_limit");

        /**
         * Enum RELOAD_PARAMETERS for value: "reload_parameters"
         */
        public static final ActionNameEnum RELOAD_PARAMETERS = new ActionNameEnum("reload_parameters");

        /**
         * Enum BIND_EIP for value: "bind_eip"
         */
        public static final ActionNameEnum BIND_EIP = new ActionNameEnum("bind_eip");

        /**
         * Enum UNBIND_EIP for value: "unbind_eip"
         */
        public static final ActionNameEnum UNBIND_EIP = new ActionNameEnum("unbind_eip");

        /**
         * Enum SET_WRITABLE for value: "set_writable"
         */
        public static final ActionNameEnum SET_WRITABLE = new ActionNameEnum("set_writable");

        /**
         * Enum CLOUD_CONNECTION for value: "cloud_connection"
         */
        public static final ActionNameEnum CLOUD_CONNECTION = new ActionNameEnum("cloud_connection");

        /**
         * Enum SET_READONLY for value: "set_readonly"
         */
        public static final ActionNameEnum SET_READONLY = new ActionNameEnum("set_readonly");

        /**
         * Enum DIAGNOSIS for value: "diagnosis"
         */
        public static final ActionNameEnum DIAGNOSIS = new ActionNameEnum("diagnosis");

        /**
         * Enum START_REPAIR for value: "start_repair"
         */
        public static final ActionNameEnum START_REPAIR = new ActionNameEnum("start_repair");

        /**
         * Enum STOP_REPAIR for value: "stop_repair"
         */
        public static final ActionNameEnum STOP_REPAIR = new ActionNameEnum("stop_repair");

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
            map.put("column_limit", COLUMN_LIMIT);
            map.put("reload_parameters", RELOAD_PARAMETERS);
            map.put("bind_eip", BIND_EIP);
            map.put("unbind_eip", UNBIND_EIP);
            map.put("set_writable", SET_WRITABLE);
            map.put("cloud_connection", CLOUD_CONNECTION);
            map.put("set_readonly", SET_READONLY);
            map.put("diagnosis", DIAGNOSIS);
            map.put("start_repair", START_REPAIR);
            map.put("stop_repair", STOP_REPAIR);
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
     * 操作任务动作名称。取值： - network：测试连接源库/目标库。 - precheck：执行预检查。 - start：启动任务。 - stop：暂停任务。 - restart：重试任务。 - reset：重置任务，需要先调用预检查接口并且预检查通过率为100%。 - terminate：结束任务。 - skip_precheck：跳过预检查。 - create_compare：创建对比任务。 - cancel_compare：取消对比任务。 - column_limit：字段过滤。 - reload_parameters：重新加载任务参数。 - bind_eip：绑定公网IP。 - unbind_eip：解绑公网IP。 - set_writable：目标库解除只读。 - cloud_connection：录制回放他云连通性测试。 - set_readonly: 灾备任务目标库设置只读。 - diagnosis：一键诊断。 - start_repair：开始数据修复。 - stop_repair：停止数据修复。
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

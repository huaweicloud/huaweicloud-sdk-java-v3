package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务操作命令集合。
 */
public class JobActions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_actions")

    private List<String> availableActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_actions")

    private List<String> unavailableActions = null;

    /**
     * 任务当前操作命令。取值： - API_CONFIGURATION_ACTION：OPEN API配置中的任务能调用。 - CHANGE：修改任务。 - CHANGE_MODE：修改任务模式。 - CHOOSE_OBJECT：选择对象。 - CLONE：克隆任务。 - CONTINUE_APPLY：启动回放，Oracle同步到GaussDB分布式适用。 - CONTINUE_CAPTURE：启动抓取，Oracle同步到GaussDB分布式适用。 - CONTINUE_JOB：启动失败或者停止的任务，Oracle同步到GaussDB分布式适用。 - CREATE：创建任务。 - DELETE：删除任务。 - FREE_RESOURCE：释放资源。 - JUMP_RETRY：跳跃续传任务。 - MODIFY_CONFIGURATION：修改任务配置。 - MODIFY_DB_CONFIG：修改数据库配置。 - MODIFY_TASK_NUMBER：修改线程数配置。 - NODE_FLAVOR_MODIFY：规格变更。 - ORDER_INFO：订单详情。 - PAUSE：暂停任务。 - PAY_ORDER：包年/包月支付订单。 - PRE_CHECK：预检查。 - QUERY_PRE_CHECK：查询预检查结果。 - RESET：重置任务。 - RESET_DB_PWD：重置数据库密码（源库、目标库）。 - RETRY：重试任务。 - START：启动任务。 - START_INCR：启动增量任务。 - STOP_APPLY：停止回放，Oracle同步到GaussDB分布式适用。 - STOP_CAPTURE：停止抓取，Oracle同步到GaussDB分布式适用。 - STOP_JOB：停止任务，Oracle同步到GaussDB分布式适用。 - SWITCH_OVER：灾备倒换。 - TO_PERIOD：转包年/包月任务。 - TO_RENEW：包年/包月任务续费。 - UNSUBSCRIBE：包年/包月任务退订。
     */
    public static final class CurrentActionEnum {

        /**
         * Enum API_CONFIGURATION_ACTION for value: "API_CONFIGURATION_ACTION"
         */
        public static final CurrentActionEnum API_CONFIGURATION_ACTION =
            new CurrentActionEnum("API_CONFIGURATION_ACTION");

        /**
         * Enum CHANGE for value: "CHANGE"
         */
        public static final CurrentActionEnum CHANGE = new CurrentActionEnum("CHANGE");

        /**
         * Enum CHANGE_MODE for value: "CHANGE_MODE"
         */
        public static final CurrentActionEnum CHANGE_MODE = new CurrentActionEnum("CHANGE_MODE");

        /**
         * Enum CHOOSE_OBJECT for value: "CHOOSE_OBJECT"
         */
        public static final CurrentActionEnum CHOOSE_OBJECT = new CurrentActionEnum("CHOOSE_OBJECT");

        /**
         * Enum CLONE for value: "CLONE"
         */
        public static final CurrentActionEnum CLONE = new CurrentActionEnum("CLONE");

        /**
         * Enum CONTINUE_APPLY for value: "CONTINUE_APPLY"
         */
        public static final CurrentActionEnum CONTINUE_APPLY = new CurrentActionEnum("CONTINUE_APPLY");

        /**
         * Enum CONTINUE_CAPTURE for value: "CONTINUE_CAPTURE"
         */
        public static final CurrentActionEnum CONTINUE_CAPTURE = new CurrentActionEnum("CONTINUE_CAPTURE");

        /**
         * Enum CONTINUE_JOB for value: "CONTINUE_JOB"
         */
        public static final CurrentActionEnum CONTINUE_JOB = new CurrentActionEnum("CONTINUE_JOB");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final CurrentActionEnum CREATE = new CurrentActionEnum("CREATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final CurrentActionEnum DELETE = new CurrentActionEnum("DELETE");

        /**
         * Enum FREE_RESOURCE for value: "FREE_RESOURCE"
         */
        public static final CurrentActionEnum FREE_RESOURCE = new CurrentActionEnum("FREE_RESOURCE");

        /**
         * Enum JUMP_RETRY for value: "JUMP_RETRY"
         */
        public static final CurrentActionEnum JUMP_RETRY = new CurrentActionEnum("JUMP_RETRY");

        /**
         * Enum MODIFY_CONFIGURATION for value: "MODIFY_CONFIGURATION"
         */
        public static final CurrentActionEnum MODIFY_CONFIGURATION = new CurrentActionEnum("MODIFY_CONFIGURATION");

        /**
         * Enum MODIFY_DB_CONFIG for value: "MODIFY_DB_CONFIG"
         */
        public static final CurrentActionEnum MODIFY_DB_CONFIG = new CurrentActionEnum("MODIFY_DB_CONFIG");

        /**
         * Enum MODIFY_TASK_NUMBER for value: "MODIFY_TASK_NUMBER"
         */
        public static final CurrentActionEnum MODIFY_TASK_NUMBER = new CurrentActionEnum("MODIFY_TASK_NUMBER");

        /**
         * Enum NODE_FLAVOR_MODIFY for value: "NODE_FLAVOR_MODIFY"
         */
        public static final CurrentActionEnum NODE_FLAVOR_MODIFY = new CurrentActionEnum("NODE_FLAVOR_MODIFY");

        /**
         * Enum ORDER_INFO for value: "ORDER_INFO"
         */
        public static final CurrentActionEnum ORDER_INFO = new CurrentActionEnum("ORDER_INFO");

        /**
         * Enum PAUSE for value: "PAUSE"
         */
        public static final CurrentActionEnum PAUSE = new CurrentActionEnum("PAUSE");

        /**
         * Enum PAY_ORDER for value: "PAY_ORDER"
         */
        public static final CurrentActionEnum PAY_ORDER = new CurrentActionEnum("PAY_ORDER");

        /**
         * Enum PRE_CHECK for value: "PRE_CHECK"
         */
        public static final CurrentActionEnum PRE_CHECK = new CurrentActionEnum("PRE_CHECK");

        /**
         * Enum QUERY_PRE_CHECK for value: "QUERY_PRE_CHECK"
         */
        public static final CurrentActionEnum QUERY_PRE_CHECK = new CurrentActionEnum("QUERY_PRE_CHECK");

        /**
         * Enum RESET for value: "RESET"
         */
        public static final CurrentActionEnum RESET = new CurrentActionEnum("RESET");

        /**
         * Enum RESET_DB_PWD for value: "RESET_DB_PWD"
         */
        public static final CurrentActionEnum RESET_DB_PWD = new CurrentActionEnum("RESET_DB_PWD");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final CurrentActionEnum RETRY = new CurrentActionEnum("RETRY");

        /**
         * Enum START for value: "START"
         */
        public static final CurrentActionEnum START = new CurrentActionEnum("START");

        /**
         * Enum START_INCR for value: "START_INCR"
         */
        public static final CurrentActionEnum START_INCR = new CurrentActionEnum("START_INCR");

        /**
         * Enum STOP_APPLY for value: "STOP_APPLY"
         */
        public static final CurrentActionEnum STOP_APPLY = new CurrentActionEnum("STOP_APPLY");

        /**
         * Enum STOP_CAPTURE for value: "STOP_CAPTURE"
         */
        public static final CurrentActionEnum STOP_CAPTURE = new CurrentActionEnum("STOP_CAPTURE");

        /**
         * Enum STOP_JOB for value: "STOP_JOB"
         */
        public static final CurrentActionEnum STOP_JOB = new CurrentActionEnum("STOP_JOB");

        /**
         * Enum SWITCH_OVER for value: "SWITCH_OVER"
         */
        public static final CurrentActionEnum SWITCH_OVER = new CurrentActionEnum("SWITCH_OVER");

        /**
         * Enum TO_PERIOD for value: "TO_PERIOD"
         */
        public static final CurrentActionEnum TO_PERIOD = new CurrentActionEnum("TO_PERIOD");

        /**
         * Enum TO_RENEW for value: "TO_RENEW"
         */
        public static final CurrentActionEnum TO_RENEW = new CurrentActionEnum("TO_RENEW");

        /**
         * Enum UNSUBSCRIBE for value: "UNSUBSCRIBE"
         */
        public static final CurrentActionEnum UNSUBSCRIBE = new CurrentActionEnum("UNSUBSCRIBE");

        private static final Map<String, CurrentActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CurrentActionEnum> createStaticFields() {
            Map<String, CurrentActionEnum> map = new HashMap<>();
            map.put("API_CONFIGURATION_ACTION", API_CONFIGURATION_ACTION);
            map.put("CHANGE", CHANGE);
            map.put("CHANGE_MODE", CHANGE_MODE);
            map.put("CHOOSE_OBJECT", CHOOSE_OBJECT);
            map.put("CLONE", CLONE);
            map.put("CONTINUE_APPLY", CONTINUE_APPLY);
            map.put("CONTINUE_CAPTURE", CONTINUE_CAPTURE);
            map.put("CONTINUE_JOB", CONTINUE_JOB);
            map.put("CREATE", CREATE);
            map.put("DELETE", DELETE);
            map.put("FREE_RESOURCE", FREE_RESOURCE);
            map.put("JUMP_RETRY", JUMP_RETRY);
            map.put("MODIFY_CONFIGURATION", MODIFY_CONFIGURATION);
            map.put("MODIFY_DB_CONFIG", MODIFY_DB_CONFIG);
            map.put("MODIFY_TASK_NUMBER", MODIFY_TASK_NUMBER);
            map.put("NODE_FLAVOR_MODIFY", NODE_FLAVOR_MODIFY);
            map.put("ORDER_INFO", ORDER_INFO);
            map.put("PAUSE", PAUSE);
            map.put("PAY_ORDER", PAY_ORDER);
            map.put("PRE_CHECK", PRE_CHECK);
            map.put("QUERY_PRE_CHECK", QUERY_PRE_CHECK);
            map.put("RESET", RESET);
            map.put("RESET_DB_PWD", RESET_DB_PWD);
            map.put("RETRY", RETRY);
            map.put("START", START);
            map.put("START_INCR", START_INCR);
            map.put("STOP_APPLY", STOP_APPLY);
            map.put("STOP_CAPTURE", STOP_CAPTURE);
            map.put("STOP_JOB", STOP_JOB);
            map.put("SWITCH_OVER", SWITCH_OVER);
            map.put("TO_PERIOD", TO_PERIOD);
            map.put("TO_RENEW", TO_RENEW);
            map.put("UNSUBSCRIBE", UNSUBSCRIBE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CurrentActionEnum(String value) {
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
        public static CurrentActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CurrentActionEnum(value));
        }

        public static CurrentActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CurrentActionEnum) {
                return this.value.equals(((CurrentActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_action")

    private CurrentActionEnum currentAction;

    public JobActions withAvailableActions(List<String> availableActions) {
        this.availableActions = availableActions;
        return this;
    }

    public JobActions addAvailableActionsItem(String availableActionsItem) {
        if (this.availableActions == null) {
            this.availableActions = new ArrayList<>();
        }
        this.availableActions.add(availableActionsItem);
        return this;
    }

    public JobActions withAvailableActions(Consumer<List<String>> availableActionsSetter) {
        if (this.availableActions == null) {
            this.availableActions = new ArrayList<>();
        }
        availableActionsSetter.accept(this.availableActions);
        return this;
    }

    /**
     * 任务可操作命令集合。
     * @return availableActions
     */
    public List<String> getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(List<String> availableActions) {
        this.availableActions = availableActions;
    }

    public JobActions withUnavailableActions(List<String> unavailableActions) {
        this.unavailableActions = unavailableActions;
        return this;
    }

    public JobActions addUnavailableActionsItem(String unavailableActionsItem) {
        if (this.unavailableActions == null) {
            this.unavailableActions = new ArrayList<>();
        }
        this.unavailableActions.add(unavailableActionsItem);
        return this;
    }

    public JobActions withUnavailableActions(Consumer<List<String>> unavailableActionsSetter) {
        if (this.unavailableActions == null) {
            this.unavailableActions = new ArrayList<>();
        }
        unavailableActionsSetter.accept(this.unavailableActions);
        return this;
    }

    /**
     * 任务不可操作命令集合。
     * @return unavailableActions
     */
    public List<String> getUnavailableActions() {
        return unavailableActions;
    }

    public void setUnavailableActions(List<String> unavailableActions) {
        this.unavailableActions = unavailableActions;
    }

    public JobActions withCurrentAction(CurrentActionEnum currentAction) {
        this.currentAction = currentAction;
        return this;
    }

    /**
     * 任务当前操作命令。取值： - API_CONFIGURATION_ACTION：OPEN API配置中的任务能调用。 - CHANGE：修改任务。 - CHANGE_MODE：修改任务模式。 - CHOOSE_OBJECT：选择对象。 - CLONE：克隆任务。 - CONTINUE_APPLY：启动回放，Oracle同步到GaussDB分布式适用。 - CONTINUE_CAPTURE：启动抓取，Oracle同步到GaussDB分布式适用。 - CONTINUE_JOB：启动失败或者停止的任务，Oracle同步到GaussDB分布式适用。 - CREATE：创建任务。 - DELETE：删除任务。 - FREE_RESOURCE：释放资源。 - JUMP_RETRY：跳跃续传任务。 - MODIFY_CONFIGURATION：修改任务配置。 - MODIFY_DB_CONFIG：修改数据库配置。 - MODIFY_TASK_NUMBER：修改线程数配置。 - NODE_FLAVOR_MODIFY：规格变更。 - ORDER_INFO：订单详情。 - PAUSE：暂停任务。 - PAY_ORDER：包年/包月支付订单。 - PRE_CHECK：预检查。 - QUERY_PRE_CHECK：查询预检查结果。 - RESET：重置任务。 - RESET_DB_PWD：重置数据库密码（源库、目标库）。 - RETRY：重试任务。 - START：启动任务。 - START_INCR：启动增量任务。 - STOP_APPLY：停止回放，Oracle同步到GaussDB分布式适用。 - STOP_CAPTURE：停止抓取，Oracle同步到GaussDB分布式适用。 - STOP_JOB：停止任务，Oracle同步到GaussDB分布式适用。 - SWITCH_OVER：灾备倒换。 - TO_PERIOD：转包年/包月任务。 - TO_RENEW：包年/包月任务续费。 - UNSUBSCRIBE：包年/包月任务退订。
     * @return currentAction
     */
    public CurrentActionEnum getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(CurrentActionEnum currentAction) {
        this.currentAction = currentAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobActions that = (JobActions) obj;
        return Objects.equals(this.availableActions, that.availableActions)
            && Objects.equals(this.unavailableActions, that.unavailableActions)
            && Objects.equals(this.currentAction, that.currentAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableActions, unavailableActions, currentAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobActions {\n");
        sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
        sb.append("    unavailableActions: ").append(toIndentedString(unavailableActions)).append("\n");
        sb.append("    currentAction: ").append(toIndentedString(currentAction)).append("\n");
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

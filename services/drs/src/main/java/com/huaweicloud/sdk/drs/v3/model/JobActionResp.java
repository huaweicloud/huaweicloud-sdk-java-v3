package com.huaweicloud.sdk.drs.v3.model;

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
 * JobActionResp
 */
public class JobActionResp {

    /**
     * Gets or Sets availableActions
     */
    public static final class AvailableActionsEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final AvailableActionsEnum CREATE = new AvailableActionsEnum("CREATE");

        /**
         * Enum CHOOSE_OBJECT for value: "CHOOSE_OBJECT"
         */
        public static final AvailableActionsEnum CHOOSE_OBJECT = new AvailableActionsEnum("CHOOSE_OBJECT");

        /**
         * Enum PRE_CHECK for value: "PRE_CHECK"
         */
        public static final AvailableActionsEnum PRE_CHECK = new AvailableActionsEnum("PRE_CHECK");

        /**
         * Enum CHANGE_MODE for value: "CHANGE_MODE"
         */
        public static final AvailableActionsEnum CHANGE_MODE = new AvailableActionsEnum("CHANGE_MODE");

        /**
         * Enum FREE_RESOURCE for value: "FREE_RESOURCE"
         */
        public static final AvailableActionsEnum FREE_RESOURCE = new AvailableActionsEnum("FREE_RESOURCE");

        /**
         * Enum MODIFY_DB_CONFIG for value: "MODIFY_DB_CONFIG"
         */
        public static final AvailableActionsEnum MODIFY_DB_CONFIG = new AvailableActionsEnum("MODIFY_DB_CONFIG");

        /**
         * Enum RESET_DB_PWD for value: "RESET_DB_PWD"
         */
        public static final AvailableActionsEnum RESET_DB_PWD = new AvailableActionsEnum("RESET_DB_PWD");

        /**
         * Enum MODIFY_CONFIGURATION for value: "MODIFY_CONFIGURATION"
         */
        public static final AvailableActionsEnum MODIFY_CONFIGURATION =
            new AvailableActionsEnum("MODIFY_CONFIGURATION");

        /**
         * Enum PAUSE for value: "PAUSE"
         */
        public static final AvailableActionsEnum PAUSE = new AvailableActionsEnum("PAUSE");

        /**
         * Enum START for value: "START"
         */
        public static final AvailableActionsEnum START = new AvailableActionsEnum("START");

        /**
         * Enum CHANGE for value: "CHANGE"
         */
        public static final AvailableActionsEnum CHANGE = new AvailableActionsEnum("CHANGE");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final AvailableActionsEnum RETRY = new AvailableActionsEnum("RETRY");

        /**
         * Enum RESET for value: "RESET"
         */
        public static final AvailableActionsEnum RESET = new AvailableActionsEnum("RESET");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final AvailableActionsEnum DELETE = new AvailableActionsEnum("DELETE");

        /**
         * Enum QUERY_PRE_CHECK for value: "QUERY_PRE_CHECK"
         */
        public static final AvailableActionsEnum QUERY_PRE_CHECK = new AvailableActionsEnum("QUERY_PRE_CHECK");

        /**
         * Enum SWITCH_OVER for value: "SWITCH_OVER"
         */
        public static final AvailableActionsEnum SWITCH_OVER = new AvailableActionsEnum("SWITCH_OVER");

        /**
         * Enum MODIFY_SPECIFICATION_ID for value: "MODIFY_SPECIFICATION_ID"
         */
        public static final AvailableActionsEnum MODIFY_SPECIFICATION_ID =
            new AvailableActionsEnum("MODIFY_SPECIFICATION_ID");

        /**
         * Enum JUMP_RETRY for value: "JUMP_RETRY"
         */
        public static final AvailableActionsEnum JUMP_RETRY = new AvailableActionsEnum("JUMP_RETRY");

        /**
         * Enum START_INCR for value: "START_INCR"
         */
        public static final AvailableActionsEnum START_INCR = new AvailableActionsEnum("START_INCR");

        /**
         * Enum MODIFY_TASK_NUMBER for value: "MODIFY_TASK_NUMBER"
         */
        public static final AvailableActionsEnum MODIFY_TASK_NUMBER = new AvailableActionsEnum("MODIFY_TASK_NUMBER");

        /**
         * Enum CONTINUE_JOB for value: "CONTINUE_JOB"
         */
        public static final AvailableActionsEnum CONTINUE_JOB = new AvailableActionsEnum("CONTINUE_JOB");

        /**
         * Enum STOP_JOB for value: "STOP_JOB"
         */
        public static final AvailableActionsEnum STOP_JOB = new AvailableActionsEnum("STOP_JOB");

        /**
         * Enum CONTINUE_CAPTURE for value: "CONTINUE_CAPTURE"
         */
        public static final AvailableActionsEnum CONTINUE_CAPTURE = new AvailableActionsEnum("CONTINUE_CAPTURE");

        /**
         * Enum STOP_CAPTURE for value: "STOP_CAPTURE"
         */
        public static final AvailableActionsEnum STOP_CAPTURE = new AvailableActionsEnum("STOP_CAPTURE");

        /**
         * Enum CONTINUE_APPLY for value: "CONTINUE_APPLY"
         */
        public static final AvailableActionsEnum CONTINUE_APPLY = new AvailableActionsEnum("CONTINUE_APPLY");

        /**
         * Enum API_CONFIGURATION_ACTION for value: "API_CONFIGURATION_ACTION"
         */
        public static final AvailableActionsEnum API_CONFIGURATION_ACTION =
            new AvailableActionsEnum("API_CONFIGURATION_ACTION");

        /**
         * Enum STOP_APPLY for value: "STOP_APPLY"
         */
        public static final AvailableActionsEnum STOP_APPLY = new AvailableActionsEnum("STOP_APPLY");

        /**
         * Enum PAY_ORDER for value: "PAY_ORDER"
         */
        public static final AvailableActionsEnum PAY_ORDER = new AvailableActionsEnum("PAY_ORDER");

        /**
         * Enum UNSUBSCRIBE for value: "UNSUBSCRIBE"
         */
        public static final AvailableActionsEnum UNSUBSCRIBE = new AvailableActionsEnum("UNSUBSCRIBE");

        /**
         * Enum TO_PERIOD for value: "TO_PERIOD"
         */
        public static final AvailableActionsEnum TO_PERIOD = new AvailableActionsEnum("TO_PERIOD");

        /**
         * Enum TO_RENEW for value: "TO_RENEW"
         */
        public static final AvailableActionsEnum TO_RENEW = new AvailableActionsEnum("TO_RENEW");

        /**
         * Enum ORDER_INFO for value: "ORDER_INFO"
         */
        public static final AvailableActionsEnum ORDER_INFO = new AvailableActionsEnum("ORDER_INFO");

        /**
         * Enum CHANGE_FLAVOR for value: "CHANGE_FLAVOR"
         */
        public static final AvailableActionsEnum CHANGE_FLAVOR = new AvailableActionsEnum("CHANGE_FLAVOR");

        /**
         * Enum CLONE for value: "CLONE"
         */
        public static final AvailableActionsEnum CLONE = new AvailableActionsEnum("CLONE");

        private static final Map<String, AvailableActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AvailableActionsEnum> createStaticFields() {
            Map<String, AvailableActionsEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("CHOOSE_OBJECT", CHOOSE_OBJECT);
            map.put("PRE_CHECK", PRE_CHECK);
            map.put("CHANGE_MODE", CHANGE_MODE);
            map.put("FREE_RESOURCE", FREE_RESOURCE);
            map.put("MODIFY_DB_CONFIG", MODIFY_DB_CONFIG);
            map.put("RESET_DB_PWD", RESET_DB_PWD);
            map.put("MODIFY_CONFIGURATION", MODIFY_CONFIGURATION);
            map.put("PAUSE", PAUSE);
            map.put("START", START);
            map.put("CHANGE", CHANGE);
            map.put("RETRY", RETRY);
            map.put("RESET", RESET);
            map.put("DELETE", DELETE);
            map.put("QUERY_PRE_CHECK", QUERY_PRE_CHECK);
            map.put("SWITCH_OVER", SWITCH_OVER);
            map.put("MODIFY_SPECIFICATION_ID", MODIFY_SPECIFICATION_ID);
            map.put("JUMP_RETRY", JUMP_RETRY);
            map.put("START_INCR", START_INCR);
            map.put("MODIFY_TASK_NUMBER", MODIFY_TASK_NUMBER);
            map.put("CONTINUE_JOB", CONTINUE_JOB);
            map.put("STOP_JOB", STOP_JOB);
            map.put("CONTINUE_CAPTURE", CONTINUE_CAPTURE);
            map.put("STOP_CAPTURE", STOP_CAPTURE);
            map.put("CONTINUE_APPLY", CONTINUE_APPLY);
            map.put("API_CONFIGURATION_ACTION", API_CONFIGURATION_ACTION);
            map.put("STOP_APPLY", STOP_APPLY);
            map.put("PAY_ORDER", PAY_ORDER);
            map.put("UNSUBSCRIBE", UNSUBSCRIBE);
            map.put("TO_PERIOD", TO_PERIOD);
            map.put("TO_RENEW", TO_RENEW);
            map.put("ORDER_INFO", ORDER_INFO);
            map.put("CHANGE_FLAVOR", CHANGE_FLAVOR);
            map.put("CLONE", CLONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AvailableActionsEnum(String value) {
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
        public static AvailableActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AvailableActionsEnum(value));
        }

        public static AvailableActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AvailableActionsEnum) {
                return this.value.equals(((AvailableActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_actions")

    private List<AvailableActionsEnum> availableActions = null;

    /**
     * Gets or Sets unavailableActions
     */
    public static final class UnavailableActionsEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final UnavailableActionsEnum CREATE = new UnavailableActionsEnum("CREATE");

        /**
         * Enum CHOOSE_OBJECT for value: "CHOOSE_OBJECT"
         */
        public static final UnavailableActionsEnum CHOOSE_OBJECT = new UnavailableActionsEnum("CHOOSE_OBJECT");

        /**
         * Enum PRE_CHECK for value: "PRE_CHECK"
         */
        public static final UnavailableActionsEnum PRE_CHECK = new UnavailableActionsEnum("PRE_CHECK");

        /**
         * Enum CHANGE_MODE for value: "CHANGE_MODE"
         */
        public static final UnavailableActionsEnum CHANGE_MODE = new UnavailableActionsEnum("CHANGE_MODE");

        /**
         * Enum FREE_RESOURCE for value: "FREE_RESOURCE"
         */
        public static final UnavailableActionsEnum FREE_RESOURCE = new UnavailableActionsEnum("FREE_RESOURCE");

        /**
         * Enum MODIFY_DB_CONFIG for value: "MODIFY_DB_CONFIG"
         */
        public static final UnavailableActionsEnum MODIFY_DB_CONFIG = new UnavailableActionsEnum("MODIFY_DB_CONFIG");

        /**
         * Enum RESET_DB_PWD for value: "RESET_DB_PWD"
         */
        public static final UnavailableActionsEnum RESET_DB_PWD = new UnavailableActionsEnum("RESET_DB_PWD");

        /**
         * Enum MODIFY_CONFIGURATION for value: "MODIFY_CONFIGURATION"
         */
        public static final UnavailableActionsEnum MODIFY_CONFIGURATION =
            new UnavailableActionsEnum("MODIFY_CONFIGURATION");

        /**
         * Enum PAUSE for value: "PAUSE"
         */
        public static final UnavailableActionsEnum PAUSE = new UnavailableActionsEnum("PAUSE");

        /**
         * Enum START for value: "START"
         */
        public static final UnavailableActionsEnum START = new UnavailableActionsEnum("START");

        /**
         * Enum CHANGE for value: "CHANGE"
         */
        public static final UnavailableActionsEnum CHANGE = new UnavailableActionsEnum("CHANGE");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final UnavailableActionsEnum RETRY = new UnavailableActionsEnum("RETRY");

        /**
         * Enum RESET for value: "RESET"
         */
        public static final UnavailableActionsEnum RESET = new UnavailableActionsEnum("RESET");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final UnavailableActionsEnum DELETE = new UnavailableActionsEnum("DELETE");

        /**
         * Enum QUERY_PRE_CHECK for value: "QUERY_PRE_CHECK"
         */
        public static final UnavailableActionsEnum QUERY_PRE_CHECK = new UnavailableActionsEnum("QUERY_PRE_CHECK");

        /**
         * Enum SWITCH_OVER for value: "SWITCH_OVER"
         */
        public static final UnavailableActionsEnum SWITCH_OVER = new UnavailableActionsEnum("SWITCH_OVER");

        /**
         * Enum MODIFY_SPECIFICATION_ID for value: "MODIFY_SPECIFICATION_ID"
         */
        public static final UnavailableActionsEnum MODIFY_SPECIFICATION_ID =
            new UnavailableActionsEnum("MODIFY_SPECIFICATION_ID");

        /**
         * Enum JUMP_RETRY for value: "JUMP_RETRY"
         */
        public static final UnavailableActionsEnum JUMP_RETRY = new UnavailableActionsEnum("JUMP_RETRY");

        /**
         * Enum START_INCR for value: "START_INCR"
         */
        public static final UnavailableActionsEnum START_INCR = new UnavailableActionsEnum("START_INCR");

        /**
         * Enum MODIFY_TASK_NUMBER for value: "MODIFY_TASK_NUMBER"
         */
        public static final UnavailableActionsEnum MODIFY_TASK_NUMBER =
            new UnavailableActionsEnum("MODIFY_TASK_NUMBER");

        /**
         * Enum CONTINUE_JOB for value: "CONTINUE_JOB"
         */
        public static final UnavailableActionsEnum CONTINUE_JOB = new UnavailableActionsEnum("CONTINUE_JOB");

        /**
         * Enum STOP_JOB for value: "STOP_JOB"
         */
        public static final UnavailableActionsEnum STOP_JOB = new UnavailableActionsEnum("STOP_JOB");

        /**
         * Enum CONTINUE_CAPTURE for value: "CONTINUE_CAPTURE"
         */
        public static final UnavailableActionsEnum CONTINUE_CAPTURE = new UnavailableActionsEnum("CONTINUE_CAPTURE");

        /**
         * Enum STOP_CAPTURE for value: "STOP_CAPTURE"
         */
        public static final UnavailableActionsEnum STOP_CAPTURE = new UnavailableActionsEnum("STOP_CAPTURE");

        /**
         * Enum CONTINUE_APPLY for value: "CONTINUE_APPLY"
         */
        public static final UnavailableActionsEnum CONTINUE_APPLY = new UnavailableActionsEnum("CONTINUE_APPLY");

        /**
         * Enum API_CONFIGURATION_ACTION for value: "API_CONFIGURATION_ACTION"
         */
        public static final UnavailableActionsEnum API_CONFIGURATION_ACTION =
            new UnavailableActionsEnum("API_CONFIGURATION_ACTION");

        /**
         * Enum STOP_APPLY for value: "STOP_APPLY"
         */
        public static final UnavailableActionsEnum STOP_APPLY = new UnavailableActionsEnum("STOP_APPLY");

        /**
         * Enum PAY_ORDER for value: "PAY_ORDER"
         */
        public static final UnavailableActionsEnum PAY_ORDER = new UnavailableActionsEnum("PAY_ORDER");

        /**
         * Enum UNSUBSCRIBE for value: "UNSUBSCRIBE"
         */
        public static final UnavailableActionsEnum UNSUBSCRIBE = new UnavailableActionsEnum("UNSUBSCRIBE");

        /**
         * Enum TO_PERIOD for value: "TO_PERIOD"
         */
        public static final UnavailableActionsEnum TO_PERIOD = new UnavailableActionsEnum("TO_PERIOD");

        /**
         * Enum TO_RENEW for value: "TO_RENEW"
         */
        public static final UnavailableActionsEnum TO_RENEW = new UnavailableActionsEnum("TO_RENEW");

        /**
         * Enum ORDER_INFO for value: "ORDER_INFO"
         */
        public static final UnavailableActionsEnum ORDER_INFO = new UnavailableActionsEnum("ORDER_INFO");

        /**
         * Enum CHANGE_FLAVOR for value: "CHANGE_FLAVOR"
         */
        public static final UnavailableActionsEnum CHANGE_FLAVOR = new UnavailableActionsEnum("CHANGE_FLAVOR");

        /**
         * Enum CLONE for value: "CLONE"
         */
        public static final UnavailableActionsEnum CLONE = new UnavailableActionsEnum("CLONE");

        private static final Map<String, UnavailableActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnavailableActionsEnum> createStaticFields() {
            Map<String, UnavailableActionsEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("CHOOSE_OBJECT", CHOOSE_OBJECT);
            map.put("PRE_CHECK", PRE_CHECK);
            map.put("CHANGE_MODE", CHANGE_MODE);
            map.put("FREE_RESOURCE", FREE_RESOURCE);
            map.put("MODIFY_DB_CONFIG", MODIFY_DB_CONFIG);
            map.put("RESET_DB_PWD", RESET_DB_PWD);
            map.put("MODIFY_CONFIGURATION", MODIFY_CONFIGURATION);
            map.put("PAUSE", PAUSE);
            map.put("START", START);
            map.put("CHANGE", CHANGE);
            map.put("RETRY", RETRY);
            map.put("RESET", RESET);
            map.put("DELETE", DELETE);
            map.put("QUERY_PRE_CHECK", QUERY_PRE_CHECK);
            map.put("SWITCH_OVER", SWITCH_OVER);
            map.put("MODIFY_SPECIFICATION_ID", MODIFY_SPECIFICATION_ID);
            map.put("JUMP_RETRY", JUMP_RETRY);
            map.put("START_INCR", START_INCR);
            map.put("MODIFY_TASK_NUMBER", MODIFY_TASK_NUMBER);
            map.put("CONTINUE_JOB", CONTINUE_JOB);
            map.put("STOP_JOB", STOP_JOB);
            map.put("CONTINUE_CAPTURE", CONTINUE_CAPTURE);
            map.put("STOP_CAPTURE", STOP_CAPTURE);
            map.put("CONTINUE_APPLY", CONTINUE_APPLY);
            map.put("API_CONFIGURATION_ACTION", API_CONFIGURATION_ACTION);
            map.put("STOP_APPLY", STOP_APPLY);
            map.put("PAY_ORDER", PAY_ORDER);
            map.put("UNSUBSCRIBE", UNSUBSCRIBE);
            map.put("TO_PERIOD", TO_PERIOD);
            map.put("TO_RENEW", TO_RENEW);
            map.put("ORDER_INFO", ORDER_INFO);
            map.put("CHANGE_FLAVOR", CHANGE_FLAVOR);
            map.put("CLONE", CLONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnavailableActionsEnum(String value) {
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
        public static UnavailableActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnavailableActionsEnum(value));
        }

        public static UnavailableActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnavailableActionsEnum) {
                return this.value.equals(((UnavailableActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_actions")

    private List<UnavailableActionsEnum> unavailableActions = null;

    /**
     * 示例： SWITCH_OVER：灾备倒换中 STOP_JOB：任务暂停中
     */
    public static final class CurrentActionEnum {

        /**
         * Enum SWITCH_OVER for value: "SWITCH_OVER"
         */
        public static final CurrentActionEnum SWITCH_OVER = new CurrentActionEnum("SWITCH_OVER");

        /**
         * Enum STOP_JOB for value: "STOP_JOB"
         */
        public static final CurrentActionEnum STOP_JOB = new CurrentActionEnum("STOP_JOB");

        private static final Map<String, CurrentActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CurrentActionEnum> createStaticFields() {
            Map<String, CurrentActionEnum> map = new HashMap<>();
            map.put("SWITCH_OVER", SWITCH_OVER);
            map.put("STOP_JOB", STOP_JOB);
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

    public JobActionResp withAvailableActions(List<AvailableActionsEnum> availableActions) {
        this.availableActions = availableActions;
        return this;
    }

    public JobActionResp addAvailableActionsItem(AvailableActionsEnum availableActionsItem) {
        if (this.availableActions == null) {
            this.availableActions = new ArrayList<>();
        }
        this.availableActions.add(availableActionsItem);
        return this;
    }

    public JobActionResp withAvailableActions(Consumer<List<AvailableActionsEnum>> availableActionsSetter) {
        if (this.availableActions == null) {
            this.availableActions = new ArrayList<>();
        }
        availableActionsSetter.accept(this.availableActions);
        return this;
    }

    /**
     * 任务可操作命令集合。 取值： CREATE：创建任务 CHOOSE_OBJECT：选择对象 PRE_CHECK：预检查 CHANGE_MODE：修改任务模式 FREE_RESOURCE：释放资源 MODIFY_DB_CONFIG：修改数据库配置 RESET_DB_PWD：重置数据库密码（源库、目标库） MODIFY_CONFIGURATION：修改任务配置 PAUSE：暂停任务 START：启动任务 CHANGE：修改任务 RETRY：重试任务 RESET：重置任务 DELETE：删除任务 QUERY_PRE_CHECK：预检查 SWITCH_OVER：容灾倒换 START_INCR：CASSANDRA启动增量任务 MODIFY_TASK_NUMBER：CASSANDRA修改线程数配置 CONTINUE_JOB：oracle-GaussDB分布式:启动失败或者停止的任务 STOP_JOB：oracle-GaussDB分布式:停止任务 CONTINUE_CAPTURE：oracle-GaussDB分布式:启动抓取 STOP_CAPTURE：oracle-GaussDB分布式:停止抓取 CONTINUE_APPLY：oracle-GaussDB分布式:启动回放 STOP_APPLY：oracle-GaussDB分布式:停止回放 PAY_ORDER：包年包月支付订单 UNSUBSCRIBE：包年包月退订 TO_PERIOD：转包周期 TO_RENEW：包周期续费 ORDER_INFO：订单详情 CHANGE_FLAVOR：规格变更 CLONE：克隆任务
     * @return availableActions
     */
    public List<AvailableActionsEnum> getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(List<AvailableActionsEnum> availableActions) {
        this.availableActions = availableActions;
    }

    public JobActionResp withUnavailableActions(List<UnavailableActionsEnum> unavailableActions) {
        this.unavailableActions = unavailableActions;
        return this;
    }

    public JobActionResp addUnavailableActionsItem(UnavailableActionsEnum unavailableActionsItem) {
        if (this.unavailableActions == null) {
            this.unavailableActions = new ArrayList<>();
        }
        this.unavailableActions.add(unavailableActionsItem);
        return this;
    }

    public JobActionResp withUnavailableActions(Consumer<List<UnavailableActionsEnum>> unavailableActionsSetter) {
        if (this.unavailableActions == null) {
            this.unavailableActions = new ArrayList<>();
        }
        unavailableActionsSetter.accept(this.unavailableActions);
        return this;
    }

    /**
     * 任务不可操作命令集合。 取值： CREATE：创建任务 CHOOSE_OBJECT：选择对象 PRE_CHECK：预检查 CHANGE_MODE：修改任务模式 FREE_RESOURCE：释放资源 MODIFY_DB_CONFIG：修改数据库配置 RESET_DB_PWD：重置数据库密码（源库、目标库） MODIFY_CONFIGURATION：修改任务配置 PAUSE：暂停任务 START：启动任务 CHANGE：修改任务 RETRY：重试任务 RESET：重置任务 DELETE：删除任务 QUERY_PRE_CHECK：预检查 SWITCH_OVER：容灾倒换 START_INCR：CASSANDRA启动增量任务 MODIFY_TASK_NUMBER：CASSANDRA修改线程数配置 CONTINUE_JOB：oracle-GaussDB分布式:启动失败或者停止的任务 STOP_JOB：oracle-GaussDB分布式:停止任务 CONTINUE_CAPTURE：oracle-GaussDB分布式:启动抓取 STOP_CAPTURE：oracle-GaussDB分布式:停止抓取 CONTINUE_APPLY：oracle-GaussDB分布式:启动回放 STOP_APPLY：oracle-GaussDB分布式:停止回放 PAY_ORDER：包年包月支付订单 UNSUBSCRIBE：包年包月退订 TO_PERIOD：转包周期 TO_RENEW：包周期续费 ORDER_INFO：订单详情 CHANGE_FLAVOR：规格变更 CLONE：克隆任务
     * @return unavailableActions
     */
    public List<UnavailableActionsEnum> getUnavailableActions() {
        return unavailableActions;
    }

    public void setUnavailableActions(List<UnavailableActionsEnum> unavailableActions) {
        this.unavailableActions = unavailableActions;
    }

    public JobActionResp withCurrentAction(CurrentActionEnum currentAction) {
        this.currentAction = currentAction;
        return this;
    }

    /**
     * 示例： SWITCH_OVER：灾备倒换中 STOP_JOB：任务暂停中
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
        JobActionResp that = (JobActionResp) obj;
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
        sb.append("class JobActionResp {\n");
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

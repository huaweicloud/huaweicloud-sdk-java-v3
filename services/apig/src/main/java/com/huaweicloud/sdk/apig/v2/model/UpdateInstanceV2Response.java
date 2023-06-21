package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateInstanceV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    /**
     * 实例状态： - Creating：创建中 - CreateSuccess：创建成功 - CreateFail：创建失败 - Initing：初始化中 - Registering：注册中 - Running：运行中 - InitingFailed：初始化失败 - RegisterFailed：注册失败 - Installing：安装中 - InstallFailed：安装失败 - Updating：升级中 - UpdateFailed：升级失败 - Rollbacking：回滚中 - RollbackSuccess：回滚成功 - RollbackFailed：回滚失败 - Deleting：删除中 - DeleteFailed：删除失败 - Unregistering：注销中 - UnRegisterFailed：注销失败 - CreateTimeout：创建超时 - InitTimeout：初始化超时 - RegisterTimeout：注册超时 - InstallTimeout：安装超时 - UpdateTimeout：升级超时 - RollbackTimeout：回滚超时 - DeleteTimeout：删除超时 - UnregisterTimeout：注销超时 - Starting：启动中 - Freezing：冻结中 - Frozen：已冻结 - Restarting：重启中 - RestartFail：重启失败 - Unhealthy：实例异常 - RestartTimeout：重启超时
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum CREATESUCCESS for value: "CreateSuccess"
         */
        public static final StatusEnum CREATESUCCESS = new StatusEnum("CreateSuccess");

        /**
         * Enum CREATEFAIL for value: "CreateFail"
         */
        public static final StatusEnum CREATEFAIL = new StatusEnum("CreateFail");

        /**
         * Enum INITING for value: "Initing"
         */
        public static final StatusEnum INITING = new StatusEnum("Initing");

        /**
         * Enum REGISTERING for value: "Registering"
         */
        public static final StatusEnum REGISTERING = new StatusEnum("Registering");

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum INITINGFAILED for value: "InitingFailed"
         */
        public static final StatusEnum INITINGFAILED = new StatusEnum("InitingFailed");

        /**
         * Enum REGISTERFAILED for value: "RegisterFailed"
         */
        public static final StatusEnum REGISTERFAILED = new StatusEnum("RegisterFailed");

        /**
         * Enum INSTALLING for value: "Installing"
         */
        public static final StatusEnum INSTALLING = new StatusEnum("Installing");

        /**
         * Enum INSTALLFAILED for value: "InstallFailed"
         */
        public static final StatusEnum INSTALLFAILED = new StatusEnum("InstallFailed");

        /**
         * Enum UPDATING for value: "Updating"
         */
        public static final StatusEnum UPDATING = new StatusEnum("Updating");

        /**
         * Enum UPDATEFAILED for value: "UpdateFailed"
         */
        public static final StatusEnum UPDATEFAILED = new StatusEnum("UpdateFailed");

        /**
         * Enum ROLLBACKING for value: "Rollbacking"
         */
        public static final StatusEnum ROLLBACKING = new StatusEnum("Rollbacking");

        /**
         * Enum ROLLBACKSUCCESS for value: "RollbackSuccess"
         */
        public static final StatusEnum ROLLBACKSUCCESS = new StatusEnum("RollbackSuccess");

        /**
         * Enum ROLLBACKFAILED for value: "RollbackFailed"
         */
        public static final StatusEnum ROLLBACKFAILED = new StatusEnum("RollbackFailed");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum DELETEFAILED for value: "DeleteFailed"
         */
        public static final StatusEnum DELETEFAILED = new StatusEnum("DeleteFailed");

        /**
         * Enum UNREGISTERING for value: "Unregistering"
         */
        public static final StatusEnum UNREGISTERING = new StatusEnum("Unregistering");

        /**
         * Enum UNREGISTERFAILED for value: "UnRegisterFailed"
         */
        public static final StatusEnum UNREGISTERFAILED = new StatusEnum("UnRegisterFailed");

        /**
         * Enum CREATETIMEOUT for value: "CreateTimeout"
         */
        public static final StatusEnum CREATETIMEOUT = new StatusEnum("CreateTimeout");

        /**
         * Enum INITTIMEOUT for value: "InitTimeout"
         */
        public static final StatusEnum INITTIMEOUT = new StatusEnum("InitTimeout");

        /**
         * Enum REGISTERTIMEOUT for value: "RegisterTimeout"
         */
        public static final StatusEnum REGISTERTIMEOUT = new StatusEnum("RegisterTimeout");

        /**
         * Enum INSTALLTIMEOUT for value: "InstallTimeout"
         */
        public static final StatusEnum INSTALLTIMEOUT = new StatusEnum("InstallTimeout");

        /**
         * Enum UPDATETIMEOUT for value: "UpdateTimeout"
         */
        public static final StatusEnum UPDATETIMEOUT = new StatusEnum("UpdateTimeout");

        /**
         * Enum ROLLBACKTIMEOUT for value: "RollbackTimeout"
         */
        public static final StatusEnum ROLLBACKTIMEOUT = new StatusEnum("RollbackTimeout");

        /**
         * Enum DELETETIMEOUT for value: "DeleteTimeout"
         */
        public static final StatusEnum DELETETIMEOUT = new StatusEnum("DeleteTimeout");

        /**
         * Enum UNREGISTERTIMEOUT for value: "UnregisterTimeout"
         */
        public static final StatusEnum UNREGISTERTIMEOUT = new StatusEnum("UnregisterTimeout");

        /**
         * Enum STARTING for value: "Starting"
         */
        public static final StatusEnum STARTING = new StatusEnum("Starting");

        /**
         * Enum FREEZING for value: "Freezing"
         */
        public static final StatusEnum FREEZING = new StatusEnum("Freezing");

        /**
         * Enum FROZEN for value: "Frozen"
         */
        public static final StatusEnum FROZEN = new StatusEnum("Frozen");

        /**
         * Enum RESTARTING for value: "Restarting"
         */
        public static final StatusEnum RESTARTING = new StatusEnum("Restarting");

        /**
         * Enum RESTARTFAIL for value: "RestartFail"
         */
        public static final StatusEnum RESTARTFAIL = new StatusEnum("RestartFail");

        /**
         * Enum UNHEALTHY for value: "Unhealthy"
         */
        public static final StatusEnum UNHEALTHY = new StatusEnum("Unhealthy");

        /**
         * Enum RESTARTTIMEOUT for value: "RestartTimeout"
         */
        public static final StatusEnum RESTARTTIMEOUT = new StatusEnum("RestartTimeout");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Creating", CREATING);
            map.put("CreateSuccess", CREATESUCCESS);
            map.put("CreateFail", CREATEFAIL);
            map.put("Initing", INITING);
            map.put("Registering", REGISTERING);
            map.put("Running", RUNNING);
            map.put("InitingFailed", INITINGFAILED);
            map.put("RegisterFailed", REGISTERFAILED);
            map.put("Installing", INSTALLING);
            map.put("InstallFailed", INSTALLFAILED);
            map.put("Updating", UPDATING);
            map.put("UpdateFailed", UPDATEFAILED);
            map.put("Rollbacking", ROLLBACKING);
            map.put("RollbackSuccess", ROLLBACKSUCCESS);
            map.put("RollbackFailed", ROLLBACKFAILED);
            map.put("Deleting", DELETING);
            map.put("DeleteFailed", DELETEFAILED);
            map.put("Unregistering", UNREGISTERING);
            map.put("UnRegisterFailed", UNREGISTERFAILED);
            map.put("CreateTimeout", CREATETIMEOUT);
            map.put("InitTimeout", INITTIMEOUT);
            map.put("RegisterTimeout", REGISTERTIMEOUT);
            map.put("InstallTimeout", INSTALLTIMEOUT);
            map.put("UpdateTimeout", UPDATETIMEOUT);
            map.put("RollbackTimeout", ROLLBACKTIMEOUT);
            map.put("DeleteTimeout", DELETETIMEOUT);
            map.put("UnregisterTimeout", UNREGISTERTIMEOUT);
            map.put("Starting", STARTING);
            map.put("Freezing", FREEZING);
            map.put("Frozen", FROZEN);
            map.put("Restarting", RESTARTING);
            map.put("RestartFail", RESTARTFAIL);
            map.put("Unhealthy", UNHEALTHY);
            map.put("RestartTimeout", RESTARTTIMEOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 实例状态对应编号 - 1：创建中 - 2：创建成功 - 3：创建失败 - 4：初始化中 - 5：注册中 - 6：运行中 - 7：初始化失败 - 8：注册失败 - 10：安装中 - 11：安装失败 - 12：升级中 - 13：升级失败 - 20：回滚中 - 21：回滚成功 - 22：回滚失败 - 23：删除中 - 24：删除失败 - 25：注销中 - 26：注销失败 - 27：创建超时 - 28：初始化超时 - 29：注册超时 - 30：安装超时 - 31：升级超时 - 32：回滚超时 - 33：删除超时 - 34：注销超时 - 35：启动中 - 36：冻结中 - 37：已冻结 - 38：重启中 - 39：重启失败 - 40：实例异常 - 41：重启超时
     */
    public static final class InstanceStatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final InstanceStatusEnum NUMBER_1 = new InstanceStatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final InstanceStatusEnum NUMBER_2 = new InstanceStatusEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final InstanceStatusEnum NUMBER_3 = new InstanceStatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final InstanceStatusEnum NUMBER_4 = new InstanceStatusEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final InstanceStatusEnum NUMBER_5 = new InstanceStatusEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final InstanceStatusEnum NUMBER_6 = new InstanceStatusEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final InstanceStatusEnum NUMBER_7 = new InstanceStatusEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final InstanceStatusEnum NUMBER_8 = new InstanceStatusEnum(8);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final InstanceStatusEnum NUMBER_10 = new InstanceStatusEnum(10);

        /**
         * Enum NUMBER_11 for value: 11
         */
        public static final InstanceStatusEnum NUMBER_11 = new InstanceStatusEnum(11);

        /**
         * Enum NUMBER_12 for value: 12
         */
        public static final InstanceStatusEnum NUMBER_12 = new InstanceStatusEnum(12);

        /**
         * Enum NUMBER_13 for value: 13
         */
        public static final InstanceStatusEnum NUMBER_13 = new InstanceStatusEnum(13);

        /**
         * Enum NUMBER_20 for value: 20
         */
        public static final InstanceStatusEnum NUMBER_20 = new InstanceStatusEnum(20);

        /**
         * Enum NUMBER_21 for value: 21
         */
        public static final InstanceStatusEnum NUMBER_21 = new InstanceStatusEnum(21);

        /**
         * Enum NUMBER_22 for value: 22
         */
        public static final InstanceStatusEnum NUMBER_22 = new InstanceStatusEnum(22);

        /**
         * Enum NUMBER_23 for value: 23
         */
        public static final InstanceStatusEnum NUMBER_23 = new InstanceStatusEnum(23);

        /**
         * Enum NUMBER_24 for value: 24
         */
        public static final InstanceStatusEnum NUMBER_24 = new InstanceStatusEnum(24);

        /**
         * Enum NUMBER_25 for value: 25
         */
        public static final InstanceStatusEnum NUMBER_25 = new InstanceStatusEnum(25);

        /**
         * Enum NUMBER_26 for value: 26
         */
        public static final InstanceStatusEnum NUMBER_26 = new InstanceStatusEnum(26);

        /**
         * Enum NUMBER_27 for value: 27
         */
        public static final InstanceStatusEnum NUMBER_27 = new InstanceStatusEnum(27);

        /**
         * Enum NUMBER_28 for value: 28
         */
        public static final InstanceStatusEnum NUMBER_28 = new InstanceStatusEnum(28);

        /**
         * Enum NUMBER_29 for value: 29
         */
        public static final InstanceStatusEnum NUMBER_29 = new InstanceStatusEnum(29);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final InstanceStatusEnum NUMBER_30 = new InstanceStatusEnum(30);

        /**
         * Enum NUMBER_31 for value: 31
         */
        public static final InstanceStatusEnum NUMBER_31 = new InstanceStatusEnum(31);

        /**
         * Enum NUMBER_32 for value: 32
         */
        public static final InstanceStatusEnum NUMBER_32 = new InstanceStatusEnum(32);

        /**
         * Enum NUMBER_33 for value: 33
         */
        public static final InstanceStatusEnum NUMBER_33 = new InstanceStatusEnum(33);

        /**
         * Enum NUMBER_34 for value: 34
         */
        public static final InstanceStatusEnum NUMBER_34 = new InstanceStatusEnum(34);

        /**
         * Enum NUMBER_35 for value: 35
         */
        public static final InstanceStatusEnum NUMBER_35 = new InstanceStatusEnum(35);

        /**
         * Enum NUMBER_36 for value: 36
         */
        public static final InstanceStatusEnum NUMBER_36 = new InstanceStatusEnum(36);

        /**
         * Enum NUMBER_37 for value: 37
         */
        public static final InstanceStatusEnum NUMBER_37 = new InstanceStatusEnum(37);

        /**
         * Enum NUMBER_38 for value: 38
         */
        public static final InstanceStatusEnum NUMBER_38 = new InstanceStatusEnum(38);

        /**
         * Enum NUMBER_39 for value: 39
         */
        public static final InstanceStatusEnum NUMBER_39 = new InstanceStatusEnum(39);

        /**
         * Enum NUMBER_40 for value: 40
         */
        public static final InstanceStatusEnum NUMBER_40 = new InstanceStatusEnum(40);

        /**
         * Enum NUMBER_41 for value: 41
         */
        public static final InstanceStatusEnum NUMBER_41 = new InstanceStatusEnum(41);

        private static final Map<Integer, InstanceStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, InstanceStatusEnum> createStaticFields() {
            Map<Integer, InstanceStatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            map.put(10, NUMBER_10);
            map.put(11, NUMBER_11);
            map.put(12, NUMBER_12);
            map.put(13, NUMBER_13);
            map.put(20, NUMBER_20);
            map.put(21, NUMBER_21);
            map.put(22, NUMBER_22);
            map.put(23, NUMBER_23);
            map.put(24, NUMBER_24);
            map.put(25, NUMBER_25);
            map.put(26, NUMBER_26);
            map.put(27, NUMBER_27);
            map.put(28, NUMBER_28);
            map.put(29, NUMBER_29);
            map.put(30, NUMBER_30);
            map.put(31, NUMBER_31);
            map.put(32, NUMBER_32);
            map.put(33, NUMBER_33);
            map.put(34, NUMBER_34);
            map.put(35, NUMBER_35);
            map.put(36, NUMBER_36);
            map.put(37, NUMBER_37);
            map.put(38, NUMBER_38);
            map.put(39, NUMBER_39);
            map.put(40, NUMBER_40);
            map.put(41, NUMBER_41);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        InstanceStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstanceStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            InstanceStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceStatusEnum(value);
            }
            return result;
        }

        public static InstanceStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            InstanceStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceStatusEnum) {
                return this.value.equals(((InstanceStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private InstanceStatusEnum instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /**
     * 实例规格： - BASIC：基础版实例 - PROFESSIONAL：专业版实例 - ENTERPRISE：企业版实例 - PLATINUM：铂金版实例 - BASIC_IPV6：基础版IPV6实例 - PROFESSIONAL_IPV6：专业版IPV6实例 - ENTERPRISE_IPV6：企业版IPV6实例 - PLATINUM_IPV6：铂金版IPV6实例
     */
    public static final class SpecEnum {

        /**
         * Enum BASIC for value: "BASIC"
         */
        public static final SpecEnum BASIC = new SpecEnum("BASIC");

        /**
         * Enum PROFESSIONAL for value: "PROFESSIONAL"
         */
        public static final SpecEnum PROFESSIONAL = new SpecEnum("PROFESSIONAL");

        /**
         * Enum ENTERPRISE for value: "ENTERPRISE"
         */
        public static final SpecEnum ENTERPRISE = new SpecEnum("ENTERPRISE");

        /**
         * Enum PLATINUM for value: "PLATINUM"
         */
        public static final SpecEnum PLATINUM = new SpecEnum("PLATINUM");

        /**
         * Enum BASIC_IPV6 for value: "BASIC_IPV6"
         */
        public static final SpecEnum BASIC_IPV6 = new SpecEnum("BASIC_IPV6");

        /**
         * Enum PROFESSIONAL_IPV6 for value: "PROFESSIONAL_IPV6"
         */
        public static final SpecEnum PROFESSIONAL_IPV6 = new SpecEnum("PROFESSIONAL_IPV6");

        /**
         * Enum ENTERPRISE_IPV6 for value: "ENTERPRISE_IPV6"
         */
        public static final SpecEnum ENTERPRISE_IPV6 = new SpecEnum("ENTERPRISE_IPV6");

        /**
         * Enum PLATINUM_IPV6 for value: "PLATINUM_IPV6"
         */
        public static final SpecEnum PLATINUM_IPV6 = new SpecEnum("PLATINUM_IPV6");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("BASIC", BASIC);
            map.put("PROFESSIONAL", PROFESSIONAL);
            map.put("ENTERPRISE", ENTERPRISE);
            map.put("PLATINUM", PLATINUM);
            map.put("BASIC_IPV6", BASIC_IPV6);
            map.put("PROFESSIONAL_IPV6", PROFESSIONAL_IPV6);
            map.put("ENTERPRISE_IPV6", ENTERPRISE_IPV6);
            map.put("PLATINUM_IPV6", PLATINUM_IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecEnum(String value) {
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
        public static SpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SpecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecEnum(value);
            }
            return result;
        }

        public static SpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SpecEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecEnum) {
                return this.value.equals(((SpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecEnum spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    private String eipAddress;

    /**
     * 实例计费方式： - 0：按需计费 - 1：[包周期计费](tag:hws)[暂未使用](tag:hws_hk,cmcc,ctc,DT,g42,hk_g42,hk_sbc,hk_tm,hws_eu,hws_ocb,OCB,sbc,tm)
     */
    public static final class ChargingModeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ChargingModeEnum NUMBER_0 = new ChargingModeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ChargingModeEnum NUMBER_1 = new ChargingModeEnum(1);

        private static final Map<Integer, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ChargingModeEnum> createStaticFields() {
            Map<Integer, ChargingModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ChargingModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbc_metadata")

    private String cbcMetadata;

    /**
     * 实例使用的负载均衡器类型 - lvs Linux虚拟服务器 - elb 弹性负载均衡，elb仅部分region支持
     */
    public static final class LoadbalancerProviderEnum {

        /**
         * Enum LVS for value: "lvs"
         */
        public static final LoadbalancerProviderEnum LVS = new LoadbalancerProviderEnum("lvs");

        /**
         * Enum ELB for value: "elb"
         */
        public static final LoadbalancerProviderEnum ELB = new LoadbalancerProviderEnum("elb");

        private static final Map<String, LoadbalancerProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LoadbalancerProviderEnum> createStaticFields() {
            Map<String, LoadbalancerProviderEnum> map = new HashMap<>();
            map.put("lvs", LVS);
            map.put("elb", ELB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LoadbalancerProviderEnum(String value) {
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
        public static LoadbalancerProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LoadbalancerProviderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LoadbalancerProviderEnum(value);
            }
            return result;
        }

        public static LoadbalancerProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LoadbalancerProviderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LoadbalancerProviderEnum) {
                return this.value.equals(((LoadbalancerProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_provider")

    private LoadbalancerProviderEnum loadbalancerProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_ip")

    private String ingressIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_ip_v6")

    private String ingressIpV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_eip_ipv6_cidr")

    private String natEipIpv6Cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_ipv6_address")

    private String eipIpv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_eip_address")

    private String natEipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_charging_mode")

    private String bandwidthChargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_ids")

    private String availableZoneIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_version")

    private String instanceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_eip_address")

    private String romaEipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private Object listeners;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_features")

    private List<String> supportedFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service")

    private EndpointService endpointService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_services")

    private List<EndpointService> endpointServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ips")

    private NodeIps nodeIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<IpDetails> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateips")

    private List<IpDetails> privateips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_releasable")

    private Boolean isReleasable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_bandwidth_charging_mode")

    private String ingressBandwidthChargingMode;

    public UpdateInstanceV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInstanceV2Response withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例所属租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateInstanceV2Response withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public UpdateInstanceV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态： - Creating：创建中 - CreateSuccess：创建成功 - CreateFail：创建失败 - Initing：初始化中 - Registering：注册中 - Running：运行中 - InitingFailed：初始化失败 - RegisterFailed：注册失败 - Installing：安装中 - InstallFailed：安装失败 - Updating：升级中 - UpdateFailed：升级失败 - Rollbacking：回滚中 - RollbackSuccess：回滚成功 - RollbackFailed：回滚失败 - Deleting：删除中 - DeleteFailed：删除失败 - Unregistering：注销中 - UnRegisterFailed：注销失败 - CreateTimeout：创建超时 - InitTimeout：初始化超时 - RegisterTimeout：注册超时 - InstallTimeout：安装超时 - UpdateTimeout：升级超时 - RollbackTimeout：回滚超时 - DeleteTimeout：删除超时 - UnregisterTimeout：注销超时 - Starting：启动中 - Freezing：冻结中 - Frozen：已冻结 - Restarting：重启中 - RestartFail：重启失败 - Unhealthy：实例异常 - RestartTimeout：重启超时
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateInstanceV2Response withInstanceStatus(InstanceStatusEnum instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 实例状态对应编号 - 1：创建中 - 2：创建成功 - 3：创建失败 - 4：初始化中 - 5：注册中 - 6：运行中 - 7：初始化失败 - 8：注册失败 - 10：安装中 - 11：安装失败 - 12：升级中 - 13：升级失败 - 20：回滚中 - 21：回滚成功 - 22：回滚失败 - 23：删除中 - 24：删除失败 - 25：注销中 - 26：注销失败 - 27：创建超时 - 28：初始化超时 - 29：注册超时 - 30：安装超时 - 31：升级超时 - 32：回滚超时 - 33：删除超时 - 34：注销超时 - 35：启动中 - 36：冻结中 - 37：已冻结 - 38：重启中 - 39：重启失败 - 40：实例异常 - 41：重启超时
     * @return instanceStatus
     */
    public InstanceStatusEnum getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(InstanceStatusEnum instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public UpdateInstanceV2Response withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型  默认apig
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateInstanceV2Response withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 实例规格： - BASIC：基础版实例 - PROFESSIONAL：专业版实例 - ENTERPRISE：企业版实例 - PLATINUM：铂金版实例 - BASIC_IPV6：基础版IPV6实例 - PROFESSIONAL_IPV6：专业版IPV6实例 - ENTERPRISE_IPV6：企业版IPV6实例 - PLATINUM_IPV6：铂金版IPV6实例
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public UpdateInstanceV2Response withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 实例创建时间。unix时间戳格式。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateInstanceV2Response withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，企业帐号必填
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateInstanceV2Response withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public UpdateInstanceV2Response withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 实例计费方式： - 0：按需计费 - 1：[包周期计费](tag:hws)[暂未使用](tag:hws_hk,cmcc,ctc,DT,g42,hk_g42,hk_sbc,hk_tm,hws_eu,hws_ocb,OCB,sbc,tm)
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public UpdateInstanceV2Response withCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
        return this;
    }

    /**
     * [包周期计费订单编号](tag:hws)[计费订单编号参数暂未使用](tag:hws_hk,cmcc,ctc,DT,g42,hk_g42,hk_sbc,hk_tm,hws_eu,hws_ocb,OCB,sbc,tm)
     * @return cbcMetadata
     */
    public String getCbcMetadata() {
        return cbcMetadata;
    }

    public void setCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
    }

    public UpdateInstanceV2Response withLoadbalancerProvider(LoadbalancerProviderEnum loadbalancerProvider) {
        this.loadbalancerProvider = loadbalancerProvider;
        return this;
    }

    /**
     * 实例使用的负载均衡器类型 - lvs Linux虚拟服务器 - elb 弹性负载均衡，elb仅部分region支持
     * @return loadbalancerProvider
     */
    public LoadbalancerProviderEnum getLoadbalancerProvider() {
        return loadbalancerProvider;
    }

    public void setLoadbalancerProvider(LoadbalancerProviderEnum loadbalancerProvider) {
        this.loadbalancerProvider = loadbalancerProvider;
    }

    public UpdateInstanceV2Response withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceV2Response withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询VPC列表”章节。 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdateInstanceV2Response withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询子网列表”章节。 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UpdateInstanceV2Response withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定实例所属的安全组。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询安全组列表”章节。 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public UpdateInstanceV2Response withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * '维护时间窗开始时间。时间格式为 xx:00:00，xx取值为02,06,10,14,18,22。'  '在这个时间段内，运维人员可以对该实例的节点进行维护操作。维护期间，业务可以正常使用，可能会发生闪断。维护操作通常几个月一次。'
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public UpdateInstanceV2Response withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * '维护时间窗结束时间。时间格式为 xx:00:00，与维护时间窗开始时间相差4个小时。'  '在这个时间段内，运维人员可以对该实例的节点进行维护操作。维护期间，业务可以正常使用，可能会发生闪断。维护操作通常几个月一次'。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public UpdateInstanceV2Response withIngressIp(String ingressIp) {
        this.ingressIp = ingressIp;
        return this;
    }

    /**
     * 实例入口，虚拟私有云访问地址
     * @return ingressIp
     */
    public String getIngressIp() {
        return ingressIp;
    }

    public void setIngressIp(String ingressIp) {
        this.ingressIp = ingressIp;
    }

    public UpdateInstanceV2Response withIngressIpV6(String ingressIpV6) {
        this.ingressIpV6 = ingressIpV6;
        return this;
    }

    /**
     * 实例入口，虚拟私有云访问地址 (IPv6)
     * @return ingressIpV6
     */
    public String getIngressIpV6() {
        return ingressIpV6;
    }

    public void setIngressIpV6(String ingressIpV6) {
        this.ingressIpV6 = ingressIpV6;
    }

    public UpdateInstanceV2Response withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 实例所属用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateInstanceV2Response withNatEipIpv6Cidr(String natEipIpv6Cidr) {
        this.natEipIpv6Cidr = natEipIpv6Cidr;
        return this;
    }

    /**
     * 出公网网段 (IPv6)  。  当前仅部分region部分可用区支持IPv6
     * @return natEipIpv6Cidr
     */
    public String getNatEipIpv6Cidr() {
        return natEipIpv6Cidr;
    }

    public void setNatEipIpv6Cidr(String natEipIpv6Cidr) {
        this.natEipIpv6Cidr = natEipIpv6Cidr;
    }

    public UpdateInstanceV2Response withEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
        return this;
    }

    /**
     * 弹性IP地址(IPv6)。  当前仅部分region部分可用区支持IPv6
     * @return eipIpv6Address
     */
    public String getEipIpv6Address() {
        return eipIpv6Address;
    }

    public void setEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
    }

    public UpdateInstanceV2Response withNatEipAddress(String natEipAddress) {
        this.natEipAddress = natEipAddress;
        return this;
    }

    /**
     * 实例出公网IP
     * @return natEipAddress
     */
    public String getNatEipAddress() {
        return natEipAddress;
    }

    public void setNatEipAddress(String natEipAddress) {
        this.natEipAddress = natEipAddress;
    }

    public UpdateInstanceV2Response withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 出公网带宽
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public UpdateInstanceV2Response withBandwidthChargingMode(String bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
        return this;
    }

    /**
     * 出公网带宽计费模式
     * @return bandwidthChargingMode
     */
    public String getBandwidthChargingMode() {
        return bandwidthChargingMode;
    }

    public void setBandwidthChargingMode(String bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
    }

    public UpdateInstanceV2Response withAvailableZoneIds(String availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
        return this;
    }

    /**
     * 可用区
     * @return availableZoneIds
     */
    public String getAvailableZoneIds() {
        return availableZoneIds;
    }

    public void setAvailableZoneIds(String availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
    }

    public UpdateInstanceV2Response withInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * 实例版本编号
     * @return instanceVersion
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    public UpdateInstanceV2Response withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 子网的网络ID。  暂不支持
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public UpdateInstanceV2Response withRomaEipAddress(String romaEipAddress) {
        this.romaEipAddress = romaEipAddress;
        return this;
    }

    /**
     * roma弹性公网IP。  暂不支持
     * @return romaEipAddress
     */
    public String getRomaEipAddress() {
        return romaEipAddress;
    }

    public void setRomaEipAddress(String romaEipAddress) {
        this.romaEipAddress = romaEipAddress;
    }

    public UpdateInstanceV2Response withListeners(Object listeners) {
        this.listeners = listeners;
        return this;
    }

    /**
     * 监听信息  暂不支持
     * @return listeners
     */
    public Object getListeners() {
        return listeners;
    }

    public void setListeners(Object listeners) {
        this.listeners = listeners;
    }

    public UpdateInstanceV2Response withSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public UpdateInstanceV2Response addSupportedFeaturesItem(String supportedFeaturesItem) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        this.supportedFeatures.add(supportedFeaturesItem);
        return this;
    }

    public UpdateInstanceV2Response withSupportedFeatures(Consumer<List<String>> supportedFeaturesSetter) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        supportedFeaturesSetter.accept(this.supportedFeatures);
        return this;
    }

    /**
     * 实例支持的特性列表
     * @return supportedFeatures
     */
    public List<String> getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public UpdateInstanceV2Response withEndpointService(EndpointService endpointService) {
        this.endpointService = endpointService;
        return this;
    }

    public UpdateInstanceV2Response withEndpointService(Consumer<EndpointService> endpointServiceSetter) {
        if (this.endpointService == null) {
            this.endpointService = new EndpointService();
            endpointServiceSetter.accept(this.endpointService);
        }

        return this;
    }

    /**
     * Get endpointService
     * @return endpointService
     */
    public EndpointService getEndpointService() {
        return endpointService;
    }

    public void setEndpointService(EndpointService endpointService) {
        this.endpointService = endpointService;
    }

    public UpdateInstanceV2Response withEndpointServices(List<EndpointService> endpointServices) {
        this.endpointServices = endpointServices;
        return this;
    }

    public UpdateInstanceV2Response addEndpointServicesItem(EndpointService endpointServicesItem) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        this.endpointServices.add(endpointServicesItem);
        return this;
    }

    public UpdateInstanceV2Response withEndpointServices(Consumer<List<EndpointService>> endpointServicesSetter) {
        if (this.endpointServices == null) {
            this.endpointServices = new ArrayList<>();
        }
        endpointServicesSetter.accept(this.endpointServices);
        return this;
    }

    /**
     * 终端节点服务列表
     * @return endpointServices
     */
    public List<EndpointService> getEndpointServices() {
        return endpointServices;
    }

    public void setEndpointServices(List<EndpointService> endpointServices) {
        this.endpointServices = endpointServices;
    }

    public UpdateInstanceV2Response withNodeIps(NodeIps nodeIps) {
        this.nodeIps = nodeIps;
        return this;
    }

    public UpdateInstanceV2Response withNodeIps(Consumer<NodeIps> nodeIpsSetter) {
        if (this.nodeIps == null) {
            this.nodeIps = new NodeIps();
            nodeIpsSetter.accept(this.nodeIps);
        }

        return this;
    }

    /**
     * Get nodeIps
     * @return nodeIps
     */
    public NodeIps getNodeIps() {
        return nodeIps;
    }

    public void setNodeIps(NodeIps nodeIps) {
        this.nodeIps = nodeIps;
    }

    public UpdateInstanceV2Response withPublicips(List<IpDetails> publicips) {
        this.publicips = publicips;
        return this;
    }

    public UpdateInstanceV2Response addPublicipsItem(IpDetails publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public UpdateInstanceV2Response withPublicips(Consumer<List<IpDetails>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 公网入口地址列表
     * @return publicips
     */
    public List<IpDetails> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<IpDetails> publicips) {
        this.publicips = publicips;
    }

    public UpdateInstanceV2Response withPrivateips(List<IpDetails> privateips) {
        this.privateips = privateips;
        return this;
    }

    public UpdateInstanceV2Response addPrivateipsItem(IpDetails privateipsItem) {
        if (this.privateips == null) {
            this.privateips = new ArrayList<>();
        }
        this.privateips.add(privateipsItem);
        return this;
    }

    public UpdateInstanceV2Response withPrivateips(Consumer<List<IpDetails>> privateipsSetter) {
        if (this.privateips == null) {
            this.privateips = new ArrayList<>();
        }
        privateipsSetter.accept(this.privateips);
        return this;
    }

    /**
     * 私网入口地址列表
     * @return privateips
     */
    public List<IpDetails> getPrivateips() {
        return privateips;
    }

    public void setPrivateips(List<IpDetails> privateips) {
        this.privateips = privateips;
    }

    public UpdateInstanceV2Response withIsReleasable(Boolean isReleasable) {
        this.isReleasable = isReleasable;
        return this;
    }

    /**
     * 实例是否可释放 - true：可释放 - false：不可释放
     * @return isReleasable
     */
    public Boolean getIsReleasable() {
        return isReleasable;
    }

    public void setIsReleasable(Boolean isReleasable) {
        this.isReleasable = isReleasable;
    }

    public UpdateInstanceV2Response withIngressBandwidthChargingMode(String ingressBandwidthChargingMode) {
        this.ingressBandwidthChargingMode = ingressBandwidthChargingMode;
        return this;
    }

    /**
     * 入公网带宽计费模式
     * @return ingressBandwidthChargingMode
     */
    public String getIngressBandwidthChargingMode() {
        return ingressBandwidthChargingMode;
    }

    public void setIngressBandwidthChargingMode(String ingressBandwidthChargingMode) {
        this.ingressBandwidthChargingMode = ingressBandwidthChargingMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceV2Response updateInstanceV2Response = (UpdateInstanceV2Response) o;
        return Objects.equals(this.id, updateInstanceV2Response.id)
            && Objects.equals(this.projectId, updateInstanceV2Response.projectId)
            && Objects.equals(this.instanceName, updateInstanceV2Response.instanceName)
            && Objects.equals(this.status, updateInstanceV2Response.status)
            && Objects.equals(this.instanceStatus, updateInstanceV2Response.instanceStatus)
            && Objects.equals(this.type, updateInstanceV2Response.type)
            && Objects.equals(this.spec, updateInstanceV2Response.spec)
            && Objects.equals(this.createTime, updateInstanceV2Response.createTime)
            && Objects.equals(this.enterpriseProjectId, updateInstanceV2Response.enterpriseProjectId)
            && Objects.equals(this.eipAddress, updateInstanceV2Response.eipAddress)
            && Objects.equals(this.chargingMode, updateInstanceV2Response.chargingMode)
            && Objects.equals(this.cbcMetadata, updateInstanceV2Response.cbcMetadata)
            && Objects.equals(this.loadbalancerProvider, updateInstanceV2Response.loadbalancerProvider)
            && Objects.equals(this.description, updateInstanceV2Response.description)
            && Objects.equals(this.vpcId, updateInstanceV2Response.vpcId)
            && Objects.equals(this.subnetId, updateInstanceV2Response.subnetId)
            && Objects.equals(this.securityGroupId, updateInstanceV2Response.securityGroupId)
            && Objects.equals(this.maintainBegin, updateInstanceV2Response.maintainBegin)
            && Objects.equals(this.maintainEnd, updateInstanceV2Response.maintainEnd)
            && Objects.equals(this.ingressIp, updateInstanceV2Response.ingressIp)
            && Objects.equals(this.ingressIpV6, updateInstanceV2Response.ingressIpV6)
            && Objects.equals(this.userId, updateInstanceV2Response.userId)
            && Objects.equals(this.natEipIpv6Cidr, updateInstanceV2Response.natEipIpv6Cidr)
            && Objects.equals(this.eipIpv6Address, updateInstanceV2Response.eipIpv6Address)
            && Objects.equals(this.natEipAddress, updateInstanceV2Response.natEipAddress)
            && Objects.equals(this.bandwidthSize, updateInstanceV2Response.bandwidthSize)
            && Objects.equals(this.bandwidthChargingMode, updateInstanceV2Response.bandwidthChargingMode)
            && Objects.equals(this.availableZoneIds, updateInstanceV2Response.availableZoneIds)
            && Objects.equals(this.instanceVersion, updateInstanceV2Response.instanceVersion)
            && Objects.equals(this.virsubnetId, updateInstanceV2Response.virsubnetId)
            && Objects.equals(this.romaEipAddress, updateInstanceV2Response.romaEipAddress)
            && Objects.equals(this.listeners, updateInstanceV2Response.listeners)
            && Objects.equals(this.supportedFeatures, updateInstanceV2Response.supportedFeatures)
            && Objects.equals(this.endpointService, updateInstanceV2Response.endpointService)
            && Objects.equals(this.endpointServices, updateInstanceV2Response.endpointServices)
            && Objects.equals(this.nodeIps, updateInstanceV2Response.nodeIps)
            && Objects.equals(this.publicips, updateInstanceV2Response.publicips)
            && Objects.equals(this.privateips, updateInstanceV2Response.privateips)
            && Objects.equals(this.isReleasable, updateInstanceV2Response.isReleasable)
            && Objects.equals(this.ingressBandwidthChargingMode, updateInstanceV2Response.ingressBandwidthChargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            instanceName,
            status,
            instanceStatus,
            type,
            spec,
            createTime,
            enterpriseProjectId,
            eipAddress,
            chargingMode,
            cbcMetadata,
            loadbalancerProvider,
            description,
            vpcId,
            subnetId,
            securityGroupId,
            maintainBegin,
            maintainEnd,
            ingressIp,
            ingressIpV6,
            userId,
            natEipIpv6Cidr,
            eipIpv6Address,
            natEipAddress,
            bandwidthSize,
            bandwidthChargingMode,
            availableZoneIds,
            instanceVersion,
            virsubnetId,
            romaEipAddress,
            listeners,
            supportedFeatures,
            endpointService,
            endpointServices,
            nodeIps,
            publicips,
            privateips,
            isReleasable,
            ingressBandwidthChargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceV2Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cbcMetadata: ").append(toIndentedString(cbcMetadata)).append("\n");
        sb.append("    loadbalancerProvider: ").append(toIndentedString(loadbalancerProvider)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    ingressIp: ").append(toIndentedString(ingressIp)).append("\n");
        sb.append("    ingressIpV6: ").append(toIndentedString(ingressIpV6)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    natEipIpv6Cidr: ").append(toIndentedString(natEipIpv6Cidr)).append("\n");
        sb.append("    eipIpv6Address: ").append(toIndentedString(eipIpv6Address)).append("\n");
        sb.append("    natEipAddress: ").append(toIndentedString(natEipAddress)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthChargingMode: ").append(toIndentedString(bandwidthChargingMode)).append("\n");
        sb.append("    availableZoneIds: ").append(toIndentedString(availableZoneIds)).append("\n");
        sb.append("    instanceVersion: ").append(toIndentedString(instanceVersion)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    romaEipAddress: ").append(toIndentedString(romaEipAddress)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
        sb.append("    endpointService: ").append(toIndentedString(endpointService)).append("\n");
        sb.append("    endpointServices: ").append(toIndentedString(endpointServices)).append("\n");
        sb.append("    nodeIps: ").append(toIndentedString(nodeIps)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    privateips: ").append(toIndentedString(privateips)).append("\n");
        sb.append("    isReleasable: ").append(toIndentedString(isReleasable)).append("\n");
        sb.append("    ingressBandwidthChargingMode: ")
            .append(toIndentedString(ingressBandwidthChargingMode))
            .append("\n");
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

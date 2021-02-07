package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.RespInstanceBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDetailsOfInstanceV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="status")
    
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
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstanceStatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            InstanceStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceStatusEnum(value);
            }
            return result;
        }

        public static InstanceStatusEnum valueOf(Integer value) {
            if( value == null ){
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
            if (obj != null && obj instanceof InstanceStatusEnum) {
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
    @JsonProperty(value="instance_status")
    
    private InstanceStatusEnum instanceStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SpecEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SpecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecEnum(value);
            }
            return result;
        }

        public static SpecEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof SpecEnum) {
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
    @JsonProperty(value="spec")
    
    private SpecEnum spec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_address")
    
    private String eipAddress;
    /**
     * 实例计费方式： - 0：按需计费 - 1：包周期计费
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
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(Integer value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ChargingModeEnum) {
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
    @JsonProperty(value="charging_mode")
    
    private ChargingModeEnum chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cbc_metadata")
    
    private String cbcMetadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_begin")
    
    private String maintainBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_end")
    
    private String maintainEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ingress_ip")
    
    private String ingressIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_eip_ipv6_cidr")
    
    private String natEipIpv6Cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip_ipv6_address")
    
    private String eipIpv6Address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_eip_address")
    
    private String natEipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_size")
    
    private Integer bandwidthSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zone_ids")
    
    private String availableZoneIds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_version")
    
    private String instanceVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virsubnet_id")
    
    private String virsubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_eip_address")
    
    private String romaEipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private Object listeners = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="supported_features")
    
    private List<String> supportedFeatures = null;
    
    public ShowDetailsOfInstanceV2Response withId(String id) {
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

    public ShowDetailsOfInstanceV2Response withProjectId(String projectId) {
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

    public ShowDetailsOfInstanceV2Response withInstanceName(String instanceName) {
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

    public ShowDetailsOfInstanceV2Response withStatus(StatusEnum status) {
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

    public ShowDetailsOfInstanceV2Response withInstanceStatus(InstanceStatusEnum instanceStatus) {
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

    public ShowDetailsOfInstanceV2Response withType(String type) {
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

    public ShowDetailsOfInstanceV2Response withSpec(SpecEnum spec) {
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

    public ShowDetailsOfInstanceV2Response withCreateTime(Long createTime) {
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

    public ShowDetailsOfInstanceV2Response withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID，企业账号必填
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowDetailsOfInstanceV2Response withEipAddress(String eipAddress) {
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

    public ShowDetailsOfInstanceV2Response withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 实例计费方式： - 0：按需计费 - 1：包周期计费
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ShowDetailsOfInstanceV2Response withCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
        return this;
    }

    


    /**
     * 包周期计费订单编号
     * @return cbcMetadata
     */
    public String getCbcMetadata() {
        return cbcMetadata;
    }

    public void setCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
    }

    public ShowDetailsOfInstanceV2Response withDescription(String description) {
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

    public ShowDetailsOfInstanceV2Response withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowDetailsOfInstanceV2Response withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网的网络ID。 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowDetailsOfInstanceV2Response withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 实例所属的安全组。 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowDetailsOfInstanceV2Response withMaintainBegin(String maintainBegin) {
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

    public ShowDetailsOfInstanceV2Response withMaintainEnd(String maintainEnd) {
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

    public ShowDetailsOfInstanceV2Response withIngressIp(String ingressIp) {
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

    public ShowDetailsOfInstanceV2Response withUserId(String userId) {
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

    public ShowDetailsOfInstanceV2Response withNatEipIpv6Cidr(String natEipIpv6Cidr) {
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

    public ShowDetailsOfInstanceV2Response withEipIpv6Address(String eipIpv6Address) {
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

    public ShowDetailsOfInstanceV2Response withNatEipAddress(String natEipAddress) {
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

    public ShowDetailsOfInstanceV2Response withBandwidthSize(Integer bandwidthSize) {
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

    public ShowDetailsOfInstanceV2Response withAvailableZoneIds(String availableZoneIds) {
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

    public ShowDetailsOfInstanceV2Response withInstanceVersion(String instanceVersion) {
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

    public ShowDetailsOfInstanceV2Response withVirsubnetId(String virsubnetId) {
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

    public ShowDetailsOfInstanceV2Response withRomaEipAddress(String romaEipAddress) {
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

    public ShowDetailsOfInstanceV2Response withListeners(Object listeners) {
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

    public ShowDetailsOfInstanceV2Response withSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    
    public ShowDetailsOfInstanceV2Response addSupportedFeaturesItem(String supportedFeaturesItem) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        this.supportedFeatures.add(supportedFeaturesItem);
        return this;
    }

    public ShowDetailsOfInstanceV2Response withSupportedFeatures(Consumer<List<String>> supportedFeaturesSetter) {
        if(this.supportedFeatures == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfInstanceV2Response showDetailsOfInstanceV2Response = (ShowDetailsOfInstanceV2Response) o;
        return Objects.equals(this.id, showDetailsOfInstanceV2Response.id) &&
            Objects.equals(this.projectId, showDetailsOfInstanceV2Response.projectId) &&
            Objects.equals(this.instanceName, showDetailsOfInstanceV2Response.instanceName) &&
            Objects.equals(this.status, showDetailsOfInstanceV2Response.status) &&
            Objects.equals(this.instanceStatus, showDetailsOfInstanceV2Response.instanceStatus) &&
            Objects.equals(this.type, showDetailsOfInstanceV2Response.type) &&
            Objects.equals(this.spec, showDetailsOfInstanceV2Response.spec) &&
            Objects.equals(this.createTime, showDetailsOfInstanceV2Response.createTime) &&
            Objects.equals(this.enterpriseProjectId, showDetailsOfInstanceV2Response.enterpriseProjectId) &&
            Objects.equals(this.eipAddress, showDetailsOfInstanceV2Response.eipAddress) &&
            Objects.equals(this.chargingMode, showDetailsOfInstanceV2Response.chargingMode) &&
            Objects.equals(this.cbcMetadata, showDetailsOfInstanceV2Response.cbcMetadata) &&
            Objects.equals(this.description, showDetailsOfInstanceV2Response.description) &&
            Objects.equals(this.vpcId, showDetailsOfInstanceV2Response.vpcId) &&
            Objects.equals(this.subnetId, showDetailsOfInstanceV2Response.subnetId) &&
            Objects.equals(this.securityGroupId, showDetailsOfInstanceV2Response.securityGroupId) &&
            Objects.equals(this.maintainBegin, showDetailsOfInstanceV2Response.maintainBegin) &&
            Objects.equals(this.maintainEnd, showDetailsOfInstanceV2Response.maintainEnd) &&
            Objects.equals(this.ingressIp, showDetailsOfInstanceV2Response.ingressIp) &&
            Objects.equals(this.userId, showDetailsOfInstanceV2Response.userId) &&
            Objects.equals(this.natEipIpv6Cidr, showDetailsOfInstanceV2Response.natEipIpv6Cidr) &&
            Objects.equals(this.eipIpv6Address, showDetailsOfInstanceV2Response.eipIpv6Address) &&
            Objects.equals(this.natEipAddress, showDetailsOfInstanceV2Response.natEipAddress) &&
            Objects.equals(this.bandwidthSize, showDetailsOfInstanceV2Response.bandwidthSize) &&
            Objects.equals(this.availableZoneIds, showDetailsOfInstanceV2Response.availableZoneIds) &&
            Objects.equals(this.instanceVersion, showDetailsOfInstanceV2Response.instanceVersion) &&
            Objects.equals(this.virsubnetId, showDetailsOfInstanceV2Response.virsubnetId) &&
            Objects.equals(this.romaEipAddress, showDetailsOfInstanceV2Response.romaEipAddress) &&
            Objects.equals(this.listeners, showDetailsOfInstanceV2Response.listeners) &&
            Objects.equals(this.supportedFeatures, showDetailsOfInstanceV2Response.supportedFeatures);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, instanceName, status, instanceStatus, type, spec, createTime, enterpriseProjectId, eipAddress, chargingMode, cbcMetadata, description, vpcId, subnetId, securityGroupId, maintainBegin, maintainEnd, ingressIp, userId, natEipIpv6Cidr, eipIpv6Address, natEipAddress, bandwidthSize, availableZoneIds, instanceVersion, virsubnetId, romaEipAddress, listeners, supportedFeatures);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfInstanceV2Response {\n");
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
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    ingressIp: ").append(toIndentedString(ingressIp)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    natEipIpv6Cidr: ").append(toIndentedString(natEipIpv6Cidr)).append("\n");
        sb.append("    eipIpv6Address: ").append(toIndentedString(eipIpv6Address)).append("\n");
        sb.append("    natEipAddress: ").append(toIndentedString(natEipAddress)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    availableZoneIds: ").append(toIndentedString(availableZoneIds)).append("\n");
        sb.append("    instanceVersion: ").append(toIndentedString(instanceVersion)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    romaEipAddress: ").append(toIndentedString(romaEipAddress)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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


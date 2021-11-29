package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** RespInstanceBase */
public class RespInstanceBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    /** 实例状态： - Creating：创建中 - CreateSuccess：创建成功 - CreateFail：创建失败 - Initing：初始化中 - Registering：注册中 - Running：运行中 -
     * InitingFailed：初始化失败 - RegisterFailed：注册失败 - Installing：安装中 - InstallFailed：安装失败 - Updating：升级中 -
     * UpdateFailed：升级失败 - Rollbacking：回滚中 - RollbackSuccess：回滚成功 - RollbackFailed：回滚失败 - Deleting：删除中 -
     * DeleteFailed：删除失败 - Unregistering：注销中 - UnRegisterFailed：注销失败 - CreateTimeout：创建超时 - InitTimeout：初始化超时 -
     * RegisterTimeout：注册超时 - InstallTimeout：安装超时 - UpdateTimeout：升级超时 - RollbackTimeout：回滚超时 - DeleteTimeout：删除超时 -
     * UnregisterTimeout：注销超时 - Starting：启动中 - Freezing：冻结中 - Frozen：已冻结 - Restarting：重启中 - RestartFail：重启失败 -
     * Unhealthy：实例异常 - RestartTimeout：重启超时 */
    public static final class StatusEnum {

        /** Enum CREATING for value: "Creating" */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /** Enum CREATESUCCESS for value: "CreateSuccess" */
        public static final StatusEnum CREATESUCCESS = new StatusEnum("CreateSuccess");

        /** Enum CREATEFAIL for value: "CreateFail" */
        public static final StatusEnum CREATEFAIL = new StatusEnum("CreateFail");

        /** Enum INITING for value: "Initing" */
        public static final StatusEnum INITING = new StatusEnum("Initing");

        /** Enum REGISTERING for value: "Registering" */
        public static final StatusEnum REGISTERING = new StatusEnum("Registering");

        /** Enum RUNNING for value: "Running" */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /** Enum INITINGFAILED for value: "InitingFailed" */
        public static final StatusEnum INITINGFAILED = new StatusEnum("InitingFailed");

        /** Enum REGISTERFAILED for value: "RegisterFailed" */
        public static final StatusEnum REGISTERFAILED = new StatusEnum("RegisterFailed");

        /** Enum INSTALLING for value: "Installing" */
        public static final StatusEnum INSTALLING = new StatusEnum("Installing");

        /** Enum INSTALLFAILED for value: "InstallFailed" */
        public static final StatusEnum INSTALLFAILED = new StatusEnum("InstallFailed");

        /** Enum UPDATING for value: "Updating" */
        public static final StatusEnum UPDATING = new StatusEnum("Updating");

        /** Enum UPDATEFAILED for value: "UpdateFailed" */
        public static final StatusEnum UPDATEFAILED = new StatusEnum("UpdateFailed");

        /** Enum ROLLBACKING for value: "Rollbacking" */
        public static final StatusEnum ROLLBACKING = new StatusEnum("Rollbacking");

        /** Enum ROLLBACKSUCCESS for value: "RollbackSuccess" */
        public static final StatusEnum ROLLBACKSUCCESS = new StatusEnum("RollbackSuccess");

        /** Enum ROLLBACKFAILED for value: "RollbackFailed" */
        public static final StatusEnum ROLLBACKFAILED = new StatusEnum("RollbackFailed");

        /** Enum DELETING for value: "Deleting" */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /** Enum DELETEFAILED for value: "DeleteFailed" */
        public static final StatusEnum DELETEFAILED = new StatusEnum("DeleteFailed");

        /** Enum UNREGISTERING for value: "Unregistering" */
        public static final StatusEnum UNREGISTERING = new StatusEnum("Unregistering");

        /** Enum UNREGISTERFAILED for value: "UnRegisterFailed" */
        public static final StatusEnum UNREGISTERFAILED = new StatusEnum("UnRegisterFailed");

        /** Enum CREATETIMEOUT for value: "CreateTimeout" */
        public static final StatusEnum CREATETIMEOUT = new StatusEnum("CreateTimeout");

        /** Enum INITTIMEOUT for value: "InitTimeout" */
        public static final StatusEnum INITTIMEOUT = new StatusEnum("InitTimeout");

        /** Enum REGISTERTIMEOUT for value: "RegisterTimeout" */
        public static final StatusEnum REGISTERTIMEOUT = new StatusEnum("RegisterTimeout");

        /** Enum INSTALLTIMEOUT for value: "InstallTimeout" */
        public static final StatusEnum INSTALLTIMEOUT = new StatusEnum("InstallTimeout");

        /** Enum UPDATETIMEOUT for value: "UpdateTimeout" */
        public static final StatusEnum UPDATETIMEOUT = new StatusEnum("UpdateTimeout");

        /** Enum ROLLBACKTIMEOUT for value: "RollbackTimeout" */
        public static final StatusEnum ROLLBACKTIMEOUT = new StatusEnum("RollbackTimeout");

        /** Enum DELETETIMEOUT for value: "DeleteTimeout" */
        public static final StatusEnum DELETETIMEOUT = new StatusEnum("DeleteTimeout");

        /** Enum UNREGISTERTIMEOUT for value: "UnregisterTimeout" */
        public static final StatusEnum UNREGISTERTIMEOUT = new StatusEnum("UnregisterTimeout");

        /** Enum STARTING for value: "Starting" */
        public static final StatusEnum STARTING = new StatusEnum("Starting");

        /** Enum FREEZING for value: "Freezing" */
        public static final StatusEnum FREEZING = new StatusEnum("Freezing");

        /** Enum FROZEN for value: "Frozen" */
        public static final StatusEnum FROZEN = new StatusEnum("Frozen");

        /** Enum RESTARTING for value: "Restarting" */
        public static final StatusEnum RESTARTING = new StatusEnum("Restarting");

        /** Enum RESTARTFAIL for value: "RestartFail" */
        public static final StatusEnum RESTARTFAIL = new StatusEnum("RestartFail");

        /** Enum UNHEALTHY for value: "Unhealthy" */
        public static final StatusEnum UNHEALTHY = new StatusEnum("Unhealthy");

        /** Enum RESTARTTIMEOUT for value: "RestartTimeout" */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private Integer instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /** 实例规格： - ROMA_BASIC：基础版实例 - ROMA_PROFESSIONAL：专业版实例 - ROMA_ENTERPRISE：企业版实例 - ROMA_PLATINUM：铂金版实例 [-
     * ROMA_BASIC_IPV6：基础版IPV6实例](tag:hcs) [- ROMA_PROFESSIONAL_IPV6：专业版IPV6实例](tag:hcs) [-
     * ROMA_ENTERPRISE_IPV6：企业版IPV6实例](tag:hcs) [- ROMA_PLATINUM_IPV6：铂金版IPV6实例](tag:hcs) */
    public static final class SpecEnum {

        /** Enum ROMA_BASIC for value: "ROMA_BASIC" */
        public static final SpecEnum ROMA_BASIC = new SpecEnum("ROMA_BASIC");

        /** Enum ROMA_PROFESSIONAL for value: "ROMA_PROFESSIONAL" */
        public static final SpecEnum ROMA_PROFESSIONAL = new SpecEnum("ROMA_PROFESSIONAL");

        /** Enum ROMA_ENTERPRISE for value: "ROMA_ENTERPRISE" */
        public static final SpecEnum ROMA_ENTERPRISE = new SpecEnum("ROMA_ENTERPRISE");

        /** Enum ROMA_PLATINUM for value: "ROMA_PLATINUM" */
        public static final SpecEnum ROMA_PLATINUM = new SpecEnum("ROMA_PLATINUM");

        /** Enum ROMA_BASIC_IPV6 for value: "ROMA_BASIC_IPV6" */
        public static final SpecEnum ROMA_BASIC_IPV6 = new SpecEnum("ROMA_BASIC_IPV6");

        /** Enum ROMA_PROFESSIONAL_IPV6 for value: "ROMA_PROFESSIONAL_IPV6" */
        public static final SpecEnum ROMA_PROFESSIONAL_IPV6 = new SpecEnum("ROMA_PROFESSIONAL_IPV6");

        /** Enum ROMA_ENTERPRISE_IPV6 for value: "ROMA_ENTERPRISE_IPV6" */
        public static final SpecEnum ROMA_ENTERPRISE_IPV6 = new SpecEnum("ROMA_ENTERPRISE_IPV6");

        /** Enum ROMA_PLATINUM_IPV6 for value: "ROMA_PLATINUM_IPV6" */
        public static final SpecEnum ROMA_PLATINUM_IPV6 = new SpecEnum("ROMA_PLATINUM_IPV6");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("ROMA_BASIC", ROMA_BASIC);
            map.put("ROMA_PROFESSIONAL", ROMA_PROFESSIONAL);
            map.put("ROMA_ENTERPRISE", ROMA_ENTERPRISE);
            map.put("ROMA_PLATINUM", ROMA_PLATINUM);
            map.put("ROMA_BASIC_IPV6", ROMA_BASIC_IPV6);
            map.put("ROMA_PROFESSIONAL_IPV6", ROMA_PROFESSIONAL_IPV6);
            map.put("ROMA_ENTERPRISE_IPV6", ROMA_ENTERPRISE_IPV6);
            map.put("ROMA_PLATINUM_IPV6", ROMA_PLATINUM_IPV6);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbc_metadata")

    private String cbcMetadata;

    public RespInstanceBase withId(String id) {
        this.id = id;
        return this;
    }

    /** 实例编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RespInstanceBase withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 实例所属项目编号
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RespInstanceBase withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /** 实例名称
     * 
     * @return instanceName */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RespInstanceBase withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 实例状态： - Creating：创建中 - CreateSuccess：创建成功 - CreateFail：创建失败 - Initing：初始化中 - Registering：注册中 - Running：运行中 -
     * InitingFailed：初始化失败 - RegisterFailed：注册失败 - Installing：安装中 - InstallFailed：安装失败 - Updating：升级中 -
     * UpdateFailed：升级失败 - Rollbacking：回滚中 - RollbackSuccess：回滚成功 - RollbackFailed：回滚失败 - Deleting：删除中 -
     * DeleteFailed：删除失败 - Unregistering：注销中 - UnRegisterFailed：注销失败 - CreateTimeout：创建超时 - InitTimeout：初始化超时 -
     * RegisterTimeout：注册超时 - InstallTimeout：安装超时 - UpdateTimeout：升级超时 - RollbackTimeout：回滚超时 - DeleteTimeout：删除超时 -
     * UnregisterTimeout：注销超时 - Starting：启动中 - Freezing：冻结中 - Frozen：已冻结 - Restarting：重启中 - RestartFail：重启失败 -
     * Unhealthy：实例异常 - RestartTimeout：重启超时
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RespInstanceBase withInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /** 实例状态对应编号 - 1：创建中 - 2：创建成功 - 3：创建失败 - 4：初始化中 - 5：注册中 - 6：运行中 - 7：初始化失败 - 8：注册失败 - 10：安装中 - 11：安装失败 - 12：升级中 -
     * 13：升级失败 - 20：回滚中 - 21：回滚成功 - 22：回滚失败 - 23：删除中 - 24：删除失败 - 25：注销中 - 26：注销失败 - 27：创建超时 - 28：初始化超时 - 29：注册超时 -
     * 30：安装超时 - 31：升级超时 - 32：回滚超时 - 33：删除超时 - 34：注销超时 - 35：启动中 - 36：冻结中 - 37：已冻结 - 38：重启中 - 39：重启失败 - 40：实例异常 - 41：重启超时
     * 
     * @return instanceStatus */
    public Integer getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public RespInstanceBase withType(String type) {
        this.type = type;
        return this;
    }

    /** 实例类型 暂不支持
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RespInstanceBase withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /** 实例规格： - ROMA_BASIC：基础版实例 - ROMA_PROFESSIONAL：专业版实例 - ROMA_ENTERPRISE：企业版实例 - ROMA_PLATINUM：铂金版实例 [-
     * ROMA_BASIC_IPV6：基础版IPV6实例](tag:hcs) [- ROMA_PROFESSIONAL_IPV6：专业版IPV6实例](tag:hcs) [-
     * ROMA_ENTERPRISE_IPV6：企业版IPV6实例](tag:hcs) [- ROMA_PLATINUM_IPV6：铂金版IPV6实例](tag:hcs)
     * 
     * @return spec */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public RespInstanceBase withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 实例创建时间。unix时间戳格式。
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public RespInstanceBase withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID，企业帐号必填
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RespInstanceBase withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /** 实例绑定的弹性IP地址
     * 
     * @return eipAddress */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public RespInstanceBase withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 实例计费方式： - 0：按需计费 - 1：包周期计费
     * 
     * @return chargingMode */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public RespInstanceBase withCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
        return this;
    }

    /** 包周期计费订单编号
     * 
     * @return cbcMetadata */
    public String getCbcMetadata() {
        return cbcMetadata;
    }

    public void setCbcMetadata(String cbcMetadata) {
        this.cbcMetadata = cbcMetadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespInstanceBase respInstanceBase = (RespInstanceBase) o;
        return Objects.equals(this.id, respInstanceBase.id)
            && Objects.equals(this.projectId, respInstanceBase.projectId)
            && Objects.equals(this.instanceName, respInstanceBase.instanceName)
            && Objects.equals(this.status, respInstanceBase.status)
            && Objects.equals(this.instanceStatus, respInstanceBase.instanceStatus)
            && Objects.equals(this.type, respInstanceBase.type) && Objects.equals(this.spec, respInstanceBase.spec)
            && Objects.equals(this.createTime, respInstanceBase.createTime)
            && Objects.equals(this.enterpriseProjectId, respInstanceBase.enterpriseProjectId)
            && Objects.equals(this.eipAddress, respInstanceBase.eipAddress)
            && Objects.equals(this.chargingMode, respInstanceBase.chargingMode)
            && Objects.equals(this.cbcMetadata, respInstanceBase.cbcMetadata);
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
            cbcMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespInstanceBase {\n");
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
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

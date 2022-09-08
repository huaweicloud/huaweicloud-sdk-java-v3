package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

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

    public ListInstancesV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListInstancesV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstancesV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesV2Request withInstanceName(String instanceName) {
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

    public ListInstancesV2Request withStatus(StatusEnum status) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesV2Request listInstancesV2Request = (ListInstancesV2Request) o;
        return Objects.equals(this.offset, listInstancesV2Request.offset)
            && Objects.equals(this.limit, listInstancesV2Request.limit)
            && Objects.equals(this.instanceId, listInstancesV2Request.instanceId)
            && Objects.equals(this.instanceName, listInstancesV2Request.instanceName)
            && Objects.equals(this.status, listInstancesV2Request.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, instanceId, instanceName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesV2Request {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesBackupStrategyResult;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesDatastoreResult;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesGroupResult;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesStorageResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例信息。
 */
public class ListInstancesResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private ListInstancesDatastoreResult datastore = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private String engine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_name")
    
    private String dbUserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl")
    
    private Integer ssl;


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
    @JsonProperty(value="backup_strategy")
    
    private ListInstancesBackupStrategyResult backupStrategy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pay_mode")
    
    private String payMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintenance_window")
    
    private String maintenanceWindow;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groups")
    
    private List<ListInstancesGroupResult> groups = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private ListInstancesStorageResult storage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actions")
    
    private List<String> actions = new ArrayList<>();
    
    public ListInstancesResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInstancesResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。 取值： - normal，表示实例正常。 - abnormal，表示实例异常。 - creating，表示实例创建中。 - frozen，表示实例被冻结。 - data_disk_full，表示实例磁盘已满。 - createfail，表示实例创建失败。 - enlargefail，表示实例扩容节点个数失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListInstancesResult withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口号。文档数据库实例支持的端口号范围为2100～9500。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ListInstancesResult withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 实例类型。与请求参数相同。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ListInstancesResult withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 实例所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListInstancesResult withDatastore(ListInstancesDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public ListInstancesResult withDatastore(Consumer<ListInstancesDatastoreResult> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new ListInstancesDatastoreResult();
        }
        datastoreSetter.accept(this.datastore);
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public ListInstancesDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(ListInstancesDatastoreResult datastore) {
        this.datastore = datastore;
    }

    public ListInstancesResult withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    


    /**
     * 存储引擎。 - 对于社区版实例，取值为“wiredTiger”。 - 对于增强版实例，取值为“rocksDB”。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ListInstancesResult withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 实例创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ListInstancesResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 实例操作最新变更的时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ListInstancesResult withDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    


    /**
     * 默认用户名。取值为“rwuser”。
     * @return dbUserName
     */
    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public ListInstancesResult withSsl(Integer ssl) {
        this.ssl = ssl;
        return this;
    }

    


    /**
     * 是否开启SSL安全连接。 - 取值为“1”，表示开启。 - 取值为“0”，表示不开启。
     * @return ssl
     */
    public Integer getSsl() {
        return ssl;
    }

    public void setSsl(Integer ssl) {
        this.ssl = ssl;
    }

    public ListInstancesResult withVpcId(String vpcId) {
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

    public ListInstancesResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ListInstancesResult withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ListInstancesResult withBackupStrategy(ListInstancesBackupStrategyResult backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public ListInstancesResult withBackupStrategy(Consumer<ListInstancesBackupStrategyResult> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new ListInstancesBackupStrategyResult();
        }
        backupStrategySetter.accept(this.backupStrategy);
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public ListInstancesBackupStrategyResult getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(ListInstancesBackupStrategyResult backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public ListInstancesResult withPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }

    


    /**
     * 计费方式。 - 取值为“0”，表示按需计费。 - 取值为“1”，表示包年/包月计费。
     * @return payMode
     */
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public ListInstancesResult withMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    


    /**
     * 系统可维护时间窗。
     * @return maintenanceWindow
     */
    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public ListInstancesResult withGroups(List<ListInstancesGroupResult> groups) {
        this.groups = groups;
        return this;
    }

    
    public ListInstancesResult addGroupsItem(ListInstancesGroupResult groupsItem) {
        this.groups.add(groupsItem);
        return this;
    }

    public ListInstancesResult withGroups(Consumer<List<ListInstancesGroupResult>> groupsSetter) {
        if(this.groups == null ){
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 组信息。
     * @return groups
     */
    public List<ListInstancesGroupResult> getGroups() {
        return groups;
    }

    public void setGroups(List<ListInstancesGroupResult> groups) {
        this.groups = groups;
    }

    public ListInstancesResult withStorage(ListInstancesStorageResult storage) {
        this.storage = storage;
        return this;
    }

    public ListInstancesResult withStorage(Consumer<ListInstancesStorageResult> storageSetter) {
        if(this.storage == null ){
            this.storage = new ListInstancesStorageResult();
        }
        storageSetter.accept(this.storage);
        return this;
    }


    /**
     * Get storage
     * @return storage
     */
    public ListInstancesStorageResult getStorage() {
        return storage;
    }

    public void setStorage(ListInstancesStorageResult storage) {
        this.storage = storage;
    }

    public ListInstancesResult withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 磁盘加密的密钥ID。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public ListInstancesResult withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。取值为“0”，表示为default企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInstancesResult withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ListInstancesResult withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    
    public ListInstancesResult addActionsItem(String actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    public ListInstancesResult withActions(Consumer<List<String>> actionsSetter) {
        if(this.actions == null ){
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 实例正在执行的动作。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesResult listInstancesResult = (ListInstancesResult) o;
        return Objects.equals(this.id, listInstancesResult.id) &&
            Objects.equals(this.name, listInstancesResult.name) &&
            Objects.equals(this.status, listInstancesResult.status) &&
            Objects.equals(this.port, listInstancesResult.port) &&
            Objects.equals(this.mode, listInstancesResult.mode) &&
            Objects.equals(this.region, listInstancesResult.region) &&
            Objects.equals(this.datastore, listInstancesResult.datastore) &&
            Objects.equals(this.engine, listInstancesResult.engine) &&
            Objects.equals(this.created, listInstancesResult.created) &&
            Objects.equals(this.updated, listInstancesResult.updated) &&
            Objects.equals(this.dbUserName, listInstancesResult.dbUserName) &&
            Objects.equals(this.ssl, listInstancesResult.ssl) &&
            Objects.equals(this.vpcId, listInstancesResult.vpcId) &&
            Objects.equals(this.subnetId, listInstancesResult.subnetId) &&
            Objects.equals(this.securityGroupId, listInstancesResult.securityGroupId) &&
            Objects.equals(this.backupStrategy, listInstancesResult.backupStrategy) &&
            Objects.equals(this.payMode, listInstancesResult.payMode) &&
            Objects.equals(this.maintenanceWindow, listInstancesResult.maintenanceWindow) &&
            Objects.equals(this.groups, listInstancesResult.groups) &&
            Objects.equals(this.storage, listInstancesResult.storage) &&
            Objects.equals(this.diskEncryptionId, listInstancesResult.diskEncryptionId) &&
            Objects.equals(this.enterpriseProjectId, listInstancesResult.enterpriseProjectId) &&
            Objects.equals(this.timeZone, listInstancesResult.timeZone) &&
            Objects.equals(this.actions, listInstancesResult.actions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, port, mode, region, datastore, engine, created, updated, dbUserName, ssl, vpcId, subnetId, securityGroupId, backupStrategy, payMode, maintenanceWindow, groups, storage, diskEncryptionId, enterpriseProjectId, timeZone, actions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResult {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
            sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
            sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
            sb.append("    created: ").append(toIndentedString(created)).append("\n");
            sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
            sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
            sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
            sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
            sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
            sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
            sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
            sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
            sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
            sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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


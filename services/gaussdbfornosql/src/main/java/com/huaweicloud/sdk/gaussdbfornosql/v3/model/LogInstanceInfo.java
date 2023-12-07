package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LogInstanceInfo
 */
public class LogInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private InstancesDatastoreResult datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_log_types")

    private List<String> supportedLogTypes = null;

    public LogInstanceInfo withId(String id) {
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

    public LogInstanceInfo withName(String name) {
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

    public LogInstanceInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。 取值： - normal，表示实例正常。 - abnormal，表示实例异常。 - creating，表示实例创建中。 - frozen，表示实例被冻结。 - data_disk_full，表示实例磁盘已满。 - createfail，表示实例创建失败。 - enlargefail，表示实例扩容节点失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LogInstanceInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型。 - 取值为“Cluster”，表示GeminiDB Redis集群实例类型。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public LogInstanceInfo withDatastore(InstancesDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public LogInstanceInfo withDatastore(Consumer<InstancesDatastoreResult> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new InstancesDatastoreResult();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public InstancesDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(InstancesDatastoreResult datastore) {
        this.datastore = datastore;
    }

    public LogInstanceInfo withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public LogInstanceInfo addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public LogInstanceInfo withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
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

    public LogInstanceInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public LogInstanceInfo withSupportedLogTypes(List<String> supportedLogTypes) {
        this.supportedLogTypes = supportedLogTypes;
        return this;
    }

    public LogInstanceInfo addSupportedLogTypesItem(String supportedLogTypesItem) {
        if (this.supportedLogTypes == null) {
            this.supportedLogTypes = new ArrayList<>();
        }
        this.supportedLogTypes.add(supportedLogTypesItem);
        return this;
    }

    public LogInstanceInfo withSupportedLogTypes(Consumer<List<String>> supportedLogTypesSetter) {
        if (this.supportedLogTypes == null) {
            this.supportedLogTypes = new ArrayList<>();
        }
        supportedLogTypesSetter.accept(this.supportedLogTypes);
        return this;
    }

    /**
     * 日志类型。slow_log表示慢日志，audit_log表示审计日志。
     * @return supportedLogTypes
     */
    public List<String> getSupportedLogTypes() {
        return supportedLogTypes;
    }

    public void setSupportedLogTypes(List<String> supportedLogTypes) {
        this.supportedLogTypes = supportedLogTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogInstanceInfo that = (LogInstanceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.supportedLogTypes, that.supportedLogTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, mode, datastore, actions, enterpriseProjectId, supportedLogTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogInstanceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    supportedLogTypes: ").append(toIndentedString(supportedLogTypes)).append("\n");
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

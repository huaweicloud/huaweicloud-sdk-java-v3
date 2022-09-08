package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Clusters
 */
public class Clusters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customerConfig")

    private CustomerConfig customerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ClusterDetailInstance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azName")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbuser")

    private String dbuser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorName")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recentEvent")

    private Integer recentEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoOff")

    private Boolean isAutoOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isScheduleBootOff")

    private Boolean isScheduleBootOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterMode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private ClusterTask task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicEndpoint")

    private String publicEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actionProgress")

    private ActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakExpectedStartTime")

    private String bakExpectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakKeepDay")

    private Integer bakKeepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusDetail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFrozen")

    private String isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedReasons")

    private FailedReasons failedReasons;

    public Clusters withCustomerConfig(CustomerConfig customerConfig) {
        this.customerConfig = customerConfig;
        return this;
    }

    public Clusters withCustomerConfig(Consumer<CustomerConfig> customerConfigSetter) {
        if (this.customerConfig == null) {
            this.customerConfig = new CustomerConfig();
            customerConfigSetter.accept(this.customerConfig);
        }

        return this;
    }

    /**
     * Get customerConfig
     * @return customerConfig
     */
    public CustomerConfig getCustomerConfig() {
        return customerConfig;
    }

    public void setCustomerConfig(CustomerConfig customerConfig) {
        this.customerConfig = customerConfig;
    }

    public Clusters withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public Clusters withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public Clusters withInstances(List<ClusterDetailInstance> instances) {
        this.instances = instances;
        return this;
    }

    public Clusters addInstancesItem(ClusterDetailInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public Clusters withInstances(Consumer<List<ClusterDetailInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 集群的节点信息，请参见instances参数说明
     * @return instances
     */
    public List<ClusterDetailInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<ClusterDetailInstance> instances) {
        this.instances = instances;
    }

    public Clusters withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * az名称
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public Clusters withDbuser(String dbuser) {
        this.dbuser = dbuser;
        return this;
    }

    /**
     * 数据库用户
     * @return dbuser
     */
    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public Clusters withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * 规格名称
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Clusters withRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
        return this;
    }

    /**
     * 事件数
     * @return recentEvent
     */
    public Integer getRecentEvent() {
        return recentEvent;
    }

    public void setRecentEvent(Integer recentEvent) {
        this.recentEvent = recentEvent;
    }

    public Clusters withIsAutoOff(Boolean isAutoOff) {
        this.isAutoOff = isAutoOff;
        return this;
    }

    /**
     * 自动关机
     * @return isAutoOff
     */
    public Boolean getIsAutoOff() {
        return isAutoOff;
    }

    public void setIsAutoOff(Boolean isAutoOff) {
        this.isAutoOff = isAutoOff;
    }

    public Clusters withIsScheduleBootOff(Boolean isScheduleBootOff) {
        this.isScheduleBootOff = isScheduleBootOff;
        return this;
    }

    /**
     * 选择是否启用定时开关机功能。定时开关机功能和自动关机功能不可同时开启
     * @return isScheduleBootOff
     */
    public Boolean getIsScheduleBootOff() {
        return isScheduleBootOff;
    }

    public void setIsScheduleBootOff(Boolean isScheduleBootOff) {
        this.isScheduleBootOff = isScheduleBootOff;
    }

    public Clusters withClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 集群模式：sharding(分片集群)
     * @return clusterMode
     */
    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

    public Clusters withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Clusters withTask(ClusterTask task) {
        this.task = task;
        return this;
    }

    public Clusters withTask(Consumer<ClusterTask> taskSetter) {
        if (this.task == null) {
            this.task = new ClusterTask();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public ClusterTask getTask() {
        return task;
    }

    public void setTask(ClusterTask task) {
        this.task = task;
    }

    public Clusters withPublicEndpoint(String publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
        return this;
    }

    /**
     * 集群绑定的EIP
     * @return publicEndpoint
     */
    public String getPublicEndpoint() {
        return publicEndpoint;
    }

    public void setPublicEndpoint(String publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
    }

    public Clusters withActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public Clusters withActionProgress(Consumer<ActionProgress> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ActionProgress();
            actionProgressSetter.accept(this.actionProgress);
        }

        return this;
    }

    /**
     * Get actionProgress
     * @return actionProgress
     */
    public ActionProgress getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
    }

    public Clusters withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 集群创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Clusters withBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
        return this;
    }

    /**
     * 开始时间
     * @return bakExpectedStartTime
     */
    public String getBakExpectedStartTime() {
        return bakExpectedStartTime;
    }

    public void setBakExpectedStartTime(String bakExpectedStartTime) {
        this.bakExpectedStartTime = bakExpectedStartTime;
    }

    public Clusters withBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
        return this;
    }

    /**
     * 保留时间
     * @return bakKeepDay
     */
    public Integer getBakKeepDay() {
        return bakKeepDay;
    }

    public void setBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
    }

    public Clusters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clusters withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * 集群状态描述：Normal（正常）
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public Clusters withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 集群ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Clusters withIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 集群是否冻结：0：否 1：是
     * @return isFrozen
     */
    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Clusters withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 集群更新时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Clusters withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态： - 100：创建中 - 200：正常 - 300：失败 - 303：创建失败 - 500：重启中 - 800：冻结 - 900：已关机 - 910：正在关机 - 920：正在开机
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clusters withFailedReasons(FailedReasons failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public Clusters withFailedReasons(Consumer<FailedReasons> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new FailedReasons();
            failedReasonsSetter.accept(this.failedReasons);
        }

        return this;
    }

    /**
     * Get failedReasons
     * @return failedReasons
     */
    public FailedReasons getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(FailedReasons failedReasons) {
        this.failedReasons = failedReasons;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Clusters clusters = (Clusters) o;
        return Objects.equals(this.customerConfig, clusters.customerConfig)
            && Objects.equals(this.datastore, clusters.datastore) && Objects.equals(this.instances, clusters.instances)
            && Objects.equals(this.azName, clusters.azName) && Objects.equals(this.dbuser, clusters.dbuser)
            && Objects.equals(this.flavorName, clusters.flavorName)
            && Objects.equals(this.recentEvent, clusters.recentEvent)
            && Objects.equals(this.isAutoOff, clusters.isAutoOff)
            && Objects.equals(this.isScheduleBootOff, clusters.isScheduleBootOff)
            && Objects.equals(this.clusterMode, clusters.clusterMode)
            && Objects.equals(this.namespace, clusters.namespace) && Objects.equals(this.task, clusters.task)
            && Objects.equals(this.publicEndpoint, clusters.publicEndpoint)
            && Objects.equals(this.actionProgress, clusters.actionProgress)
            && Objects.equals(this.created, clusters.created)
            && Objects.equals(this.bakExpectedStartTime, clusters.bakExpectedStartTime)
            && Objects.equals(this.bakKeepDay, clusters.bakKeepDay) && Objects.equals(this.name, clusters.name)
            && Objects.equals(this.statusDetail, clusters.statusDetail) && Objects.equals(this.id, clusters.id)
            && Objects.equals(this.isFrozen, clusters.isFrozen) && Objects.equals(this.updated, clusters.updated)
            && Objects.equals(this.status, clusters.status)
            && Objects.equals(this.failedReasons, clusters.failedReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerConfig,
            datastore,
            instances,
            azName,
            dbuser,
            flavorName,
            recentEvent,
            isAutoOff,
            isScheduleBootOff,
            clusterMode,
            namespace,
            task,
            publicEndpoint,
            actionProgress,
            created,
            bakExpectedStartTime,
            bakKeepDay,
            name,
            statusDetail,
            id,
            isFrozen,
            updated,
            status,
            failedReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clusters {\n");
        sb.append("    customerConfig: ").append(toIndentedString(customerConfig)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    dbuser: ").append(toIndentedString(dbuser)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
        sb.append("    isAutoOff: ").append(toIndentedString(isAutoOff)).append("\n");
        sb.append("    isScheduleBootOff: ").append(toIndentedString(isScheduleBootOff)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    bakExpectedStartTime: ").append(toIndentedString(bakExpectedStartTime)).append("\n");
        sb.append("    bakKeepDay: ").append(toIndentedString(bakKeepDay)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
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

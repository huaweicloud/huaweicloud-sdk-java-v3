package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicEndpoint")

    @JacksonXmlProperty(localName = "publicEndpoint")

    private String publicEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    @JacksonXmlProperty(localName = "instances")

    private List<ClusterDetailInstance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customerConfig")

    @JacksonXmlProperty(localName = "customerConfig")

    private CustomerConfig customerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    @JacksonXmlProperty(localName = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoOff")

    @JacksonXmlProperty(localName = "isAutoOff")

    private Boolean isAutoOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicEndpointDomainName")

    @JacksonXmlProperty(localName = "publicEndpointDomainName")

    private String publicEndpointDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakExpectedStartTime")

    @JacksonXmlProperty(localName = "bakExpectedStartTime")

    private String bakExpectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakKeepDay")

    @JacksonXmlProperty(localName = "bakKeepDay")

    private Integer bakKeepDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainWindow")

    @JacksonXmlProperty(localName = "maintainWindow")

    private CdmQueryClusterDetailsRepsonseMaintainWindow maintainWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recentEvent")

    @JacksonXmlProperty(localName = "recentEvent")

    private Integer recentEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorName")

    @JacksonXmlProperty(localName = "flavorName")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azName")

    @JacksonXmlProperty(localName = "azName")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointDomainName")

    @JacksonXmlProperty(localName = "endpointDomainName")

    private String endpointDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicEndpointStatus")

    @JacksonXmlProperty(localName = "publicEndpointStatus")

    private CdmQueryClusterDetailsRepsonsePublicEndpointStatus publicEndpointStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isScheduleBootOff")

    @JacksonXmlProperty(localName = "isScheduleBootOff")

    private Boolean isScheduleBootOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eipId")

    @JacksonXmlProperty(localName = "eipId")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedReasons")

    @JacksonXmlProperty(localName = "failedReasons")

    private FailedReasons failedReasons;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbuser")

    @JacksonXmlProperty(localName = "dbuser")

    private String dbuser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private List<ClusterLinks> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterMode")

    @JacksonXmlProperty(localName = "clusterMode")

    private String clusterMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    @JacksonXmlProperty(localName = "task")

    private ClusterTask task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    @JacksonXmlProperty(localName = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusDetail")

    @JacksonXmlProperty(localName = "statusDetail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    @JacksonXmlProperty(localName = "config_status")

    private String configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actionProgress")

    @JacksonXmlProperty(localName = "actionProgress")

    private ActionProgress actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFrozen")

    @JacksonXmlProperty(localName = "isFrozen")

    private String isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    @JacksonXmlProperty(localName = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    @JacksonXmlProperty(localName = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    public ShowClusterDetailResponse withPublicEndpoint(String publicEndpoint) {
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

    public ShowClusterDetailResponse withInstances(List<ClusterDetailInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ShowClusterDetailResponse addInstancesItem(ClusterDetailInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ShowClusterDetailResponse withInstances(Consumer<List<ClusterDetailInstance>> instancesSetter) {
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

    public ShowClusterDetailResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组id
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowClusterDetailResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowClusterDetailResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowClusterDetailResponse withCustomerConfig(CustomerConfig customerConfig) {
        this.customerConfig = customerConfig;
        return this;
    }

    public ShowClusterDetailResponse withCustomerConfig(Consumer<CustomerConfig> customerConfigSetter) {
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

    public ShowClusterDetailResponse withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ShowClusterDetailResponse withDatastore(Consumer<Datastore> datastoreSetter) {
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

    public ShowClusterDetailResponse withIsAutoOff(Boolean isAutoOff) {
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

    public ShowClusterDetailResponse withPublicEndpointDomainName(String publicEndpointDomainName) {
        this.publicEndpointDomainName = publicEndpointDomainName;
        return this;
    }

    /**
     * 集群绑定的EIP域名
     * @return publicEndpointDomainName
     */
    public String getPublicEndpointDomainName() {
        return publicEndpointDomainName;
    }

    public void setPublicEndpointDomainName(String publicEndpointDomainName) {
        this.publicEndpointDomainName = publicEndpointDomainName;
    }

    public ShowClusterDetailResponse withBakExpectedStartTime(String bakExpectedStartTime) {
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

    public ShowClusterDetailResponse withBakKeepDay(Integer bakKeepDay) {
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

    public ShowClusterDetailResponse withMaintainWindow(CdmQueryClusterDetailsRepsonseMaintainWindow maintainWindow) {
        this.maintainWindow = maintainWindow;
        return this;
    }

    public ShowClusterDetailResponse withMaintainWindow(
        Consumer<CdmQueryClusterDetailsRepsonseMaintainWindow> maintainWindowSetter) {
        if (this.maintainWindow == null) {
            this.maintainWindow = new CdmQueryClusterDetailsRepsonseMaintainWindow();
            maintainWindowSetter.accept(this.maintainWindow);
        }

        return this;
    }

    /**
     * Get maintainWindow
     * @return maintainWindow
     */
    public CdmQueryClusterDetailsRepsonseMaintainWindow getMaintainWindow() {
        return maintainWindow;
    }

    public void setMaintainWindow(CdmQueryClusterDetailsRepsonseMaintainWindow maintainWindow) {
        this.maintainWindow = maintainWindow;
    }

    public ShowClusterDetailResponse withRecentEvent(Integer recentEvent) {
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

    public ShowClusterDetailResponse withFlavorName(String flavorName) {
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

    public ShowClusterDetailResponse withAzName(String azName) {
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

    public ShowClusterDetailResponse withEndpointDomainName(String endpointDomainName) {
        this.endpointDomainName = endpointDomainName;
        return this;
    }

    /**
     * 对端域名
     * @return endpointDomainName
     */
    public String getEndpointDomainName() {
        return endpointDomainName;
    }

    public void setEndpointDomainName(String endpointDomainName) {
        this.endpointDomainName = endpointDomainName;
    }

    public ShowClusterDetailResponse withPublicEndpointStatus(
        CdmQueryClusterDetailsRepsonsePublicEndpointStatus publicEndpointStatus) {
        this.publicEndpointStatus = publicEndpointStatus;
        return this;
    }

    public ShowClusterDetailResponse withPublicEndpointStatus(
        Consumer<CdmQueryClusterDetailsRepsonsePublicEndpointStatus> publicEndpointStatusSetter) {
        if (this.publicEndpointStatus == null) {
            this.publicEndpointStatus = new CdmQueryClusterDetailsRepsonsePublicEndpointStatus();
            publicEndpointStatusSetter.accept(this.publicEndpointStatus);
        }

        return this;
    }

    /**
     * Get publicEndpointStatus
     * @return publicEndpointStatus
     */
    public CdmQueryClusterDetailsRepsonsePublicEndpointStatus getPublicEndpointStatus() {
        return publicEndpointStatus;
    }

    public void setPublicEndpointStatus(CdmQueryClusterDetailsRepsonsePublicEndpointStatus publicEndpointStatus) {
        this.publicEndpointStatus = publicEndpointStatus;
    }

    public ShowClusterDetailResponse withIsScheduleBootOff(Boolean isScheduleBootOff) {
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

    public ShowClusterDetailResponse withNamespace(String namespace) {
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

    public ShowClusterDetailResponse withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性ip id
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public ShowClusterDetailResponse withFailedReasons(FailedReasons failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ShowClusterDetailResponse withFailedReasons(Consumer<FailedReasons> failedReasonsSetter) {
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

    public ShowClusterDetailResponse withDbuser(String dbuser) {
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

    public ShowClusterDetailResponse withLinks(List<ClusterLinks> links) {
        this.links = links;
        return this;
    }

    public ShowClusterDetailResponse addLinksItem(ClusterLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ShowClusterDetailResponse withLinks(Consumer<List<ClusterLinks>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    public List<ClusterLinks> getLinks() {
        return links;
    }

    public void setLinks(List<ClusterLinks> links) {
        this.links = links;
    }

    public ShowClusterDetailResponse withClusterMode(String clusterMode) {
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

    public ShowClusterDetailResponse withTask(ClusterTask task) {
        this.task = task;
        return this;
    }

    public ShowClusterDetailResponse withTask(Consumer<ClusterTask> taskSetter) {
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

    public ShowClusterDetailResponse withCreated(String created) {
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

    public ShowClusterDetailResponse withStatusDetail(String statusDetail) {
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

    public ShowClusterDetailResponse withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 集群配置状态： - In-Sync：配置已同步。 - Applying：配置中。 - Sync-Failure：配置失败
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    public ShowClusterDetailResponse withActionProgress(ActionProgress actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ShowClusterDetailResponse withActionProgress(Consumer<ActionProgress> actionProgressSetter) {
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

    public ShowClusterDetailResponse withName(String name) {
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

    public ShowClusterDetailResponse withId(String id) {
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

    public ShowClusterDetailResponse withIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 集群是否冻结：0：否1：是
     * @return isFrozen
     */
    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public ShowClusterDetailResponse withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ShowClusterDetailResponse addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ShowClusterDetailResponse withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 集群配置状态：In-Sync：配置已同步。Applying：配置中。Sync-Failure：配置失败
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ShowClusterDetailResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 集群更新时间，格式为 ISO8601：YYYY-MM-DDThh:mm:ssZ
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowClusterDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态： - 100：创建中 - 200：正常 - 300：失败 - 303：创建失败 - 800：冻结 - 900：已关机 - 910：正在关机 - 920：正在开机
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        ShowClusterDetailResponse showClusterDetailResponse = (ShowClusterDetailResponse) o;
        return Objects.equals(this.publicEndpoint, showClusterDetailResponse.publicEndpoint)
            && Objects.equals(this.instances, showClusterDetailResponse.instances)
            && Objects.equals(this.securityGroupId, showClusterDetailResponse.securityGroupId)
            && Objects.equals(this.subnetId, showClusterDetailResponse.subnetId)
            && Objects.equals(this.vpcId, showClusterDetailResponse.vpcId)
            && Objects.equals(this.customerConfig, showClusterDetailResponse.customerConfig)
            && Objects.equals(this.datastore, showClusterDetailResponse.datastore)
            && Objects.equals(this.isAutoOff, showClusterDetailResponse.isAutoOff)
            && Objects.equals(this.publicEndpointDomainName, showClusterDetailResponse.publicEndpointDomainName)
            && Objects.equals(this.bakExpectedStartTime, showClusterDetailResponse.bakExpectedStartTime)
            && Objects.equals(this.bakKeepDay, showClusterDetailResponse.bakKeepDay)
            && Objects.equals(this.maintainWindow, showClusterDetailResponse.maintainWindow)
            && Objects.equals(this.recentEvent, showClusterDetailResponse.recentEvent)
            && Objects.equals(this.flavorName, showClusterDetailResponse.flavorName)
            && Objects.equals(this.azName, showClusterDetailResponse.azName)
            && Objects.equals(this.endpointDomainName, showClusterDetailResponse.endpointDomainName)
            && Objects.equals(this.publicEndpointStatus, showClusterDetailResponse.publicEndpointStatus)
            && Objects.equals(this.isScheduleBootOff, showClusterDetailResponse.isScheduleBootOff)
            && Objects.equals(this.namespace, showClusterDetailResponse.namespace)
            && Objects.equals(this.eipId, showClusterDetailResponse.eipId)
            && Objects.equals(this.failedReasons, showClusterDetailResponse.failedReasons)
            && Objects.equals(this.dbuser, showClusterDetailResponse.dbuser)
            && Objects.equals(this.links, showClusterDetailResponse.links)
            && Objects.equals(this.clusterMode, showClusterDetailResponse.clusterMode)
            && Objects.equals(this.task, showClusterDetailResponse.task)
            && Objects.equals(this.created, showClusterDetailResponse.created)
            && Objects.equals(this.statusDetail, showClusterDetailResponse.statusDetail)
            && Objects.equals(this.configStatus, showClusterDetailResponse.configStatus)
            && Objects.equals(this.actionProgress, showClusterDetailResponse.actionProgress)
            && Objects.equals(this.name, showClusterDetailResponse.name)
            && Objects.equals(this.id, showClusterDetailResponse.id)
            && Objects.equals(this.isFrozen, showClusterDetailResponse.isFrozen)
            && Objects.equals(this.actions, showClusterDetailResponse.actions)
            && Objects.equals(this.updated, showClusterDetailResponse.updated)
            && Objects.equals(this.status, showClusterDetailResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicEndpoint,
            instances,
            securityGroupId,
            subnetId,
            vpcId,
            customerConfig,
            datastore,
            isAutoOff,
            publicEndpointDomainName,
            bakExpectedStartTime,
            bakKeepDay,
            maintainWindow,
            recentEvent,
            flavorName,
            azName,
            endpointDomainName,
            publicEndpointStatus,
            isScheduleBootOff,
            namespace,
            eipId,
            failedReasons,
            dbuser,
            links,
            clusterMode,
            task,
            created,
            statusDetail,
            configStatus,
            actionProgress,
            name,
            id,
            isFrozen,
            actions,
            updated,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterDetailResponse {\n");
        sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    customerConfig: ").append(toIndentedString(customerConfig)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    isAutoOff: ").append(toIndentedString(isAutoOff)).append("\n");
        sb.append("    publicEndpointDomainName: ").append(toIndentedString(publicEndpointDomainName)).append("\n");
        sb.append("    bakExpectedStartTime: ").append(toIndentedString(bakExpectedStartTime)).append("\n");
        sb.append("    bakKeepDay: ").append(toIndentedString(bakKeepDay)).append("\n");
        sb.append("    maintainWindow: ").append(toIndentedString(maintainWindow)).append("\n");
        sb.append("    recentEvent: ").append(toIndentedString(recentEvent)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    endpointDomainName: ").append(toIndentedString(endpointDomainName)).append("\n");
        sb.append("    publicEndpointStatus: ").append(toIndentedString(publicEndpointStatus)).append("\n");
        sb.append("    isScheduleBootOff: ").append(toIndentedString(isScheduleBootOff)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
        sb.append("    dbuser: ").append(toIndentedString(dbuser)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

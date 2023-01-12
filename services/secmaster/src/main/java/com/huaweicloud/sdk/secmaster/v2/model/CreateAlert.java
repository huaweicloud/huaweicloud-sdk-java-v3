package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警详情
 */
public class CreateAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private ShowAlertRspEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private CreateAlertDataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_observed_time")

    private String firstObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_observed_time")

    private String lastObservedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrive_time")

    private String arriveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criticality")

    private Integer criticality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private Object alertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_list")

    private List<ShowAlertRspNetworkList> networkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<ShowAlertRspResourceList> resourceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private ShowAlertRspRemediation remediation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_state")

    private String verificationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private Integer sla;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_time")

    private String closeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chop_phase")

    private String chopPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipdrr_phase")

    private String ipdrrPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppdr_phase")

    private String ppdrPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simulation")

    private Boolean simulation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actor")

    private String actor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cteator")

    private String cteator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_reason")

    private String closeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_comment")

    private String closeComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private ShowAlertRspMalware malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_info")

    private Object systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private List<ShowAlertRspProcess> process = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private List<ShowAlertRspUserInfo> userInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private List<ShowAlertRspFileInfo> fileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_alert_table")

    private Object systemAlertTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateAlert withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateAlert withEnvironment(ShowAlertRspEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public CreateAlert withEnvironment(Consumer<ShowAlertRspEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new ShowAlertRspEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public ShowAlertRspEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ShowAlertRspEnvironment environment) {
        this.environment = environment;
    }

    public CreateAlert withDataSource(CreateAlertDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public CreateAlert withDataSource(Consumer<CreateAlertDataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new CreateAlertDataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public CreateAlertDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(CreateAlertDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public CreateAlert withFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
        return this;
    }

    /**
     * Update time
     * @return firstObservedTime
     */
    public String getFirstObservedTime() {
        return firstObservedTime;
    }

    public void setFirstObservedTime(String firstObservedTime) {
        this.firstObservedTime = firstObservedTime;
    }

    public CreateAlert withLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    /**
     * Update time
     * @return lastObservedTime
     */
    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public CreateAlert withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Create time
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateAlert withArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }

    /**
     * Update time
     * @return arriveTime
     */
    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public CreateAlert withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * The name, display only
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateAlert withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The name, display only
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CreateAlert withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description, display only
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAlert withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 事件URL链接
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreateAlert withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数
     * minimum: 0
     * maximum: 5
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateAlert withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度
     * minimum: 0
     * maximum: 5
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public CreateAlert withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重性等级
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public CreateAlert withCriticality(Integer criticality) {
        this.criticality = criticality;
        return this;
    }

    /**
     * 关键性，是指事件涉及的资源的重要性级别。
     * minimum: 0
     * maximum: 5
     * @return criticality
     */
    public Integer getCriticality() {
        return criticality;
    }

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    public CreateAlert withAlertType(Object alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * 事件分类
     * @return alertType
     */
    public Object getAlertType() {
        return alertType;
    }

    public void setAlertType(Object alertType) {
        this.alertType = alertType;
    }

    public CreateAlert withNetworkList(List<ShowAlertRspNetworkList> networkList) {
        this.networkList = networkList;
        return this;
    }

    public CreateAlert addNetworkListItem(ShowAlertRspNetworkList networkListItem) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        this.networkList.add(networkListItem);
        return this;
    }

    public CreateAlert withNetworkList(Consumer<List<ShowAlertRspNetworkList>> networkListSetter) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        networkListSetter.accept(this.networkList);
        return this;
    }

    /**
     * network_list
     * @return networkList
     */
    public List<ShowAlertRspNetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<ShowAlertRspNetworkList> networkList) {
        this.networkList = networkList;
    }

    public CreateAlert withResourceList(List<ShowAlertRspResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public CreateAlert addResourceListItem(ShowAlertRspResourceList resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public CreateAlert withResourceList(Consumer<List<ShowAlertRspResourceList>> resourceListSetter) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        resourceListSetter.accept(this.resourceList);
        return this;
    }

    /**
     * network_list
     * @return resourceList
     */
    public List<ShowAlertRspResourceList> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<ShowAlertRspResourceList> resourceList) {
        this.resourceList = resourceList;
    }

    public CreateAlert withRemediation(ShowAlertRspRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public CreateAlert withRemediation(Consumer<ShowAlertRspRemediation> remediationSetter) {
        if (this.remediation == null) {
            this.remediation = new ShowAlertRspRemediation();
            remediationSetter.accept(this.remediation);
        }

        return this;
    }

    /**
     * Get remediation
     * @return remediation
     */
    public ShowAlertRspRemediation getRemediation() {
        return remediation;
    }

    public void setRemediation(ShowAlertRspRemediation remediation) {
        this.remediation = remediation;
    }

    public CreateAlert withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * 验证状态
     * @return verificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    public CreateAlert withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 事件处理状态
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public CreateAlert withSla(Integer sla) {
        this.sla = sla;
        return this;
    }

    /**
     * sla
     * minimum: 0
     * maximum: 65535
     * @return sla
     */
    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    public CreateAlert withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create time
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateAlert withCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
     * Create time
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public CreateAlert withChopPhase(String chopPhase) {
        this.chopPhase = chopPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return chopPhase
     */
    public String getChopPhase() {
        return chopPhase;
    }

    public void setChopPhase(String chopPhase) {
        this.chopPhase = chopPhase;
    }

    public CreateAlert withIpdrrPhase(String ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return ipdrrPhase
     */
    public String getIpdrrPhase() {
        return ipdrrPhase;
    }

    public void setIpdrrPhase(String ipdrrPhase) {
        this.ipdrrPhase = ipdrrPhase;
    }

    public CreateAlert withPpdrPhase(String ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
        return this;
    }

    /**
     * 周期/处置阶段编号
     * @return ppdrPhase
     */
    public String getPpdrPhase() {
        return ppdrPhase;
    }

    public void setPpdrPhase(String ppdrPhase) {
        this.ppdrPhase = ppdrPhase;
    }

    public CreateAlert withSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 是否为调试事件.
     * @return simulation
     */
    public Boolean getSimulation() {
        return simulation;
    }

    public void setSimulation(Boolean simulation) {
        this.simulation = simulation;
    }

    public CreateAlert withActor(String actor) {
        this.actor = actor;
        return this;
    }

    /**
     * 委托人
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public CreateAlert withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * The name, display only
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateAlert withCteator(String cteator) {
        this.cteator = cteator;
        return this;
    }

    /**
     * The name, display only
     * @return cteator
     */
    public String getCteator() {
        return cteator;
    }

    public void setCteator(String cteator) {
        this.cteator = cteator;
    }

    public CreateAlert withCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    /**
     * 关闭原因
     * @return closeReason
     */
    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public CreateAlert withCloseComment(String closeComment) {
        this.closeComment = closeComment;
        return this;
    }

    /**
     * 关闭原因
     * @return closeComment
     */
    public String getCloseComment() {
        return closeComment;
    }

    public void setCloseComment(String closeComment) {
        this.closeComment = closeComment;
    }

    public CreateAlert withMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
        return this;
    }

    public CreateAlert withMalware(Consumer<ShowAlertRspMalware> malwareSetter) {
        if (this.malware == null) {
            this.malware = new ShowAlertRspMalware();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public ShowAlertRspMalware getMalware() {
        return malware;
    }

    public void setMalware(ShowAlertRspMalware malware) {
        this.malware = malware;
    }

    public CreateAlert withSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * 系统信息
     * @return systemInfo
     */
    public Object getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(Object systemInfo) {
        this.systemInfo = systemInfo;
    }

    public CreateAlert withProcess(List<ShowAlertRspProcess> process) {
        this.process = process;
        return this;
    }

    public CreateAlert addProcessItem(ShowAlertRspProcess processItem) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        this.process.add(processItem);
        return this;
    }

    public CreateAlert withProcess(Consumer<List<ShowAlertRspProcess>> processSetter) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        processSetter.accept(this.process);
        return this;
    }

    /**
     * 进程信息
     * @return process
     */
    public List<ShowAlertRspProcess> getProcess() {
        return process;
    }

    public void setProcess(List<ShowAlertRspProcess> process) {
        this.process = process;
    }

    public CreateAlert withUserInfo(List<ShowAlertRspUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public CreateAlert addUserInfoItem(ShowAlertRspUserInfo userInfoItem) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        this.userInfo.add(userInfoItem);
        return this;
    }

    public CreateAlert withUserInfo(Consumer<List<ShowAlertRspUserInfo>> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        userInfoSetter.accept(this.userInfo);
        return this;
    }

    /**
     * 用户信息
     * @return userInfo
     */
    public List<ShowAlertRspUserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<ShowAlertRspUserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    public CreateAlert withFileInfo(List<ShowAlertRspFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public CreateAlert addFileInfoItem(ShowAlertRspFileInfo fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public CreateAlert withFileInfo(Consumer<List<ShowAlertRspFileInfo>> fileInfoSetter) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        fileInfoSetter.accept(this.fileInfo);
        return this;
    }

    /**
     * 文件信息
     * @return fileInfo
     */
    public List<ShowAlertRspFileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<ShowAlertRspFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public CreateAlert withSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
        return this;
    }

    /**
     * 系统信息
     * @return systemAlertTable
     */
    public Object getSystemAlertTable() {
        return systemAlertTable;
    }

    public void setSystemAlertTable(Object systemAlertTable) {
        this.systemAlertTable = systemAlertTable;
    }

    public CreateAlert withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAlert withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAlert createAlert = (CreateAlert) o;
        return Objects.equals(this.version, createAlert.version)
            && Objects.equals(this.environment, createAlert.environment)
            && Objects.equals(this.dataSource, createAlert.dataSource)
            && Objects.equals(this.firstObservedTime, createAlert.firstObservedTime)
            && Objects.equals(this.lastObservedTime, createAlert.lastObservedTime)
            && Objects.equals(this.createTime, createAlert.createTime)
            && Objects.equals(this.arriveTime, createAlert.arriveTime) && Objects.equals(this.title, createAlert.title)
            && Objects.equals(this.label, createAlert.label)
            && Objects.equals(this.description, createAlert.description)
            && Objects.equals(this.sourceUrl, createAlert.sourceUrl) && Objects.equals(this.count, createAlert.count)
            && Objects.equals(this.confidence, createAlert.confidence)
            && Objects.equals(this.severity, createAlert.severity)
            && Objects.equals(this.criticality, createAlert.criticality)
            && Objects.equals(this.alertType, createAlert.alertType)
            && Objects.equals(this.networkList, createAlert.networkList)
            && Objects.equals(this.resourceList, createAlert.resourceList)
            && Objects.equals(this.remediation, createAlert.remediation)
            && Objects.equals(this.verificationState, createAlert.verificationState)
            && Objects.equals(this.handleStatus, createAlert.handleStatus) && Objects.equals(this.sla, createAlert.sla)
            && Objects.equals(this.updateTime, createAlert.updateTime)
            && Objects.equals(this.closeTime, createAlert.closeTime)
            && Objects.equals(this.chopPhase, createAlert.chopPhase)
            && Objects.equals(this.ipdrrPhase, createAlert.ipdrrPhase)
            && Objects.equals(this.ppdrPhase, createAlert.ppdrPhase)
            && Objects.equals(this.simulation, createAlert.simulation) && Objects.equals(this.actor, createAlert.actor)
            && Objects.equals(this.owner, createAlert.owner) && Objects.equals(this.cteator, createAlert.cteator)
            && Objects.equals(this.closeReason, createAlert.closeReason)
            && Objects.equals(this.closeComment, createAlert.closeComment)
            && Objects.equals(this.malware, createAlert.malware)
            && Objects.equals(this.systemInfo, createAlert.systemInfo)
            && Objects.equals(this.process, createAlert.process) && Objects.equals(this.userInfo, createAlert.userInfo)
            && Objects.equals(this.fileInfo, createAlert.fileInfo)
            && Objects.equals(this.systemAlertTable, createAlert.systemAlertTable)
            && Objects.equals(this.id, createAlert.id) && Objects.equals(this.workspaceId, createAlert.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            environment,
            dataSource,
            firstObservedTime,
            lastObservedTime,
            createTime,
            arriveTime,
            title,
            label,
            description,
            sourceUrl,
            count,
            confidence,
            severity,
            criticality,
            alertType,
            networkList,
            resourceList,
            remediation,
            verificationState,
            handleStatus,
            sla,
            updateTime,
            closeTime,
            chopPhase,
            ipdrrPhase,
            ppdrPhase,
            simulation,
            actor,
            owner,
            cteator,
            closeReason,
            closeComment,
            malware,
            systemInfo,
            process,
            userInfo,
            fileInfo,
            systemAlertTable,
            id,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlert {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    firstObservedTime: ").append(toIndentedString(firstObservedTime)).append("\n");
        sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
        sb.append("    networkList: ").append(toIndentedString(networkList)).append("\n");
        sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
        sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    chopPhase: ").append(toIndentedString(chopPhase)).append("\n");
        sb.append("    ipdrrPhase: ").append(toIndentedString(ipdrrPhase)).append("\n");
        sb.append("    ppdrPhase: ").append(toIndentedString(ppdrPhase)).append("\n");
        sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    cteator: ").append(toIndentedString(cteator)).append("\n");
        sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
        sb.append("    closeComment: ").append(toIndentedString(closeComment)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
        sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
        sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
        sb.append("    systemAlertTable: ").append(toIndentedString(systemAlertTable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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

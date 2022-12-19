package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件详情
 */
public class Incident {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private IncidentEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private IncidentDatasource datasource;

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
    @JsonProperty(value = "serverity")

    private String serverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criticality")

    private Integer criticality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private Object incidentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_list")

    private List<CreateIncidentNetworkList> networkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<CreateIncidentResourceList> resourceList = null;

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

    private String simulation;

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

    private CreateIncidentMalware malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_info")

    private Object systemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private List<CreateIncidentProcess> process = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private List<CreateIncidentUserInfo> userInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_info")

    private List<ShowAlertRspFileInfo> fileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_incident_table")

    private Object systemIncidentTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public Incident withVersion(String version) {
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

    public Incident withEnvironment(IncidentEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public Incident withEnvironment(Consumer<IncidentEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new IncidentEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public IncidentEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(IncidentEnvironment environment) {
        this.environment = environment;
    }

    public Incident withDatasource(IncidentDatasource datasource) {
        this.datasource = datasource;
        return this;
    }

    public Incident withDatasource(Consumer<IncidentDatasource> datasourceSetter) {
        if (this.datasource == null) {
            this.datasource = new IncidentDatasource();
            datasourceSetter.accept(this.datasource);
        }

        return this;
    }

    /**
     * Get datasource
     * @return datasource
     */
    public IncidentDatasource getDatasource() {
        return datasource;
    }

    public void setDatasource(IncidentDatasource datasource) {
        this.datasource = datasource;
    }

    public Incident withFirstObservedTime(String firstObservedTime) {
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

    public Incident withLastObservedTime(String lastObservedTime) {
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

    public Incident withCreateTime(String createTime) {
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

    public Incident withArriveTime(String arriveTime) {
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

    public Incident withTitle(String title) {
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

    public Incident withDescription(String description) {
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

    public Incident withSourceUrl(String sourceUrl) {
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

    public Incident withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数
     * minimum: 0
     * maximum: 64
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Incident withConfidence(Integer confidence) {
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

    public Incident withServerity(String serverity) {
        this.serverity = serverity;
        return this;
    }

    /**
     * 严重性等级
     * @return serverity
     */
    public String getServerity() {
        return serverity;
    }

    public void setServerity(String serverity) {
        this.serverity = serverity;
    }

    public Incident withCriticality(Integer criticality) {
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

    public Incident withIncidentType(Object incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * 事件分类
     * @return incidentType
     */
    public Object getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(Object incidentType) {
        this.incidentType = incidentType;
    }

    public Incident withNetworkList(List<CreateIncidentNetworkList> networkList) {
        this.networkList = networkList;
        return this;
    }

    public Incident addNetworkListItem(CreateIncidentNetworkList networkListItem) {
        if (this.networkList == null) {
            this.networkList = new ArrayList<>();
        }
        this.networkList.add(networkListItem);
        return this;
    }

    public Incident withNetworkList(Consumer<List<CreateIncidentNetworkList>> networkListSetter) {
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
    public List<CreateIncidentNetworkList> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<CreateIncidentNetworkList> networkList) {
        this.networkList = networkList;
    }

    public Incident withResourceList(List<CreateIncidentResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public Incident addResourceListItem(CreateIncidentResourceList resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public Incident withResourceList(Consumer<List<CreateIncidentResourceList>> resourceListSetter) {
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
    public List<CreateIncidentResourceList> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<CreateIncidentResourceList> resourceList) {
        this.resourceList = resourceList;
    }

    public Incident withRemediation(ShowAlertRspRemediation remediation) {
        this.remediation = remediation;
        return this;
    }

    public Incident withRemediation(Consumer<ShowAlertRspRemediation> remediationSetter) {
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

    public Incident withVerificationState(String verificationState) {
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

    public Incident withHandleStatus(String handleStatus) {
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

    public Incident withSla(Integer sla) {
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

    public Incident withUpdateTime(String updateTime) {
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

    public Incident withCloseTime(String closeTime) {
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

    public Incident withChopPhase(String chopPhase) {
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

    public Incident withIpdrrPhase(String ipdrrPhase) {
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

    public Incident withPpdrPhase(String ppdrPhase) {
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

    public Incident withSimulation(String simulation) {
        this.simulation = simulation;
        return this;
    }

    /**
     * 是否为调试事件.
     * @return simulation
     */
    public String getSimulation() {
        return simulation;
    }

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    public Incident withActor(String actor) {
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

    public Incident withOwner(String owner) {
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

    public Incident withCteator(String cteator) {
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

    public Incident withCloseReason(String closeReason) {
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

    public Incident withCloseComment(String closeComment) {
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

    public Incident withMalware(CreateIncidentMalware malware) {
        this.malware = malware;
        return this;
    }

    public Incident withMalware(Consumer<CreateIncidentMalware> malwareSetter) {
        if (this.malware == null) {
            this.malware = new CreateIncidentMalware();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public CreateIncidentMalware getMalware() {
        return malware;
    }

    public void setMalware(CreateIncidentMalware malware) {
        this.malware = malware;
    }

    public Incident withSystemInfo(Object systemInfo) {
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

    public Incident withProcess(List<CreateIncidentProcess> process) {
        this.process = process;
        return this;
    }

    public Incident addProcessItem(CreateIncidentProcess processItem) {
        if (this.process == null) {
            this.process = new ArrayList<>();
        }
        this.process.add(processItem);
        return this;
    }

    public Incident withProcess(Consumer<List<CreateIncidentProcess>> processSetter) {
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
    public List<CreateIncidentProcess> getProcess() {
        return process;
    }

    public void setProcess(List<CreateIncidentProcess> process) {
        this.process = process;
    }

    public Incident withUserInfo(List<CreateIncidentUserInfo> userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public Incident addUserInfoItem(CreateIncidentUserInfo userInfoItem) {
        if (this.userInfo == null) {
            this.userInfo = new ArrayList<>();
        }
        this.userInfo.add(userInfoItem);
        return this;
    }

    public Incident withUserInfo(Consumer<List<CreateIncidentUserInfo>> userInfoSetter) {
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
    public List<CreateIncidentUserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<CreateIncidentUserInfo> userInfo) {
        this.userInfo = userInfo;
    }

    public Incident withFileInfo(List<ShowAlertRspFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    public Incident addFileInfoItem(ShowAlertRspFileInfo fileInfoItem) {
        if (this.fileInfo == null) {
            this.fileInfo = new ArrayList<>();
        }
        this.fileInfo.add(fileInfoItem);
        return this;
    }

    public Incident withFileInfo(Consumer<List<ShowAlertRspFileInfo>> fileInfoSetter) {
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

    public Incident withSystemIncidentTable(Object systemIncidentTable) {
        this.systemIncidentTable = systemIncidentTable;
        return this;
    }

    /**
     * 系统信息
     * @return systemIncidentTable
     */
    public Object getSystemIncidentTable() {
        return systemIncidentTable;
    }

    public void setSystemIncidentTable(Object systemIncidentTable) {
        this.systemIncidentTable = systemIncidentTable;
    }

    public Incident withId(String id) {
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

    public Incident withWorkspaceId(String workspaceId) {
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
        Incident incident = (Incident) o;
        return Objects.equals(this.version, incident.version) && Objects.equals(this.environment, incident.environment)
            && Objects.equals(this.datasource, incident.datasource)
            && Objects.equals(this.firstObservedTime, incident.firstObservedTime)
            && Objects.equals(this.lastObservedTime, incident.lastObservedTime)
            && Objects.equals(this.createTime, incident.createTime)
            && Objects.equals(this.arriveTime, incident.arriveTime) && Objects.equals(this.title, incident.title)
            && Objects.equals(this.description, incident.description)
            && Objects.equals(this.sourceUrl, incident.sourceUrl) && Objects.equals(this.count, incident.count)
            && Objects.equals(this.confidence, incident.confidence)
            && Objects.equals(this.serverity, incident.serverity)
            && Objects.equals(this.criticality, incident.criticality)
            && Objects.equals(this.incidentType, incident.incidentType)
            && Objects.equals(this.networkList, incident.networkList)
            && Objects.equals(this.resourceList, incident.resourceList)
            && Objects.equals(this.remediation, incident.remediation)
            && Objects.equals(this.verificationState, incident.verificationState)
            && Objects.equals(this.handleStatus, incident.handleStatus) && Objects.equals(this.sla, incident.sla)
            && Objects.equals(this.updateTime, incident.updateTime)
            && Objects.equals(this.closeTime, incident.closeTime) && Objects.equals(this.chopPhase, incident.chopPhase)
            && Objects.equals(this.ipdrrPhase, incident.ipdrrPhase)
            && Objects.equals(this.ppdrPhase, incident.ppdrPhase)
            && Objects.equals(this.simulation, incident.simulation) && Objects.equals(this.actor, incident.actor)
            && Objects.equals(this.owner, incident.owner) && Objects.equals(this.cteator, incident.cteator)
            && Objects.equals(this.closeReason, incident.closeReason)
            && Objects.equals(this.closeComment, incident.closeComment)
            && Objects.equals(this.malware, incident.malware) && Objects.equals(this.systemInfo, incident.systemInfo)
            && Objects.equals(this.process, incident.process) && Objects.equals(this.userInfo, incident.userInfo)
            && Objects.equals(this.fileInfo, incident.fileInfo)
            && Objects.equals(this.systemIncidentTable, incident.systemIncidentTable)
            && Objects.equals(this.id, incident.id) && Objects.equals(this.workspaceId, incident.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            environment,
            datasource,
            firstObservedTime,
            lastObservedTime,
            createTime,
            arriveTime,
            title,
            description,
            sourceUrl,
            count,
            confidence,
            serverity,
            criticality,
            incidentType,
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
            systemIncidentTable,
            id,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Incident {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    firstObservedTime: ").append(toIndentedString(firstObservedTime)).append("\n");
        sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    serverity: ").append(toIndentedString(serverity)).append("\n");
        sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
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
        sb.append("    systemIncidentTable: ").append(toIndentedString(systemIncidentTable)).append("\n");
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

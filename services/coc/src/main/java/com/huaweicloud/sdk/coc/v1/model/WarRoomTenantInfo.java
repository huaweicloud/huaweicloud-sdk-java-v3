package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WarRoom信息
 */
public class WarRoomTenantInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin")

    private String admin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_member")

    private List<String> recoverMember = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_leader")

    private List<String> recoverLeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident")

    private WarRoomIncident incident;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<WarRoomTenantInfoRegions> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_num")

    private String changeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_time")

    private Long recoverTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_cause")

    private String faultCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_report_time")

    private Long firstReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_notification_time")

    private Long recoveryNotificationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_impact")

    private String faultImpact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "circular_level")

    private String circularLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_status")

    private WarRoomEnumeration warRoomStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impacted_application")

    private List<WarRoomTenantInfoImpactedApplication> impactedApplication = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_duration")

    private Long processingDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoration_duration")

    private Long restorationDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_num")

    private String warRoomNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public WarRoomTenantInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WarRoomTenantInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WarRoomTenantInfo withAdmin(String admin) {
        this.admin = admin;
        return this;
    }

    /**
     * WarRoom管理员
     * @return admin
     */
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public WarRoomTenantInfo withRecoverMember(List<String> recoverMember) {
        this.recoverMember = recoverMember;
        return this;
    }

    public WarRoomTenantInfo addRecoverMemberItem(String recoverMemberItem) {
        if (this.recoverMember == null) {
            this.recoverMember = new ArrayList<>();
        }
        this.recoverMember.add(recoverMemberItem);
        return this;
    }

    public WarRoomTenantInfo withRecoverMember(Consumer<List<String>> recoverMemberSetter) {
        if (this.recoverMember == null) {
            this.recoverMember = new ArrayList<>();
        }
        recoverMemberSetter.accept(this.recoverMember);
        return this;
    }

    /**
     * 恢复成员
     * @return recoverMember
     */
    public List<String> getRecoverMember() {
        return recoverMember;
    }

    public void setRecoverMember(List<String> recoverMember) {
        this.recoverMember = recoverMember;
    }

    public WarRoomTenantInfo withRecoverLeader(List<String> recoverLeader) {
        this.recoverLeader = recoverLeader;
        return this;
    }

    public WarRoomTenantInfo addRecoverLeaderItem(String recoverLeaderItem) {
        if (this.recoverLeader == null) {
            this.recoverLeader = new ArrayList<>();
        }
        this.recoverLeader.add(recoverLeaderItem);
        return this;
    }

    public WarRoomTenantInfo withRecoverLeader(Consumer<List<String>> recoverLeaderSetter) {
        if (this.recoverLeader == null) {
            this.recoverLeader = new ArrayList<>();
        }
        recoverLeaderSetter.accept(this.recoverLeader);
        return this;
    }

    /**
     * 主恢复责任人
     * @return recoverLeader
     */
    public List<String> getRecoverLeader() {
        return recoverLeader;
    }

    public void setRecoverLeader(List<String> recoverLeader) {
        this.recoverLeader = recoverLeader;
    }

    public WarRoomTenantInfo withIncident(WarRoomIncident incident) {
        this.incident = incident;
        return this;
    }

    public WarRoomTenantInfo withIncident(Consumer<WarRoomIncident> incidentSetter) {
        if (this.incident == null) {
            this.incident = new WarRoomIncident();
            incidentSetter.accept(this.incident);
        }

        return this;
    }

    /**
     * Get incident
     * @return incident
     */
    public WarRoomIncident getIncident() {
        return incident;
    }

    public void setIncident(WarRoomIncident incident) {
        this.incident = incident;
    }

    public WarRoomTenantInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 事件来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public WarRoomTenantInfo withRegions(List<WarRoomTenantInfoRegions> regions) {
        this.regions = regions;
        return this;
    }

    public WarRoomTenantInfo addRegionsItem(WarRoomTenantInfoRegions regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public WarRoomTenantInfo withRegions(Consumer<List<WarRoomTenantInfoRegions>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 影响的Region
     * @return regions
     */
    public List<WarRoomTenantInfoRegions> getRegions() {
        return regions;
    }

    public void setRegions(List<WarRoomTenantInfoRegions> regions) {
        this.regions = regions;
    }

    public WarRoomTenantInfo withChangeNum(String changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    /**
     * 变更单号
     * @return changeNum
     */
    public String getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(String changeNum) {
        this.changeNum = changeNum;
    }

    public WarRoomTenantInfo withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * 开始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public WarRoomTenantInfo withRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }

    /**
     * 故障恢复时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recoverTime
     */
    public Long getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
    }

    public WarRoomTenantInfo withFaultCause(String faultCause) {
        this.faultCause = faultCause;
        return this;
    }

    /**
     * 故障原因
     * @return faultCause
     */
    public String getFaultCause() {
        return faultCause;
    }

    public void setFaultCause(String faultCause) {
        this.faultCause = faultCause;
    }

    public WarRoomTenantInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 添加时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public WarRoomTenantInfo withFirstReportTime(Long firstReportTime) {
        this.firstReportTime = firstReportTime;
        return this;
    }

    /**
     * 首次通报时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstReportTime
     */
    public Long getFirstReportTime() {
        return firstReportTime;
    }

    public void setFirstReportTime(Long firstReportTime) {
        this.firstReportTime = firstReportTime;
    }

    public WarRoomTenantInfo withRecoveryNotificationTime(Long recoveryNotificationTime) {
        this.recoveryNotificationTime = recoveryNotificationTime;
        return this;
    }

    /**
     * 恢复通报时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recoveryNotificationTime
     */
    public Long getRecoveryNotificationTime() {
        return recoveryNotificationTime;
    }

    public void setRecoveryNotificationTime(Long recoveryNotificationTime) {
        this.recoveryNotificationTime = recoveryNotificationTime;
    }

    public WarRoomTenantInfo withFaultImpact(String faultImpact) {
        this.faultImpact = faultImpact;
        return this;
    }

    /**
     * 故障影响
     * @return faultImpact
     */
    public String getFaultImpact() {
        return faultImpact;
    }

    public void setFaultImpact(String faultImpact) {
        this.faultImpact = faultImpact;
    }

    public WarRoomTenantInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * WarRoom描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WarRoomTenantInfo withCircularLevel(String circularLevel) {
        this.circularLevel = circularLevel;
        return this;
    }

    /**
     * 通报级别 租户区同事件级别
     * @return circularLevel
     */
    public String getCircularLevel() {
        return circularLevel;
    }

    public void setCircularLevel(String circularLevel) {
        this.circularLevel = circularLevel;
    }

    public WarRoomTenantInfo withWarRoomStatus(WarRoomEnumeration warRoomStatus) {
        this.warRoomStatus = warRoomStatus;
        return this;
    }

    public WarRoomTenantInfo withWarRoomStatus(Consumer<WarRoomEnumeration> warRoomStatusSetter) {
        if (this.warRoomStatus == null) {
            this.warRoomStatus = new WarRoomEnumeration();
            warRoomStatusSetter.accept(this.warRoomStatus);
        }

        return this;
    }

    /**
     * Get warRoomStatus
     * @return warRoomStatus
     */
    public WarRoomEnumeration getWarRoomStatus() {
        return warRoomStatus;
    }

    public void setWarRoomStatus(WarRoomEnumeration warRoomStatus) {
        this.warRoomStatus = warRoomStatus;
    }

    public WarRoomTenantInfo withImpactedApplication(List<WarRoomTenantInfoImpactedApplication> impactedApplication) {
        this.impactedApplication = impactedApplication;
        return this;
    }

    public WarRoomTenantInfo addImpactedApplicationItem(WarRoomTenantInfoImpactedApplication impactedApplicationItem) {
        if (this.impactedApplication == null) {
            this.impactedApplication = new ArrayList<>();
        }
        this.impactedApplication.add(impactedApplicationItem);
        return this;
    }

    public WarRoomTenantInfo withImpactedApplication(
        Consumer<List<WarRoomTenantInfoImpactedApplication>> impactedApplicationSetter) {
        if (this.impactedApplication == null) {
            this.impactedApplication = new ArrayList<>();
        }
        impactedApplicationSetter.accept(this.impactedApplication);
        return this;
    }

    /**
     * 影响应用
     * @return impactedApplication
     */
    public List<WarRoomTenantInfoImpactedApplication> getImpactedApplication() {
        return impactedApplication;
    }

    public void setImpactedApplication(List<WarRoomTenantInfoImpactedApplication> impactedApplication) {
        this.impactedApplication = impactedApplication;
    }

    public WarRoomTenantInfo withProcessingDuration(Long processingDuration) {
        this.processingDuration = processingDuration;
        return this;
    }

    /**
     * 处理时长(分钟)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return processingDuration
     */
    public Long getProcessingDuration() {
        return processingDuration;
    }

    public void setProcessingDuration(Long processingDuration) {
        this.processingDuration = processingDuration;
    }

    public WarRoomTenantInfo withRestorationDuration(Long restorationDuration) {
        this.restorationDuration = restorationDuration;
        return this;
    }

    /**
     * 恢复时长(分钟)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return restorationDuration
     */
    public Long getRestorationDuration() {
        return restorationDuration;
    }

    public void setRestorationDuration(Long restorationDuration) {
        this.restorationDuration = restorationDuration;
    }

    public WarRoomTenantInfo withWarRoomNum(String warRoomNum) {
        this.warRoomNum = warRoomNum;
        return this;
    }

    /**
     * WarRoom单号
     * @return warRoomNum
     */
    public String getWarRoomNum() {
        return warRoomNum;
    }

    public void setWarRoomNum(String warRoomNum) {
        this.warRoomNum = warRoomNum;
    }

    public WarRoomTenantInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WarRoomTenantInfo that = (WarRoomTenantInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.admin, that.admin) && Objects.equals(this.recoverMember, that.recoverMember)
            && Objects.equals(this.recoverLeader, that.recoverLeader) && Objects.equals(this.incident, that.incident)
            && Objects.equals(this.source, that.source) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.changeNum, that.changeNum) && Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.recoverTime, that.recoverTime) && Objects.equals(this.faultCause, that.faultCause)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.firstReportTime, that.firstReportTime)
            && Objects.equals(this.recoveryNotificationTime, that.recoveryNotificationTime)
            && Objects.equals(this.faultImpact, that.faultImpact) && Objects.equals(this.description, that.description)
            && Objects.equals(this.circularLevel, that.circularLevel)
            && Objects.equals(this.warRoomStatus, that.warRoomStatus)
            && Objects.equals(this.impactedApplication, that.impactedApplication)
            && Objects.equals(this.processingDuration, that.processingDuration)
            && Objects.equals(this.restorationDuration, that.restorationDuration)
            && Objects.equals(this.warRoomNum, that.warRoomNum)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            admin,
            recoverMember,
            recoverLeader,
            incident,
            source,
            regions,
            changeNum,
            occurTime,
            recoverTime,
            faultCause,
            createTime,
            firstReportTime,
            recoveryNotificationTime,
            faultImpact,
            description,
            circularLevel,
            warRoomStatus,
            impactedApplication,
            processingDuration,
            restorationDuration,
            warRoomNum,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarRoomTenantInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    recoverMember: ").append(toIndentedString(recoverMember)).append("\n");
        sb.append("    recoverLeader: ").append(toIndentedString(recoverLeader)).append("\n");
        sb.append("    incident: ").append(toIndentedString(incident)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    changeNum: ").append(toIndentedString(changeNum)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    recoverTime: ").append(toIndentedString(recoverTime)).append("\n");
        sb.append("    faultCause: ").append(toIndentedString(faultCause)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    firstReportTime: ").append(toIndentedString(firstReportTime)).append("\n");
        sb.append("    recoveryNotificationTime: ").append(toIndentedString(recoveryNotificationTime)).append("\n");
        sb.append("    faultImpact: ").append(toIndentedString(faultImpact)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    circularLevel: ").append(toIndentedString(circularLevel)).append("\n");
        sb.append("    warRoomStatus: ").append(toIndentedString(warRoomStatus)).append("\n");
        sb.append("    impactedApplication: ").append(toIndentedString(impactedApplication)).append("\n");
        sb.append("    processingDuration: ").append(toIndentedString(processingDuration)).append("\n");
        sb.append("    restorationDuration: ").append(toIndentedString(restorationDuration)).append("\n");
        sb.append("    warRoomNum: ").append(toIndentedString(warRoomNum)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

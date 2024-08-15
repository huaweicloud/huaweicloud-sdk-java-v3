package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentTicketInfoResponseData
 */
public class IncidentTicketInfoResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_num")

    private String incidentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private List<String> region = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private List<String> enterpriseProject = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service")

    private List<String> currentCloudService = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_level")

    private String incidentLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private Boolean isServiceInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private String incidentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_title")

    private String incidentTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_description")

    private String incidentDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_source")

    private String incidentSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_assignee")

    private List<String> incidentAssignee = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_scene")

    private String assigneeScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_role")

    private String assigneeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warroom_id")

    private String warroomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_time")

    private Long handleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<TicketInfoEnumData> enumDataList = null;

    public IncidentTicketInfoResponseData withIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
        return this;
    }

    /**
     * 事件单号
     * @return incidentNum
     */
    public String getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
    }

    public IncidentTicketInfoResponseData withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    public IncidentTicketInfoResponseData addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public IncidentTicketInfoResponseData withRegion(Consumer<List<String>> regionSetter) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        regionSetter.accept(this.region);
        return this;
    }

    /**
     * 区域Code，如果自动拉起WarRoom则为必填，现在只支持1个
     * @return region
     */
    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    public IncidentTicketInfoResponseData withEnterpriseProject(List<String> enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    public IncidentTicketInfoResponseData addEnterpriseProjectItem(String enterpriseProjectItem) {
        if (this.enterpriseProject == null) {
            this.enterpriseProject = new ArrayList<>();
        }
        this.enterpriseProject.add(enterpriseProjectItem);
        return this;
    }

    public IncidentTicketInfoResponseData withEnterpriseProject(Consumer<List<String>> enterpriseProjectSetter) {
        if (this.enterpriseProject == null) {
            this.enterpriseProject = new ArrayList<>();
        }
        enterpriseProjectSetter.accept(this.enterpriseProject);
        return this;
    }

    /**
     * 企业项目ID，现在只支持1个
     * @return enterpriseProject
     */
    public List<String> getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(List<String> enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public IncidentTicketInfoResponseData withCurrentCloudService(List<String> currentCloudService) {
        this.currentCloudService = currentCloudService;
        return this;
    }

    public IncidentTicketInfoResponseData addCurrentCloudServiceItem(String currentCloudServiceItem) {
        if (this.currentCloudService == null) {
            this.currentCloudService = new ArrayList<>();
        }
        this.currentCloudService.add(currentCloudServiceItem);
        return this;
    }

    public IncidentTicketInfoResponseData withCurrentCloudService(Consumer<List<String>> currentCloudServiceSetter) {
        if (this.currentCloudService == null) {
            this.currentCloudService = new ArrayList<>();
        }
        currentCloudServiceSetter.accept(this.currentCloudService);
        return this;
    }

    /**
     * 归属应用ID，现在只支持1个
     * @return currentCloudService
     */
    public List<String> getCurrentCloudService() {
        return currentCloudService;
    }

    public void setCurrentCloudService(List<String> currentCloudService) {
        this.currentCloudService = currentCloudService;
    }

    public IncidentTicketInfoResponseData withIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }

    /**
     * 事件级别 参考：枚举 事件级别incident_level
     * @return incidentLevel
     */
    public String getIncidentLevel() {
        return incidentLevel;
    }

    public void setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
    }

    public IncidentTicketInfoResponseData withIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 业务是否中断，取值：true/false
     * @return isServiceInterrupt
     */
    public Boolean getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public IncidentTicketInfoResponseData withIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * 事件类别 参考：枚举 事件类别incident_type
     * @return incidentType
     */
    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public IncidentTicketInfoResponseData withIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
        return this;
    }

    /**
     * 事件标题，最大长度：200
     * @return incidentTitle
     */
    public String getIncidentTitle() {
        return incidentTitle;
    }

    public void setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
    }

    public IncidentTicketInfoResponseData withIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
        return this;
    }

    /**
     * 事件描述，最大长度：600
     * @return incidentDescription
     */
    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public IncidentTicketInfoResponseData withIncidentSource(String incidentSource) {
        this.incidentSource = incidentSource;
        return this;
    }

    /**
     * 单据来源 参考：枚举 事件来源incident_source
     * @return incidentSource
     */
    public String getIncidentSource() {
        return incidentSource;
    }

    public void setIncidentSource(String incidentSource) {
        this.incidentSource = incidentSource;
    }

    public IncidentTicketInfoResponseData withIncidentAssignee(List<String> incidentAssignee) {
        this.incidentAssignee = incidentAssignee;
        return this;
    }

    public IncidentTicketInfoResponseData addIncidentAssigneeItem(String incidentAssigneeItem) {
        if (this.incidentAssignee == null) {
            this.incidentAssignee = new ArrayList<>();
        }
        this.incidentAssignee.add(incidentAssigneeItem);
        return this;
    }

    public IncidentTicketInfoResponseData withIncidentAssignee(Consumer<List<String>> incidentAssigneeSetter) {
        if (this.incidentAssignee == null) {
            this.incidentAssignee = new ArrayList<>();
        }
        incidentAssigneeSetter.accept(this.incidentAssignee);
        return this;
    }

    /**
     * 责任人，排班场景和排班角色不能同时为空，现在只支持1个
     * @return incidentAssignee
     */
    public List<String> getIncidentAssignee() {
        return incidentAssignee;
    }

    public void setIncidentAssignee(List<String> incidentAssignee) {
        this.incidentAssignee = incidentAssignee;
    }

    public IncidentTicketInfoResponseData withAssigneeScene(String assigneeScene) {
        this.assigneeScene = assigneeScene;
        return this;
    }

    /**
     * 排班场景，责任人和排班角色不能同时为空
     * @return assigneeScene
     */
    public String getAssigneeScene() {
        return assigneeScene;
    }

    public void setAssigneeScene(String assigneeScene) {
        this.assigneeScene = assigneeScene;
    }

    public IncidentTicketInfoResponseData withAssigneeRole(String assigneeRole) {
        this.assigneeRole = assigneeRole;
        return this;
    }

    /**
     * 排班角色，排班场景和责任人不能同时为空
     * @return assigneeRole
     */
    public String getAssigneeRole() {
        return assigneeRole;
    }

    public void setAssigneeRole(String assigneeRole) {
        this.assigneeRole = assigneeRole;
    }

    public IncidentTicketInfoResponseData withWarroomId(String warroomId) {
        this.warroomId = warroomId;
        return this;
    }

    /**
     * warroom_id
     * @return warroomId
     */
    public String getWarroomId() {
        return warroomId;
    }

    public void setWarroomId(String warroomId) {
        this.warroomId = warroomId;
    }

    public IncidentTicketInfoResponseData withHandleTime(Long handleTime) {
        this.handleTime = handleTime;
        return this;
    }

    /**
     * 最后一次提交解决方案时间戳
     * minimum: 1
     * maximum: 9999999999
     * @return handleTime
     */
    public Long getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }

    public IncidentTicketInfoResponseData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态KEY
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IncidentTicketInfoResponseData withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创单时间戳
     * minimum: 0
     * maximum: 999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public IncidentTicketInfoResponseData withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创单人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public IncidentTicketInfoResponseData withEnumDataList(List<TicketInfoEnumData> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public IncidentTicketInfoResponseData addEnumDataListItem(TicketInfoEnumData enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public IncidentTicketInfoResponseData withEnumDataList(Consumer<List<TicketInfoEnumData>> enumDataListSetter) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        enumDataListSetter.accept(this.enumDataList);
        return this;
    }

    /**
     * 枚举列表
     * @return enumDataList
     */
    public List<TicketInfoEnumData> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<TicketInfoEnumData> enumDataList) {
        this.enumDataList = enumDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentTicketInfoResponseData that = (IncidentTicketInfoResponseData) obj;
        return Objects.equals(this.incidentNum, that.incidentNum) && Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.currentCloudService, that.currentCloudService)
            && Objects.equals(this.incidentLevel, that.incidentLevel)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.incidentType, that.incidentType)
            && Objects.equals(this.incidentTitle, that.incidentTitle)
            && Objects.equals(this.incidentDescription, that.incidentDescription)
            && Objects.equals(this.incidentSource, that.incidentSource)
            && Objects.equals(this.incidentAssignee, that.incidentAssignee)
            && Objects.equals(this.assigneeScene, that.assigneeScene)
            && Objects.equals(this.assigneeRole, that.assigneeRole) && Objects.equals(this.warroomId, that.warroomId)
            && Objects.equals(this.handleTime, that.handleTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.enumDataList, that.enumDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentNum,
            region,
            enterpriseProject,
            currentCloudService,
            incidentLevel,
            isServiceInterrupt,
            incidentType,
            incidentTitle,
            incidentDescription,
            incidentSource,
            incidentAssignee,
            assigneeScene,
            assigneeRole,
            warroomId,
            handleTime,
            status,
            createTime,
            creator,
            enumDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentTicketInfoResponseData {\n");
        sb.append("    incidentNum: ").append(toIndentedString(incidentNum)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    currentCloudService: ").append(toIndentedString(currentCloudService)).append("\n");
        sb.append("    incidentLevel: ").append(toIndentedString(incidentLevel)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
        sb.append("    incidentTitle: ").append(toIndentedString(incidentTitle)).append("\n");
        sb.append("    incidentDescription: ").append(toIndentedString(incidentDescription)).append("\n");
        sb.append("    incidentSource: ").append(toIndentedString(incidentSource)).append("\n");
        sb.append("    incidentAssignee: ").append(toIndentedString(incidentAssignee)).append("\n");
        sb.append("    assigneeScene: ").append(toIndentedString(assigneeScene)).append("\n");
        sb.append("    assigneeRole: ").append(toIndentedString(assigneeRole)).append("\n");
        sb.append("    warroomId: ").append(toIndentedString(warroomId)).append("\n");
        sb.append("    handleTime: ").append(toIndentedString(handleTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    enumDataList: ").append(toIndentedString(enumDataList)).append("\n");
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

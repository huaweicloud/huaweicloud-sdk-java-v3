package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateWarRoomRequestBody
 */
public class CreateWarRoomRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_name")

    private String warRoomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code_list")

    private List<String> regionCodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id_list")

    private List<String> applicationIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_number")

    private String incidentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_group")

    private List<ScheduleGroupInfo> scheduleGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participant")

    private List<String> participant = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_admin")

    private String warRoomAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_names")

    private List<String> applicationNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_names")

    private List<String> regionNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private String notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_modes")

    private List<NotificationMode> notificationModes = null;

    public CreateWarRoomRequestBody withWarRoomName(String warRoomName) {
        this.warRoomName = warRoomName;
        return this;
    }

    /**
     * WarRoom名称
     * @return warRoomName
     */
    public String getWarRoomName() {
        return warRoomName;
    }

    public void setWarRoomName(String warRoomName) {
        this.warRoomName = warRoomName;
    }

    public CreateWarRoomRequestBody withDescription(String description) {
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

    public CreateWarRoomRequestBody withRegionCodeList(List<String> regionCodeList) {
        this.regionCodeList = regionCodeList;
        return this;
    }

    public CreateWarRoomRequestBody addRegionCodeListItem(String regionCodeListItem) {
        if (this.regionCodeList == null) {
            this.regionCodeList = new ArrayList<>();
        }
        this.regionCodeList.add(regionCodeListItem);
        return this;
    }

    public CreateWarRoomRequestBody withRegionCodeList(Consumer<List<String>> regionCodeListSetter) {
        if (this.regionCodeList == null) {
            this.regionCodeList = new ArrayList<>();
        }
        regionCodeListSetter.accept(this.regionCodeList);
        return this;
    }

    /**
     * 区域id
     * @return regionCodeList
     */
    public List<String> getRegionCodeList() {
        return regionCodeList;
    }

    public void setRegionCodeList(List<String> regionCodeList) {
        this.regionCodeList = regionCodeList;
    }

    public CreateWarRoomRequestBody withApplicationIdList(List<String> applicationIdList) {
        this.applicationIdList = applicationIdList;
        return this;
    }

    public CreateWarRoomRequestBody addApplicationIdListItem(String applicationIdListItem) {
        if (this.applicationIdList == null) {
            this.applicationIdList = new ArrayList<>();
        }
        this.applicationIdList.add(applicationIdListItem);
        return this;
    }

    public CreateWarRoomRequestBody withApplicationIdList(Consumer<List<String>> applicationIdListSetter) {
        if (this.applicationIdList == null) {
            this.applicationIdList = new ArrayList<>();
        }
        applicationIdListSetter.accept(this.applicationIdList);
        return this;
    }

    /**
     * 影响应用id
     * @return applicationIdList
     */
    public List<String> getApplicationIdList() {
        return applicationIdList;
    }

    public void setApplicationIdList(List<String> applicationIdList) {
        this.applicationIdList = applicationIdList;
    }

    public CreateWarRoomRequestBody withIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
        return this;
    }

    /**
     * 事件单号
     * @return incidentNumber
     */
    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public CreateWarRoomRequestBody withScheduleGroup(List<ScheduleGroupInfo> scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
        return this;
    }

    public CreateWarRoomRequestBody addScheduleGroupItem(ScheduleGroupInfo scheduleGroupItem) {
        if (this.scheduleGroup == null) {
            this.scheduleGroup = new ArrayList<>();
        }
        this.scheduleGroup.add(scheduleGroupItem);
        return this;
    }

    public CreateWarRoomRequestBody withScheduleGroup(Consumer<List<ScheduleGroupInfo>> scheduleGroupSetter) {
        if (this.scheduleGroup == null) {
            this.scheduleGroup = new ArrayList<>();
        }
        scheduleGroupSetter.accept(this.scheduleGroup);
        return this;
    }

    /**
     * 排班分组
     * @return scheduleGroup
     */
    public List<ScheduleGroupInfo> getScheduleGroup() {
        return scheduleGroup;
    }

    public void setScheduleGroup(List<ScheduleGroupInfo> scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
    }

    public CreateWarRoomRequestBody withParticipant(List<String> participant) {
        this.participant = participant;
        return this;
    }

    public CreateWarRoomRequestBody addParticipantItem(String participantItem) {
        if (this.participant == null) {
            this.participant = new ArrayList<>();
        }
        this.participant.add(participantItem);
        return this;
    }

    public CreateWarRoomRequestBody withParticipant(Consumer<List<String>> participantSetter) {
        if (this.participant == null) {
            this.participant = new ArrayList<>();
        }
        participantSetter.accept(this.participant);
        return this;
    }

    /**
     * 参与者
     * @return participant
     */
    public List<String> getParticipant() {
        return participant;
    }

    public void setParticipant(List<String> participant) {
        this.participant = participant;
    }

    public CreateWarRoomRequestBody withWarRoomAdmin(String warRoomAdmin) {
        this.warRoomAdmin = warRoomAdmin;
        return this;
    }

    /**
     * WarRoom管理员
     * @return warRoomAdmin
     */
    public String getWarRoomAdmin() {
        return warRoomAdmin;
    }

    public void setWarRoomAdmin(String warRoomAdmin) {
        this.warRoomAdmin = warRoomAdmin;
    }

    public CreateWarRoomRequestBody withApplicationNames(List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }

    public CreateWarRoomRequestBody addApplicationNamesItem(String applicationNamesItem) {
        if (this.applicationNames == null) {
            this.applicationNames = new ArrayList<>();
        }
        this.applicationNames.add(applicationNamesItem);
        return this;
    }

    public CreateWarRoomRequestBody withApplicationNames(Consumer<List<String>> applicationNamesSetter) {
        if (this.applicationNames == null) {
            this.applicationNames = new ArrayList<>();
        }
        applicationNamesSetter.accept(this.applicationNames);
        return this;
    }

    /**
     * 应用名称列表
     * @return applicationNames
     */
    public List<String> getApplicationNames() {
        return applicationNames;
    }

    public void setApplicationNames(List<String> applicationNames) {
        this.applicationNames = applicationNames;
    }

    public CreateWarRoomRequestBody withRegionNames(List<String> regionNames) {
        this.regionNames = regionNames;
        return this;
    }

    public CreateWarRoomRequestBody addRegionNamesItem(String regionNamesItem) {
        if (this.regionNames == null) {
            this.regionNames = new ArrayList<>();
        }
        this.regionNames.add(regionNamesItem);
        return this;
    }

    public CreateWarRoomRequestBody withRegionNames(Consumer<List<String>> regionNamesSetter) {
        if (this.regionNames == null) {
            this.regionNames = new ArrayList<>();
        }
        regionNamesSetter.accept(this.regionNames);
        return this;
    }

    /**
     * region名称列表
     * @return regionNames
     */
    public List<String> getRegionNames() {
        return regionNames;
    }

    public void setRegionNames(List<String> regionNames) {
        this.regionNames = regionNames;
    }

    public CreateWarRoomRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateWarRoomRequestBody withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * 创建群组方式
     * @return notificationType
     */
    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public CreateWarRoomRequestBody withNotificationModes(List<NotificationMode> notificationModes) {
        this.notificationModes = notificationModes;
        return this;
    }

    public CreateWarRoomRequestBody addNotificationModesItem(NotificationMode notificationModesItem) {
        if (this.notificationModes == null) {
            this.notificationModes = new ArrayList<>();
        }
        this.notificationModes.add(notificationModesItem);
        return this;
    }

    public CreateWarRoomRequestBody withNotificationModes(Consumer<List<NotificationMode>> notificationModesSetter) {
        if (this.notificationModes == null) {
            this.notificationModes = new ArrayList<>();
        }
        notificationModesSetter.accept(this.notificationModes);
        return this;
    }

    /**
     * 发送通知的方式，支持多个通知方式。
     * @return notificationModes
     */
    public List<NotificationMode> getNotificationModes() {
        return notificationModes;
    }

    public void setNotificationModes(List<NotificationMode> notificationModes) {
        this.notificationModes = notificationModes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWarRoomRequestBody that = (CreateWarRoomRequestBody) obj;
        return Objects.equals(this.warRoomName, that.warRoomName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.regionCodeList, that.regionCodeList)
            && Objects.equals(this.applicationIdList, that.applicationIdList)
            && Objects.equals(this.incidentNumber, that.incidentNumber)
            && Objects.equals(this.scheduleGroup, that.scheduleGroup)
            && Objects.equals(this.participant, that.participant)
            && Objects.equals(this.warRoomAdmin, that.warRoomAdmin)
            && Objects.equals(this.applicationNames, that.applicationNames)
            && Objects.equals(this.regionNames, that.regionNames)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.notificationType, that.notificationType)
            && Objects.equals(this.notificationModes, that.notificationModes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warRoomName,
            description,
            regionCodeList,
            applicationIdList,
            incidentNumber,
            scheduleGroup,
            participant,
            warRoomAdmin,
            applicationNames,
            regionNames,
            enterpriseProjectId,
            notificationType,
            notificationModes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWarRoomRequestBody {\n");
        sb.append("    warRoomName: ").append(toIndentedString(warRoomName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regionCodeList: ").append(toIndentedString(regionCodeList)).append("\n");
        sb.append("    applicationIdList: ").append(toIndentedString(applicationIdList)).append("\n");
        sb.append("    incidentNumber: ").append(toIndentedString(incidentNumber)).append("\n");
        sb.append("    scheduleGroup: ").append(toIndentedString(scheduleGroup)).append("\n");
        sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
        sb.append("    warRoomAdmin: ").append(toIndentedString(warRoomAdmin)).append("\n");
        sb.append("    applicationNames: ").append(toIndentedString(applicationNames)).append("\n");
        sb.append("    regionNames: ").append(toIndentedString(regionNames)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    notificationModes: ").append(toIndentedString(notificationModes)).append("\n");
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

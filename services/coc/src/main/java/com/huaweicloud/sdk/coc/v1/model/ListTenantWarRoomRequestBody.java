package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询WarRoom信息请求
 */
public class ListTenantWarRoomRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_users")

    private List<String> currentUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_nums")

    private List<String> warRoomNums = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_num")

    private String incidentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code_list")

    private List<String> regionCodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_levels")

    private List<String> incidentLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impacted_application_ids")

    private List<String> impactedApplicationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin")

    private List<String> admin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggered_start_time")

    private Long triggeredStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggered_end_time")

    private Long triggeredEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_start_time")

    private Long occurStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_end_time")

    private Long occurEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_start_time")

    private Long recoverStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_end_time")

    private Long recoverEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_level")

    private List<String> notificationLevel = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_ids")

    private List<String> enterpriseProjectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_num")

    private String warRoomNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_flag")

    private Boolean statisticFlag;

    public ListTenantWarRoomRequestBody withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListTenantWarRoomRequestBody withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询数量 最小值0 最大值1000
     * minimum: 0
     * maximum: 9223372036854775807
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListTenantWarRoomRequestBody withCurrentUsers(List<String> currentUsers) {
        this.currentUsers = currentUsers;
        return this;
    }

    public ListTenantWarRoomRequestBody addCurrentUsersItem(String currentUsersItem) {
        if (this.currentUsers == null) {
            this.currentUsers = new ArrayList<>();
        }
        this.currentUsers.add(currentUsersItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withCurrentUsers(Consumer<List<String>> currentUsersSetter) {
        if (this.currentUsers == null) {
            this.currentUsers = new ArrayList<>();
        }
        currentUsersSetter.accept(this.currentUsers);
        return this;
    }

    /**
     * 用户id
     * @return currentUsers
     */
    public List<String> getCurrentUsers() {
        return currentUsers;
    }

    public void setCurrentUsers(List<String> currentUsers) {
        this.currentUsers = currentUsers;
    }

    public ListTenantWarRoomRequestBody withWarRoomNums(List<String> warRoomNums) {
        this.warRoomNums = warRoomNums;
        return this;
    }

    public ListTenantWarRoomRequestBody addWarRoomNumsItem(String warRoomNumsItem) {
        if (this.warRoomNums == null) {
            this.warRoomNums = new ArrayList<>();
        }
        this.warRoomNums.add(warRoomNumsItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withWarRoomNums(Consumer<List<String>> warRoomNumsSetter) {
        if (this.warRoomNums == null) {
            this.warRoomNums = new ArrayList<>();
        }
        warRoomNumsSetter.accept(this.warRoomNums);
        return this;
    }

    /**
     * WarRoom单号，当有这个筛选条件时，其他筛选条件忽略
     * @return warRoomNums
     */
    public List<String> getWarRoomNums() {
        return warRoomNums;
    }

    public void setWarRoomNums(List<String> warRoomNums) {
        this.warRoomNums = warRoomNums;
    }

    public ListTenantWarRoomRequestBody withIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
        return this;
    }

    /**
     * 事件单号 精确查询
     * @return incidentNum
     */
    public String getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
    }

    public ListTenantWarRoomRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * WarRoom名称 模糊查询
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListTenantWarRoomRequestBody withRegionCodeList(List<String> regionCodeList) {
        this.regionCodeList = regionCodeList;
        return this;
    }

    public ListTenantWarRoomRequestBody addRegionCodeListItem(String regionCodeListItem) {
        if (this.regionCodeList == null) {
            this.regionCodeList = new ArrayList<>();
        }
        this.regionCodeList.add(regionCodeListItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withRegionCodeList(Consumer<List<String>> regionCodeListSetter) {
        if (this.regionCodeList == null) {
            this.regionCodeList = new ArrayList<>();
        }
        regionCodeListSetter.accept(this.regionCodeList);
        return this;
    }

    /**
     * 区域 多选
     * @return regionCodeList
     */
    public List<String> getRegionCodeList() {
        return regionCodeList;
    }

    public void setRegionCodeList(List<String> regionCodeList) {
        this.regionCodeList = regionCodeList;
    }

    public ListTenantWarRoomRequestBody withIncidentLevels(List<String> incidentLevels) {
        this.incidentLevels = incidentLevels;
        return this;
    }

    public ListTenantWarRoomRequestBody addIncidentLevelsItem(String incidentLevelsItem) {
        if (this.incidentLevels == null) {
            this.incidentLevels = new ArrayList<>();
        }
        this.incidentLevels.add(incidentLevelsItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withIncidentLevels(Consumer<List<String>> incidentLevelsSetter) {
        if (this.incidentLevels == null) {
            this.incidentLevels = new ArrayList<>();
        }
        incidentLevelsSetter.accept(this.incidentLevels);
        return this;
    }

    /**
     * 事件级别 多选
     * @return incidentLevels
     */
    public List<String> getIncidentLevels() {
        return incidentLevels;
    }

    public void setIncidentLevels(List<String> incidentLevels) {
        this.incidentLevels = incidentLevels;
    }

    public ListTenantWarRoomRequestBody withImpactedApplicationIds(List<String> impactedApplicationIds) {
        this.impactedApplicationIds = impactedApplicationIds;
        return this;
    }

    public ListTenantWarRoomRequestBody addImpactedApplicationIdsItem(String impactedApplicationIdsItem) {
        if (this.impactedApplicationIds == null) {
            this.impactedApplicationIds = new ArrayList<>();
        }
        this.impactedApplicationIds.add(impactedApplicationIdsItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withImpactedApplicationIds(
        Consumer<List<String>> impactedApplicationIdsSetter) {
        if (this.impactedApplicationIds == null) {
            this.impactedApplicationIds = new ArrayList<>();
        }
        impactedApplicationIdsSetter.accept(this.impactedApplicationIds);
        return this;
    }

    /**
     * 影响应用id
     * @return impactedApplicationIds
     */
    public List<String> getImpactedApplicationIds() {
        return impactedApplicationIds;
    }

    public void setImpactedApplicationIds(List<String> impactedApplicationIds) {
        this.impactedApplicationIds = impactedApplicationIds;
    }

    public ListTenantWarRoomRequestBody withAdmin(List<String> admin) {
        this.admin = admin;
        return this;
    }

    public ListTenantWarRoomRequestBody addAdminItem(String adminItem) {
        if (this.admin == null) {
            this.admin = new ArrayList<>();
        }
        this.admin.add(adminItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withAdmin(Consumer<List<String>> adminSetter) {
        if (this.admin == null) {
            this.admin = new ArrayList<>();
        }
        adminSetter.accept(this.admin);
        return this;
    }

    /**
     * WarRoom管理员
     * @return admin
     */
    public List<String> getAdmin() {
        return admin;
    }

    public void setAdmin(List<String> admin) {
        this.admin = admin;
    }

    public ListTenantWarRoomRequestBody withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListTenantWarRoomRequestBody addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * WarRoom状态
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListTenantWarRoomRequestBody withTriggeredStartTime(Long triggeredStartTime) {
        this.triggeredStartTime = triggeredStartTime;
        return this;
    }

    /**
     * 拉起开始时间 默认前30天
     * minimum: 0
     * maximum: 9223372036854775807
     * @return triggeredStartTime
     */
    public Long getTriggeredStartTime() {
        return triggeredStartTime;
    }

    public void setTriggeredStartTime(Long triggeredStartTime) {
        this.triggeredStartTime = triggeredStartTime;
    }

    public ListTenantWarRoomRequestBody withTriggeredEndTime(Long triggeredEndTime) {
        this.triggeredEndTime = triggeredEndTime;
        return this;
    }

    /**
     * 拉起结束时间 默认当前时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return triggeredEndTime
     */
    public Long getTriggeredEndTime() {
        return triggeredEndTime;
    }

    public void setTriggeredEndTime(Long triggeredEndTime) {
        this.triggeredEndTime = triggeredEndTime;
    }

    public ListTenantWarRoomRequestBody withOccurStartTime(Long occurStartTime) {
        this.occurStartTime = occurStartTime;
        return this;
    }

    /**
     * 发生开始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurStartTime
     */
    public Long getOccurStartTime() {
        return occurStartTime;
    }

    public void setOccurStartTime(Long occurStartTime) {
        this.occurStartTime = occurStartTime;
    }

    public ListTenantWarRoomRequestBody withOccurEndTime(Long occurEndTime) {
        this.occurEndTime = occurEndTime;
        return this;
    }

    /**
     * 发生结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurEndTime
     */
    public Long getOccurEndTime() {
        return occurEndTime;
    }

    public void setOccurEndTime(Long occurEndTime) {
        this.occurEndTime = occurEndTime;
    }

    public ListTenantWarRoomRequestBody withRecoverStartTime(Long recoverStartTime) {
        this.recoverStartTime = recoverStartTime;
        return this;
    }

    /**
     * 恢复开始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recoverStartTime
     */
    public Long getRecoverStartTime() {
        return recoverStartTime;
    }

    public void setRecoverStartTime(Long recoverStartTime) {
        this.recoverStartTime = recoverStartTime;
    }

    public ListTenantWarRoomRequestBody withRecoverEndTime(Long recoverEndTime) {
        this.recoverEndTime = recoverEndTime;
        return this;
    }

    /**
     * 恢复结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recoverEndTime
     */
    public Long getRecoverEndTime() {
        return recoverEndTime;
    }

    public void setRecoverEndTime(Long recoverEndTime) {
        this.recoverEndTime = recoverEndTime;
    }

    public ListTenantWarRoomRequestBody withNotificationLevel(List<String> notificationLevel) {
        this.notificationLevel = notificationLevel;
        return this;
    }

    public ListTenantWarRoomRequestBody addNotificationLevelItem(String notificationLevelItem) {
        if (this.notificationLevel == null) {
            this.notificationLevel = new ArrayList<>();
        }
        this.notificationLevel.add(notificationLevelItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withNotificationLevel(Consumer<List<String>> notificationLevelSetter) {
        if (this.notificationLevel == null) {
            this.notificationLevel = new ArrayList<>();
        }
        notificationLevelSetter.accept(this.notificationLevel);
        return this;
    }

    /**
     * 通报级别
     * @return notificationLevel
     */
    public List<String> getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(List<String> notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    public ListTenantWarRoomRequestBody withEnterpriseProjectIds(List<String> enterpriseProjectIds) {
        this.enterpriseProjectIds = enterpriseProjectIds;
        return this;
    }

    public ListTenantWarRoomRequestBody addEnterpriseProjectIdsItem(String enterpriseProjectIdsItem) {
        if (this.enterpriseProjectIds == null) {
            this.enterpriseProjectIds = new ArrayList<>();
        }
        this.enterpriseProjectIds.add(enterpriseProjectIdsItem);
        return this;
    }

    public ListTenantWarRoomRequestBody withEnterpriseProjectIds(Consumer<List<String>> enterpriseProjectIdsSetter) {
        if (this.enterpriseProjectIds == null) {
            this.enterpriseProjectIds = new ArrayList<>();
        }
        enterpriseProjectIdsSetter.accept(this.enterpriseProjectIds);
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectIds
     */
    public List<String> getEnterpriseProjectIds() {
        return enterpriseProjectIds;
    }

    public void setEnterpriseProjectIds(List<String> enterpriseProjectIds) {
        this.enterpriseProjectIds = enterpriseProjectIds;
    }

    public ListTenantWarRoomRequestBody withWarRoomNum(String warRoomNum) {
        this.warRoomNum = warRoomNum;
        return this;
    }

    /**
     * WarRoom 单号 前端使用
     * @return warRoomNum
     */
    public String getWarRoomNum() {
        return warRoomNum;
    }

    public void setWarRoomNum(String warRoomNum) {
        this.warRoomNum = warRoomNum;
    }

    public ListTenantWarRoomRequestBody withStatisticFlag(Boolean statisticFlag) {
        this.statisticFlag = statisticFlag;
        return this;
    }

    /**
     * 是否统计,false 返回基本信息;true接口只返回统计结果：total_num,running_num,closed_num
     * @return statisticFlag
     */
    public Boolean getStatisticFlag() {
        return statisticFlag;
    }

    public void setStatisticFlag(Boolean statisticFlag) {
        this.statisticFlag = statisticFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantWarRoomRequestBody that = (ListTenantWarRoomRequestBody) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.currentUsers, that.currentUsers)
            && Objects.equals(this.warRoomNums, that.warRoomNums) && Objects.equals(this.incidentNum, that.incidentNum)
            && Objects.equals(this.title, that.title) && Objects.equals(this.regionCodeList, that.regionCodeList)
            && Objects.equals(this.incidentLevels, that.incidentLevels)
            && Objects.equals(this.impactedApplicationIds, that.impactedApplicationIds)
            && Objects.equals(this.admin, that.admin) && Objects.equals(this.status, that.status)
            && Objects.equals(this.triggeredStartTime, that.triggeredStartTime)
            && Objects.equals(this.triggeredEndTime, that.triggeredEndTime)
            && Objects.equals(this.occurStartTime, that.occurStartTime)
            && Objects.equals(this.occurEndTime, that.occurEndTime)
            && Objects.equals(this.recoverStartTime, that.recoverStartTime)
            && Objects.equals(this.recoverEndTime, that.recoverEndTime)
            && Objects.equals(this.notificationLevel, that.notificationLevel)
            && Objects.equals(this.enterpriseProjectIds, that.enterpriseProjectIds)
            && Objects.equals(this.warRoomNum, that.warRoomNum)
            && Objects.equals(this.statisticFlag, that.statisticFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            currentUsers,
            warRoomNums,
            incidentNum,
            title,
            regionCodeList,
            incidentLevels,
            impactedApplicationIds,
            admin,
            status,
            triggeredStartTime,
            triggeredEndTime,
            occurStartTime,
            occurEndTime,
            recoverStartTime,
            recoverEndTime,
            notificationLevel,
            enterpriseProjectIds,
            warRoomNum,
            statisticFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantWarRoomRequestBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    currentUsers: ").append(toIndentedString(currentUsers)).append("\n");
        sb.append("    warRoomNums: ").append(toIndentedString(warRoomNums)).append("\n");
        sb.append("    incidentNum: ").append(toIndentedString(incidentNum)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    regionCodeList: ").append(toIndentedString(regionCodeList)).append("\n");
        sb.append("    incidentLevels: ").append(toIndentedString(incidentLevels)).append("\n");
        sb.append("    impactedApplicationIds: ").append(toIndentedString(impactedApplicationIds)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggeredStartTime: ").append(toIndentedString(triggeredStartTime)).append("\n");
        sb.append("    triggeredEndTime: ").append(toIndentedString(triggeredEndTime)).append("\n");
        sb.append("    occurStartTime: ").append(toIndentedString(occurStartTime)).append("\n");
        sb.append("    occurEndTime: ").append(toIndentedString(occurEndTime)).append("\n");
        sb.append("    recoverStartTime: ").append(toIndentedString(recoverStartTime)).append("\n");
        sb.append("    recoverEndTime: ").append(toIndentedString(recoverEndTime)).append("\n");
        sb.append("    notificationLevel: ").append(toIndentedString(notificationLevel)).append("\n");
        sb.append("    enterpriseProjectIds: ").append(toIndentedString(enterpriseProjectIds)).append("\n");
        sb.append("    warRoomNum: ").append(toIndentedString(warRoomNum)).append("\n");
        sb.append("    statisticFlag: ").append(toIndentedString(statisticFlag)).append("\n");
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

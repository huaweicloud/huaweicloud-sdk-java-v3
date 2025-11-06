package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Dashboard
 */
public class Dashboard {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_type")

    private String dashboardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_title")

    private String dashboardTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_title_en")

    private String dashboardTitleEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_id")

    private String folderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_data")

    private String syncData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_create_action")

    private Boolean isCreateAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_tags")

    private List<Map<String, String>> dashboardTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Boolean isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Long created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private Long updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charts")

    private Object charts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templating")

    private Object templating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private Boolean display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_count")

    private Integer queryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    public Dashboard withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，可以从控制台获取，也可以从调用API处获取。获取方式请参见：[获取项目ID](aom_04_0024.xml)。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Dashboard withDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
        return this;
    }

    /**
     * 仪表盘类型。
     * @return dashboardType
     */
    public String getDashboardType() {
        return dashboardType;
    }

    public void setDashboardType(String dashboardType) {
        this.dashboardType = dashboardType;
    }

    public Dashboard withDashboardTitle(String dashboardTitle) {
        this.dashboardTitle = dashboardTitle;
        return this;
    }

    /**
     * 仪表盘名称。
     * @return dashboardTitle
     */
    public String getDashboardTitle() {
        return dashboardTitle;
    }

    public void setDashboardTitle(String dashboardTitle) {
        this.dashboardTitle = dashboardTitle;
    }

    public Dashboard withDashboardTitleEn(String dashboardTitleEn) {
        this.dashboardTitleEn = dashboardTitleEn;
        return this;
    }

    /**
     * 仪表盘英文名称。
     * @return dashboardTitleEn
     */
    public String getDashboardTitleEn() {
        return dashboardTitleEn;
    }

    public void setDashboardTitleEn(String dashboardTitleEn) {
        this.dashboardTitleEn = dashboardTitleEn;
    }

    public Dashboard withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * 仪表盘id。
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public Dashboard withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 仪表盘版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Dashboard withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 仪表盘企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Dashboard withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 仪表盘分组名称。
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public Dashboard withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * 仪表盘分组id。
     * @return folderId
     */
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public Dashboard withSyncData(String syncData) {
        this.syncData = syncData;
        return this;
    }

    /**
     * 待同步的仪表盘数。
     * @return syncData
     */
    public String getSyncData() {
        return syncData;
    }

    public void setSyncData(String syncData) {
        this.syncData = syncData;
    }

    public Dashboard withIsCreateAction(Boolean isCreateAction) {
        this.isCreateAction = isCreateAction;
        return this;
    }

    /**
     * 是否创建 - false：更新 - true：创建
     * @return isCreateAction
     */
    public Boolean getIsCreateAction() {
        return isCreateAction;
    }

    public void setIsCreateAction(Boolean isCreateAction) {
        this.isCreateAction = isCreateAction;
    }

    public Dashboard withDashboardTags(List<Map<String, String>> dashboardTags) {
        this.dashboardTags = dashboardTags;
        return this;
    }

    public Dashboard addDashboardTagsItem(Map<String, String> dashboardTagsItem) {
        if (this.dashboardTags == null) {
            this.dashboardTags = new ArrayList<>();
        }
        this.dashboardTags.add(dashboardTagsItem);
        return this;
    }

    public Dashboard withDashboardTags(Consumer<List<Map<String, String>>> dashboardTagsSetter) {
        if (this.dashboardTags == null) {
            this.dashboardTags = new ArrayList<>();
        }
        dashboardTagsSetter.accept(this.dashboardTags);
        return this;
    }

    /**
     * 仪表盘标签列表。
     * @return dashboardTags
     */
    public List<Map<String, String>> getDashboardTags() {
        return dashboardTags;
    }

    public void setDashboardTags(List<Map<String, String>> dashboardTags) {
        this.dashboardTags = dashboardTags;
    }

    public Dashboard withIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * 是否收藏 - true：收藏 - false：不收藏
     * @return isFavorite
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Dashboard withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * 仪表盘创建时间。
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Dashboard withUpdated(Long updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 仪表盘更新时间。
     * @return updated
     */
    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Dashboard withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建仪表盘的账号名称。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Dashboard withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新仪表盘的账号名称。
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Dashboard withCharts(Object charts) {
        this.charts = charts;
        return this;
    }

    /**
     * 仪表盘图表详情。
     * @return charts
     */
    public Object getCharts() {
        return charts;
    }

    public void setCharts(Object charts) {
        this.charts = charts;
    }

    public Dashboard withTemplating(Object templating) {
        this.templating = templating;
        return this;
    }

    /**
     * 仪表盘变量列表。
     * @return templating
     */
    public Object getTemplating() {
        return templating;
    }

    public void setTemplating(Object templating) {
        this.templating = templating;
    }

    public Dashboard withDisplay(Boolean display) {
        this.display = display;
        return this;
    }

    /**
     * 是否展示。
     * @return display
     */
    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Dashboard withQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
        return this;
    }

    /**
     * 查询总次数。
     * @return queryCount
     */
    public Integer getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    public Dashboard withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 默认查询时间范围。
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dashboard that = (Dashboard) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.dashboardType, that.dashboardType)
            && Objects.equals(this.dashboardTitle, that.dashboardTitle)
            && Objects.equals(this.dashboardTitleEn, that.dashboardTitleEn)
            && Objects.equals(this.dashboardId, that.dashboardId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.folderName, that.folderName) && Objects.equals(this.folderId, that.folderId)
            && Objects.equals(this.syncData, that.syncData) && Objects.equals(this.isCreateAction, that.isCreateAction)
            && Objects.equals(this.dashboardTags, that.dashboardTags)
            && Objects.equals(this.isFavorite, that.isFavorite) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updatedBy, that.updatedBy) && Objects.equals(this.charts, that.charts)
            && Objects.equals(this.templating, that.templating) && Objects.equals(this.display, that.display)
            && Objects.equals(this.queryCount, that.queryCount) && Objects.equals(this.timeRange, that.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            dashboardType,
            dashboardTitle,
            dashboardTitleEn,
            dashboardId,
            version,
            enterpriseProjectId,
            folderName,
            folderId,
            syncData,
            isCreateAction,
            dashboardTags,
            isFavorite,
            created,
            updated,
            createdBy,
            updatedBy,
            charts,
            templating,
            display,
            queryCount,
            timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dashboard {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dashboardType: ").append(toIndentedString(dashboardType)).append("\n");
        sb.append("    dashboardTitle: ").append(toIndentedString(dashboardTitle)).append("\n");
        sb.append("    dashboardTitleEn: ").append(toIndentedString(dashboardTitleEn)).append("\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    syncData: ").append(toIndentedString(syncData)).append("\n");
        sb.append("    isCreateAction: ").append(toIndentedString(isCreateAction)).append("\n");
        sb.append("    dashboardTags: ").append(toIndentedString(dashboardTags)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
        sb.append("    templating: ").append(toIndentedString(templating)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    queryCount: ").append(toIndentedString(queryCount)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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

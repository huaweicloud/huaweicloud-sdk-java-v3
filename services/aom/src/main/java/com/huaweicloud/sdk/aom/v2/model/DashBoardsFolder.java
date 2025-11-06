package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 仪表盘分组列表。
 */
public class DashBoardsFolder {

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
    @JsonProperty(value = "dashboard_ids")

    private List<String> dashboardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private Boolean display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_id")

    private String folderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_title")

    private String folderTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_title_en")

    private String folderTitleEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_template")

    private Boolean isTemplate;

    public DashBoardsFolder withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * 仪表盘分组创建时间。
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public DashBoardsFolder withUpdated(Long updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 仪表盘分组更新时间。
     * @return updated
     */
    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public DashBoardsFolder withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 仪表盘分组创建账号。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DashBoardsFolder withDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
        return this;
    }

    public DashBoardsFolder addDashboardIdsItem(String dashboardIdsItem) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        this.dashboardIds.add(dashboardIdsItem);
        return this;
    }

    public DashBoardsFolder withDashboardIds(Consumer<List<String>> dashboardIdsSetter) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        dashboardIdsSetter.accept(this.dashboardIds);
        return this;
    }

    /**
     * 仪表盘分组下仪表盘id列表。
     * @return dashboardIds
     */
    public List<String> getDashboardIds() {
        return dashboardIds;
    }

    public void setDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
    }

    public DashBoardsFolder withDisplay(Boolean display) {
        this.display = display;
        return this;
    }

    /**
     * 是否展示仪表盘分组。
     * @return display
     */
    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public DashBoardsFolder withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DashBoardsFolder withFolderId(String folderId) {
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

    public DashBoardsFolder withFolderTitle(String folderTitle) {
        this.folderTitle = folderTitle;
        return this;
    }

    /**
     * 仪表盘分组名称。
     * @return folderTitle
     */
    public String getFolderTitle() {
        return folderTitle;
    }

    public void setFolderTitle(String folderTitle) {
        this.folderTitle = folderTitle;
    }

    public DashBoardsFolder withFolderTitleEn(String folderTitleEn) {
        this.folderTitleEn = folderTitleEn;
        return this;
    }

    /**
     * 仪表盘分组英文名称。
     * @return folderTitleEn
     */
    public String getFolderTitleEn() {
        return folderTitleEn;
    }

    public void setFolderTitleEn(String folderTitleEn) {
        this.folderTitleEn = folderTitleEn;
    }

    public DashBoardsFolder withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * 仪表盘分组是否为默认仪表盘分组。
     * @return isTemplate
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashBoardsFolder that = (DashBoardsFolder) obj;
        return Objects.equals(this.created, that.created) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.dashboardIds, that.dashboardIds)
            && Objects.equals(this.display, that.display)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.folderId, that.folderId) && Objects.equals(this.folderTitle, that.folderTitle)
            && Objects.equals(this.folderTitleEn, that.folderTitleEn)
            && Objects.equals(this.isTemplate, that.isTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created,
            updated,
            createdBy,
            dashboardIds,
            display,
            enterpriseProjectId,
            folderId,
            folderTitle,
            folderTitleEn,
            isTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashBoardsFolder {\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    dashboardIds: ").append(toIndentedString(dashboardIds)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    folderTitle: ").append(toIndentedString(folderTitle)).append("\n");
        sb.append("    folderTitleEn: ").append(toIndentedString(folderTitleEn)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
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

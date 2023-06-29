package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 属性
 */
public class StandElementFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name")

    private String fdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actived")

    private Boolean actived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchable")

    private Boolean searchable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayed_name")

    private String displayedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayed_name_en")

    private String displayedNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    public StandElementFieldVO withFdName(String fdName) {
        this.fdName = fdName;
        return this;
    }

    /**
     * 属性名称
     * @return fdName
     */
    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public StandElementFieldVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 属性描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StandElementFieldVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StandElementFieldVO withActived(Boolean actived) {
        this.actived = actived;
        return this;
    }

    /**
     * 是否显示，系统默认项必然显示不允许修改
     * @return actived
     */
    public Boolean getActived() {
        return actived;
    }

    public void setActived(Boolean actived) {
        this.actived = actived;
    }

    public StandElementFieldVO withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public StandElementFieldVO withSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * 是否可搜索
     * @return searchable
     */
    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public StandElementFieldVO withDisplayedName(String displayedName) {
        this.displayedName = displayedName;
        return this;
    }

    /**
     * 前端展示名
     * @return displayedName
     */
    public String getDisplayedName() {
        return displayedName;
    }

    public void setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
    }

    public StandElementFieldVO withDisplayedNameEn(String displayedNameEn) {
        this.displayedNameEn = displayedNameEn;
        return this;
    }

    /**
     * 前端展示名英文
     * @return displayedNameEn
     */
    public String getDisplayedNameEn() {
        return displayedNameEn;
    }

    public void setDisplayedNameEn(String displayedNameEn) {
        this.displayedNameEn = displayedNameEn;
    }

    public StandElementFieldVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public StandElementFieldVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public StandElementFieldVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public StandElementFieldVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StandElementFieldVO that = (StandElementFieldVO) obj;
        return Objects.equals(this.fdName, that.fdName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.actived, that.actived)
            && Objects.equals(this.required, that.required) && Objects.equals(this.searchable, that.searchable)
            && Objects.equals(this.displayedName, that.displayedName)
            && Objects.equals(this.displayedNameEn, that.displayedNameEn)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fdName,
            description,
            id,
            actived,
            required,
            searchable,
            displayedName,
            displayedNameEn,
            createTime,
            updateTime,
            createBy,
            updateBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandElementFieldVO {\n");
        sb.append("    fdName: ").append(toIndentedString(fdName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    actived: ").append(toIndentedString(actived)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    displayedName: ").append(toIndentedString(displayedName)).append("\n");
        sb.append("    displayedNameEn: ").append(toIndentedString(displayedNameEn)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
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

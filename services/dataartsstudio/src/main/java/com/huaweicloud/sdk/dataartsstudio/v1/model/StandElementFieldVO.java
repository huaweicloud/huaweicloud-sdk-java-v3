package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 属性。
 */
public class StandElementFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name")

    private String fdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name_en")

    private String fdNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptionEn")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "optional_values")

    private String optionalValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private Integer fieldType;

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
     * 属性名称。
     * @return fdName
     */
    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public StandElementFieldVO withFdNameEn(String fdNameEn) {
        this.fdNameEn = fdNameEn;
        return this;
    }

    /**
     * 属性英文名称。
     * @return fdNameEn
     */
    public String getFdNameEn() {
        return fdNameEn;
    }

    public void setFdNameEn(String fdNameEn) {
        this.fdNameEn = fdNameEn;
    }

    public StandElementFieldVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 属性描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StandElementFieldVO withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * 属性英文描述。
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public StandElementFieldVO withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 属性标签。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public StandElementFieldVO withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否禁用。
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public StandElementFieldVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据标准ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StandElementFieldVO withActived(Boolean actived) {
        this.actived = actived;
        return this;
    }

    /**
     * 是否显示，系统默认项必然显示不允许修改。true表示使用数据标准时体现（增改查的时候可以操作该属性），false表示使用数据标准时不体现。
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
     * 是否必填。true：必填，false：非必填。
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
     * 是否可搜索。true表示在数据标准列表页面可搜索，false表示在数据标准列表页面不可搜索。
     * @return searchable
     */
    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public StandElementFieldVO withOptionalValues(String optionalValues) {
        this.optionalValues = optionalValues;
        return this;
    }

    /**
     * 允许值。
     * @return optionalValues
     */
    public String getOptionalValues() {
        return optionalValues;
    }

    public void setOptionalValues(String optionalValues) {
        this.optionalValues = optionalValues;
    }

    public StandElementFieldVO withFieldType(Integer fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型，0表示系统字段， 1表示自定义字段。
     * @return fieldType
     */
    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public StandElementFieldVO withDisplayedName(String displayedName) {
        this.displayedName = displayedName;
        return this;
    }

    /**
     * 前端展示名。
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
     * 前端展示名英文。
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
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
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
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
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
     * 创建人。
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
     * 更新人。
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
        return Objects.equals(this.fdName, that.fdName) && Objects.equals(this.fdNameEn, that.fdNameEn)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.descriptionEn, that.descriptionEn) && Objects.equals(this.label, that.label)
            && Objects.equals(this.disabled, that.disabled) && Objects.equals(this.id, that.id)
            && Objects.equals(this.actived, that.actived) && Objects.equals(this.required, that.required)
            && Objects.equals(this.searchable, that.searchable)
            && Objects.equals(this.optionalValues, that.optionalValues)
            && Objects.equals(this.fieldType, that.fieldType) && Objects.equals(this.displayedName, that.displayedName)
            && Objects.equals(this.displayedNameEn, that.displayedNameEn)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fdName,
            fdNameEn,
            description,
            descriptionEn,
            label,
            disabled,
            id,
            actived,
            required,
            searchable,
            optionalValues,
            fieldType,
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
        sb.append("    fdNameEn: ").append(toIndentedString(fdNameEn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    actived: ").append(toIndentedString(actived)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    optionalValues: ").append(toIndentedString(optionalValues)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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

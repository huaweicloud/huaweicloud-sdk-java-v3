package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 字段参数返回体
 */
public class FieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_on_card")

    private Boolean showOnCard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_options")

    private List<OptionEntity> allOptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    public FieldVO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 字段名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FieldVO withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 添加人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public FieldVO withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public FieldVO withShowOnCard(Boolean showOnCard) {
        this.showOnCard = showOnCard;
        return this;
    }

    /**
     * 是否显示在新建页
     * @return showOnCard
     */
    public Boolean getShowOnCard() {
        return showOnCard;
    }

    public void setShowOnCard(Boolean showOnCard) {
        this.showOnCard = showOnCard;
    }

    public FieldVO withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * 是否必填
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public FieldVO withAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
        return this;
    }

    public FieldVO addAllOptionsItem(OptionEntity allOptionsItem) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        this.allOptions.add(allOptionsItem);
        return this;
    }

    public FieldVO withAllOptions(Consumer<List<OptionEntity>> allOptionsSetter) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        allOptionsSetter.accept(this.allOptions);
        return this;
    }

    /**
     * 字段选项
     * @return allOptions
     */
    public List<OptionEntity> getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
    }

    public FieldVO withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldVO that = (FieldVO) obj;
        return Objects.equals(this.displayName, that.displayName) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.fieldType, that.fieldType) && Objects.equals(this.showOnCard, that.showOnCard)
            && Objects.equals(this.optional, that.optional) && Objects.equals(this.allOptions, that.allOptions)
            && Objects.equals(this.defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, createdBy, fieldType, showOnCard, optional, allOptions, defaultValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldVO {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    showOnCard: ").append(toIndentedString(showOnCard)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    allOptions: ").append(toIndentedString(allOptions)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

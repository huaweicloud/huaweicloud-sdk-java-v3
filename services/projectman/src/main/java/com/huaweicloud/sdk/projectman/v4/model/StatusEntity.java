package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项状态对象
 */
public class StatusEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belonging")

    private String belonging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_value")

    private String displayValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_code")

    private List<String> categoryCode = null;

    public StatusEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 状态ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusEntity withBelonging(String belonging) {
        this.belonging = belonging;
        return this;
    }

    /**
     * 工作项的状态属性。
     * @return belonging
     */
    public String getBelonging() {
        return belonging;
    }

    public void setBelonging(String belonging) {
        this.belonging = belonging;
    }

    public StatusEntity withDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    /**
     * 状态名。
     * @return displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public StatusEntity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 状态唯一标识。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public StatusEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 状态创建人。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public StatusEntity withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 状态创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public StatusEntity withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 状态修改人。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public StatusEntity withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 状态最近修改时间。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public StatusEntity withCategoryCode(List<String> categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    public StatusEntity addCategoryCodeItem(String categoryCodeItem) {
        if (this.categoryCode == null) {
            this.categoryCode = new ArrayList<>();
        }
        this.categoryCode.add(categoryCodeItem);
        return this;
    }

    public StatusEntity withCategoryCode(Consumer<List<String>> categoryCodeSetter) {
        if (this.categoryCode == null) {
            this.categoryCode = new ArrayList<>();
        }
        categoryCodeSetter.accept(this.categoryCode);
        return this;
    }

    /**
     * 状态被哪些工作项使用。
     * @return categoryCode
     */
    public List<String> getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(List<String> categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusEntity that = (StatusEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.belonging, that.belonging)
            && Objects.equals(this.displayValue, that.displayValue) && Objects.equals(this.code, that.code)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.categoryCode, that.categoryCode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, belonging, displayValue, code, createdBy, createdTime, modifiedBy, modifiedTime, categoryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    belonging: ").append(toIndentedString(belonging)).append("\n");
        sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
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

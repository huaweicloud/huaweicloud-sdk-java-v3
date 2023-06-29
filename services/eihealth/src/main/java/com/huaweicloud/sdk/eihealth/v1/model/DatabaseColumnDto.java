package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库列定义
 */
public class DatabaseColumnDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ColumnType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nullable")

    private Boolean nullable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchable")

    private Boolean searchable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique")

    private Boolean unique;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tips")

    private String tips;

    public DatabaseColumnDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 列名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseColumnDto withType(ColumnType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ColumnType getType() {
        return type;
    }

    public void setType(ColumnType type) {
        this.type = type;
    }

    public DatabaseColumnDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 列描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DatabaseColumnDto withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * 列是否允许为空
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public DatabaseColumnDto withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 是否作为主键
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public DatabaseColumnDto withSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * 是否可查询
     * @return searchable
     */
    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public DatabaseColumnDto withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

    /**
     * 是否唯一
     * @return unique
     */
    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public DatabaseColumnDto withTips(String tips) {
        this.tips = tips;
        return this;
    }

    /**
     * 查询参数格式的提示信息
     * @return tips
     */
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseColumnDto that = (DatabaseColumnDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.nullable, that.nullable)
            && Objects.equals(this.primary, that.primary) && Objects.equals(this.searchable, that.searchable)
            && Objects.equals(this.unique, that.unique) && Objects.equals(this.tips, that.tips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, nullable, primary, searchable, unique, tips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseColumnDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
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

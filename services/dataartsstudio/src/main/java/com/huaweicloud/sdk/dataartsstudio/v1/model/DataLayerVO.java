package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataLayerVO
 */
public class DataLayerVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private LayerType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_customized_field_ids")

    private List<String> disabledCustomizedFieldIds = null;

    public DataLayerVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数仓分层的ID，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataLayerVO withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 层级，从1开始。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public DataLayerVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataLayerVO withType(LayerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public LayerType getType() {
        return type;
    }

    public void setType(LayerType type) {
        this.type = type;
    }

    public DataLayerVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数仓分层描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataLayerVO withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否是不可删除的默认分层，包含SDI\\DWR\\DM。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public DataLayerVO withDisabledCustomizedFieldIds(List<String> disabledCustomizedFieldIds) {
        this.disabledCustomizedFieldIds = disabledCustomizedFieldIds;
        return this;
    }

    public DataLayerVO addDisabledCustomizedFieldIdsItem(String disabledCustomizedFieldIdsItem) {
        if (this.disabledCustomizedFieldIds == null) {
            this.disabledCustomizedFieldIds = new ArrayList<>();
        }
        this.disabledCustomizedFieldIds.add(disabledCustomizedFieldIdsItem);
        return this;
    }

    public DataLayerVO withDisabledCustomizedFieldIds(Consumer<List<String>> disabledCustomizedFieldIdsSetter) {
        if (this.disabledCustomizedFieldIds == null) {
            this.disabledCustomizedFieldIds = new ArrayList<>();
        }
        disabledCustomizedFieldIdsSetter.accept(this.disabledCustomizedFieldIds);
        return this;
    }

    /**
     * 该分层禁用的自定义项的ID列表，包括表级自定义项和字段级自定义项。
     * @return disabledCustomizedFieldIds
     */
    public List<String> getDisabledCustomizedFieldIds() {
        return disabledCustomizedFieldIds;
    }

    public void setDisabledCustomizedFieldIds(List<String> disabledCustomizedFieldIds) {
        this.disabledCustomizedFieldIds = disabledCustomizedFieldIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataLayerVO that = (DataLayerVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.level, that.level)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.disabledCustomizedFieldIds, that.disabledCustomizedFieldIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, level, name, type, description, isDefault, disabledCustomizedFieldIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataLayerVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    disabledCustomizedFieldIds: ").append(toIndentedString(disabledCustomizedFieldIds)).append("\n");
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

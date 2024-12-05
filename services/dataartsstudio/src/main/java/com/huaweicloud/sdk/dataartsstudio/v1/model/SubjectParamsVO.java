package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubjectParamsVO
 */
public class SubjectParamsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_owner")

    private String dataOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_owner_list")

    private String dataOwnerList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public SubjectParamsVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码。更新时必填，创建时可以为空，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubjectParamsVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 中文名称。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public SubjectParamsVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public SubjectParamsVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息，业务对象必填。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubjectParamsVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public SubjectParamsVO withDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
        return this;
    }

    /**
     * 数据owner部门。
     * @return dataOwner
     */
    public String getDataOwner() {
        return dataOwner;
    }

    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    public SubjectParamsVO withDataOwnerList(String dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
        return this;
    }

    /**
     * 数据owner人员。拼接成数组格式：[\"user_1\",\"user_2\"]。
     * @return dataOwnerList
     */
    public String getDataOwnerList() {
        return dataOwnerList;
    }

    public void setDataOwnerList(String dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
    }

    public SubjectParamsVO withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 层级。取值范围1-7。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public SubjectParamsVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 上层主题ID，首层则为空，ID字符串。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public SubjectParamsVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public SubjectParamsVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public SubjectParamsVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项。主题的自定义属性。
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubjectParamsVO that = (SubjectParamsVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameCh, that.nameCh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.description, that.description)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.dataOwner, that.dataOwner)
            && Objects.equals(this.dataOwnerList, that.dataOwnerList) && Objects.equals(this.level, that.level)
            && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, nameCh, nameEn, description, alias, dataOwner, dataOwnerList, level, parentId, selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubjectParamsVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    dataOwner: ").append(toIndentedString(dataOwner)).append("\n");
        sb.append("    dataOwnerList: ").append(toIndentedString(dataOwnerList)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
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

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
public class FieldLongDateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private Long modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type_id")

    private String fieldTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type_name")

    private String fieldTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_type")

    private String definitionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_on_card")

    private Boolean showOnCard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "controlled")

    private Boolean controlled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immutable")

    private Boolean immutable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no")

    private Integer no;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private List<OptionEntity> option = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_options")

    private List<OptionEntity> allOptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_same_display_name")

    private Boolean hasSameDisplayName;

    public FieldLongDateVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 字段唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FieldLongDateVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 字段编码。在项目中使用时一般使用code作为字段标识而不是字段ID。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FieldLongDateVO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 字段显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FieldLongDateVO withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 字段创建人ID。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public FieldLongDateVO withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 字段创建时间。时间戳格式，单位毫秒。
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public FieldLongDateVO withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 字段最后修改人ID。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public FieldLongDateVO withModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 字段最后修改时间。时间戳格式，单位毫秒。
     * @return modifiedDate
     */
    public Long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public FieldLongDateVO withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型标识。
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public FieldLongDateVO withFieldTypeId(String fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
        return this;
    }

    /**
     * 字段类型ID。用于区分不同的字段类型。
     * @return fieldTypeId
     */
    public String getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(String fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    public FieldLongDateVO withFieldTypeName(String fieldTypeName) {
        this.fieldTypeName = fieldTypeName;
        return this;
    }

    /**
     * 字段类型名称。如单选列表、多选列表、多行文本等。
     * @return fieldTypeName
     */
    public String getFieldTypeName() {
        return fieldTypeName;
    }

    public void setFieldTypeName(String fieldTypeName) {
        this.fieldTypeName = fieldTypeName;
    }

    public FieldLongDateVO withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * 字段定义类型。用于区分系统字段和自定义字段。
     * @return definitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    public FieldLongDateVO withShowOnCard(Boolean showOnCard) {
        this.showOnCard = showOnCard;
        return this;
    }

    /**
     * 是否显示在云服务类型的迭代看板卡片模式中。
     * @return showOnCard
     */
    public Boolean getShowOnCard() {
        return showOnCard;
    }

    public void setShowOnCard(Boolean showOnCard) {
        this.showOnCard = showOnCard;
    }

    public FieldLongDateVO withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * 字段是否为必填项。
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public FieldLongDateVO withControlled(Boolean controlled) {
        this.controlled = controlled;
        return this;
    }

    /**
     * 字段是否受控。如果工作项已经基线，修改受控字段值时会触发变更评审。
     * @return controlled
     */
    public Boolean getControlled() {
        return controlled;
    }

    public void setControlled(Boolean controlled) {
        this.controlled = controlled;
    }

    public FieldLongDateVO withImmutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    /**
     * 字段是否不可变。更新接口无法更新不可变字段。
     * @return immutable
     */
    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }

    public FieldLongDateVO withNo(Integer no) {
        this.no = no;
        return this;
    }

    /**
     * 字段排序序号。数值越小越靠前显示。
     * @return no
     */
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public FieldLongDateVO withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 字段默认值。创建工作项时自动填充。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public FieldLongDateVO withOption(List<OptionEntity> option) {
        this.option = option;
        return this;
    }

    public FieldLongDateVO addOptionItem(OptionEntity optionItem) {
        if (this.option == null) {
            this.option = new ArrayList<>();
        }
        this.option.add(optionItem);
        return this;
    }

    public FieldLongDateVO withOption(Consumer<List<OptionEntity>> optionSetter) {
        if (this.option == null) {
            this.option = new ArrayList<>();
        }
        optionSetter.accept(this.option);
        return this;
    }

    /**
     * 字段选项。单选列表类型字段的选项信息，包含选项ID、编码、显示名称等属性。
     * @return option
     */
    public List<OptionEntity> getOption() {
        return option;
    }

    public void setOption(List<OptionEntity> option) {
        this.option = option;
    }

    public FieldLongDateVO withAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
        return this;
    }

    public FieldLongDateVO addAllOptionsItem(OptionEntity allOptionsItem) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        this.allOptions.add(allOptionsItem);
        return this;
    }

    public FieldLongDateVO withAllOptions(Consumer<List<OptionEntity>> allOptionsSetter) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        allOptionsSetter.accept(this.allOptions);
        return this;
    }

    /**
     * 字段所有选项。多选列表类型字段的全部选项信息，数组元素包含选项ID、编码、显示名称等属性。
     * @return allOptions
     */
    public List<OptionEntity> getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
    }

    public FieldLongDateVO withHasSameDisplayName(Boolean hasSameDisplayName) {
        this.hasSameDisplayName = hasSameDisplayName;
        return this;
    }

    /**
     * 是否存在同名字段。用于检测字段名称冲突。
     * @return hasSameDisplayName
     */
    public Boolean getHasSameDisplayName() {
        return hasSameDisplayName;
    }

    public void setHasSameDisplayName(Boolean hasSameDisplayName) {
        this.hasSameDisplayName = hasSameDisplayName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldLongDateVO that = (FieldLongDateVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.fieldTypeId, that.fieldTypeId)
            && Objects.equals(this.fieldTypeName, that.fieldTypeName)
            && Objects.equals(this.definitionType, that.definitionType)
            && Objects.equals(this.showOnCard, that.showOnCard) && Objects.equals(this.optional, that.optional)
            && Objects.equals(this.controlled, that.controlled) && Objects.equals(this.immutable, that.immutable)
            && Objects.equals(this.no, that.no) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.option, that.option) && Objects.equals(this.allOptions, that.allOptions)
            && Objects.equals(this.hasSameDisplayName, that.hasSameDisplayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            code,
            displayName,
            createdBy,
            createdDate,
            modifiedBy,
            modifiedDate,
            fieldType,
            fieldTypeId,
            fieldTypeName,
            definitionType,
            showOnCard,
            optional,
            controlled,
            immutable,
            no,
            defaultValue,
            option,
            allOptions,
            hasSameDisplayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldLongDateVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldTypeId: ").append(toIndentedString(fieldTypeId)).append("\n");
        sb.append("    fieldTypeName: ").append(toIndentedString(fieldTypeName)).append("\n");
        sb.append("    definitionType: ").append(toIndentedString(definitionType)).append("\n");
        sb.append("    showOnCard: ").append(toIndentedString(showOnCard)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    controlled: ").append(toIndentedString(controlled)).append("\n");
        sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
        sb.append("    no: ").append(toIndentedString(no)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    allOptions: ").append(toIndentedString(allOptions)).append("\n");
        sb.append("    hasSameDisplayName: ").append(toIndentedString(hasSameDisplayName)).append("\n");
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

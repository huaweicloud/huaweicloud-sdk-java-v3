package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 字段对象
 */
public class FieldEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "definition_type")

    private String definitionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type_name")

    private String fieldTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

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
    @JsonProperty(value = "all_options")

    private List<OptionEntity> allOptions = null;

    public FieldEntity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 字段名称。 **取值范围**： 不涉及
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FieldEntity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 字段code。 **取值范围**： 不涉及
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FieldEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 字段id。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FieldEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 字段描述。 **取值范围**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FieldEntity withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释**： 字段创建人名称。 **取值范围**： 不涉及
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public FieldEntity withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释**： 字段创建时间，时间戳格式，示例:1715305846000。 **取值范围**： 不涉及
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public FieldEntity withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * **参数解释**： 字段最后更新人名称。 **取值范围**： 不涉及
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public FieldEntity withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * **参数解释**： 字段级别。 **取值范围**： 1/2/3：系统预设字段。 4：租户自定义字段 5：项目自定义字段
     * @return definitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    public FieldEntity withFieldTypeName(String fieldTypeName) {
        this.fieldTypeName = fieldTypeName;
        return this;
    }

    /**
     * **参数解释**： 字段类型名称。 **取值范围**： 不涉及
     * @return fieldTypeName
     */
    public String getFieldTypeName() {
        return fieldTypeName;
    }

    public void setFieldTypeName(String fieldTypeName) {
        this.fieldTypeName = fieldTypeName;
    }

    public FieldEntity withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * **参数解释**： 字段在工作项中是否必填，和工作流配置不一致时以工作流为准。 **取值范围**： true（必填） false（非必填）
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public FieldEntity withControlled(Boolean controlled) {
        this.controlled = controlled;
        return this;
    }

    /**
     * **参数解释**： 字段在工作项中是否受控，修改已基线的工作项受控字段需要走变更评审流程，和工作流配置不一致时以工作流为准。 **取值范围**： true（受控） false（非受控）
     * @return controlled
     */
    public Boolean getControlled() {
        return controlled;
    }

    public void setControlled(Boolean controlled) {
        this.controlled = controlled;
    }

    public FieldEntity withImmutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    /**
     * **参数解释**： 字段在工作项中是否可修改，和工作流配置不一致时以工作流为准。 **取值范围**： true（不可修改） false（可修改）
     * @return immutable
     */
    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }

    public FieldEntity withNo(Integer no) {
        this.no = no;
        return this;
    }

    /**
     * **参数解释**： 字段排序的序号。 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return no
     */
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public FieldEntity withAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
        return this;
    }

    public FieldEntity addAllOptionsItem(OptionEntity allOptionsItem) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        this.allOptions.add(allOptionsItem);
        return this;
    }

    public FieldEntity withAllOptions(Consumer<List<OptionEntity>> allOptionsSetter) {
        if (this.allOptions == null) {
            this.allOptions = new ArrayList<>();
        }
        allOptionsSetter.accept(this.allOptions);
        return this;
    }

    /**
     * **参数解释**： 字段选项。
     * @return allOptions
     */
    public List<OptionEntity> getAllOptions() {
        return allOptions;
    }

    public void setAllOptions(List<OptionEntity> allOptions) {
        this.allOptions = allOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldEntity that = (FieldEntity) obj;
        return Objects.equals(this.displayName, that.displayName) && Objects.equals(this.code, that.code)
            && Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.definitionType, that.definitionType)
            && Objects.equals(this.fieldTypeName, that.fieldTypeName) && Objects.equals(this.required, that.required)
            && Objects.equals(this.controlled, that.controlled) && Objects.equals(this.immutable, that.immutable)
            && Objects.equals(this.no, that.no) && Objects.equals(this.allOptions, that.allOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName,
            code,
            id,
            description,
            createdBy,
            createdDate,
            modifiedBy,
            definitionType,
            fieldTypeName,
            required,
            controlled,
            immutable,
            no,
            allOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldEntity {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    definitionType: ").append(toIndentedString(definitionType)).append("\n");
        sb.append("    fieldTypeName: ").append(toIndentedString(fieldTypeName)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    controlled: ").append(toIndentedString(controlled)).append("\n");
        sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
        sb.append("    no: ").append(toIndentedString(no)).append("\n");
        sb.append("    allOptions: ").append(toIndentedString(allOptions)).append("\n");
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

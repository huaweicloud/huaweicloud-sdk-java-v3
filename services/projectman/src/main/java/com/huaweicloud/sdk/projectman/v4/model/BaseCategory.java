package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Category基础信息
 */
public class BaseCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    /**
     * **参数解释**： 租户下项目空间唯一标识ID。 **取值范围**： - -1：自定义工作项类型 - 0：预设工作项模型
     */
    public static final class DomainIdEnum {

        /**
         * Enum _1 for value: "-1"
         */
        public static final DomainIdEnum _1 = new DomainIdEnum("-1");

        /**
         * Enum _0 for value: "0"
         */
        public static final DomainIdEnum _0 = new DomainIdEnum("0");

        private static final Map<String, DomainIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainIdEnum> createStaticFields() {
            Map<String, DomainIdEnum> map = new HashMap<>();
            map.put("-1", _1);
            map.put("0", _0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainIdEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DomainIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainIdEnum(value));
        }

        public static DomainIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainIdEnum) {
                return this.value.equals(((DomainIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private DomainIdEnum domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_type")

    private Long definitionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_id")

    private String typeId;

    public BaseCategory withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public BaseCategory withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * **参数解释**： 修改人。 **取值范围**： 不涉及。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public BaseCategory withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * **参数解释**： 修改时间。 **取值范围**： 不涉及。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public BaseCategory withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释**： 创建人。 **取值范围**： 不涉及。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public BaseCategory withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public BaseCategory withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 对象类型编码。 **取值范围**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BaseCategory withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * **参数解释**： 编号前缀。 **取值范围**： 不涉及。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public BaseCategory withDomainId(DomainIdEnum domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户下项目空间唯一标识ID。 **取值范围**： - -1：自定义工作项类型 - 0：预设工作项模型
     * @return domainId
     */
    public DomainIdEnum getDomainId() {
        return domainId;
    }

    public void setDomainId(DomainIdEnum domainId) {
        this.domainId = domainId;
    }

    public BaseCategory withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * **参数解释**： 图标。 **取值范围**： 不涉及。
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public BaseCategory withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释**： 颜色。 **取值范围**： 不涉及。
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BaseCategory withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述信息。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BaseCategory withDefinitionType(Long definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * **参数解释**： 定义类型。 **取值范围**： - 1~3 系统级别 - 4 租户级别
     * @return definitionType
     */
    public Long getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(Long definitionType) {
        this.definitionType = definitionType;
    }

    public BaseCategory withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * **参数解释**： 类别ID。 **取值范围**： 不涉及。
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseCategory that = (BaseCategory) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.code, that.code)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.icon, that.icon) && Objects.equals(this.color, that.color)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.definitionType, that.definitionType) && Objects.equals(this.typeId, that.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
            modifiedBy,
            modifiedDate,
            createdBy,
            createdDate,
            code,
            prefix,
            domainId,
            icon,
            color,
            description,
            definitionType,
            typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseCategory {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    definitionType: ").append(toIndentedString(definitionType)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

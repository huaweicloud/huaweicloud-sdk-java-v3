package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 自定义项信息。
 */
public class CustomizedFieldsVO {

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
    @JsonProperty(value = "not_null")

    private Boolean notNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_values")

    private String optionalValues;

    /**
     * 自定义项类型。 枚举值：   - TABLE: 表自定义项   - ATTRIBUTE: 属性自定义项   - SUBJECT: 主题自定义项   - METRIC: 业务指标自定义项 
     */
    public static final class TypeEnum {

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final TypeEnum TABLE = new TypeEnum("TABLE");

        /**
         * Enum ATTRIBUTE for value: "ATTRIBUTE"
         */
        public static final TypeEnum ATTRIBUTE = new TypeEnum("ATTRIBUTE");

        /**
         * Enum SUBJECT for value: "SUBJECT"
         */
        public static final TypeEnum SUBJECT = new TypeEnum("SUBJECT");

        /**
         * Enum METRIC for value: "METRIC"
         */
        public static final TypeEnum METRIC = new TypeEnum("METRIC");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TABLE", TABLE);
            map.put("ATTRIBUTE", ATTRIBUTE);
            map.put("SUBJECT", SUBJECT);
            map.put("METRIC", METRIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public CustomizedFieldsVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomizedFieldsVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 自定义项中文名称。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public CustomizedFieldsVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 自定义项英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CustomizedFieldsVO withNotNull(Boolean notNull) {
        this.notNull = notNull;
        return this;
    }

    /**
     * 是否必填。
     * @return notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public CustomizedFieldsVO withOptionalValues(String optionalValues) {
        this.optionalValues = optionalValues;
        return this;
    }

    /**
     * 可选值。当可选值有多个时，用分号分隔。
     * @return optionalValues
     */
    public String getOptionalValues() {
        return optionalValues;
    }

    public void setOptionalValues(String optionalValues) {
        this.optionalValues = optionalValues;
    }

    public CustomizedFieldsVO withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义项类型。 枚举值：   - TABLE: 表自定义项   - ATTRIBUTE: 属性自定义项   - SUBJECT: 主题自定义项   - METRIC: 业务指标自定义项 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CustomizedFieldsVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 系统排序字段，新建、修改时不需要填写。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CustomizedFieldsVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义项描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomizedFieldsVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人，只读。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CustomizedFieldsVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人，只读。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public CustomizedFieldsVO withCreateTime(OffsetDateTime createTime) {
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

    public CustomizedFieldsVO withUpdateTime(OffsetDateTime updateTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomizedFieldsVO that = (CustomizedFieldsVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameCh, that.nameCh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.notNull, that.notNull)
            && Objects.equals(this.optionalValues, that.optionalValues) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameCh,
            nameEn,
            notNull,
            optionalValues,
            type,
            ordinal,
            description,
            createBy,
            updateBy,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizedFieldsVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    optionalValues: ").append(toIndentedString(optionalValues)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

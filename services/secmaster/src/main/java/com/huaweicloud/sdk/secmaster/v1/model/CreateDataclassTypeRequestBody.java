package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建类型请求参数
 */
public class CreateDataclassTypeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_category")

    private String subCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_category_code")

    private String subCategoryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_code")

    private String categoryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_code")

    private String businessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_business_code")

    private String dataclassBusinessCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 类型层级，创建自定义类型必填，枚举值：1-类型，2-子类型。（其余类型不填）
     */
    public static final class LevelEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LevelEnum NUMBER_1 = new LevelEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final LevelEnum NUMBER_2 = new LevelEnum(2);

        private static final Map<Integer, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LevelEnum> createStaticFields() {
            Map<Integer, LevelEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla")

    private Long sla;

    public CreateDataclassTypeRequestBody withSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * 子类型名称，告警类型、事件类型必填；威胁情报、漏洞类型、自定义类型不填
     * @return subCategory
     */
    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public CreateDataclassTypeRequestBody withSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
        return this;
    }

    /**
     * 子类型标识。告警类型、事件类型必填；威胁情报、漏洞类型、自定义类型不填
     * @return subCategoryCode
     */
    public String getSubCategoryCode() {
        return subCategoryCode;
    }

    public void setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    public CreateDataclassTypeRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类型名称，告警类型、事件类型、威胁情报、漏洞类型必填；自定义类型不填
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateDataclassTypeRequestBody withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * 类型标识。告警类型、事件类型、威胁情报、漏洞类型必填；自定义类型不填
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public CreateDataclassTypeRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义类型名称。创建类型时，代表类型名称，创建子类型时，代表子类型名称。（自定义类型必填，其余类型不填）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDataclassTypeRequestBody withBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }

    /**
     * 自定义类型标识。创建类型时代表类型标识；创建子类型时代表子类型标识。（自定义类型必填，其余类型不填）
     * @return businessCode
     */
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public CreateDataclassTypeRequestBody withDataclassBusinessCode(String dataclassBusinessCode) {
        this.dataclassBusinessCode = dataclassBusinessCode;
        return this;
    }

    /**
     * 数据类业务编码，创建自定义类型必填。（其余类型不填）
     * @return dataclassBusinessCode
     */
    public String getDataclassBusinessCode() {
        return dataclassBusinessCode;
    }

    public void setDataclassBusinessCode(String dataclassBusinessCode) {
        this.dataclassBusinessCode = dataclassBusinessCode;
    }

    public CreateDataclassTypeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 类型描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDataclassTypeRequestBody withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 类型层级，创建自定义类型必填，枚举值：1-类型，2-子类型。（其余类型不填）
     * minimum: 1
     * maximum: 2
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public CreateDataclassTypeRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 类型启用禁用状态，启用：true，禁用：false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateDataclassTypeRequestBody withSla(Long sla) {
        this.sla = sla;
        return this;
    }

    /**
     * 响应时长
     * minimum: 0
     * maximum: 15634800000
     * @return sla
     */
    public Long getSla() {
        return sla;
    }

    public void setSla(Long sla) {
        this.sla = sla;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataclassTypeRequestBody that = (CreateDataclassTypeRequestBody) obj;
        return Objects.equals(this.subCategory, that.subCategory)
            && Objects.equals(this.subCategoryCode, that.subCategoryCode)
            && Objects.equals(this.category, that.category) && Objects.equals(this.categoryCode, that.categoryCode)
            && Objects.equals(this.name, that.name) && Objects.equals(this.businessCode, that.businessCode)
            && Objects.equals(this.dataclassBusinessCode, that.dataclassBusinessCode)
            && Objects.equals(this.description, that.description) && Objects.equals(this.level, that.level)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.sla, that.sla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCategory,
            subCategoryCode,
            category,
            categoryCode,
            name,
            businessCode,
            dataclassBusinessCode,
            description,
            level,
            enabled,
            sla);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataclassTypeRequestBody {\n");
        sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
        sb.append("    subCategoryCode: ").append(toIndentedString(subCategoryCode)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
        sb.append("    dataclassBusinessCode: ").append(toIndentedString(dataclassBusinessCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
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

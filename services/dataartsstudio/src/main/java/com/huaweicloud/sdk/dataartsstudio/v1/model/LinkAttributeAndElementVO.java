package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性ID列表。
 */
public class LinkAttributeAndElementVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stand_row_id")

    private String standRowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    /**
     * 表类型，默认是TABLE_MODEL。 枚举值：   - TABLE_MODEL: 关系模型（逻辑模型/物理模型）   - AGGREGATION_LOGIC_TABLE: 汇总表   - FACT_LOGIC_TABLE: 事实表   - DIMENSION: 维度   - DIMENSION_LOGIC_TABLE: 维度表 
     */
    public static final class BizTypeEnum {

        /**
         * Enum TABLE_MODEL for value: "TABLE_MODEL"
         */
        public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

        /**
         * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
         */
        public static final BizTypeEnum AGGREGATION_LOGIC_TABLE = new BizTypeEnum("AGGREGATION_LOGIC_TABLE");

        /**
         * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
         */
        public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

        /**
         * Enum DIMENSION for value: "DIMENSION"
         */
        public static final BizTypeEnum DIMENSION = new BizTypeEnum("DIMENSION");

        /**
         * Enum DIMENSION_LOGIC_TABLE for value: "DIMENSION_LOGIC_TABLE"
         */
        public static final BizTypeEnum DIMENSION_LOGIC_TABLE = new BizTypeEnum("DIMENSION_LOGIC_TABLE");

        private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeEnum> createStaticFields() {
            Map<String, BizTypeEnum> map = new HashMap<>();
            map.put("TABLE_MODEL", TABLE_MODEL);
            map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
            map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
            map.put("DIMENSION", DIMENSION);
            map.put("DIMENSION_LOGIC_TABLE", DIMENSION_LOGIC_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BizTypeEnum(String value) {
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
        public static BizTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BizTypeEnum(value));
        }

        public static BizTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BizTypeEnum) {
                return this.value.equals(((BizTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    public LinkAttributeAndElementVO withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public LinkAttributeAndElementVO addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public LinkAttributeAndElementVO withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 属性ID列表，ID字符串。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public LinkAttributeAndElementVO withStandRowId(String standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的ID，ID字符串。
     * @return standRowId
     */
    public String getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(String standRowId) {
        this.standRowId = standRowId;
    }

    public LinkAttributeAndElementVO withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID，ID字符串。
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public LinkAttributeAndElementVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 表类型，默认是TABLE_MODEL。 枚举值：   - TABLE_MODEL: 关系模型（逻辑模型/物理模型）   - AGGREGATION_LOGIC_TABLE: 汇总表   - FACT_LOGIC_TABLE: 事实表   - DIMENSION: 维度   - DIMENSION_LOGIC_TABLE: 维度表 
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkAttributeAndElementVO that = (LinkAttributeAndElementVO) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.standRowId, that.standRowId)
            && Objects.equals(this.tableId, that.tableId) && Objects.equals(this.bizType, that.bizType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, standRowId, tableId, bizType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkAttributeAndElementVO {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
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

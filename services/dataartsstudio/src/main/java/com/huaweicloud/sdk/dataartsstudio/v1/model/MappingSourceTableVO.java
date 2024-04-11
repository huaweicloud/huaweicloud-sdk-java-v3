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
 * MappingSourceTableVO
 */
public class MappingSourceTableVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table1_id")

    private Long table1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table2_id")

    private Long table2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table1_name")

    private String table1Name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table2_name")

    private String table2Name;

    /**
     * 关联类型。LEFT(左外连接)、RIGHT(右外连接)、INNER(内连接)、FULL(全连接)。
     */
    public static final class JoinTypeEnum {

        /**
         * Enum LEFT for value: "LEFT"
         */
        public static final JoinTypeEnum LEFT = new JoinTypeEnum("LEFT");

        /**
         * Enum RIGHT for value: "RIGHT"
         */
        public static final JoinTypeEnum RIGHT = new JoinTypeEnum("RIGHT");

        /**
         * Enum INNER for value: "INNER"
         */
        public static final JoinTypeEnum INNER = new JoinTypeEnum("INNER");

        /**
         * Enum FULL for value: "FULL"
         */
        public static final JoinTypeEnum FULL = new JoinTypeEnum("FULL");

        private static final Map<String, JoinTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JoinTypeEnum> createStaticFields() {
            Map<String, JoinTypeEnum> map = new HashMap<>();
            map.put("LEFT", LEFT);
            map.put("RIGHT", RIGHT);
            map.put("INNER", INNER);
            map.put("FULL", FULL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JoinTypeEnum(String value) {
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
        public static JoinTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JoinTypeEnum(value));
        }

        public static JoinTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JoinTypeEnum) {
                return this.value.equals(((JoinTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_type")

    private JoinTypeEnum joinType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_fields")

    private List<MappingJoinFieldVO> joinFields = null;

    public MappingSourceTableVO withTable1Id(Long table1Id) {
        this.table1Id = table1Id;
        return this;
    }

    /**
     * 表1ID。
     * @return table1Id
     */
    public Long getTable1Id() {
        return table1Id;
    }

    public void setTable1Id(Long table1Id) {
        this.table1Id = table1Id;
    }

    public MappingSourceTableVO withTable2Id(Long table2Id) {
        this.table2Id = table2Id;
        return this;
    }

    /**
     * 表2ID。
     * @return table2Id
     */
    public Long getTable2Id() {
        return table2Id;
    }

    public void setTable2Id(Long table2Id) {
        this.table2Id = table2Id;
    }

    public MappingSourceTableVO withTable1Name(String table1Name) {
        this.table1Name = table1Name;
        return this;
    }

    /**
     * 表1名称。
     * @return table1Name
     */
    public String getTable1Name() {
        return table1Name;
    }

    public void setTable1Name(String table1Name) {
        this.table1Name = table1Name;
    }

    public MappingSourceTableVO withTable2Name(String table2Name) {
        this.table2Name = table2Name;
        return this;
    }

    /**
     * 表2名称。
     * @return table2Name
     */
    public String getTable2Name() {
        return table2Name;
    }

    public void setTable2Name(String table2Name) {
        this.table2Name = table2Name;
    }

    public MappingSourceTableVO withJoinType(JoinTypeEnum joinType) {
        this.joinType = joinType;
        return this;
    }

    /**
     * 关联类型。LEFT(左外连接)、RIGHT(右外连接)、INNER(内连接)、FULL(全连接)。
     * @return joinType
     */
    public JoinTypeEnum getJoinType() {
        return joinType;
    }

    public void setJoinType(JoinTypeEnum joinType) {
        this.joinType = joinType;
    }

    public MappingSourceTableVO withJoinFields(List<MappingJoinFieldVO> joinFields) {
        this.joinFields = joinFields;
        return this;
    }

    public MappingSourceTableVO addJoinFieldsItem(MappingJoinFieldVO joinFieldsItem) {
        if (this.joinFields == null) {
            this.joinFields = new ArrayList<>();
        }
        this.joinFields.add(joinFieldsItem);
        return this;
    }

    public MappingSourceTableVO withJoinFields(Consumer<List<MappingJoinFieldVO>> joinFieldsSetter) {
        if (this.joinFields == null) {
            this.joinFields = new ArrayList<>();
        }
        joinFieldsSetter.accept(this.joinFields);
        return this;
    }

    /**
     * on条件。
     * @return joinFields
     */
    public List<MappingJoinFieldVO> getJoinFields() {
        return joinFields;
    }

    public void setJoinFields(List<MappingJoinFieldVO> joinFields) {
        this.joinFields = joinFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MappingSourceTableVO that = (MappingSourceTableVO) obj;
        return Objects.equals(this.table1Id, that.table1Id) && Objects.equals(this.table2Id, that.table2Id)
            && Objects.equals(this.table1Name, that.table1Name) && Objects.equals(this.table2Name, that.table2Name)
            && Objects.equals(this.joinType, that.joinType) && Objects.equals(this.joinFields, that.joinFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table1Id, table2Id, table1Name, table2Name, joinType, joinFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingSourceTableVO {\n");
        sb.append("    table1Id: ").append(toIndentedString(table1Id)).append("\n");
        sb.append("    table2Id: ").append(toIndentedString(table2Id)).append("\n");
        sb.append("    table1Name: ").append(toIndentedString(table1Name)).append("\n");
        sb.append("    table2Name: ").append(toIndentedString(table2Name)).append("\n");
        sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
        sb.append("    joinFields: ").append(toIndentedString(joinFields)).append("\n");
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

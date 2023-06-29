package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TicsDatasetColumn
 */
public class TicsDatasetColumn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_id")

    private String dataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    /**
     * 学习数据集标签类型，UNIQUE_ID.唯一标识,FEATURE.特征,LABEL.标签,FILTER.过滤字段
     */
    public static final class FlLabelTypeEnum {

        /**
         * Enum FEATURE for value: "FEATURE"
         */
        public static final FlLabelTypeEnum FEATURE = new FlLabelTypeEnum("FEATURE");

        /**
         * Enum FILTER for value: "FILTER"
         */
        public static final FlLabelTypeEnum FILTER = new FlLabelTypeEnum("FILTER");

        /**
         * Enum LABEL for value: "LABEL"
         */
        public static final FlLabelTypeEnum LABEL = new FlLabelTypeEnum("LABEL");

        /**
         * Enum UNIQUE_ID for value: "UNIQUE_ID"
         */
        public static final FlLabelTypeEnum UNIQUE_ID = new FlLabelTypeEnum("UNIQUE_ID");

        private static final Map<String, FlLabelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlLabelTypeEnum> createStaticFields() {
            Map<String, FlLabelTypeEnum> map = new HashMap<>();
            map.put("FEATURE", FEATURE);
            map.put("FILTER", FILTER);
            map.put("LABEL", LABEL);
            map.put("UNIQUE_ID", UNIQUE_ID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlLabelTypeEnum(String value) {
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
        public static FlLabelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlLabelTypeEnum(value));
        }

        public static FlLabelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlLabelTypeEnum) {
                return this.value.equals(((FlLabelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fl_label_type")

    private FlLabelTypeEnum flLabelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_discrete")

    private Boolean isDiscrete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    /**
     * 隐私策略，HASH.哈希处理，MASK.掩码，NONE.不处理
     */
    public static final class PrivacyPolicyEnum {

        /**
         * Enum HASH for value: "HASH"
         */
        public static final PrivacyPolicyEnum HASH = new PrivacyPolicyEnum("HASH");

        /**
         * Enum MASK for value: "MASK"
         */
        public static final PrivacyPolicyEnum MASK = new PrivacyPolicyEnum("MASK");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final PrivacyPolicyEnum NONE = new PrivacyPolicyEnum("NONE");

        private static final Map<String, PrivacyPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrivacyPolicyEnum> createStaticFields() {
            Map<String, PrivacyPolicyEnum> map = new HashMap<>();
            map.put("HASH", HASH);
            map.put("MASK", MASK);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrivacyPolicyEnum(String value) {
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
        public static PrivacyPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrivacyPolicyEnum(value));
        }

        public static PrivacyPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrivacyPolicyEnum) {
                return this.value.equals(((PrivacyPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_policy")

    private PrivacyPolicyEnum privacyPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_policy_ext")

    private String privacyPolicyExt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sacle")

    private Integer sacle;

    /**
     * 分析数据集字段隐私类别，NON_SENSITIVE.非敏感，SENSITIVE.敏感，UNIQUE_ID.唯一主键
     */
    public static final class SqlColPrivacyTypeEnum {

        /**
         * Enum NON_SENSITIVE for value: "NON_SENSITIVE"
         */
        public static final SqlColPrivacyTypeEnum NON_SENSITIVE = new SqlColPrivacyTypeEnum("NON_SENSITIVE");

        /**
         * Enum SENSITIVE for value: "SENSITIVE"
         */
        public static final SqlColPrivacyTypeEnum SENSITIVE = new SqlColPrivacyTypeEnum("SENSITIVE");

        /**
         * Enum UNIQUE_ID for value: "UNIQUE_ID"
         */
        public static final SqlColPrivacyTypeEnum UNIQUE_ID = new SqlColPrivacyTypeEnum("UNIQUE_ID");

        private static final Map<String, SqlColPrivacyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlColPrivacyTypeEnum> createStaticFields() {
            Map<String, SqlColPrivacyTypeEnum> map = new HashMap<>();
            map.put("NON_SENSITIVE", NON_SENSITIVE);
            map.put("SENSITIVE", SENSITIVE);
            map.put("UNIQUE_ID", UNIQUE_ID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SqlColPrivacyTypeEnum(String value) {
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
        public static SqlColPrivacyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlColPrivacyTypeEnum(value));
        }

        public static SqlColPrivacyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlColPrivacyTypeEnum) {
                return this.value.equals(((SqlColPrivacyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_col_privacy_type")

    private SqlColPrivacyTypeEnum sqlColPrivacyType;

    public TicsDatasetColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 字段名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public TicsDatasetColumn withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 备注信息
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TicsDatasetColumn withDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * 数据集id
     * @return dataId
     */
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public TicsDatasetColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 字段类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public TicsDatasetColumn withFlLabelType(FlLabelTypeEnum flLabelType) {
        this.flLabelType = flLabelType;
        return this;
    }

    /**
     * 学习数据集标签类型，UNIQUE_ID.唯一标识,FEATURE.特征,LABEL.标签,FILTER.过滤字段
     * @return flLabelType
     */
    public FlLabelTypeEnum getFlLabelType() {
        return flLabelType;
    }

    public void setFlLabelType(FlLabelTypeEnum flLabelType) {
        this.flLabelType = flLabelType;
    }

    public TicsDatasetColumn withIsDiscrete(Boolean isDiscrete) {
        this.isDiscrete = isDiscrete;
        return this;
    }

    /**
     * 是否离散
     * @return isDiscrete
     */
    public Boolean getIsDiscrete() {
        return isDiscrete;
    }

    public void setIsDiscrete(Boolean isDiscrete) {
        this.isDiscrete = isDiscrete;
    }

    public TicsDatasetColumn withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 长度
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public TicsDatasetColumn withPrivacyPolicy(PrivacyPolicyEnum privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        return this;
    }

    /**
     * 隐私策略，HASH.哈希处理，MASK.掩码，NONE.不处理
     * @return privacyPolicy
     */
    public PrivacyPolicyEnum getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void setPrivacyPolicy(PrivacyPolicyEnum privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public TicsDatasetColumn withPrivacyPolicyExt(String privacyPolicyExt) {
        this.privacyPolicyExt = privacyPolicyExt;
        return this;
    }

    /**
     * 隐私策略描述
     * @return privacyPolicyExt
     */
    public String getPrivacyPolicyExt() {
        return privacyPolicyExt;
    }

    public void setPrivacyPolicyExt(String privacyPolicyExt) {
        this.privacyPolicyExt = privacyPolicyExt;
    }

    public TicsDatasetColumn withSacle(Integer sacle) {
        this.sacle = sacle;
        return this;
    }

    /**
     * 精度
     * @return sacle
     */
    public Integer getSacle() {
        return sacle;
    }

    public void setSacle(Integer sacle) {
        this.sacle = sacle;
    }

    public TicsDatasetColumn withSqlColPrivacyType(SqlColPrivacyTypeEnum sqlColPrivacyType) {
        this.sqlColPrivacyType = sqlColPrivacyType;
        return this;
    }

    /**
     * 分析数据集字段隐私类别，NON_SENSITIVE.非敏感，SENSITIVE.敏感，UNIQUE_ID.唯一主键
     * @return sqlColPrivacyType
     */
    public SqlColPrivacyTypeEnum getSqlColPrivacyType() {
        return sqlColPrivacyType;
    }

    public void setSqlColPrivacyType(SqlColPrivacyTypeEnum sqlColPrivacyType) {
        this.sqlColPrivacyType = sqlColPrivacyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsDatasetColumn that = (TicsDatasetColumn) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.comments, that.comments)
            && Objects.equals(this.dataId, that.dataId) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.flLabelType, that.flLabelType) && Objects.equals(this.isDiscrete, that.isDiscrete)
            && Objects.equals(this.length, that.length) && Objects.equals(this.privacyPolicy, that.privacyPolicy)
            && Objects.equals(this.privacyPolicyExt, that.privacyPolicyExt) && Objects.equals(this.sacle, that.sacle)
            && Objects.equals(this.sqlColPrivacyType, that.sqlColPrivacyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName,
            comments,
            dataId,
            dataType,
            flLabelType,
            isDiscrete,
            length,
            privacyPolicy,
            privacyPolicyExt,
            sacle,
            sqlColPrivacyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsDatasetColumn {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    flLabelType: ").append(toIndentedString(flLabelType)).append("\n");
        sb.append("    isDiscrete: ").append(toIndentedString(isDiscrete)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
        sb.append("    privacyPolicyExt: ").append(toIndentedString(privacyPolicyExt)).append("\n");
        sb.append("    sacle: ").append(toIndentedString(sacle)).append("\n");
        sb.append("    sqlColPrivacyType: ").append(toIndentedString(sqlColPrivacyType)).append("\n");
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

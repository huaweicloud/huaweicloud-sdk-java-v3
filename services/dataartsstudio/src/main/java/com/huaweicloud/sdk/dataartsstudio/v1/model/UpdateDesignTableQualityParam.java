package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateDesignTableQualityParam
 */
public class UpdateDesignTableQualityParam {

    /**
     * 表类型。 枚举值：   - TABLE_MODEL: 关系模型（逻辑模型/物理模型）   - AGGREGATION_LOGIC_TABLE: 汇总表   - FACT_LOGIC_TABLE: 事实表   - DIMENSION: 维度   - DIMENSION_LOGIC_TABLE: 维度表 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_switch")

    private Boolean dirtyOutSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_database")

    private String dirtyOutDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_prefix")

    private String dirtyOutPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_out_suffix")

    private String dirtyOutSuffix;

    public UpdateDesignTableQualityParam withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 表类型。 枚举值：   - TABLE_MODEL: 关系模型（逻辑模型/物理模型）   - AGGREGATION_LOGIC_TABLE: 汇总表   - FACT_LOGIC_TABLE: 事实表   - DIMENSION: 维度   - DIMENSION_LOGIC_TABLE: 维度表 
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public UpdateDesignTableQualityParam withDirtyOutSwitch(Boolean dirtyOutSwitch) {
        this.dirtyOutSwitch = dirtyOutSwitch;
        return this;
    }

    /**
     * 异常数据输出开关。
     * @return dirtyOutSwitch
     */
    public Boolean getDirtyOutSwitch() {
        return dirtyOutSwitch;
    }

    public void setDirtyOutSwitch(Boolean dirtyOutSwitch) {
        this.dirtyOutSwitch = dirtyOutSwitch;
    }

    public UpdateDesignTableQualityParam withDirtyOutDatabase(String dirtyOutDatabase) {
        this.dirtyOutDatabase = dirtyOutDatabase;
        return this;
    }

    /**
     * 异常数据输出库。
     * @return dirtyOutDatabase
     */
    public String getDirtyOutDatabase() {
        return dirtyOutDatabase;
    }

    public void setDirtyOutDatabase(String dirtyOutDatabase) {
        this.dirtyOutDatabase = dirtyOutDatabase;
    }

    public UpdateDesignTableQualityParam withDirtyOutPrefix(String dirtyOutPrefix) {
        this.dirtyOutPrefix = dirtyOutPrefix;
        return this;
    }

    /**
     * 异常表前缀。
     * @return dirtyOutPrefix
     */
    public String getDirtyOutPrefix() {
        return dirtyOutPrefix;
    }

    public void setDirtyOutPrefix(String dirtyOutPrefix) {
        this.dirtyOutPrefix = dirtyOutPrefix;
    }

    public UpdateDesignTableQualityParam withDirtyOutSuffix(String dirtyOutSuffix) {
        this.dirtyOutSuffix = dirtyOutSuffix;
        return this;
    }

    /**
     * 异常表后缀。
     * @return dirtyOutSuffix
     */
    public String getDirtyOutSuffix() {
        return dirtyOutSuffix;
    }

    public void setDirtyOutSuffix(String dirtyOutSuffix) {
        this.dirtyOutSuffix = dirtyOutSuffix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDesignTableQualityParam that = (UpdateDesignTableQualityParam) obj;
        return Objects.equals(this.bizType, that.bizType) && Objects.equals(this.dirtyOutSwitch, that.dirtyOutSwitch)
            && Objects.equals(this.dirtyOutDatabase, that.dirtyOutDatabase)
            && Objects.equals(this.dirtyOutPrefix, that.dirtyOutPrefix)
            && Objects.equals(this.dirtyOutSuffix, that.dirtyOutSuffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bizType, dirtyOutSwitch, dirtyOutDatabase, dirtyOutPrefix, dirtyOutSuffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesignTableQualityParam {\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    dirtyOutSwitch: ").append(toIndentedString(dirtyOutSwitch)).append("\n");
        sb.append("    dirtyOutDatabase: ").append(toIndentedString(dirtyOutDatabase)).append("\n");
        sb.append("    dirtyOutPrefix: ").append(toIndentedString(dirtyOutPrefix)).append("\n");
        sb.append("    dirtyOutSuffix: ").append(toIndentedString(dirtyOutSuffix)).append("\n");
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

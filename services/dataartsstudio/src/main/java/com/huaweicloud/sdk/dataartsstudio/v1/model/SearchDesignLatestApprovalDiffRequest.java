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
 * Request Object
 */
public class SearchDesignLatestApprovalDiffRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    /**
     * 待删除下展的实体类型。 枚举值：   - ATOMIC_INDEX: 原子指标   - DERIVATIVE_INDEX: 衍生指标   - DIMENSION: 维度   - FACT_LOGIC_TABLE: 事实表   - TABLE_MODEL:关系建模：逻辑实体/物理表   - STANDARD_ELEMENT: 数据标准   - AGGREGATION_LOGIC_TABLE: 汇总表   - CODE_TABLE: 码表   - BIZ_METRIC: 业务指标   - COMPOUND_METRIC: 复合指标 
     */
    public static final class BizTypeEnum {

        /**
         * Enum ATOMIC_INDEX for value: "ATOMIC_INDEX"
         */
        public static final BizTypeEnum ATOMIC_INDEX = new BizTypeEnum("ATOMIC_INDEX");

        /**
         * Enum DERIVATIVE_INDEX for value: "DERIVATIVE_INDEX"
         */
        public static final BizTypeEnum DERIVATIVE_INDEX = new BizTypeEnum("DERIVATIVE_INDEX");

        /**
         * Enum DIMENSION for value: "DIMENSION"
         */
        public static final BizTypeEnum DIMENSION = new BizTypeEnum("DIMENSION");

        /**
         * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
         */
        public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

        /**
         * Enum TABLE_MODEL for value: "TABLE_MODEL"
         */
        public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

        /**
         * Enum STANDARD_ELEMENT for value: "STANDARD_ELEMENT"
         */
        public static final BizTypeEnum STANDARD_ELEMENT = new BizTypeEnum("STANDARD_ELEMENT");

        /**
         * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
         */
        public static final BizTypeEnum AGGREGATION_LOGIC_TABLE = new BizTypeEnum("AGGREGATION_LOGIC_TABLE");

        /**
         * Enum CODE_TABLE for value: "CODE_TABLE"
         */
        public static final BizTypeEnum CODE_TABLE = new BizTypeEnum("CODE_TABLE");

        /**
         * Enum BIZ_METRIC for value: "BIZ_METRIC"
         */
        public static final BizTypeEnum BIZ_METRIC = new BizTypeEnum("BIZ_METRIC");

        /**
         * Enum COMPOUND_METRIC for value: "COMPOUND_METRIC"
         */
        public static final BizTypeEnum COMPOUND_METRIC = new BizTypeEnum("COMPOUND_METRIC");

        private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeEnum> createStaticFields() {
            Map<String, BizTypeEnum> map = new HashMap<>();
            map.put("ATOMIC_INDEX", ATOMIC_INDEX);
            map.put("DERIVATIVE_INDEX", DERIVATIVE_INDEX);
            map.put("DIMENSION", DIMENSION);
            map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
            map.put("TABLE_MODEL", TABLE_MODEL);
            map.put("STANDARD_ELEMENT", STANDARD_ELEMENT);
            map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
            map.put("CODE_TABLE", CODE_TABLE);
            map.put("BIZ_METRIC", BIZ_METRIC);
            map.put("COMPOUND_METRIC", COMPOUND_METRIC);
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

    public SearchDesignLatestApprovalDiffRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public SearchDesignLatestApprovalDiffRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public SearchDesignLatestApprovalDiffRequest withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 待比较下展的实体ID，填写String类型替代Long类型。
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public SearchDesignLatestApprovalDiffRequest withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 待删除下展的实体类型。 枚举值：   - ATOMIC_INDEX: 原子指标   - DERIVATIVE_INDEX: 衍生指标   - DIMENSION: 维度   - FACT_LOGIC_TABLE: 事实表   - TABLE_MODEL:关系建模：逻辑实体/物理表   - STANDARD_ELEMENT: 数据标准   - AGGREGATION_LOGIC_TABLE: 汇总表   - CODE_TABLE: 码表   - BIZ_METRIC: 业务指标   - COMPOUND_METRIC: 复合指标 
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
        SearchDesignLatestApprovalDiffRequest that = (SearchDesignLatestApprovalDiffRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.bizId, that.bizId) && Objects.equals(this.bizType, that.bizType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, bizId, bizType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchDesignLatestApprovalDiffRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
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

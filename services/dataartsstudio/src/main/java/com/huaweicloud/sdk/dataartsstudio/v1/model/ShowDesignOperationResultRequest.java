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
public class ShowDesignOperationResultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    /**
     * 批量操作类型。 枚举值：   - PUBLISH: 发布   - ADD_TAGS: 打标签   - APPROVAL: 审批   - ER_REVERSE_DB: 关系建模逆向数据库   - CODETABLE_REVERSE_DB: 码表逆向数据库   - DIMENSION_REVERSE_DB: 维度逆向数据库   - FACT_LOGIC_TABLE_REVERSE_DB: 事实表逆向数据库   - SYNC_TABLES: 同步元模型   - IMPORT_STANDARD: 导入数据标准   - IMPORT_CODETABLE: 导入码表   - IMPORT_ER_TABLE: 导入关系建模（逻辑实体/物理表）   - IMPORT_BUSINESS: 导入业务分层（主题）   - TRANSFORM_LOGIC_MODEL: 逻辑模型转物理模型   - PUBLISH_CODETABLE: 发布码表   - PUBLISH_STANDARD: 发布数据标准   - TABLE_MODEL_RELOCATE: 关系建模业务表批量修改主题   - DIMENSION_RELOCATE: 维度批量修改主题   - FACT_LOGIC_TABLE_RELOCATE: 事实表批量修改主题   - AGGREGATION_LOGIC_TABLE_RELOCATE: 汇总表批量修改主题   - ATOMIC_INDEX_RELOCATE: 原子指标批量修改主题   - DERIVATIVE_INDEX_RELOCATE: 衍生指标批量修改主题   - COMPOUND_METRIC_RELOCATE: 复合指标批量修改主题   - BIZ_METRIC_RELOCATE: 业务指标批量修改流程   - CODE_TABLE_RELOCATE: 码表批量修改目录   - STANDARD_ELEMENT_RELOCATE: 数据标准批量修改目录   - INFO_ARCH_RELOCATE: 信息架构批量修改主题 
     */
    public static final class OperationTypeEnum {

        /**
         * Enum PUBLISH for value: "PUBLISH"
         */
        public static final OperationTypeEnum PUBLISH = new OperationTypeEnum("PUBLISH");

        /**
         * Enum ADD_TAGS for value: "ADD_TAGS"
         */
        public static final OperationTypeEnum ADD_TAGS = new OperationTypeEnum("ADD_TAGS");

        /**
         * Enum APPROVAL for value: "APPROVAL"
         */
        public static final OperationTypeEnum APPROVAL = new OperationTypeEnum("APPROVAL");

        /**
         * Enum ER_REVERSE_DB for value: "ER_REVERSE_DB"
         */
        public static final OperationTypeEnum ER_REVERSE_DB = new OperationTypeEnum("ER_REVERSE_DB");

        /**
         * Enum CODETABLE_REVERSE_DB for value: "CODETABLE_REVERSE_DB"
         */
        public static final OperationTypeEnum CODETABLE_REVERSE_DB = new OperationTypeEnum("CODETABLE_REVERSE_DB");

        /**
         * Enum DIMENSION_REVERSE_DB for value: "DIMENSION_REVERSE_DB"
         */
        public static final OperationTypeEnum DIMENSION_REVERSE_DB = new OperationTypeEnum("DIMENSION_REVERSE_DB");

        /**
         * Enum FACT_LOGIC_TABLE_REVERSE_DB for value: "FACT_LOGIC_TABLE_REVERSE_DB"
         */
        public static final OperationTypeEnum FACT_LOGIC_TABLE_REVERSE_DB =
            new OperationTypeEnum("FACT_LOGIC_TABLE_REVERSE_DB");

        /**
         * Enum SYNC_TABLES for value: "SYNC_TABLES"
         */
        public static final OperationTypeEnum SYNC_TABLES = new OperationTypeEnum("SYNC_TABLES");

        /**
         * Enum IMPORT_STANDARD for value: "IMPORT_STANDARD"
         */
        public static final OperationTypeEnum IMPORT_STANDARD = new OperationTypeEnum("IMPORT_STANDARD");

        /**
         * Enum IMPORT_CODETABLE for value: "IMPORT_CODETABLE"
         */
        public static final OperationTypeEnum IMPORT_CODETABLE = new OperationTypeEnum("IMPORT_CODETABLE");

        /**
         * Enum IMPORT_ER_TABLE for value: "IMPORT_ER_TABLE"
         */
        public static final OperationTypeEnum IMPORT_ER_TABLE = new OperationTypeEnum("IMPORT_ER_TABLE");

        /**
         * Enum IMPORT_BUSINESS for value: "IMPORT_BUSINESS"
         */
        public static final OperationTypeEnum IMPORT_BUSINESS = new OperationTypeEnum("IMPORT_BUSINESS");

        /**
         * Enum TRANSFORM_LOGIC_MODEL for value: "TRANSFORM_LOGIC_MODEL"
         */
        public static final OperationTypeEnum TRANSFORM_LOGIC_MODEL = new OperationTypeEnum("TRANSFORM_LOGIC_MODEL");

        /**
         * Enum PUBLISH_CODETABLE for value: "PUBLISH_CODETABLE"
         */
        public static final OperationTypeEnum PUBLISH_CODETABLE = new OperationTypeEnum("PUBLISH_CODETABLE");

        /**
         * Enum PUBLISH_STANDARD for value: "PUBLISH_STANDARD"
         */
        public static final OperationTypeEnum PUBLISH_STANDARD = new OperationTypeEnum("PUBLISH_STANDARD");

        /**
         * Enum TABLE_MODEL_RELOCATE for value: "TABLE_MODEL_RELOCATE"
         */
        public static final OperationTypeEnum TABLE_MODEL_RELOCATE = new OperationTypeEnum("TABLE_MODEL_RELOCATE");

        /**
         * Enum DIMENSION_RELOCATE for value: "DIMENSION_RELOCATE"
         */
        public static final OperationTypeEnum DIMENSION_RELOCATE = new OperationTypeEnum("DIMENSION_RELOCATE");

        /**
         * Enum FACT_LOGIC_TABLE_RELOCATE for value: "FACT_LOGIC_TABLE_RELOCATE"
         */
        public static final OperationTypeEnum FACT_LOGIC_TABLE_RELOCATE =
            new OperationTypeEnum("FACT_LOGIC_TABLE_RELOCATE");

        /**
         * Enum AGGREGATION_LOGIC_TABLE_RELOCATE for value: "AGGREGATION_LOGIC_TABLE_RELOCATE"
         */
        public static final OperationTypeEnum AGGREGATION_LOGIC_TABLE_RELOCATE =
            new OperationTypeEnum("AGGREGATION_LOGIC_TABLE_RELOCATE");

        /**
         * Enum ATOMIC_INDEX_RELOCATE for value: "ATOMIC_INDEX_RELOCATE"
         */
        public static final OperationTypeEnum ATOMIC_INDEX_RELOCATE = new OperationTypeEnum("ATOMIC_INDEX_RELOCATE");

        /**
         * Enum DERIVATIVE_INDEX_RELOCATE for value: "DERIVATIVE_INDEX_RELOCATE"
         */
        public static final OperationTypeEnum DERIVATIVE_INDEX_RELOCATE =
            new OperationTypeEnum("DERIVATIVE_INDEX_RELOCATE");

        /**
         * Enum COMPOUND_METRIC_RELOCATE for value: "COMPOUND_METRIC_RELOCATE"
         */
        public static final OperationTypeEnum COMPOUND_METRIC_RELOCATE =
            new OperationTypeEnum("COMPOUND_METRIC_RELOCATE");

        /**
         * Enum BIZ_METRIC_RELOCATE for value: "BIZ_METRIC_RELOCATE"
         */
        public static final OperationTypeEnum BIZ_METRIC_RELOCATE = new OperationTypeEnum("BIZ_METRIC_RELOCATE");

        /**
         * Enum CODE_TABLE_RELOCATE for value: "CODE_TABLE_RELOCATE"
         */
        public static final OperationTypeEnum CODE_TABLE_RELOCATE = new OperationTypeEnum("CODE_TABLE_RELOCATE");

        /**
         * Enum STANDARD_ELEMENT_RELOCATE for value: "STANDARD_ELEMENT_RELOCATE"
         */
        public static final OperationTypeEnum STANDARD_ELEMENT_RELOCATE =
            new OperationTypeEnum("STANDARD_ELEMENT_RELOCATE");

        /**
         * Enum INFO_ARCH_RELOCATE for value: "INFO_ARCH_RELOCATE"
         */
        public static final OperationTypeEnum INFO_ARCH_RELOCATE = new OperationTypeEnum("INFO_ARCH_RELOCATE");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("PUBLISH", PUBLISH);
            map.put("ADD_TAGS", ADD_TAGS);
            map.put("APPROVAL", APPROVAL);
            map.put("ER_REVERSE_DB", ER_REVERSE_DB);
            map.put("CODETABLE_REVERSE_DB", CODETABLE_REVERSE_DB);
            map.put("DIMENSION_REVERSE_DB", DIMENSION_REVERSE_DB);
            map.put("FACT_LOGIC_TABLE_REVERSE_DB", FACT_LOGIC_TABLE_REVERSE_DB);
            map.put("SYNC_TABLES", SYNC_TABLES);
            map.put("IMPORT_STANDARD", IMPORT_STANDARD);
            map.put("IMPORT_CODETABLE", IMPORT_CODETABLE);
            map.put("IMPORT_ER_TABLE", IMPORT_ER_TABLE);
            map.put("IMPORT_BUSINESS", IMPORT_BUSINESS);
            map.put("TRANSFORM_LOGIC_MODEL", TRANSFORM_LOGIC_MODEL);
            map.put("PUBLISH_CODETABLE", PUBLISH_CODETABLE);
            map.put("PUBLISH_STANDARD", PUBLISH_STANDARD);
            map.put("TABLE_MODEL_RELOCATE", TABLE_MODEL_RELOCATE);
            map.put("DIMENSION_RELOCATE", DIMENSION_RELOCATE);
            map.put("FACT_LOGIC_TABLE_RELOCATE", FACT_LOGIC_TABLE_RELOCATE);
            map.put("AGGREGATION_LOGIC_TABLE_RELOCATE", AGGREGATION_LOGIC_TABLE_RELOCATE);
            map.put("ATOMIC_INDEX_RELOCATE", ATOMIC_INDEX_RELOCATE);
            map.put("DERIVATIVE_INDEX_RELOCATE", DERIVATIVE_INDEX_RELOCATE);
            map.put("COMPOUND_METRIC_RELOCATE", COMPOUND_METRIC_RELOCATE);
            map.put("BIZ_METRIC_RELOCATE", BIZ_METRIC_RELOCATE);
            map.put("CODE_TABLE_RELOCATE", CODE_TABLE_RELOCATE);
            map.put("STANDARD_ELEMENT_RELOCATE", STANDARD_ELEMENT_RELOCATE);
            map.put("INFO_ARCH_RELOCATE", INFO_ARCH_RELOCATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    public ShowDesignOperationResultRequest withWorkspace(String workspace) {
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

    public ShowDesignOperationResultRequest withXProjectId(String xProjectId) {
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

    public ShowDesignOperationResultRequest withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 批量操作类型。 枚举值：   - PUBLISH: 发布   - ADD_TAGS: 打标签   - APPROVAL: 审批   - ER_REVERSE_DB: 关系建模逆向数据库   - CODETABLE_REVERSE_DB: 码表逆向数据库   - DIMENSION_REVERSE_DB: 维度逆向数据库   - FACT_LOGIC_TABLE_REVERSE_DB: 事实表逆向数据库   - SYNC_TABLES: 同步元模型   - IMPORT_STANDARD: 导入数据标准   - IMPORT_CODETABLE: 导入码表   - IMPORT_ER_TABLE: 导入关系建模（逻辑实体/物理表）   - IMPORT_BUSINESS: 导入业务分层（主题）   - TRANSFORM_LOGIC_MODEL: 逻辑模型转物理模型   - PUBLISH_CODETABLE: 发布码表   - PUBLISH_STANDARD: 发布数据标准   - TABLE_MODEL_RELOCATE: 关系建模业务表批量修改主题   - DIMENSION_RELOCATE: 维度批量修改主题   - FACT_LOGIC_TABLE_RELOCATE: 事实表批量修改主题   - AGGREGATION_LOGIC_TABLE_RELOCATE: 汇总表批量修改主题   - ATOMIC_INDEX_RELOCATE: 原子指标批量修改主题   - DERIVATIVE_INDEX_RELOCATE: 衍生指标批量修改主题   - COMPOUND_METRIC_RELOCATE: 复合指标批量修改主题   - BIZ_METRIC_RELOCATE: 业务指标批量修改流程   - CODE_TABLE_RELOCATE: 码表批量修改目录   - STANDARD_ELEMENT_RELOCATE: 数据标准批量修改目录   - INFO_ARCH_RELOCATE: 信息架构批量修改主题 
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public ShowDesignOperationResultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页查询条数，即查询Y条数据。默认值50，取值范围[1,100]。
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowDesignOperationResultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整，默认值0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowDesignOperationResultRequest withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 批量操作id，在逻辑模型转物理表时，填写的是逻辑模型的model_id，在逆向数据库时，填写的是目标模型的model_id。model_id可从接口[获取模型](ListWorkspaces.xml)中获取。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesignOperationResultRequest that = (ShowDesignOperationResultRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.operationId, that.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, operationType, limit, offset, operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesignOperationResultRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

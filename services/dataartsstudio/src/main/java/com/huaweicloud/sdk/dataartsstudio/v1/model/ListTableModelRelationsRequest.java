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
public class ListTableModelRelationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_ids")

    private String tableIds;

    /**
     * 表类型
     */
    public static final class BizTypeEnum {

        /**
         * Enum TABLE_MODEL for value: "TABLE_MODEL"
         */
        public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

        /**
         * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
         */
        public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

        private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeEnum> createStaticFields() {
            Map<String, BizTypeEnum> map = new HashMap<>();
            map.put("TABLE_MODEL", TABLE_MODEL);
            map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
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
            BizTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BizTypeEnum(value);
            }
            return result;
        }

        public static BizTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BizTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListTableModelRelationsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListTableModelRelationsRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 依据workspace id查工作区
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ListTableModelRelationsRequest withTableIds(String tableIds) {
        this.tableIds = tableIds;
        return this;
    }

    /**
     * 表模型ids
     * @return tableIds
     */
    public String getTableIds() {
        return tableIds;
    }

    public void setTableIds(String tableIds) {
        this.tableIds = tableIds;
    }

    public ListTableModelRelationsRequest withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 表类型
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public ListTableModelRelationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，即查询Y条数据。默认值50，取值范围[1,100]
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTableModelRelationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标，即跳过X条数据，仅支持0或limit的整数倍，不满足则向下取整。默认值0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTableModelRelationsRequest listTableModelRelationsRequest = (ListTableModelRelationsRequest) o;
        return Objects.equals(this.workspace, listTableModelRelationsRequest.workspace)
            && Objects.equals(this.modelId, listTableModelRelationsRequest.modelId)
            && Objects.equals(this.tableIds, listTableModelRelationsRequest.tableIds)
            && Objects.equals(this.bizType, listTableModelRelationsRequest.bizType)
            && Objects.equals(this.limit, listTableModelRelationsRequest.limit)
            && Objects.equals(this.offset, listTableModelRelationsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, modelId, tableIds, bizType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableModelRelationsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    tableIds: ").append(toIndentedString(tableIds)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

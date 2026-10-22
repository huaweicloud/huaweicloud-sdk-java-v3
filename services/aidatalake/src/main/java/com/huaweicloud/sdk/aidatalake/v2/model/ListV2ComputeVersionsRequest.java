package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2ComputeVersionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    /**
     * **参数解释**：操作结果，不传则查询所有状态的操作记录。 **约束限制**：不涉及。 **取值范围**：   - SUCCESS：操作成功。   - EXECUTING：执行中。   - FAILED：操作失败。 **默认取值**：不涉及。 
     */
    public static final class OperationResultEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final OperationResultEnum SUCCESS = new OperationResultEnum("SUCCESS");

        /**
         * Enum EXECUTING for value: "EXECUTING"
         */
        public static final OperationResultEnum EXECUTING = new OperationResultEnum("EXECUTING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final OperationResultEnum FAILED = new OperationResultEnum("FAILED");

        private static final Map<String, OperationResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationResultEnum> createStaticFields() {
            Map<String, OperationResultEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("EXECUTING", EXECUTING);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationResultEnum(String value) {
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
        public static OperationResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationResultEnum(value));
        }

        public static OperationResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationResultEnum) {
                return this.value.equals(((OperationResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_result")

    private OperationResultEnum operationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListV2ComputeVersionsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：**参数解释**：工作空间ID，可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。  **取值范围**：长度为32-36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListV2ComputeVersionsRequest withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。可通过[查询计算资源列表]获取计算资源ID(ListV2Computes.xml)。 **约束限制**：不涉及。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    public ListV2ComputeVersionsRequest withOperationResult(OperationResultEnum operationResult) {
        this.operationResult = operationResult;
        return this;
    }

    /**
     * **参数解释**：操作结果，不传则查询所有状态的操作记录。 **约束限制**：不涉及。 **取值范围**：   - SUCCESS：操作成功。   - EXECUTING：执行中。   - FAILED：操作失败。 **默认取值**：不涉及。 
     * @return operationResult
     */
    public OperationResultEnum getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(OperationResultEnum operationResult) {
        this.operationResult = operationResult;
    }

    public ListV2ComputeVersionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：0~1000000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListV2ComputeVersionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：1~100。 **默认取值**：10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2ComputeVersionsRequest that = (ListV2ComputeVersionsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.computeId, that.computeId)
            && Objects.equals(this.operationResult, that.operationResult) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, computeId, operationResult, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2ComputeVersionsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
        sb.append("    operationResult: ").append(toIndentedString(operationResult)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

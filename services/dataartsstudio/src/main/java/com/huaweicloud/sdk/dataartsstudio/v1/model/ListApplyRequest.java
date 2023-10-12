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
public class ListApplyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * dlm版本类型
     */
    public static final class DlmTypeEnum {

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final DlmTypeEnum SHARED = new DlmTypeEnum("SHARED");

        /**
         * Enum EXCLUSIVE for value: "EXCLUSIVE"
         */
        public static final DlmTypeEnum EXCLUSIVE = new DlmTypeEnum("EXCLUSIVE");

        private static final Map<String, DlmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DlmTypeEnum> createStaticFields() {
            Map<String, DlmTypeEnum> map = new HashMap<>();
            map.put("SHARED", SHARED);
            map.put("EXCLUSIVE", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DlmTypeEnum(String value) {
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
        public static DlmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DlmTypeEnum(value));
        }

        public static DlmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DlmTypeEnum) {
                return this.value.equals(((DlmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Dlm-Type")

    private DlmTypeEnum dlmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private Integer queryType;

    public ListApplyRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListApplyRequest withDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
        return this;
    }

    /**
     * dlm版本类型
     * @return dlmType
     */
    public DlmTypeEnum getDlmType() {
        return dlmType;
    }

    public void setDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
    }

    public ListApplyRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始坐标, 即跳过前X条数据。仅支持0或limit的整数倍，不满足则向下取整。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListApplyRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数, 即查询Y条数据
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListApplyRequest withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * api名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ListApplyRequest withQueryType(Integer queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型, 0:收到的申请(待审核), 1:收到的申请(已审核), 2:发出的申请(开发), 3:发出的申请(调用)
     * @return queryType
     */
    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplyRequest that = (ListApplyRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.dlmType, that.dlmType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.apiName, that.apiName) && Objects.equals(this.queryType, that.queryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dlmType, offset, limit, apiName, queryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplyRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dlmType: ").append(toIndentedString(dlmType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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

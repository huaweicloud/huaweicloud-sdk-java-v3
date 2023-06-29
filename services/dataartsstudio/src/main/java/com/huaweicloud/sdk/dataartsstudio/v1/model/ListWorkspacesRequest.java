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
public class ListWorkspacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * Gets or Sets workspaceType
     */
    public static final class WorkspaceTypeEnum {

        /**
         * Enum THIRD_NF for value: "THIRD_NF"
         */
        public static final WorkspaceTypeEnum THIRD_NF = new WorkspaceTypeEnum("THIRD_NF");

        /**
         * Enum DIMENSION for value: "DIMENSION"
         */
        public static final WorkspaceTypeEnum DIMENSION = new WorkspaceTypeEnum("DIMENSION");

        private static final Map<String, WorkspaceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WorkspaceTypeEnum> createStaticFields() {
            Map<String, WorkspaceTypeEnum> map = new HashMap<>();
            map.put("THIRD_NF", THIRD_NF);
            map.put("DIMENSION", DIMENSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WorkspaceTypeEnum(String value) {
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
        public static WorkspaceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WorkspaceTypeEnum(value));
        }

        public static WorkspaceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WorkspaceTypeEnum) {
                return this.value.equals(((WorkspaceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_type")

    private WorkspaceTypeEnum workspaceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    public ListWorkspacesRequest withWorkspace(String workspace) {
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

    public ListWorkspacesRequest withWorkspaceType(WorkspaceTypeEnum workspaceType) {
        this.workspaceType = workspaceType;
        return this;
    }

    /**
     * Get workspaceType
     * @return workspaceType
     */
    public WorkspaceTypeEnum getWorkspaceType() {
        return workspaceType;
    }

    public void setWorkspaceType(WorkspaceTypeEnum workspaceType) {
        this.workspaceType = workspaceType;
    }

    public ListWorkspacesRequest withLimit(Integer limit) {
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

    public ListWorkspacesRequest withOffset(Integer offset) {
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

    public ListWorkspacesRequest withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkspacesRequest that = (ListWorkspacesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.workspaceType, that.workspaceType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.dwType, that.dwType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, workspaceType, limit, offset, dwType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspacesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    workspaceType: ").append(toIndentedString(workspaceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
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

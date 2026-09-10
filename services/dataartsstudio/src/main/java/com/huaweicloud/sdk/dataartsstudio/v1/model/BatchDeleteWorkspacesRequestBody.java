package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除工作空间请求体
 */
public class BatchDeleteWorkspacesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_ids")

    private List<String> workspaceIds = null;

    public BatchDeleteWorkspacesRequestBody withWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }

    public BatchDeleteWorkspacesRequestBody addWorkspaceIdsItem(String workspaceIdsItem) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        this.workspaceIds.add(workspaceIdsItem);
        return this;
    }

    public BatchDeleteWorkspacesRequestBody withWorkspaceIds(Consumer<List<String>> workspaceIdsSetter) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        workspaceIdsSetter.accept(this.workspaceIds);
        return this;
    }

    /**
     * 待删除的工作空间ID列表，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspaceIds
     */
    public List<String> getWorkspaceIds() {
        return workspaceIds;
    }

    public void setWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteWorkspacesRequestBody that = (BatchDeleteWorkspacesRequestBody) obj;
        return Objects.equals(this.workspaceIds, that.workspaceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteWorkspacesRequestBody {\n");
        sb.append("    workspaceIds: ").append(toIndentedString(workspaceIds)).append("\n");
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

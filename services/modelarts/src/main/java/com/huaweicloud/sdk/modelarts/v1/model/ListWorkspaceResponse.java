package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<WorkspaceResponse> workspaces = null;

    public ListWorkspaceResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 工作空间的总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListWorkspaceResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 此次请求返回的工作空间个数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListWorkspaceResponse withWorkspaces(List<WorkspaceResponse> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public ListWorkspaceResponse addWorkspacesItem(WorkspaceResponse workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public ListWorkspaceResponse withWorkspaces(Consumer<List<WorkspaceResponse>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /**
     * workspace属性列表。
     * @return workspaces
     */
    public List<WorkspaceResponse> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<WorkspaceResponse> workspaces) {
        this.workspaces = workspaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkspaceResponse that = (ListWorkspaceResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.count, that.count)
            && Objects.equals(this.workspaces, that.workspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, count, workspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspaceResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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

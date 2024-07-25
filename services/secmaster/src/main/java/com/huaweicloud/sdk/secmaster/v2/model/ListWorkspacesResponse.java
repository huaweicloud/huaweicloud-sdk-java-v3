package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkspacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<CreateWorkspaceResponseBody> workspaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private BigDecimal count;

    public ListWorkspacesResponse withWorkspaces(List<CreateWorkspaceResponseBody> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public ListWorkspacesResponse addWorkspacesItem(CreateWorkspaceResponseBody workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public ListWorkspacesResponse withWorkspaces(Consumer<List<CreateWorkspaceResponseBody>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /**
     * 空间信息
     * @return workspaces
     */
    public List<CreateWorkspaceResponseBody> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<CreateWorkspaceResponseBody> workspaces) {
        this.workspaces = workspaces;
    }

    public ListWorkspacesResponse withCount(BigDecimal count) {
        this.count = count;
        return this;
    }

    /**
     * 数据总量
     * minimum: 2
     * maximum: 999999999
     * @return count
     */
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkspacesResponse that = (ListWorkspacesResponse) obj;
        return Objects.equals(this.workspaces, that.workspaces) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaces, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspacesResponse {\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkSpacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private WorkspaceListElem workspaces;

    public ListWorkSpacesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回总条目数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListWorkSpacesResponse withWorkspaces(WorkspaceListElem workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public ListWorkSpacesResponse withWorkspaces(Consumer<WorkspaceListElem> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new WorkspaceListElem();
            workspacesSetter.accept(this.workspaces);
        }

        return this;
    }

    /**
     * Get workspaces
     * @return workspaces
     */
    public WorkspaceListElem getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(WorkspaceListElem workspaces) {
        this.workspaces = workspaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkSpacesResponse listWorkSpacesResponse = (ListWorkSpacesResponse) o;
        return Objects.equals(this.count, listWorkSpacesResponse.count)
            && Objects.equals(this.workspaces, listWorkSpacesResponse.workspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, workspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkSpacesResponse {\n");
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

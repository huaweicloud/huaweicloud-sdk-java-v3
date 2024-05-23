package com.huaweicloud.sdk.koomap.v1.model;

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
public class ListReal3DSubTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtasks")

    private List<Real3DSubTaskDto> subtasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListReal3DSubTasksResponse withSubtasks(List<Real3DSubTaskDto> subtasks) {
        this.subtasks = subtasks;
        return this;
    }

    public ListReal3DSubTasksResponse addSubtasksItem(Real3DSubTaskDto subtasksItem) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        this.subtasks.add(subtasksItem);
        return this;
    }

    public ListReal3DSubTasksResponse withSubtasks(Consumer<List<Real3DSubTaskDto>> subtasksSetter) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        subtasksSetter.accept(this.subtasks);
        return this;
    }

    /**
     * 精修后处理任务列表。
     * @return subtasks
     */
    public List<Real3DSubTaskDto> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Real3DSubTaskDto> subtasks) {
        this.subtasks = subtasks;
    }

    public ListReal3DSubTasksResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListReal3DSubTasksResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReal3DSubTasksResponse that = (ListReal3DSubTasksResponse) obj;
        return Objects.equals(this.subtasks, that.subtasks) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtasks, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReal3DSubTasksResponse {\n");
        sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

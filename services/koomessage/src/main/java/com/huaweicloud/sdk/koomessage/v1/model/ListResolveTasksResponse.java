package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListResolveTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_tasks")

    private List<ListResolveTaskResult> resolveTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListResolveTasksResponse withResolveTasks(List<ListResolveTaskResult> resolveTasks) {
        this.resolveTasks = resolveTasks;
        return this;
    }

    public ListResolveTasksResponse addResolveTasksItem(ListResolveTaskResult resolveTasksItem) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList<>();
        }
        this.resolveTasks.add(resolveTasksItem);
        return this;
    }

    public ListResolveTasksResponse withResolveTasks(Consumer<List<ListResolveTaskResult>> resolveTasksSetter) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList<>();
        }
        resolveTasksSetter.accept(this.resolveTasks);
        return this;
    }

    /**
     * 解析任务列表。
     * @return resolveTasks
     */
    public List<ListResolveTaskResult> getResolveTasks() {
        return resolveTasks;
    }

    public void setResolveTasks(List<ListResolveTaskResult> resolveTasks) {
        this.resolveTasks = resolveTasks;
    }

    public ListResolveTasksResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResolveTasksResponse withPageInfo(Consumer<Page> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new Page();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public Page getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResolveTasksResponse that = (ListResolveTasksResponse) obj;
        return Objects.equals(this.resolveTasks, that.resolveTasks) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolveTasks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResolveTasksResponse {\n");
        sb.append("    resolveTasks: ").append(toIndentedString(resolveTasks)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

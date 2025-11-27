package com.huaweicloud.sdk.cdn.v2.model;

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
public class ListAccessControlTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_tasks")

    private List<AccessControlTask> accessControlTasks = null;

    public ListAccessControlTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAccessControlTaskResponse withAccessControlTasks(List<AccessControlTask> accessControlTasks) {
        this.accessControlTasks = accessControlTasks;
        return this;
    }

    public ListAccessControlTaskResponse addAccessControlTasksItem(AccessControlTask accessControlTasksItem) {
        if (this.accessControlTasks == null) {
            this.accessControlTasks = new ArrayList<>();
        }
        this.accessControlTasks.add(accessControlTasksItem);
        return this;
    }

    public ListAccessControlTaskResponse withAccessControlTasks(
        Consumer<List<AccessControlTask>> accessControlTasksSetter) {
        if (this.accessControlTasks == null) {
            this.accessControlTasks = new ArrayList<>();
        }
        accessControlTasksSetter.accept(this.accessControlTasks);
        return this;
    }

    /**
     * 封禁或解禁URL任务信息。
     * @return accessControlTasks
     */
    public List<AccessControlTask> getAccessControlTasks() {
        return accessControlTasks;
    }

    public void setAccessControlTasks(List<AccessControlTask> accessControlTasks) {
        this.accessControlTasks = accessControlTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessControlTaskResponse that = (ListAccessControlTaskResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.accessControlTasks, that.accessControlTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, accessControlTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessControlTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    accessControlTasks: ").append(toIndentedString(accessControlTasks)).append("\n");
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

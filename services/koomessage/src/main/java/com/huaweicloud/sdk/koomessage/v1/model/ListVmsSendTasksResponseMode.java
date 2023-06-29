package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询发送任务列表响应体。
 */
public class ListVmsSendTasksResponseMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_basic_send_tasks")

    private List<VmsSendTask> aimBasicSendTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListVmsSendTasksResponseMode withAimBasicSendTasks(List<VmsSendTask> aimBasicSendTasks) {
        this.aimBasicSendTasks = aimBasicSendTasks;
        return this;
    }

    public ListVmsSendTasksResponseMode addAimBasicSendTasksItem(VmsSendTask aimBasicSendTasksItem) {
        if (this.aimBasicSendTasks == null) {
            this.aimBasicSendTasks = new ArrayList<>();
        }
        this.aimBasicSendTasks.add(aimBasicSendTasksItem);
        return this;
    }

    public ListVmsSendTasksResponseMode withAimBasicSendTasks(Consumer<List<VmsSendTask>> aimBasicSendTasksSetter) {
        if (this.aimBasicSendTasks == null) {
            this.aimBasicSendTasks = new ArrayList<>();
        }
        aimBasicSendTasksSetter.accept(this.aimBasicSendTasks);
        return this;
    }

    /**
     * 智能信息基础版任务查询列表。
     * @return aimBasicSendTasks
     */
    public List<VmsSendTask> getAimBasicSendTasks() {
        return aimBasicSendTasks;
    }

    public void setAimBasicSendTasks(List<VmsSendTask> aimBasicSendTasks) {
        this.aimBasicSendTasks = aimBasicSendTasks;
    }

    public ListVmsSendTasksResponseMode withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVmsSendTasksResponseMode withPageInfo(Consumer<Page> pageInfoSetter) {
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
        ListVmsSendTasksResponseMode that = (ListVmsSendTasksResponseMode) obj;
        return Objects.equals(this.aimBasicSendTasks, that.aimBasicSendTasks)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aimBasicSendTasks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsSendTasksResponseMode {\n");
        sb.append("    aimBasicSendTasks: ").append(toIndentedString(aimBasicSendTasks)).append("\n");
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

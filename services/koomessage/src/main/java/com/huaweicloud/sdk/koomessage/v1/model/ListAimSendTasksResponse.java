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
public class ListAimSendTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_send_tasks")

    private List<AIMSendTasksMode> aimSendTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListAimSendTasksResponse withAimSendTasks(List<AIMSendTasksMode> aimSendTasks) {
        this.aimSendTasks = aimSendTasks;
        return this;
    }

    public ListAimSendTasksResponse addAimSendTasksItem(AIMSendTasksMode aimSendTasksItem) {
        if (this.aimSendTasks == null) {
            this.aimSendTasks = new ArrayList<>();
        }
        this.aimSendTasks.add(aimSendTasksItem);
        return this;
    }

    public ListAimSendTasksResponse withAimSendTasks(Consumer<List<AIMSendTasksMode>> aimSendTasksSetter) {
        if (this.aimSendTasks == null) {
            this.aimSendTasks = new ArrayList<>();
        }
        aimSendTasksSetter.accept(this.aimSendTasks);
        return this;
    }

    /**
     * 短信记录查询结果列表。
     * @return aimSendTasks
     */
    public List<AIMSendTasksMode> getAimSendTasks() {
        return aimSendTasks;
    }

    public void setAimSendTasks(List<AIMSendTasksMode> aimSendTasks) {
        this.aimSendTasks = aimSendTasks;
    }

    public ListAimSendTasksResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAimSendTasksResponse withPageInfo(Consumer<Page> pageInfoSetter) {
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
        ListAimSendTasksResponse that = (ListAimSendTasksResponse) obj;
        return Objects.equals(this.aimSendTasks, that.aimSendTasks) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aimSendTasks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimSendTasksResponse {\n");
        sb.append("    aimSendTasks: ").append(toIndentedString(aimSendTasks)).append("\n");
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

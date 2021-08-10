package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListConsumerGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_deadletter")

    private Boolean includeDeadletter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_messages_num")

    private Boolean includeMessagesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_page")

    private Integer currentPage;

    public ListConsumerGroupsRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /** 指定的队列ID
     * 
     * @return queueId */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ListConsumerGroupsRequest withIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
        return this;
    }

    /** 是否包含死信信息。默认值为：false
     * 
     * @return includeDeadletter */
    public Boolean getIncludeDeadletter() {
        return includeDeadletter;
    }

    public void setIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
    }

    public ListConsumerGroupsRequest withIncludeMessagesNum(Boolean includeMessagesNum) {
        this.includeMessagesNum = includeMessagesNum;
        return this;
    }

    /** 是否查询消费组的详情，默认值为true。 配置为false时，查询的消费组列表不包含消费详情，接口响应速度快。
     * 
     * @return includeMessagesNum */
    public Boolean getIncludeMessagesNum() {
        return includeMessagesNum;
    }

    public void setIncludeMessagesNum(Boolean includeMessagesNum) {
        this.includeMessagesNum = includeMessagesNum;
    }

    public ListConsumerGroupsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 设置每页显示的消费组数量。 page_size和current_page必须同时配置有效值，否则默认查询所有消费组。
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListConsumerGroupsRequest withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /** 设置查询消费组的页码。 page_size和current_page必须同时配置有效值，否则默认查询所有消费组。
     * 
     * @return currentPage */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConsumerGroupsRequest listConsumerGroupsRequest = (ListConsumerGroupsRequest) o;
        return Objects.equals(this.queueId, listConsumerGroupsRequest.queueId)
            && Objects.equals(this.includeDeadletter, listConsumerGroupsRequest.includeDeadletter)
            && Objects.equals(this.includeMessagesNum, listConsumerGroupsRequest.includeMessagesNum)
            && Objects.equals(this.pageSize, listConsumerGroupsRequest.pageSize)
            && Objects.equals(this.currentPage, listConsumerGroupsRequest.currentPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueId, includeDeadletter, includeMessagesNum, pageSize, currentPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConsumerGroupsRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    includeDeadletter: ").append(toIndentedString(includeDeadletter)).append("\n");
        sb.append("    includeMessagesNum: ").append(toIndentedString(includeMessagesNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

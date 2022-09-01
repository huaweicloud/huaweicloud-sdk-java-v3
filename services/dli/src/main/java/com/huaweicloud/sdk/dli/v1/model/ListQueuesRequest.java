package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListQueuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-priv")

    @JacksonXmlProperty(localName = "with-priv")

    private Boolean withPriv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-charge-info")

    @JacksonXmlProperty(localName = "with-charge-info")

    private Boolean withChargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    @JacksonXmlProperty(localName = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page-size")

    @JacksonXmlProperty(localName = "page-size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-page")

    @JacksonXmlProperty(localName = "current-page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private String order;

    public ListQueuesRequest withWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
        return this;
    }

    /**
     * 是否返回权限信息。
     * @return withPriv
     */
    public Boolean getWithPriv() {
        return withPriv;
    }

    public void setWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
    }

    public ListQueuesRequest withWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
        return this;
    }

    /**
     * 是否返回收费信息
     * @return withChargeInfo
     */
    public Boolean getWithChargeInfo() {
        return withChargeInfo;
    }

    public void setWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
    }

    public ListQueuesRequest withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列的类型,。有如下三种类型： sql general all 如果不指定，默认为sql。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ListQueuesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 查询根据标签进行过滤
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListQueuesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示的最大结果行数，默认值Integer.MAX_VALUE（也即不分页）
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListQueuesRequest withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 当前页码，默认为第一页。
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListQueuesRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 指定队列排序方式，默认为queue_name_asc（队列名称升序），支持queue_name_asc（队列名称升序）、queue_name_desc（队列名称降序）、cu_asc（CU数升序）、cu_desc（CU数降序）四种排序方式。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesRequest listQueuesRequest = (ListQueuesRequest) o;
        return Objects.equals(this.withPriv, listQueuesRequest.withPriv)
            && Objects.equals(this.withChargeInfo, listQueuesRequest.withChargeInfo)
            && Objects.equals(this.queueType, listQueuesRequest.queueType)
            && Objects.equals(this.tags, listQueuesRequest.tags)
            && Objects.equals(this.pageSize, listQueuesRequest.pageSize)
            && Objects.equals(this.currentPage, listQueuesRequest.currentPage)
            && Objects.equals(this.order, listQueuesRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withPriv, withChargeInfo, queueType, tags, pageSize, currentPage, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRequest {\n");
        sb.append("    withPriv: ").append(toIndentedString(withPriv)).append("\n");
        sb.append("    withChargeInfo: ").append(toIndentedString(withChargeInfo)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

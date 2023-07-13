package com.huaweicloud.sdk.dwr.v3.model;

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
public class ListSystemTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_templates")

    private List<ActionTemplateItem> actionTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    private Boolean isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public ListSystemTemplatesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 列表条目数。
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSystemTemplatesResponse withActionTemplates(List<ActionTemplateItem> actionTemplates) {
        this.actionTemplates = actionTemplates;
        return this;
    }

    public ListSystemTemplatesResponse addActionTemplatesItem(ActionTemplateItem actionTemplatesItem) {
        if (this.actionTemplates == null) {
            this.actionTemplates = new ArrayList<>();
        }
        this.actionTemplates.add(actionTemplatesItem);
        return this;
    }

    public ListSystemTemplatesResponse withActionTemplates(Consumer<List<ActionTemplateItem>> actionTemplatesSetter) {
        if (this.actionTemplates == null) {
            this.actionTemplates = new ArrayList<>();
        }
        actionTemplatesSetter.accept(this.actionTemplates);
        return this;
    }

    /**
     * 模板列表信息。
     * @return actionTemplates
     */
    public List<ActionTemplateItem> getActionTemplates() {
        return actionTemplates;
    }

    public void setActionTemplates(List<ActionTemplateItem> actionTemplates) {
        this.actionTemplates = actionTemplates;
    }

    public ListSystemTemplatesResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 下一次查询的起始位置。 下一次查询的起始位置。
     * minimum: 0
     * maximum: 499
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSystemTemplatesResponse withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * 如果本次没有返回全部结果，响应请求中将包含此字段，用于标明本次请求列举到的最后一个算子。如果is_truncated为false，该字段不会返回。
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListSystemTemplatesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询到符合条件的列表总条数。
     * minimum: 0
     * maximum: 500
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSystemTemplatesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ListSystemTemplatesResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ListSystemTemplatesResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public ListSystemTemplatesResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSystemTemplatesResponse that = (ListSystemTemplatesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.actionTemplates, that.actionTemplates)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.isTruncated, that.isTruncated)
            && Objects.equals(this.total, that.total) && Objects.equals(this.xRequestId, that.xRequestId)
            && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(count, actionTemplates, offset, isTruncated, total, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemTemplatesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    actionTemplates: ").append(toIndentedString(actionTemplates)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

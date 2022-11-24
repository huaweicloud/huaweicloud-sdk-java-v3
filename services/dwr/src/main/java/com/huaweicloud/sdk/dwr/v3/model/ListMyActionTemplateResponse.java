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
public class ListMyActionTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_templates")

    private List<ThirdActionTemplateItem> actionTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    private Boolean isTruncated;

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

    public ListMyActionTemplateResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 列表条目数
     * minimum: 0
     * maximum: 200
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListMyActionTemplateResponse withActionTemplates(List<ThirdActionTemplateItem> actionTemplates) {
        this.actionTemplates = actionTemplates;
        return this;
    }

    public ListMyActionTemplateResponse addActionTemplatesItem(ThirdActionTemplateItem actionTemplatesItem) {
        if (this.actionTemplates == null) {
            this.actionTemplates = new ArrayList<>();
        }
        this.actionTemplates.add(actionTemplatesItem);
        return this;
    }

    public ListMyActionTemplateResponse withActionTemplates(
        Consumer<List<ThirdActionTemplateItem>> actionTemplatesSetter) {
        if (this.actionTemplates == null) {
            this.actionTemplates = new ArrayList<>();
        }
        actionTemplatesSetter.accept(this.actionTemplates);
        return this;
    }

    /**
     * 模板列表信息
     * @return actionTemplates
     */
    public List<ThirdActionTemplateItem> getActionTemplates() {
        return actionTemplates;
    }

    public void setActionTemplates(List<ThirdActionTemplateItem> actionTemplates) {
        this.actionTemplates = actionTemplates;
    }

    public ListMyActionTemplateResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 下一次查询的起始位置。
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

    public ListMyActionTemplateResponse withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * 表明是否本次返回的结果列表被截断。true：表示本次没有返回全部结果。false：表示本次已经返回了全部结果。
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListMyActionTemplateResponse withXRequestId(String xRequestId) {
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

    public ListMyActionTemplateResponse withConnection(String connection) {
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

    public ListMyActionTemplateResponse withContentLength(String contentLength) {
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

    public ListMyActionTemplateResponse withDate(String date) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMyActionTemplateResponse listMyActionTemplateResponse = (ListMyActionTemplateResponse) o;
        return Objects.equals(this.count, listMyActionTemplateResponse.count)
            && Objects.equals(this.actionTemplates, listMyActionTemplateResponse.actionTemplates)
            && Objects.equals(this.offset, listMyActionTemplateResponse.offset)
            && Objects.equals(this.isTruncated, listMyActionTemplateResponse.isTruncated)
            && Objects.equals(this.xRequestId, listMyActionTemplateResponse.xRequestId)
            && Objects.equals(this.connection, listMyActionTemplateResponse.connection)
            && Objects.equals(this.contentLength, listMyActionTemplateResponse.contentLength)
            && Objects.equals(this.date, listMyActionTemplateResponse.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, actionTemplates, offset, isTruncated, xRequestId, connection, contentLength, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMyActionTemplateResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    actionTemplates: ").append(toIndentedString(actionTemplates)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
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

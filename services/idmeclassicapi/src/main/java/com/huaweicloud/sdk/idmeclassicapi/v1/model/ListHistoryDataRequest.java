package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListHistoryDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curPage")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRows")

    private Integer totalRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalPages")

    private Integer totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelName")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSizePath")

    private Integer pageSizePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curPagePath")

    private Integer curPagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RDMParamVOMongPageRequest body;

    public ListHistoryDataRequest withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页。
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public ListHistoryDataRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页大小。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListHistoryDataRequest withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * 总行数。
     * @return totalRows
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public ListHistoryDataRequest withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * 总页数。
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public ListHistoryDataRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条目数量，limit和offset均传正确的数值时才起作用，且优先级高于pageSize和curPage。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHistoryDataRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，limit和offset均传正确的数值时才起作用，且优先级高于pageSize和curPage。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHistoryDataRequest withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 应用ID。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ListHistoryDataRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * 数据模型的英文名称。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ListHistoryDataRequest withPageSizePath(Integer pageSizePath) {
        this.pageSizePath = pageSizePath;
        return this;
    }

    /**
     * 分页大小（路径参数）。
     * @return pageSizePath
     */
    public Integer getPageSizePath() {
        return pageSizePath;
    }

    public void setPageSizePath(Integer pageSizePath) {
        this.pageSizePath = pageSizePath;
    }

    public ListHistoryDataRequest withCurPagePath(Integer curPagePath) {
        this.curPagePath = curPagePath;
        return this;
    }

    /**
     * 当前页数（路径参数）。
     * @return curPagePath
     */
    public Integer getCurPagePath() {
        return curPagePath;
    }

    public void setCurPagePath(Integer curPagePath) {
        this.curPagePath = curPagePath;
    }

    public ListHistoryDataRequest withBody(RDMParamVOMongPageRequest body) {
        this.body = body;
        return this;
    }

    public ListHistoryDataRequest withBody(Consumer<RDMParamVOMongPageRequest> bodySetter) {
        if (this.body == null) {
            this.body = new RDMParamVOMongPageRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RDMParamVOMongPageRequest getBody() {
        return body;
    }

    public void setBody(RDMParamVOMongPageRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryDataRequest that = (ListHistoryDataRequest) obj;
        return Objects.equals(this.curPage, that.curPage) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.totalRows, that.totalRows) && Objects.equals(this.totalPages, that.totalPages)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.identifier, that.identifier) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.pageSizePath, that.pageSizePath)
            && Objects.equals(this.curPagePath, that.curPagePath) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curPage,
            pageSize,
            totalRows,
            totalPages,
            limit,
            offset,
            identifier,
            modelName,
            pageSizePath,
            curPagePath,
            body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryDataRequest {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    pageSizePath: ").append(toIndentedString(pageSizePath)).append("\n");
        sb.append("    curPagePath: ").append(toIndentedString(curPagePath)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListGetChildListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curPage")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endIndex")

    private Integer endIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPageSize")

    private Integer maxPageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startIndex")

    private Integer startIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalPages")

    private Integer totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRows")

    private Integer totalRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSizePath")

    private Integer pageSizePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curPagePath")

    private Integer curPagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelName")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RDMParamVOQueryChildListDTO body;

    public ListGetChildListRequest withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * **参数解释：**  当前页。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  1。 
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public ListGetChildListRequest withEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    /**
     * **参数解释：**  结束索引。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  0。 
     * @return endIndex
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public ListGetChildListRequest withMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }

    /**
     * **参数解释：**  最大分页数。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  1000。 
     * @return maxPageSize
     */
    public Integer getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    public ListGetChildListRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：**  每页大小。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  1000。 
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListGetChildListRequest withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * **参数解释：**  起始索引。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  0。 
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public ListGetChildListRequest withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释：**  总页数。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  0。 
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public ListGetChildListRequest withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * **参数解释：**  总行数。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  0。 
     * @return totalRows
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public ListGetChildListRequest withPageSizePath(Integer pageSizePath) {
        this.pageSizePath = pageSizePath;
        return this;
    }

    /**
     * **参数解释：**  分页大小（路径参数）。  **约束限制：**  不涉及。  **取值范围：**  1-1000。  **默认取值：**  不涉及。 
     * @return pageSizePath
     */
    public Integer getPageSizePath() {
        return pageSizePath;
    }

    public void setPageSizePath(Integer pageSizePath) {
        this.pageSizePath = pageSizePath;
    }

    public ListGetChildListRequest withCurPagePath(Integer curPagePath) {
        this.curPagePath = curPagePath;
        return this;
    }

    /**
     * **参数解释：**  当前页数（路径参数）。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  1。 
     * @return curPagePath
     */
    public Integer getCurPagePath() {
        return curPagePath;
    }

    public void setCurPagePath(Integer curPagePath) {
        this.curPagePath = curPagePath;
    }

    public ListGetChildListRequest withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释：**  应用唯一标识。  **约束限制：**  不涉及。  **取值范围：**  由英文字母和数字组成，且长度为32个字符。  **默认取值：**  不涉及。 
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ListGetChildListRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：**  数据模型的英文名称。  **约束限制：**  不涉及。  **取值范围：**  大写字母开头，只能包含字母、数字、“_”，且长度为[1-60]个字符。  **默认取值：**  不涉及。 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ListGetChildListRequest withBody(RDMParamVOQueryChildListDTO body) {
        this.body = body;
        return this;
    }

    public ListGetChildListRequest withBody(Consumer<RDMParamVOQueryChildListDTO> bodySetter) {
        if (this.body == null) {
            this.body = new RDMParamVOQueryChildListDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RDMParamVOQueryChildListDTO getBody() {
        return body;
    }

    public void setBody(RDMParamVOQueryChildListDTO body) {
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
        ListGetChildListRequest that = (ListGetChildListRequest) obj;
        return Objects.equals(this.curPage, that.curPage) && Objects.equals(this.endIndex, that.endIndex)
            && Objects.equals(this.maxPageSize, that.maxPageSize) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.startIndex, that.startIndex) && Objects.equals(this.totalPages, that.totalPages)
            && Objects.equals(this.totalRows, that.totalRows) && Objects.equals(this.pageSizePath, that.pageSizePath)
            && Objects.equals(this.curPagePath, that.curPagePath) && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.modelName, that.modelName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curPage,
            endIndex,
            maxPageSize,
            pageSize,
            startIndex,
            totalPages,
            totalRows,
            pageSizePath,
            curPagePath,
            identifier,
            modelName,
            body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGetChildListRequest {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
        sb.append("    maxPageSize: ").append(toIndentedString(maxPageSize)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
        sb.append("    pageSizePath: ").append(toIndentedString(pageSizePath)).append("\n");
        sb.append("    curPagePath: ").append(toIndentedString(curPagePath)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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

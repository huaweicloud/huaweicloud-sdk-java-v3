package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagParam
 */
public class TagParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_enable")

    private Boolean pageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public TagParam withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public TagParam withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TagParam withPageEnable(Boolean pageEnable) {
        this.pageEnable = pageEnable;
        return this;
    }

    /**
     * 是否分页。
     * @return pageEnable
     */
    public Boolean getPageEnable() {
        return pageEnable;
    }

    public void setPageEnable(Boolean pageEnable) {
        this.pageEnable = pageEnable;
    }

    public TagParam withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 每页容量。
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public TagParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 当前页码。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagParam that = (TagParam) obj;
        return Objects.equals(this.businessId, that.businessId) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.pageEnable, that.pageEnable) && Objects.equals(this.pageNumber, that.pageNumber)
            && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, keyword, pageEnable, pageNumber, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagParam {\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    pageEnable: ").append(toIndentedString(pageEnable)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

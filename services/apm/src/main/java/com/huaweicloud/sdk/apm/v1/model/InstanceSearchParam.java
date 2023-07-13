package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取实例信息列表入参。
 */
public class InstanceSearchParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_count")

    private Boolean returnCount;

    public InstanceSearchParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public InstanceSearchParam withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 当前页码。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public InstanceSearchParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数据容量。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public InstanceSearchParam withKeyword(String keyword) {
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

    public InstanceSearchParam withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public InstanceSearchParam withReturnCount(Boolean returnCount) {
        this.returnCount = returnCount;
        return this;
    }

    /**
     * 是否返回计数结果。
     * @return returnCount
     */
    public Boolean getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Boolean returnCount) {
        this.returnCount = returnCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceSearchParam that = (InstanceSearchParam) obj;
        return Objects.equals(this.envId, that.envId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.status, that.status) && Objects.equals(this.returnCount, that.returnCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, page, pageSize, keyword, status, returnCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSearchParam {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    returnCount: ").append(toIndentedString(returnCount)).append("\n");
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

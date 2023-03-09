package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCategoryListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Long pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_name")

    private String sceneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ide")

    private Integer supportIde;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public ShowCategoryListRequest withPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页码
     * minimum: 0
     * maximum: 2147483647
     * @return pageNum
     */
    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public ShowCategoryListRequest withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * minimum: 1
     * maximum: 2147483647
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ShowCategoryListRequest withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * 场景名称
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public ShowCategoryListRequest withSupportIde(Integer supportIde) {
        this.supportIde = supportIde;
        return this;
    }

    /**
     * 支持的ide
     * minimum: 0
     * maximum: 2147483647
     * @return supportIde
     */
    public Integer getSupportIde() {
        return supportIde;
    }

    public void setSupportIde(Integer supportIde) {
        this.supportIde = supportIde;
    }

    public ShowCategoryListRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 数据来源
     * minimum: 0
     * maximum: 2147483647
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCategoryListRequest showCategoryListRequest = (ShowCategoryListRequest) o;
        return Objects.equals(this.pageNum, showCategoryListRequest.pageNum)
            && Objects.equals(this.pageSize, showCategoryListRequest.pageSize)
            && Objects.equals(this.sceneName, showCategoryListRequest.sceneName)
            && Objects.equals(this.supportIde, showCategoryListRequest.supportIde)
            && Objects.equals(this.type, showCategoryListRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNum, pageSize, sceneName, supportIde, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCategoryListRequest {\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
        sb.append("    supportIde: ").append(toIndentedString(supportIde)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

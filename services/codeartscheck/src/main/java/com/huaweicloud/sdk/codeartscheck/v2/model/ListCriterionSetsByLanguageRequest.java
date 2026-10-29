package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCriterionSetsByLanguageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reliable")

    private String isReliable;

    public ListCriterionSetsByLanguageRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释:** 规则集语言。 **约束限制:** 不涉及。 **取值范围:** 当前支持的语言有： - ARKTS - C# - CANGJIE - C++ - CSS - GO - HTML - JAVA - JAVASCRIPT - KOTLIN - LUA - PHP - PYTHON - RUST - SCALA - SHELL - SQL - TERRAFORM - TYPESCRIPT - AZURERESOURCEMANAGER - DOCKER - KUBERNETES **默认取值：** 不涉及。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ListCriterionSetsByLanguageRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释:** 搜索关键字。 **约束限制:** 不涉及。 **取值范围:** 不涉及。 **默认取值：** 不涉及。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListCriterionSetsByLanguageRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释:** 每页规则集数量。 **约束限制:** 不涉及。 **取值范围:** 1~1000 **默认取值:** 1000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListCriterionSetsByLanguageRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释:** 规则集页数。 **约束限制:** 不涉及。 **取值范围:** 0-999 **默认取值:** 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListCriterionSetsByLanguageRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释:** 项目的32位UUID，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口获取。 **约束限制:** 不涉及。 **取值范围:** 32位UUID。 **默认取值:** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListCriterionSetsByLanguageRequest withIsReliable(String isReliable) {
        this.isReliable = isReliable;
        return this;
    }

    /**
     * 是否可信
     * @return isReliable
     */
    public String getIsReliable() {
        return isReliable;
    }

    public void setIsReliable(String isReliable) {
        this.isReliable = isReliable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCriterionSetsByLanguageRequest that = (ListCriterionSetsByLanguageRequest) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.search, that.search)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.page, that.page)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isReliable, that.isReliable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, search, pageSize, page, projectId, isReliable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCriterionSetsByLanguageRequest {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isReliable: ").append(toIndentedString(isReliable)).append("\n");
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

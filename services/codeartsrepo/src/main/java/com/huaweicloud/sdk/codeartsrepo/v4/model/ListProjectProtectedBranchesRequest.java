package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectProtectedBranchesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_actions")

    private Boolean userActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view")

    private String view;

    public ListProjectProtectedBranchesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectProtectedBranchesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectProtectedBranchesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectProtectedBranchesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 保护分支名称。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListProjectProtectedBranchesRequest withUserActions(Boolean userActions) {
        this.userActions = userActions;
        return this;
    }

    /**
     * **参数解释：** 是否使用actions权限点的返回内容。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return userActions
     */
    public Boolean getUserActions() {
        return userActions;
    }

    public void setUserActions(Boolean userActions) {
        this.userActions = userActions;
    }

    public ListProjectProtectedBranchesRequest withView(String view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** 参数值只有simple ，意为使用简单模式，只返回名称。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return view
     */
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectProtectedBranchesRequest that = (ListProjectProtectedBranchesRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.search, that.search)
            && Objects.equals(this.userActions, that.userActions) && Objects.equals(this.view, that.view);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, offset, limit, search, userActions, view);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectProtectedBranchesRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    userActions: ").append(toIndentedString(userActions)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

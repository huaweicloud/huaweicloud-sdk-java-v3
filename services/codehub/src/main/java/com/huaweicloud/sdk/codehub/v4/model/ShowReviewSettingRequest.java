package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowReviewSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_default_review_categories")

    private Boolean withDefaultReviewCategories;

    public ShowReviewSettingRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowReviewSettingRequest withWithDefaultReviewCategories(Boolean withDefaultReviewCategories) {
        this.withDefaultReviewCategories = withDefaultReviewCategories;
        return this;
    }

    /**
     * **参数解释：** 额外返回可勾选检视意见分类和系统预置检视意见分类。 **取值范围：** - true, 返回可勾选检视意见分类和系统预置检视意见分类。 - false, 不返回可勾选检视意见分类和系统预置检视意见分类。
     * @return withDefaultReviewCategories
     */
    public Boolean getWithDefaultReviewCategories() {
        return withDefaultReviewCategories;
    }

    public void setWithDefaultReviewCategories(Boolean withDefaultReviewCategories) {
        this.withDefaultReviewCategories = withDefaultReviewCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReviewSettingRequest that = (ShowReviewSettingRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.withDefaultReviewCategories, that.withDefaultReviewCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, withDefaultReviewCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReviewSettingRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    withDefaultReviewCategories: ")
            .append(toIndentedString(withDefaultReviewCategories))
            .append("\n");
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

package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectRelatedRepositoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_name")

    private String searchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    public ShowProjectRelatedRepositoryRequest withSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }

    /**
     * **参数解释**： 项目名称，支持模糊查询。 **约束限制**： 不涉及。 **取值范围**： 最大200个字符。 **默认取值**： 不涉及。
     * @return searchName
     */
    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public ShowProjectRelatedRepositoryRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页查询的起始位置。 **约束限制**： 不涉及。 **取值范围**： 0-2147483647 **默认取值**： 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowProjectRelatedRepositoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页查询每页的数据量。 **约束限制**： 不涉及。 **取值范围**： 1-2147483647 **默认取值**： 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowProjectRelatedRepositoryRequest withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释**： 仓库ID，格式为{region}\\_{domainId}\\_{format}_{sequence}。可以从“私有依赖库首页 > 仓库概览 > 仓库地址url”中获取，最后两个“/”中间的字符串即为仓库ID。如仓库地址：https://devrepo.devcloud.abcde.abc.xyz.com/artgalaxy/abcde_09d2ca2f5080d5b60f51c00ae5bad0a0_maven_2_50/，其中abcde_09d2ca2f5080d5b60f51c00ae5bad0a0_maven_2_50即为仓库ID。 **约束限制**： 不涉及。 **取值范围**： 仓库ID格式中的format支持以下值： - npm - go - pypi - rpm - composer - maven - debian - conan - nuget - docker2 - cocoapods **默认取值**： 不涉及。
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectRelatedRepositoryRequest that = (ShowProjectRelatedRepositoryRequest) obj;
        return Objects.equals(this.searchName, that.searchName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.repoId, that.repoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchName, offset, limit, repoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectRelatedRepositoryRequest {\n");
        sb.append("    searchName: ").append(toIndentedString(searchName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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

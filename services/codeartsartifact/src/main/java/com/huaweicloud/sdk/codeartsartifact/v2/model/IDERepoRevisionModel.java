package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDERepoRevisionModel
 */
public class IDERepoRevisionModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_ids")

    private String repositoryIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    public IDERepoRevisionModel withRepositoryIds(String repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    /**
     * 仓库id集合
     * @return repositoryIds
     */
    public String getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(String repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public IDERepoRevisionModel withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 类型
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDERepoRevisionModel that = (IDERepoRevisionModel) obj;
        return Objects.equals(this.repositoryIds, that.repositoryIds) && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryIds, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDERepoRevisionModel {\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

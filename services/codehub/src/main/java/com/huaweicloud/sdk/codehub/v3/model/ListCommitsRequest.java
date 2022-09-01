package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCommitsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    @JacksonXmlProperty(localName = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    @JacksonXmlProperty(localName = "ref_name")

    private String refName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "since")

    @JacksonXmlProperty(localName = "since")

    private String since;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "until")

    @JacksonXmlProperty(localName = "until")

    private String until;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    @JacksonXmlProperty(localName = "all")

    private Boolean all;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_stats")

    @JacksonXmlProperty(localName = "with_stats")

    private Boolean withStats;

    public ListCommitsRequest withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库短id
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public ListCommitsRequest withRefName(String refName) {
        this.refName = refName;
        return this;
    }

    /**
     * 仓库的branch名或tag名，如果为空则查询默认分支
     * @return refName
     */
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public ListCommitsRequest withSince(String since) {
        this.since = since;
        return this;
    }

    /**
     * 在此日期之后或当天提交，格式 YYYY-MM-DDTHH:MM:SSZ
     * @return since
     */
    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public ListCommitsRequest withUntil(String until) {
        this.until = until;
        return this;
    }

    /**
     * 在此日期之前或当天提交，格式 YYYY-MM-DDTHH:MM:SSZ
     * @return until
     */
    public String getUntil() {
        return until;
    }

    public void setUntil(String until) {
        this.until = until;
    }

    public ListCommitsRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ListCommitsRequest withAll(Boolean all) {
        this.all = all;
        return this;
    }

    /**
     * 是否检索仓库中每个提交
     * @return all
     */
    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public ListCommitsRequest withWithStats(Boolean withStats) {
        this.withStats = withStats;
        return this;
    }

    /**
     * 有关每个提交的统计信息是否添加到响应中
     * @return withStats
     */
    public Boolean getWithStats() {
        return withStats;
    }

    public void setWithStats(Boolean withStats) {
        this.withStats = withStats;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCommitsRequest listCommitsRequest = (ListCommitsRequest) o;
        return Objects.equals(this.repoId, listCommitsRequest.repoId)
            && Objects.equals(this.refName, listCommitsRequest.refName)
            && Objects.equals(this.since, listCommitsRequest.since)
            && Objects.equals(this.until, listCommitsRequest.until)
            && Objects.equals(this.path, listCommitsRequest.path) && Objects.equals(this.all, listCommitsRequest.all)
            && Objects.equals(this.withStats, listCommitsRequest.withStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId, refName, since, until, path, all, withStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommitsRequest {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    until: ").append(toIndentedString(until)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    withStats: ").append(toIndentedString(withStats)).append("\n");
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

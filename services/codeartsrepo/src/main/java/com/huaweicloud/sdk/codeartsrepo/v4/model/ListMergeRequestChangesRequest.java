package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMergeRequestChangesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_whitespace_change")

    private Boolean ignoreWhitespaceChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_encode")

    private Boolean forceEncode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_diff_id")

    private Integer fromDiffId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_diff_id")

    private Integer toDiffId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMergeRequestChangesRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ListMergeRequestChangesRequest withMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * **参数解释：**  合并请求 iid。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestIid
     */
    public Integer getMergeRequestIid() {
        return mergeRequestIid;
    }

    public void setMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
    }

    public ListMergeRequestChangesRequest withIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
        return this;
    }

    /**
     * **参数解释：** 是否忽略空白数量更改。 **取值范围：** - true，忽略空白数量的更改。 - false，不会忽略空白数量的更改。
     * @return ignoreWhitespaceChange
     */
    public Boolean getIgnoreWhitespaceChange() {
        return ignoreWhitespaceChange;
    }

    public void setIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
    }

    public ListMergeRequestChangesRequest withForceEncode(Boolean forceEncode) {
        this.forceEncode = forceEncode;
        return this;
    }

    /**
     * **参数解释：** 是否强制将文件内容转码为utf-8 **约束限制 ** - true, 强制将文件内容转码为utf-8。 - false, 不强制将文件内容转码为utf-8。
     * @return forceEncode
     */
    public Boolean getForceEncode() {
        return forceEncode;
    }

    public void setForceEncode(Boolean forceEncode) {
        this.forceEncode = forceEncode;
    }

    public ListMergeRequestChangesRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 字符串长度不少于1，不超过10000。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ListMergeRequestChangesRequest withFromDiffId(Integer fromDiffId) {
        this.fromDiffId = fromDiffId;
        return this;
    }

    /**
     * **参数解释：** 文件变更对比源版本id
     * @return fromDiffId
     */
    public Integer getFromDiffId() {
        return fromDiffId;
    }

    public void setFromDiffId(Integer fromDiffId) {
        this.fromDiffId = fromDiffId;
    }

    public ListMergeRequestChangesRequest withToDiffId(Integer toDiffId) {
        this.toDiffId = toDiffId;
        return this;
    }

    /**
     * **参数解释：** 文件变更对比目标版本id
     * @return toDiffId
     */
    public Integer getToDiffId() {
        return toDiffId;
    }

    public void setToDiffId(Integer toDiffId) {
        this.toDiffId = toDiffId;
    }

    public ListMergeRequestChangesRequest withOffset(Integer offset) {
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

    public ListMergeRequestChangesRequest withLimit(Integer limit) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestChangesRequest that = (ListMergeRequestChangesRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.ignoreWhitespaceChange, that.ignoreWhitespaceChange)
            && Objects.equals(this.forceEncode, that.forceEncode) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fromDiffId, that.fromDiffId) && Objects.equals(this.toDiffId, that.toDiffId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            mergeRequestIid,
            ignoreWhitespaceChange,
            forceEncode,
            filePath,
            fromDiffId,
            toDiffId,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestChangesRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    ignoreWhitespaceChange: ").append(toIndentedString(ignoreWhitespaceChange)).append("\n");
        sb.append("    forceEncode: ").append(toIndentedString(forceEncode)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fromDiffId: ").append(toIndentedString(fromDiffId)).append("\n");
        sb.append("    toDiffId: ").append(toIndentedString(toDiffId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

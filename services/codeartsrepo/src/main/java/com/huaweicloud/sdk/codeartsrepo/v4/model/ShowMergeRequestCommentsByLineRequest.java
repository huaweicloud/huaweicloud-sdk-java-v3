package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowMergeRequestCommentsByLineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private Integer line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_commit_comments")

    private Boolean withCommitComments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    /**
     * Gets or Sets view
     */
    public static final class ViewEnum {

        /**
         * Enum BASIC for value: "basic"
         */
        public static final ViewEnum BASIC = new ViewEnum("basic");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ViewEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewEnum(value));
        }

        public static ViewEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewEnum) {
                return this.value.equals(((ViewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view")

    private ViewEnum view;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_sha")

    private String baseSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_sha")

    private String headSha;

    public ShowMergeRequestCommentsByLineRequest withRepositoryId(Integer repositoryId) {
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

    public ShowMergeRequestCommentsByLineRequest withMergeRequestIid(Integer mergeRequestIid) {
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

    public ShowMergeRequestCommentsByLineRequest withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * Get line
     * minimum: 1
     * maximum: 2147483647
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public ShowMergeRequestCommentsByLineRequest withWithCommitComments(Boolean withCommitComments) {
        this.withCommitComments = withCommitComments;
        return this;
    }

    /**
     * Get withCommitComments
     * @return withCommitComments
     */
    public Boolean getWithCommitComments() {
        return withCommitComments;
    }

    public void setWithCommitComments(Boolean withCommitComments) {
        this.withCommitComments = withCommitComments;
    }

    public ShowMergeRequestCommentsByLineRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowMergeRequestCommentsByLineRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * Get view
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ShowMergeRequestCommentsByLineRequest withBaseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * 合并请求中原分支与目标分支的共同基准点
     * @return baseSha
     */
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public ShowMergeRequestCommentsByLineRequest withStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }

    /**
     * 合并请求中，从共同基准点开始到原分支方向的第一个提交点
     * @return startSha
     */
    public String getStartSha() {
        return startSha;
    }

    public void setStartSha(String startSha) {
        this.startSha = startSha;
    }

    public ShowMergeRequestCommentsByLineRequest withHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * 合并请求中原分支指向的提交点
     * @return headSha
     */
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMergeRequestCommentsByLineRequest that = (ShowMergeRequestCommentsByLineRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid) && Objects.equals(this.line, that.line)
            && Objects.equals(this.withCommitComments, that.withCommitComments) && Objects.equals(this.path, that.path)
            && Objects.equals(this.view, that.view) && Objects.equals(this.baseSha, that.baseSha)
            && Objects.equals(this.startSha, that.startSha) && Objects.equals(this.headSha, that.headSha);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(repositoryId, mergeRequestIid, line, withCommitComments, path, view, baseSha, startSha, headSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMergeRequestCommentsByLineRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    withCommitComments: ").append(toIndentedString(withCommitComments)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
        sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
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

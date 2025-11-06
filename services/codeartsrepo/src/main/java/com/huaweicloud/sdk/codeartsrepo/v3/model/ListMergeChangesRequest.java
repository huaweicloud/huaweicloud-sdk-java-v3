package com.huaweicloud.sdk.codeartsrepo.v3.model;

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
public class ListMergeChangesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private String mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_whitespace_change")

    private Boolean ignoreWhitespaceChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_encode")

    private Boolean forceEncode;

    /**
     * 是否为建议视图
     */
    public static final class ViewEnum {

        /**
         * Enum SIMPLE for value: "simple"
         */
        public static final ViewEnum SIMPLE = new ViewEnum("simple");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("simple", SIMPLE);
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
    @JsonProperty(value = "commit_id")

    private String commitId;

    public ListMergeChangesRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库主键id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListMergeChangesRequest withMergeRequestIid(String mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * MR长id
     * @return mergeRequestIid
     */
    public String getMergeRequestIid() {
        return mergeRequestIid;
    }

    public void setMergeRequestIid(String mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
    }

    public ListMergeChangesRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ListMergeChangesRequest withIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
        return this;
    }

    /**
     * 是否无视空格
     * @return ignoreWhitespaceChange
     */
    public Boolean getIgnoreWhitespaceChange() {
        return ignoreWhitespaceChange;
    }

    public void setIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
    }

    public ListMergeChangesRequest withForceEncode(Boolean forceEncode) {
        this.forceEncode = forceEncode;
        return this;
    }

    /**
     * 是否需要编码
     * @return forceEncode
     */
    public Boolean getForceEncode() {
        return forceEncode;
    }

    public void setForceEncode(Boolean forceEncode) {
        this.forceEncode = forceEncode;
    }

    public ListMergeChangesRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * 是否为建议视图
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ListMergeChangesRequest withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * commit的id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeChangesRequest that = (ListMergeChangesRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.ignoreWhitespaceChange, that.ignoreWhitespaceChange)
            && Objects.equals(this.forceEncode, that.forceEncode) && Objects.equals(this.view, that.view)
            && Objects.equals(this.commitId, that.commitId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(repositoryId, mergeRequestIid, filePath, ignoreWhitespaceChange, forceEncode, view, commitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeChangesRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    ignoreWhitespaceChange: ").append(toIndentedString(ignoreWhitespaceChange)).append("\n");
        sb.append("    forceEncode: ").append(toIndentedString(forceEncode)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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

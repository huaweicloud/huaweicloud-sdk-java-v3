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
public class ShowRefCompareRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    /**
     * **参数解释：** 对比类型。 **取值范围：** - branch，分支。 - commit，提交。 - tag，标签。
     */
    public static final class CompareTypeEnum {

        /**
         * Enum BRANCH for value: "branch"
         */
        public static final CompareTypeEnum BRANCH = new CompareTypeEnum("branch");

        /**
         * Enum COMMIT for value: "commit"
         */
        public static final CompareTypeEnum COMMIT = new CompareTypeEnum("commit");

        /**
         * Enum TAG for value: "tag"
         */
        public static final CompareTypeEnum TAG = new CompareTypeEnum("tag");

        private static final Map<String, CompareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareTypeEnum> createStaticFields() {
            Map<String, CompareTypeEnum> map = new HashMap<>();
            map.put("branch", BRANCH);
            map.put("commit", COMMIT);
            map.put("tag", TAG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareTypeEnum(String value) {
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
        public static CompareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompareTypeEnum(value));
        }

        public static CompareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareTypeEnum) {
                return this.value.equals(((CompareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private CompareTypeEnum compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private Integer targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "straight")

    private Boolean straight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_whitespace_change")

    private Boolean ignoreWhitespaceChange;

    /**
     * **参数解释：** 是否忽略空白数量更改。 **取值范围：** - count，数量。 - commits，提交信息。 - diffs，差异信息。 - files，文件信息。 - commits,diffs，提交信息和差异信息。
     */
    public static final class ViewEnum {

        /**
         * Enum COUNT for value: "count"
         */
        public static final ViewEnum COUNT = new ViewEnum("count");

        /**
         * Enum COMMITS for value: "commits"
         */
        public static final ViewEnum COMMITS = new ViewEnum("commits");

        /**
         * Enum DIFFS for value: "diffs"
         */
        public static final ViewEnum DIFFS = new ViewEnum("diffs");

        /**
         * Enum FILES for value: "files"
         */
        public static final ViewEnum FILES = new ViewEnum("files");

        /**
         * Enum COMMITS_DIFFS for value: "commits,diffs"
         */
        public static final ViewEnum COMMITS_DIFFS = new ViewEnum("commits,diffs");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("count", COUNT);
            map.put("commits", COMMITS);
            map.put("diffs", DIFFS);
            map.put("files", FILES);
            map.put("commits,diffs", COMMITS_DIFFS);
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
    @JsonProperty(value = "only_count")

    private Boolean onlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    /**
     * **参数解释：** 根据给定的参数返回不同的结果。 **取值范围：** - change_lines，变更行数。
     */
    public static final class AdditionalFieldsEnum {

        /**
         * Enum CHANGE_LINES for value: "change_lines"
         */
        public static final AdditionalFieldsEnum CHANGE_LINES = new AdditionalFieldsEnum("change_lines");

        private static final Map<String, AdditionalFieldsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdditionalFieldsEnum> createStaticFields() {
            Map<String, AdditionalFieldsEnum> map = new HashMap<>();
            map.put("change_lines", CHANGE_LINES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdditionalFieldsEnum(String value) {
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
        public static AdditionalFieldsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdditionalFieldsEnum(value));
        }

        public static AdditionalFieldsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdditionalFieldsEnum) {
                return this.value.equals(((AdditionalFieldsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_fields")

    private AdditionalFieldsEnum additionalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowRefCompareRequest withRepositoryId(Integer repositoryId) {
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

    public ShowRefCompareRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 要开始比较的分支名称、标签名称或者commitid。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ShowRefCompareRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 要停止比较的分支名称、标签名称或者commitid。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ShowRefCompareRequest withCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * **参数解释：** 对比类型。 **取值范围：** - branch，分支。 - commit，提交。 - tag，标签。
     * @return compareType
     */
    public CompareTypeEnum getCompareType() {
        return compareType;
    }

    public void setCompareType(CompareTypeEnum compareType) {
        this.compareType = compareType;
    }

    public ShowRefCompareRequest withTargetId(Integer targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释：** 合并请求的目标仓库，默认为仓库ID。
     * minimum: 1
     * maximum: 2147483647
     * @return targetId
     */
    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public ShowRefCompareRequest withStraight(Boolean straight) {
        this.straight = straight;
        return this;
    }

    /**
     * **参数解释：** 比较方法。 **取值范围：** - true，用于`from`和`to`之间的直接比较(`from`..`to`)。 - false，使用merge base进行比较(`from`...`to`)。
     * @return straight
     */
    public Boolean getStraight() {
        return straight;
    }

    public void setStraight(Boolean straight) {
        this.straight = straight;
    }

    public ShowRefCompareRequest withIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
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

    public ShowRefCompareRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** 是否忽略空白数量更改。 **取值范围：** - count，数量。 - commits，提交信息。 - diffs，差异信息。 - files，文件信息。 - commits,diffs，提交信息和差异信息。
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ShowRefCompareRequest withOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
        return this;
    }

    /**
     * **参数解释：** 是否仅返回带有提交计数和diffs计数的结果。 **取值范围：** - true，仅返回带有提交计数和diffs计数的结果。 - false，按照compare_view参数返回结果信息。
     * @return onlyCount
     */
    public Boolean getOnlyCount() {
        return onlyCount;
    }

    public void setOnlyCount(Boolean onlyCount) {
        this.onlyCount = onlyCount;
    }

    public ShowRefCompareRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 根据给定的文件路径返回不同的结果。如果文件已重命名，则file_path应包括old_path和new_path，如“file_path=old_path,new_path”。 **取值范围：** 字符串长度不少于1，不超过100000。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ShowRefCompareRequest withAdditionalFields(AdditionalFieldsEnum additionalFields) {
        this.additionalFields = additionalFields;
        return this;
    }

    /**
     * **参数解释：** 根据给定的参数返回不同的结果。 **取值范围：** - change_lines，变更行数。
     * @return additionalFields
     */
    public AdditionalFieldsEnum getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(AdditionalFieldsEnum additionalFields) {
        this.additionalFields = additionalFields;
    }

    public ShowRefCompareRequest withOffset(Integer offset) {
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

    public ShowRefCompareRequest withLimit(Integer limit) {
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
        ShowRefCompareRequest that = (ShowRefCompareRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.targetId, that.targetId) && Objects.equals(this.straight, that.straight)
            && Objects.equals(this.ignoreWhitespaceChange, that.ignoreWhitespaceChange)
            && Objects.equals(this.view, that.view) && Objects.equals(this.onlyCount, that.onlyCount)
            && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.additionalFields, that.additionalFields) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            from,
            to,
            compareType,
            targetId,
            straight,
            ignoreWhitespaceChange,
            view,
            onlyCount,
            filePath,
            additionalFields,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefCompareRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    straight: ").append(toIndentedString(straight)).append("\n");
        sb.append("    ignoreWhitespaceChange: ").append(toIndentedString(ignoreWhitespaceChange)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    onlyCount: ").append(toIndentedString(onlyCount)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
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

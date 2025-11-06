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
public class ListRepositoryReviewAuthorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    /**
     * **参数解释：** 意见类型。 **取值范围：** - Commit，提交。 - MergeRequest，合并请求。  
     */
    public static final class NoteableTypeEnum {

        /**
         * Enum COMMIT for value: "Commit"
         */
        public static final NoteableTypeEnum COMMIT = new NoteableTypeEnum("Commit");

        /**
         * Enum MERGEREQUEST for value: "MergeRequest"
         */
        public static final NoteableTypeEnum MERGEREQUEST = new NoteableTypeEnum("MergeRequest");

        private static final Map<String, NoteableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoteableTypeEnum> createStaticFields() {
            Map<String, NoteableTypeEnum> map = new HashMap<>();
            map.put("Commit", COMMIT);
            map.put("MergeRequest", MERGEREQUEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoteableTypeEnum(String value) {
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
        public static NoteableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoteableTypeEnum(value));
        }

        public static NoteableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoteableTypeEnum) {
                return this.value.equals(((NoteableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "noteable_type")

    private NoteableTypeEnum noteableType;

    /**
     * **参数解释：** 解决状态。 **取值范围：** - resolved，已解决。 - unresolved，未解决。   - all，全部。
     */
    public static final class ResolvedStatusEnum {

        /**
         * Enum RESOLVED for value: "resolved"
         */
        public static final ResolvedStatusEnum RESOLVED = new ResolvedStatusEnum("resolved");

        /**
         * Enum UNRESOLVED for value: "unresolved"
         */
        public static final ResolvedStatusEnum UNRESOLVED = new ResolvedStatusEnum("unresolved");

        /**
         * Enum ALL for value: "all"
         */
        public static final ResolvedStatusEnum ALL = new ResolvedStatusEnum("all");

        private static final Map<String, ResolvedStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResolvedStatusEnum> createStaticFields() {
            Map<String, ResolvedStatusEnum> map = new HashMap<>();
            map.put("resolved", RESOLVED);
            map.put("unresolved", UNRESOLVED);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResolvedStatusEnum(String value) {
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
        public static ResolvedStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResolvedStatusEnum(value));
        }

        public static ResolvedStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResolvedStatusEnum) {
                return this.value.equals(((ResolvedStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_status")

    private ResolvedStatusEnum resolvedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewers_filter")

    private String reviewersFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRepositoryReviewAuthorsRequest withRepositoryId(Integer repositoryId) {
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

    public ListRepositoryReviewAuthorsRequest withNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
        return this;
    }

    /**
     * **参数解释：** 意见类型。 **取值范围：** - Commit，提交。 - MergeRequest，合并请求。  
     * @return noteableType
     */
    public NoteableTypeEnum getNoteableType() {
        return noteableType;
    }

    public void setNoteableType(NoteableTypeEnum noteableType) {
        this.noteableType = noteableType;
    }

    public ListRepositoryReviewAuthorsRequest withResolvedStatus(ResolvedStatusEnum resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
        return this;
    }

    /**
     * **参数解释：** 解决状态。 **取值范围：** - resolved，已解决。 - unresolved，未解决。   - all，全部。
     * @return resolvedStatus
     */
    public ResolvedStatusEnum getResolvedStatus() {
        return resolvedStatus;
    }

    public void setResolvedStatus(ResolvedStatusEnum resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
    }

    public ListRepositoryReviewAuthorsRequest withReviewersFilter(String reviewersFilter) {
        this.reviewersFilter = reviewersFilter;
        return this;
    }

    /**
     * **参数解释：** 根据检视人名字或用户名筛选意见。
     * @return reviewersFilter
     */
    public String getReviewersFilter() {
        return reviewersFilter;
    }

    public void setReviewersFilter(String reviewersFilter) {
        this.reviewersFilter = reviewersFilter;
    }

    public ListRepositoryReviewAuthorsRequest withOffset(Integer offset) {
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

    public ListRepositoryReviewAuthorsRequest withLimit(Integer limit) {
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
        ListRepositoryReviewAuthorsRequest that = (ListRepositoryReviewAuthorsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.noteableType, that.noteableType)
            && Objects.equals(this.resolvedStatus, that.resolvedStatus)
            && Objects.equals(this.reviewersFilter, that.reviewersFilter) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, noteableType, resolvedStatus, reviewersFilter, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryReviewAuthorsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
        sb.append("    resolvedStatus: ").append(toIndentedString(resolvedStatus)).append("\n");
        sb.append("    reviewersFilter: ").append(toIndentedString(reviewersFilter)).append("\n");
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

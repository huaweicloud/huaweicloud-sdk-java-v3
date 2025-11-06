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
public class ListMergeRequestValidAssignedCandidatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

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
    @JsonProperty(value = "search_by_name_list")

    private String searchByNameList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    /**
     * **参数解释：** The type of assignee, merge user or approver
     */
    public static final class ViewEnum {

        /**
         * Enum APPROVER for value: "approver"
         */
        public static final ViewEnum APPROVER = new ViewEnum("approver");

        /**
         * Enum ASSIGNEE for value: "assignee"
         */
        public static final ViewEnum ASSIGNEE = new ViewEnum("assignee");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("approver", APPROVER);
            map.put("assignee", ASSIGNEE);
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

    /**
     * **参数解释：** The type of assignee, merge user or approver
     */
    public static final class ModeEnum {

        /**
         * Enum APPROVER for value: "approver"
         */
        public static final ModeEnum APPROVER = new ModeEnum("approver");

        /**
         * Enum ASSIGNEE for value: "assignee"
         */
        public static final ModeEnum ASSIGNEE = new ModeEnum("assignee");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("approver", APPROVER);
            map.put("assignee", ASSIGNEE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_developers")

    private Boolean onlyDevelopers;

    public ListMergeRequestValidAssignedCandidatesRequest withRepositoryId(Integer repositoryId) {
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

    public ListMergeRequestValidAssignedCandidatesRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 目标分支。创建MR时，代码将要合入的分支。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withMergeRequestIid(Integer mergeRequestIid) {
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

    public ListMergeRequestValidAssignedCandidatesRequest withOffset(Integer offset) {
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

    public ListMergeRequestValidAssignedCandidatesRequest withLimit(Integer limit) {
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

    public ListMergeRequestValidAssignedCandidatesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 查询关键字，可模糊匹配用户名称、用户昵称、租户名称。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withSearchByNameList(String searchByNameList) {
        this.searchByNameList = searchByNameList;
        return this;
    }

    /**
     * **参数解释：** Search user list by name list。
     * @return searchByNameList
     */
    public String getSearchByNameList() {
        return searchByNameList;
    }

    public void setSearchByNameList(String searchByNameList) {
        this.searchByNameList = searchByNameList;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * **参数解释：** The type of assignee, merge user or approver
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释：** The type of assignee, merge user or approver
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ListMergeRequestValidAssignedCandidatesRequest withOnlyDevelopers(Boolean onlyDevelopers) {
        this.onlyDevelopers = onlyDevelopers;
        return this;
    }

    /**
     * **参数解释：** The type of memeber, developer
     * @return onlyDevelopers
     */
    public Boolean getOnlyDevelopers() {
        return onlyDevelopers;
    }

    public void setOnlyDevelopers(Boolean onlyDevelopers) {
        this.onlyDevelopers = onlyDevelopers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestValidAssignedCandidatesRequest that = (ListMergeRequestValidAssignedCandidatesRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.targetBranch, that.targetBranch)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.search, that.search)
            && Objects.equals(this.searchByNameList, that.searchByNameList)
            && Objects.equals(this.targetProjectId, that.targetProjectId) && Objects.equals(this.view, that.view)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.onlyDevelopers, that.onlyDevelopers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            targetBranch,
            mergeRequestIid,
            offset,
            limit,
            search,
            searchByNameList,
            targetProjectId,
            view,
            mode,
            onlyDevelopers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestValidAssignedCandidatesRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    searchByNameList: ").append(toIndentedString(searchByNameList)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    onlyDevelopers: ").append(toIndentedString(onlyDevelopers)).append("\n");
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

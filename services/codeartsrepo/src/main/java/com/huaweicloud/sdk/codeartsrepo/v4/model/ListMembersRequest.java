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
public class ListMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 权限点。 **约束限制：** - repository，仓库。 - code，代码。 - member，成员。 - branch，分支。 - tag，Tag。 - mr，MR。 - label，标签。
     */
    public static final class PermissionEnum {

        /**
         * Enum REPOSITORY for value: "repository"
         */
        public static final PermissionEnum REPOSITORY = new PermissionEnum("repository");

        /**
         * Enum CODE for value: "code"
         */
        public static final PermissionEnum CODE = new PermissionEnum("code");

        /**
         * Enum MEMBER for value: "member"
         */
        public static final PermissionEnum MEMBER = new PermissionEnum("member");

        /**
         * Enum BRANCH for value: "branch"
         */
        public static final PermissionEnum BRANCH = new PermissionEnum("branch");

        /**
         * Enum TAG for value: "tag"
         */
        public static final PermissionEnum TAG = new PermissionEnum("tag");

        /**
         * Enum MR for value: "mr"
         */
        public static final PermissionEnum MR = new PermissionEnum("mr");

        /**
         * Enum LABEL for value: "label"
         */
        public static final PermissionEnum LABEL = new PermissionEnum("label");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("repository", REPOSITORY);
            map.put("code", CODE);
            map.put("member", MEMBER);
            map.put("branch", BRANCH);
            map.put("tag", TAG);
            map.put("mr", MR);
            map.put("label", LABEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionEnum(value));
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionEnum permission;

    /**
     * **参数解释：** 权限动作点, 不同权限点有不同的动作。 **约束限制：** - repository：create,fork,delete,setting - code：push,download - member：create,update,delete - branch：create,delete - tag：create,delete - mr：create,update,comment,review,approve,merge,close,reopen - label：create,delete,update
     */
    public static final class ActionEnum {

        /**
         * Enum REPOSITORY_CREATE_FORK_DELETE_SETTING for value: "repository：create,fork,delete,setting"
         */
        public static final ActionEnum REPOSITORY_CREATE_FORK_DELETE_SETTING =
            new ActionEnum("repository：create,fork,delete,setting");

        /**
         * Enum CODE_PUSH_DOWNLOAD for value: "code：push,download"
         */
        public static final ActionEnum CODE_PUSH_DOWNLOAD = new ActionEnum("code：push,download");

        /**
         * Enum MEMBER_CREATE_UPDATE_DELETE for value: "member：create,update,delete"
         */
        public static final ActionEnum MEMBER_CREATE_UPDATE_DELETE = new ActionEnum("member：create,update,delete");

        /**
         * Enum BRANCH_CREATE_DELETE for value: "branch：create,delete"
         */
        public static final ActionEnum BRANCH_CREATE_DELETE = new ActionEnum("branch：create,delete");

        /**
         * Enum TAG_CREATE_DELETE for value: "tag：create,delete"
         */
        public static final ActionEnum TAG_CREATE_DELETE = new ActionEnum("tag：create,delete");

        /**
         * Enum MR_CREATE_UPDATE_COMMENT_REVIEW_APPROVE_MERGE_CLOSE_REOPEN for value: "mr：create,update,comment,review,approve,merge,close,reopen"
         */
        public static final ActionEnum MR_CREATE_UPDATE_COMMENT_REVIEW_APPROVE_MERGE_CLOSE_REOPEN =
            new ActionEnum("mr：create,update,comment,review,approve,merge,close,reopen");

        /**
         * Enum LABEL_CREATE_DELETE_UPDATE for value: "label：create,delete,update"
         */
        public static final ActionEnum LABEL_CREATE_DELETE_UPDATE = new ActionEnum("label：create,delete,update");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("repository：create,fork,delete,setting", REPOSITORY_CREATE_FORK_DELETE_SETTING);
            map.put("code：push,download", CODE_PUSH_DOWNLOAD);
            map.put("member：create,update,delete", MEMBER_CREATE_UPDATE_DELETE);
            map.put("branch：create,delete", BRANCH_CREATE_DELETE);
            map.put("tag：create,delete", TAG_CREATE_DELETE);
            map.put("mr：create,update,comment,review,approve,merge,close,reopen",
                MR_CREATE_UPDATE_COMMENT_REVIEW_APPROVE_MERGE_CLOSE_REOPEN);
            map.put("label：create,delete,update", LABEL_CREATE_DELETE_UPDATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    public ListMembersRequest withRepositoryId(Integer repositoryId) {
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

    public ListMembersRequest withSearch(String search) {
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

    public ListMembersRequest withOffset(Integer offset) {
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

    public ListMembersRequest withLimit(Integer limit) {
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

    public ListMembersRequest withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **参数解释：** 权限点。 **约束限制：** - repository，仓库。 - code，代码。 - member，成员。 - branch，分支。 - tag，Tag。 - mr，MR。 - label，标签。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public ListMembersRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 权限动作点, 不同权限点有不同的动作。 **约束限制：** - repository：create,fork,delete,setting - code：push,download - member：create,update,delete - branch：create,delete - tag：create,delete - mr：create,update,comment,review,approve,merge,close,reopen - label：create,delete,update
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMembersRequest that = (ListMembersRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.search, that.search)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, search, offset, limit, permission, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMembersRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

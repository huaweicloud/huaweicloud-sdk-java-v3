package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectProtectedTagActionDto
 */
public class ProjectProtectedTagActionDto {

    /**
     * **参数解释：** 事件名称。 **取值范围：read 查询,create-delete 增删,create 创建** 字符串长度不少于1，不超过1000。
     */
    public static final class ActionEnum {

        /**
         * Enum READ for value: "read"
         */
        public static final ActionEnum READ = new ActionEnum("read");

        /**
         * Enum CREATE_DELETE for value: "create-delete"
         */
        public static final ActionEnum CREATE_DELETE = new ActionEnum("create-delete");

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("create-delete", CREATE_DELETE);
            map.put("create", CREATE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<Integer> userIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_names")

    private List<String> userNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_team_ids")

    private List<Integer> userTeamIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_team_names")

    private List<String> userTeamNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_role_ids")

    private List<String> relatedRoleIds = null;

    public ProjectProtectedTagActionDto withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 事件名称。 **取值范围：read 查询,create-delete 增删,create 创建** 字符串长度不少于1，不超过1000。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ProjectProtectedTagActionDto withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ProjectProtectedTagActionDto withUserIds(List<Integer> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ProjectProtectedTagActionDto addUserIdsItem(Integer userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public ProjectProtectedTagActionDto withUserIds(Consumer<List<Integer>> userIdsSetter) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /**
     * **参数解释：** 用户ID列表。 **约束限制：** 不涉及。 **取值范围：** Integer **默认取值：** 不涉及。
     * @return userIds
     */
    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public ProjectProtectedTagActionDto withUserNames(List<String> userNames) {
        this.userNames = userNames;
        return this;
    }

    public ProjectProtectedTagActionDto addUserNamesItem(String userNamesItem) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        this.userNames.add(userNamesItem);
        return this;
    }

    public ProjectProtectedTagActionDto withUserNames(Consumer<List<String>> userNamesSetter) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        userNamesSetter.accept(this.userNames);
        return this;
    }

    /**
     * **参数解释：** 用户name列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return userNames
     */
    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public ProjectProtectedTagActionDto withUserTeamIds(List<Integer> userTeamIds) {
        this.userTeamIds = userTeamIds;
        return this;
    }

    public ProjectProtectedTagActionDto addUserTeamIdsItem(Integer userTeamIdsItem) {
        if (this.userTeamIds == null) {
            this.userTeamIds = new ArrayList<>();
        }
        this.userTeamIds.add(userTeamIdsItem);
        return this;
    }

    public ProjectProtectedTagActionDto withUserTeamIds(Consumer<List<Integer>> userTeamIdsSetter) {
        if (this.userTeamIds == null) {
            this.userTeamIds = new ArrayList<>();
        }
        userTeamIdsSetter.accept(this.userTeamIds);
        return this;
    }

    /**
     * **参数解释：** 成员组ID列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return userTeamIds
     */
    public List<Integer> getUserTeamIds() {
        return userTeamIds;
    }

    public void setUserTeamIds(List<Integer> userTeamIds) {
        this.userTeamIds = userTeamIds;
    }

    public ProjectProtectedTagActionDto withUserTeamNames(List<String> userTeamNames) {
        this.userTeamNames = userTeamNames;
        return this;
    }

    public ProjectProtectedTagActionDto addUserTeamNamesItem(String userTeamNamesItem) {
        if (this.userTeamNames == null) {
            this.userTeamNames = new ArrayList<>();
        }
        this.userTeamNames.add(userTeamNamesItem);
        return this;
    }

    public ProjectProtectedTagActionDto withUserTeamNames(Consumer<List<String>> userTeamNamesSetter) {
        if (this.userTeamNames == null) {
            this.userTeamNames = new ArrayList<>();
        }
        userTeamNamesSetter.accept(this.userTeamNames);
        return this;
    }

    /**
     * **参数解释：** 成员组name列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return userTeamNames
     */
    public List<String> getUserTeamNames() {
        return userTeamNames;
    }

    public void setUserTeamNames(List<String> userTeamNames) {
        this.userTeamNames = userTeamNames;
    }

    public ProjectProtectedTagActionDto withRelatedRoleIds(List<String> relatedRoleIds) {
        this.relatedRoleIds = relatedRoleIds;
        return this;
    }

    public ProjectProtectedTagActionDto addRelatedRoleIdsItem(String relatedRoleIdsItem) {
        if (this.relatedRoleIds == null) {
            this.relatedRoleIds = new ArrayList<>();
        }
        this.relatedRoleIds.add(relatedRoleIdsItem);
        return this;
    }

    public ProjectProtectedTagActionDto withRelatedRoleIds(Consumer<List<String>> relatedRoleIdsSetter) {
        if (this.relatedRoleIds == null) {
            this.relatedRoleIds = new ArrayList<>();
        }
        relatedRoleIdsSetter.accept(this.relatedRoleIds);
        return this;
    }

    /**
     * **参数解释：** 关联角色ID列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return relatedRoleIds
     */
    public List<String> getRelatedRoleIds() {
        return relatedRoleIds;
    }

    public void setRelatedRoleIds(List<String> relatedRoleIds) {
        this.relatedRoleIds = relatedRoleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectProtectedTagActionDto that = (ProjectProtectedTagActionDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.userIds, that.userIds) && Objects.equals(this.userNames, that.userNames)
            && Objects.equals(this.userTeamIds, that.userTeamIds)
            && Objects.equals(this.userTeamNames, that.userTeamNames)
            && Objects.equals(this.relatedRoleIds, that.relatedRoleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enable, userIds, userNames, userTeamIds, userTeamNames, relatedRoleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectProtectedTagActionDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
        sb.append("    userTeamIds: ").append(toIndentedString(userTeamIds)).append("\n");
        sb.append("    userTeamNames: ").append(toIndentedString(userTeamNames)).append("\n");
        sb.append("    relatedRoleIds: ").append(toIndentedString(relatedRoleIds)).append("\n");
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

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
 * RepositoryProtectedTagActionBodyDto
 */
public class RepositoryProtectedTagActionBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<Object> userIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_team_ids")

    private List<Integer> userTeamIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_role_ids")

    private List<String> relatedRoleIds = null;

    /**
     * **参数解释：** 事件名称。 **约束限制：** 不涉及 **取值范围：** - create，创建。 **默认取值：** 不涉及。
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
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

    public RepositoryProtectedTagActionBodyDto withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否启用。 **约束限制：** 不涉及。 **取值范围：** - true，开启规则限制 - false，关闭规则限制 **默认取值：** 不涉及。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public RepositoryProtectedTagActionBodyDto withUserIds(List<Object> userIds) {
        this.userIds = userIds;
        return this;
    }

    public RepositoryProtectedTagActionBodyDto addUserIdsItem(Object userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public RepositoryProtectedTagActionBodyDto withUserIds(Consumer<List<Object>> userIdsSetter) {
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
    public List<Object> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Object> userIds) {
        this.userIds = userIds;
    }

    public RepositoryProtectedTagActionBodyDto withUserTeamIds(List<Integer> userTeamIds) {
        this.userTeamIds = userTeamIds;
        return this;
    }

    public RepositoryProtectedTagActionBodyDto addUserTeamIdsItem(Integer userTeamIdsItem) {
        if (this.userTeamIds == null) {
            this.userTeamIds = new ArrayList<>();
        }
        this.userTeamIds.add(userTeamIdsItem);
        return this;
    }

    public RepositoryProtectedTagActionBodyDto withUserTeamIds(Consumer<List<Integer>> userTeamIdsSetter) {
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

    public RepositoryProtectedTagActionBodyDto withRelatedRoleIds(List<String> relatedRoleIds) {
        this.relatedRoleIds = relatedRoleIds;
        return this;
    }

    public RepositoryProtectedTagActionBodyDto addRelatedRoleIdsItem(String relatedRoleIdsItem) {
        if (this.relatedRoleIds == null) {
            this.relatedRoleIds = new ArrayList<>();
        }
        this.relatedRoleIds.add(relatedRoleIdsItem);
        return this;
    }

    public RepositoryProtectedTagActionBodyDto withRelatedRoleIds(Consumer<List<String>> relatedRoleIdsSetter) {
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

    public RepositoryProtectedTagActionBodyDto withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 事件名称。 **约束限制：** 不涉及 **取值范围：** - create，创建。 **默认取值：** 不涉及。
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
        RepositoryProtectedTagActionBodyDto that = (RepositoryProtectedTagActionBodyDto) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.userIds, that.userIds)
            && Objects.equals(this.userTeamIds, that.userTeamIds)
            && Objects.equals(this.relatedRoleIds, that.relatedRoleIds) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, userIds, userTeamIds, relatedRoleIds, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryProtectedTagActionBodyDto {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    userTeamIds: ").append(toIndentedString(userTeamIds)).append("\n");
        sb.append("    relatedRoleIds: ").append(toIndentedString(relatedRoleIds)).append("\n");
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

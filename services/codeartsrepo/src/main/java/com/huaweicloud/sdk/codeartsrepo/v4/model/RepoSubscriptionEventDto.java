package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
 * RepoSubscriptionEventDto
 */
public class RepoSubscriptionEventDto {

    /**
     * **参数解释：** 资源类型。 - repo，仓库。 - mr，合并请求。  - member，成员。 - note，检视意见。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum REPO for value: "repo"
         */
        public static final ResourceTypeEnum REPO = new ResourceTypeEnum("repo");

        /**
         * Enum MR for value: "mr"
         */
        public static final ResourceTypeEnum MR = new ResourceTypeEnum("mr");

        /**
         * Enum MEMBER for value: "member"
         */
        public static final ResourceTypeEnum MEMBER = new ResourceTypeEnum("member");

        /**
         * Enum NOTE for value: "note"
         */
        public static final ResourceTypeEnum NOTE = new ResourceTypeEnum("note");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("repo", REPO);
            map.put("mr", MR);
            map.put("member", MEMBER);
            map.put("note", NOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * **参数解释：** 事件名。 - create，创建。 - open，开启。 - update，更新。  - delete，删除。 - merge，合并。 - review，检视。  - approve，审核。 - create_note，新建评审意见。 - resolve_note，解决评审意见。 - mention，被提及。
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        /**
         * Enum OPEN for value: "open"
         */
        public static final ActionEnum OPEN = new ActionEnum("open");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final ActionEnum UPDATE = new ActionEnum("update");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ActionEnum MERGE = new ActionEnum("merge");

        /**
         * Enum REVIEW for value: "review"
         */
        public static final ActionEnum REVIEW = new ActionEnum("review");

        /**
         * Enum APPROVE for value: "approve"
         */
        public static final ActionEnum APPROVE = new ActionEnum("approve");

        /**
         * Enum CREATE_NOTE for value: "create_note"
         */
        public static final ActionEnum CREATE_NOTE = new ActionEnum("create_note");

        /**
         * Enum RESOLVE_NOTE for value: "resolve_note"
         */
        public static final ActionEnum RESOLVE_NOTE = new ActionEnum("resolve_note");

        /**
         * Enum CAPACITY_WARNING for value: "capacity_warning"
         */
        public static final ActionEnum CAPACITY_WARNING = new ActionEnum("capacity_warning");

        /**
         * Enum MENTION for value: "mention"
         */
        public static final ActionEnum MENTION = new ActionEnum("mention");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put("open", OPEN);
            map.put("update", UPDATE);
            map.put("delete", DELETE);
            map.put("merge", MERGE);
            map.put("review", REVIEW);
            map.put("approve", APPROVE);
            map.put("create_note", CREATE_NOTE);
            map.put("resolve_note", RESOLVE_NOTE);
            map.put("capacity_warning", CAPACITY_WARNING);
            map.put("mention", MENTION);
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
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_ids")

    private List<String> roleIds = null;

    /**
     * Gets or Sets roleNames
     */
    public static final class RoleNamesEnum {

        /**
         * Enum CREATOR for value: "creator"
         */
        public static final RoleNamesEnum CREATOR = new RoleNamesEnum("creator");

        /**
         * Enum ASSIGNEE for value: "assignee"
         */
        public static final RoleNamesEnum ASSIGNEE = new RoleNamesEnum("assignee");

        /**
         * Enum REVIEWER for value: "reviewer"
         */
        public static final RoleNamesEnum REVIEWER = new RoleNamesEnum("reviewer");

        /**
         * Enum SCORER for value: "scorer"
         */
        public static final RoleNamesEnum SCORER = new RoleNamesEnum("scorer");

        /**
         * Enum APPROVER for value: "approver"
         */
        public static final RoleNamesEnum APPROVER = new RoleNamesEnum("approver");

        private static final Map<String, RoleNamesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleNamesEnum> createStaticFields() {
            Map<String, RoleNamesEnum> map = new HashMap<>();
            map.put("creator", CREATOR);
            map.put("assignee", ASSIGNEE);
            map.put("reviewer", REVIEWER);
            map.put("scorer", SCORER);
            map.put("approver", APPROVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleNamesEnum(String value) {
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
        public static RoleNamesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleNamesEnum(value));
        }

        public static RoleNamesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleNamesEnum) {
                return this.value.equals(((RoleNamesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_names")

    private List<RoleNamesEnum> roleNames = null;

    public RepoSubscriptionEventDto withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 - repo，仓库。 - mr，合并请求。  - member，成员。 - note，检视意见。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public RepoSubscriptionEventDto withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 事件名。 - create，创建。 - open，开启。 - update，更新。  - delete，删除。 - merge，合并。 - review，检视。  - approve，审核。 - create_note，新建评审意见。 - resolve_note，解决评审意见。 - mention，被提及。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public RepoSubscriptionEventDto withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 启用事件通知
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public RepoSubscriptionEventDto withRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
        return this;
    }

    public RepoSubscriptionEventDto addRoleIdsItem(String roleIdsItem) {
        if (this.roleIds == null) {
            this.roleIds = new ArrayList<>();
        }
        this.roleIds.add(roleIdsItem);
        return this;
    }

    public RepoSubscriptionEventDto withRoleIds(Consumer<List<String>> roleIdsSetter) {
        if (this.roleIds == null) {
            this.roleIds = new ArrayList<>();
        }
        roleIdsSetter.accept(this.roleIds);
        return this;
    }

    /**
     * **参数解释：** 通知的角色ID列表
     * @return roleIds
     */
    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public RepoSubscriptionEventDto withRoleNames(List<RoleNamesEnum> roleNames) {
        this.roleNames = roleNames;
        return this;
    }

    public RepoSubscriptionEventDto addRoleNamesItem(RoleNamesEnum roleNamesItem) {
        if (this.roleNames == null) {
            this.roleNames = new ArrayList<>();
        }
        this.roleNames.add(roleNamesItem);
        return this;
    }

    public RepoSubscriptionEventDto withRoleNames(Consumer<List<RoleNamesEnum>> roleNamesSetter) {
        if (this.roleNames == null) {
            this.roleNames = new ArrayList<>();
        }
        roleNamesSetter.accept(this.roleNames);
        return this;
    }

    /**
     * **参数解释：** 通知的角色名称列表。 - creator，创建者。 - assignee，合并人。 - reviewer，评审人。 - scorer，审核人。 - approver，检视人。
     * @return roleNames
     */
    public List<RoleNamesEnum> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<RoleNamesEnum> roleNames) {
        this.roleNames = roleNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoSubscriptionEventDto that = (RepoSubscriptionEventDto) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.action, that.action)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.roleIds, that.roleIds)
            && Objects.equals(this.roleNames, that.roleNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, action, enabled, roleIds, roleNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoSubscriptionEventDto {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
        sb.append("    roleNames: ").append(toIndentedString(roleNames)).append("\n");
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

package com.huaweicloud.sdk.iam.v5.model;

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
 * 授权项。
 */
public class Action {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 在策略中使用此授权项时授予的访问级别。
     */
    public static final class AccessLevelEnum {

        /**
         * Enum LIST for value: "list"
         */
        public static final AccessLevelEnum LIST = new AccessLevelEnum("list");

        /**
         * Enum READ for value: "read"
         */
        public static final AccessLevelEnum READ = new AccessLevelEnum("read");

        /**
         * Enum WRITE for value: "write"
         */
        public static final AccessLevelEnum WRITE = new AccessLevelEnum("write");

        /**
         * Enum PERMISSION_MANAGEMENT for value: "permission_management"
         */
        public static final AccessLevelEnum PERMISSION_MANAGEMENT = new AccessLevelEnum("permission_management");

        /**
         * Enum TAGGING for value: "tagging"
         */
        public static final AccessLevelEnum TAGGING = new AccessLevelEnum("tagging");

        private static final Map<String, AccessLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessLevelEnum> createStaticFields() {
            Map<String, AccessLevelEnum> map = new HashMap<>();
            map.put("list", LIST);
            map.put("read", READ);
            map.put("write", WRITE);
            map.put("permission_management", PERMISSION_MANAGEMENT);
            map.put("tagging", TAGGING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessLevelEnum(String value) {
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
        public static AccessLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessLevelEnum(value));
        }

        public static AccessLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessLevelEnum) {
                return this.value.equals(((AccessLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private AccessLevelEnum accessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_only")

    private Boolean permissionOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Description description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aliases")

    private List<String> aliases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ActionAssociatedResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_keys")

    private List<String> conditionKeys = null;

    public Action withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 三段式的授权项名称，例如\"iam:policies:createV5\"。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action withAccessLevel(AccessLevelEnum accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * 在策略中使用此授权项时授予的访问级别。
     * @return accessLevel
     */
    public AccessLevelEnum getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevelEnum accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Action withPermissionOnly(Boolean permissionOnly) {
        this.permissionOnly = permissionOnly;
        return this;
    }

    /**
     * 该授权项是否仅作为权限点，不对应任何操作。
     * @return permissionOnly
     */
    public Boolean getPermissionOnly() {
        return permissionOnly;
    }

    public void setPermissionOnly(Boolean permissionOnly) {
        this.permissionOnly = permissionOnly;
    }

    public Action withDescription(Description description) {
        this.description = description;
        return this;
    }

    public Action withDescription(Consumer<Description> descriptionSetter) {
        if (this.description == null) {
            this.description = new Description();
            descriptionSetter.accept(this.description);
        }

        return this;
    }

    /**
     * Get description
     * @return description
     */
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Action withAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Action addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    public Action withAliases(Consumer<List<String>> aliasesSetter) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        aliasesSetter.accept(this.aliases);
        return this;
    }

    /**
     * 授权项别名列表，用以兼容授权项改名或者拆分新授权项的场景。
     * @return aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Action withResources(List<ActionAssociatedResource> resources) {
        this.resources = resources;
        return this;
    }

    public Action addResourcesItem(ActionAssociatedResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public Action withResources(Consumer<List<ActionAssociatedResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 与该授权项关联的资源列表，用于定义授权项的资源级权限。
     * @return resources
     */
    public List<ActionAssociatedResource> getResources() {
        return resources;
    }

    public void setResources(List<ActionAssociatedResource> resources) {
        this.resources = resources;
    }

    public Action withConditionKeys(List<String> conditionKeys) {
        this.conditionKeys = conditionKeys;
        return this;
    }

    public Action addConditionKeysItem(String conditionKeysItem) {
        if (this.conditionKeys == null) {
            this.conditionKeys = new ArrayList<>();
        }
        this.conditionKeys.add(conditionKeysItem);
        return this;
    }

    public Action withConditionKeys(Consumer<List<String>> conditionKeysSetter) {
        if (this.conditionKeys == null) {
            this.conditionKeys = new ArrayList<>();
        }
        conditionKeysSetter.accept(this.conditionKeys);
        return this;
    }

    /**
     * 该授权项支持的，且与资源无关的服务自定义条件属性以及部分全局属性。
     * @return conditionKeys
     */
    public List<String> getConditionKeys() {
        return conditionKeys;
    }

    public void setConditionKeys(List<String> conditionKeys) {
        this.conditionKeys = conditionKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Action that = (Action) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.accessLevel, that.accessLevel)
            && Objects.equals(this.permissionOnly, that.permissionOnly)
            && Objects.equals(this.description, that.description) && Objects.equals(this.aliases, that.aliases)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.conditionKeys, that.conditionKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accessLevel, permissionOnly, description, aliases, resources, conditionKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Action {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
        sb.append("    permissionOnly: ").append(toIndentedString(permissionOnly)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    conditionKeys: ").append(toIndentedString(conditionKeys)).append("\n");
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

package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Topic
 */
public class Topic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * TOPIC权限, 主题权限 0-发布 1-订阅
     */
    public static final class PermissionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PermissionEnum NUMBER_0 = new PermissionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PermissionEnum NUMBER_1 = new PermissionEnum(1);

        private static final Map<Integer, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PermissionEnum> createStaticFields() {
            Map<Integer, PermissionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PermissionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionEnum(value));
        }

        public static PermissionEnum valueOf(Integer value) {
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
     * TOPIC类型 0-基础TOPIC 1-用户自定义TOPIC
     */
    public static final class IsPrivateEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsPrivateEnum NUMBER_0 = new IsPrivateEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsPrivateEnum NUMBER_1 = new IsPrivateEnum(1);

        private static final Map<Integer, IsPrivateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsPrivateEnum> createStaticFields() {
            Map<Integer, IsPrivateEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsPrivateEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsPrivateEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsPrivateEnum(value));
        }

        public static IsPrivateEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsPrivateEnum) {
                return this.value.equals(((IsPrivateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_private")

    private IsPrivateEnum isPrivate;

    public Topic withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * TOPIC的ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Topic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * TOPIC的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * TOPIC描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * TOPIC权限, 主题权限 0-发布 1-订阅
     * minimum: 0
     * maximum: 10
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public Topic withIsPrivate(IsPrivateEnum isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * TOPIC类型 0-基础TOPIC 1-用户自定义TOPIC
     * minimum: 0
     * maximum: 10
     * @return isPrivate
     */
    public IsPrivateEnum getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(IsPrivateEnum isPrivate) {
        this.isPrivate = isPrivate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Topic that = (Topic) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.isPrivate, that.isPrivate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, permission, isPrivate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Topic {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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

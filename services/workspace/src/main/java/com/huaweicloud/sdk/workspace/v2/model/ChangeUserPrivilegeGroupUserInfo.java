package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 桌面分配用户信息。
 */
public class ChangeUserPrivilegeGroupUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_privilege_group")

    private String userPrivilegeGroup;

    /**
     * 对象类型，可选值为： - USER：用户。 - GROUP：用户组。
     */
    public static final class TypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final TypeEnum USER = new TypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final TypeEnum GROUP = new TypeEnum("GROUP");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public ChangeUserPrivilegeGroupUserInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面分配对象的名称，当type类型USER时填写用户名字；当type类型GROUP时填写用户组名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ChangeUserPrivilegeGroupUserInfo withUserPrivilegeGroup(String userPrivilegeGroup) {
        this.userPrivilegeGroup = userPrivilegeGroup;
        return this;
    }

    /**
     * 桌面用户所属的用户组。 - sudo：Linux管理员组。 - default：Linux默认用户组。 - administrators：Windows管理员组。管理员拥有对该桌面的完全访问权，可以做任何需要的更改（禁用操作除外）。 - users：Windows标准用户组。标准用户可以使用大多数软件，并可以更改不影响其他用户的系统设置。
     * @return userPrivilegeGroup
     */
    public String getUserPrivilegeGroup() {
        return userPrivilegeGroup;
    }

    public void setUserPrivilegeGroup(String userPrivilegeGroup) {
        this.userPrivilegeGroup = userPrivilegeGroup;
    }

    public ChangeUserPrivilegeGroupUserInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型，可选值为： - USER：用户。 - GROUP：用户组。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeUserPrivilegeGroupUserInfo that = (ChangeUserPrivilegeGroupUserInfo) obj;
        return Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPrivilegeGroup, that.userPrivilegeGroup) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userPrivilegeGroup, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeUserPrivilegeGroupUserInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPrivilegeGroup: ").append(toIndentedString(userPrivilegeGroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

package com.huaweicloud.sdk.dli.v1.model;

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
 * AuthorizeResourceRequestBody
 */
public class AuthorizeResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_project_id")

    private String grantProjectId;

    /**
     * 指定赋权或回收。值为：grant，revoke或update。  说明：当用户同时拥有grant和revoke权限的时候才有权限使用update操作。
     */
    public static final class ActionEnum {

        /**
         * Enum GRANT for value: "grant"
         */
        public static final ActionEnum GRANT = new ActionEnum("grant");

        /**
         * Enum REVOKE for value: "revoke"
         */
        public static final ActionEnum REVOKE = new ActionEnum("revoke");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final ActionEnum UPDATE = new ActionEnum("update");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("grant", GRANT);
            map.put("revoke", REVOKE);
            map.put("update", UPDATE);
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
    @JsonProperty(value = "privileges")

    private List<Privilege> privileges = null;

    public AuthorizeResourceRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 被赋权的用户名称，该用户将有权访问指定的DLI资源权限，被收回或者更新访问权限。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AuthorizeResourceRequestBody withGrantProjectId(String grantProjectId) {
        this.grantProjectId = grantProjectId;
        return this;
    }

    /**
     * 被赋权的项目ID，数据赋权给其他项目后，该项目的管理员将 有权访问指定的DLI资源权限，被收回或者更新访问权限。
     * @return grantProjectId
     */
    public String getGrantProjectId() {
        return grantProjectId;
    }

    public void setGrantProjectId(String grantProjectId) {
        this.grantProjectId = grantProjectId;
    }

    public AuthorizeResourceRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 指定赋权或回收。值为：grant，revoke或update。  说明：当用户同时拥有grant和revoke权限的时候才有权限使用update操作。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public AuthorizeResourceRequestBody withPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public AuthorizeResourceRequestBody addPrivilegesItem(Privilege privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public AuthorizeResourceRequestBody withPrivileges(Consumer<List<Privilege>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 赋权信息。具体参数请参考Privilege参数。
     * @return privileges
     */
    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeResourceRequestBody that = (AuthorizeResourceRequestBody) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.grantProjectId, that.grantProjectId)
            && Objects.equals(this.action, that.action) && Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, grantProjectId, action, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeResourceRequestBody {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    grantProjectId: ").append(toIndentedString(grantProjectId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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

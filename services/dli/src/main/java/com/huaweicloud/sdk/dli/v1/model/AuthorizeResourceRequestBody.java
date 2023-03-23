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
    @JsonProperty(value = "projectId")

    private String projectId;

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
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public AuthorizeResourceRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 被赋权的项目ID，数据赋权给其他项目后，该项目的管理员将 有权访问指定的DLI资源权限，被收回或者更新访问权限。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizeResourceRequestBody authorizeResourceRequestBody = (AuthorizeResourceRequestBody) o;
        return Objects.equals(this.userName, authorizeResourceRequestBody.userName)
            && Objects.equals(this.projectId, authorizeResourceRequestBody.projectId)
            && Objects.equals(this.action, authorizeResourceRequestBody.action)
            && Objects.equals(this.privileges, authorizeResourceRequestBody.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, projectId, action, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeResourceRequestBody {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

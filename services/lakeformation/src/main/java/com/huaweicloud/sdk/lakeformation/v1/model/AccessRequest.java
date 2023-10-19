package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * CheckPoliciesInput body
 */
public class AccessRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private ResourceInput resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private List<Principal> principal = null;

    /**
     * 权限信息,ALL,CREATE,ALTER,DROP,DESCRIBE,EXEC,CREATE_DATABASE,LIST_DATABASE,CREATE_TABLE,LIST_TABLE,CREATE_FUNC,LIST_FUNC,REGISTER_MODEL,LIST_MODEL,INSERT,UPDATE,DELETE,SELECT,READ,WRITE,OPERATE,USE
     */
    public static final class ActionEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final ActionEnum ALL = new ActionEnum("ALL");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final ActionEnum CREATE = new ActionEnum("CREATE");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final ActionEnum ALTER = new ActionEnum("ALTER");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final ActionEnum DROP = new ActionEnum("DROP");

        /**
         * Enum DESCRIBE for value: "DESCRIBE"
         */
        public static final ActionEnum DESCRIBE = new ActionEnum("DESCRIBE");

        /**
         * Enum EXEC for value: "EXEC"
         */
        public static final ActionEnum EXEC = new ActionEnum("EXEC");

        /**
         * Enum CREATE_DATABASE for value: "CREATE_DATABASE"
         */
        public static final ActionEnum CREATE_DATABASE = new ActionEnum("CREATE_DATABASE");

        /**
         * Enum LIST_DATABASE for value: "LIST_DATABASE"
         */
        public static final ActionEnum LIST_DATABASE = new ActionEnum("LIST_DATABASE");

        /**
         * Enum CREATE_TABLE for value: "CREATE_TABLE"
         */
        public static final ActionEnum CREATE_TABLE = new ActionEnum("CREATE_TABLE");

        /**
         * Enum LIST_TABLE for value: "LIST_TABLE"
         */
        public static final ActionEnum LIST_TABLE = new ActionEnum("LIST_TABLE");

        /**
         * Enum CREATE_FUNC for value: "CREATE_FUNC"
         */
        public static final ActionEnum CREATE_FUNC = new ActionEnum("CREATE_FUNC");

        /**
         * Enum LIST_FUNC for value: "LIST_FUNC"
         */
        public static final ActionEnum LIST_FUNC = new ActionEnum("LIST_FUNC");

        /**
         * Enum REGISTER_MODEL for value: "REGISTER_MODEL"
         */
        public static final ActionEnum REGISTER_MODEL = new ActionEnum("REGISTER_MODEL");

        /**
         * Enum LIST_MODEL for value: "LIST_MODEL"
         */
        public static final ActionEnum LIST_MODEL = new ActionEnum("LIST_MODEL");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final ActionEnum INSERT = new ActionEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final ActionEnum UPDATE = new ActionEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final ActionEnum SELECT = new ActionEnum("SELECT");

        /**
         * Enum READ for value: "READ"
         */
        public static final ActionEnum READ = new ActionEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final ActionEnum WRITE = new ActionEnum("WRITE");

        /**
         * Enum OPERATE for value: "OPERATE"
         */
        public static final ActionEnum OPERATE = new ActionEnum("OPERATE");

        /**
         * Enum USE for value: "USE"
         */
        public static final ActionEnum USE = new ActionEnum("USE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("CREATE", CREATE);
            map.put("ALTER", ALTER);
            map.put("DROP", DROP);
            map.put("DESCRIBE", DESCRIBE);
            map.put("EXEC", EXEC);
            map.put("CREATE_DATABASE", CREATE_DATABASE);
            map.put("LIST_DATABASE", LIST_DATABASE);
            map.put("CREATE_TABLE", CREATE_TABLE);
            map.put("LIST_TABLE", LIST_TABLE);
            map.put("CREATE_FUNC", CREATE_FUNC);
            map.put("LIST_FUNC", LIST_FUNC);
            map.put("REGISTER_MODEL", REGISTER_MODEL);
            map.put("LIST_MODEL", LIST_MODEL);
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("SELECT", SELECT);
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            map.put("OPERATE", OPERATE);
            map.put("USE", USE);
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

    public AccessRequest withResource(ResourceInput resource) {
        this.resource = resource;
        return this;
    }

    public AccessRequest withResource(Consumer<ResourceInput> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ResourceInput();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public ResourceInput getResource() {
        return resource;
    }

    public void setResource(ResourceInput resource) {
        this.resource = resource;
    }

    public AccessRequest withPrincipal(List<Principal> principal) {
        this.principal = principal;
        return this;
    }

    public AccessRequest addPrincipalItem(Principal principalItem) {
        if (this.principal == null) {
            this.principal = new ArrayList<>();
        }
        this.principal.add(principalItem);
        return this;
    }

    public AccessRequest withPrincipal(Consumer<List<Principal>> principalSetter) {
        if (this.principal == null) {
            this.principal = new ArrayList<>();
        }
        principalSetter.accept(this.principal);
        return this;
    }

    /**
     * 授权主体信息
     * @return principal
     */
    public List<Principal> getPrincipal() {
        return principal;
    }

    public void setPrincipal(List<Principal> principal) {
        this.principal = principal;
    }

    public AccessRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 权限信息,ALL,CREATE,ALTER,DROP,DESCRIBE,EXEC,CREATE_DATABASE,LIST_DATABASE,CREATE_TABLE,LIST_TABLE,CREATE_FUNC,LIST_FUNC,REGISTER_MODEL,LIST_MODEL,INSERT,UPDATE,DELETE,SELECT,READ,WRITE,OPERATE,USE
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
        AccessRequest that = (AccessRequest) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, principal, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessRequest {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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

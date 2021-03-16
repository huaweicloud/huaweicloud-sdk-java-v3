package com.huaweicloud.sdk.cloudide.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RoleAction
 */
public class RoleAction  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_cname")
    
    private String actionCname;
    /**
     * 执行动作
     */
    public static final class ActionsEnum {

        
        /**
         * Enum CREATE_INSTANCE for value: "CREATE_INSTANCE"
         */
        public static final ActionsEnum CREATE_INSTANCE = new ActionsEnum("CREATE_INSTANCE");
        
        /**
         * Enum DELETE_INSTANCE for value: "DELETE_INSTANCE"
         */
        public static final ActionsEnum DELETE_INSTANCE = new ActionsEnum("DELETE_INSTANCE");
        
        /**
         * Enum UPDATE_INSTANCE for value: "UPDATE_INSTANCE"
         */
        public static final ActionsEnum UPDATE_INSTANCE = new ActionsEnum("UPDATE_INSTANCE");
        
        /**
         * Enum QUERY_INSTANCE for value: "QUERY_INSTANCE"
         */
        public static final ActionsEnum QUERY_INSTANCE = new ActionsEnum("QUERY_INSTANCE");
        
        /**
         * Enum RUN_INSTANCE for value: "RUN_INSTANCE"
         */
        public static final ActionsEnum RUN_INSTANCE = new ActionsEnum("RUN_INSTANCE");
        
        /**
         * Enum CREATE_SUB_ORG for value: "CREATE_SUB_ORG"
         */
        public static final ActionsEnum CREATE_SUB_ORG = new ActionsEnum("CREATE_SUB_ORG");
        
        /**
         * Enum UPDATE_SUB_ORG for value: "UPDATE_SUB_ORG"
         */
        public static final ActionsEnum UPDATE_SUB_ORG = new ActionsEnum("UPDATE_SUB_ORG");
        
        /**
         * Enum DELETE_SUB_ORG for value: "DELETE_SUB_ORG"
         */
        public static final ActionsEnum DELETE_SUB_ORG = new ActionsEnum("DELETE_SUB_ORG");
        
        /**
         * Enum QUERY_SUB_ORG for value: "QUERY_SUB_ORG"
         */
        public static final ActionsEnum QUERY_SUB_ORG = new ActionsEnum("QUERY_SUB_ORG");
        
        /**
         * Enum ADD_USER_TO_ORG for value: "ADD_USER_TO_ORG"
         */
        public static final ActionsEnum ADD_USER_TO_ORG = new ActionsEnum("ADD_USER_TO_ORG");
        
        /**
         * Enum SET_USER_ROLES for value: "SET_USER_ROLES"
         */
        public static final ActionsEnum SET_USER_ROLES = new ActionsEnum("SET_USER_ROLES");
        
        /**
         * Enum DELETE_USER_IN_ORG for value: "DELETE_USER_IN_ORG"
         */
        public static final ActionsEnum DELETE_USER_IN_ORG = new ActionsEnum("DELETE_USER_IN_ORG");
        
        /**
         * Enum QUERY_USER_IN_ORG for value: "QUERY_USER_IN_ORG"
         */
        public static final ActionsEnum QUERY_USER_IN_ORG = new ActionsEnum("QUERY_USER_IN_ORG");
        

        private static final Map<String, ActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionsEnum> createStaticFields() {
            Map<String, ActionsEnum> map = new HashMap<>();
            map.put("CREATE_INSTANCE", CREATE_INSTANCE);
            map.put("DELETE_INSTANCE", DELETE_INSTANCE);
            map.put("UPDATE_INSTANCE", UPDATE_INSTANCE);
            map.put("QUERY_INSTANCE", QUERY_INSTANCE);
            map.put("RUN_INSTANCE", RUN_INSTANCE);
            map.put("CREATE_SUB_ORG", CREATE_SUB_ORG);
            map.put("UPDATE_SUB_ORG", UPDATE_SUB_ORG);
            map.put("DELETE_SUB_ORG", DELETE_SUB_ORG);
            map.put("QUERY_SUB_ORG", QUERY_SUB_ORG);
            map.put("ADD_USER_TO_ORG", ADD_USER_TO_ORG);
            map.put("SET_USER_ROLES", SET_USER_ROLES);
            map.put("DELETE_USER_IN_ORG", DELETE_USER_IN_ORG);
            map.put("QUERY_USER_IN_ORG", QUERY_USER_IN_ORG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionsEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionsEnum(value);
            }
            return result;
        }

        public static ActionsEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionsEnum) {
                return this.value.equals(((ActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actions")
    
    private ActionsEnum actions;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private String roleId;

    public RoleAction withActionCname(String actionCname) {
        this.actionCname = actionCname;
        return this;
    }

    


    /**
     * 动作名
     * @return actionCname
     */
    public String getActionCname() {
        return actionCname;
    }

    public void setActionCname(String actionCname) {
        this.actionCname = actionCname;
    }

    

    public RoleAction withActions(ActionsEnum actions) {
        this.actions = actions;
        return this;
    }

    


    /**
     * 执行动作
     * @return actions
     */
    public ActionsEnum getActions() {
        return actions;
    }

    public void setActions(ActionsEnum actions) {
        this.actions = actions;
    }

    

    public RoleAction withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RoleAction withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * 角色id
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleAction roleAction = (RoleAction) o;
        return Objects.equals(this.actionCname, roleAction.actionCname) &&
            Objects.equals(this.actions, roleAction.actions) &&
            Objects.equals(this.id, roleAction.id) &&
            Objects.equals(this.roleId, roleAction.roleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionCname, actions, id, roleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleAction {\n");
        sb.append("    actionCname: ").append(toIndentedString(actionCname)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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


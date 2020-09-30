package com.huaweicloud.sdk.codehub.v3.model;




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
 * SetRepoRoleRequestBody
 */
public class SetRepoRoleRequestBody  {

    /**
     * 设置仓库的成员权限，取值范围：20 -> 只读成员 30->普通成员，40->管理员
     */
    public static final class RoleEnum {

        
        /**
         * Enum _20 for value: "20"
         */
        public static final RoleEnum _20 = new RoleEnum("20");
        
        /**
         * Enum _30 for value: "30"
         */
        public static final RoleEnum _30 = new RoleEnum("30");
        
        /**
         * Enum _40 for value: "40"
         */
        public static final RoleEnum _40 = new RoleEnum("40");
        

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("20", _20);
            map.put("30", _30);
            map.put("40", _40);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RoleEnum(value);
            }
            return result;
        }

        public static RoleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RoleEnum) {
                return this.value.equals(((RoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private RoleEnum role;

    public SetRepoRoleRequestBody withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    


    /**
     * 设置仓库的成员权限，取值范围：20 -> 只读成员 30->普通成员，40->管理员
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetRepoRoleRequestBody setRepoRoleRequestBody = (SetRepoRoleRequestBody) o;
        return Objects.equals(this.role, setRepoRoleRequestBody.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRepoRoleRequestBody {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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


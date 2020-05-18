package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.IdentityAssumerole;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class AgencyAuthIdentity  {

    /**
     * Gets or Sets methods
     */
    public static class MethodsEnum {

        
        /**
         * Enum ASSUME_ROLE for value: "assume_role"
         */
        public static final MethodsEnum ASSUME_ROLE = new MethodsEnum("assume_role");

        

        public static Map<String, MethodsEnum> staticFields =
                new HashMap<String, MethodsEnum>() {
                    { 
                        put("assume_role", ASSUME_ROLE);
                    }
                };

        private String value;

        MethodsEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MethodsEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            MethodsEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MethodsEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MethodsEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MethodsEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MethodsEnum) {
                return this.value.equals(((MethodsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="methods")
    
    private List<MethodsEnum> methods = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assume_role")
    
    private IdentityAssumerole assumeRole = null;

    public AgencyAuthIdentity withMethods(List<MethodsEnum> methods) {
        this.methods = methods;
        return this;
    }

    
    public AgencyAuthIdentity addMethodsItem(MethodsEnum methodsItem) {
        this.methods.add(methodsItem);
        return this;
    }

    public AgencyAuthIdentity withMethods(Consumer<List<MethodsEnum>> methodsSetter) {
        if(this.methods == null ){
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 认证方法，该字段内容为[\"assume_role\"]。
     * @return methods
     */
    public List<MethodsEnum> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodsEnum> methods) {
        this.methods = methods;
    }

    public AgencyAuthIdentity withAssumeRole(IdentityAssumerole assumeRole) {
        this.assumeRole = assumeRole;
        return this;
    }

    public AgencyAuthIdentity withAssumeRole(Consumer<IdentityAssumerole> assumeRoleSetter) {
        if(this.assumeRole == null ){
            this.assumeRole = new IdentityAssumerole();
        }
        assumeRoleSetter.accept(this.assumeRole);
        return this;
    }


    /**
     * Get assumeRole
     * @return assumeRole
     */
    public IdentityAssumerole getAssumeRole() {
        return assumeRole;
    }

    public void setAssumeRole(IdentityAssumerole assumeRole) {
        this.assumeRole = assumeRole;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyAuthIdentity agencyAuthIdentity = (AgencyAuthIdentity) o;
        return Objects.equals(this.methods, agencyAuthIdentity.methods) &&
            Objects.equals(this.assumeRole, agencyAuthIdentity.assumeRole);
    }
    @Override
    public int hashCode() {
        return Objects.hash(methods, assumeRole);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyAuthIdentity {\n");
            sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
            sb.append("    assumeRole: ").append(toIndentedString(assumeRole)).append("\n");
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


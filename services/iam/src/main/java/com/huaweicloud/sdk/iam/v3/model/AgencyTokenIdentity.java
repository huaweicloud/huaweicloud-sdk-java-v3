package com.huaweicloud.sdk.iam.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyTokenAssumerole;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AgencyTokenIdentity  {

    /**
     * Gets or Sets methods
     */
    public static final class MethodsEnum {

        
        /**
         * Enum ASSUME_ROLE for value: "assume_role"
         */
        public static final MethodsEnum ASSUME_ROLE = new MethodsEnum("assume_role");
        

        private static final Map<String, MethodsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodsEnum> createStaticFields() {
            Map<String, MethodsEnum> map = new HashMap<>();
            map.put("assume_role", ASSUME_ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodsEnum(String value) {
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
        public static MethodsEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MethodsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MethodsEnum(value);
            }
            return result;
        }

        public static MethodsEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MethodsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodsEnum) {
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
    
    private List<MethodsEnum> methods = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assume_role")
    
    private AgencyTokenAssumerole assumeRole;

    public AgencyTokenIdentity withMethods(List<MethodsEnum> methods) {
        this.methods = methods;
        return this;
    }

    
    public AgencyTokenIdentity addMethodsItem(MethodsEnum methodsItem) {
        if(this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public AgencyTokenIdentity withMethods(Consumer<List<MethodsEnum>> methodsSetter) {
        if(this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * token的获取方式，该字段内容为[\"assume_role\"]。
     * @return methods
     */
    public List<MethodsEnum> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodsEnum> methods) {
        this.methods = methods;
    }

    

    public AgencyTokenIdentity withAssumeRole(AgencyTokenAssumerole assumeRole) {
        this.assumeRole = assumeRole;
        return this;
    }

    public AgencyTokenIdentity withAssumeRole(Consumer<AgencyTokenAssumerole> assumeRoleSetter) {
        if(this.assumeRole == null ){
            this.assumeRole = new AgencyTokenAssumerole();
            assumeRoleSetter.accept(this.assumeRole);
        }
        
        return this;
    }


    /**
     * Get assumeRole
     * @return assumeRole
     */
    public AgencyTokenAssumerole getAssumeRole() {
        return assumeRole;
    }

    public void setAssumeRole(AgencyTokenAssumerole assumeRole) {
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
        AgencyTokenIdentity agencyTokenIdentity = (AgencyTokenIdentity) o;
        return Objects.equals(this.methods, agencyTokenIdentity.methods) &&
            Objects.equals(this.assumeRole, agencyTokenIdentity.assumeRole);
    }
    @Override
    public int hashCode() {
        return Objects.hash(methods, assumeRole);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenIdentity {\n");
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


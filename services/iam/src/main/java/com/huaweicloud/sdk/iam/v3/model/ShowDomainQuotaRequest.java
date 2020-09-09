package com.huaweicloud.sdk.iam.v3.model;




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
 * Request Object
 */
public class ShowDomainQuotaRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;
    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        
        /**
         * Enum USER for value: "user"
         */
        public static final TypeEnum USER = new TypeEnum("user");
        
        /**
         * Enum GROUP for value: "group"
         */
        public static final TypeEnum GROUP = new TypeEnum("group");
        
        /**
         * Enum IDP for value: "idp"
         */
        public static final TypeEnum IDP = new TypeEnum("idp");
        
        /**
         * Enum AGENCY for value: "agency"
         */
        public static final TypeEnum AGENCY = new TypeEnum("agency");
        
        /**
         * Enum POLICY for value: "policy"
         */
        public static final TypeEnum POLICY = new TypeEnum("policy");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("group", GROUP);
            map.put("idp", IDP);
            map.put("agency", AGENCY);
            map.put("policy", POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;

    public ShowDomainQuotaRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainQuotaRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainQuotaRequest showDomainQuotaRequest = (ShowDomainQuotaRequest) o;
        return Objects.equals(this.domainId, showDomainQuotaRequest.domainId) &&
            Objects.equals(this.type, showDomainQuotaRequest.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainQuotaRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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


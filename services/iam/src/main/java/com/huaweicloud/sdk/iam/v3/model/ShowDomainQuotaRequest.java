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
     * 查询配额的类型，取值范围为：user, group, idp, agency, policy, assigment_group_mp, assigment_agency_mp, assigment_group_ep, assigment_user_ep。
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
        
        /**
         * Enum ASSIGMENT_GROUP_MP for value: "assigment_group_mp"
         */
        public static final TypeEnum ASSIGMENT_GROUP_MP = new TypeEnum("assigment_group_mp");
        
        /**
         * Enum ASSIGMENT_AGENCY_MP for value: "assigment_agency_mp"
         */
        public static final TypeEnum ASSIGMENT_AGENCY_MP = new TypeEnum("assigment_agency_mp");
        
        /**
         * Enum ASSIGMENT_GROUP_EP for value: "assigment_group_ep"
         */
        public static final TypeEnum ASSIGMENT_GROUP_EP = new TypeEnum("assigment_group_ep");
        
        /**
         * Enum ASSIGMENT_USER_EP for value: "assigment_user_ep"
         */
        public static final TypeEnum ASSIGMENT_USER_EP = new TypeEnum("assigment_user_ep");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("group", GROUP);
            map.put("idp", IDP);
            map.put("agency", AGENCY);
            map.put("policy", POLICY);
            map.put("assigment_group_mp", ASSIGMENT_GROUP_MP);
            map.put("assigment_agency_mp", ASSIGMENT_AGENCY_MP);
            map.put("assigment_group_ep", ASSIGMENT_GROUP_EP);
            map.put("assigment_user_ep", ASSIGMENT_USER_EP);
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
    @JsonProperty(value="type")
    
    private TypeEnum type;

    public ShowDomainQuotaRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 待查询的账号ID，获取方式请参见：[获取账号、IAM用户、项目、用户组、委托的名称和ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
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
     * 查询配额的类型，取值范围为：user, group, idp, agency, policy, assigment_group_mp, assigment_agency_mp, assigment_group_ep, assigment_user_ep。
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


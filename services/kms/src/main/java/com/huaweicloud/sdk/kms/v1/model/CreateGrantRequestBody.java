package com.huaweicloud.sdk.kms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateGrantRequestBody
 */
public class CreateGrantRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="grantee_principal")
    
    private String granteePrincipal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operations")
    
    private List<String> operations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retiring_principal")
    
    private String retiringPrincipal;
    /**
     * 授权类型。有效值：“user”，“domain”。默认值为“user”。
     */
    public static final class GranteePrincipalTypeEnum {

        
        /**
         * Enum USER for value: "user"
         */
        public static final GranteePrincipalTypeEnum USER = new GranteePrincipalTypeEnum("user");
        
        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final GranteePrincipalTypeEnum DOMAIN = new GranteePrincipalTypeEnum("domain");
        

        private static final Map<String, GranteePrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GranteePrincipalTypeEnum> createStaticFields() {
            Map<String, GranteePrincipalTypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("domain", DOMAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GranteePrincipalTypeEnum(String value) {
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
        public static GranteePrincipalTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            GranteePrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new GranteePrincipalTypeEnum(value);
            }
            return result;
        }

        public static GranteePrincipalTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            GranteePrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof GranteePrincipalTypeEnum) {
                return this.value.equals(((GranteePrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="grantee_principal_type")
    
    private GranteePrincipalTypeEnum granteePrincipalType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public CreateGrantRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID，36字节，满足正则匹配“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”。 例如：0d0466b0-e727-4d9c-b35d-f84bb474a37f。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateGrantRequestBody withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    


    /**
     * 被授权用户ID，1~64字节，满足正则匹配“^[a-zA-Z0-9]{1，64}$”。 例如：0d0466b00d0466b00d0466b00d0466b0
     * @return granteePrincipal
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    public CreateGrantRequestBody withOperations(List<String> operations) {
        this.operations = operations;
        return this;
    }

    
    public CreateGrantRequestBody addOperationsItem(String operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public CreateGrantRequestBody withOperations(Consumer<List<String>> operationsSetter) {
        if(this.operations == null ){
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 授权允许的操作列表。 有效的值：“create-datakey”，“create-datakey-without-plaintext”，“encrypt-datakey”，“decrypt-datakey”，“describe-key”，“create-grant”，“retire-grant”，“encrypt-data”，“decrypt-data”。 有效值不能仅为“create-grant”。
     * @return operations
     */
    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public CreateGrantRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 授权名称，取值1到255字符，满足正则匹配“^[a-zA-Z0-9:/_-]{1,255}$”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateGrantRequestBody withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    


    /**
     * 可退役授权的用户ID，1~64字节，满足正则匹配“^[a-zA-Z0-9]{1，64}$”。 例如：0d0466b00d0466b00d0466b00d0466b0
     * @return retiringPrincipal
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    public CreateGrantRequestBody withGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
        return this;
    }

    


    /**
     * 授权类型。有效值：“user”，“domain”。默认值为“user”。
     * @return granteePrincipalType
     */
    public GranteePrincipalTypeEnum getGranteePrincipalType() {
        return granteePrincipalType;
    }

    public void setGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
    }

    public CreateGrantRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    


    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGrantRequestBody createGrantRequestBody = (CreateGrantRequestBody) o;
        return Objects.equals(this.keyId, createGrantRequestBody.keyId) &&
            Objects.equals(this.granteePrincipal, createGrantRequestBody.granteePrincipal) &&
            Objects.equals(this.operations, createGrantRequestBody.operations) &&
            Objects.equals(this.name, createGrantRequestBody.name) &&
            Objects.equals(this.retiringPrincipal, createGrantRequestBody.retiringPrincipal) &&
            Objects.equals(this.granteePrincipalType, createGrantRequestBody.granteePrincipalType) &&
            Objects.equals(this.sequence, createGrantRequestBody.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, granteePrincipal, operations, name, retiringPrincipal, granteePrincipalType, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGrantRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    granteePrincipal: ").append(toIndentedString(granteePrincipal)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retiringPrincipal: ").append(toIndentedString(retiringPrincipal)).append("\n");
        sb.append("    granteePrincipalType: ").append(toIndentedString(granteePrincipalType)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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


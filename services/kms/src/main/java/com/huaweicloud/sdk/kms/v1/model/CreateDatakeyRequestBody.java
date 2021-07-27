package com.huaweicloud.sdk.kms.v1.model;




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
 * CreateDatakeyRequestBody
 */
public class CreateDatakeyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption_context")
    
    private Object encryptionContext;
    /**
     * 指定生成的密钥bit位长度。有效值：AES_256、AES_128。  - AES_256：表示256比特的对称密钥。  - AES_128：表示128比特的对称密钥。 说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     */
    public static final class KeySpecEnum {

        
        /**
         * Enum AES_256 for value: "AES_256"
         */
        public static final KeySpecEnum AES_256 = new KeySpecEnum("AES_256");
        
        /**
         * Enum AES_128 for value: "AES_128"
         */
        public static final KeySpecEnum AES_128 = new KeySpecEnum("AES_128");
        

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("AES_128", AES_128);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeySpecEnum(String value) {
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
        public static KeySpecEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            KeySpecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeySpecEnum(value);
            }
            return result;
        }

        public static KeySpecEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            KeySpecEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeySpecEnum) {
                return this.value.equals(((KeySpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_spec")
    
    private KeySpecEnum keySpec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datakey_length")
    
    private String datakeyLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public CreateDatakeyRequestBody withKeyId(String keyId) {
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

    

    public CreateDatakeyRequestBody withEncryptionContext(Object encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }

    


    /**
     * 一系列key-value键值对，用于记录资源上下文信息，用于保护数据的完整性，不应包含敏感信息，最大长度为8192。 当在加密时指定了该参数时，解密密文时，需要传入相同的参数，才能正确的解密。 例如：{\"Key1\":\"Value1\",\"Key2\":\"Value2\"}
     * @return encryptionContext
     */
    public Object getEncryptionContext() {
        return encryptionContext;
    }

    public void setEncryptionContext(Object encryptionContext) {
        this.encryptionContext = encryptionContext;
    }

    

    public CreateDatakeyRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    


    /**
     * 指定生成的密钥bit位长度。有效值：AES_256、AES_128。  - AES_256：表示256比特的对称密钥。  - AES_128：表示128比特的对称密钥。 说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     * @return keySpec
     */
    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    

    public CreateDatakeyRequestBody withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    


    /**
     * 密钥bit位长度。取值为8的倍数，取值范围为8~8192。 说明：  datakey_length和key_spec二选一。   - 若datakey_length和key_spec都为空，默认生成256bit的密钥。   - 若datakey_length和key_spec都指定了值，仅datakey_length生效。
     * @return datakeyLength
     */
    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    

    public CreateDatakeyRequestBody withSequence(String sequence) {
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
        CreateDatakeyRequestBody createDatakeyRequestBody = (CreateDatakeyRequestBody) o;
        return Objects.equals(this.keyId, createDatakeyRequestBody.keyId) &&
            Objects.equals(this.encryptionContext, createDatakeyRequestBody.encryptionContext) &&
            Objects.equals(this.keySpec, createDatakeyRequestBody.keySpec) &&
            Objects.equals(this.datakeyLength, createDatakeyRequestBody.datakeyLength) &&
            Objects.equals(this.sequence, createDatakeyRequestBody.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, encryptionContext, keySpec, datakeyLength, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
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


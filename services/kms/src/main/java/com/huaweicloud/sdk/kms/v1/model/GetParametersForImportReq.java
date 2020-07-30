package com.huaweicloud.sdk.kms.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GetParametersForImportReq
 */
public class GetParametersForImportReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;
    /**
     * 密钥材料加密算法，枚举如下：  - RSAES_PKCS1_V1_5  - RSAES_OAEP_SHA_1  - RSAES_OAEP_SHA_256
     */
    public static class WrappingAlgorithmEnum {

        
        /**
         * Enum RSAES_PKCS1_V1_5 for value: "RSAES_PKCS1_V1_5"
         */
        public static final WrappingAlgorithmEnum RSAES_PKCS1_V1_5 = new WrappingAlgorithmEnum("RSAES_PKCS1_V1_5");
        
        /**
         * Enum RSAES_OAEP_SHA_1 for value: "RSAES_OAEP_SHA_1"
         */
        public static final WrappingAlgorithmEnum RSAES_OAEP_SHA_1 = new WrappingAlgorithmEnum("RSAES_OAEP_SHA_1");
        
        /**
         * Enum RSAES_OAEP_SHA_256 for value: "RSAES_OAEP_SHA_256"
         */
        public static final WrappingAlgorithmEnum RSAES_OAEP_SHA_256 = new WrappingAlgorithmEnum("RSAES_OAEP_SHA_256");
        

        public static final Map<String, WrappingAlgorithmEnum> staticFields = new HashMap<String, WrappingAlgorithmEnum>() {
            { 
                put("RSAES_PKCS1_V1_5", RSAES_PKCS1_V1_5);
                put("RSAES_OAEP_SHA_1", RSAES_OAEP_SHA_1);
                put("RSAES_OAEP_SHA_256", RSAES_OAEP_SHA_256);
            }
        };

        private String value;

        WrappingAlgorithmEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static WrappingAlgorithmEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            WrappingAlgorithmEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new WrappingAlgorithmEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static WrappingAlgorithmEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            WrappingAlgorithmEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof WrappingAlgorithmEnum) {
                return this.value.equals(((WrappingAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="wrapping_algorithm")
    
    private WrappingAlgorithmEnum wrappingAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public GetParametersForImportReq withKeyId(String keyId) {
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

    public GetParametersForImportReq withWrappingAlgorithm(WrappingAlgorithmEnum wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }

    


    /**
     * 密钥材料加密算法，枚举如下：  - RSAES_PKCS1_V1_5  - RSAES_OAEP_SHA_1  - RSAES_OAEP_SHA_256
     * @return wrappingAlgorithm
     */
    public WrappingAlgorithmEnum getWrappingAlgorithm() {
        return wrappingAlgorithm;
    }

    public void setWrappingAlgorithm(WrappingAlgorithmEnum wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    public GetParametersForImportReq withSequence(String sequence) {
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
        GetParametersForImportReq getParametersForImportReq = (GetParametersForImportReq) o;
        return Objects.equals(this.keyId, getParametersForImportReq.keyId) &&
            Objects.equals(this.wrappingAlgorithm, getParametersForImportReq.wrappingAlgorithm) &&
            Objects.equals(this.sequence, getParametersForImportReq.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, wrappingAlgorithm, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetParametersForImportReq {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    wrappingAlgorithm: ").append(toIndentedString(wrappingAlgorithm)).append("\n");
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


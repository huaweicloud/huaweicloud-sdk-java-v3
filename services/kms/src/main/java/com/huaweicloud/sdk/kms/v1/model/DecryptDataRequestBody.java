package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DecryptDataRequestBody
 */
public class DecryptDataRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cipher_text")
    
    private String cipherText;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption_context")
    
    private Object encryptionContext;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public DecryptDataRequestBody withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    


    /**
     * 被加密数据密文。取值为加密数据结果中的cipher_text的值，满足正则匹配“^[0-9a-zA-Z+/=]{188,5648}$”。
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    

    public DecryptDataRequestBody withEncryptionContext(Object encryptionContext) {
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

    

    public DecryptDataRequestBody withSequence(String sequence) {
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
        DecryptDataRequestBody decryptDataRequestBody = (DecryptDataRequestBody) o;
        return Objects.equals(this.cipherText, decryptDataRequestBody.cipherText) &&
            Objects.equals(this.encryptionContext, decryptDataRequestBody.encryptionContext) &&
            Objects.equals(this.sequence, decryptDataRequestBody.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cipherText, encryptionContext, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDataRequestBody {\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
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


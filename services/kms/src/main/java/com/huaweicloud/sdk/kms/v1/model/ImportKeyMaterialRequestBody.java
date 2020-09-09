package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImportKeyMaterialRequestBody
 */
public class ImportKeyMaterialRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="import_token")
    
    private String importToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted_key_material")
    
    private String encryptedKeyMaterial;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expiration_time")
    
    private Long expirationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public ImportKeyMaterialRequestBody withKeyId(String keyId) {
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

    public ImportKeyMaterialRequestBody withImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }

    


    /**
     * 密钥导入令牌，base64格式，满足正则匹配“^[0-9a-zA-Z+/=]{200,6144}$”。
     * @return importToken
     */
    public String getImportToken() {
        return importToken;
    }

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    public ImportKeyMaterialRequestBody withEncryptedKeyMaterial(String encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
        return this;
    }

    


    /**
     * 加密后的密钥材料，base64格式，满足正则匹配“^[0-9a-zA-Z+/=]{344,360}$”。
     * @return encryptedKeyMaterial
     */
    public String getEncryptedKeyMaterial() {
        return encryptedKeyMaterial;
    }

    public void setEncryptedKeyMaterial(String encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
    }

    public ImportKeyMaterialRequestBody withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    


    /**
     * 密钥材料到期时间，时间戳，即从1970年1月1日至该时间的总秒数，KMS会在该时间的24小时内删除密钥材料。 例如：1550291833
     * minimum: 0
     * maximum: 10000000000
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public ImportKeyMaterialRequestBody withSequence(String sequence) {
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
        ImportKeyMaterialRequestBody importKeyMaterialRequestBody = (ImportKeyMaterialRequestBody) o;
        return Objects.equals(this.keyId, importKeyMaterialRequestBody.keyId) &&
            Objects.equals(this.importToken, importKeyMaterialRequestBody.importToken) &&
            Objects.equals(this.encryptedKeyMaterial, importKeyMaterialRequestBody.encryptedKeyMaterial) &&
            Objects.equals(this.expirationTime, importKeyMaterialRequestBody.expirationTime) &&
            Objects.equals(this.sequence, importKeyMaterialRequestBody.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, importToken, encryptedKeyMaterial, expirationTime, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportKeyMaterialRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    importToken: ").append(toIndentedString(importToken)).append("\n");
        sb.append("    encryptedKeyMaterial: ").append(toIndentedString(encryptedKeyMaterial)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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


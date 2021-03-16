package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateParametersForImportResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="import_token")
    
    private String importToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expiration_time")
    
    private String expirationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_key")
    
    private String publicKey;

    public CreateParametersForImportResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    

    public CreateParametersForImportResponse withImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }

    


    /**
     * 密钥导入令牌。
     * @return importToken
     */
    public String getImportToken() {
        return importToken;
    }

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    

    public CreateParametersForImportResponse withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    


    /**
     * 导入参数到期时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * @return expirationTime
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    

    public CreateParametersForImportResponse withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    


    /**
     * 加密密钥材料的公钥，base64格式。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateParametersForImportResponse createParametersForImportResponse = (CreateParametersForImportResponse) o;
        return Objects.equals(this.keyId, createParametersForImportResponse.keyId) &&
            Objects.equals(this.importToken, createParametersForImportResponse.importToken) &&
            Objects.equals(this.expirationTime, createParametersForImportResponse.expirationTime) &&
            Objects.equals(this.publicKey, createParametersForImportResponse.publicKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, importToken, expirationTime, publicKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateParametersForImportResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    importToken: ").append(toIndentedString(importToken)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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


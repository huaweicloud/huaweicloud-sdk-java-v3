package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.KeyStatusInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class EnableKeyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_info")
    
    private KeyStatusInfo keyInfo;

    public EnableKeyResponse withKeyInfo(KeyStatusInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public EnableKeyResponse withKeyInfo(Consumer<KeyStatusInfo> keyInfoSetter) {
        if(this.keyInfo == null ){
            this.keyInfo = new KeyStatusInfo();
            keyInfoSetter.accept(this.keyInfo);
        }
        
        return this;
    }


    /**
     * Get keyInfo
     * @return keyInfo
     */
    public KeyStatusInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyStatusInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnableKeyResponse enableKeyResponse = (EnableKeyResponse) o;
        return Objects.equals(this.keyInfo, enableKeyResponse.keyInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableKeyResponse {\n");
        sb.append("    keyInfo: ").append(toIndentedString(keyInfo)).append("\n");
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


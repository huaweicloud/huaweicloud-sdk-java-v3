package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateApplicationRequestBody
 */
public class UpdateApplicationRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform_principal")
    
    private String platformPrincipal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform_credential")
    
    private String platformCredential;

    public UpdateApplicationRequestBody withPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
        return this;
    }

    


    /**
     * 对于HMS平台是APP ID，只能包含英文字母和数字，最大20个字符。  对于苹果APNS、APNS_SandBox平台是推送证书，大小不超过8K，且是Base64编码。
     * @return platformPrincipal
     */
    public String getPlatformPrincipal() {
        return platformPrincipal;
    }

    public void setPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
    }

    

    public UpdateApplicationRequestBody withPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
        return this;
    }

    


    /**
     * 对于HMS平台是APP SECRET， 只能包含英文字母和数字，32到64个字符。  对于苹果APNS、APNS_SandBox平台是推送证书的私钥（private key）， 大小不超过8K，且是Base64编码。
     * @return platformCredential
     */
    public String getPlatformCredential() {
        return platformCredential;
    }

    public void setPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateApplicationRequestBody updateApplicationRequestBody = (UpdateApplicationRequestBody) o;
        return Objects.equals(this.platformPrincipal, updateApplicationRequestBody.platformPrincipal) &&
            Objects.equals(this.platformCredential, updateApplicationRequestBody.platformCredential);
    }
    @Override
    public int hashCode() {
        return Objects.hash(platformPrincipal, platformCredential);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationRequestBody {\n");
        sb.append("    platformPrincipal: ").append(toIndentedString(platformPrincipal)).append("\n");
        sb.append("    platformCredential: ").append(toIndentedString(platformCredential)).append("\n");
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


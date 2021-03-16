package com.huaweicloud.sdk.iotda.v5.model;




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
public class CreateAccessCodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_key")
    
    private String accessKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_code")
    
    private String accessCode;

    public CreateAccessCodeResponse withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    


    /**
     * 接入名，随机生成8位字符串
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    

    public CreateAccessCodeResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    


    /**
     * 接入凭证。
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAccessCodeResponse createAccessCodeResponse = (CreateAccessCodeResponse) o;
        return Objects.equals(this.accessKey, createAccessCodeResponse.accessKey) &&
            Objects.equals(this.accessCode, createAccessCodeResponse.accessCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessKey, accessCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessCodeResponse {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
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


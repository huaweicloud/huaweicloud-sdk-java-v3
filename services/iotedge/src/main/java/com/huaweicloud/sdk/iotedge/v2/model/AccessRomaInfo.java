package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccessRomaInfo
 */
public class AccessRomaInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    @JacksonXmlProperty(localName = "app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_secret")
    
    @JacksonXmlProperty(localName = "app_secret")
    
    private String appSecret;

    public AccessRomaInfo withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * 认证key，加密存储
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    

    public AccessRomaInfo withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    


    /**
     * 认证secret，加密存储
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessRomaInfo accessRomaInfo = (AccessRomaInfo) o;
        return Objects.equals(this.appKey, accessRomaInfo.appKey) &&
            Objects.equals(this.appSecret, accessRomaInfo.appSecret);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appKey, appSecret);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessRomaInfo {\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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


package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccessRomaBriefInfo
 */
public class AccessRomaBriefInfo  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    

    private String appKey;

    public AccessRomaBriefInfo withAppKey(String appKey) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessRomaBriefInfo accessRomaBriefInfo = (AccessRomaBriefInfo) o;
        return Objects.equals(this.appKey, accessRomaBriefInfo.appKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessRomaBriefInfo {\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
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


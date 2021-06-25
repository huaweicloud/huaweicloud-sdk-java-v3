package com.huaweicloud.sdk.vod.v1.model;




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
public class ShowAssetTempAuthorityResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_str")
    
    private String signStr;

    public ShowAssetTempAuthorityResponse withSignStr(String signStr) {
        this.signStr = signStr;
        return this;
    }

    


    /**
     * 带授权签名字符串的URL。样例： ``` https://{obs_domain}/{bucket}?AWSAccessKeyId={AccessKeyID}&Expires={ExpiresValue}&Signature={Signature} 
     * @return signStr
     */
    public String getSignStr() {
        return signStr;
    }

    public void setSignStr(String signStr) {
        this.signStr = signStr;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetTempAuthorityResponse showAssetTempAuthorityResponse = (ShowAssetTempAuthorityResponse) o;
        return Objects.equals(this.signStr, showAssetTempAuthorityResponse.signStr);
    }
    @Override
    public int hashCode() {
        return Objects.hash(signStr);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetTempAuthorityResponse {\n");
        sb.append("    signStr: ").append(toIndentedString(signStr)).append("\n");
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


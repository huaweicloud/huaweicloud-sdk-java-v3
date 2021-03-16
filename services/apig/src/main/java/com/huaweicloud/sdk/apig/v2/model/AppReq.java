package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppReq
 */
public class AppReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_secret")
    
    private String appSecret;

    public AppReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * APP的名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64个字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public AppReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * APP描述。字符长度不能大于255。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public AppReq withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * APP的key。支持英文，数字，“_”,“-”,且只能以英文或数字开头，8 ~ 64个字符。 > 只支持部分region。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    

    public AppReq withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    


    /**
     * 密钥。支持英文，数字，“_”,“-”,“_”,“!”,“@”,“#”,“$”,“%”且只能以英文或数字开头，8 ~ 64个字符。 > 只支持部分region。
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
        AppReq appReq = (AppReq) o;
        return Objects.equals(this.name, appReq.name) &&
            Objects.equals(this.remark, appReq.remark) &&
            Objects.equals(this.appKey, appReq.appKey) &&
            Objects.equals(this.appSecret, appReq.appSecret);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, remark, appKey, appSecret);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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


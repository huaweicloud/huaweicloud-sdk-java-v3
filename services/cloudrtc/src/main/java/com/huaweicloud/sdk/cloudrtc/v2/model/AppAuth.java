package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 鉴权配置
 */
public class AppAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    @JacksonXmlProperty(localName = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    @JacksonXmlProperty(localName = "expire")

    private Integer expire;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    @JacksonXmlProperty(localName = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private String updateTime;

    public AppAuth withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启或关闭URL鉴权
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public AppAuth withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 接入RTC建链认证时的signature的有效期。单位：秒。默认300秒。signature由app_key生成 
     * minimum: 60
     * maximum: 2592000
     * @return expire
     */
    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public AppAuth withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * app鉴权秘钥
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public AppAuth withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * app鉴权的更新时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAuth appAuth = (AppAuth) o;
        return Objects.equals(this.enable, appAuth.enable) && Objects.equals(this.expire, appAuth.expire)
            && Objects.equals(this.appKey, appAuth.appKey) && Objects.equals(this.updateTime, appAuth.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, expire, appKey, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuth {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

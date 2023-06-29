package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改app鉴权请求
 */
public class AppAuthReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    private Integer expire;

    public AppAuthReq withEnable(Boolean enable) {
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

    public AppAuthReq withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 有效期，当开启鉴权时必填。  取值范围：[60，2592000]，缺省为300。  单位：秒。 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppAuthReq that = (AppAuthReq) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.expire, that.expire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, expire);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuthReq {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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

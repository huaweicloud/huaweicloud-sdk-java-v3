package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdatePrivateZoneInfoReq */
public class UpdatePrivateZoneInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    public UpdatePrivateZoneInfoReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 域名的描述信息。长度不超过255个字符。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePrivateZoneInfoReq withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 管理该zone的管理员邮箱。
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UpdatePrivateZoneInfoReq withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /** 用于填写默认生成的SOA记录中有效缓存时间，以秒为单位。
     * 
     * @return ttl */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrivateZoneInfoReq updatePrivateZoneInfoReq = (UpdatePrivateZoneInfoReq) o;
        return Objects.equals(this.description, updatePrivateZoneInfoReq.description)
            && Objects.equals(this.email, updatePrivateZoneInfoReq.email)
            && Objects.equals(this.ttl, updatePrivateZoneInfoReq.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, email, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateZoneInfoReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

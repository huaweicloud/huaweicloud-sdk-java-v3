package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckNeedVerifyCodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="need_verify_code")
    
    private Integer needVerifyCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private OffsetDateTime expireTime = null;

    public CheckNeedVerifyCodeResponse withNeedVerifyCode(Integer needVerifyCode) {
        this.needVerifyCode = needVerifyCode;
        return this;
    }

    


    /**
     * 是否需要验证
     * minimum: 0
     * maximum: 1
     * @return needVerifyCode
     */
    public Integer getNeedVerifyCode() {
        return needVerifyCode;
    }

    public void setNeedVerifyCode(Integer needVerifyCode) {
        this.needVerifyCode = needVerifyCode;
    }

    public CheckNeedVerifyCodeResponse withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * 过期时间
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckNeedVerifyCodeResponse checkNeedVerifyCodeResponse = (CheckNeedVerifyCodeResponse) o;
        return Objects.equals(this.needVerifyCode, checkNeedVerifyCodeResponse.needVerifyCode) &&
            Objects.equals(this.expireTime, checkNeedVerifyCodeResponse.expireTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(needVerifyCode, expireTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNeedVerifyCodeResponse {\n");
        sb.append("    needVerifyCode: ").append(toIndentedString(needVerifyCode)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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


package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ClusterAuthTros
 */
public class ClusterAuthTros {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private BigDecimal authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private BigDecimal expireTime;

    public ClusterAuthTros withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 操作界面授权开启或关闭
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ClusterAuthTros withAuthType(BigDecimal authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 0为集群界面授权功能的普通授权
     * @return authType
     */
    public BigDecimal getAuthType() {
        return authType;
    }

    public void setAuthType(BigDecimal authType) {
        this.authType = authType;
    }

    public ClusterAuthTros withExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * enable为true时配置，即授权截止时间，如不传该值默认为7天授权时间
     * @return expireTime
     */
    public BigDecimal getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterAuthTros that = (ClusterAuthTros) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, authType, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterAuthTros {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

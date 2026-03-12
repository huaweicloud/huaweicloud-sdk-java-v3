package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ListClusterManagerAuthStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private BigDecimal authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized")

    private Boolean authorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    public ListClusterManagerAuthStateResponse withAuthType(BigDecimal authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 查询指定集群界面授权类型，0为界面普通授权，当前仅开放普通授权
     * @return authType
     */
    public BigDecimal getAuthType() {
        return authType;
    }

    public void setAuthType(BigDecimal authType) {
        this.authType = authType;
    }

    public ListClusterManagerAuthStateResponse withAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }

    /**
     * 查询集群是否已开启界面授权
     * @return authorized
     */
    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public ListClusterManagerAuthStateResponse withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 集群界面授权的过期时间
     * @return expirationTime
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterManagerAuthStateResponse that = (ListClusterManagerAuthStateResponse) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.authorized, that.authorized)
            && Objects.equals(this.expirationTime, that.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, authorized, expirationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterManagerAuthStateResponse {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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

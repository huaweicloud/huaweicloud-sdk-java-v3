package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TenantAgreeAuthDetailV2
 */
public class TenantAgreeAuthDetailV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account")
    
    private String account;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_detail_id")
    
    private Long authDetailId;

    public TenantAgreeAuthDetailV2 withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public TenantAgreeAuthDetailV2 withAccount(String account) {
        this.account = account;
        return this;
    }

    


    /**
     * 账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public TenantAgreeAuthDetailV2 withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TenantAgreeAuthDetailV2 withAuthDetailId(Long authDetailId) {
        this.authDetailId = authDetailId;
        return this;
    }

    


    /**
     * 授权详情id
     * minimum: -9223372036854775808
     * maximum: 9223372036854775807
     * @return authDetailId
     */
    public Long getAuthDetailId() {
        return authDetailId;
    }

    public void setAuthDetailId(Long authDetailId) {
        this.authDetailId = authDetailId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantAgreeAuthDetailV2 tenantAgreeAuthDetailV2 = (TenantAgreeAuthDetailV2) o;
        return Objects.equals(this.port, tenantAgreeAuthDetailV2.port) &&
            Objects.equals(this.account, tenantAgreeAuthDetailV2.account) &&
            Objects.equals(this.password, tenantAgreeAuthDetailV2.password) &&
            Objects.equals(this.authDetailId, tenantAgreeAuthDetailV2.authDetailId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(port, account, password, authDetailId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantAgreeAuthDetailV2 {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    authDetailId: ").append(toIndentedString(authDetailId)).append("\n");
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


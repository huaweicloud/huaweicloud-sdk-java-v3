package com.huaweicloud.sdk.apig.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AuthResultResp;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppAuthResp
 */
public class AppAuthResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_result")
    
    private AuthResultResp authResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_time")
    
    private OffsetDateTime authTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;
    /**
     * 授权者 - PROVIDER：API提供者授权 - CONSUMER：API消费者授权
     */
    public static final class AuthRoleEnum {

        
        /**
         * Enum PROVIDER for value: "PROVIDER"
         */
        public static final AuthRoleEnum PROVIDER = new AuthRoleEnum("PROVIDER");
        
        /**
         * Enum CONSUMER for value: "CONSUMER"
         */
        public static final AuthRoleEnum CONSUMER = new AuthRoleEnum("CONSUMER");
        

        private static final Map<String, AuthRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthRoleEnum> createStaticFields() {
            Map<String, AuthRoleEnum> map = new HashMap<>();
            map.put("PROVIDER", PROVIDER);
            map.put("CONSUMER", CONSUMER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthRoleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthRoleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AuthRoleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthRoleEnum(value);
            }
            return result;
        }

        public static AuthRoleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AuthRoleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AuthRoleEnum) {
                return this.value.equals(((AuthRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_role")
    
    private AuthRoleEnum authRole;
    /**
     * 授权通道类型 - NORMAL：普通通道 - GREEN：绿色通道  暂不支持，默认NORMAL
     */
    public static final class AuthTunnelEnum {

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final AuthTunnelEnum NORMAL = new AuthTunnelEnum("NORMAL");
        
        /**
         * Enum GREEN for value: "GREEN"
         */
        public static final AuthTunnelEnum GREEN = new AuthTunnelEnum("GREEN");
        

        private static final Map<String, AuthTunnelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTunnelEnum> createStaticFields() {
            Map<String, AuthTunnelEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("GREEN", GREEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTunnelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthTunnelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AuthTunnelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTunnelEnum(value);
            }
            return result;
        }

        public static AuthTunnelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AuthTunnelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AuthTunnelEnum) {
                return this.value.equals(((AuthTunnelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_tunnel")
    
    private AuthTunnelEnum authTunnel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_whitelist")
    
    private List<String> authWhitelist = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_blacklist")
    
    private List<String> authBlacklist = null;
    
    public AppAuthResp withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public AppAuthResp withAuthResult(AuthResultResp authResult) {
        this.authResult = authResult;
        return this;
    }

    public AppAuthResp withAuthResult(Consumer<AuthResultResp> authResultSetter) {
        if(this.authResult == null ){
            this.authResult = new AuthResultResp();
            authResultSetter.accept(this.authResult);
        }
        
        return this;
    }


    /**
     * Get authResult
     * @return authResult
     */
    public AuthResultResp getAuthResult() {
        return authResult;
    }

    public void setAuthResult(AuthResultResp authResult) {
        this.authResult = authResult;
    }

    

    public AppAuthResp withAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
        return this;
    }

    


    /**
     * 授权时间
     * @return authTime
     */
    public OffsetDateTime getAuthTime() {
        return authTime;
    }

    public void setAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
    }

    

    public AppAuthResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 授权关系编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AppAuthResp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * APP编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public AppAuthResp withAuthRole(AuthRoleEnum authRole) {
        this.authRole = authRole;
        return this;
    }

    


    /**
     * 授权者 - PROVIDER：API提供者授权 - CONSUMER：API消费者授权
     * @return authRole
     */
    public AuthRoleEnum getAuthRole() {
        return authRole;
    }

    public void setAuthRole(AuthRoleEnum authRole) {
        this.authRole = authRole;
    }

    

    public AppAuthResp withAuthTunnel(AuthTunnelEnum authTunnel) {
        this.authTunnel = authTunnel;
        return this;
    }

    


    /**
     * 授权通道类型 - NORMAL：普通通道 - GREEN：绿色通道  暂不支持，默认NORMAL
     * @return authTunnel
     */
    public AuthTunnelEnum getAuthTunnel() {
        return authTunnel;
    }

    public void setAuthTunnel(AuthTunnelEnum authTunnel) {
        this.authTunnel = authTunnel;
    }

    

    public AppAuthResp withAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
        return this;
    }

    
    public AppAuthResp addAuthWhitelistItem(String authWhitelistItem) {
        if(this.authWhitelist == null) {
            this.authWhitelist = new ArrayList<>();
        }
        this.authWhitelist.add(authWhitelistItem);
        return this;
    }

    public AppAuthResp withAuthWhitelist(Consumer<List<String>> authWhitelistSetter) {
        if(this.authWhitelist == null) {
            this.authWhitelist = new ArrayList<>();
        }
        authWhitelistSetter.accept(this.authWhitelist);
        return this;
    }

    /**
     * 绿色通道的白名单配置
     * @return authWhitelist
     */
    public List<String> getAuthWhitelist() {
        return authWhitelist;
    }

    public void setAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
    }

    

    public AppAuthResp withAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
        return this;
    }

    
    public AppAuthResp addAuthBlacklistItem(String authBlacklistItem) {
        if(this.authBlacklist == null) {
            this.authBlacklist = new ArrayList<>();
        }
        this.authBlacklist.add(authBlacklistItem);
        return this;
    }

    public AppAuthResp withAuthBlacklist(Consumer<List<String>> authBlacklistSetter) {
        if(this.authBlacklist == null) {
            this.authBlacklist = new ArrayList<>();
        }
        authBlacklistSetter.accept(this.authBlacklist);
        return this;
    }

    /**
     * 绿色通道的黑名单配置
     * @return authBlacklist
     */
    public List<String> getAuthBlacklist() {
        return authBlacklist;
    }

    public void setAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAuthResp appAuthResp = (AppAuthResp) o;
        return Objects.equals(this.apiId, appAuthResp.apiId) &&
            Objects.equals(this.authResult, appAuthResp.authResult) &&
            Objects.equals(this.authTime, appAuthResp.authTime) &&
            Objects.equals(this.id, appAuthResp.id) &&
            Objects.equals(this.appId, appAuthResp.appId) &&
            Objects.equals(this.authRole, appAuthResp.authRole) &&
            Objects.equals(this.authTunnel, appAuthResp.authTunnel) &&
            Objects.equals(this.authWhitelist, appAuthResp.authWhitelist) &&
            Objects.equals(this.authBlacklist, appAuthResp.authBlacklist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiId, authResult, authTime, id, appId, authRole, authTunnel, authWhitelist, authBlacklist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuthResp {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    authResult: ").append(toIndentedString(authResult)).append("\n");
        sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    authRole: ").append(toIndentedString(authRole)).append("\n");
        sb.append("    authTunnel: ").append(toIndentedString(authTunnel)).append("\n");
        sb.append("    authWhitelist: ").append(toIndentedString(authWhitelist)).append("\n");
        sb.append("    authBlacklist: ").append(toIndentedString(authBlacklist)).append("\n");
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


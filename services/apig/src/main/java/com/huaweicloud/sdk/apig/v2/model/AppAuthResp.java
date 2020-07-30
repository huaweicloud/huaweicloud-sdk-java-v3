package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AuthResultResp;
import java.time.OffsetDateTime;
import java.util.HashMap;
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
    
    private AuthResultResp authResult = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_time")
    
    private OffsetDateTime authTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;
    /**
     * 授权者 - PROVIDER：API提供者授权 - CONSUMER：API消费者授权
     */
    public static class AuthRoleEnum {

        
        /**
         * Enum PROVIDER for value: "PROVIDER"
         */
        public static final AuthRoleEnum PROVIDER = new AuthRoleEnum("PROVIDER");
        
        /**
         * Enum CONSUMER for value: "CONSUMER"
         */
        public static final AuthRoleEnum CONSUMER = new AuthRoleEnum("CONSUMER");
        

        public static final Map<String, AuthRoleEnum> staticFields = new HashMap<String, AuthRoleEnum>() {
            { 
                put("PROVIDER", PROVIDER);
                put("CONSUMER", CONSUMER);
            }
        };

        private String value;

        AuthRoleEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthRoleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AuthRoleEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new AuthRoleEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static AuthRoleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AuthRoleEnum result = staticFields.get(value);
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
            Objects.equals(this.authRole, appAuthResp.authRole);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiId, authResult, authTime, id, appId, authRole);
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


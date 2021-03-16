package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppAuthBindedApiResp
 */
public class AppAuthBindedApiResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_type")
    
    private Integer apiType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_name")
    
    private String apiName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_time")
    
    private OffsetDateTime authTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_creator")
    
    private String appCreator;
    /**
     * APP的类型  默认为apig，暂不支持其他类型
     */
    public static final class AppTypeEnum {

        
        /**
         * Enum APIG for value: "apig"
         */
        public static final AppTypeEnum APIG = new AppTypeEnum("apig");
        
        /**
         * Enum ROMA for value: "roma"
         */
        public static final AppTypeEnum ROMA = new AppTypeEnum("roma");
        

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("apig", APIG);
            map.put("roma", ROMA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppTypeEnum(value);
            }
            return result;
        }

        public static AppTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    
    private AppTypeEnum appType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_remark")
    
    private String apiRemark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_role")
    
    private String authRole;
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
    
    public AppAuthBindedApiResp withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API的编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public AppAuthBindedApiResp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * APP的名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public AppAuthBindedApiResp withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * api授权绑定的环境ID
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public AppAuthBindedApiResp withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * api授权绑定的环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    

    public AppAuthBindedApiResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * API绑定的分组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public AppAuthBindedApiResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * API绑定的分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public AppAuthBindedApiResp withApiType(Integer apiType) {
        this.apiType = apiType;
        return this;
    }

    


    /**
     * API类型
     * @return apiType
     */
    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    

    public AppAuthBindedApiResp withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    


    /**
     * API的名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    

    public AppAuthBindedApiResp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * APP的编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public AppAuthBindedApiResp withAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
        return this;
    }

    


    /**
     * 授权创建的时间
     * @return authTime
     */
    public OffsetDateTime getAuthTime() {
        return authTime;
    }

    public void setAuthTime(OffsetDateTime authTime) {
        this.authTime = authTime;
    }

    

    public AppAuthBindedApiResp withAppCreator(String appCreator) {
        this.appCreator = appCreator;
        return this;
    }

    


    /**
     * APP的创建者，取值如下： - USER：租户自己创建 - MARKET：API市场分配
     * @return appCreator
     */
    public String getAppCreator() {
        return appCreator;
    }

    public void setAppCreator(String appCreator) {
        this.appCreator = appCreator;
    }

    

    public AppAuthBindedApiResp withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * APP的类型  默认为apig，暂不支持其他类型
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    

    public AppAuthBindedApiResp withId(String id) {
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

    

    public AppAuthBindedApiResp withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    


    /**
     * API的描述信息
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    

    public AppAuthBindedApiResp withAuthRole(String authRole) {
        this.authRole = authRole;
        return this;
    }

    


    /**
     * 授权者
     * @return authRole
     */
    public String getAuthRole() {
        return authRole;
    }

    public void setAuthRole(String authRole) {
        this.authRole = authRole;
    }

    

    public AppAuthBindedApiResp withAuthTunnel(AuthTunnelEnum authTunnel) {
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

    

    public AppAuthBindedApiResp withAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
        return this;
    }

    
    public AppAuthBindedApiResp addAuthWhitelistItem(String authWhitelistItem) {
        this.authWhitelist.add(authWhitelistItem);
        return this;
    }

    public AppAuthBindedApiResp withAuthWhitelist(Consumer<List<String>> authWhitelistSetter) {
        if(this.authWhitelist == null ){
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

    

    public AppAuthBindedApiResp withAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
        return this;
    }

    
    public AppAuthBindedApiResp addAuthBlacklistItem(String authBlacklistItem) {
        this.authBlacklist.add(authBlacklistItem);
        return this;
    }

    public AppAuthBindedApiResp withAuthBlacklist(Consumer<List<String>> authBlacklistSetter) {
        if(this.authBlacklist == null ){
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
        AppAuthBindedApiResp appAuthBindedApiResp = (AppAuthBindedApiResp) o;
        return Objects.equals(this.apiId, appAuthBindedApiResp.apiId) &&
            Objects.equals(this.appName, appAuthBindedApiResp.appName) &&
            Objects.equals(this.envId, appAuthBindedApiResp.envId) &&
            Objects.equals(this.envName, appAuthBindedApiResp.envName) &&
            Objects.equals(this.groupId, appAuthBindedApiResp.groupId) &&
            Objects.equals(this.groupName, appAuthBindedApiResp.groupName) &&
            Objects.equals(this.apiType, appAuthBindedApiResp.apiType) &&
            Objects.equals(this.apiName, appAuthBindedApiResp.apiName) &&
            Objects.equals(this.appId, appAuthBindedApiResp.appId) &&
            Objects.equals(this.authTime, appAuthBindedApiResp.authTime) &&
            Objects.equals(this.appCreator, appAuthBindedApiResp.appCreator) &&
            Objects.equals(this.appType, appAuthBindedApiResp.appType) &&
            Objects.equals(this.id, appAuthBindedApiResp.id) &&
            Objects.equals(this.apiRemark, appAuthBindedApiResp.apiRemark) &&
            Objects.equals(this.authRole, appAuthBindedApiResp.authRole) &&
            Objects.equals(this.authTunnel, appAuthBindedApiResp.authTunnel) &&
            Objects.equals(this.authWhitelist, appAuthBindedApiResp.authWhitelist) &&
            Objects.equals(this.authBlacklist, appAuthBindedApiResp.authBlacklist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiId, appName, envId, envName, groupId, groupName, apiType, apiName, appId, authTime, appCreator, appType, id, apiRemark, authRole, authTunnel, authWhitelist, authBlacklist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuthBindedApiResp {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
        sb.append("    appCreator: ").append(toIndentedString(appCreator)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
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


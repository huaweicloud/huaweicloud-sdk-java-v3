package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiAuthBase
 */
public class ApiAuthBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private Integer apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_remark")

    private String apiRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_role")

    private String authRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_time")

    private OffsetDateTime authTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_remark")

    private String appRemark;

    /**
     * APP的类型： - apig：存量apic客户端，新建实例不支持此类型 - roma：roma集成客户端
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AppTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AppTypeEnum(value);
            }
            return result;
        }

        public static AppTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof AppTypeEnum) {
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
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_creator")

    private String appCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    /**
     * 授权通道类型 - NORMAL：普通通道 - GREEN：绿色通道
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthTunnelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthTunnelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTunnelEnum(value);
            }
            return result;
        }

        public static AuthTunnelEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof AuthTunnelEnum) {
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
    @JsonProperty(value = "auth_tunnel")

    private AuthTunnelEnum authTunnel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_whitelist")

    private List<String> authWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_blacklist")

    private List<String> authBlacklist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visit_param")

    private String visitParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_type")

    private String romaAppType;

    public ApiAuthBase withId(String id) {
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

    public ApiAuthBase withApiId(String apiId) {
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

    public ApiAuthBase withApiName(String apiName) {
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

    public ApiAuthBase withGroupName(String groupName) {
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

    public ApiAuthBase withApiType(Integer apiType) {
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

    public ApiAuthBase withApiRemark(String apiRemark) {
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

    public ApiAuthBase withEnvId(String envId) {
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

    public ApiAuthBase withAuthRole(String authRole) {
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

    public ApiAuthBase withAuthTime(OffsetDateTime authTime) {
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

    public ApiAuthBase withAppName(String appName) {
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

    public ApiAuthBase withAppRemark(String appRemark) {
        this.appRemark = appRemark;
        return this;
    }

    /**
     * APP的描述
     * @return appRemark
     */
    public String getAppRemark() {
        return appRemark;
    }

    public void setAppRemark(String appRemark) {
        this.appRemark = appRemark;
    }

    public ApiAuthBase withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * APP的类型： - apig：存量apic客户端，新建实例不支持此类型 - roma：roma集成客户端
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public ApiAuthBase withAppCreator(String appCreator) {
        this.appCreator = appCreator;
        return this;
    }

    /**
     * APP的创建者，取值如下： - USER：租户自己创建 - MARKET：API市场分配，暂不支持
     * @return appCreator
     */
    public String getAppCreator() {
        return appCreator;
    }

    public void setAppCreator(String appCreator) {
        this.appCreator = appCreator;
    }

    public ApiAuthBase withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * API的发布编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ApiAuthBase withGroupId(String groupId) {
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

    public ApiAuthBase withAuthTunnel(AuthTunnelEnum authTunnel) {
        this.authTunnel = authTunnel;
        return this;
    }

    /**
     * 授权通道类型 - NORMAL：普通通道 - GREEN：绿色通道
     * @return authTunnel
     */
    public AuthTunnelEnum getAuthTunnel() {
        return authTunnel;
    }

    public void setAuthTunnel(AuthTunnelEnum authTunnel) {
        this.authTunnel = authTunnel;
    }

    public ApiAuthBase withAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
        return this;
    }

    public ApiAuthBase addAuthWhitelistItem(String authWhitelistItem) {
        if (this.authWhitelist == null) {
            this.authWhitelist = new ArrayList<>();
        }
        this.authWhitelist.add(authWhitelistItem);
        return this;
    }

    public ApiAuthBase withAuthWhitelist(Consumer<List<String>> authWhitelistSetter) {
        if (this.authWhitelist == null) {
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

    public ApiAuthBase withAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
        return this;
    }

    public ApiAuthBase addAuthBlacklistItem(String authBlacklistItem) {
        if (this.authBlacklist == null) {
            this.authBlacklist = new ArrayList<>();
        }
        this.authBlacklist.add(authBlacklistItem);
        return this;
    }

    public ApiAuthBase withAuthBlacklist(Consumer<List<String>> authBlacklistSetter) {
        if (this.authBlacklist == null) {
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

    public ApiAuthBase withVisitParam(String visitParam) {
        this.visitParam = visitParam;
        return this;
    }

    /**
     * 访问参数。
     * @return visitParam
     */
    public String getVisitParam() {
        return visitParam;
    }

    public void setVisitParam(String visitParam) {
        this.visitParam = visitParam;
    }

    public ApiAuthBase withRomaAppType(String romaAppType) {
        this.romaAppType = romaAppType;
        return this;
    }

    /**
     * ROMA_APP的类型： - subscription：订阅应用 - integration：集成应用
     * @return romaAppType
     */
    public String getRomaAppType() {
        return romaAppType;
    }

    public void setRomaAppType(String romaAppType) {
        this.romaAppType = romaAppType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAuthBase apiAuthBase = (ApiAuthBase) o;
        return Objects.equals(this.id, apiAuthBase.id) && Objects.equals(this.apiId, apiAuthBase.apiId)
            && Objects.equals(this.apiName, apiAuthBase.apiName)
            && Objects.equals(this.groupName, apiAuthBase.groupName)
            && Objects.equals(this.apiType, apiAuthBase.apiType)
            && Objects.equals(this.apiRemark, apiAuthBase.apiRemark) && Objects.equals(this.envId, apiAuthBase.envId)
            && Objects.equals(this.authRole, apiAuthBase.authRole)
            && Objects.equals(this.authTime, apiAuthBase.authTime) && Objects.equals(this.appName, apiAuthBase.appName)
            && Objects.equals(this.appRemark, apiAuthBase.appRemark)
            && Objects.equals(this.appType, apiAuthBase.appType)
            && Objects.equals(this.appCreator, apiAuthBase.appCreator)
            && Objects.equals(this.publishId, apiAuthBase.publishId)
            && Objects.equals(this.groupId, apiAuthBase.groupId)
            && Objects.equals(this.authTunnel, apiAuthBase.authTunnel)
            && Objects.equals(this.authWhitelist, apiAuthBase.authWhitelist)
            && Objects.equals(this.authBlacklist, apiAuthBase.authBlacklist)
            && Objects.equals(this.visitParam, apiAuthBase.visitParam)
            && Objects.equals(this.romaAppType, apiAuthBase.romaAppType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            apiId,
            apiName,
            groupName,
            apiType,
            apiRemark,
            envId,
            authRole,
            authTime,
            appName,
            appRemark,
            appType,
            appCreator,
            publishId,
            groupId,
            authTunnel,
            authWhitelist,
            authBlacklist,
            visitParam,
            romaAppType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAuthBase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    authRole: ").append(toIndentedString(authRole)).append("\n");
        sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appRemark: ").append(toIndentedString(appRemark)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appCreator: ").append(toIndentedString(appCreator)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    authTunnel: ").append(toIndentedString(authTunnel)).append("\n");
        sb.append("    authWhitelist: ").append(toIndentedString(authWhitelist)).append("\n");
        sb.append("    authBlacklist: ").append(toIndentedString(authBlacklist)).append("\n");
        sb.append("    visitParam: ").append(toIndentedString(visitParam)).append("\n");
        sb.append("    romaAppType: ").append(toIndentedString(romaAppType)).append("\n");
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

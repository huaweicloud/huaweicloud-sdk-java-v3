package com.huaweicloud.sdk.apig.v2.model;

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
 * AuthorizerResp
 */
public class AuthorizerResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 自定义认证类型  - FRONTEND：前端 - BACKEND：后端  不支持修改
     */
    public static final class TypeEnum {

        /**
         * Enum FRONTEND for value: "FRONTEND"
         */
        public static final TypeEnum FRONTEND = new TypeEnum("FRONTEND");

        /**
         * Enum BACKEND for value: "BACKEND"
         */
        public static final TypeEnum BACKEND = new TypeEnum("BACKEND");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FRONTEND", FRONTEND);
            map.put("BACKEND", BACKEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 自定义认证的类型。当前只支持函数类型：FUNC。
     */
    public static final class AuthorizerTypeEnum {

        /**
         * Enum FUNC for value: "FUNC"
         */
        public static final AuthorizerTypeEnum FUNC = new AuthorizerTypeEnum("FUNC");

        private static final Map<String, AuthorizerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthorizerTypeEnum> createStaticFields() {
            Map<String, AuthorizerTypeEnum> map = new HashMap<>();
            map.put("FUNC", FUNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthorizerTypeEnum(String value) {
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
        public static AuthorizerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthorizerTypeEnum(value));
        }

        public static AuthorizerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthorizerTypeEnum) {
                return this.value.equals(((AuthorizerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerTypeEnum authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_uri")

    private String authorizerUri;

    /**
     * 对接函数的网络架构类型 - V1：非VPC网络架构 - V2：VPC网络架构
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum V1 for value: "V1"
         */
        public static final NetworkTypeEnum V1 = new NetworkTypeEnum("V1");

        /**
         * Enum V2 for value: "V2"
         */
        public static final NetworkTypeEnum V2 = new NetworkTypeEnum("V2");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("V1", V1);
            map.put("V2", V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_version")

    private String authorizerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_alias_uri")

    private String authorizerAliasUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identities")

    private List<Identity> identities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ld_api_id")

    private String ldApiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_body")

    private Boolean needBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_name")

    private String romaAppName;

    public AuthorizerResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义认证的名称。 长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、“_”组成，且只能以英文或中文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorizerResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义认证类型  - FRONTEND：前端 - BACKEND：后端  不支持修改
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AuthorizerResp withAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * 自定义认证的类型。当前只支持函数类型：FUNC。
     * @return authorizerType
     */
    public AuthorizerTypeEnum getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
    }

    public AuthorizerResp withAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
        return this;
    }

    /**
     * 函数地址。
     * @return authorizerUri
     */
    public String getAuthorizerUri() {
        return authorizerUri;
    }

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    public AuthorizerResp withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 对接函数的网络架构类型 - V1：非VPC网络架构 - V2：VPC网络架构
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public AuthorizerResp withAuthorizerVersion(String authorizerVersion) {
        this.authorizerVersion = authorizerVersion;
        return this;
    }

    /**
     * 函数版本。  当函数别名URN和函数版本同时传入时，函数版本将被忽略，只会使用函数别名URN
     * @return authorizerVersion
     */
    public String getAuthorizerVersion() {
        return authorizerVersion;
    }

    public void setAuthorizerVersion(String authorizerVersion) {
        this.authorizerVersion = authorizerVersion;
    }

    public AuthorizerResp withAuthorizerAliasUri(String authorizerAliasUri) {
        this.authorizerAliasUri = authorizerAliasUri;
        return this;
    }

    /**
     * 函数别名地址。  当函数别名URN和函数版本同时传入时，函数版本将被忽略，只会使用函数别名URN
     * @return authorizerAliasUri
     */
    public String getAuthorizerAliasUri() {
        return authorizerAliasUri;
    }

    public void setAuthorizerAliasUri(String authorizerAliasUri) {
        this.authorizerAliasUri = authorizerAliasUri;
    }

    public AuthorizerResp withIdentities(List<Identity> identities) {
        this.identities = identities;
        return this;
    }

    public AuthorizerResp addIdentitiesItem(Identity identitiesItem) {
        if (this.identities == null) {
            this.identities = new ArrayList<>();
        }
        this.identities.add(identitiesItem);
        return this;
    }

    public AuthorizerResp withIdentities(Consumer<List<Identity>> identitiesSetter) {
        if (this.identities == null) {
            this.identities = new ArrayList<>();
        }
        identitiesSetter.accept(this.identities);
        return this;
    }

    /**
     * 认证来源
     * @return identities
     */
    public List<Identity> getIdentities() {
        return identities;
    }

    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
    }

    public AuthorizerResp withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 缓存时间
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public AuthorizerResp withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户数据
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public AuthorizerResp withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    /**
     * 自定义后端服务ID。  暂不支持
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    public AuthorizerResp withNeedBody(Boolean needBody) {
        this.needBody = needBody;
        return this;
    }

    /**
     * 是否发送body
     * @return needBody
     */
    public Boolean getNeedBody() {
        return needBody;
    }

    public void setNeedBody(Boolean needBody) {
        this.needBody = needBody;
    }

    public AuthorizerResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义认证编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthorizerResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AuthorizerResp withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * 自定义认证所属应用编号  暂不支持
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public AuthorizerResp withRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
        return this;
    }

    /**
     * 自定义认证所属应用名称  暂不支持
     * @return romaAppName
     */
    public String getRomaAppName() {
        return romaAppName;
    }

    public void setRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizerResp that = (AuthorizerResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.authorizerUri, that.authorizerUri)
            && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.authorizerVersion, that.authorizerVersion)
            && Objects.equals(this.authorizerAliasUri, that.authorizerAliasUri)
            && Objects.equals(this.identities, that.identities) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.ldApiId, that.ldApiId)
            && Objects.equals(this.needBody, that.needBody) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.romaAppId, that.romaAppId)
            && Objects.equals(this.romaAppName, that.romaAppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            authorizerType,
            authorizerUri,
            networkType,
            authorizerVersion,
            authorizerAliasUri,
            identities,
            ttl,
            userData,
            ldApiId,
            needBody,
            id,
            createTime,
            romaAppId,
            romaAppName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizerResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    authorizerUri: ").append(toIndentedString(authorizerUri)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    authorizerVersion: ").append(toIndentedString(authorizerVersion)).append("\n");
        sb.append("    authorizerAliasUri: ").append(toIndentedString(authorizerAliasUri)).append("\n");
        sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
        sb.append("    needBody: ").append(toIndentedString(needBody)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    romaAppName: ").append(toIndentedString(romaAppName)).append("\n");
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

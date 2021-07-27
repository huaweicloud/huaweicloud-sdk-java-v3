package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiDeploy
 */
public class LdApiDeploy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_front_api")
    
    private Boolean deployFrontApi;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizer_id")
    
    private String authorizerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;
    /**
     * 请求协议
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");
        
        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");
        
        /**
         * Enum HTTPS_HTTP for value: "HTTPS&HTTP"
         */
        public static final ProtocolEnum HTTPS_HTTP = new ProtocolEnum("HTTPS&HTTP");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTPS", HTTPS);
            map.put("HTTP", HTTP);
            map.put("HTTPS&HTTP", HTTPS_HTTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backend_timeout")
    
    private Integer backendTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cors")
    
    private Boolean cors;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;

    public LdApiDeploy withDeployFrontApi(Boolean deployFrontApi) {
        this.deployFrontApi = deployFrontApi;
        return this;
    }

    


    /**
     * 是否自动发布API - true：部署完成后自动创建并发布前端API。此时auth_type，group_id，env_id，protocol必填。 - false：部署完成后不创建前端API 
     * @return deployFrontApi
     */
    public Boolean getDeployFrontApi() {
        return deployFrontApi;
    }

    public void setDeployFrontApi(Boolean deployFrontApi) {
        this.deployFrontApi = deployFrontApi;
    }

    

    public LdApiDeploy withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 认证方式 - NONE：无认证 - APP：APP认证 - IAM：IAM认证 - AUTHORIZER：自定义认证 
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public LdApiDeploy withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    


    /**
     * 自定义认证编号。  认证方式auth_type = AUTHORIZER时必填
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    

    public LdApiDeploy withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 部署的前端API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public LdApiDeploy withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * 部署的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public LdApiDeploy withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 请求协议
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    

    public LdApiDeploy withBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
        return this;
    }

    


    /**
     * 超时时间
     * @return backendTimeout
     */
    public Integer getBackendTimeout() {
        return backendTimeout;
    }

    public void setBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
    }

    

    public LdApiDeploy withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public LdApiDeploy withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * 请求方式
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    

    public LdApiDeploy withCors(Boolean cors) {
        this.cors = cors;
        return this;
    }

    


    /**
     * 是否支持跨域 - true：支持 - false：不支持 
     * @return cors
     */
    public Boolean getCors() {
        return cors;
    }

    public void setCors(Boolean cors) {
        this.cors = cors;
    }

    

    public LdApiDeploy withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 部署到前端的api归属的应用编号，与后端归属的应用编号保持一致
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiDeploy ldApiDeploy = (LdApiDeploy) o;
        return Objects.equals(this.deployFrontApi, ldApiDeploy.deployFrontApi) &&
            Objects.equals(this.authType, ldApiDeploy.authType) &&
            Objects.equals(this.authorizerId, ldApiDeploy.authorizerId) &&
            Objects.equals(this.groupId, ldApiDeploy.groupId) &&
            Objects.equals(this.envId, ldApiDeploy.envId) &&
            Objects.equals(this.protocol, ldApiDeploy.protocol) &&
            Objects.equals(this.backendTimeout, ldApiDeploy.backendTimeout) &&
            Objects.equals(this.path, ldApiDeploy.path) &&
            Objects.equals(this.method, ldApiDeploy.method) &&
            Objects.equals(this.cors, ldApiDeploy.cors) &&
            Objects.equals(this.romaAppId, ldApiDeploy.romaAppId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deployFrontApi, authType, authorizerId, groupId, envId, protocol, backendTimeout, path, method, cors, romaAppId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiDeploy {\n");
        sb.append("    deployFrontApi: ").append(toIndentedString(deployFrontApi)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    backendTimeout: ").append(toIndentedString(backendTimeout)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
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


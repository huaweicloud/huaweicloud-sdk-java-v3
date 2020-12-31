package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiCreate;
import com.huaweicloud.sdk.roma.v2.model.LdApiParameter;
import com.huaweicloud.sdk.roma.v2.model.LdApiScript;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLiveDataApiV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;
    /**
     * 后端API返回类型
     */
    public static final class ContentTypeEnum {

        
        /**
         * Enum JSON for value: "json"
         */
        public static final ContentTypeEnum JSON = new ContentTypeEnum("json");
        
        /**
         * Enum XML for value: "xml"
         */
        public static final ContentTypeEnum XML = new ContentTypeEnum("xml");
        

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("xml", XML);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentTypeEnum(value);
            }
            return result;
        }

        public static ContentTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ContentTypeEnum) {
                return this.value.equals(((ContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_type")
    
    private ContentTypeEnum contentType = ContentTypeEnum.JSON;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_signature_id")
    
    private String apiSignatureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_format")
    
    private Boolean returnFormat = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private List<LdApiParameter> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    private String instance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private OffsetDateTime createdTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modified_time")
    
    private OffsetDateTime modifiedTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scripts")
    
    private List<LdApiScript> scripts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_name")
    
    private String romaAppName;

    public UpdateLiveDataApiV2Response withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端API名称，校验的正则表达式为“([a-zA-Z]|[\\u4e00-\\u9fa5])([a-zA-Z0-9_]|[\\u4e00-\\u9fa5]){2,63}”
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLiveDataApiV2Response withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 后端API请求路径，校验的正则表达式为“(/)|((/[\\.a-zA-Z0-9_-]+)+/?)”，且最大长度为256
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UpdateLiveDataApiV2Response withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * 后端API请求方法，GET、PUT、POST、DELETE
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public UpdateLiveDataApiV2Response withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 后端API描述，长度为0-255的任意字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateLiveDataApiV2Response withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 后端API版本，不能含有< 、>这两个字符，长度为2-16
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateLiveDataApiV2Response withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    


    /**
     * 后端API返回类型
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public UpdateLiveDataApiV2Response withApiSignatureId(String apiSignatureId) {
        this.apiSignatureId = apiSignatureId;
        return this;
    }

    


    /**
     * 后端API为签名认证时绑定的签名秘钥编号
     * @return apiSignatureId
     */
    public String getApiSignatureId() {
        return apiSignatureId;
    }

    public void setApiSignatureId(String apiSignatureId) {
        this.apiSignatureId = apiSignatureId;
    }

    public UpdateLiveDataApiV2Response withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 后端API归属的集成应用编号
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public UpdateLiveDataApiV2Response withReturnFormat(Boolean returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }

    


    /**
     * API响应信息是否格式化  true： 对响应信息进行格式化  false：对响应信息格式化不进行格式化 
     * @return returnFormat
     */
    public Boolean getReturnFormat() {
        return returnFormat;
    }

    public void setReturnFormat(Boolean returnFormat) {
        this.returnFormat = returnFormat;
    }

    public UpdateLiveDataApiV2Response withParameters(List<LdApiParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public UpdateLiveDataApiV2Response addParametersItem(LdApiParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public UpdateLiveDataApiV2Response withParameters(Consumer<List<LdApiParameter>> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 后端API的请求参数列表
     * @return parameters
     */
    public List<LdApiParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<LdApiParameter> parameters) {
        this.parameters = parameters;
    }

    public UpdateLiveDataApiV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后端API编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateLiveDataApiV2Response withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    


    /**
     * 后端API所有者
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public UpdateLiveDataApiV2Response withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 后端API类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateLiveDataApiV2Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 后端API状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateLiveDataApiV2Response withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 后端API创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateLiveDataApiV2Response withModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    


    /**
     * 后端API修改时间
     * @return modifiedTime
     */
    public OffsetDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public UpdateLiveDataApiV2Response withScripts(List<LdApiScript> scripts) {
        this.scripts = scripts;
        return this;
    }

    
    public UpdateLiveDataApiV2Response addScriptsItem(LdApiScript scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public UpdateLiveDataApiV2Response withScripts(Consumer<List<LdApiScript>> scriptsSetter) {
        if(this.scripts == null ){
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * 后端API脚本信息
     * @return scripts
     */
    public List<LdApiScript> getScripts() {
        return scripts;
    }

    public void setScripts(List<LdApiScript> scripts) {
        this.scripts = scripts;
    }

    public UpdateLiveDataApiV2Response withRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
        return this;
    }

    


    /**
     * 后端API归属的集成应用名称
     * @return romaAppName
     */
    public String getRomaAppName() {
        return romaAppName;
    }

    public void setRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLiveDataApiV2Response updateLiveDataApiV2Response = (UpdateLiveDataApiV2Response) o;
        return Objects.equals(this.name, updateLiveDataApiV2Response.name) &&
            Objects.equals(this.path, updateLiveDataApiV2Response.path) &&
            Objects.equals(this.method, updateLiveDataApiV2Response.method) &&
            Objects.equals(this.description, updateLiveDataApiV2Response.description) &&
            Objects.equals(this.version, updateLiveDataApiV2Response.version) &&
            Objects.equals(this.contentType, updateLiveDataApiV2Response.contentType) &&
            Objects.equals(this.apiSignatureId, updateLiveDataApiV2Response.apiSignatureId) &&
            Objects.equals(this.romaAppId, updateLiveDataApiV2Response.romaAppId) &&
            Objects.equals(this.returnFormat, updateLiveDataApiV2Response.returnFormat) &&
            Objects.equals(this.parameters, updateLiveDataApiV2Response.parameters) &&
            Objects.equals(this.id, updateLiveDataApiV2Response.id) &&
            Objects.equals(this.instance, updateLiveDataApiV2Response.instance) &&
            Objects.equals(this.type, updateLiveDataApiV2Response.type) &&
            Objects.equals(this.status, updateLiveDataApiV2Response.status) &&
            Objects.equals(this.createdTime, updateLiveDataApiV2Response.createdTime) &&
            Objects.equals(this.modifiedTime, updateLiveDataApiV2Response.modifiedTime) &&
            Objects.equals(this.scripts, updateLiveDataApiV2Response.scripts) &&
            Objects.equals(this.romaAppName, updateLiveDataApiV2Response.romaAppName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, path, method, description, version, contentType, apiSignatureId, romaAppId, returnFormat, parameters, id, instance, type, status, createdTime, modifiedTime, scripts, romaAppName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLiveDataApiV2Response {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    apiSignatureId: ").append(toIndentedString(apiSignatureId)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    returnFormat: ").append(toIndentedString(returnFormat)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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


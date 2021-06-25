package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

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
public class CreateLiveDataApiV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;
    /**
     * 后端API请求方法。  支持GET、PUT、POST、DELETE
     */
    public static final class MethodEnum {

        
        /**
         * Enum GET for value: "GET"
         */
        public static final MethodEnum GET = new MethodEnum("GET");
        
        /**
         * Enum PUT for value: "PUT"
         */
        public static final MethodEnum PUT = new MethodEnum("PUT");
        
        /**
         * Enum POST for value: "POST"
         */
        public static final MethodEnum POST = new MethodEnum("POST");
        
        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final MethodEnum DELETE = new MethodEnum("DELETE");
        

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("PUT", PUT);
            map.put("POST", POST);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MethodEnum(value);
            }
            return result;
        }

        public static MethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private MethodEnum method;


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
        
        /**
         * Enum STREAM for value: "stream"
         */
        public static final ContentTypeEnum STREAM = new ContentTypeEnum("stream");
        

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("xml", XML);
            map.put("stream", STREAM);
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
    
    private ContentTypeEnum contentType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_signature_id")
    
    private String apiSignatureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_format")
    
    private Boolean returnFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private List<LdApiParameter> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    private String instance;
    /**
     * 后端API类型： - data：数据后端 - function： 函数后端
     */
    public static final class TypeEnum {

        
        /**
         * Enum DATA for value: "data"
         */
        public static final TypeEnum DATA = new TypeEnum("data");
        
        /**
         * Enum FUNCTION for value: "function"
         */
        public static final TypeEnum FUNCTION = new TypeEnum("function");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("data", DATA);
            map.put("function", FUNCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;
    /**
     * 后端API状态： - 1：待开发 - 3：开发中 - 4：已部署
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private OffsetDateTime createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="modified_time")
    
    private OffsetDateTime modifiedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scripts")
    
    private List<LdApiScript> scripts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_name")
    
    private String romaAppName;

    public CreateLiveDataApiV2Response withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端API名称。  支持汉字、英文、数字、中划线、下划线、点、斜杠、中英文格式下的小括号和冒号、中文格式下的顿号，且只能以英文、汉字和数字开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateLiveDataApiV2Response withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 后端API请求路径。  支持英文、数字、中划线、下划线、点等，且以斜杠（/）开头。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public CreateLiveDataApiV2Response withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    


    /**
     * 后端API请求方法。  支持GET、PUT、POST、DELETE
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    

    public CreateLiveDataApiV2Response withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 后端API描述。  不支持<，>字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateLiveDataApiV2Response withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 后端API版本  支持英文，数字，下划线，中划线，点。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public CreateLiveDataApiV2Response withContentType(ContentTypeEnum contentType) {
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

    

    public CreateLiveDataApiV2Response withApiSignatureId(String apiSignatureId) {
        this.apiSignatureId = apiSignatureId;
        return this;
    }

    


    /**
     * 后端API为签名认证时绑定的签名密钥编号
     * @return apiSignatureId
     */
    public String getApiSignatureId() {
        return apiSignatureId;
    }

    public void setApiSignatureId(String apiSignatureId) {
        this.apiSignatureId = apiSignatureId;
    }

    

    public CreateLiveDataApiV2Response withRomaAppId(String romaAppId) {
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

    

    public CreateLiveDataApiV2Response withReturnFormat(Boolean returnFormat) {
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

    

    public CreateLiveDataApiV2Response withParameters(List<LdApiParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public CreateLiveDataApiV2Response addParametersItem(LdApiParameter parametersItem) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public CreateLiveDataApiV2Response withParameters(Consumer<List<LdApiParameter>> parametersSetter) {
        if(this.parameters == null) {
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

    

    public CreateLiveDataApiV2Response withId(String id) {
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

    

    public CreateLiveDataApiV2Response withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    


    /**
     * 后端API所属实例编号
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    

    public CreateLiveDataApiV2Response withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 后端API类型： - data：数据后端 - function： 函数后端
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public CreateLiveDataApiV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 后端API状态： - 1：待开发 - 3：开发中 - 4：已部署
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public CreateLiveDataApiV2Response withCreatedTime(OffsetDateTime createdTime) {
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

    

    public CreateLiveDataApiV2Response withModifiedTime(OffsetDateTime modifiedTime) {
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

    

    public CreateLiveDataApiV2Response withScripts(List<LdApiScript> scripts) {
        this.scripts = scripts;
        return this;
    }

    
    public CreateLiveDataApiV2Response addScriptsItem(LdApiScript scriptsItem) {
        if(this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public CreateLiveDataApiV2Response withScripts(Consumer<List<LdApiScript>> scriptsSetter) {
        if(this.scripts == null) {
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

    

    public CreateLiveDataApiV2Response withRomaAppName(String romaAppName) {
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
        CreateLiveDataApiV2Response createLiveDataApiV2Response = (CreateLiveDataApiV2Response) o;
        return Objects.equals(this.name, createLiveDataApiV2Response.name) &&
            Objects.equals(this.path, createLiveDataApiV2Response.path) &&
            Objects.equals(this.method, createLiveDataApiV2Response.method) &&
            Objects.equals(this.description, createLiveDataApiV2Response.description) &&
            Objects.equals(this.version, createLiveDataApiV2Response.version) &&
            Objects.equals(this.contentType, createLiveDataApiV2Response.contentType) &&
            Objects.equals(this.apiSignatureId, createLiveDataApiV2Response.apiSignatureId) &&
            Objects.equals(this.romaAppId, createLiveDataApiV2Response.romaAppId) &&
            Objects.equals(this.returnFormat, createLiveDataApiV2Response.returnFormat) &&
            Objects.equals(this.parameters, createLiveDataApiV2Response.parameters) &&
            Objects.equals(this.id, createLiveDataApiV2Response.id) &&
            Objects.equals(this.instance, createLiveDataApiV2Response.instance) &&
            Objects.equals(this.type, createLiveDataApiV2Response.type) &&
            Objects.equals(this.status, createLiveDataApiV2Response.status) &&
            Objects.equals(this.createdTime, createLiveDataApiV2Response.createdTime) &&
            Objects.equals(this.modifiedTime, createLiveDataApiV2Response.modifiedTime) &&
            Objects.equals(this.scripts, createLiveDataApiV2Response.scripts) &&
            Objects.equals(this.romaAppName, createLiveDataApiV2Response.romaAppName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, path, method, description, version, contentType, apiSignatureId, romaAppId, returnFormat, parameters, id, instance, type, status, createdTime, modifiedTime, scripts, romaAppName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLiveDataApiV2Response {\n");
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


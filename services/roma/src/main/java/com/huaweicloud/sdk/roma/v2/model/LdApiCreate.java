package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LdApiParameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiCreate
 */
public class LdApiCreate  {



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
    
    public LdApiCreate withName(String name) {
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

    

    public LdApiCreate withPath(String path) {
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

    

    public LdApiCreate withMethod(String method) {
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

    

    public LdApiCreate withDescription(String description) {
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

    

    public LdApiCreate withVersion(String version) {
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

    

    public LdApiCreate withContentType(ContentTypeEnum contentType) {
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

    

    public LdApiCreate withApiSignatureId(String apiSignatureId) {
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

    

    public LdApiCreate withRomaAppId(String romaAppId) {
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

    

    public LdApiCreate withReturnFormat(Boolean returnFormat) {
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

    

    public LdApiCreate withParameters(List<LdApiParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public LdApiCreate addParametersItem(LdApiParameter parametersItem) {
        this.parameters.add(parametersItem);
        return this;
    }

    public LdApiCreate withParameters(Consumer<List<LdApiParameter>> parametersSetter) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiCreate ldApiCreate = (LdApiCreate) o;
        return Objects.equals(this.name, ldApiCreate.name) &&
            Objects.equals(this.path, ldApiCreate.path) &&
            Objects.equals(this.method, ldApiCreate.method) &&
            Objects.equals(this.description, ldApiCreate.description) &&
            Objects.equals(this.version, ldApiCreate.version) &&
            Objects.equals(this.contentType, ldApiCreate.contentType) &&
            Objects.equals(this.apiSignatureId, ldApiCreate.apiSignatureId) &&
            Objects.equals(this.romaAppId, ldApiCreate.romaAppId) &&
            Objects.equals(this.returnFormat, ldApiCreate.returnFormat) &&
            Objects.equals(this.parameters, ldApiCreate.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, path, method, description, version, contentType, apiSignatureId, romaAppId, returnFormat, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiCreate {\n");
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


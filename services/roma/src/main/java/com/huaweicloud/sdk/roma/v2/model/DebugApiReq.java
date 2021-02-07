package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DebugApiReq
 */
public class DebugApiReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private String body;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="header")
    
    private Map<String, List<String>> header = null;
        /**
     * API的请求方法
     */
    public static final class MethodEnum {

        
        /**
         * Enum GET for value: "GET"
         */
        public static final MethodEnum GET = new MethodEnum("GET");
        
        /**
         * Enum POST for value: "POST"
         */
        public static final MethodEnum POST = new MethodEnum("POST");
        
        /**
         * Enum PUT for value: "PUT"
         */
        public static final MethodEnum PUT = new MethodEnum("PUT");
        
        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final MethodEnum DELETE = new MethodEnum("DELETE");
        
        /**
         * Enum HEAD for value: "HEAD"
         */
        public static final MethodEnum HEAD = new MethodEnum("HEAD");
        
        /**
         * Enum PATCH for value: "PATCH"
         */
        public static final MethodEnum PATCH = new MethodEnum("PATCH");
        
        /**
         * Enum OPTIONS for value: "OPTIONS"
         */
        public static final MethodEnum OPTIONS = new MethodEnum("OPTIONS");
        

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("POST", POST);
            map.put("PUT", PUT);
            map.put("DELETE", DELETE);
            map.put("HEAD", HEAD);
            map.put("PATCH", PATCH);
            map.put("OPTIONS", OPTIONS);
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
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query")
    
    private Map<String, List<String>> query = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheme")
    
    private String scheme;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_secret")
    
    private String appSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stage")
    
    private String stage;

    public DebugApiReq withBody(String body) {
        this.body = body;
        return this;
    }

    


    /**
     * 请求消息体，最长2097152字节
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public DebugApiReq withHeader(Map<String, List<String>> header) {
        this.header = header;
        return this;
    }

    

    public DebugApiReq putHeaderItem(String key, List<String> headerItem) {
         if (this.header == null) {
            this.header = new HashMap<>();
         }
        this.header.put(key, headerItem);
        return this;
    }

    public DebugApiReq withHeader(Consumer<Map<String, List<String>>> headerSetter) {
        if(this.header == null ){
            this.header = new HashMap<>();
        }
        headerSetter.accept(this.header);
        return this;
    }
    /**
     * 头域参数，每个参数值为字符串数组，每个参数名称有如下约束： - 英文字母、数字、点、中连线组成 - 必须以英文字母开头，最长32字节 - 不支持以\"X-Apig-\"或\"X-Sdk-\"开头，不区分大小写 - 不支持取值为\"X-Stage\"，不区分大小写 - mode为MARKET或CONSUMER时，不支持取值为\"X-Auth-Token\"和\"Authorization\"，不区分大小写 > 头域名称在使用前会被规范化，如：\"x-MY-hEaDer\"会被规范化为\"X-My-Header\"
     * @return header
     */
    public Map<String, List<String>> getHeader() {
        return header;
    }

    public void setHeader(Map<String, List<String>> header) {
        this.header = header;
    }

    public DebugApiReq withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    


    /**
     * API的请求方法
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public DebugApiReq withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 调试模式 - DEVELOPER 调试尚未发布的API定义 - MARKET 调试云市场已购买的API - CONSUMER 调试指定运行环境下的API定义 > DEVELOPER模式，接口调用者必须是API拥有者。    MARKET模式，接口调用者必须是API购买者或拥有者。    CONSUMER模式，接口调用者必须有API在指定环境上的授权信息或是API拥有者。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public DebugApiReq withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * API的请求路径，需以\"/\"开头，最大长度1024 > 须符合路径规范，百分号编码格式可被正确解码
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DebugApiReq withQuery(Map<String, List<String>> query) {
        this.query = query;
        return this;
    }

    

    public DebugApiReq putQueryItem(String key, List<String> queryItem) {
         if (this.query == null) {
            this.query = new HashMap<>();
         }
        this.query.put(key, queryItem);
        return this;
    }

    public DebugApiReq withQuery(Consumer<Map<String, List<String>>> querySetter) {
        if(this.query == null ){
            this.query = new HashMap<>();
        }
        querySetter.accept(this.query);
        return this;
    }
    /**
     * 查询参数，每个参数值为字符串数组，每个参数名称有如下约束： - 英文字母、数字、点、下划线、中连线组成 - 必须以英文字母开头，最长32字节 - 不支持以\"X-Apig-\"或\"X-Sdk-\"开头，不区分大小写 - 不支持取值为\"X-Stage\"，不区分大小写
     * @return query
     */
    public Map<String, List<String>> getQuery() {
        return query;
    }

    public void setQuery(Map<String, List<String>> query) {
        this.query = query;
    }

    public DebugApiReq withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    


    /**
     * API的请求协议 - HTTP - HTTPS
     * @return scheme
     */
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public DebugApiReq withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * 调试请求使用的APP的key
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public DebugApiReq withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    


    /**
     * 调试请求使用的APP的密钥
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public DebugApiReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * API的访问域名，未提供时根据mode的取值使用如下默认值： - DEVELOPER API分组的子域名 - MARKET 云市场为API分组分配的域名 - CONSUMER API分组的子域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DebugApiReq withStage(String stage) {
        this.stage = stage;
        return this;
    }

    


    /**
     * 调试请求指定的运行环境，仅在mode为CONSUMER时有效，未提供时有如下默认值: - CONSUMER RELEASE
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugApiReq debugApiReq = (DebugApiReq) o;
        return Objects.equals(this.body, debugApiReq.body) &&
            Objects.equals(this.header, debugApiReq.header) &&
            Objects.equals(this.method, debugApiReq.method) &&
            Objects.equals(this.mode, debugApiReq.mode) &&
            Objects.equals(this.path, debugApiReq.path) &&
            Objects.equals(this.query, debugApiReq.query) &&
            Objects.equals(this.scheme, debugApiReq.scheme) &&
            Objects.equals(this.appKey, debugApiReq.appKey) &&
            Objects.equals(this.appSecret, debugApiReq.appSecret) &&
            Objects.equals(this.domain, debugApiReq.domain) &&
            Objects.equals(this.stage, debugApiReq.stage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body, header, method, mode, path, query, scheme, appKey, appSecret, domain, stage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugApiReq {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
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


package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Api
 */
public class Api {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_id")

    private String catalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_flag")

    private Boolean logFlag;

    /**
     * Gets or Sets apiType
     */
    public static final class ApiTypeEnum {

        /**
         * Enum API_SPECIFIC_TYPE_CONFIGURATION for value: "API_SPECIFIC_TYPE_CONFIGURATION"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_CONFIGURATION =
            new ApiTypeEnum("API_SPECIFIC_TYPE_CONFIGURATION");

        /**
         * Enum API_SPECIFIC_TYPE_SCRIPT for value: "API_SPECIFIC_TYPE_SCRIPT"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_SCRIPT = new ApiTypeEnum("API_SPECIFIC_TYPE_SCRIPT");

        /**
         * Enum API_SPECIFIC_TYPE_MYBATIS for value: "API_SPECIFIC_TYPE_MYBATIS"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_MYBATIS = new ApiTypeEnum("API_SPECIFIC_TYPE_MYBATIS");

        /**
         * Enum API_SPECIFIC_TYPE_GROOVY for value: "API_SPECIFIC_TYPE_GROOVY"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_GROOVY = new ApiTypeEnum("API_SPECIFIC_TYPE_GROOVY");

        /**
         * Enum API_SPECIFIC_TYPE_REGISTER for value: "API_SPECIFIC_TYPE_REGISTER"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_REGISTER = new ApiTypeEnum("API_SPECIFIC_TYPE_REGISTER");

        /**
         * Enum API_SPECIFIC_TYPE_ORCHESTRATE for value: "API_SPECIFIC_TYPE_ORCHESTRATE"
         */
        public static final ApiTypeEnum API_SPECIFIC_TYPE_ORCHESTRATE =
            new ApiTypeEnum("API_SPECIFIC_TYPE_ORCHESTRATE");

        /**
         * Enum API_TYPE_CREATE for value: "API_TYPE_CREATE"
         */
        public static final ApiTypeEnum API_TYPE_CREATE = new ApiTypeEnum("API_TYPE_CREATE");

        /**
         * Enum API_TYPE_REGISTER for value: "API_TYPE_REGISTER"
         */
        public static final ApiTypeEnum API_TYPE_REGISTER = new ApiTypeEnum("API_TYPE_REGISTER");

        private static final Map<String, ApiTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiTypeEnum> createStaticFields() {
            Map<String, ApiTypeEnum> map = new HashMap<>();
            map.put("API_SPECIFIC_TYPE_CONFIGURATION", API_SPECIFIC_TYPE_CONFIGURATION);
            map.put("API_SPECIFIC_TYPE_SCRIPT", API_SPECIFIC_TYPE_SCRIPT);
            map.put("API_SPECIFIC_TYPE_MYBATIS", API_SPECIFIC_TYPE_MYBATIS);
            map.put("API_SPECIFIC_TYPE_GROOVY", API_SPECIFIC_TYPE_GROOVY);
            map.put("API_SPECIFIC_TYPE_REGISTER", API_SPECIFIC_TYPE_REGISTER);
            map.put("API_SPECIFIC_TYPE_ORCHESTRATE", API_SPECIFIC_TYPE_ORCHESTRATE);
            map.put("API_TYPE_CREATE", API_TYPE_CREATE);
            map.put("API_TYPE_REGISTER", API_TYPE_REGISTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiTypeEnum(String value) {
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
        public static ApiTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiTypeEnum(value));
        }

        public static ApiTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiTypeEnum) {
                return this.value.equals(((ApiTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiTypeEnum apiType;

    /**
     * Gets or Sets authType
     */
    public static final class AuthTypeEnum {

        /**
         * Enum APP for value: "APP"
         */
        public static final AuthTypeEnum APP = new AuthTypeEnum("APP");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("IAM", IAM);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period")

    private Integer retentionPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    /**
     * Gets or Sets protocol
     */
    public static final class ProtocolEnum {

        /**
         * Enum PROTOCOL_TYPE_HTTP for value: "PROTOCOL_TYPE_HTTP"
         */
        public static final ProtocolEnum PROTOCOL_TYPE_HTTP = new ProtocolEnum("PROTOCOL_TYPE_HTTP");

        /**
         * Enum PROTOCOL_TYPE_HTTPS for value: "PROTOCOL_TYPE_HTTPS"
         */
        public static final ProtocolEnum PROTOCOL_TYPE_HTTPS = new ProtocolEnum("PROTOCOL_TYPE_HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("PROTOCOL_TYPE_HTTP", PROTOCOL_TYPE_HTTP);
            map.put("PROTOCOL_TYPE_HTTPS", PROTOCOL_TYPE_HTTPS);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    /**
     * Gets or Sets requestType
     */
    public static final class RequestTypeEnum {

        /**
         * Enum REQUEST_TYPE_POST for value: "REQUEST_TYPE_POST"
         */
        public static final RequestTypeEnum REQUEST_TYPE_POST = new RequestTypeEnum("REQUEST_TYPE_POST");

        /**
         * Enum REQUEST_TYPE_GET for value: "REQUEST_TYPE_GET"
         */
        public static final RequestTypeEnum REQUEST_TYPE_GET = new RequestTypeEnum("REQUEST_TYPE_GET");

        private static final Map<String, RequestTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RequestTypeEnum> createStaticFields() {
            Map<String, RequestTypeEnum> map = new HashMap<>();
            map.put("REQUEST_TYPE_POST", REQUEST_TYPE_POST);
            map.put("REQUEST_TYPE_GET", REQUEST_TYPE_GET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RequestTypeEnum(String value) {
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
        public static RequestTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RequestTypeEnum(value));
        }

        public static RequestTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RequestTypeEnum) {
                return this.value.equals(((RequestTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_type")

    private RequestTypeEnum requestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * Gets or Sets visibility
     */
    public static final class VisibilityEnum {

        /**
         * Enum WORKSPACE for value: "WORKSPACE"
         */
        public static final VisibilityEnum WORKSPACE = new VisibilityEnum("WORKSPACE");

        /**
         * Enum PROJECT for value: "PROJECT"
         */
        public static final VisibilityEnum PROJECT = new VisibilityEnum("PROJECT");

        /**
         * Enum DOMAIN for value: "DOMAIN"
         */
        public static final VisibilityEnum DOMAIN = new VisibilityEnum("DOMAIN");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("WORKSPACE", WORKSPACE);
            map.put("PROJECT", PROJECT);
            map.put("DOMAIN", DOMAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    /**
     * Gets or Sets publishType
     */
    public static final class PublishTypeEnum {

        /**
         * Enum PUBLISH_TYPE_PUBLIC for value: "PUBLISH_TYPE_PUBLIC"
         */
        public static final PublishTypeEnum PUBLISH_TYPE_PUBLIC = new PublishTypeEnum("PUBLISH_TYPE_PUBLIC");

        /**
         * Enum PUBLISH_TYPE_PRIVATE for value: "PUBLISH_TYPE_PRIVATE"
         */
        public static final PublishTypeEnum PUBLISH_TYPE_PRIVATE = new PublishTypeEnum("PUBLISH_TYPE_PRIVATE");

        private static final Map<String, PublishTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublishTypeEnum> createStaticFields() {
            Map<String, PublishTypeEnum> map = new HashMap<>();
            map.put("PUBLISH_TYPE_PUBLIC", PUBLISH_TYPE_PUBLIC);
            map.put("PUBLISH_TYPE_PRIVATE", PUBLISH_TYPE_PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublishTypeEnum(String value) {
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
        public static PublishTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublishTypeEnum(value));
        }

        public static PublishTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublishTypeEnum) {
                return this.value.equals(((PublishTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_type")

    private PublishTypeEnum publishType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask_switch")

    private Boolean dataMaskSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask_paras")

    private List<DataMaskParas> dataMaskParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_config_list")

    private List<DatasourceConfig> datasourceConfigList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groovy_content")

    private String groovyContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_paras")

    private List<RequestPara> requestParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_config")

    private DatasourceConfig datasourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_config")

    private BackendConfig backendConfig;

    public Api withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * 目录ID
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public Api withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * api 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Api withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * api 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Api withLogFlag(Boolean logFlag) {
        this.logFlag = logFlag;
        return this;
    }

    /**
     * 是否启用访问日志
     * @return logFlag
     */
    public Boolean getLogFlag() {
        return logFlag;
    }

    public void setLogFlag(Boolean logFlag) {
        this.logFlag = logFlag;
    }

    public Api withApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * Get apiType
     * @return apiType
     */
    public ApiTypeEnum getApiType() {
        return apiType;
    }

    public void setApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
    }

    public Api withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public Api withRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * 最低保留期限，单位小时。
     * @return retentionPeriod
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Api withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * API审核人。
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Api withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * API路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Api withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public Api withRequestType(RequestTypeEnum requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * Get requestType
     * @return requestType
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestTypeEnum requestType) {
        this.requestType = requestType;
    }

    public Api withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Api addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Api withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Api withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public Api withPublishType(PublishTypeEnum publishType) {
        this.publishType = publishType;
        return this;
    }

    /**
     * Get publishType
     * @return publishType
     */
    public PublishTypeEnum getPublishType() {
        return publishType;
    }

    public void setPublishType(PublishTypeEnum publishType) {
        this.publishType = publishType;
    }

    public Api withDataMaskSwitch(Boolean dataMaskSwitch) {
        this.dataMaskSwitch = dataMaskSwitch;
        return this;
    }

    /**
     * 数据脱敏开关。
     * @return dataMaskSwitch
     */
    public Boolean getDataMaskSwitch() {
        return dataMaskSwitch;
    }

    public void setDataMaskSwitch(Boolean dataMaskSwitch) {
        this.dataMaskSwitch = dataMaskSwitch;
    }

    public Api withDataMaskParas(List<DataMaskParas> dataMaskParas) {
        this.dataMaskParas = dataMaskParas;
        return this;
    }

    public Api addDataMaskParasItem(DataMaskParas dataMaskParasItem) {
        if (this.dataMaskParas == null) {
            this.dataMaskParas = new ArrayList<>();
        }
        this.dataMaskParas.add(dataMaskParasItem);
        return this;
    }

    public Api withDataMaskParas(Consumer<List<DataMaskParas>> dataMaskParasSetter) {
        if (this.dataMaskParas == null) {
            this.dataMaskParas = new ArrayList<>();
        }
        dataMaskParasSetter.accept(this.dataMaskParas);
        return this;
    }

    /**
     * 数据脱敏配置。
     * @return dataMaskParas
     */
    public List<DataMaskParas> getDataMaskParas() {
        return dataMaskParas;
    }

    public void setDataMaskParas(List<DataMaskParas> dataMaskParas) {
        this.dataMaskParas = dataMaskParas;
    }

    public Api withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 请求体内容描述，仅注册类API使用。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Api withDatasourceConfigList(List<DatasourceConfig> datasourceConfigList) {
        this.datasourceConfigList = datasourceConfigList;
        return this;
    }

    public Api addDatasourceConfigListItem(DatasourceConfig datasourceConfigListItem) {
        if (this.datasourceConfigList == null) {
            this.datasourceConfigList = new ArrayList<>();
        }
        this.datasourceConfigList.add(datasourceConfigListItem);
        return this;
    }

    public Api withDatasourceConfigList(Consumer<List<DatasourceConfig>> datasourceConfigListSetter) {
        if (this.datasourceConfigList == null) {
            this.datasourceConfigList = new ArrayList<>();
        }
        datasourceConfigListSetter.accept(this.datasourceConfigList);
        return this;
    }

    /**
     * 多数据源配置信息，仅Groovy类API使用。
     * @return datasourceConfigList
     */
    public List<DatasourceConfig> getDatasourceConfigList() {
        return datasourceConfigList;
    }

    public void setDatasourceConfigList(List<DatasourceConfig> datasourceConfigList) {
        this.datasourceConfigList = datasourceConfigList;
    }

    public Api withGroovyContent(String groovyContent) {
        this.groovyContent = groovyContent;
        return this;
    }

    /**
     * Groovy文本，仅Groovy类API使用。
     * @return groovyContent
     */
    public String getGroovyContent() {
        return groovyContent;
    }

    public void setGroovyContent(String groovyContent) {
        this.groovyContent = groovyContent;
    }

    public Api withRequestParas(List<RequestPara> requestParas) {
        this.requestParas = requestParas;
        return this;
    }

    public Api addRequestParasItem(RequestPara requestParasItem) {
        if (this.requestParas == null) {
            this.requestParas = new ArrayList<>();
        }
        this.requestParas.add(requestParasItem);
        return this;
    }

    public Api withRequestParas(Consumer<List<RequestPara>> requestParasSetter) {
        if (this.requestParas == null) {
            this.requestParas = new ArrayList<>();
        }
        requestParasSetter.accept(this.requestParas);
        return this;
    }

    /**
     * API请求参数列表。
     * @return requestParas
     */
    public List<RequestPara> getRequestParas() {
        return requestParas;
    }

    public void setRequestParas(List<RequestPara> requestParas) {
        this.requestParas = requestParas;
    }

    public Api withDatasourceConfig(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
        return this;
    }

    public Api withDatasourceConfig(Consumer<DatasourceConfig> datasourceConfigSetter) {
        if (this.datasourceConfig == null) {
            this.datasourceConfig = new DatasourceConfig();
            datasourceConfigSetter.accept(this.datasourceConfig);
        }

        return this;
    }

    /**
     * Get datasourceConfig
     * @return datasourceConfig
     */
    public DatasourceConfig getDatasourceConfig() {
        return datasourceConfig;
    }

    public void setDatasourceConfig(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
    }

    public Api withBackendConfig(BackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }

    public Api withBackendConfig(Consumer<BackendConfig> backendConfigSetter) {
        if (this.backendConfig == null) {
            this.backendConfig = new BackendConfig();
            backendConfigSetter.accept(this.backendConfig);
        }

        return this;
    }

    /**
     * Get backendConfig
     * @return backendConfig
     */
    public BackendConfig getBackendConfig() {
        return backendConfig;
    }

    public void setBackendConfig(BackendConfig backendConfig) {
        this.backendConfig = backendConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Api that = (Api) obj;
        return Objects.equals(this.catalogId, that.catalogId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.logFlag, that.logFlag)
            && Objects.equals(this.apiType, that.apiType) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.retentionPeriod, that.retentionPeriod) && Objects.equals(this.manager, that.manager)
            && Objects.equals(this.path, that.path) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.requestType, that.requestType) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.visibility, that.visibility) && Objects.equals(this.publishType, that.publishType)
            && Objects.equals(this.dataMaskSwitch, that.dataMaskSwitch)
            && Objects.equals(this.dataMaskParas, that.dataMaskParas) && Objects.equals(this.body, that.body)
            && Objects.equals(this.datasourceConfigList, that.datasourceConfigList)
            && Objects.equals(this.groovyContent, that.groovyContent)
            && Objects.equals(this.requestParas, that.requestParas)
            && Objects.equals(this.datasourceConfig, that.datasourceConfig)
            && Objects.equals(this.backendConfig, that.backendConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId,
            name,
            description,
            logFlag,
            apiType,
            authType,
            retentionPeriod,
            manager,
            path,
            protocol,
            requestType,
            tags,
            visibility,
            publishType,
            dataMaskSwitch,
            dataMaskParas,
            body,
            datasourceConfigList,
            groovyContent,
            requestParas,
            datasourceConfig,
            backendConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Api {\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logFlag: ").append(toIndentedString(logFlag)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    publishType: ").append(toIndentedString(publishType)).append("\n");
        sb.append("    dataMaskSwitch: ").append(toIndentedString(dataMaskSwitch)).append("\n");
        sb.append("    dataMaskParas: ").append(toIndentedString(dataMaskParas)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    datasourceConfigList: ").append(toIndentedString(datasourceConfigList)).append("\n");
        sb.append("    groovyContent: ").append(toIndentedString(groovyContent)).append("\n");
        sb.append("    requestParas: ").append(toIndentedString(requestParas)).append("\n");
        sb.append("    datasourceConfig: ").append(toIndentedString(datasourceConfig)).append("\n");
        sb.append("    backendConfig: ").append(toIndentedString(backendConfig)).append("\n");
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

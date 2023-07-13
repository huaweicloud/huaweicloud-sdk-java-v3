package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * API 访问协议
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
     * 发布类型，公开或者私有
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
    @JsonProperty(value = "log_flag")

    private Boolean logFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private InstanceHostDTO hosts;

    /**
     * API访问方式
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
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    /**
     * API的状态
     */
    public static final class StatusEnum {

        /**
         * Enum API_STATUS_CREATED for value: "API_STATUS_CREATED"
         */
        public static final StatusEnum API_STATUS_CREATED = new StatusEnum("API_STATUS_CREATED");

        /**
         * Enum API_STATUS_PUBLISH_WAIT_REVIEW for value: "API_STATUS_PUBLISH_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_PUBLISH_WAIT_REVIEW =
            new StatusEnum("API_STATUS_PUBLISH_WAIT_REVIEW");

        /**
         * Enum API_STATUS_PUBLISH_REJECT for value: "API_STATUS_PUBLISH_REJECT"
         */
        public static final StatusEnum API_STATUS_PUBLISH_REJECT = new StatusEnum("API_STATUS_PUBLISH_REJECT");

        /**
         * Enum API_STATUS_PUBLISHED for value: "API_STATUS_PUBLISHED"
         */
        public static final StatusEnum API_STATUS_PUBLISHED = new StatusEnum("API_STATUS_PUBLISHED");

        /**
         * Enum API_STATUS_WAITING_STOP for value: "API_STATUS_WAITING_STOP"
         */
        public static final StatusEnum API_STATUS_WAITING_STOP = new StatusEnum("API_STATUS_WAITING_STOP");

        /**
         * Enum API_STATUS_STOPPED for value: "API_STATUS_STOPPED"
         */
        public static final StatusEnum API_STATUS_STOPPED = new StatusEnum("API_STATUS_STOPPED");

        /**
         * Enum API_STATUS_RECOVER_WAIT_REVIEW for value: "API_STATUS_RECOVER_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_RECOVER_WAIT_REVIEW =
            new StatusEnum("API_STATUS_RECOVER_WAIT_REVIEW");

        /**
         * Enum API_STATUS_WAITING_OFFLINE for value: "API_STATUS_WAITING_OFFLINE"
         */
        public static final StatusEnum API_STATUS_WAITING_OFFLINE = new StatusEnum("API_STATUS_WAITING_OFFLINE");

        /**
         * Enum API_STATUS_OFFLINE for value: "API_STATUS_OFFLINE"
         */
        public static final StatusEnum API_STATUS_OFFLINE = new StatusEnum("API_STATUS_OFFLINE");

        /**
         * Enum API_STATUS_OFFLINE_WAIT_REVIEW for value: "API_STATUS_OFFLINE_WAIT_REVIEW"
         */
        public static final StatusEnum API_STATUS_OFFLINE_WAIT_REVIEW =
            new StatusEnum("API_STATUS_OFFLINE_WAIT_REVIEW");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("API_STATUS_CREATED", API_STATUS_CREATED);
            map.put("API_STATUS_PUBLISH_WAIT_REVIEW", API_STATUS_PUBLISH_WAIT_REVIEW);
            map.put("API_STATUS_PUBLISH_REJECT", API_STATUS_PUBLISH_REJECT);
            map.put("API_STATUS_PUBLISHED", API_STATUS_PUBLISHED);
            map.put("API_STATUS_WAITING_STOP", API_STATUS_WAITING_STOP);
            map.put("API_STATUS_STOPPED", API_STATUS_STOPPED);
            map.put("API_STATUS_RECOVER_WAIT_REVIEW", API_STATUS_RECOVER_WAIT_REVIEW);
            map.put("API_STATUS_WAITING_OFFLINE", API_STATUS_WAITING_OFFLINE);
            map.put("API_STATUS_OFFLINE", API_STATUS_OFFLINE);
            map.put("API_STATUS_OFFLINE_WAIT_REVIEW", API_STATUS_OFFLINE_WAIT_REVIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * API 类型
     */
    public static final class TypeEnum {

        /**
         * Enum API_SPECIFIC_TYPE_CONFIGURATION for value: "API_SPECIFIC_TYPE_CONFIGURATION"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_CONFIGURATION = new TypeEnum("API_SPECIFIC_TYPE_CONFIGURATION");

        /**
         * Enum API_SPECIFIC_TYPE_SCRIPT for value: "API_SPECIFIC_TYPE_SCRIPT"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_SCRIPT = new TypeEnum("API_SPECIFIC_TYPE_SCRIPT");

        /**
         * Enum API_SPECIFIC_TYPE_REGISTER for value: "API_SPECIFIC_TYPE_REGISTER"
         */
        public static final TypeEnum API_SPECIFIC_TYPE_REGISTER = new TypeEnum("API_SPECIFIC_TYPE_REGISTER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("API_SPECIFIC_TYPE_CONFIGURATION", API_SPECIFIC_TYPE_CONFIGURATION);
            map.put("API_SPECIFIC_TYPE_SCRIPT", API_SPECIFIC_TYPE_SCRIPT);
            map.put("API_SPECIFIC_TYPE_REGISTER", API_SPECIFIC_TYPE_REGISTER);
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
     * API调试状态
     */
    public static final class DebugStatusEnum {

        /**
         * Enum API_DEBUG_WAITING for value: "API_DEBUG_WAITING"
         */
        public static final DebugStatusEnum API_DEBUG_WAITING = new DebugStatusEnum("API_DEBUG_WAITING");

        /**
         * Enum API_DEBUG_FAILED for value: "API_DEBUG_FAILED"
         */
        public static final DebugStatusEnum API_DEBUG_FAILED = new DebugStatusEnum("API_DEBUG_FAILED");

        /**
         * Enum API_DEBUG_SUCCESS for value: "API_DEBUG_SUCCESS"
         */
        public static final DebugStatusEnum API_DEBUG_SUCCESS = new DebugStatusEnum("API_DEBUG_SUCCESS");

        private static final Map<String, DebugStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DebugStatusEnum> createStaticFields() {
            Map<String, DebugStatusEnum> map = new HashMap<>();
            map.put("API_DEBUG_WAITING", API_DEBUG_WAITING);
            map.put("API_DEBUG_FAILED", API_DEBUG_FAILED);
            map.put("API_DEBUG_SUCCESS", API_DEBUG_SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DebugStatusEnum(String value) {
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
        public static DebugStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DebugStatusEnum(value));
        }

        public static DebugStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DebugStatusEnum) {
                return this.value.equals(((DebugStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_status")

    private DebugStatusEnum debugStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_paras")

    private List<RequestPara> requestParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_config")

    private DatasourceConfig datasourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_config")

    private BackendConfig backendConfig;

    public ShowApiResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowApiResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowApiResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API所属分组的ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowApiResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * API 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowApiResponse withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * API 访问协议
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ShowApiResponse withPublishType(PublishTypeEnum publishType) {
        this.publishType = publishType;
        return this;
    }

    /**
     * 发布类型，公开或者私有
     * @return publishType
     */
    public PublishTypeEnum getPublishType() {
        return publishType;
    }

    public void setPublishType(PublishTypeEnum publishType) {
        this.publishType = publishType;
    }

    public ShowApiResponse withLogFlag(Boolean logFlag) {
        this.logFlag = logFlag;
        return this;
    }

    /**
     * 是否开启日志记录
     * @return logFlag
     */
    public Boolean getLogFlag() {
        return logFlag;
    }

    public void setLogFlag(Boolean logFlag) {
        this.logFlag = logFlag;
    }

    public ShowApiResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * API的访问路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowApiResponse withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 共享版域名
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowApiResponse withHosts(InstanceHostDTO hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowApiResponse withHosts(Consumer<InstanceHostDTO> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new InstanceHostDTO();
            hostsSetter.accept(this.hosts);
        }

        return this;
    }

    /**
     * Get hosts
     * @return hosts
     */
    public InstanceHostDTO getHosts() {
        return hosts;
    }

    public void setHosts(InstanceHostDTO hosts) {
        this.hosts = hosts;
    }

    public ShowApiResponse withRequestType(RequestTypeEnum requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * API访问方式
     * @return requestType
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestTypeEnum requestType) {
        this.requestType = requestType;
    }

    public ShowApiResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * API创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowApiResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowApiResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowApiResponse withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * API 审核人名称
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ShowApiResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * API的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowApiResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * API 类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowApiResponse withDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
        return this;
    }

    /**
     * API调试状态
     * @return debugStatus
     */
    public DebugStatusEnum getDebugStatus() {
        return debugStatus;
    }

    public void setDebugStatus(DebugStatusEnum debugStatus) {
        this.debugStatus = debugStatus;
    }

    public ShowApiResponse withRequestParas(List<RequestPara> requestParas) {
        this.requestParas = requestParas;
        return this;
    }

    public ShowApiResponse addRequestParasItem(RequestPara requestParasItem) {
        if (this.requestParas == null) {
            this.requestParas = new ArrayList<>();
        }
        this.requestParas.add(requestParasItem);
        return this;
    }

    public ShowApiResponse withRequestParas(Consumer<List<RequestPara>> requestParasSetter) {
        if (this.requestParas == null) {
            this.requestParas = new ArrayList<>();
        }
        requestParasSetter.accept(this.requestParas);
        return this;
    }

    /**
     * API请求参数
     * @return requestParas
     */
    public List<RequestPara> getRequestParas() {
        return requestParas;
    }

    public void setRequestParas(List<RequestPara> requestParas) {
        this.requestParas = requestParas;
    }

    public ShowApiResponse withDatasourceConfig(DatasourceConfig datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
        return this;
    }

    public ShowApiResponse withDatasourceConfig(Consumer<DatasourceConfig> datasourceConfigSetter) {
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

    public ShowApiResponse withBackendConfig(BackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }

    public ShowApiResponse withBackendConfig(Consumer<BackendConfig> backendConfigSetter) {
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
        ShowApiResponse that = (ShowApiResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.publishType, that.publishType)
            && Objects.equals(this.logFlag, that.logFlag) && Objects.equals(this.path, that.path)
            && Objects.equals(this.host, that.host) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.requestType, that.requestType) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.manager, that.manager) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.debugStatus, that.debugStatus)
            && Objects.equals(this.requestParas, that.requestParas)
            && Objects.equals(this.datasourceConfig, that.datasourceConfig)
            && Objects.equals(this.backendConfig, that.backendConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            groupId,
            description,
            protocol,
            publishType,
            logFlag,
            path,
            host,
            hosts,
            requestType,
            createUser,
            createTime,
            updateTime,
            manager,
            status,
            type,
            debugStatus,
            requestParas,
            datasourceConfig,
            backendConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    publishType: ").append(toIndentedString(publishType)).append("\n");
        sb.append("    logFlag: ").append(toIndentedString(logFlag)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    debugStatus: ").append(toIndentedString(debugStatus)).append("\n");
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

package com.huaweicloud.sdk.cse.v1.model;

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
 * 查询微服务引擎列表引擎信息
 */
public class EngineSimpleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectName")

    private String enterpriseProjectName;

    /**
     * 微服务引擎专享版的类型，CSE为专享版引擎，CSE_Share表示为专业版引擎
     */
    public static final class TypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final TypeEnum CSE = new TypeEnum("CSE");

        /**
         * Enum CSE_SHARE for value: "CSE_Share"
         */
        public static final TypeEnum CSE_SHARE = new TypeEnum("CSE_Share");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("CSE_Share", CSE_SHARE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 微服务引擎专享版的规格
     */
    public static final class FlavorEnum {

        /**
         * Enum CSE_S1_SMALL2 for value: "cse.s1.small2"
         */
        public static final FlavorEnum CSE_S1_SMALL2 = new FlavorEnum("cse.s1.small2");

        /**
         * Enum CSE_S1_MEDIUM2 for value: "cse.s1.medium2"
         */
        public static final FlavorEnum CSE_S1_MEDIUM2 = new FlavorEnum("cse.s1.medium2");

        /**
         * Enum CSE_S1_LARGE2 for value: "cse.s1.large2"
         */
        public static final FlavorEnum CSE_S1_LARGE2 = new FlavorEnum("cse.s1.large2");

        /**
         * Enum CSE_S1_XLARGE2 for value: "cse.s1.xlarge2"
         */
        public static final FlavorEnum CSE_S1_XLARGE2 = new FlavorEnum("cse.s1.xlarge2");

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("cse.s1.small2", CSE_S1_SMALL2);
            map.put("cse.s1.medium2", CSE_S1_MEDIUM2);
            map.put("cse.s1.large2", CSE_S1_LARGE2);
            map.put("cse.s1.xlarge2", CSE_S1_XLARGE2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlavorEnum(String value) {
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
        public static FlavorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlavorEnum(value));
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlavorEnum) {
                return this.value.equals(((FlavorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorEnum flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment")

    private String payment;

    /**
     * 微服务引擎专享版的认证方式，RBAC/NONE
     */
    public static final class AuthTypeEnum {

        /**
         * Enum RBAC for value: "RBAC"
         */
        public static final AuthTypeEnum RBAC = new AuthTypeEnum("RBAC");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("RBAC", RBAC);
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
    @JsonProperty(value = "authType")

    private AuthTypeEnum authType;

    /**
     * 微服务引擎专享版当前的状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum AVAILABLE for value: "Available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("Available");

        /**
         * Enum UNAVAILABLE for value: "Unavailable"
         */
        public static final StatusEnum UNAVAILABLE = new StatusEnum("Unavailable");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum DELETED for value: "Deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("Deleted");

        /**
         * Enum UPGRADING for value: "Upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("Upgrading");

        /**
         * Enum MODIFYING for value: "Modifying"
         */
        public static final StatusEnum MODIFYING = new StatusEnum("Modifying");

        /**
         * Enum CREATEFAILED for value: "CreateFailed"
         */
        public static final StatusEnum CREATEFAILED = new StatusEnum("CreateFailed");

        /**
         * Enum DELETEFAILED for value: "DeleteFailed"
         */
        public static final StatusEnum DELETEFAILED = new StatusEnum("DeleteFailed");

        /**
         * Enum UPGRADEFAILED for value: "UpgradeFailed"
         */
        public static final StatusEnum UPGRADEFAILED = new StatusEnum("UpgradeFailed");

        /**
         * Enum MODIFYFAILED for value: "ModifyFailed"
         */
        public static final StatusEnum MODIFYFAILED = new StatusEnum("ModifyFailed");

        /**
         * Enum FREEZED for value: "Freezed"
         */
        public static final StatusEnum FREEZED = new StatusEnum("Freezed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Creating", CREATING);
            map.put("Available", AVAILABLE);
            map.put("Unavailable", UNAVAILABLE);
            map.put("Deleting", DELETING);
            map.put("Deleted", DELETED);
            map.put("Upgrading", UPGRADING);
            map.put("Modifying", MODIFYING);
            map.put("CreateFailed", CREATEFAILED);
            map.put("DeleteFailed", DELETEFAILED);
            map.put("UpgradeFailed", UPGRADEFAILED);
            map.put("ModifyFailed", MODIFYFAILED);
            map.put("Freezed", FREEZED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externalAddress")

    private String externalAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceEndpoint")

    private Map<String, EntrypointItem> serviceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicAddress")

    private String publicAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicServiceEndpoint")

    private Map<String, EntrypointItem> publicServiceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalInstance")

    private Integer totalInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedInstance")

    private Integer usedInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableInstance")

    private Integer availableInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestVersion")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dueTo")

    private Long dueTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestJobId")

    private Integer latestJobId;

    /**
     * Gets or Sets engineAdditionalActions
     */
    public static final class EngineAdditionalActionsEnum {

        /**
         * Enum NOTING for value: "Noting"
         */
        public static final EngineAdditionalActionsEnum NOTING = new EngineAdditionalActionsEnum("Noting");

        /**
         * Enum FORCEDELETE for value: "ForceDelete"
         */
        public static final EngineAdditionalActionsEnum FORCEDELETE = new EngineAdditionalActionsEnum("ForceDelete");

        /**
         * Enum ROLLBACK for value: "Rollback"
         */
        public static final EngineAdditionalActionsEnum ROLLBACK = new EngineAdditionalActionsEnum("Rollback");

        /**
         * Enum RETRY for value: "Retry"
         */
        public static final EngineAdditionalActionsEnum RETRY = new EngineAdditionalActionsEnum("Retry");

        private static final Map<String, EngineAdditionalActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineAdditionalActionsEnum> createStaticFields() {
            Map<String, EngineAdditionalActionsEnum> map = new HashMap<>();
            map.put("Noting", NOTING);
            map.put("ForceDelete", FORCEDELETE);
            map.put("Rollback", ROLLBACK);
            map.put("Retry", RETRY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineAdditionalActionsEnum(String value) {
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
        public static EngineAdditionalActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new EngineAdditionalActionsEnum(value));
        }

        public static EngineAdditionalActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineAdditionalActionsEnum) {
                return this.value.equals(((EngineAdditionalActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engineAdditionalActions")

    private List<EngineAdditionalActionsEnum> engineAdditionalActions = null;

    /**
     * 微服务引擎专享版应用部署类型
     */
    public static final class SpecTypeEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final SpecTypeEnum CCE = new SpecTypeEnum("CCE");

        /**
         * Enum CSE for value: "CSE"
         */
        public static final SpecTypeEnum CSE = new SpecTypeEnum("CSE");

        /**
         * Enum SPRINGCLOUD for value: "SpringCloud"
         */
        public static final SpecTypeEnum SPRINGCLOUD = new SpecTypeEnum("SpringCloud");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("CSE", CSE);
            map.put("SpringCloud", SPRINGCLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecTypeEnum(String value) {
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
        public static SpecTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecTypeEnum(value));
        }

        public static SpecTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecTypeEnum) {
                return this.value.equals(((SpecTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specType")

    private SpecTypeEnum specType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private EngineReference reference;

    public EngineSimpleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 微服务引擎专享版的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EngineSimpleInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引擎的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngineSimpleInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 微服务引擎专享版所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EngineSimpleInfo withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 微服务引擎专享版所属企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public EngineSimpleInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 微服务引擎专享版的类型，CSE为专享版引擎，CSE_Share表示为专业版引擎
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EngineSimpleInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 微服务引擎专享版的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineSimpleInfo withFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 微服务引擎专享版的规格
     * @return flavor
     */
    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }

    public EngineSimpleInfo withPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * 微服务引擎专享版的计费方式，0表示包周期，1表示按需，2表示免费
     * @return payment
     */
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public EngineSimpleInfo withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 微服务引擎专享版的认证方式，RBAC/NONE
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public EngineSimpleInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 微服务引擎专享版当前的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public EngineSimpleInfo withExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
        return this;
    }

    /**
     * 微服务引擎专享版暴露的IP地址
     * @return externalAddress
     */
    public String getExternalAddress() {
        return externalAddress;
    }

    public void setExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
    }

    public EngineSimpleInfo withServiceEndpoint(Map<String, EntrypointItem> serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    public EngineSimpleInfo putServiceEndpointItem(String key, EntrypointItem serviceEndpointItem) {
        if (this.serviceEndpoint == null) {
            this.serviceEndpoint = new HashMap<>();
        }
        this.serviceEndpoint.put(key, serviceEndpointItem);
        return this;
    }

    public EngineSimpleInfo withServiceEndpoint(Consumer<Map<String, EntrypointItem>> serviceEndpointSetter) {
        if (this.serviceEndpoint == null) {
            this.serviceEndpoint = new HashMap<>();
        }
        serviceEndpointSetter.accept(this.serviceEndpoint);
        return this;
    }

    /**
     * 微服务引擎专享版组件的访问地址。
     * @return serviceEndpoint
     */
    public Map<String, EntrypointItem> getServiceEndpoint() {
        return serviceEndpoint;
    }

    public void setServiceEndpoint(Map<String, EntrypointItem> serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    public EngineSimpleInfo withPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
        return this;
    }

    /**
     * 微服务引擎专享版的公网IP地址
     * @return publicAddress
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    public EngineSimpleInfo withPublicServiceEndpoint(Map<String, EntrypointItem> publicServiceEndpoint) {
        this.publicServiceEndpoint = publicServiceEndpoint;
        return this;
    }

    public EngineSimpleInfo putPublicServiceEndpointItem(String key, EntrypointItem publicServiceEndpointItem) {
        if (this.publicServiceEndpoint == null) {
            this.publicServiceEndpoint = new HashMap<>();
        }
        this.publicServiceEndpoint.put(key, publicServiceEndpointItem);
        return this;
    }

    public EngineSimpleInfo withPublicServiceEndpoint(
        Consumer<Map<String, EntrypointItem>> publicServiceEndpointSetter) {
        if (this.publicServiceEndpoint == null) {
            this.publicServiceEndpoint = new HashMap<>();
        }
        publicServiceEndpointSetter.accept(this.publicServiceEndpoint);
        return this;
    }

    /**
     * 微服务引擎专享版的公网接入地址
     * @return publicServiceEndpoint
     */
    public Map<String, EntrypointItem> getPublicServiceEndpoint() {
        return publicServiceEndpoint;
    }

    public void setPublicServiceEndpoint(Map<String, EntrypointItem> publicServiceEndpoint) {
        this.publicServiceEndpoint = publicServiceEndpoint;
    }

    public EngineSimpleInfo withTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
        return this;
    }

    /**
     * 微服务引擎专享版可支持的实例总数
     * @return totalInstance
     */
    public Integer getTotalInstance() {
        return totalInstance;
    }

    public void setTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
    }

    public EngineSimpleInfo withUsedInstance(Integer usedInstance) {
        this.usedInstance = usedInstance;
        return this;
    }

    /**
     * 已使用的实例总数
     * @return usedInstance
     */
    public Integer getUsedInstance() {
        return usedInstance;
    }

    public void setUsedInstance(Integer usedInstance) {
        this.usedInstance = usedInstance;
    }

    public EngineSimpleInfo withAvailableInstance(Integer availableInstance) {
        this.availableInstance = availableInstance;
        return this;
    }

    /**
     * 可用实例总数
     * @return availableInstance
     */
    public Integer getAvailableInstance() {
        return availableInstance;
    }

    public void setAvailableInstance(Integer availableInstance) {
        this.availableInstance = availableInstance;
    }

    public EngineSimpleInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微服务引擎专享版当前版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public EngineSimpleInfo withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 微服务引擎专享版最新版本
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public EngineSimpleInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 微服务引擎专享版创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public EngineSimpleInfo withDueTo(Long dueTo) {
        this.dueTo = dueTo;
        return this;
    }

    /**
     * 微服务引擎专享版到期时间
     * @return dueTo
     */
    public Long getDueTo() {
        return dueTo;
    }

    public void setDueTo(Long dueTo) {
        this.dueTo = dueTo;
    }

    public EngineSimpleInfo withLatestJobId(Integer latestJobId) {
        this.latestJobId = latestJobId;
        return this;
    }

    /**
     * 微服务引擎专享版最近的任务ID
     * @return latestJobId
     */
    public Integer getLatestJobId() {
        return latestJobId;
    }

    public void setLatestJobId(Integer latestJobId) {
        this.latestJobId = latestJobId;
    }

    public EngineSimpleInfo withEngineAdditionalActions(List<EngineAdditionalActionsEnum> engineAdditionalActions) {
        this.engineAdditionalActions = engineAdditionalActions;
        return this;
    }

    public EngineSimpleInfo addEngineAdditionalActionsItem(EngineAdditionalActionsEnum engineAdditionalActionsItem) {
        if (this.engineAdditionalActions == null) {
            this.engineAdditionalActions = new ArrayList<>();
        }
        this.engineAdditionalActions.add(engineAdditionalActionsItem);
        return this;
    }

    public EngineSimpleInfo withEngineAdditionalActions(
        Consumer<List<EngineAdditionalActionsEnum>> engineAdditionalActionsSetter) {
        if (this.engineAdditionalActions == null) {
            this.engineAdditionalActions = new ArrayList<>();
        }
        engineAdditionalActionsSetter.accept(this.engineAdditionalActions);
        return this;
    }

    /**
     * 微服务引擎专享版允许的附加操作
     * @return engineAdditionalActions
     */
    public List<EngineAdditionalActionsEnum> getEngineAdditionalActions() {
        return engineAdditionalActions;
    }

    public void setEngineAdditionalActions(List<EngineAdditionalActionsEnum> engineAdditionalActions) {
        this.engineAdditionalActions = engineAdditionalActions;
    }

    public EngineSimpleInfo withSpecType(SpecTypeEnum specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 微服务引擎专享版应用部署类型
     * @return specType
     */
    public SpecTypeEnum getSpecType() {
        return specType;
    }

    public void setSpecType(SpecTypeEnum specType) {
        this.specType = specType;
    }

    public EngineSimpleInfo withReference(EngineReference reference) {
        this.reference = reference;
        return this;
    }

    public EngineSimpleInfo withReference(Consumer<EngineReference> referenceSetter) {
        if (this.reference == null) {
            this.reference = new EngineReference();
            referenceSetter.accept(this.reference);
        }

        return this;
    }

    /**
     * Get reference
     * @return reference
     */
    public EngineReference getReference() {
        return reference;
    }

    public void setReference(EngineReference reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineSimpleInfo that = (EngineSimpleInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.payment, that.payment)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.externalAddress, that.externalAddress)
            && Objects.equals(this.serviceEndpoint, that.serviceEndpoint)
            && Objects.equals(this.publicAddress, that.publicAddress)
            && Objects.equals(this.publicServiceEndpoint, that.publicServiceEndpoint)
            && Objects.equals(this.totalInstance, that.totalInstance)
            && Objects.equals(this.usedInstance, that.usedInstance)
            && Objects.equals(this.availableInstance, that.availableInstance)
            && Objects.equals(this.version, that.version) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.dueTo, that.dueTo)
            && Objects.equals(this.latestJobId, that.latestJobId)
            && Objects.equals(this.engineAdditionalActions, that.engineAdditionalActions)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            enterpriseProjectId,
            enterpriseProjectName,
            type,
            description,
            flavor,
            payment,
            authType,
            status,
            externalAddress,
            serviceEndpoint,
            publicAddress,
            publicServiceEndpoint,
            totalInstance,
            usedInstance,
            availableInstance,
            version,
            latestVersion,
            createTime,
            dueTo,
            latestJobId,
            engineAdditionalActions,
            specType,
            reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineSimpleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    externalAddress: ").append(toIndentedString(externalAddress)).append("\n");
        sb.append("    serviceEndpoint: ").append(toIndentedString(serviceEndpoint)).append("\n");
        sb.append("    publicAddress: ").append(toIndentedString(publicAddress)).append("\n");
        sb.append("    publicServiceEndpoint: ").append(toIndentedString(publicServiceEndpoint)).append("\n");
        sb.append("    totalInstance: ").append(toIndentedString(totalInstance)).append("\n");
        sb.append("    usedInstance: ").append(toIndentedString(usedInstance)).append("\n");
        sb.append("    availableInstance: ").append(toIndentedString(availableInstance)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dueTo: ").append(toIndentedString(dueTo)).append("\n");
        sb.append("    latestJobId: ").append(toIndentedString(latestJobId)).append("\n");
        sb.append("    engineAdditionalActions: ").append(toIndentedString(engineAdditionalActions)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

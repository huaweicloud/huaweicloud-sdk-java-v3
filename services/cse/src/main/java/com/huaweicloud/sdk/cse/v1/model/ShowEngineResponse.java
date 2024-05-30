package com.huaweicloud.sdk.cse.v1.model;

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
public class ShowEngineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 微服务引擎认证类型
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment")

    private String payment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestVersion")

    private String latestVersion;

    /**
     * 微服务引擎状态
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
    @JsonProperty(value = "beDefault")

    private Boolean beDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createUser")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cceSpec")

    private Spec cceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externalEntrypoint")

    private EngineExternalEntrypoint externalEntrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private EngineReference reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestJobId")

    private Integer latestJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectName")

    private String enterpriseProjectName;

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
     * 微服务引擎应用部署类型
     */
    public static final class SpecTypeEnum {

        /**
         * Enum CSE2 for value: "CSE2"
         */
        public static final SpecTypeEnum CSE2 = new SpecTypeEnum("CSE2");

        /**
         * Enum NACOS2 for value: "Nacos2"
         */
        public static final SpecTypeEnum NACOS2 = new SpecTypeEnum("Nacos2");

        /**
         * Enum MICROGATEWAY for value: "MicroGateway"
         */
        public static final SpecTypeEnum MICROGATEWAY = new SpecTypeEnum("MicroGateway");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("CSE2", CSE2);
            map.put("Nacos2", NACOS2);
            map.put("MicroGateway", MICROGATEWAY);
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

    /**
     * 微服务引擎类型，CSE表示专享版，NACOS表示注册配置中心，MICROGATEWAY表示网关
     */
    public static final class TypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final TypeEnum CSE = new TypeEnum("CSE");

        /**
         * Enum NACOS for value: "NACOS"
         */
        public static final TypeEnum NACOS = new TypeEnum("NACOS");

        /**
         * Enum MICROGATEWAY for value: "MICROGATEWAY"
         */
        public static final TypeEnum MICROGATEWAY = new TypeEnum("MICROGATEWAY");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("NACOS", NACOS);
            map.put("MICROGATEWAY", MICROGATEWAY);
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
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmIds")

    private List<String> vmIds = null;

    public ShowEngineResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 微服务引擎ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowEngineResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 微服务引擎名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowEngineResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 微服务引擎描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowEngineResponse withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 微服务引擎认证类型
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public ShowEngineResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 微服务引擎规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ShowEngineResponse withPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * 微服务引擎计费方式
     * @return payment
     */
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public ShowEngineResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微服务引擎当前版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowEngineResponse withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 微服务引擎最新版本
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ShowEngineResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 微服务引擎状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowEngineResponse withBeDefault(Boolean beDefault) {
        this.beDefault = beDefault;
        return this;
    }

    /**
     * engine 是否是默认引擎
     * @return beDefault
     */
    public Boolean getBeDefault() {
        return beDefault;
    }

    public void setBeDefault(Boolean beDefault) {
        this.beDefault = beDefault;
    }

    public ShowEngineResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 微服务引擎创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowEngineResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 微服务引擎创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowEngineResponse withCceSpec(Spec cceSpec) {
        this.cceSpec = cceSpec;
        return this;
    }

    public ShowEngineResponse withCceSpec(Consumer<Spec> cceSpecSetter) {
        if (this.cceSpec == null) {
            this.cceSpec = new Spec();
            cceSpecSetter.accept(this.cceSpec);
        }

        return this;
    }

    /**
     * Get cceSpec
     * @return cceSpec
     */
    public Spec getCceSpec() {
        return cceSpec;
    }

    public void setCceSpec(Spec cceSpec) {
        this.cceSpec = cceSpec;
    }

    public ShowEngineResponse withExternalEntrypoint(EngineExternalEntrypoint externalEntrypoint) {
        this.externalEntrypoint = externalEntrypoint;
        return this;
    }

    public ShowEngineResponse withExternalEntrypoint(Consumer<EngineExternalEntrypoint> externalEntrypointSetter) {
        if (this.externalEntrypoint == null) {
            this.externalEntrypoint = new EngineExternalEntrypoint();
            externalEntrypointSetter.accept(this.externalEntrypoint);
        }

        return this;
    }

    /**
     * Get externalEntrypoint
     * @return externalEntrypoint
     */
    public EngineExternalEntrypoint getExternalEntrypoint() {
        return externalEntrypoint;
    }

    public void setExternalEntrypoint(EngineExternalEntrypoint externalEntrypoint) {
        this.externalEntrypoint = externalEntrypoint;
    }

    public ShowEngineResponse withReference(EngineReference reference) {
        this.reference = reference;
        return this;
    }

    public ShowEngineResponse withReference(Consumer<EngineReference> referenceSetter) {
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

    public ShowEngineResponse withLatestJobId(Integer latestJobId) {
        this.latestJobId = latestJobId;
        return this;
    }

    /**
     * 微服务引擎最近的任务ID
     * @return latestJobId
     */
    public Integer getLatestJobId() {
        return latestJobId;
    }

    public void setLatestJobId(Integer latestJobId) {
        this.latestJobId = latestJobId;
    }

    public ShowEngineResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 微服务引擎所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowEngineResponse withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 微服务引擎所属企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ShowEngineResponse withEngineAdditionalActions(List<EngineAdditionalActionsEnum> engineAdditionalActions) {
        this.engineAdditionalActions = engineAdditionalActions;
        return this;
    }

    public ShowEngineResponse addEngineAdditionalActionsItem(EngineAdditionalActionsEnum engineAdditionalActionsItem) {
        if (this.engineAdditionalActions == null) {
            this.engineAdditionalActions = new ArrayList<>();
        }
        this.engineAdditionalActions.add(engineAdditionalActionsItem);
        return this;
    }

    public ShowEngineResponse withEngineAdditionalActions(
        Consumer<List<EngineAdditionalActionsEnum>> engineAdditionalActionsSetter) {
        if (this.engineAdditionalActions == null) {
            this.engineAdditionalActions = new ArrayList<>();
        }
        engineAdditionalActionsSetter.accept(this.engineAdditionalActions);
        return this;
    }

    /**
     * 微服务引擎允许的附加操作
     * @return engineAdditionalActions
     */
    public List<EngineAdditionalActionsEnum> getEngineAdditionalActions() {
        return engineAdditionalActions;
    }

    public void setEngineAdditionalActions(List<EngineAdditionalActionsEnum> engineAdditionalActions) {
        this.engineAdditionalActions = engineAdditionalActions;
    }

    public ShowEngineResponse withSpecType(SpecTypeEnum specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 微服务引擎应用部署类型
     * @return specType
     */
    public SpecTypeEnum getSpecType() {
        return specType;
    }

    public void setSpecType(SpecTypeEnum specType) {
        this.specType = specType;
    }

    public ShowEngineResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 微服务引擎类型，CSE表示专享版，NACOS表示注册配置中心，MICROGATEWAY表示网关
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowEngineResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 微服务引擎所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowEngineResponse withVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
        return this;
    }

    public ShowEngineResponse addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    public ShowEngineResponse withVmIds(Consumer<List<String>> vmIdsSetter) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<>();
        }
        vmIdsSetter.accept(this.vmIds);
        return this;
    }

    /**
     * 当前引擎在资源租户侧使用的虚拟机 id 列表
     * @return vmIds
     */
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEngineResponse that = (ShowEngineResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.payment, that.payment)
            && Objects.equals(this.version, that.version) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.status, that.status) && Objects.equals(this.beDefault, that.beDefault)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.cceSpec, that.cceSpec)
            && Objects.equals(this.externalEntrypoint, that.externalEntrypoint)
            && Objects.equals(this.reference, that.reference) && Objects.equals(this.latestJobId, that.latestJobId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.engineAdditionalActions, that.engineAdditionalActions)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.vmIds, that.vmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            authType,
            flavor,
            payment,
            version,
            latestVersion,
            status,
            beDefault,
            createUser,
            createTime,
            cceSpec,
            externalEntrypoint,
            reference,
            latestJobId,
            enterpriseProjectId,
            enterpriseProjectName,
            engineAdditionalActions,
            specType,
            type,
            projectId,
            vmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEngineResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beDefault: ").append(toIndentedString(beDefault)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cceSpec: ").append(toIndentedString(cceSpec)).append("\n");
        sb.append("    externalEntrypoint: ").append(toIndentedString(externalEntrypoint)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    latestJobId: ").append(toIndentedString(latestJobId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    engineAdditionalActions: ").append(toIndentedString(engineAdditionalActions)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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

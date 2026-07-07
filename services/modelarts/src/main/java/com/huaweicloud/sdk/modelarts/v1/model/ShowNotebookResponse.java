package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowNotebookResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private List<JobProgress> actionProgress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointsRes> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_spec")

    private NotebookCustomSpecRep customSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private Image image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lease")

    private Lease lease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    private Pool pool;

    /**
     * **参数解释**：实例状态。 **取值范围**：枚举类型，取值如下： - INIT：初始化 - CREATING：创建中 - STARTING：启动中 - STOPPING：停止中 - DELETING：删除中 - RUNNING：运行中 - STOPPED：已停止 - SNAPSHOTTING：快照中(保存镜像时的状态) - CREATE_FAILED：创建失败 - START_FAILED：启动失败 - DELETE_FAILED：删除失败 - ERROR：错误 - DELETED：已删除 - FROZEN：冻结
     */
    public static final class StatusEnum {

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum SNAPSHOTTING for value: "SNAPSHOTTING"
         */
        public static final StatusEnum SNAPSHOTTING = new StatusEnum("SNAPSHOTTING");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");

        /**
         * Enum START_FAILED for value: "START_FAILED"
         */
        public static final StatusEnum START_FAILED = new StatusEnum("START_FAILED");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StatusEnum STOPPING = new StatusEnum("STOPPING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CREATING", CREATING);
            map.put("DELETED", DELETED);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("DELETING", DELETING);
            map.put("ERROR", ERROR);
            map.put("FROZEN", FROZEN);
            map.put("INIT", INIT);
            map.put("RUNNING", RUNNING);
            map.put("SNAPSHOTTING", SNAPSHOTTING);
            map.put("STARTING", STARTING);
            map.put("START_FAILED", START_FAILED);
            map.put("STOPPED", STOPPED);
            map.put("STOPPING", STOPPING);
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
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private VolumeRes volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    /**
     * Gets or Sets billingItems
     */
    public static final class BillingItemsEnum {

        /**
         * Enum STORAGE for value: "STORAGE"
         */
        public static final BillingItemsEnum STORAGE = new BillingItemsEnum("STORAGE");

        /**
         * Enum COMPUTE for value: "COMPUTE"
         */
        public static final BillingItemsEnum COMPUTE = new BillingItemsEnum("COMPUTE");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final BillingItemsEnum ALL = new BillingItemsEnum("ALL");

        private static final Map<String, BillingItemsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BillingItemsEnum> createStaticFields() {
            Map<String, BillingItemsEnum> map = new HashMap<>();
            map.put("STORAGE", STORAGE);
            map.put("COMPUTE", COMPUTE);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BillingItemsEnum(String value) {
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
        public static BillingItemsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingItemsEnum(value));
        }

        public static BillingItemsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingItemsEnum) {
                return this.value.equals(((BillingItemsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_items")

    private List<BillingItemsEnum> billingItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UserResponse user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private AffinityType affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_user")

    private RunUserInfo runUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeResponse> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_vpc")

    private UserVpcResponse userVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_credentials")

    private Boolean isNeedCredentials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jupyter_version")

    private String jupyterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTagResponse> tags = null;

    public ShowNotebookResponse withActionProgress(List<JobProgress> actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    public ShowNotebookResponse addActionProgressItem(JobProgress actionProgressItem) {
        if (this.actionProgress == null) {
            this.actionProgress = new ArrayList<>();
        }
        this.actionProgress.add(actionProgressItem);
        return this;
    }

    public ShowNotebookResponse withActionProgress(Consumer<List<JobProgress>> actionProgressSetter) {
        if (this.actionProgress == null) {
            this.actionProgress = new ArrayList<>();
        }
        actionProgressSetter.accept(this.actionProgress);
        return this;
    }

    /**
     * **参数解释**：实例初始化进度。
     * @return actionProgress
     */
    public List<JobProgress> getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(List<JobProgress> actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ShowNotebookResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：实例描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowNotebookResponse withEndpoints(List<EndpointsRes> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ShowNotebookResponse addEndpointsItem(EndpointsRes endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ShowNotebookResponse withEndpoints(Consumer<List<EndpointsRes>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**：本地IDE（如PyCharm、VS Code）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
     * @return endpoints
     */
    public List<EndpointsRes> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointsRes> endpoints) {
        this.endpoints = endpoints;
    }

    public ShowNotebookResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释**：实例失败原因。 **取值范围**：不涉及。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ShowNotebookResponse withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：实例规格， 1.当用户选择系统规格时，返回值为系统规格码； 2.当用户创建实例时选择了自定义规格，则此字段会固定返回\"custom.flavor.spec.code\"。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ShowNotebookResponse withCustomSpec(NotebookCustomSpecRep customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public ShowNotebookResponse withCustomSpec(Consumer<NotebookCustomSpecRep> customSpecSetter) {
        if (this.customSpec == null) {
            this.customSpec = new NotebookCustomSpecRep();
            customSpecSetter.accept(this.customSpec);
        }

        return this;
    }

    /**
     * Get customSpec
     * @return customSpec
     */
    public NotebookCustomSpecRep getCustomSpec() {
        return customSpec;
    }

    public void setCustomSpec(NotebookCustomSpecRep customSpec) {
        this.customSpec = customSpec;
    }

    public ShowNotebookResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：实例ID。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNotebookResponse withImage(Image image) {
        this.image = image;
        return this;
    }

    public ShowNotebookResponse withImage(Consumer<Image> imageSetter) {
        if (this.image == null) {
            this.image = new Image();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ShowNotebookResponse withLease(Lease lease) {
        this.lease = lease;
        return this;
    }

    public ShowNotebookResponse withLease(Consumer<Lease> leaseSetter) {
        if (this.lease == null) {
            this.lease = new Lease();
            leaseSetter.accept(this.lease);
        }

        return this;
    }

    /**
     * Get lease
     * @return lease
     */
    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public ShowNotebookResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：实例名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNotebookResponse withPool(Pool pool) {
        this.pool = pool;
        return this;
    }

    public ShowNotebookResponse withPool(Consumer<Pool> poolSetter) {
        if (this.pool == null) {
            this.pool = new Pool();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public ShowNotebookResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：实例状态。 **取值范围**：枚举类型，取值如下： - INIT：初始化 - CREATING：创建中 - STARTING：启动中 - STOPPING：停止中 - DELETING：删除中 - RUNNING：运行中 - STOPPED：已停止 - SNAPSHOTTING：快照中(保存镜像时的状态) - CREATE_FAILED：创建失败 - START_FAILED：启动失败 - DELETE_FAILED：删除失败 - ERROR：错误 - DELETED：已删除 - FROZEN：冻结
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowNotebookResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数解释**：Notebook鉴权使用的token信息。 **取值范围**：不涉及。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ShowNotebookResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：实例访问的URL。 **取值范围**：不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowNotebookResponse withVolume(VolumeRes volume) {
        this.volume = volume;
        return this;
    }

    public ShowNotebookResponse withVolume(Consumer<VolumeRes> volumeSetter) {
        if (this.volume == null) {
            this.volume = new VolumeRes();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public VolumeRes getVolume() {
        return volume;
    }

    public void setVolume(VolumeRes volume) {
        this.volume = volume;
    }

    public ShowNotebookResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **取值范围**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowNotebookResponse withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释**：实例类别。 **取值范围**：枚举类型，取值如下： - DEFAULT：CodeLab免费规格实例，每个用户最多只能创建一个。 - NOTEBOOK：计费规格实例。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public ShowNotebookResponse withBillingItems(List<BillingItemsEnum> billingItems) {
        this.billingItems = billingItems;
        return this;
    }

    public ShowNotebookResponse addBillingItemsItem(BillingItemsEnum billingItemsItem) {
        if (this.billingItems == null) {
            this.billingItems = new ArrayList<>();
        }
        this.billingItems.add(billingItemsItem);
        return this;
    }

    public ShowNotebookResponse withBillingItems(Consumer<List<BillingItemsEnum>> billingItemsSetter) {
        if (this.billingItems == null) {
            this.billingItems = new ArrayList<>();
        }
        billingItemsSetter.accept(this.billingItems);
        return this;
    }

    /**
     * **参数解释**：计费资源类型。枚举类型，取值如下： - STORAGE：存储资源计费。 - COMPUTE：计算资源计费。 - ALL：所有计费类型。
     * @return billingItems
     */
    public List<BillingItemsEnum> getBillingItems() {
        return billingItems;
    }

    public void setBillingItems(List<BillingItemsEnum> billingItems) {
        this.billingItems = billingItems;
    }

    public ShowNotebookResponse withUser(UserResponse user) {
        this.user = user;
        return this;
    }

    public ShowNotebookResponse withUser(Consumer<UserResponse> userSetter) {
        if (this.user == null) {
            this.user = new UserResponse();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }

    public ShowNotebookResponse withAffinity(AffinityType affinity) {
        this.affinity = affinity;
        return this;
    }

    public ShowNotebookResponse withAffinity(Consumer<AffinityType> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new AffinityType();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public AffinityType getAffinity() {
        return affinity;
    }

    public void setAffinity(AffinityType affinity) {
        this.affinity = affinity;
    }

    public ShowNotebookResponse withRunUser(RunUserInfo runUser) {
        this.runUser = runUser;
        return this;
    }

    public ShowNotebookResponse withRunUser(Consumer<RunUserInfo> runUserSetter) {
        if (this.runUser == null) {
            this.runUser = new RunUserInfo();
            runUserSetter.accept(this.runUser);
        }

        return this;
    }

    /**
     * Get runUser
     * @return runUser
     */
    public RunUserInfo getRunUser() {
        return runUser;
    }

    public void setRunUser(RunUserInfo runUser) {
        this.runUser = runUser;
    }

    public ShowNotebookResponse withDataVolumes(List<VolumeResponse> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public ShowNotebookResponse addDataVolumesItem(VolumeResponse dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public ShowNotebookResponse withDataVolumes(Consumer<List<VolumeResponse>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：扩展存储信息
     * @return dataVolumes
     */
    public List<VolumeResponse> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeResponse> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public ShowNotebookResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**：实例所在节点ip。 **取值范围**：不涉及。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowNotebookResponse withUserVpc(UserVpcResponse userVpc) {
        this.userVpc = userVpc;
        return this;
    }

    public ShowNotebookResponse withUserVpc(Consumer<UserVpcResponse> userVpcSetter) {
        if (this.userVpc == null) {
            this.userVpc = new UserVpcResponse();
            userVpcSetter.accept(this.userVpc);
        }

        return this;
    }

    /**
     * Get userVpc
     * @return userVpc
     */
    public UserVpcResponse getUserVpc() {
        return userVpc;
    }

    public void setUserVpc(UserVpcResponse userVpc) {
        this.userVpc = userVpc;
    }

    public ShowNotebookResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**：用户ID。 **取值范围**：不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowNotebookResponse withIsNeedCredentials(Boolean isNeedCredentials) {
        this.isNeedCredentials = isNeedCredentials;
        return this;
    }

    /**
     * **参数解释**：是否需要默认创建用户secret，默认为true。 **取值范围**：不涉及。
     * @return isNeedCredentials
     */
    public Boolean getIsNeedCredentials() {
        return isNeedCredentials;
    }

    public void setIsNeedCredentials(Boolean isNeedCredentials) {
        this.isNeedCredentials = isNeedCredentials;
    }

    public ShowNotebookResponse withJupyterVersion(String jupyterVersion) {
        this.jupyterVersion = jupyterVersion;
        return this;
    }

    /**
     * **参数解释**：jupyter version版本号。 **取值范围**：不涉及。
     * @return jupyterVersion
     */
    public String getJupyterVersion() {
        return jupyterVersion;
    }

    public void setJupyterVersion(String jupyterVersion) {
        this.jupyterVersion = jupyterVersion;
    }

    public ShowNotebookResponse withTags(List<TmsTagResponse> tags) {
        this.tags = tags;
        return this;
    }

    public ShowNotebookResponse addTagsItem(TmsTagResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowNotebookResponse withTags(Consumer<List<TmsTagResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：实例标签。
     * @return tags
     */
    public List<TmsTagResponse> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagResponse> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotebookResponse that = (ShowNotebookResponse) obj;
        return Objects.equals(this.actionProgress, that.actionProgress)
            && Objects.equals(this.description, that.description) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.customSpec, that.customSpec) && Objects.equals(this.id, that.id)
            && Objects.equals(this.image, that.image) && Objects.equals(this.lease, that.lease)
            && Objects.equals(this.name, that.name) && Objects.equals(this.pool, that.pool)
            && Objects.equals(this.status, that.status) && Objects.equals(this.token, that.token)
            && Objects.equals(this.url, that.url) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.billingItems, that.billingItems) && Objects.equals(this.user, that.user)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.runUser, that.runUser)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.userVpc, that.userVpc) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.isNeedCredentials, that.isNeedCredentials)
            && Objects.equals(this.jupyterVersion, that.jupyterVersion) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionProgress,
            description,
            endpoints,
            failReason,
            flavor,
            customSpec,
            id,
            image,
            lease,
            name,
            pool,
            status,
            token,
            url,
            volume,
            workspaceId,
            feature,
            billingItems,
            user,
            affinity,
            runUser,
            dataVolumes,
            ip,
            userVpc,
            userId,
            isNeedCredentials,
            jupyterVersion,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotebookResponse {\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    lease: ").append(toIndentedString(lease)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    billingItems: ").append(toIndentedString(billingItems)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    runUser: ").append(toIndentedString(runUser)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    userVpc: ").append(toIndentedString(userVpc)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    isNeedCredentials: ").append(toIndentedString(isNeedCredentials)).append("\n");
        sb.append("    jupyterVersion: ").append(toIndentedString(jupyterVersion)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

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
 * NotebookCreateRequest
 */
public class NotebookCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointsReq> endpoints = null;

    /**
     * **参数解释**：实例类别。 **约束限制**：不涉及。 **取值范围**： - DEFAULT：CodeLab免费规格实例，每个用户最多只能创建一个。 - NOTEBOOK：计费规格实例。  **默认取值**：NOTEBOOK。
     */
    public static final class FeatureEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final FeatureEnum DEFAULT = new FeatureEnum("DEFAULT");

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final FeatureEnum NOTEBOOK = new FeatureEnum("NOTEBOOK");

        private static final Map<String, FeatureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeatureEnum> createStaticFields() {
            Map<String, FeatureEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("NOTEBOOK", NOTEBOOK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeatureEnum(String value) {
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
        public static FeatureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeatureEnum(value));
        }

        public static FeatureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeatureEnum) {
                return this.value.equals(((FeatureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private FeatureEnum feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_spec")

    private NotebookCustomSpec customSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private VolumeMountRequest volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hooks")

    private CustomHooks hooks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lease")

    private LeaseReq lease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private AffinityType affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_user")

    private RunUserRequest runUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeMountRequest> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_vpc")

    private UserVpcRequest userVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public NotebookCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：实例描述信息。  **约束限制**：不涉及。 **取值范围**：长度限制为512字符，且不能包含字符&<>\"'/。  **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NotebookCreateRequest withEndpoints(List<EndpointsReq> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public NotebookCreateRequest addEndpointsItem(EndpointsReq endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public NotebookCreateRequest withEndpoints(Consumer<List<EndpointsReq>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**：仅在本地IDE（如PyCharm、VS Code）或SSH客户端接入Notebook。 **约束限制**：仅在本地IDE（如PyCharm、VS Code）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
     * @return endpoints
     */
    public List<EndpointsReq> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointsReq> endpoints) {
        this.endpoints = endpoints;
    }

    public NotebookCreateRequest withFeature(FeatureEnum feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释**：实例类别。 **约束限制**：不涉及。 **取值范围**： - DEFAULT：CodeLab免费规格实例，每个用户最多只能创建一个。 - NOTEBOOK：计费规格实例。  **默认取值**：NOTEBOOK。
     * @return feature
     */
    public FeatureEnum getFeature() {
        return feature;
    }

    public void setFeature(FeatureEnum feature) {
        this.feature = feature;
    }

    public NotebookCreateRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：实例的机器规格。如下规格仅供参考，实际支持的规格以具体区域为准。 - modelarts.vm.cpu.2u：Intel CPU通用规格，用于快速数据探索和实验。 - modelarts.vm.cpu.8u：Intel CPU算力增强型，适用于密集计算场景下运算。  **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NotebookCreateRequest withCustomSpec(NotebookCustomSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public NotebookCreateRequest withCustomSpec(Consumer<NotebookCustomSpec> customSpecSetter) {
        if (this.customSpec == null) {
            this.customSpec = new NotebookCustomSpec();
            customSpecSetter.accept(this.customSpec);
        }

        return this;
    }

    /**
     * Get customSpec
     * @return customSpec
     */
    public NotebookCustomSpec getCustomSpec() {
        return customSpec;
    }

    public void setCustomSpec(NotebookCustomSpec customSpec) {
        this.customSpec = customSpec;
    }

    public NotebookCreateRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：待创建Notebook实例的镜像，需要指定镜像ID。ID格式为通用唯一识别码（Universally Unique Identifier，简称UUID）。镜像的ID可通过调用[[查询支持的镜像列表](https://support.huaweicloud.com/api-modelarts/ListImage.html)](tag:hc)[[查询支持的镜像列表](https://support.huaweicloud.com/intl/zh-cn/api-modelarts/ListImage.html)](tag:hk)接口获取。 **约束限制**：不涉及。 **取值范围**：调用[[查询支持的镜像列表](https://support.huaweicloud.com/api-modelarts/ListImage.html)](tag:hc)[[查询支持的镜像列表](https://support.huaweicloud.com/intl/zh-cn/api-modelarts/ListImage.html)](tag:hk)接口获取的合法镜像ID列表。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public NotebookCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：实例名称。 **约束限制**：不涉及。 **取值范围**：长度限制为128个字符，支持大小写字母、数字、中划线和下划线，名称可重复。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotebookCreateRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：专属资源池ID，若需要指定专属资源池创建实例时必填。专属资源池ID可通过[[查询资源池列表](https://support.huaweicloud.com/api-modelarts/ListPools.html)](tag:hc)[[查询资源池列表](https://support.huaweicloud.com/intl/zh-cn/api-modelarts/ListPools.html)](tag:hk)接口获取。 **约束限制**：不涉及。 **取值范围**：调用[[查询资源池列表](https://support.huaweicloud.com/api-modelarts/ListPools.html)](tag:hc)[[查询资源池列表](https://support.huaweicloud.com/intl/zh-cn/api-modelarts/ListPools.html)](tag:hk)接口获取的合法资源池ID列表。 **默认取值**：不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public NotebookCreateRequest withVolume(VolumeMountRequest volume) {
        this.volume = volume;
        return this;
    }

    public NotebookCreateRequest withVolume(Consumer<VolumeMountRequest> volumeSetter) {
        if (this.volume == null) {
            this.volume = new VolumeMountRequest();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public VolumeMountRequest getVolume() {
        return volume;
    }

    public void setVolume(VolumeMountRequest volume) {
        this.volume = volume;
    }

    public NotebookCreateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **约束限制**：不涉及。 **取值范围**：0或32位仅包含字符0-9或小写字母a-z的字符串。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public NotebookCreateRequest withHooks(CustomHooks hooks) {
        this.hooks = hooks;
        return this;
    }

    public NotebookCreateRequest withHooks(Consumer<CustomHooks> hooksSetter) {
        if (this.hooks == null) {
            this.hooks = new CustomHooks();
            hooksSetter.accept(this.hooks);
        }

        return this;
    }

    /**
     * Get hooks
     * @return hooks
     */
    public CustomHooks getHooks() {
        return hooks;
    }

    public void setHooks(CustomHooks hooks) {
        this.hooks = hooks;
    }

    public NotebookCreateRequest withLease(LeaseReq lease) {
        this.lease = lease;
        return this;
    }

    public NotebookCreateRequest withLease(Consumer<LeaseReq> leaseSetter) {
        if (this.lease == null) {
            this.lease = new LeaseReq();
            leaseSetter.accept(this.lease);
        }

        return this;
    }

    /**
     * Get lease
     * @return lease
     */
    public LeaseReq getLease() {
        return lease;
    }

    public void setLease(LeaseReq lease) {
        this.lease = lease;
    }

    public NotebookCreateRequest withAffinity(AffinityType affinity) {
        this.affinity = affinity;
        return this;
    }

    public NotebookCreateRequest withAffinity(Consumer<AffinityType> affinitySetter) {
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

    public NotebookCreateRequest withRunUser(RunUserRequest runUser) {
        this.runUser = runUser;
        return this;
    }

    public NotebookCreateRequest withRunUser(Consumer<RunUserRequest> runUserSetter) {
        if (this.runUser == null) {
            this.runUser = new RunUserRequest();
            runUserSetter.accept(this.runUser);
        }

        return this;
    }

    /**
     * Get runUser
     * @return runUser
     */
    public RunUserRequest getRunUser() {
        return runUser;
    }

    public void setRunUser(RunUserRequest runUser) {
        this.runUser = runUser;
    }

    public NotebookCreateRequest withDataVolumes(List<VolumeMountRequest> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public NotebookCreateRequest addDataVolumesItem(VolumeMountRequest dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public NotebookCreateRequest withDataVolumes(Consumer<List<VolumeMountRequest>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：实例存储配置。 **约束限制**：不涉及。
     * @return dataVolumes
     */
    public List<VolumeMountRequest> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeMountRequest> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public NotebookCreateRequest withUserVpc(UserVpcRequest userVpc) {
        this.userVpc = userVpc;
        return this;
    }

    public NotebookCreateRequest withUserVpc(Consumer<UserVpcRequest> userVpcSetter) {
        if (this.userVpc == null) {
            this.userVpc = new UserVpcRequest();
            userVpcSetter.accept(this.userVpc);
        }

        return this;
    }

    /**
     * Get userVpc
     * @return userVpc
     */
    public UserVpcRequest getUserVpc() {
        return userVpc;
    }

    public void setUserVpc(UserVpcRequest userVpc) {
        this.userVpc = userVpc;
    }

    public NotebookCreateRequest withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：定时停止，以当前时刻为起点，运行的时长（到期后自动停止）。单位：毫秒。 **约束限制**：不涉及。 **取值范围**：3600000-259200000。 **默认取值**：3600000。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotebookCreateRequest that = (NotebookCreateRequest) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.feature, that.feature) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.customSpec, that.customSpec) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.hooks, that.hooks) && Objects.equals(this.lease, that.lease)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.runUser, that.runUser)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.userVpc, that.userVpc)
            && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            endpoints,
            feature,
            flavor,
            customSpec,
            imageId,
            name,
            poolId,
            volume,
            workspaceId,
            hooks,
            lease,
            affinity,
            runUser,
            dataVolumes,
            userVpc,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookCreateRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
        sb.append("    lease: ").append(toIndentedString(lease)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    runUser: ").append(toIndentedString(runUser)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    userVpc: ").append(toIndentedString(userVpc)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

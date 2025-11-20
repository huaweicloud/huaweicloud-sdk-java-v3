package com.huaweicloud.sdk.cce.v3.model;

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
 * NodeSpec
 */
public class NodeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private Volume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumes")

    private List<Volume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Storage storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIP")

    private NodePublicIP publicIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNicSpec")

    private NodeNicSpec nodeNicSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    /**
     * **参数解释**： 节点的计费模式。 **约束限制**： 不涉及 **取值范围**： -  0: 按需付费 [- 1: 包周期](tag:hws,hws_hk) [- 2: 已废弃：自动付费包周期](tag:hws,hws_hk)  **默认取值**： 0 
     */
    public static final class BillingModeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final BillingModeEnum NUMBER_0 = new BillingModeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BillingModeEnum NUMBER_1 = new BillingModeEnum(1);

        private static final Map<Integer, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BillingModeEnum> createStaticFields() {
            Map<Integer, BillingModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BillingModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BillingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingModeEnum(value));
        }

        public static BillingModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingModeEnum) {
                return this.value.equals(((BillingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingMode")

    private BillingModeEnum billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taint> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitPostInstallFinish")

    private Boolean waitPostInstallFinish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "k8sTags")

    private Map<String, String> k8sTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecsGroupId")

    private String ecsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicatedHostId")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userTags")

    private List<UserTag> userTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private Runtime runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initializedConditions")

    private List<String> initializedConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private NodeExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostnameConfig")

    private HostnameConfig hostnameConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverEnterpriseProjectID")

    private String serverEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNameTemplate")

    private NodeSpecNodeNameTemplate nodeNameTemplate;

    public NodeSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 节点的规格，CCE支持的节点规格请参考[节点规格说明](https://support.huaweicloud.com/api-cce/cce_02_0368.html)获取。 
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NodeSpec withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * 待创建节点所在的可用区，需要指定可用区（AZ）的名称，不填或者填random选择随机可用区。 [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint?CCE)](tag:hws) [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?CCE)](tag:hws_hk) 
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public NodeSpec withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * **参数解释**： 节点的操作系统类型。具体支持的操作系统请参见[节点操作系统说明](node-os.xml)。 **约束限制**： - 若在创建节点时未指定该配置，CCE会根据集群版本自动选择支持的OS版本。 - 若当前集群版本不支持该OS类型，则会自动替换为当前集群版本支持的同系列OS类型。 - 若在创建节点时指定了extendParam中的alpha.cce/NodeImageID参数，节点将使用私有镜像，则该参数为非必选参数。 [- 若在创建节点时指定了extendParam中的securityReinforcementType参数为cybersecurity，节点将开启安全等保加固功能，则节点的操作系统类型必须使用HCE2.0。当用户未配置私有镜像时，该参数必须为“Huawei Cloud EulerOS 2.0”；当用户配置了私有镜像且私有镜像操作系统类型为HCE2.0，则该参数为非必选参数。](tag:hws)  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public NodeSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public NodeSpec withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public NodeSpec withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public NodeSpec withRootVolume(Consumer<Volume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new Volume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public Volume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public NodeSpec withDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public NodeSpec addDataVolumesItem(Volume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public NodeSpec withDataVolumes(Consumer<List<Volume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 节点的数据盘参数（目前已支持通过控制台为CCE节点添加第二块数据盘）。 如果数据盘正供容器运行时和Kubelet组件使用，则不可被卸载，否则将导致节点不可用。 针对专属云节点，参数解释与rootVolume一致
     * @return dataVolumes
     */
    public List<Volume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public NodeSpec withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public NodeSpec withStorage(Consumer<Storage> storageSetter) {
        if (this.storage == null) {
            this.storage = new Storage();
            storageSetter.accept(this.storage);
        }

        return this;
    }

    /**
     * Get storage
     * @return storage
     */
    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public NodeSpec withPublicIP(NodePublicIP publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    public NodeSpec withPublicIP(Consumer<NodePublicIP> publicIPSetter) {
        if (this.publicIP == null) {
            this.publicIP = new NodePublicIP();
            publicIPSetter.accept(this.publicIP);
        }

        return this;
    }

    /**
     * Get publicIP
     * @return publicIP
     */
    public NodePublicIP getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(NodePublicIP publicIP) {
        this.publicIP = publicIP;
    }

    public NodeSpec withNodeNicSpec(NodeNicSpec nodeNicSpec) {
        this.nodeNicSpec = nodeNicSpec;
        return this;
    }

    public NodeSpec withNodeNicSpec(Consumer<NodeNicSpec> nodeNicSpecSetter) {
        if (this.nodeNicSpec == null) {
            this.nodeNicSpec = new NodeNicSpec();
            nodeNicSpecSetter.accept(this.nodeNicSpec);
        }

        return this;
    }

    /**
     * Get nodeNicSpec
     * @return nodeNicSpec
     */
    public NodeNicSpec getNodeNicSpec() {
        return nodeNicSpec;
    }

    public void setNodeNicSpec(NodeNicSpec nodeNicSpec) {
        this.nodeNicSpec = nodeNicSpec;
    }

    public NodeSpec withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 批量创建时节点的个数。 **约束限制**： - 作用于节点池时该项可以不填写。 - 创建、更新节点池场景返回中无该参数。 - 创建节点时该参数为必填参数  **取值范围**： 必须为大于等于1，小于等于最大限额的正整数。 **默认取值**： 不涉及
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public NodeSpec withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * **参数解释**： 节点的计费模式。 **约束限制**： 不涉及 **取值范围**： -  0: 按需付费 [- 1: 包周期](tag:hws,hws_hk) [- 2: 已废弃：自动付费包周期](tag:hws,hws_hk)  **默认取值**： 0 
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public NodeSpec withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpec addTaintsItem(Taint taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public NodeSpec withTaints(Consumer<List<Taint>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * 支持给创建出来的节点加Taints来设置反亲和性，taints配置不超过20条。每条Taints包含以下3个参数：  - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀。 - Value：必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。 - Effect：只可选NoSchedule，PreferNoSchedule或NoExecute。 字段使用场景：在节点创建场景下，支持指定初始值，查询时不返回该字段；在节点池场景下，创建节点池时节点模板参数中支持指定初始值，查询时支持返回该字段；在其余场景下，查询时都不会返回该字段。  示例：  ``` \"taints\": [{   \"key\": \"status\",   \"value\": \"unavailable\",   \"effect\": \"NoSchedule\" }, {   \"key\": \"looks\",   \"value\": \"bad\",   \"effect\": \"NoSchedule\" }] ``` 
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    public NodeSpec withWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制创建节点时 **post-install脚本执行完成前允许节点调度** 行为。当该参数未设置或者为false时，在kubernetes节点就绪时，容器即可被调度到可用节点。当该参数为true时，在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **约束限制：** 不涉及  **取值范围：** - false：在kubernetes节点就绪时，容器即可被调度到可用节点。           - true：在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **默认取值：** false
     * @return waitPostInstallFinish
     */
    public Boolean getWaitPostInstallFinish() {
        return waitPostInstallFinish;
    }

    public void setWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
    }

    public NodeSpec withK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
        return this;
    }

    public NodeSpec putK8sTagsItem(String key, String k8sTagsItem) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        this.k8sTags.put(key, k8sTagsItem);
        return this;
    }

    public NodeSpec withK8sTags(Consumer<Map<String, String>> k8sTagsSetter) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        k8sTagsSetter.accept(this.k8sTags);
        return this;
    }

    /**
     * 格式为key/value键值对。键值对个数不超过20条。 - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key，DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。 字段使用场景：在节点创建场景下，支持指定初始值，查询时不返回该字段；在节点池场景下，创建节点池时节点模板参数中支持指定初始值，查询时支持返回该字段；在其余场景下，查询时都不会返回该字段。   示例： ``` \"k8sTags\": {   \"key\": \"value\" } ``` 
     * @return k8sTags
     */
    public Map<String, String> getK8sTags() {
        return k8sTags;
    }

    public void setK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
    }

    public NodeSpec withEcsGroupId(String ecsGroupId) {
        this.ecsGroupId = ecsGroupId;
        return this;
    }

    /**
     * **参数解释**： 云服务器组ID，若指定，将节点创建在该云服务器组下。 **约束限制**： 创建、更新节点池时该配置不会生效，若要保持节点池中的节点都在同一个云服务器组内，请在节点池 nodeManagement 字段中配置。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ecsGroupId
     */
    public String getEcsGroupId() {
        return ecsGroupId;
    }

    public void setEcsGroupId(String ecsGroupId) {
        this.ecsGroupId = ecsGroupId;
    }

    public NodeSpec withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * **参数解释**： 指定DeH主机的ID，将节点调度到自己的DeH上。 **约束限制**： 创建节点池添加节点时不支持该参数。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public NodeSpec withUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }

    public NodeSpec addUserTagsItem(UserTag userTagsItem) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTagsItem);
        return this;
    }

    public NodeSpec withUserTags(Consumer<List<UserTag>> userTagsSetter) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        userTagsSetter.accept(this.userTags);
        return this;
    }

    /**
     * **参数解释**： 云服务器标签（资源标签）。字段使用场景：在节点创建场景下，支持指定初始值，查询时不返回该字段；在节点池场景下，创建节点池时节点模板参数中支持指定初始值，查询时支持返回该字段；在其余场景下，查询时都不会返回该字段。 **约束限制**： - 键必须唯一，CCE支持的最大用户自定义标签数量依region而定，自定义标签数上限为8个。
     * @return userTags
     */
    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    public NodeSpec withRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }

    public NodeSpec withRuntime(Consumer<Runtime> runtimeSetter) {
        if (this.runtime == null) {
            this.runtime = new Runtime();
            runtimeSetter.accept(this.runtime);
        }

        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    public NodeSpec withInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
        return this;
    }

    public NodeSpec addInitializedConditionsItem(String initializedConditionsItem) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        this.initializedConditions.add(initializedConditionsItem);
        return this;
    }

    public NodeSpec withInitializedConditions(Consumer<List<String>> initializedConditionsSetter) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        initializedConditionsSetter.accept(this.initializedConditions);
        return this;
    }

    /**
     * 自定义初始化标记。  CCE节点在初始化完成之前，会打上初始化未完成污点（node.cloudprovider.kubernetes.io/uninitialized）防止pod调度到节点上。  cce支持自定义初始化标记，在接收到initializedConditions参数后，会将参数值转换成节点标签，随节点下发，例如：cloudprovider.openvessel.io/inject-initialized-conditions=CCEInitial_CustomedInitial。  当节点上设置了此标签，会轮询节点的status.Conditions，查看conditions的type是否存在标记名，如CCEInitial、CustomedInitial标记，如果存在所有传入的标记，且状态为True，认为节点初始化完成，则移除初始化污点。  - 必须以字母、数字组成，长度范围1-20位。 - 标记数量不超过2个 
     * @return initializedConditions
     */
    public List<String> getInitializedConditions() {
        return initializedConditions;
    }

    public void setInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
    }

    public NodeSpec withExtendParam(NodeExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public NodeSpec withExtendParam(Consumer<NodeExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new NodeExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public NodeExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(NodeExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public NodeSpec withHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
        return this;
    }

    public NodeSpec withHostnameConfig(Consumer<HostnameConfig> hostnameConfigSetter) {
        if (this.hostnameConfig == null) {
            this.hostnameConfig = new HostnameConfig();
            hostnameConfigSetter.accept(this.hostnameConfig);
        }

        return this;
    }

    /**
     * Get hostnameConfig
     * @return hostnameConfig
     */
    public HostnameConfig getHostnameConfig() {
        return hostnameConfig;
    }

    public void setHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
    }

    public NodeSpec withServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
        return this;
    }

    /**
     * 服务器企业项目ID。CCE服务不实现EPS相关特性，该字段仅用于同步服务器企业项目ID。 创建节点/节点池场景：可指定已存在企业项目，当取值为空时，该字段继承集群企业项目属性。 更新节点池场景：配置修改后仅会对新增节点的服务器生效，存量节点需前往EPS界面迁移。 如果更新时不指定值，不会更新该字段。 当该字段为空时，返回集群企业项目。
     * @return serverEnterpriseProjectID
     */
    public String getServerEnterpriseProjectID() {
        return serverEnterpriseProjectID;
    }

    public void setServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
    }

    public NodeSpec withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * **参数解释**： 表示节点所属分区。分区可以选择中心云[或者[边缘小站](https://support.huaweicloud.com/usermanual-cloudpond/ies_02_0401.html)。](tag:hws)[或者[边缘小站](https://support.huaweicloud.com/intl/zh-cn/usermanual-cloudpond/ies_02_0401.html)。](tag:hws_hk) **约束限制**： 仅开启了对分布式云支持的Turbo集群支持指定该字段。 **取值范围**： - center: 中心云 - 边缘小站的可用区ID  **默认取值**： 不涉及
     * @return partition
     */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public NodeSpec withNodeNameTemplate(NodeSpecNodeNameTemplate nodeNameTemplate) {
        this.nodeNameTemplate = nodeNameTemplate;
        return this;
    }

    public NodeSpec withNodeNameTemplate(Consumer<NodeSpecNodeNameTemplate> nodeNameTemplateSetter) {
        if (this.nodeNameTemplate == null) {
            this.nodeNameTemplate = new NodeSpecNodeNameTemplate();
            nodeNameTemplateSetter.accept(this.nodeNameTemplate);
        }

        return this;
    }

    /**
     * Get nodeNameTemplate
     * @return nodeNameTemplate
     */
    public NodeSpecNodeNameTemplate getNodeNameTemplate() {
        return nodeNameTemplate;
    }

    public void setNodeNameTemplate(NodeSpecNodeNameTemplate nodeNameTemplate) {
        this.nodeNameTemplate = nodeNameTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpec that = (NodeSpec) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.az, that.az)
            && Objects.equals(this.os, that.os) && Objects.equals(this.login, that.login)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.storage, that.storage) && Objects.equals(this.publicIP, that.publicIP)
            && Objects.equals(this.nodeNicSpec, that.nodeNicSpec) && Objects.equals(this.count, that.count)
            && Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.waitPostInstallFinish, that.waitPostInstallFinish)
            && Objects.equals(this.k8sTags, that.k8sTags) && Objects.equals(this.ecsGroupId, that.ecsGroupId)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId)
            && Objects.equals(this.userTags, that.userTags) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.initializedConditions, that.initializedConditions)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.hostnameConfig, that.hostnameConfig)
            && Objects.equals(this.serverEnterpriseProjectID, that.serverEnterpriseProjectID)
            && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.nodeNameTemplate, that.nodeNameTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            az,
            os,
            login,
            rootVolume,
            dataVolumes,
            storage,
            publicIP,
            nodeNicSpec,
            count,
            billingMode,
            taints,
            waitPostInstallFinish,
            k8sTags,
            ecsGroupId,
            dedicatedHostId,
            userTags,
            runtime,
            initializedConditions,
            extendParam,
            hostnameConfig,
            serverEnterpriseProjectID,
            partition,
            nodeNameTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpec {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
        sb.append("    nodeNicSpec: ").append(toIndentedString(nodeNicSpec)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    waitPostInstallFinish: ").append(toIndentedString(waitPostInstallFinish)).append("\n");
        sb.append("    k8sTags: ").append(toIndentedString(k8sTags)).append("\n");
        sb.append("    ecsGroupId: ").append(toIndentedString(ecsGroupId)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    initializedConditions: ").append(toIndentedString(initializedConditions)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    hostnameConfig: ").append(toIndentedString(hostnameConfig)).append("\n");
        sb.append("    serverEnterpriseProjectID: ").append(toIndentedString(serverEnterpriseProjectID)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    nodeNameTemplate: ").append(toIndentedString(nodeNameTemplate)).append("\n");
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

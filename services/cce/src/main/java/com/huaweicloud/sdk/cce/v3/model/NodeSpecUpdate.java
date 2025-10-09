package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeSpecUpdate
 */
public class NodeSpecUpdate {

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
    @JsonProperty(value = "rootVolumeUpdate")

    private Volume rootVolumeUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumesUpdate")

    private List<Volume> dataVolumesUpdate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Storage storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private Runtime runtime;

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
    @JsonProperty(value = "userTags")

    private List<UserTag> userTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNameTemplate")

    private NodeSpecUpdateNodeNameTemplate nodeNameTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initializedConditions")

    private List<String> initializedConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverEnterpriseProjectID")

    private String serverEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNicSpecUpdate")

    private NodeSpecUpdateNodeNicSpecUpdate nodeNicSpecUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private NodePoolUpdateExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIP")

    private NodeEIPSpec publicIP;

    public NodeSpecUpdate withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释：** 节点的规格。  **约束限制**： 节点的规格不允许修改。 > 仅在删除节点池的默认伸缩组场景，允许设置为空字符串。当且仅当 **az** 字段也设置为空字符串时，才能删除默认伸缩组。如果节点池没有扩容伸缩组，默认伸缩组无法删除。  **取值范围：** CCE支持的节点规格请参考[节点规格说明](cce_02_0368.xml)获取。 **默认取值：** 不涉及
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NodeSpecUpdate withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * **参数解释**： 节点所在的可用区，需要指定可用区（AZ）的名称。  **约束限制**： 节点的可用区不允许修改。 > 仅在删除节点池的默认伸缩组场景，允许设置为空字符串。当且仅当 **flavor** 字段也设置为空字符串时，才能删除默认伸缩组。如果节点池没有扩容伸缩组，默认伸缩组无法删除。  **取值范围**： [CCE支持的可用区请参考[地区和终端节点](https://console.huaweicloud.com/apiexplorer/#/endpoint/CCE)。](tag:hws) [CCE支持的可用区请参考[地区和终端节点](https://console-intl.huaweicloud.com/apiexplorer/#/endpoint/CCE)。](tag:hws_hk) **默认取值**： 不涉及
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public NodeSpecUpdate withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * **参数解释**： 节点的操作系统类型。具体支持的操作系统请参见[节点操作系统说明](node-os.xml)。 **约束限制**： - 若当前集群版本不支持该OS类型，则会自动替换为当前集群版本支持的同系列OS类型。 - 若在创建节点时指定了extendParam中的alpha.cce/NodeImageID参数，可以不填写此参数。 - 该参数缺省时，CCE会根据集群版本自动选择支持的OS版本。 - 创建节点池时，该参数为必选。 - 若创建节点时使用共享磁盘空间，即磁盘初始化配置管理参数使用storage，且StorageGroups中virtualSpaces的name字段指定为share，该参数为必选。  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public NodeSpecUpdate withLogin(Login login) {
        this.login = login;
        return this;
    }

    public NodeSpecUpdate withLogin(Consumer<Login> loginSetter) {
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

    public NodeSpecUpdate withRootVolumeUpdate(Volume rootVolumeUpdate) {
        this.rootVolumeUpdate = rootVolumeUpdate;
        return this;
    }

    public NodeSpecUpdate withRootVolumeUpdate(Consumer<Volume> rootVolumeUpdateSetter) {
        if (this.rootVolumeUpdate == null) {
            this.rootVolumeUpdate = new Volume();
            rootVolumeUpdateSetter.accept(this.rootVolumeUpdate);
        }

        return this;
    }

    /**
     * Get rootVolumeUpdate
     * @return rootVolumeUpdate
     */
    public Volume getRootVolumeUpdate() {
        return rootVolumeUpdate;
    }

    public void setRootVolumeUpdate(Volume rootVolumeUpdate) {
        this.rootVolumeUpdate = rootVolumeUpdate;
    }

    public NodeSpecUpdate withDataVolumesUpdate(List<Volume> dataVolumesUpdate) {
        this.dataVolumesUpdate = dataVolumesUpdate;
        return this;
    }

    public NodeSpecUpdate addDataVolumesUpdateItem(Volume dataVolumesUpdateItem) {
        if (this.dataVolumesUpdate == null) {
            this.dataVolumesUpdate = new ArrayList<>();
        }
        this.dataVolumesUpdate.add(dataVolumesUpdateItem);
        return this;
    }

    public NodeSpecUpdate withDataVolumesUpdate(Consumer<List<Volume>> dataVolumesUpdateSetter) {
        if (this.dataVolumesUpdate == null) {
            this.dataVolumesUpdate = new ArrayList<>();
        }
        dataVolumesUpdateSetter.accept(this.dataVolumesUpdate);
        return this;
    }

    /**
     * **参数解释**： 节点的数据盘参数。针对专属云节点，参数解释与rootVolume一致。 **约束限制**： 磁盘挂载上限为虚拟机不超过16块，裸金属不超过10块。在此基础上还受限于虚拟机/裸金属规格可挂载磁盘数上限。（目前支持通过控制台和API为CCE节点添加多块数据盘）。 如果数据盘正供容器运行时和Kubelet组件使用，则不可被卸载，否则将导致节点不可用。
     * @return dataVolumesUpdate
     */
    public List<Volume> getDataVolumesUpdate() {
        return dataVolumesUpdate;
    }

    public void setDataVolumesUpdate(List<Volume> dataVolumesUpdate) {
        this.dataVolumesUpdate = dataVolumesUpdate;
    }

    public NodeSpecUpdate withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public NodeSpecUpdate withStorage(Consumer<Storage> storageSetter) {
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

    public NodeSpecUpdate withRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }

    public NodeSpecUpdate withRuntime(Consumer<Runtime> runtimeSetter) {
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

    public NodeSpecUpdate withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpecUpdate addTaintsItem(Taint taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public NodeSpecUpdate withTaints(Consumer<List<Taint>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * **参数解释**： 支持给创建出来的节点加Taints来设置反亲和性。每条Taints包含以下3个参数：  - Key：必须以字母或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀。 - Value：必须以字符或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符。 - Effect：只可选NoSchedule，PreferNoSchedule或NoExecute。 字段使用场景：在节点创建场景下，支持指定初始值，查询时不返回该字段；在节点池场景下，其中节点模板中支持指定初始值，查询时支持返回该字段；在其余场景下，查询时都不会返回该字段。  示例：  ``` \"taints\": [{   \"key\": \"status\",   \"value\": \"unavailable\",   \"effect\": \"NoSchedule\" }, {   \"key\": \"looks\",   \"value\": \"bad\",   \"effect\": \"NoSchedule\" }] ```  **约束限制**： - taints配置不超过20条。 - 参数未指定时将不会更新节点池的自定义Taints。 - 参数为空数组时将删除节点池的自定义Taints。
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    public NodeSpecUpdate withWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制更新节点池时 **post-install脚本执行完成前允许节点调度** 行为。当该参数未设置或者为false时，在kubernetes节点就绪时，容器即可被调度到可用节点。当该参数为true时，在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **约束限制：** 不涉及  **取值范围：** - false：在kubernetes节点就绪时，容器即可被调度到可用节点。           - true：在kubernetes节点就绪时且post-install脚本执行完成时，容器才可被调度到可用节点。  **默认取值：** false
     * @return waitPostInstallFinish
     */
    public Boolean getWaitPostInstallFinish() {
        return waitPostInstallFinish;
    }

    public void setWaitPostInstallFinish(Boolean waitPostInstallFinish) {
        this.waitPostInstallFinish = waitPostInstallFinish;
    }

    public NodeSpecUpdate withK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
        return this;
    }

    public NodeSpecUpdate putK8sTagsItem(String key, String k8sTagsItem) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        this.k8sTags.put(key, k8sTagsItem);
        return this;
    }

    public NodeSpecUpdate withK8sTags(Consumer<Map<String, String>> k8sTagsSetter) {
        if (this.k8sTags == null) {
            this.k8sTags = new HashMap<>();
        }
        k8sTagsSetter.accept(this.k8sTags);
        return this;
    }

    /**
     * **参数解释**： 格式为key/value键值对。 - Key：必须以字母或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key，DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符。 字段使用场景：在节点创建场景下，支持指定初始值，查询时不返回该字段；在节点池场景下，其中节点模板中支持指定初始值，查询时支持返回该字段；在其余场景下，查询时都不会返回该字段。   示例： ``` \"k8sTags\": {   \"key\": \"value\" } ```  **约束限制**： - 键值对个数不超过20条。 - 参数未指定时将不会更新节点池的自定义K8s标签。 - 参数为空对象时将删除节点池的自定义K8s标签。
     * @return k8sTags
     */
    public Map<String, String> getK8sTags() {
        return k8sTags;
    }

    public void setK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
    }

    public NodeSpecUpdate withUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }

    public NodeSpecUpdate addUserTagsItem(UserTag userTagsItem) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTagsItem);
        return this;
    }

    public NodeSpecUpdate withUserTags(Consumer<List<UserTag>> userTagsSetter) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        userTagsSetter.accept(this.userTags);
        return this;
    }

    /**
     * **参数解释**： 云服务器标签（资源标签）。 **约束限制**： - 键必须唯一，CCE支持的最大用户自定义标签数量依region而定，自定义标签数上限为8个。 - 参数未指定时将不会更新节点池的自定义云服务器标签。 - 参数为空数组时将删除节点池的自定义云服务器标签。
     * @return userTags
     */
    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    public NodeSpecUpdate withNodeNameTemplate(NodeSpecUpdateNodeNameTemplate nodeNameTemplate) {
        this.nodeNameTemplate = nodeNameTemplate;
        return this;
    }

    public NodeSpecUpdate withNodeNameTemplate(Consumer<NodeSpecUpdateNodeNameTemplate> nodeNameTemplateSetter) {
        if (this.nodeNameTemplate == null) {
            this.nodeNameTemplate = new NodeSpecUpdateNodeNameTemplate();
            nodeNameTemplateSetter.accept(this.nodeNameTemplate);
        }

        return this;
    }

    /**
     * Get nodeNameTemplate
     * @return nodeNameTemplate
     */
    public NodeSpecUpdateNodeNameTemplate getNodeNameTemplate() {
        return nodeNameTemplate;
    }

    public void setNodeNameTemplate(NodeSpecUpdateNodeNameTemplate nodeNameTemplate) {
        this.nodeNameTemplate = nodeNameTemplate;
    }

    public NodeSpecUpdate withInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
        return this;
    }

    public NodeSpecUpdate addInitializedConditionsItem(String initializedConditionsItem) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        this.initializedConditions.add(initializedConditionsItem);
        return this;
    }

    public NodeSpecUpdate withInitializedConditions(Consumer<List<String>> initializedConditionsSetter) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        initializedConditionsSetter.accept(this.initializedConditions);
        return this;
    }

    /**
     * **参数解释**： 自定义初始化标记，默认值为空。  CCE节点在初始化完成之前，会打上初始化未完成污点（node.cloudprovider.kubernetes.io/uninitialized）防止pod调度到节点上。用户在创建节点时，可以通过设置initializedConditions参数，控制污点的移除时间（默认不设置超时时间）。  使用示例如下： 1. 创建节点，传入参数 \"initializedConditions\": [\"CCEInitial\", \"CustomedInitial\"]； 2. 更新节点，传入参数 \"initializedConditions\": [\"NodeInitial\"]，节点池新建的节点注册到集群时默认会被设置为不可调度； 3. 用户在执行完自定义初始化操作后，调用k8s接口（例如PATCH /v1/nodes/{node_ip}/status）更新节点的conditions，插入type为CCEInitial、CustomedInitial的两个标记，状态为True，如下所示：   ```   status:     conditions:     - type: CCEInitial       status: 'True'     - type: CustomedInitial       status: 'True'   ``` 4. CCE组件轮询节点的status.Conditions，查看是否存在type为CCEInitial、CustomedInitial的condition，若存在且status字段值为True，认为节点初始化完成，则移除初始化污点； 5. initializedConditions支持设置超时时间，用户可以在创节点时传入，如：\"initializedConditions\": [\"CCEInitial:15m\", \"CustomedInitial:15m\"]，表示超时时间为15分钟，达到超时时间后，当CCE组件轮询到节点时会自动忽略初始化condition，移除初始化污点。  **约束限制**： - initializedConditions中超时时间取值范围为[1-99]秒 - 必须以字母、数字组成，长度范围1-20位。 - 标记数量不超过2个。 - 超时时间仅支持分钟(m)单位。
     * @return initializedConditions
     */
    public List<String> getInitializedConditions() {
        return initializedConditions;
    }

    public void setInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
    }

    public NodeSpecUpdate withServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
        return this;
    }

    /**
     * **参数解释**： 服务器企业项目ID。CCE服务不实现EPS相关特性，该字段仅用于同步服务器企业项目ID。 **约束限制**： 创建节点/节点池场景：可指定已存在企业项目，当取值为空时，该字段继承集群企业项目属性。 更新节点池场景：配置修改后仅会对新增节点的服务器生效，存量节点需前往EPS界面迁移。 **取值范围**： 不涉及 **默认取值**： 如果更新时不指定值，不会更新该字段。 当该字段为空时，返回集群企业项目。
     * @return serverEnterpriseProjectID
     */
    public String getServerEnterpriseProjectID() {
        return serverEnterpriseProjectID;
    }

    public void setServerEnterpriseProjectID(String serverEnterpriseProjectID) {
        this.serverEnterpriseProjectID = serverEnterpriseProjectID;
    }

    public NodeSpecUpdate withNodeNicSpecUpdate(NodeSpecUpdateNodeNicSpecUpdate nodeNicSpecUpdate) {
        this.nodeNicSpecUpdate = nodeNicSpecUpdate;
        return this;
    }

    public NodeSpecUpdate withNodeNicSpecUpdate(Consumer<NodeSpecUpdateNodeNicSpecUpdate> nodeNicSpecUpdateSetter) {
        if (this.nodeNicSpecUpdate == null) {
            this.nodeNicSpecUpdate = new NodeSpecUpdateNodeNicSpecUpdate();
            nodeNicSpecUpdateSetter.accept(this.nodeNicSpecUpdate);
        }

        return this;
    }

    /**
     * Get nodeNicSpecUpdate
     * @return nodeNicSpecUpdate
     */
    public NodeSpecUpdateNodeNicSpecUpdate getNodeNicSpecUpdate() {
        return nodeNicSpecUpdate;
    }

    public void setNodeNicSpecUpdate(NodeSpecUpdateNodeNicSpecUpdate nodeNicSpecUpdate) {
        this.nodeNicSpecUpdate = nodeNicSpecUpdate;
    }

    public NodeSpecUpdate withExtendParam(NodePoolUpdateExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public NodeSpecUpdate withExtendParam(Consumer<NodePoolUpdateExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new NodePoolUpdateExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public NodePoolUpdateExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(NodePoolUpdateExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public NodeSpecUpdate withPublicIP(NodeEIPSpec publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    public NodeSpecUpdate withPublicIP(Consumer<NodeEIPSpec> publicIPSetter) {
        if (this.publicIP == null) {
            this.publicIP = new NodeEIPSpec();
            publicIPSetter.accept(this.publicIP);
        }

        return this;
    }

    /**
     * Get publicIP
     * @return publicIP
     */
    public NodeEIPSpec getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(NodeEIPSpec publicIP) {
        this.publicIP = publicIP;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpecUpdate that = (NodeSpecUpdate) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.az, that.az)
            && Objects.equals(this.os, that.os) && Objects.equals(this.login, that.login)
            && Objects.equals(this.rootVolumeUpdate, that.rootVolumeUpdate)
            && Objects.equals(this.dataVolumesUpdate, that.dataVolumesUpdate)
            && Objects.equals(this.storage, that.storage) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.waitPostInstallFinish, that.waitPostInstallFinish)
            && Objects.equals(this.k8sTags, that.k8sTags) && Objects.equals(this.userTags, that.userTags)
            && Objects.equals(this.nodeNameTemplate, that.nodeNameTemplate)
            && Objects.equals(this.initializedConditions, that.initializedConditions)
            && Objects.equals(this.serverEnterpriseProjectID, that.serverEnterpriseProjectID)
            && Objects.equals(this.nodeNicSpecUpdate, that.nodeNicSpecUpdate)
            && Objects.equals(this.extendParam, that.extendParam) && Objects.equals(this.publicIP, that.publicIP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            az,
            os,
            login,
            rootVolumeUpdate,
            dataVolumesUpdate,
            storage,
            runtime,
            taints,
            waitPostInstallFinish,
            k8sTags,
            userTags,
            nodeNameTemplate,
            initializedConditions,
            serverEnterpriseProjectID,
            nodeNicSpecUpdate,
            extendParam,
            publicIP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpecUpdate {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    rootVolumeUpdate: ").append(toIndentedString(rootVolumeUpdate)).append("\n");
        sb.append("    dataVolumesUpdate: ").append(toIndentedString(dataVolumesUpdate)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    waitPostInstallFinish: ").append(toIndentedString(waitPostInstallFinish)).append("\n");
        sb.append("    k8sTags: ").append(toIndentedString(k8sTags)).append("\n");
        sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
        sb.append("    nodeNameTemplate: ").append(toIndentedString(nodeNameTemplate)).append("\n");
        sb.append("    initializedConditions: ").append(toIndentedString(initializedConditions)).append("\n");
        sb.append("    serverEnterpriseProjectID: ").append(toIndentedString(serverEnterpriseProjectID)).append("\n");
        sb.append("    nodeNicSpecUpdate: ").append(toIndentedString(nodeNicSpecUpdate)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
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

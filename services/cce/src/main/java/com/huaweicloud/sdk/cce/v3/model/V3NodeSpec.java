package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Login;
import com.huaweicloud.sdk.cce.v3.model.NodeNicSpec;
import com.huaweicloud.sdk.cce.v3.model.Taint;
import com.huaweicloud.sdk.cce.v3.model.UserTag;
import com.huaweicloud.sdk.cce.v3.model.V3DataVolume;
import com.huaweicloud.sdk.cce.v3.model.V3NodePublicIP;
import com.huaweicloud.sdk.cce.v3.model.V3RootVolume;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * V3NodeSpec
 */
public class V3NodeSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az")
    
    private String az;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billingMode")
    
    private Integer billingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataVolumes")
    
    private List<V3DataVolume> dataVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicatedHostId")
    
    private String dedicatedHostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecsGroupId")
    
    private String ecsGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private Map<String, Object> extendParam = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="k8sTags")
    
    private Map<String, String> k8sTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login")
    
    private Login login;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeNicSpec")
    
    private NodeNicSpec nodeNicSpec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offloadNode")
    
    private Boolean offloadNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os")
    
    private String os;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicIP")
    
    private V3NodePublicIP publicIP;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rootVolume")
    
    private V3RootVolume rootVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="taints")
    
    private List<Taint> taints = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userTags")
    
    private List<UserTag> userTags = null;
    
    public V3NodeSpec withAz(String az) {
        this.az = az;
        return this;
    }

    


    /**
     *   节点所在的可用区名. 底层实际存在，位于该用户物理可用区组之内的可用区
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    

    public V3NodeSpec withBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    


    /**
     * 节点的计费模式：取值为 0（按需付费）、2（自动付费包周期）  自动付费包周期支持普通用户token。 >创建按需节点不影响集群状态；创建包周期节点时，集群状态会转换为“扩容中”。
     * @return billingMode
     */
    public Integer getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
    }

    

    public V3NodeSpec withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 批量创建时节点的个数，必须为大于等于1，小于等于最大限额的正整数。作用于节点池时该项允许为0
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public V3NodeSpec withDataVolumes(List<V3DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    
    public V3NodeSpec addDataVolumesItem(V3DataVolume dataVolumesItem) {
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public V3NodeSpec withDataVolumes(Consumer<List<V3DataVolume>> dataVolumesSetter) {
        if(this.dataVolumes == null ){
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 节点的数据盘参数（目前已支持通过控制台为CCE节点添加第二块数据盘）。  针对专属云节点，参数解释与rootVolume一致
     * @return dataVolumes
     */
    public List<V3DataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<V3DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    

    public V3NodeSpec withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    


    /**
     * 指定DeH主机的ID，将节点调度到自己的DeH上。\\n>创建节点池添加节点时不支持该参数。 
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    

    public V3NodeSpec withEcsGroupId(String ecsGroupId) {
        this.ecsGroupId = ecsGroupId;
        return this;
    }

    


    /**
     * 云服务器组ID，若指定，将节点创建在该云服务器组下
     * @return ecsGroupId
     */
    public String getEcsGroupId() {
        return ecsGroupId;
    }

    public void setEcsGroupId(String ecsGroupId) {
        this.ecsGroupId = ecsGroupId;
    }

    

    public V3NodeSpec withExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    

    public V3NodeSpec putExtendParamItem(String key, Object extendParamItem) {
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public V3NodeSpec withExtendParam(Consumer<Map<String, Object>> extendParamSetter) {
        if(this.extendParam == null ){
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }
    /**
     * 创建节点时的扩展参数，可选参数如下： - chargingMode: 节点的计费模式。按需计费，取值为“0”，若不填，则默认为“0”。 - ecs:performancetype：云服务器规格的分类。裸金属节点无该字段。 - orderID: 订单ID，节点付费类型为自动付费包周期类型时必选。 - productID: 产品ID。 - maxPods: 节点最大允许创建的实例数(Pod)，该数量包含系统默认实例，取值范围为16~256。   该设置的目的为防止节点因管理过多实例而负载过重，请根据您的业务需要进行设置。 - periodType:    订购周期类型，取值范围：     - month：月     - year：年   > billingMode为2（自动付费包周期）时生效，且为必选。 - periodNum:   订购周期数，取值范围：     - periodType=month（周期类型为月）时，取值为[1-9]。     - periodType=year（周期类型为年）时，取值为1。   > billingMode为2时生效，且为必选。 - isAutoRenew:   是否自动续订     - “true”：自动续订     - “false”：不自动续订   > billingMode为2时生效，且为必选。 - isAutoPay:   是否自动扣款     - “true”：自动扣款     - “false”：不自动扣款   > billingMode为2时生效，不填写此参数时默认会自动扣款。 - DockerLVMConfigOverride:   Docker数据盘配置项。默认配置示例如下：   ```   \"DockerLVMConfigOverride\":\"dockerThinpool=vgpaas/90%VG;kubernetesLV=vgpaas/10%VG;diskType=evs;lvType=linear\"   ```   包含如下字段：     - userLV：用户空间的大小，示例格式：vgpaas/20%VG     - userPath：用户空间挂载路径，示例格式：/home/wqt-test     - diskType：磁盘类型，目前只有evs、hdd和ssd三种格式     - lvType：逻辑卷的类型，目前支持linear和striped两种，示例格式：striped     - dockerThinpool：Docker盘的空间大小，示例格式：vgpaas/60%VG     - kubernetesLV：Kubelet空间大小，示例格式：vgpaas/20%VG - dockerBaseSize:   Device mapper 模式下，节点上 docker  单容器的可用磁盘空间大小 - init-node-password: 节点初始密码 - offloadNode: 是否为CCE Turbo集群节点 - publicKey: 节点的公钥。 - alpha.cce/preInstall:    安装前执行脚本   > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64。 - alpha.cce/postInstall:   安装后执行脚本   > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64。 - alpha.cce/NodeImageID: 如果创建裸金属节点，需要使用自定义镜像时用此参数。 - interruption_policy:   竞享实例中断策略，当前仅支持immediate。   - 仅marketType=spot时，该字段才可配置。   - 当interruption_policy=immediate时表示释放策略为立即释放。 - spot_duration_hours:   购买的竞享实例时长。   - 仅interruption_policy=immediate 时该字段才可配置。   - spot_duration_hours须大于0。   - spot_duration_hours的前端最大值从flavor的extra_specs的cond:spot_block:operation:longest_duration_hours字段中查询。 - spot_duration_count：   购买的“竞享实例时长”的个数。   - 仅spot_duration_hours>0时该字段才可配置。   - spot_duration_hours小于6时，spot_duration_count必须等于1。   - spot_duration_hours等于6时，spot_duration_count大于等于1。   - spot_duration_count的前端最大值从flavor的extra_specs的cond:spot_block:operation:longest_duration_count字段中查询。 
     * @return extendParam
     */
    public Map<String, Object> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
    }

    

    public V3NodeSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * 节点的规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    

    public V3NodeSpec withK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
        return this;
    }

    

    public V3NodeSpec putK8sTagsItem(String key, String k8sTagsItem) {
        this.k8sTags.put(key, k8sTagsItem);
        return this;
    }

    public V3NodeSpec withK8sTags(Consumer<Map<String, String>> k8sTagsSetter) {
        if(this.k8sTags == null ){
            this.k8sTags = new HashMap<>();
        }
        k8sTagsSetter.accept(this.k8sTags);
        return this;
    }
    /**
     * 格式为key/value键值对。键值对个数不超过20条。  - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key， DNS子域最长253个字符。 - Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。  示例：  ``` \"k8sTags\": {  \"key\": \"value\" } ```
     * @return k8sTags
     */
    public Map<String, String> getK8sTags() {
        return k8sTags;
    }

    public void setK8sTags(Map<String, String> k8sTags) {
        this.k8sTags = k8sTags;
    }

    

    public V3NodeSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public V3NodeSpec withLogin(Consumer<Login> loginSetter) {
        if(this.login == null ){
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

    

    public V3NodeSpec withNodeNicSpec(NodeNicSpec nodeNicSpec) {
        this.nodeNicSpec = nodeNicSpec;
        return this;
    }

    public V3NodeSpec withNodeNicSpec(Consumer<NodeNicSpec> nodeNicSpecSetter) {
        if(this.nodeNicSpec == null ){
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

    

    public V3NodeSpec withOffloadNode(Boolean offloadNode) {
        this.offloadNode = offloadNode;
        return this;
    }

    


    /**
     * 是否CCE Turbo集群节点 >创建节点池添加节点时不支持该参数。
     * @return offloadNode
     */
    public Boolean getOffloadNode() {
        return offloadNode;
    }

    public void setOffloadNode(Boolean offloadNode) {
        this.offloadNode = offloadNode;
    }

    

    public V3NodeSpec withOs(String os) {
        this.os = os;
        return this;
    }

    


    /**
     * 节点的操作系统类型。  - 对于虚拟机节点，可以配置为“EulerOS”、“CentOS”、“Debian”、“Ubuntu”。默认为\"EulerOS\"。  > 系统会根据集群版本自动选择支持的系统版本。当前集群版本不支持该系统类型，则会报错。  - 对于自动付费包周期的裸金属节点，只支持EulerOS 2.3、EulerOS 2.5、EulerOS 2.8。
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    

    public V3NodeSpec withPublicIP(V3NodePublicIP publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    public V3NodeSpec withPublicIP(Consumer<V3NodePublicIP> publicIPSetter) {
        if(this.publicIP == null ){
            this.publicIP = new V3NodePublicIP();
            publicIPSetter.accept(this.publicIP);
        }
        
        return this;
    }


    /**
     * Get publicIP
     * @return publicIP
     */
    public V3NodePublicIP getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(V3NodePublicIP publicIP) {
        this.publicIP = publicIP;
    }

    

    public V3NodeSpec withRootVolume(V3RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public V3NodeSpec withRootVolume(Consumer<V3RootVolume> rootVolumeSetter) {
        if(this.rootVolume == null ){
            this.rootVolume = new V3RootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }
        
        return this;
    }


    /**
     * Get rootVolume
     * @return rootVolume
     */
    public V3RootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(V3RootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    

    public V3NodeSpec withTaints(List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    
    public V3NodeSpec addTaintsItem(Taint taintsItem) {
        this.taints.add(taintsItem);
        return this;
    }

    public V3NodeSpec withTaints(Consumer<List<Taint>> taintsSetter) {
        if(this.taints == null ){
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * 支持给创建出来的节点加Taints来设置反亲和性，每条Taints包含以下3个参数：  - Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀。 - Value：必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。 - Effect：只可选NoSchedule，PreferNoSchedule或NoExecute。  示例：  ``` \"taints\": [{ \"key\": \"status\", \"value\": \"unavailable\", \"effect\": \"NoSchedule\" }, { \"key\": \"looks\", \"value\": \"bad\", \"effect\": \"NoSchedule\" }] ```
     * @return taints
     */
    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(List<Taint> taints) {
        this.taints = taints;
    }

    

    public V3NodeSpec withUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
        return this;
    }

    
    public V3NodeSpec addUserTagsItem(UserTag userTagsItem) {
        this.userTags.add(userTagsItem);
        return this;
    }

    public V3NodeSpec withUserTags(Consumer<List<UserTag>> userTagsSetter) {
        if(this.userTags == null ){
            this.userTags = new ArrayList<>();
        }
        userTagsSetter.accept(this.userTags);
        return this;
    }

    /**
     * 云服务器标签，键必须唯一，CCE支持的最大用户自定义标签数量依region而定，自定义标签数上限最少为5个。
     * @return userTags
     */
    public List<UserTag> getUserTags() {
        return userTags;
    }

    public void setUserTags(List<UserTag> userTags) {
        this.userTags = userTags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V3NodeSpec v3NodeSpec = (V3NodeSpec) o;
        return Objects.equals(this.az, v3NodeSpec.az) &&
            Objects.equals(this.billingMode, v3NodeSpec.billingMode) &&
            Objects.equals(this.count, v3NodeSpec.count) &&
            Objects.equals(this.dataVolumes, v3NodeSpec.dataVolumes) &&
            Objects.equals(this.dedicatedHostId, v3NodeSpec.dedicatedHostId) &&
            Objects.equals(this.ecsGroupId, v3NodeSpec.ecsGroupId) &&
            Objects.equals(this.extendParam, v3NodeSpec.extendParam) &&
            Objects.equals(this.flavor, v3NodeSpec.flavor) &&
            Objects.equals(this.k8sTags, v3NodeSpec.k8sTags) &&
            Objects.equals(this.login, v3NodeSpec.login) &&
            Objects.equals(this.nodeNicSpec, v3NodeSpec.nodeNicSpec) &&
            Objects.equals(this.offloadNode, v3NodeSpec.offloadNode) &&
            Objects.equals(this.os, v3NodeSpec.os) &&
            Objects.equals(this.publicIP, v3NodeSpec.publicIP) &&
            Objects.equals(this.rootVolume, v3NodeSpec.rootVolume) &&
            Objects.equals(this.taints, v3NodeSpec.taints) &&
            Objects.equals(this.userTags, v3NodeSpec.userTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(az, billingMode, count, dataVolumes, dedicatedHostId, ecsGroupId, extendParam, flavor, k8sTags, login, nodeNicSpec, offloadNode, os, publicIP, rootVolume, taints, userTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V3NodeSpec {\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    ecsGroupId: ").append(toIndentedString(ecsGroupId)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    k8sTags: ").append(toIndentedString(k8sTags)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    nodeNicSpec: ").append(toIndentedString(nodeNicSpec)).append("\n");
        sb.append("    offloadNode: ").append(toIndentedString(offloadNode)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
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


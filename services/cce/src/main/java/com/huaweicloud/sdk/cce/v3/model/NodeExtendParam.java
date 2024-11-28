package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建节点时的扩展参数。
 */
public class NodeExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:performancetype")

    private String ecsPerformancetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productID")

    private String productID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPods")

    private Integer maxPods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private String isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DockerLVMConfigOverride")

    private String dockerLVMConfigOverride;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private Integer dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKey")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/preInstall")

    private String alphaCcePreInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/postInstall")

    private String alphaCcePostInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/NodeImageID")

    private String alphaCceNodeImageID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicMultiqueue")

    private String nicMultiqueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicThreshold")

    private String nicThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeReservedMem")

    private Integer kubeReservedMem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemReservedMem")

    private Integer systemReservedMem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init-node-password")

    private String initNodePassword;

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： 取值范围：['null', cybersecurity]; **默认取值**： 不涉及
     */
    public static final class SecurityReinforcementTypeEnum {

        /**
         * Enum NULL for value: "null"
         */
        public static final SecurityReinforcementTypeEnum NULL = new SecurityReinforcementTypeEnum("null");

        /**
         * Enum CYBERSECURITY for value: "cybersecurity"
         */
        public static final SecurityReinforcementTypeEnum CYBERSECURITY =
            new SecurityReinforcementTypeEnum("cybersecurity");

        private static final Map<String, SecurityReinforcementTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecurityReinforcementTypeEnum> createStaticFields() {
            Map<String, SecurityReinforcementTypeEnum> map = new HashMap<>();
            map.put("null", NULL);
            map.put("cybersecurity", CYBERSECURITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecurityReinforcementTypeEnum(String value) {
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
        public static SecurityReinforcementTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SecurityReinforcementTypeEnum(value));
        }

        public static SecurityReinforcementTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecurityReinforcementTypeEnum) {
                return this.value.equals(((SecurityReinforcementTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityReinforcementType")

    private SecurityReinforcementTypeEnum securityReinforcementType;

    public NodeExtendParam withEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
        return this;
    }

    /**
     * 云服务器规格的分类。响应中会返回此字段。
     * @return ecsPerformancetype
     */
    public String getEcsPerformancetype() {
        return ecsPerformancetype;
    }

    public void setEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
    }

    public NodeExtendParam withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * 订单ID，节点付费类型为自动付费包周期类型时，响应中会返回此字段(仅创建场景涉及)。
     * @return orderID
     */
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public NodeExtendParam withProductID(String productID) {
        this.productID = productID;
        return this;
    }

    /**
     * 产品ID，节点付费类型为自动付费包周期类型时，响应中会返回此字段。
     * @return productID
     */
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public NodeExtendParam withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * 节点最大允许创建的实例数(Pod)，该数量包含系统默认实例，取值范围为16~256。  该设置的目的为防止节点因管理过多实例而负载过重，请根据您的业务需要进行设置。  节点可以创建多少个Pod，受多个参数影响，具体请参见[节点最多可以创建多少Pod](maxPods.xml)。 
     * @return maxPods
     */
    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    public NodeExtendParam withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * - month：月 - year：年 > 作为请求参数，billingMode为1（包周期）或2（已废弃：自动付费包周期）时生效，且为必选。 > 作为响应参数，仅在创建包周期节点时返回。 
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public NodeExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数，取值范围： - periodType=month（周期类型为月）时，取值为[1-9]。 - periodType=year（周期类型为年）时，取值为1。 > 作为请求参数，billingMode为1或2（已废弃）时生效，且为必选。 > 作为响应参数，仅在创建包周期节点时返回。 
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public NodeExtendParam withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订 - “true”：自动续订 - “false”：不自动续订 > billingMode为1或2（已废弃）时生效，不填写此参数时默认不会自动续费。 
     * @return isAutoRenew
     */
    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public NodeExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动扣款  - “true”：自动扣款 - “false”：不自动扣款  > billingMode为1或2（已废弃）时生效，billingMode为1时不填写此参数时默认不会自动扣款。（已废弃：billingMode为2时不填写此参数时默认会自动扣款） 
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public NodeExtendParam withDockerLVMConfigOverride(String dockerLVMConfigOverride) {
        this.dockerLVMConfigOverride = dockerLVMConfigOverride;
        return this;
    }

    /**
     * Docker数据盘配置项（已废弃，请使用storage字段）。默认配置示例如下：  ``` \"DockerLVMConfigOverride\":\"dockerThinpool=vgpaas/90%VG;kubernetesLV=vgpaas/10%VG;diskType=evs;lvType=linear\" ```  默认配置在无VD类型磁盘时，会由于数据盘查找失败而出错，请根据真实盘符类型填写diskType。 包含如下字段：   - userLV（可选）：用户空间的大小，示例格式：vgpaas/20%VG   - userPath（可选）：用户空间挂载路径，示例格式：/home/wqt-test   - diskType：磁盘类型，目前只有evs、hdd和ssd三种格式   - lvType：逻辑卷的类型，目前支持linear和striped两种，示例格式：striped   - dockerThinpool：Docker盘的空间大小，示例格式：vgpaas/60%VG   - kubernetesLV：Kubelet空间大小，示例格式：vgpaas/20%VG 
     * @return dockerLVMConfigOverride
     */
    public String getDockerLVMConfigOverride() {
        return dockerLVMConfigOverride;
    }

    public void setDockerLVMConfigOverride(String dockerLVMConfigOverride) {
        this.dockerLVMConfigOverride = dockerLVMConfigOverride;
    }

    public NodeExtendParam withDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * 节点上单容器的可用磁盘空间大小，单位G。  不配置该值或值为0时将使用默认值，Devicemapper模式下默认值为10；OverlayFS模式默认不限制单容器可用空间大小，且dockerBaseSize设置仅在新版本集群的EulerOS节点上生效。  CCE节点容器运行时空间配置请参考[数据盘空间分配说明](cce_01_0341.xml)。  Devicemapper模式下建议dockerBaseSize配置不超过80G，设置过大时可能会导致容器运行时初始化时间过长而启动失败，若对容器磁盘大小有特殊要求，可考虑使用挂载外部或本地存储方式代替。 
     * minimum: 10
     * maximum: 500
     * @return dockerBaseSize
     */
    public Integer getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public NodeExtendParam withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * 节点的公钥。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public NodeExtendParam withAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
        return this;
    }

    /**
     * 安装前执行脚本 > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64 
     * @return alphaCcePreInstall
     */
    public String getAlphaCcePreInstall() {
        return alphaCcePreInstall;
    }

    public void setAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
    }

    public NodeExtendParam withAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
        return this;
    }

    /**
     * 安装后执行脚本 > 输入的值需要经过Base64编码，方法为echo -n \"待编码内容\" | base64。 
     * @return alphaCcePostInstall
     */
    public String getAlphaCcePostInstall() {
        return alphaCcePostInstall;
    }

    public void setAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
    }

    public NodeExtendParam withAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
        return this;
    }

    /**
     * 如果创建裸金属节点，需要使用自定义镜像时用此参数。 
     * @return alphaCceNodeImageID
     */
    public String getAlphaCceNodeImageID() {
        return alphaCceNodeImageID;
    }

    public void setAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
    }

    public NodeExtendParam withNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
        return this;
    }

    /**
     * - 弹性网卡队列数配置，默认配置示例如下：  ``` \"[{\\\"queue\\\":4}]\" ```  包含如下字段： - queue: 弹性网卡队列数。 - 仅在turbo集群的BMS节点时，该字段才可配置。 - 当前支持可配置队列数以及弹性网卡数：{\"1\":128, \"2\":92, \"4\":92, \"8\":32, \"16\":16,\"28\":9}, 既1弹性网卡队列可绑定128张弹性网卡，2队列弹性网卡可绑定92张，以此类推。 - 弹性网卡队列数越多，性能越强，但可绑定弹性网卡数越少，请根据您的需求进行配置（创建后不可修改）。 
     * @return nicMultiqueue
     */
    public String getNicMultiqueue() {
        return nicMultiqueue;
    }

    public void setNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
    }

    public NodeExtendParam withNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
        return this;
    }

    /**
     * - 弹性网卡预绑定比例配置，默认配置示例如下： ``` \"0.3:0.6\" ```   - 第一位小数：预绑定低水位，弹性网卡预绑定的最低比例（最小预绑定弹性网卡数 = ⌊节点的总弹性网卡数 * 预绑定低水位⌋）   - 第二位小数：预绑定高水位，弹性网卡预绑定的最高比例（最大预绑定弹性网卡数 = ⌊节点的总弹性网卡数 * 预绑定高水位⌋）   - BMS节点上绑定的弹性网卡数：Pod正在使用的弹性网卡数 + 最小预绑定弹性网卡数 < BMS节点上绑定的弹性网卡数 < Pod正在使用的弹性网卡数 + 最大预绑定弹性网卡数   - BMS节点上当预绑定弹性网卡数 < 最小预绑定弹性网卡数时：会绑定弹性网卡，使得预绑定弹性网卡数 = 最小预绑定弹性网卡数   - BMS节点上当预绑定弹性网卡数 > 最大预绑定弹性网卡数时：会定时解绑弹性网卡（约2分钟一次），直到预绑定弹性网卡数 = 最大预绑定弹性网卡数   - 取值范围：[0.0, 1.0]; 一位小数; 低水位 <= 高水位 - 仅在turbo集群的BMS节点时，该字段才可配置。 - 弹性网卡预绑定能加快工作负载的创建，但会占用IP，请根据您的需求进行配置。 
     * @return nicThreshold
     */
    public String getNicThreshold() {
        return nicThreshold;
    }

    public void setNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
    }

    public NodeExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 节点的计费模式。已废弃，请使用NodeSpec中的billingMode字段。 
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public NodeExtendParam withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托的名称。  委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为CCE节点提供访问云服务器的临时凭证。 作为响应参数仅在创建节点传入时返回该字段。 
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public NodeExtendParam withKubeReservedMem(Integer kubeReservedMem) {
        this.kubeReservedMem = kubeReservedMem;
        return this;
    }

    /**
     * 节点内存预留，Kubernetes相关组件预留值。[随节点规格变动，具体请参见[节点预留资源策略说明](https://support.huaweicloud.com/usermanual-cce/cce_10_0178.html)。](tag:hws) 
     * @return kubeReservedMem
     */
    public Integer getKubeReservedMem() {
        return kubeReservedMem;
    }

    public void setKubeReservedMem(Integer kubeReservedMem) {
        this.kubeReservedMem = kubeReservedMem;
    }

    public NodeExtendParam withSystemReservedMem(Integer systemReservedMem) {
        this.systemReservedMem = systemReservedMem;
        return this;
    }

    /**
     * 节点内存预留，系统组件预留值。[随节点规格变动，具体请参见[节点预留资源策略说明](https://support.huaweicloud.com/usermanual-cce/cce_10_0178.html)。](tag:hws) 
     * @return systemReservedMem
     */
    public Integer getSystemReservedMem() {
        return systemReservedMem;
    }

    public void setSystemReservedMem(Integer systemReservedMem) {
        this.systemReservedMem = systemReservedMem;
    }

    public NodeExtendParam withInitNodePassword(String initNodePassword) {
        this.initNodePassword = initNodePassword;
        return this;
    }

    /**
     * 节点密码，作为响应参数时，固定展示星号。
     * @return initNodePassword
     */
    public String getInitNodePassword() {
        return initNodePassword;
    }

    public void setInitNodePassword(String initNodePassword) {
        this.initNodePassword = initNodePassword;
    }

    public NodeExtendParam withSecurityReinforcementType(SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
        return this;
    }

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： 取值范围：['null', cybersecurity]; **默认取值**： 不涉及
     * @return securityReinforcementType
     */
    public SecurityReinforcementTypeEnum getSecurityReinforcementType() {
        return securityReinforcementType;
    }

    public void setSecurityReinforcementType(SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeExtendParam that = (NodeExtendParam) obj;
        return Objects.equals(this.ecsPerformancetype, that.ecsPerformancetype)
            && Objects.equals(this.orderID, that.orderID) && Objects.equals(this.productID, that.productID)
            && Objects.equals(this.maxPods, that.maxPods) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.dockerLVMConfigOverride, that.dockerLVMConfigOverride)
            && Objects.equals(this.dockerBaseSize, that.dockerBaseSize)
            && Objects.equals(this.publicKey, that.publicKey)
            && Objects.equals(this.alphaCcePreInstall, that.alphaCcePreInstall)
            && Objects.equals(this.alphaCcePostInstall, that.alphaCcePostInstall)
            && Objects.equals(this.alphaCceNodeImageID, that.alphaCceNodeImageID)
            && Objects.equals(this.nicMultiqueue, that.nicMultiqueue)
            && Objects.equals(this.nicThreshold, that.nicThreshold)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.kubeReservedMem, that.kubeReservedMem)
            && Objects.equals(this.systemReservedMem, that.systemReservedMem)
            && Objects.equals(this.initNodePassword, that.initNodePassword)
            && Objects.equals(this.securityReinforcementType, that.securityReinforcementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsPerformancetype,
            orderID,
            productID,
            maxPods,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            dockerLVMConfigOverride,
            dockerBaseSize,
            publicKey,
            alphaCcePreInstall,
            alphaCcePostInstall,
            alphaCceNodeImageID,
            nicMultiqueue,
            nicThreshold,
            chargingMode,
            agencyName,
            kubeReservedMem,
            systemReservedMem,
            initNodePassword,
            securityReinforcementType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExtendParam {\n");
        sb.append("    ecsPerformancetype: ").append(toIndentedString(ecsPerformancetype)).append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
        sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
        sb.append("    maxPods: ").append(toIndentedString(maxPods)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    dockerLVMConfigOverride: ").append(toIndentedString(dockerLVMConfigOverride)).append("\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    alphaCcePreInstall: ").append(toIndentedString(alphaCcePreInstall)).append("\n");
        sb.append("    alphaCcePostInstall: ").append(toIndentedString(alphaCcePostInstall)).append("\n");
        sb.append("    alphaCceNodeImageID: ").append(toIndentedString(alphaCceNodeImageID)).append("\n");
        sb.append("    nicMultiqueue: ").append(toIndentedString(nicMultiqueue)).append("\n");
        sb.append("    nicThreshold: ").append(toIndentedString(nicThreshold)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    kubeReservedMem: ").append(toIndentedString(kubeReservedMem)).append("\n");
        sb.append("    systemReservedMem: ").append(toIndentedString(systemReservedMem)).append("\n");
        sb.append("    initNodePassword: ").append(toIndentedString(initNodePassword)).append("\n");
        sb.append("    securityReinforcementType: ").append(toIndentedString(securityReinforcementType)).append("\n");
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

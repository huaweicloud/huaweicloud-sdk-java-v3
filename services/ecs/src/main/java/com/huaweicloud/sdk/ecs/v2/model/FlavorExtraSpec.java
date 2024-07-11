package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云服务器规格的扩展字段。
 */
public class FlavorExtraSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:performancetype")

    private String ecsPerformancetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:numa_nodes")

    private String hwNumaNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpet_support")

    private String hpetSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:type")

    private String instanceVnicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:instance_bandwidth")

    private String instanceVnicInstanceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_vnic:max_count")

    private String instanceVnicMaxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:local_disk")

    private String quotaLocalDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:nvme_ssd")

    private String quotaNvmeSsd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_spec:io:persistent_grant")

    private String extraSpecIoPersistentGrant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:generation")

    private String ecsGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:virtualization_env_types")

    private String ecsVirtualizationEnvTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:enable_gpu")

    private String pciPassthroughEnableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:gpu_specs")

    private String pciPassthroughGpuSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:alias")

    private String pciPassthroughAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:status")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:az")

    private String condOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:max_rate")

    private String quotaMaxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:min_rate")

    private String quotaMinRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:max_pps")

    private String quotaMaxPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:charge")

    private String condOperationCharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:charge:stop")

    private String condOperationChargeStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:spot:operation:az")

    private String condSpotOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:roles")

    private String condOperationRoles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:spot:operation:status")

    private String condSpotOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:network")

    private String condNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:storage")

    private String condStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:storage:type")

    private String condStorageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:compute:live_resizable")

    private String condComputeLiveResizable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:compute")

    private String condCompute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:gpu:name")

    private String infoGpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:cpu:name")

    private String infoCpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:gpu")

    private String quotaGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:vif_max_num")

    private String quotaVifMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota:sub_network_interface_max_num")

    private String quotaSubNetworkInterfaceMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:instance_architecture")

    private String ecsInstanceArchitecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interface:traffic_mirroring_supported")

    private String networkInterfaceTrafficMirroringSupported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security:enclave_supported")

    private String securityEnclaveSupported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:gpus")

    private String infoGpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:asic_accelerators")

    private String infoAsicAccelerators;

    public FlavorExtraSpec withEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
        return this;
    }

    /**
     * 云服务器规格的分类：  - normal：通用型 - entry：通用入门型 - cpuv1：计算I型 - cpuv2：计算II型 - computingv3：通用计算增强型 - kunpeng_computing：鲲鹏通用计算增强型 - kunpeng_highmem：鲲鹏内存优化型 - highmem：内存优化型 - saphana：大内存型 - diskintensive：磁盘增强型 - highio：超高I/O型 - ultracpu：超高性能计算型 - gpu：GPU加速型 - fpga：FPGA加速型 - ascend：AI加速型  > 说明：  - 早期注册的规格该字段为hws:performancetype。
     * @return ecsPerformancetype
     */
    public String getEcsPerformancetype() {
        return ecsPerformancetype;
    }

    public void setEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
    }

    public FlavorExtraSpec withHwNumaNodes(String hwNumaNodes) {
        this.hwNumaNodes = hwNumaNodes;
        return this;
    }

    /**
     * 主机的物理cpu数量。
     * @return hwNumaNodes
     */
    public String getHwNumaNodes() {
        return hwNumaNodes;
    }

    public void setHwNumaNodes(String hwNumaNodes) {
        this.hwNumaNodes = hwNumaNodes;
    }

    public FlavorExtraSpec withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。resource_type是为了区分云服务器的物理主机类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FlavorExtraSpec withHpetSupport(String hpetSupport) {
        this.hpetSupport = hpetSupport;
        return this;
    }

    /**
     * 弹性运服务器高精度时钟是否开启，开启为true，否则为false。（该字段是否返回根据云服务器规格而定）
     * @return hpetSupport
     */
    public String getHpetSupport() {
        return hpetSupport;
    }

    public void setHpetSupport(String hpetSupport) {
        this.hpetSupport = hpetSupport;
    }

    public FlavorExtraSpec withInstanceVnicType(String instanceVnicType) {
        this.instanceVnicType = instanceVnicType;
        return this;
    }

    /**
     * 网卡类型，值固定为“enhanced”，表示使用增强型网络的资源创建云服务器。
     * @return instanceVnicType
     */
    public String getInstanceVnicType() {
        return instanceVnicType;
    }

    public void setInstanceVnicType(String instanceVnicType) {
        this.instanceVnicType = instanceVnicType;
    }

    public FlavorExtraSpec withInstanceVnicInstanceBandwidth(String instanceVnicInstanceBandwidth) {
        this.instanceVnicInstanceBandwidth = instanceVnicInstanceBandwidth;
        return this;
    }

    /**
     * 最大带宽，单位Mbps，最大值为10000。
     * @return instanceVnicInstanceBandwidth
     */
    public String getInstanceVnicInstanceBandwidth() {
        return instanceVnicInstanceBandwidth;
    }

    public void setInstanceVnicInstanceBandwidth(String instanceVnicInstanceBandwidth) {
        this.instanceVnicInstanceBandwidth = instanceVnicInstanceBandwidth;
    }

    public FlavorExtraSpec withInstanceVnicMaxCount(String instanceVnicMaxCount) {
        this.instanceVnicMaxCount = instanceVnicMaxCount;
        return this;
    }

    /**
     * 最大网卡个数，最大为4。
     * @return instanceVnicMaxCount
     */
    public String getInstanceVnicMaxCount() {
        return instanceVnicMaxCount;
    }

    public void setInstanceVnicMaxCount(String instanceVnicMaxCount) {
        this.instanceVnicMaxCount = instanceVnicMaxCount;
    }

    public FlavorExtraSpec withQuotaLocalDisk(String quotaLocalDisk) {
        this.quotaLocalDisk = quotaLocalDisk;
        return this;
    }

    /**
     * 值格式为{type}:{count}:{size}:{safeFormat}，其中：  - type指磁盘类型，当前只支持hdd。 - count指本地磁盘数量，目前支持d1类型：3/6/12/24，d2类型：2/4/8/12/16/24，d3类型：2/4/8/12/16/24/28。 - size指单个磁盘容量，单位GB，目前只支持1675（实际磁盘大小为1800，格式化后可用大小为1675）。 - safeFormat指云服务器本地磁盘是否安全格式化，目前仅支持d1类型：FALSE，d2/d3类型：True。  > 说明：  - 磁盘增强型特有字段。
     * @return quotaLocalDisk
     */
    public String getQuotaLocalDisk() {
        return quotaLocalDisk;
    }

    public void setQuotaLocalDisk(String quotaLocalDisk) {
        this.quotaLocalDisk = quotaLocalDisk;
    }

    public FlavorExtraSpec withQuotaNvmeSsd(String quotaNvmeSsd) {
        this.quotaNvmeSsd = quotaNvmeSsd;
        return this;
    }

    /**
     * 值格式为{type}:{spec}:{size}:{safeFormat}，其中：  - type指主机上配备的nvme ssd的单卡容量大小，当前只支持1.6T/3.2T。 - spec指nvme ssd的规格，包括large/small。large表示大规格，small表示小规格。目前仅支持i3类型：large。 - size指guest使用的盘的容量大小，单位为GB。在spec值为large的情况下，此项即为host单卡大小。在spec值为small的情况下，此为1/4规格或者1/2规格。 - safeFormat指云服务器本地磁盘是否安全格式化，目前仅支持i3类型：True。  > 说明：  - 超高I/O型特有字段。
     * @return quotaNvmeSsd
     */
    public String getQuotaNvmeSsd() {
        return quotaNvmeSsd;
    }

    public void setQuotaNvmeSsd(String quotaNvmeSsd) {
        this.quotaNvmeSsd = quotaNvmeSsd;
    }

    public FlavorExtraSpec withExtraSpecIoPersistentGrant(String extraSpecIoPersistentGrant) {
        this.extraSpecIoPersistentGrant = extraSpecIoPersistentGrant;
        return this;
    }

    /**
     * 是否支持持久化，值为true。  代表云服务器访问存储的方式为持久化授权。   > 说明：  - 密集存储D1型特有字段。
     * @return extraSpecIoPersistentGrant
     */
    public String getExtraSpecIoPersistentGrant() {
        return extraSpecIoPersistentGrant;
    }

    public void setExtraSpecIoPersistentGrant(String extraSpecIoPersistentGrant) {
        this.extraSpecIoPersistentGrant = extraSpecIoPersistentGrant;
    }

    public FlavorExtraSpec withEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
        return this;
    }

    /**
     * 弹性云服务器类型的代数。  - s1：通用型I代 - s2：通用型II代 - s3：通用型 - m1：内存优化型I代 - m2：内存优化型II代 - m3：内存优化型 - h1：高性能计算型I代 - h2：高性能计算型II代 - h3：高性能计算型 - hi3：超高性能计算型 - d1：密集存储型I代 - d2：密集存储型II代 - d3：磁盘增强型 - g1：GPU加速型I代 - g2：GPU加速型II代 - f1：FPGA高性能型 - f2：FPGA通用型 - c3：通用计算增强型 - e3：大内存型 - i3：超高I/O型
     * @return ecsGeneration
     */
    public String getEcsGeneration() {
        return ecsGeneration;
    }

    public void setEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
    }

    public FlavorExtraSpec withEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
        return this;
    }

    /**
     * 虚拟化类型。  - 如果值为“FusionCompute”，表示弹性云服务器使用基于XEN的虚拟化技术。 - 如果值为“CloudCompute”，表示弹性云服务器使用基于KVM的虚拟化技术。
     * @return ecsVirtualizationEnvTypes
     */
    public String getEcsVirtualizationEnvTypes() {
        return ecsVirtualizationEnvTypes;
    }

    public void setEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
    }

    public FlavorExtraSpec withPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
        return this;
    }

    /**
     * 显卡是否直通。  值为“true”，表示GPU直通。
     * @return pciPassthroughEnableGpu
     */
    public String getPciPassthroughEnableGpu() {
        return pciPassthroughEnableGpu;
    }

    public void setPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
    }

    public FlavorExtraSpec withPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
        return this;
    }

    /**
     * G1型和G2型云服务器应用的技术，包括GPU虚拟化和GPU直通。  - 如果该规格的云服务器使用GPU虚拟化技术，且GPU卡的型号为M60-1Q，参数值可设置为“m60_1q:virt:1”。 - 如果该规格的云服务器使用GPU直通技术，且GPU卡的型号为M60，参数值可设置为“m60:direct_graphics:1”。
     * @return pciPassthroughGpuSpecs
     */
    public String getPciPassthroughGpuSpecs() {
        return pciPassthroughGpuSpecs;
    }

    public void setPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
    }

    public FlavorExtraSpec withPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
        return this;
    }

    /**
     * P1型v本地直通GPU的型号和数量，参数值可设置为“nvidia-p100:1”，表示使用该规格创建的弹性云服务器将占用1张NVIDIA P100显卡。
     * @return pciPassthroughAlias
     */
    public String getPciPassthroughAlias() {
        return pciPassthroughAlias;
    }

    public void setPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
    }

    public FlavorExtraSpec withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    /**
     * 此参数是Region级配置，某个AZ没有在cond:operation:az参数中配置时默认使用此参数的取值。不配置或无此参数时等同于“normal”。取值范围：  - normal：正常商用 - abandon：下线（即不显示） - sellout：售罄 - obt：公测 - promotion：推荐(等同normal，也是商用)
     * @return condOperationStatus
     */
    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public FlavorExtraSpec withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    /**
     * 此参数是AZ级配置，某个AZ没有在此参数中配置时默认使用cond:operation:status参数的取值。此参数的配置格式“az(xx)”。()内为某个AZ的flavor状态，()内必须要填有状态，不填为无效配置。状态的取值范围与cond:operation:status参数相同。  例如：flavor在某个region的az0正常商用，az1售罄，az2公测，az3正常商用，其他az显示下线，可配置为：  - “cond:operation:status”设置为“abandon” - “cond:operation:az”设置为“az0(normal), az1(sellout), az2(obt), az3(normal)”  > 说明：  - 如果flavor在某个AZ下的状态与cond:operation:status配置状态不同，必须配置该参数。
     * @return condOperationAz
     */
    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
    }

    public FlavorExtraSpec withQuotaMaxRate(String quotaMaxRate) {
        this.quotaMaxRate = quotaMaxRate;
        return this;
    }

    /**
     * 最大带宽  - 单位Mbps，显示为Gbps时除以1000
     * @return quotaMaxRate
     */
    public String getQuotaMaxRate() {
        return quotaMaxRate;
    }

    public void setQuotaMaxRate(String quotaMaxRate) {
        this.quotaMaxRate = quotaMaxRate;
    }

    public FlavorExtraSpec withQuotaMinRate(String quotaMinRate) {
        this.quotaMinRate = quotaMinRate;
        return this;
    }

    /**
     * 基准带宽  - 单位Mbps，显示为Gbps时除以1000
     * @return quotaMinRate
     */
    public String getQuotaMinRate() {
        return quotaMinRate;
    }

    public void setQuotaMinRate(String quotaMinRate) {
        this.quotaMinRate = quotaMinRate;
    }

    public FlavorExtraSpec withQuotaMaxPps(String quotaMaxPps) {
        this.quotaMaxPps = quotaMaxPps;
        return this;
    }

    /**
     * 内网最大收发包能力  - 单位个，显示为xx万时除以10000
     * @return quotaMaxPps
     */
    public String getQuotaMaxPps() {
        return quotaMaxPps;
    }

    public void setQuotaMaxPps(String quotaMaxPps) {
        this.quotaMaxPps = quotaMaxPps;
    }

    public FlavorExtraSpec withCondOperationCharge(String condOperationCharge) {
        this.condOperationCharge = condOperationCharge;
        return this;
    }

    /**
     * 计费类型  - 计费场景，不配置时都支持 - period，包周期 - demand，按需
     * @return condOperationCharge
     */
    public String getCondOperationCharge() {
        return condOperationCharge;
    }

    public void setCondOperationCharge(String condOperationCharge) {
        this.condOperationCharge = condOperationCharge;
    }

    public FlavorExtraSpec withCondOperationChargeStop(String condOperationChargeStop) {
        this.condOperationChargeStop = condOperationChargeStop;
        return this;
    }

    /**
     * 关机是否收费  - 关机是否计费，默认免费： - charge - free
     * @return condOperationChargeStop
     */
    public String getCondOperationChargeStop() {
        return condOperationChargeStop;
    }

    public void setCondOperationChargeStop(String condOperationChargeStop) {
        this.condOperationChargeStop = condOperationChargeStop;
    }

    public FlavorExtraSpec withCondSpotOperationAz(String condSpotOperationAz) {
        this.condSpotOperationAz = condSpotOperationAz;
        return this;
    }

    /**
     * 计费类型  - 计费场景，不配置时都支持 - period，包周期 - demand，按需
     * @return condSpotOperationAz
     */
    public String getCondSpotOperationAz() {
        return condSpotOperationAz;
    }

    public void setCondSpotOperationAz(String condSpotOperationAz) {
        this.condSpotOperationAz = condSpotOperationAz;
    }

    public FlavorExtraSpec withCondOperationRoles(String condOperationRoles) {
        this.condOperationRoles = condOperationRoles;
        return this;
    }

    /**
     * 允许的角色 匹配的用户标签（roles的op_gatexxx标签）。不设置时所有用户可见
     * @return condOperationRoles
     */
    public String getCondOperationRoles() {
        return condOperationRoles;
    }

    public void setCondOperationRoles(String condOperationRoles) {
        this.condOperationRoles = condOperationRoles;
    }

    public FlavorExtraSpec withCondSpotOperationStatus(String condSpotOperationStatus) {
        this.condSpotOperationStatus = condSpotOperationStatus;
        return this;
    }

    /**
     * Flavor在竞价销售模式下的状态  - 不配置时等同abandon - normal，正常商用 - abandon，下线 - sellout，售罄 - obt，公测，未申请时提示申请（暂不支持） - private，私有，只给特定用户显示（暂不支持） - test，试用/免费（暂不支持） - promotion，推荐
     * @return condSpotOperationStatus
     */
    public String getCondSpotOperationStatus() {
        return condSpotOperationStatus;
    }

    public void setCondSpotOperationStatus(String condSpotOperationStatus) {
        this.condSpotOperationStatus = condSpotOperationStatus;
    }

    public FlavorExtraSpec withCondNetwork(String condNetwork) {
        this.condNetwork = condNetwork;
        return this;
    }

    /**
     * 网络约束 支持网络特性，不配置时以UI配置为准。
     * @return condNetwork
     */
    public String getCondNetwork() {
        return condNetwork;
    }

    public void setCondNetwork(String condNetwork) {
        this.condNetwork = condNetwork;
    }

    public FlavorExtraSpec withCondStorage(String condStorage) {
        this.condStorage = condStorage;
        return this;
    }

    /**
     * 存储约束  - 支持磁盘特性，不配置时以UI配置为准。 - scsi，支持scsi - localdisk，支持本地盘 - ib，支持ib
     * @return condStorage
     */
    public String getCondStorage() {
        return condStorage;
    }

    public void setCondStorage(String condStorage) {
        this.condStorage = condStorage;
    }

    public FlavorExtraSpec withCondStorageType(String condStorageType) {
        this.condStorageType = condStorageType;
        return this;
    }

    /**
     * 存储约束  - 支持磁盘特性，不配置时以UI配置为准。
     * @return condStorageType
     */
    public String getCondStorageType() {
        return condStorageType;
    }

    public void setCondStorageType(String condStorageType) {
        this.condStorageType = condStorageType;
    }

    public FlavorExtraSpec withCondComputeLiveResizable(String condComputeLiveResizable) {
        this.condComputeLiveResizable = condComputeLiveResizable;
        return this;
    }

    /**
     * 计算约束  - true，支持在线扩容。 - false或不存在该字段，不支持在线扩容。
     * @return condComputeLiveResizable
     */
    public String getCondComputeLiveResizable() {
        return condComputeLiveResizable;
    }

    public void setCondComputeLiveResizable(String condComputeLiveResizable) {
        this.condComputeLiveResizable = condComputeLiveResizable;
    }

    public FlavorExtraSpec withCondCompute(String condCompute) {
        this.condCompute = condCompute;
        return this;
    }

    /**
     * 计算约束  - autorecovery，自动恢复特性。 - 不存在该字段，不支持自动恢复。
     * @return condCompute
     */
    public String getCondCompute() {
        return condCompute;
    }

    public void setCondCompute(String condCompute) {
        this.condCompute = condCompute;
    }

    public FlavorExtraSpec withInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
        return this;
    }

    /**
     * 
     * @return infoGpuName
     */
    public String getInfoGpuName() {
        return infoGpuName;
    }

    public void setInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
    }

    public FlavorExtraSpec withInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
        return this;
    }

    /**
     * 
     * @return infoCpuName
     */
    public String getInfoCpuName() {
        return infoCpuName;
    }

    public void setInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
    }

    public FlavorExtraSpec withQuotaGpu(String quotaGpu) {
        this.quotaGpu = quotaGpu;
        return this;
    }

    /**
     * 
     * @return quotaGpu
     */
    public String getQuotaGpu() {
        return quotaGpu;
    }

    public void setQuotaGpu(String quotaGpu) {
        this.quotaGpu = quotaGpu;
    }

    public FlavorExtraSpec withQuotaVifMaxNum(String quotaVifMaxNum) {
        this.quotaVifMaxNum = quotaVifMaxNum;
        return this;
    }

    /**
     * 最多支持的弹性网卡个数
     * @return quotaVifMaxNum
     */
    public String getQuotaVifMaxNum() {
        return quotaVifMaxNum;
    }

    public void setQuotaVifMaxNum(String quotaVifMaxNum) {
        this.quotaVifMaxNum = quotaVifMaxNum;
    }

    public FlavorExtraSpec withQuotaSubNetworkInterfaceMaxNum(String quotaSubNetworkInterfaceMaxNum) {
        this.quotaSubNetworkInterfaceMaxNum = quotaSubNetworkInterfaceMaxNum;
        return this;
    }

    /**
     * 最多支持的辅助弹性网卡个数
     * @return quotaSubNetworkInterfaceMaxNum
     */
    public String getQuotaSubNetworkInterfaceMaxNum() {
        return quotaSubNetworkInterfaceMaxNum;
    }

    public void setQuotaSubNetworkInterfaceMaxNum(String quotaSubNetworkInterfaceMaxNum) {
        this.quotaSubNetworkInterfaceMaxNum = quotaSubNetworkInterfaceMaxNum;
    }

    public FlavorExtraSpec withEcsInstanceArchitecture(String ecsInstanceArchitecture) {
        this.ecsInstanceArchitecture = ecsInstanceArchitecture;
        return this;
    }

    /**
     * 该规格对应的CPU架构，且仅鲲鹏实例架构规格返回该字段  - 取值为arm64表示CPU架构为鲲鹏计算。
     * @return ecsInstanceArchitecture
     */
    public String getEcsInstanceArchitecture() {
        return ecsInstanceArchitecture;
    }

    public void setEcsInstanceArchitecture(String ecsInstanceArchitecture) {
        this.ecsInstanceArchitecture = ecsInstanceArchitecture;
    }

    public FlavorExtraSpec withNetworkInterfaceTrafficMirroringSupported(
        String networkInterfaceTrafficMirroringSupported) {
        this.networkInterfaceTrafficMirroringSupported = networkInterfaceTrafficMirroringSupported;
        return this;
    }

    /**
     * 该规格是否支持流量镜像。
     * @return networkInterfaceTrafficMirroringSupported
     */
    public String getNetworkInterfaceTrafficMirroringSupported() {
        return networkInterfaceTrafficMirroringSupported;
    }

    public void setNetworkInterfaceTrafficMirroringSupported(String networkInterfaceTrafficMirroringSupported) {
        this.networkInterfaceTrafficMirroringSupported = networkInterfaceTrafficMirroringSupported;
    }

    public FlavorExtraSpec withSecurityEnclaveSupported(String securityEnclaveSupported) {
        this.securityEnclaveSupported = securityEnclaveSupported;
        return this;
    }

    /**
     * 该规格是否支持QingTian Enclave。
     * @return securityEnclaveSupported
     */
    public String getSecurityEnclaveSupported() {
        return securityEnclaveSupported;
    }

    public void setSecurityEnclaveSupported(String securityEnclaveSupported) {
        this.securityEnclaveSupported = securityEnclaveSupported;
    }

    public FlavorExtraSpec withInfoGpus(String infoGpus) {
        this.infoGpus = infoGpus;
        return this;
    }

    /**
     * 该规格的GPU卡信息。  name：GPU名称 memory_mb：GPU显存大小 count：GPU显卡数量 alias_prefix：GPU显卡内部别名
     * @return infoGpus
     */
    public String getInfoGpus() {
        return infoGpus;
    }

    public void setInfoGpus(String infoGpus) {
        this.infoGpus = infoGpus;
    }

    public FlavorExtraSpec withInfoAsicAccelerators(String infoAsicAccelerators) {
        this.infoAsicAccelerators = infoAsicAccelerators;
        return this;
    }

    /**
     * 该规格的加速器信息。  name：加速器名称 memory_mb：加速器显存大小 count：加速器显卡数量 alias_prefix：加速器显卡内部别名
     * @return infoAsicAccelerators
     */
    public String getInfoAsicAccelerators() {
        return infoAsicAccelerators;
    }

    public void setInfoAsicAccelerators(String infoAsicAccelerators) {
        this.infoAsicAccelerators = infoAsicAccelerators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorExtraSpec that = (FlavorExtraSpec) obj;
        return Objects.equals(this.ecsPerformancetype, that.ecsPerformancetype)
            && Objects.equals(this.hwNumaNodes, that.hwNumaNodes)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.hpetSupport, that.hpetSupport)
            && Objects.equals(this.instanceVnicType, that.instanceVnicType)
            && Objects.equals(this.instanceVnicInstanceBandwidth, that.instanceVnicInstanceBandwidth)
            && Objects.equals(this.instanceVnicMaxCount, that.instanceVnicMaxCount)
            && Objects.equals(this.quotaLocalDisk, that.quotaLocalDisk)
            && Objects.equals(this.quotaNvmeSsd, that.quotaNvmeSsd)
            && Objects.equals(this.extraSpecIoPersistentGrant, that.extraSpecIoPersistentGrant)
            && Objects.equals(this.ecsGeneration, that.ecsGeneration)
            && Objects.equals(this.ecsVirtualizationEnvTypes, that.ecsVirtualizationEnvTypes)
            && Objects.equals(this.pciPassthroughEnableGpu, that.pciPassthroughEnableGpu)
            && Objects.equals(this.pciPassthroughGpuSpecs, that.pciPassthroughGpuSpecs)
            && Objects.equals(this.pciPassthroughAlias, that.pciPassthroughAlias)
            && Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.condOperationAz, that.condOperationAz)
            && Objects.equals(this.quotaMaxRate, that.quotaMaxRate)
            && Objects.equals(this.quotaMinRate, that.quotaMinRate)
            && Objects.equals(this.quotaMaxPps, that.quotaMaxPps)
            && Objects.equals(this.condOperationCharge, that.condOperationCharge)
            && Objects.equals(this.condOperationChargeStop, that.condOperationChargeStop)
            && Objects.equals(this.condSpotOperationAz, that.condSpotOperationAz)
            && Objects.equals(this.condOperationRoles, that.condOperationRoles)
            && Objects.equals(this.condSpotOperationStatus, that.condSpotOperationStatus)
            && Objects.equals(this.condNetwork, that.condNetwork) && Objects.equals(this.condStorage, that.condStorage)
            && Objects.equals(this.condStorageType, that.condStorageType)
            && Objects.equals(this.condComputeLiveResizable, that.condComputeLiveResizable)
            && Objects.equals(this.condCompute, that.condCompute) && Objects.equals(this.infoGpuName, that.infoGpuName)
            && Objects.equals(this.infoCpuName, that.infoCpuName) && Objects.equals(this.quotaGpu, that.quotaGpu)
            && Objects.equals(this.quotaVifMaxNum, that.quotaVifMaxNum)
            && Objects.equals(this.quotaSubNetworkInterfaceMaxNum, that.quotaSubNetworkInterfaceMaxNum)
            && Objects.equals(this.ecsInstanceArchitecture, that.ecsInstanceArchitecture)
            && Objects.equals(this.networkInterfaceTrafficMirroringSupported,
                that.networkInterfaceTrafficMirroringSupported)
            && Objects.equals(this.securityEnclaveSupported, that.securityEnclaveSupported)
            && Objects.equals(this.infoGpus, that.infoGpus)
            && Objects.equals(this.infoAsicAccelerators, that.infoAsicAccelerators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsPerformancetype,
            hwNumaNodes,
            resourceType,
            hpetSupport,
            instanceVnicType,
            instanceVnicInstanceBandwidth,
            instanceVnicMaxCount,
            quotaLocalDisk,
            quotaNvmeSsd,
            extraSpecIoPersistentGrant,
            ecsGeneration,
            ecsVirtualizationEnvTypes,
            pciPassthroughEnableGpu,
            pciPassthroughGpuSpecs,
            pciPassthroughAlias,
            condOperationStatus,
            condOperationAz,
            quotaMaxRate,
            quotaMinRate,
            quotaMaxPps,
            condOperationCharge,
            condOperationChargeStop,
            condSpotOperationAz,
            condOperationRoles,
            condSpotOperationStatus,
            condNetwork,
            condStorage,
            condStorageType,
            condComputeLiveResizable,
            condCompute,
            infoGpuName,
            infoCpuName,
            quotaGpu,
            quotaVifMaxNum,
            quotaSubNetworkInterfaceMaxNum,
            ecsInstanceArchitecture,
            networkInterfaceTrafficMirroringSupported,
            securityEnclaveSupported,
            infoGpus,
            infoAsicAccelerators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorExtraSpec {\n");
        sb.append("    ecsPerformancetype: ").append(toIndentedString(ecsPerformancetype)).append("\n");
        sb.append("    hwNumaNodes: ").append(toIndentedString(hwNumaNodes)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    hpetSupport: ").append(toIndentedString(hpetSupport)).append("\n");
        sb.append("    instanceVnicType: ").append(toIndentedString(instanceVnicType)).append("\n");
        sb.append("    instanceVnicInstanceBandwidth: ")
            .append(toIndentedString(instanceVnicInstanceBandwidth))
            .append("\n");
        sb.append("    instanceVnicMaxCount: ").append(toIndentedString(instanceVnicMaxCount)).append("\n");
        sb.append("    quotaLocalDisk: ").append(toIndentedString(quotaLocalDisk)).append("\n");
        sb.append("    quotaNvmeSsd: ").append(toIndentedString(quotaNvmeSsd)).append("\n");
        sb.append("    extraSpecIoPersistentGrant: ").append(toIndentedString(extraSpecIoPersistentGrant)).append("\n");
        sb.append("    ecsGeneration: ").append(toIndentedString(ecsGeneration)).append("\n");
        sb.append("    ecsVirtualizationEnvTypes: ").append(toIndentedString(ecsVirtualizationEnvTypes)).append("\n");
        sb.append("    pciPassthroughEnableGpu: ").append(toIndentedString(pciPassthroughEnableGpu)).append("\n");
        sb.append("    pciPassthroughGpuSpecs: ").append(toIndentedString(pciPassthroughGpuSpecs)).append("\n");
        sb.append("    pciPassthroughAlias: ").append(toIndentedString(pciPassthroughAlias)).append("\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
        sb.append("    quotaMaxRate: ").append(toIndentedString(quotaMaxRate)).append("\n");
        sb.append("    quotaMinRate: ").append(toIndentedString(quotaMinRate)).append("\n");
        sb.append("    quotaMaxPps: ").append(toIndentedString(quotaMaxPps)).append("\n");
        sb.append("    condOperationCharge: ").append(toIndentedString(condOperationCharge)).append("\n");
        sb.append("    condOperationChargeStop: ").append(toIndentedString(condOperationChargeStop)).append("\n");
        sb.append("    condSpotOperationAz: ").append(toIndentedString(condSpotOperationAz)).append("\n");
        sb.append("    condOperationRoles: ").append(toIndentedString(condOperationRoles)).append("\n");
        sb.append("    condSpotOperationStatus: ").append(toIndentedString(condSpotOperationStatus)).append("\n");
        sb.append("    condNetwork: ").append(toIndentedString(condNetwork)).append("\n");
        sb.append("    condStorage: ").append(toIndentedString(condStorage)).append("\n");
        sb.append("    condStorageType: ").append(toIndentedString(condStorageType)).append("\n");
        sb.append("    condComputeLiveResizable: ").append(toIndentedString(condComputeLiveResizable)).append("\n");
        sb.append("    condCompute: ").append(toIndentedString(condCompute)).append("\n");
        sb.append("    infoGpuName: ").append(toIndentedString(infoGpuName)).append("\n");
        sb.append("    infoCpuName: ").append(toIndentedString(infoCpuName)).append("\n");
        sb.append("    quotaGpu: ").append(toIndentedString(quotaGpu)).append("\n");
        sb.append("    quotaVifMaxNum: ").append(toIndentedString(quotaVifMaxNum)).append("\n");
        sb.append("    quotaSubNetworkInterfaceMaxNum: ")
            .append(toIndentedString(quotaSubNetworkInterfaceMaxNum))
            .append("\n");
        sb.append("    ecsInstanceArchitecture: ").append(toIndentedString(ecsInstanceArchitecture)).append("\n");
        sb.append("    networkInterfaceTrafficMirroringSupported: ")
            .append(toIndentedString(networkInterfaceTrafficMirroringSupported))
            .append("\n");
        sb.append("    securityEnclaveSupported: ").append(toIndentedString(securityEnclaveSupported)).append("\n");
        sb.append("    infoGpus: ").append(toIndentedString(infoGpus)).append("\n");
        sb.append("    infoAsicAccelerators: ").append(toIndentedString(infoAsicAccelerators)).append("\n");
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

package com.huaweicloud.sdk.waf.v1.model;

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
public class UpdatePremiumInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancename")

    private String instancename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_flavor")

    private String cpuFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ip")

    private String serviceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ipv6")

    private String serviceIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatIp")

    private String floatIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private List<String> securityGroupIds = null;

    /**
     * **参数解释：** 独享引擎计费状态标识，用于指示独享引擎当前的计费使用状态 **约束限制：** 不涉及 **取值范围：**  - 0：正常计费  - 1：冻结，资源和数据会保留，但租户无法再正常使用云服务  - 2：终止，资源和数据将清除 **默认取值：** 不涉及
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
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
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
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
     * **参数解释：** 独享引擎运行状态标识，用于反映独享引擎当前的运行生命周期状态 **约束限制：** 不涉及 **取值范围：**  - 0：创建中  - 1：运行中  - 2：删除中  - 3：已删除  - 4：创建失败  - 5：已冻结  - 6：异常  - 7：更新中  - 8：更新失败 **默认取值：** 不涉及
     */
    public static final class RunStatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RunStatusEnum NUMBER_0 = new RunStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RunStatusEnum NUMBER_1 = new RunStatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final RunStatusEnum NUMBER_2 = new RunStatusEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final RunStatusEnum NUMBER_3 = new RunStatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final RunStatusEnum NUMBER_4 = new RunStatusEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final RunStatusEnum NUMBER_5 = new RunStatusEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final RunStatusEnum NUMBER_6 = new RunStatusEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final RunStatusEnum NUMBER_7 = new RunStatusEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final RunStatusEnum NUMBER_8 = new RunStatusEnum(8);

        private static final Map<Integer, RunStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RunStatusEnum> createStaticFields() {
            Map<Integer, RunStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RunStatusEnum(Integer value) {
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
        public static RunStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RunStatusEnum(value));
        }

        public static RunStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RunStatusEnum) {
                return this.value.equals(((RunStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private RunStatusEnum runStatus;

    /**
     * **参数解释：** 独享引擎接入状态 **约束限制：** 不涉及 **取值范围：**  - 0: 未接入  - 1: 已接入  **默认取值：** 不涉及
     */
    public static final class AccessStatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AccessStatusEnum NUMBER_0 = new AccessStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AccessStatusEnum NUMBER_1 = new AccessStatusEnum(1);

        private static final Map<Integer, AccessStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AccessStatusEnum> createStaticFields() {
            Map<Integer, AccessStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AccessStatusEnum(Integer value) {
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
        public static AccessStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessStatusEnum(value));
        }

        public static AccessStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessStatusEnum) {
                return this.value.equals(((AccessStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private AccessStatusEnum accessStatus;

    /**
     * **参数解释：** 独享引擎是否可升级（0：不可升级，1：可升级） **约束限制：** 不涉及 **取值范围：**  - 0: 不可升级  - 1: 可升级  **默认取值：** 不涉及
     */
    public static final class UpgradableEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final UpgradableEnum NUMBER_0 = new UpgradableEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final UpgradableEnum NUMBER_1 = new UpgradableEnum(1);

        private static final Map<Integer, UpgradableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, UpgradableEnum> createStaticFields() {
            Map<Integer, UpgradableEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        UpgradableEnum(Integer value) {
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
        public static UpgradableEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradableEnum(value));
        }

        public static UpgradableEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpgradableEnum) {
                return this.value.equals(((UpgradableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradable")

    private UpgradableEnum upgradable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpecCode")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<IdHostnameEntry> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    public UpdatePremiumInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 独享引擎ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdatePremiumInstanceResponse withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    /**
     * **参数解释：** 独享引擎名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    public UpdatePremiumInstanceResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释：** 独享引擎ECS ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public UpdatePremiumInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** Region代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public UpdatePremiumInstanceResponse withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * **参数解释：** 可用区代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public UpdatePremiumInstanceResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释：** CPU架构代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public UpdatePremiumInstanceResponse withCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
        return this;
    }

    /**
     * **参数解释：** ECS规格代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cpuFlavor
     */
    public String getCpuFlavor() {
        return cpuFlavor;
    }

    public void setCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
    }

    public UpdatePremiumInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 独享引擎所在VPC ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdatePremiumInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释：** 独享引擎所在VPC的子网ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UpdatePremiumInstanceResponse withServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }

    /**
     * **参数解释：** 独享引擎的业务面IP **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return serviceIp
     */
    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    public UpdatePremiumInstanceResponse withServiceIpv6(String serviceIpv6) {
        this.serviceIpv6 = serviceIpv6;
        return this;
    }

    /**
     * **参数解释：** 独享引擎的业务面IPV6地址 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return serviceIpv6
     */
    public String getServiceIpv6() {
        return serviceIpv6;
    }

    public void setServiceIpv6(String serviceIpv6) {
        this.serviceIpv6 = serviceIpv6;
    }

    public UpdatePremiumInstanceResponse withFloatIp(String floatIp) {
        this.floatIp = floatIp;
        return this;
    }

    /**
     * **参数解释：** 独享引擎的管理面IP **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return floatIp
     */
    public String getFloatIp() {
        return floatIp;
    }

    public void setFloatIp(String floatIp) {
        this.floatIp = floatIp;
    }

    public UpdatePremiumInstanceResponse withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public UpdatePremiumInstanceResponse addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public UpdatePremiumInstanceResponse withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * **参数解释：** 独享引擎ECS绑定的安全组 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public UpdatePremiumInstanceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 独享引擎计费状态标识，用于指示独享引擎当前的计费使用状态 **约束限制：** 不涉及 **取值范围：**  - 0：正常计费  - 1：冻结，资源和数据会保留，但租户无法再正常使用云服务  - 2：终止，资源和数据将清除 **默认取值：** 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdatePremiumInstanceResponse withRunStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * **参数解释：** 独享引擎运行状态标识，用于反映独享引擎当前的运行生命周期状态 **约束限制：** 不涉及 **取值范围：**  - 0：创建中  - 1：运行中  - 2：删除中  - 3：已删除  - 4：创建失败  - 5：已冻结  - 6：异常  - 7：更新中  - 8：更新失败 **默认取值：** 不涉及
     * @return runStatus
     */
    public RunStatusEnum getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
    }

    public UpdatePremiumInstanceResponse withAccessStatus(AccessStatusEnum accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * **参数解释：** 独享引擎接入状态 **约束限制：** 不涉及 **取值范围：**  - 0: 未接入  - 1: 已接入  **默认取值：** 不涉及
     * @return accessStatus
     */
    public AccessStatusEnum getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(AccessStatusEnum accessStatus) {
        this.accessStatus = accessStatus;
    }

    public UpdatePremiumInstanceResponse withUpgradable(UpgradableEnum upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    /**
     * **参数解释：** 独享引擎是否可升级（0：不可升级，1：可升级） **约束限制：** 不涉及 **取值范围：**  - 0: 不可升级  - 1: 可升级  **默认取值：** 不涉及
     * @return upgradable
     */
    public UpgradableEnum getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(UpgradableEnum upgradable) {
        this.upgradable = upgradable;
    }

    public UpdatePremiumInstanceResponse withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * **参数解释：** 云服务代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public UpdatePremiumInstanceResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释：** 云服务资源类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UpdatePremiumInstanceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * **参数解释：** 云服务资源代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public UpdatePremiumInstanceResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * **参数解释：** 独享引擎ECS规格，如\"8vCPUs | 16GB\" **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public UpdatePremiumInstanceResponse withHosts(List<IdHostnameEntry> hosts) {
        this.hosts = hosts;
        return this;
    }

    public UpdatePremiumInstanceResponse addHostsItem(IdHostnameEntry hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public UpdatePremiumInstanceResponse withHosts(Consumer<List<IdHostnameEntry>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 独享引擎防护的域名 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<IdHostnameEntry> getHosts() {
        return hosts;
    }

    public void setHosts(List<IdHostnameEntry> hosts) {
        this.hosts = hosts;
    }

    public UpdatePremiumInstanceResponse withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * **参数解释：** 存储类型（可选） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public UpdatePremiumInstanceResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释：** 存储资源池ID（可选） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdatePremiumInstanceResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 独享引擎所在WAF组的ID（仅适用特殊独享模式） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public UpdatePremiumInstanceResponse withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * **参数解释：** '计费模式。0: 包周期；1:按需' **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePremiumInstanceResponse that = (UpdatePremiumInstanceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instancename, that.instancename)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.zone, that.zone) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.cpuFlavor, that.cpuFlavor) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.serviceIp, that.serviceIp)
            && Objects.equals(this.serviceIpv6, that.serviceIpv6) && Objects.equals(this.floatIp, that.floatIp)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runStatus, that.runStatus) && Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.upgradable, that.upgradable)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.chargeMode, that.chargeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instancename,
            serverId,
            region,
            zone,
            arch,
            cpuFlavor,
            vpcId,
            subnetId,
            serviceIp,
            serviceIpv6,
            floatIp,
            securityGroupIds,
            status,
            runStatus,
            accessStatus,
            upgradable,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            specification,
            hosts,
            volumeType,
            clusterId,
            poolId,
            chargeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuFlavor: ").append(toIndentedString(cpuFlavor)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    serviceIp: ").append(toIndentedString(serviceIp)).append("\n");
        sb.append("    serviceIpv6: ").append(toIndentedString(serviceIpv6)).append("\n");
        sb.append("    floatIp: ").append(toIndentedString(floatIp)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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

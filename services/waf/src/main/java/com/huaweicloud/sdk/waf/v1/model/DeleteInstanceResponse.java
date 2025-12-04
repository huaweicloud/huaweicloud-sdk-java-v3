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
public class DeleteInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancename")

    private String instancename;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradable")

    private Integer upgradable;

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
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public DeleteInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 独享引擎实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteInstanceResponse withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    /**
     * 独享引擎实例名称
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    public DeleteInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 独享引擎实例Region ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DeleteInstanceResponse withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 可用区ID
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public DeleteInstanceResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * CPU架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public DeleteInstanceResponse withCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
        return this;
    }

    /**
     * ECS规格
     * @return cpuFlavor
     */
    public String getCpuFlavor() {
        return cpuFlavor;
    }

    public void setCpuFlavor(String cpuFlavor) {
        this.cpuFlavor = cpuFlavor;
    }

    public DeleteInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 独享引擎实例所在VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public DeleteInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 独享引擎实例所在VPC的子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public DeleteInstanceResponse withServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }

    /**
     * 独享引擎实例的业务面IP
     * @return serviceIp
     */
    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    public DeleteInstanceResponse withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public DeleteInstanceResponse addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public DeleteInstanceResponse withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * 独享引擎绑定的安全组
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public DeleteInstanceResponse withStatus(StatusEnum status) {
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

    public DeleteInstanceResponse withRunStatus(RunStatusEnum runStatus) {
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

    public DeleteInstanceResponse withAccessStatus(AccessStatusEnum accessStatus) {
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

    public DeleteInstanceResponse withUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    /**
     * 独享引擎是否可升级（0：不可升级，1：可升级）
     * @return upgradable
     */
    public Integer getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(Integer upgradable) {
        this.upgradable = upgradable;
    }

    public DeleteInstanceResponse withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务代码。 仅作为标记，用户可忽略。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public DeleteInstanceResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 云服务资源类型，仅作为标记，用户可忽略。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DeleteInstanceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 云服务资源代码。仅作为标记，用户可忽略。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public DeleteInstanceResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 独享引擎ECS规格，如\"8vCPUs | 16GB\"
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public DeleteInstanceResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 独享引擎ECS ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public DeleteInstanceResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 引擎实例创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteInstanceResponse that = (DeleteInstanceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instancename, that.instancename)
            && Objects.equals(this.region, that.region) && Objects.equals(this.zone, that.zone)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.cpuFlavor, that.cpuFlavor)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.serviceIp, that.serviceIp)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runStatus, that.runStatus) && Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.upgradable, that.upgradable)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.specification, that.specification) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instancename,
            region,
            zone,
            arch,
            cpuFlavor,
            vpcId,
            subnetId,
            serviceIp,
            securityGroupIds,
            status,
            runStatus,
            accessStatus,
            upgradable,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            specification,
            serverId,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    cpuFlavor: ").append(toIndentedString(cpuFlavor)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    serviceIp: ").append(toIndentedString(serviceIp)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerCreateRequest
 */
public class ServerCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_pass")

    private String adminPass;

    /**
     * **参数解释**：服务器规格架构类型。 **约束限制**：不涉及。 **取值范围**： - X86：CPU架构为X86 - ARM：CPU架构为ARM **默认取值**：不涉及。
     */
    public static final class ArchEnum {

        /**
         * Enum ARM for value: "ARM"
         */
        public static final ArchEnum ARM = new ArchEnum("ARM");

        /**
         * Enum X86 for value: "X86"
         */
        public static final ArchEnum X86 = new ArchEnum("X86");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("ARM", ARM);
            map.put("X86", X86);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_info")

    private ChargingInfo chargingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_name")

    private String keyPairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private ServerNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private EvsVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume")

    private ServerDataVolume dataVolume;

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - BMS：裸金属服务 - ECS：弹性云服务 - HPS：超节点服务 **默认取值**：不涉及。
     */
    public static final class ServerTypeEnum {

        /**
         * Enum BMS for value: "BMS"
         */
        public static final ServerTypeEnum BMS = new ServerTypeEnum("BMS");

        /**
         * Enum ECS for value: "ECS"
         */
        public static final ServerTypeEnum ECS = new ServerTypeEnum("ECS");

        /**
         * Enum HPS for value: "HPS"
         */
        public static final ServerTypeEnum HPS = new ServerTypeEnum("HPS");

        private static final Map<String, ServerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServerTypeEnum> createStaticFields() {
            Map<String, ServerTypeEnum> map = new HashMap<>();
            map.put("BMS", BMS);
            map.put("ECS", ECS);
            map.put("HPS", HPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServerTypeEnum(String value) {
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
        public static ServerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerTypeEnum(value));
        }

        public static ServerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServerTypeEnum) {
                return this.value.equals(((ServerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private ServerTypeEnum serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hps_cluster_id")

    private String hpsClusterId;

    public ServerCreateRequest withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    /**
     * **参数解释**：用于登录服务器的密码。admin_pass和key_pair_name必须二选一。密码规则： - 长度为8至26个字符 - 至少包含大写字母、小写字母、数字及特殊符号(!@%-_=+[{}]:,./?)中的3种 - 不能与用户名或倒序的用户名相同 - 不能包含root或administrator及其逆序 **约束限制**：admin_pass和key_pair_name不能同时存在。 **取值范围**：长度为8至26个字符，满足上述密码规则。 **默认取值**：不涉及。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public ServerCreateRequest withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：服务器规格架构类型。 **约束限制**：不涉及。 **取值范围**： - X86：CPU架构为X86 - ARM：CPU架构为ARM **默认取值**：不涉及。
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public ServerCreateRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**：服务器所在的可用区。 **约束限制**：不涉及。 **取值范围**：长度为1至256个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ServerCreateRequest withChargingInfo(ChargingInfo chargingInfo) {
        this.chargingInfo = chargingInfo;
        return this;
    }

    public ServerCreateRequest withChargingInfo(Consumer<ChargingInfo> chargingInfoSetter) {
        if (this.chargingInfo == null) {
            this.chargingInfo = new ChargingInfo();
            chargingInfoSetter.accept(this.chargingInfo);
        }

        return this;
    }

    /**
     * Get chargingInfo
     * @return chargingInfo
     */
    public ChargingInfo getChargingInfo() {
        return chargingInfo;
    }

    public void setChargingInfo(ChargingInfo chargingInfo) {
        this.chargingInfo = chargingInfo;
    }

    public ServerCreateRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：单次购买的服务器数量。 **约束限制**：不支持超节点。 **取值范围**：1至10。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 10
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ServerCreateRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：企业ID。 **约束限制**：不涉及。 **取值范围**：长度为1至36个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ServerCreateRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：服务器规格名称。 **约束限制**：flavor和resource_flavor二选一。 **取值范围**：长度为1至128个字符。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ServerCreateRequest withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * **参数解释**：服务器资源规格名称。 **约束限制**：flavor和resource_flavor二选一。 **取值范围**：长度为1至256个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    public ServerCreateRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：服务器镜像ID。 **约束限制**：不涉及。 **取值范围**：长度为36个字符，符合UUID格式。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ServerCreateRequest withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * **参数解释**：服务器登录密钥对名称。admin_pass和key_pair_name必须二选一。注意超节点仅支持使用密钥对创建。 **约束限制**：admin_pass和key_pair_name不能同时存在。 **取值范围**：长度为1至64个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return keyPairName
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    public ServerCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：服务器名称。 **约束限制**：不涉及。 **取值范围**：长度为1至64个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerCreateRequest withNetwork(ServerNetwork network) {
        this.network = network;
        return this;
    }

    public ServerCreateRequest withNetwork(Consumer<ServerNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new ServerNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public ServerNetwork getNetwork() {
        return network;
    }

    public void setNetwork(ServerNetwork network) {
        this.network = network;
    }

    public ServerCreateRequest withRootVolume(EvsVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public ServerCreateRequest withRootVolume(Consumer<EvsVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new EvsVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public EvsVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(EvsVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public ServerCreateRequest withDataVolume(ServerDataVolume dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public ServerCreateRequest withDataVolume(Consumer<ServerDataVolume> dataVolumeSetter) {
        if (this.dataVolume == null) {
            this.dataVolume = new ServerDataVolume();
            dataVolumeSetter.accept(this.dataVolume);
        }

        return this;
    }

    /**
     * Get dataVolume
     * @return dataVolume
     */
    public ServerDataVolume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(ServerDataVolume dataVolume) {
        this.dataVolume = dataVolume;
    }

    public ServerCreateRequest withServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - BMS：裸金属服务 - ECS：弹性云服务 - HPS：超节点服务 **默认取值**：不涉及。
     * @return serverType
     */
    public ServerTypeEnum getServerType() {
        return serverType;
    }

    public void setServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
    }

    public ServerCreateRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * **参数解释**： 创建云服务器过程中待注入实例自定义数据。支持注入文本、文本文件。 示例： base64编码前： * Linux服务器： ```bash #!/bin/bash echo user_test > /home/user.txt ``` base64编码后： * Linux服务器： ```bash IyEvYmluL2Jhc2gKZWNobyB1c2VyX3Rlc3QgPiAvaG9tZS91c2VyLnR4dA== ``` 了解更多实例自定义数据注入请参考[[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)](tag:hc)[[用户数据注入](https://support.huaweicloud.com/intl/zh-cn/usermanual-ecs/zh-cn_topic_0032380449.html)][ECS服务“通过实例自定义数据配置ECS实例”章节](tag:fcs,hcso)。 用户需明确user_data的使用效果，可能产生的影响和风险由用户自行承担。 **约束限制**： - user_data的值为base64编码之后的内容。 - 注入内容（编码之前的内容）最大长度为32K。  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public ServerCreateRequest withHpsClusterId(String hpsClusterId) {
        this.hpsClusterId = hpsClusterId;
        return this;
    }

    /**
     * **参数解释**：超节点集群网络信息。仅在创建超节点时需要该参数。 **约束限制**：仅用于创建HPS类型的服务器。 **取值范围**：长度为36个字符，符合UUID格式。 **默认取值**：不涉及。
     * @return hpsClusterId
     */
    public String getHpsClusterId() {
        return hpsClusterId;
    }

    public void setHpsClusterId(String hpsClusterId) {
        this.hpsClusterId = hpsClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerCreateRequest that = (ServerCreateRequest) obj;
        return Objects.equals(this.adminPass, that.adminPass) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.chargingInfo, that.chargingInfo) && Objects.equals(this.count, that.count)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.resourceFlavor, that.resourceFlavor)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.keyPairName, that.keyPairName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.network, that.network)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolume, that.dataVolume)
            && Objects.equals(this.serverType, that.serverType) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.hpsClusterId, that.hpsClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminPass,
            arch,
            availabilityZone,
            chargingInfo,
            count,
            enterpriseProjectId,
            flavor,
            resourceFlavor,
            imageId,
            keyPairName,
            name,
            network,
            rootVolume,
            dataVolume,
            serverType,
            userData,
            hpsClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerCreateRequest {\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    chargingInfo: ").append(toIndentedString(chargingInfo)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolume: ").append(toIndentedString(dataVolume)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    hpsClusterId: ").append(toIndentedString(hpsClusterId)).append("\n");
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

package com.huaweicloud.sdk.workspace.v2.model;

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
 * 创建桌面请求。
 */
public class CreateDesktopReq {

    /**
     * 云桌面类型。 - DEDICATED：专属桌面，单用户。 - SHARED: 多用户共享桌面。
     */
    public static final class DesktopTypeEnum {

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final DesktopTypeEnum DEDICATED = new DesktopTypeEnum("DEDICATED");

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final DesktopTypeEnum SHARED = new DesktopTypeEnum("SHARED");

        private static final Map<String, DesktopTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesktopTypeEnum> createStaticFields() {
            Map<String, DesktopTypeEnum> map = new HashMap<>();
            map.put("DEDICATED", DEDICATED);
            map.put("SHARED", SHARED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DesktopTypeEnum(String value) {
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
        public static DesktopTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DesktopTypeEnum(value));
        }

        public static DesktopTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DesktopTypeEnum) {
                return this.value.equals(((DesktopTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private DesktopTypeEnum desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_resource_sku")

    private String shareResourceSku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private Volume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<Volume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<Desktop> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ips")

    private List<String> desktopIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_notification")

    private Boolean emailNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler_hints")

    private WdhParam schedulerHints;

    /**
     * 桌面来源。  - DEFAULT：默认桌面来源 - ONEMOBILE：协同办公云桌面OneMobile
     */
    public static final class DesktopIsvEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final DesktopIsvEnum DEFAULT = new DesktopIsvEnum("DEFAULT");

        /**
         * Enum ONEMOBILE for value: "ONEMOBILE"
         */
        public static final DesktopIsvEnum ONEMOBILE = new DesktopIsvEnum("ONEMOBILE");

        private static final Map<String, DesktopIsvEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesktopIsvEnum> createStaticFields() {
            Map<String, DesktopIsvEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("ONEMOBILE", ONEMOBILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DesktopIsvEnum(String value) {
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
        public static DesktopIsvEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DesktopIsvEnum(value));
        }

        public static DesktopIsvEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DesktopIsvEnum) {
                return this.value.equals(((DesktopIsvEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_isv")

    private DesktopIsvEnum desktopIsv;

    /**
     * 接入模式。在非对接AD场景首次创建桌面时使用。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
     */
    public static final class AccessModeEnum {

        /**
         * Enum INTERNET for value: "INTERNET"
         */
        public static final AccessModeEnum INTERNET = new AccessModeEnum("INTERNET");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final AccessModeEnum DEDICATED = new AccessModeEnum("DEDICATED");

        /**
         * Enum BOTH for value: "BOTH"
         */
        public static final AccessModeEnum BOTH = new AccessModeEnum("BOTH");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("INTERNET", INTERNET);
            map.put("DEDICATED", DEDICATED);
            map.put("BOTH", BOTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
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
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_shared_vpc_dedicated_param")

    private ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_subnets")

    private String dedicatedSubnets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private Eip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adn")

    private Adn adn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_host_id")

    private String exclusiveHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_package_product_id")

    private String hourPackageProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_package_offering_id")

    private String hourPackageOfferingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_resource_ids")

    private List<String> rootResourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_info_ids")

    private List<String> instInfoIds = null;

    public CreateDesktopReq withDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 云桌面类型。 - DEDICATED：专属桌面，单用户。 - SHARED: 多用户共享桌面。
     * @return desktopType
     */
    public DesktopTypeEnum getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
    }

    public CreateDesktopReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。将桌面创建到指定的可用分区。如果不指定则使用系统随机的可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateDesktopReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 套餐ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateDesktopReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 套餐flavorID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateDesktopReq withShareResourceSku(String shareResourceSku) {
        this.shareResourceSku = shareResourceSku;
        return this;
    }

    /**
     * 桌面协同资源SKU码
     * @return shareResourceSku
     */
    public String getShareResourceSku() {
        return shareResourceSku;
    }

    public void setShareResourceSku(String shareResourceSku) {
        this.shareResourceSku = shareResourceSku;
    }

    public CreateDesktopReq withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型。默认值为private。  - private：私有镜像。 - gold：公共镜像。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public CreateDesktopReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID，用于私有镜像创建桌面场景，配合product_id使用。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public CreateDesktopReq withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateDesktopReq withRootVolume(Consumer<Volume> rootVolumeSetter) {
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

    public CreateDesktopReq withDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public CreateDesktopReq addDataVolumesItem(Volume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public CreateDesktopReq withDataVolumes(Consumer<List<Volume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘列表。
     * @return dataVolumes
     */
    public List<Volume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<Volume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CreateDesktopReq withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public CreateDesktopReq addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateDesktopReq withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 桌面对应的网卡信息，如果不指定则使用默认网卡。
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public CreateDesktopReq withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateDesktopReq addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateDesktopReq withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面使用的安全组，如果不指定则默认使用桌面代理中指定的安全组。
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateDesktopReq withDesktops(List<Desktop> desktops) {
        this.desktops = desktops;
        return this;
    }

    public CreateDesktopReq addDesktopsItem(Desktop desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public CreateDesktopReq withDesktops(Consumer<List<Desktop>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 创建桌面使用的参数列表。长度为1-100。  当前不支持一批桌面不同配置，所有桌面的配置和第一台的一致，如果第一台未设置参数，则取外层的同名参数。
     * @return desktops
     */
    public List<Desktop> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<Desktop> desktops) {
        this.desktops = desktops;
    }

    public CreateDesktopReq withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 搭配size使用，当size为1时代表桌面名，位数1-15，当size大于1时代表桌面名前缀，位数：1-13。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public CreateDesktopReq withDesktopIps(List<String> desktopIps) {
        this.desktopIps = desktopIps;
        return this;
    }

    public CreateDesktopReq addDesktopIpsItem(String desktopIpsItem) {
        if (this.desktopIps == null) {
            this.desktopIps = new ArrayList<>();
        }
        this.desktopIps.add(desktopIpsItem);
        return this;
    }

    public CreateDesktopReq withDesktopIps(Consumer<List<String>> desktopIpsSetter) {
        if (this.desktopIps == null) {
            this.desktopIps = new ArrayList<>();
        }
        desktopIpsSetter.accept(this.desktopIps);
        return this;
    }

    /**
     * 桌面指定分配的ip地址列表,最小为0，最大为100。
     * @return desktopIps
     */
    public List<String> getDesktopIps() {
        return desktopIps;
    }

    public void setDesktopIps(List<String> desktopIps) {
        this.desktopIps = desktopIps;
    }

    public CreateDesktopReq withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 创建不分配用户的桌面的个数，和desktops不能同时生效，搭配desktop_name使用。
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateDesktopReq withEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
        return this;
    }

    /**
     * 创建成功后是否发送邮件通知桌面用户，默认为true。
     * @return emailNotification
     */
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    public CreateDesktopReq withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID，在非对接AD场景首次创建桌面时使用。
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public CreateDesktopReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDesktopReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期订购ID，CBC订购回调时使用。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateDesktopReq withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * OU名称，在对接AD时使用，需提前在AD中创建OU。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public CreateDesktopReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 在非对接AD场景首次创建桌面时使用。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateDesktopReq withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public CreateDesktopReq addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public CreateDesktopReq withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 在非对接AD场景首次创建桌面时使用。
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public CreateDesktopReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDesktopReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDesktopReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateDesktopReq withSchedulerHints(WdhParam schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public CreateDesktopReq withSchedulerHints(Consumer<WdhParam> schedulerHintsSetter) {
        if (this.schedulerHints == null) {
            this.schedulerHints = new WdhParam();
            schedulerHintsSetter.accept(this.schedulerHints);
        }

        return this;
    }

    /**
     * Get schedulerHints
     * @return schedulerHints
     */
    public WdhParam getSchedulerHints() {
        return schedulerHints;
    }

    public void setSchedulerHints(WdhParam schedulerHints) {
        this.schedulerHints = schedulerHints;
    }

    public CreateDesktopReq withDesktopIsv(DesktopIsvEnum desktopIsv) {
        this.desktopIsv = desktopIsv;
        return this;
    }

    /**
     * 桌面来源。  - DEFAULT：默认桌面来源 - ONEMOBILE：协同办公云桌面OneMobile
     * @return desktopIsv
     */
    public DesktopIsvEnum getDesktopIsv() {
        return desktopIsv;
    }

    public void setDesktopIsv(DesktopIsvEnum desktopIsv) {
        this.desktopIsv = desktopIsv;
    }

    public CreateDesktopReq withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入模式。在非对接AD场景首次创建桌面时使用。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public CreateDesktopReq withApplySharedVpcDedicatedParam(
        ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
        return this;
    }

    public CreateDesktopReq withApplySharedVpcDedicatedParam(
        Consumer<ApplySharedVpcDedicatedParam> applySharedVpcDedicatedParamSetter) {
        if (this.applySharedVpcDedicatedParam == null) {
            this.applySharedVpcDedicatedParam = new ApplySharedVpcDedicatedParam();
            applySharedVpcDedicatedParamSetter.accept(this.applySharedVpcDedicatedParam);
        }

        return this;
    }

    /**
     * Get applySharedVpcDedicatedParam
     * @return applySharedVpcDedicatedParam
     */
    public ApplySharedVpcDedicatedParam getApplySharedVpcDedicatedParam() {
        return applySharedVpcDedicatedParam;
    }

    public void setApplySharedVpcDedicatedParam(ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
    }

    public CreateDesktopReq withDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
        return this;
    }

    /**
     * 专线接入网段列表，多个网段信息用分号隔开，列表长度不超过5。在非对接AD场景首次创建桌面时使用。
     * @return dedicatedSubnets
     */
    public String getDedicatedSubnets() {
        return dedicatedSubnets;
    }

    public void setDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
    }

    public CreateDesktopReq withEip(Eip eip) {
        this.eip = eip;
        return this;
    }

    public CreateDesktopReq withEip(Consumer<Eip> eipSetter) {
        if (this.eip == null) {
            this.eip = new Eip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public Eip getEip() {
        return eip;
    }

    public void setEip(Eip eip) {
        this.eip = eip;
    }

    public CreateDesktopReq withAdn(Adn adn) {
        this.adn = adn;
        return this;
    }

    public CreateDesktopReq withAdn(Consumer<Adn> adnSetter) {
        if (this.adn == null) {
            this.adn = new Adn();
            adnSetter.accept(this.adn);
        }

        return this;
    }

    /**
     * Get adn
     * @return adn
     */
    public Adn getAdn() {
        return adn;
    }

    public void setAdn(Adn adn) {
        this.adn = adn;
    }

    public CreateDesktopReq withExclusiveHostId(String exclusiveHostId) {
        this.exclusiveHostId = exclusiveHostId;
        return this;
    }

    /**
     * 专享主机ID，创建专享桌面时如果在指定专享主机中创建则必选
     * @return exclusiveHostId
     */
    public String getExclusiveHostId() {
        return exclusiveHostId;
    }

    public void setExclusiveHostId(String exclusiveHostId) {
        this.exclusiveHostId = exclusiveHostId;
    }

    public CreateDesktopReq withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略，如果指定了桌面名称则优先使用指定的桌面名称。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    public CreateDesktopReq withHourPackageProductId(String hourPackageProductId) {
        this.hourPackageProductId = hourPackageProductId;
        return this;
    }

    /**
     * 桌面小时包套餐ID。
     * @return hourPackageProductId
     */
    public String getHourPackageProductId() {
        return hourPackageProductId;
    }

    public void setHourPackageProductId(String hourPackageProductId) {
        this.hourPackageProductId = hourPackageProductId;
    }

    public CreateDesktopReq withHourPackageOfferingId(String hourPackageOfferingId) {
        this.hourPackageOfferingId = hourPackageOfferingId;
        return this;
    }

    /**
     * 桌面小时包offeringID。
     * @return hourPackageOfferingId
     */
    public String getHourPackageOfferingId() {
        return hourPackageOfferingId;
    }

    public void setHourPackageOfferingId(String hourPackageOfferingId) {
        this.hourPackageOfferingId = hourPackageOfferingId;
    }

    public CreateDesktopReq withRootResourceIds(List<String> rootResourceIds) {
        this.rootResourceIds = rootResourceIds;
        return this;
    }

    public CreateDesktopReq addRootResourceIdsItem(String rootResourceIdsItem) {
        if (this.rootResourceIds == null) {
            this.rootResourceIds = new ArrayList<>();
        }
        this.rootResourceIds.add(rootResourceIdsItem);
        return this;
    }

    public CreateDesktopReq withRootResourceIds(Consumer<List<String>> rootResourceIdsSetter) {
        if (this.rootResourceIds == null) {
            this.rootResourceIds = new ArrayList<>();
        }
        rootResourceIdsSetter.accept(this.rootResourceIds);
        return this;
    }

    /**
     * 根资源ID列表，创建小时包桌面时使用，最小为0，最大为100。
     * @return rootResourceIds
     */
    public List<String> getRootResourceIds() {
        return rootResourceIds;
    }

    public void setRootResourceIds(List<String> rootResourceIds) {
        this.rootResourceIds = rootResourceIds;
    }

    public CreateDesktopReq withInstInfoIds(List<String> instInfoIds) {
        this.instInfoIds = instInfoIds;
        return this;
    }

    public CreateDesktopReq addInstInfoIdsItem(String instInfoIdsItem) {
        if (this.instInfoIds == null) {
            this.instInfoIds = new ArrayList<>();
        }
        this.instInfoIds.add(instInfoIdsItem);
        return this;
    }

    public CreateDesktopReq withInstInfoIds(Consumer<List<String>> instInfoIdsSetter) {
        if (this.instInfoIds == null) {
            this.instInfoIds = new ArrayList<>();
        }
        instInfoIdsSetter.accept(this.instInfoIds);
        return this;
    }

    /**
     * instInfoId列表，创建小时包桌面时使用，最小为0，最大为100。
     * @return instInfoIds
     */
    public List<String> getInstInfoIds() {
        return instInfoIds;
    }

    public void setInstInfoIds(List<String> instInfoIds) {
        this.instInfoIds = instInfoIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopReq that = (CreateDesktopReq) obj;
        return Objects.equals(this.desktopType, that.desktopType)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.shareResourceSku, that.shareResourceSku)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.nics, that.nics) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.desktops, that.desktops) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopIps, that.desktopIps) && Objects.equals(this.size, that.size)
            && Objects.equals(this.emailNotification, that.emailNotification)
            && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.schedulerHints, that.schedulerHints)
            && Objects.equals(this.desktopIsv, that.desktopIsv) && Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.applySharedVpcDedicatedParam, that.applySharedVpcDedicatedParam)
            && Objects.equals(this.dedicatedSubnets, that.dedicatedSubnets) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.adn, that.adn) && Objects.equals(this.exclusiveHostId, that.exclusiveHostId)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId)
            && Objects.equals(this.hourPackageProductId, that.hourPackageProductId)
            && Objects.equals(this.hourPackageOfferingId, that.hourPackageOfferingId)
            && Objects.equals(this.rootResourceIds, that.rootResourceIds)
            && Objects.equals(this.instInfoIds, that.instInfoIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopType,
            availabilityZone,
            productId,
            flavorId,
            shareResourceSku,
            imageType,
            imageId,
            rootVolume,
            dataVolumes,
            nics,
            securityGroups,
            desktops,
            desktopName,
            desktopIps,
            size,
            emailNotification,
            enterpriseId,
            enterpriseProjectId,
            orderId,
            ouName,
            vpcId,
            subnetIds,
            tags,
            schedulerHints,
            desktopIsv,
            accessMode,
            applySharedVpcDedicatedParam,
            dedicatedSubnets,
            eip,
            adn,
            exclusiveHostId,
            desktopNamePolicyId,
            hourPackageProductId,
            hourPackageOfferingId,
            rootResourceIds,
            instInfoIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopReq {\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    shareResourceSku: ").append(toIndentedString(shareResourceSku)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopIps: ").append(toIndentedString(desktopIps)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    desktopIsv: ").append(toIndentedString(desktopIsv)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    applySharedVpcDedicatedParam: ")
            .append(toIndentedString(applySharedVpcDedicatedParam))
            .append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    adn: ").append(toIndentedString(adn)).append("\n");
        sb.append("    exclusiveHostId: ").append(toIndentedString(exclusiveHostId)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
        sb.append("    hourPackageProductId: ").append(toIndentedString(hourPackageProductId)).append("\n");
        sb.append("    hourPackageOfferingId: ").append(toIndentedString(hourPackageOfferingId)).append("\n");
        sb.append("    rootResourceIds: ").append(toIndentedString(rootResourceIds)).append("\n");
        sb.append("    instInfoIds: ").append(toIndentedString(instInfoIds)).append("\n");
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

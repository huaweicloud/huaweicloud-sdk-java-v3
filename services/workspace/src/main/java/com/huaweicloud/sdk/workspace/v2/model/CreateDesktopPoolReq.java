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
public class CreateDesktopPoolReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 桌面池类型，DYNAMIC：动态池，STATIC：静态池。
     */
    public static final class TypeEnum {

        /**
         * Enum DYNAMIC for value: "DYNAMIC"
         */
        public static final TypeEnum DYNAMIC = new TypeEnum("DYNAMIC");

        /**
         * Enum STATIC for value: "STATIC"
         */
        public static final TypeEnum STATIC = new TypeEnum("STATIC");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DYNAMIC", DYNAMIC);
            map.put("STATIC", STATIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private VolumeInfo rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeInfo> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_objects")

    private List<AuthorizedObjects> authorizedObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnected_retention_period")

    private Integer disconnectedRetentionPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_autoscale")

    private Boolean enableAutoscale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscale_policy")

    private AutoscalePolicy autoscalePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    public CreateDesktopPoolReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 桌面池名称，桌面池名称必须保证唯一。桌面名称只允许输入中文、大写字母、小写字母、数字、中划线，长度范围为1~255。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDesktopPoolReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 桌面池类型，DYNAMIC：动态池，STATIC：静态池。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateDesktopPoolReq withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 桌面池大小：当前桌面池要创建多少台桌面。
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateDesktopPoolReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 桌面池描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDesktopPoolReq withAvailabilityZone(String availabilityZone) {
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

    public CreateDesktopPoolReq withProductId(String productId) {
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

    public CreateDesktopPoolReq withImageType(String imageType) {
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

    public CreateDesktopPoolReq withImageId(String imageId) {
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

    public CreateDesktopPoolReq withRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateDesktopPoolReq withRootVolume(Consumer<VolumeInfo> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeInfo();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeInfo getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
    }

    public CreateDesktopPoolReq withDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public CreateDesktopPoolReq addDataVolumesItem(VolumeInfo dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public CreateDesktopPoolReq withDataVolumes(Consumer<List<VolumeInfo>> dataVolumesSetter) {
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
    public List<VolumeInfo> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CreateDesktopPoolReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 创建桌面时的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateDesktopPoolReq withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public CreateDesktopPoolReq addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public CreateDesktopPoolReq withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 创建桌面使用的子网ID。
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public CreateDesktopPoolReq withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateDesktopPoolReq addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateDesktopPoolReq withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
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

    public CreateDesktopPoolReq withAuthorizedObjects(List<AuthorizedObjects> authorizedObjects) {
        this.authorizedObjects = authorizedObjects;
        return this;
    }

    public CreateDesktopPoolReq addAuthorizedObjectsItem(AuthorizedObjects authorizedObjectsItem) {
        if (this.authorizedObjects == null) {
            this.authorizedObjects = new ArrayList<>();
        }
        this.authorizedObjects.add(authorizedObjectsItem);
        return this;
    }

    public CreateDesktopPoolReq withAuthorizedObjects(Consumer<List<AuthorizedObjects>> authorizedObjectsSetter) {
        if (this.authorizedObjects == null) {
            this.authorizedObjects = new ArrayList<>();
        }
        authorizedObjectsSetter.accept(this.authorizedObjects);
        return this;
    }

    /**
     * 要授权的用户/用户组列表。
     * @return authorizedObjects
     */
    public List<AuthorizedObjects> getAuthorizedObjects() {
        return authorizedObjects;
    }

    public void setAuthorizedObjects(List<AuthorizedObjects> authorizedObjects) {
        this.authorizedObjects = authorizedObjects;
    }

    public CreateDesktopPoolReq withOrderId(String orderId) {
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

    public CreateDesktopPoolReq withOuName(String ouName) {
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

    public CreateDesktopPoolReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDesktopPoolReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDesktopPoolReq withTags(Consumer<List<Tag>> tagsSetter) {
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

    public CreateDesktopPoolReq withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateDesktopPoolReq withDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
        return this;
    }

    /**
     * 动态池桌面断连多少分钟内，保留用户与桌面的绑定关系，超时后自动解绑。
     * minimum: 10
     * maximum: 43200
     * @return disconnectedRetentionPeriod
     */
    public Integer getDisconnectedRetentionPeriod() {
        return disconnectedRetentionPeriod;
    }

    public void setDisconnectedRetentionPeriod(Integer disconnectedRetentionPeriod) {
        this.disconnectedRetentionPeriod = disconnectedRetentionPeriod;
    }

    public CreateDesktopPoolReq withEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
        return this;
    }

    /**
     * 桌面池是否开启弹性伸缩类型，为false则表示不开启弹性伸缩，为true则表示开启弹性伸缩。
     * @return enableAutoscale
     */
    public Boolean getEnableAutoscale() {
        return enableAutoscale;
    }

    public void setEnableAutoscale(Boolean enableAutoscale) {
        this.enableAutoscale = enableAutoscale;
    }

    public CreateDesktopPoolReq withAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
        return this;
    }

    public CreateDesktopPoolReq withAutoscalePolicy(Consumer<AutoscalePolicy> autoscalePolicySetter) {
        if (this.autoscalePolicy == null) {
            this.autoscalePolicy = new AutoscalePolicy();
            autoscalePolicySetter.accept(this.autoscalePolicy);
        }

        return this;
    }

    /**
     * Get autoscalePolicy
     * @return autoscalePolicy
     */
    public AutoscalePolicy getAutoscalePolicy() {
        return autoscalePolicy;
    }

    public void setAutoscalePolicy(AutoscalePolicy autoscalePolicy) {
        this.autoscalePolicy = autoscalePolicy;
    }

    public CreateDesktopPoolReq withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopPoolReq that = (CreateDesktopPoolReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.size, that.size) && Objects.equals(this.description, that.description)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.authorizedObjects, that.authorizedObjects)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.disconnectedRetentionPeriod, that.disconnectedRetentionPeriod)
            && Objects.equals(this.enableAutoscale, that.enableAutoscale)
            && Objects.equals(this.autoscalePolicy, that.autoscalePolicy)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            size,
            description,
            availabilityZone,
            productId,
            imageType,
            imageId,
            rootVolume,
            dataVolumes,
            vpcId,
            subnetIds,
            securityGroups,
            authorizedObjects,
            orderId,
            ouName,
            tags,
            enterpriseProjectId,
            disconnectedRetentionPeriod,
            enableAutoscale,
            autoscalePolicy,
            desktopNamePolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopPoolReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    authorizedObjects: ").append(toIndentedString(authorizedObjects)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    disconnectedRetentionPeriod: ")
            .append(toIndentedString(disconnectedRetentionPeriod))
            .append("\n");
        sb.append("    enableAutoscale: ").append(toIndentedString(enableAutoscale)).append("\n");
        sb.append("    autoscalePolicy: ").append(toIndentedString(autoscalePolicy)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
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

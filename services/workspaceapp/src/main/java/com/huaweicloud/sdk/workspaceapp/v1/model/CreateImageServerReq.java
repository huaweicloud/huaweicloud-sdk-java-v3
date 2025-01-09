package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建镜像实例请求
 */
public class CreateImageServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private Volume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ref")

    private ImageRef imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_apps")

    private List<String> attachApps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorize_accounts")

    private List<ImageAccountInfo> authorizeAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_vdi")

    private Boolean isVdi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler_hints")

    private WdhParam schedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_type")

    private ExtraSessionTypeEnum extraSessionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_session_size")

    private Integer extraSessionSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private RoutePolicy routePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateImageServerReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像实例名称，名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成，不能有空格 2. 长度范围1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateImageServerReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateImageServerReq withRootVolume(Volume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateImageServerReq withRootVolume(Consumer<Volume> rootVolumeSetter) {
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

    public CreateImageServerReq withImageRef(ImageRef imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    public CreateImageServerReq withImageRef(Consumer<ImageRef> imageRefSetter) {
        if (this.imageRef == null) {
            this.imageRef = new ImageRef();
            imageRefSetter.accept(this.imageRef);
        }

        return this;
    }

    /**
     * Get imageRef
     * @return imageRef
     */
    public ImageRef getImageRef() {
        return imageRef;
    }

    public void setImageRef(ImageRef imageRef) {
        this.imageRef = imageRef;
    }

    public CreateImageServerReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 镜像实例所属虚拟私有云唯一标识。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateImageServerReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 镜像实例网卡对应的子网唯一标识
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateImageServerReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 镜像实例产品套餐ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateImageServerReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateImageServerReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 镜像实例的可用区，空值表示随机选取可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateImageServerReq withAttachApps(List<String> attachApps) {
        this.attachApps = attachApps;
        return this;
    }

    public CreateImageServerReq addAttachAppsItem(String attachAppsItem) {
        if (this.attachApps == null) {
            this.attachApps = new ArrayList<>();
        }
        this.attachApps.add(attachAppsItem);
        return this;
    }

    public CreateImageServerReq withAttachApps(Consumer<List<String>> attachAppsSetter) {
        if (this.attachApps == null) {
            this.attachApps = new ArrayList<>();
        }
        attachAppsSetter.accept(this.attachApps);
        return this;
    }

    /**
     * 云应用仓库软件唯一标识请求列表
     * @return attachApps
     */
    public List<String> getAttachApps() {
        return attachApps;
    }

    public void setAttachApps(List<String> attachApps) {
        this.attachApps = attachApps;
    }

    public CreateImageServerReq withAuthorizeAccounts(List<ImageAccountInfo> authorizeAccounts) {
        this.authorizeAccounts = authorizeAccounts;
        return this;
    }

    public CreateImageServerReq addAuthorizeAccountsItem(ImageAccountInfo authorizeAccountsItem) {
        if (this.authorizeAccounts == null) {
            this.authorizeAccounts = new ArrayList<>();
        }
        this.authorizeAccounts.add(authorizeAccountsItem);
        return this;
    }

    public CreateImageServerReq withAuthorizeAccounts(Consumer<List<ImageAccountInfo>> authorizeAccountsSetter) {
        if (this.authorizeAccounts == null) {
            this.authorizeAccounts = new ArrayList<>();
        }
        authorizeAccountsSetter.accept(this.authorizeAccounts);
        return this;
    }

    /**
     * 应用组授权用户， * 限制用户类型：'USER' - 用户
     * @return authorizeAccounts
     */
    public List<ImageAccountInfo> getAuthorizeAccounts() {
        return authorizeAccounts;
    }

    public void setAuthorizeAccounts(List<ImageAccountInfo> authorizeAccounts) {
        this.authorizeAccounts = authorizeAccounts;
    }

    public CreateImageServerReq withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 组织名称
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public CreateImageServerReq withIsVdi(Boolean isVdi) {
        this.isVdi = isVdi;
        return this;
    }

    /**
     * 是否为vdi单会话模式
     * @return isVdi
     */
    public Boolean getIsVdi() {
        return isVdi;
    }

    public void setIsVdi(Boolean isVdi) {
        this.isVdi = isVdi;
    }

    public CreateImageServerReq withSchedulerHints(WdhParam schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public CreateImageServerReq withSchedulerHints(Consumer<WdhParam> schedulerHintsSetter) {
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

    public CreateImageServerReq withExtraSessionType(ExtraSessionTypeEnum extraSessionType) {
        this.extraSessionType = extraSessionType;
        return this;
    }

    /**
     * Get extraSessionType
     * @return extraSessionType
     */
    public ExtraSessionTypeEnum getExtraSessionType() {
        return extraSessionType;
    }

    public void setExtraSessionType(ExtraSessionTypeEnum extraSessionType) {
        this.extraSessionType = extraSessionType;
    }

    public CreateImageServerReq withExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
        return this;
    }

    /**
     * 需要付费的会话数，单位/个
     * minimum: 1
     * @return extraSessionSize
     */
    public Integer getExtraSessionSize() {
        return extraSessionSize;
    }

    public void setExtraSessionSize(Integer extraSessionSize) {
        this.extraSessionSize = extraSessionSize;
    }

    public CreateImageServerReq withRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public CreateImageServerReq withRoutePolicy(Consumer<RoutePolicy> routePolicySetter) {
        if (this.routePolicy == null) {
            this.routePolicy = new RoutePolicy();
            routePolicySetter.accept(this.routePolicy);
        }

        return this;
    }

    /**
     * Get routePolicy
     * @return routePolicy
     */
    public RoutePolicy getRoutePolicy() {
        return routePolicy;
    }

    public void setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
    }

    public CreateImageServerReq withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateImageServerReq addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateImageServerReq withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息，最多包含20个key,不允许重复
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    public CreateImageServerReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **⚠ : 此属性是预留字段，不需要传值，目前镜像产物默认属于default企业项目** 镜像所属的企业项目ID，默认属于default企业项目。 关于企业项目ID的获取及企业项目特性的详细信息，请参考“[企业中心总览](https://support.huaweicloud.com/zh-cn/usermanual-em/zh-cn_topic_0123692049.html)”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateImageServerReq that = (CreateImageServerReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.imageRef, that.imageRef)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.attachApps, that.attachApps)
            && Objects.equals(this.authorizeAccounts, that.authorizeAccounts)
            && Objects.equals(this.ouName, that.ouName) && Objects.equals(this.isVdi, that.isVdi)
            && Objects.equals(this.schedulerHints, that.schedulerHints)
            && Objects.equals(this.extraSessionType, that.extraSessionType)
            && Objects.equals(this.extraSessionSize, that.extraSessionSize)
            && Objects.equals(this.routePolicy, that.routePolicy) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            rootVolume,
            imageRef,
            vpcId,
            subnetId,
            productId,
            flavorId,
            availabilityZone,
            attachApps,
            authorizeAccounts,
            ouName,
            isVdi,
            schedulerHints,
            extraSessionType,
            extraSessionSize,
            routePolicy,
            tags,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageServerReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    attachApps: ").append(toIndentedString(attachApps)).append("\n");
        sb.append("    authorizeAccounts: ").append(toIndentedString(authorizeAccounts)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    isVdi: ").append(toIndentedString(isVdi)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    extraSessionType: ").append(toIndentedString(extraSessionType)).append("\n");
        sb.append("    extraSessionSize: ").append(toIndentedString(extraSessionSize)).append("\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

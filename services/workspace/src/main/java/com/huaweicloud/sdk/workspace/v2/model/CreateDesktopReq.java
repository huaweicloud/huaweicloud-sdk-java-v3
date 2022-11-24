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
     * 云桌面类型。  - DEDICATED：专属桌面。
     */
    public static final class DesktopTypeEnum {

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final DesktopTypeEnum DEDICATED = new DesktopTypeEnum("DEDICATED");

        private static final Map<String, DesktopTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DesktopTypeEnum> createStaticFields() {
            Map<String, DesktopTypeEnum> map = new HashMap<>();
            map.put("DEDICATED", DEDICATED);
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
            DesktopTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DesktopTypeEnum(value);
            }
            return result;
        }

        public static DesktopTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DesktopTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    private List<SecurityGroupInfo> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<Desktop> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_notification")

    private Boolean emailNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateDesktopReq withDesktopType(DesktopTypeEnum desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 云桌面类型。  - DEDICATED：专属桌面。
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

    public CreateDesktopReq withSecurityGroups(List<SecurityGroupInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateDesktopReq addSecurityGroupsItem(SecurityGroupInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateDesktopReq withSecurityGroups(Consumer<List<SecurityGroupInfo>> securityGroupsSetter) {
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
    public List<SecurityGroupInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupInfo> securityGroups) {
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
     * 创建桌面使用的参数列表。长度为1-50。  当前不支持一批桌面不同配置，所有桌面的配置和第一台的一致，如果第一台未设置参数，则取外层的同名参数。
     * @return desktops
     */
    public List<Desktop> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<Desktop> desktops) {
        this.desktops = desktops;
    }

    public CreateDesktopReq withEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
        return this;
    }

    /**
     * 创建成功后是否发送邮件通知桌面用户，默认为true。此参数仅在开通云桌面服务的domain_type为LOCAL_AD时有效，为LITE_AS时无效，因为LITE_AS首次创建桌面时必须发送邮件通知桌面用户修改登录密码。
     * @return emailNotification
     */
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDesktopReq createDesktopReq = (CreateDesktopReq) o;
        return Objects.equals(this.desktopType, createDesktopReq.desktopType)
            && Objects.equals(this.availabilityZone, createDesktopReq.availabilityZone)
            && Objects.equals(this.productId, createDesktopReq.productId)
            && Objects.equals(this.imageType, createDesktopReq.imageType)
            && Objects.equals(this.imageId, createDesktopReq.imageId)
            && Objects.equals(this.rootVolume, createDesktopReq.rootVolume)
            && Objects.equals(this.dataVolumes, createDesktopReq.dataVolumes)
            && Objects.equals(this.nics, createDesktopReq.nics)
            && Objects.equals(this.securityGroups, createDesktopReq.securityGroups)
            && Objects.equals(this.desktops, createDesktopReq.desktops)
            && Objects.equals(this.emailNotification, createDesktopReq.emailNotification)
            && Objects.equals(this.vpcId, createDesktopReq.vpcId) && Objects.equals(this.tags, createDesktopReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopType,
            availabilityZone,
            productId,
            imageType,
            imageId,
            rootVolume,
            dataVolumes,
            nics,
            securityGroups,
            desktops,
            emailNotification,
            vpcId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopReq {\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

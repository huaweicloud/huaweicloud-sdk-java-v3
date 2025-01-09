package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建专享主机请求体。
 */
public class CreateExclusiveHostsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_desktop_quantity")

    private Integer applyDesktopQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_volumes")

    private List<Volume> imageVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_volumes")

    private List<Volume> memoryVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_exclusive_lites")

    private ResizeExclusiveLitesReq resizeExclusiveLites;

    public CreateExclusiveHostsReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateExclusiveHostsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateExclusiveHostsReq withApplyDesktopQuantity(Integer applyDesktopQuantity) {
        this.applyDesktopQuantity = applyDesktopQuantity;
        return this;
    }

    /**
     * 追加桌面数量。
     * minimum: 0
     * maximum: 300
     * @return applyDesktopQuantity
     */
    public Integer getApplyDesktopQuantity() {
        return applyDesktopQuantity;
    }

    public void setApplyDesktopQuantity(Integer applyDesktopQuantity) {
        this.applyDesktopQuantity = applyDesktopQuantity;
    }

    public CreateExclusiveHostsReq withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 购买数量。
     * minimum: 1
     * maximum: 100
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CreateExclusiveHostsReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateExclusiveHostsReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品套餐ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateExclusiveHostsReq withImageVolumes(List<Volume> imageVolumes) {
        this.imageVolumes = imageVolumes;
        return this;
    }

    public CreateExclusiveHostsReq addImageVolumesItem(Volume imageVolumesItem) {
        if (this.imageVolumes == null) {
            this.imageVolumes = new ArrayList<>();
        }
        this.imageVolumes.add(imageVolumesItem);
        return this;
    }

    public CreateExclusiveHostsReq withImageVolumes(Consumer<List<Volume>> imageVolumesSetter) {
        if (this.imageVolumes == null) {
            this.imageVolumes = new ArrayList<>();
        }
        imageVolumesSetter.accept(this.imageVolumes);
        return this;
    }

    /**
     * 镜像盘列表。
     * @return imageVolumes
     */
    public List<Volume> getImageVolumes() {
        return imageVolumes;
    }

    public void setImageVolumes(List<Volume> imageVolumes) {
        this.imageVolumes = imageVolumes;
    }

    public CreateExclusiveHostsReq withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateExclusiveHostsReq withMemoryVolumes(List<Volume> memoryVolumes) {
        this.memoryVolumes = memoryVolumes;
        return this;
    }

    public CreateExclusiveHostsReq addMemoryVolumesItem(Volume memoryVolumesItem) {
        if (this.memoryVolumes == null) {
            this.memoryVolumes = new ArrayList<>();
        }
        this.memoryVolumes.add(memoryVolumesItem);
        return this;
    }

    public CreateExclusiveHostsReq withMemoryVolumes(Consumer<List<Volume>> memoryVolumesSetter) {
        if (this.memoryVolumes == null) {
            this.memoryVolumes = new ArrayList<>();
        }
        memoryVolumesSetter.accept(this.memoryVolumes);
        return this;
    }

    /**
     * 存储盘列表。
     * @return memoryVolumes
     */
    public List<Volume> getMemoryVolumes() {
        return memoryVolumes;
    }

    public void setMemoryVolumes(List<Volume> memoryVolumes) {
        this.memoryVolumes = memoryVolumes;
    }

    public CreateExclusiveHostsReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc id。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateExclusiveHostsReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateExclusiveHostsReq withResizeExclusiveLites(ResizeExclusiveLitesReq resizeExclusiveLites) {
        this.resizeExclusiveLites = resizeExclusiveLites;
        return this;
    }

    public CreateExclusiveHostsReq withResizeExclusiveLites(
        Consumer<ResizeExclusiveLitesReq> resizeExclusiveLitesSetter) {
        if (this.resizeExclusiveLites == null) {
            this.resizeExclusiveLites = new ResizeExclusiveLitesReq();
            resizeExclusiveLitesSetter.accept(this.resizeExclusiveLites);
        }

        return this;
    }

    /**
     * Get resizeExclusiveLites
     * @return resizeExclusiveLites
     */
    public ResizeExclusiveLitesReq getResizeExclusiveLites() {
        return resizeExclusiveLites;
    }

    public void setResizeExclusiveLites(ResizeExclusiveLitesReq resizeExclusiveLites) {
        this.resizeExclusiveLites = resizeExclusiveLites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExclusiveHostsReq that = (CreateExclusiveHostsReq) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.name, that.name)
            && Objects.equals(this.applyDesktopQuantity, that.applyDesktopQuantity)
            && Objects.equals(this.quantity, that.quantity) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.imageVolumes, that.imageVolumes)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.memoryVolumes, that.memoryVolumes) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.resizeExclusiveLites, that.resizeExclusiveLites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone,
            name,
            applyDesktopQuantity,
            quantity,
            orderId,
            productId,
            imageVolumes,
            enterpriseProjectId,
            memoryVolumes,
            vpcId,
            subnetId,
            resizeExclusiveLites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExclusiveHostsReq {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    applyDesktopQuantity: ").append(toIndentedString(applyDesktopQuantity)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    imageVolumes: ").append(toIndentedString(imageVolumes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    memoryVolumes: ").append(toIndentedString(memoryVolumes)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    resizeExclusiveLites: ").append(toIndentedString(resizeExclusiveLites)).append("\n");
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

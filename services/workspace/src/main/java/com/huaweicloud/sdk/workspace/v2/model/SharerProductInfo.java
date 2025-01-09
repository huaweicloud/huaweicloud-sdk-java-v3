package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SharerProductInfo
 */
public class SharerProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_gpu")

    private Boolean isGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private String descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Map<String, String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_size")

    private Integer shareSpaceSize;

    public SharerProductInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public SharerProductInfo withIsGpu(Boolean isGpu) {
        this.isGpu = isGpu;
        return this;
    }

    /**
     * 是否是GPU类型的规格。
     * @return isGpu
     */
    public Boolean getIsGpu() {
        return isGpu;
    }

    public void setIsGpu(Boolean isGpu) {
        this.isGpu = isGpu;
    }

    public SharerProductInfo withDescriptions(String descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * 产品描述。
     * @return descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public SharerProductInfo withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 周期套餐标识。0表示包周期，1表示按需, 6表示一次性计费。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public SharerProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源规格。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SharerProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务编码。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public SharerProductInfo withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐类型。 - user_sharer：用户协同套餐 - desktop_sharer: 桌面协同套餐
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public SharerProductInfo withName(Map<String, String> name) {
        this.name = name;
        return this;
    }

    public SharerProductInfo putNameItem(String key, String nameItem) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        this.name.put(key, nameItem);
        return this;
    }

    public SharerProductInfo withName(Consumer<Map<String, String>> nameSetter) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 产品名称<语言，各语言对应的产品名>。
     * @return name
     */
    public Map<String, String> getName() {
        return name;
    }

    public void setName(Map<String, String> name) {
        this.name = name;
    }

    public SharerProductInfo withShareSpaceSize(Integer shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
        return this;
    }

    /**
     * 协同方数。该套餐支持的最大协同人数。
     * minimum: 0
     * maximum: 100
     * @return shareSpaceSize
     */
    public Integer getShareSpaceSize() {
        return shareSpaceSize;
    }

    public void setShareSpaceSize(Integer shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SharerProductInfo that = (SharerProductInfo) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.isGpu, that.isGpu)
            && Objects.equals(this.descriptions, that.descriptions) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.shareSpaceSize, that.shareSpaceSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            isGpu,
            descriptions,
            chargeMode,
            resourceType,
            cloudServiceType,
            packageType,
            name,
            shareSpaceSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharerProductInfo {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    isGpu: ").append(toIndentedString(isGpu)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shareSpaceSize: ").append(toIndentedString(shareSpaceSize)).append("\n");
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

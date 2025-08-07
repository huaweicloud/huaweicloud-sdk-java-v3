package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MarketplaceEngineProduct
 */
public class MarketplaceEngineProduct {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bp_name")

    private String bpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bp_domain_id")

    private String bpDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private String instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_license_agreement")

    private String userLicenseAgreement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreements")

    private List<Agreement> agreements = null;

    public MarketplaceEngineProduct withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 引擎ID。
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public MarketplaceEngineProduct withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public MarketplaceEngineProduct withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 云市场规格ID。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public MarketplaceEngineProduct withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 云市场商品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public MarketplaceEngineProduct withBpName(String bpName) {
        this.bpName = bpName;
        return this;
    }

    /**
     * 服务商名称。
     * @return bpName
     */
    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public MarketplaceEngineProduct withBpDomainId(String bpDomainId) {
        this.bpDomainId = bpDomainId;
        return this;
    }

    /**
     * 服务商ID。
     * @return bpDomainId
     */
    public String getBpDomainId() {
        return bpDomainId;
    }

    public void setBpDomainId(String bpDomainId) {
        this.bpDomainId = bpDomainId;
    }

    public MarketplaceEngineProduct withInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 支持的实例类型。  - Single: 单机实例 - Ha: 主备实例 - Replica: 只读实例 - All: 以上类型都支持
     * @return instanceMode
     */
    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public MarketplaceEngineProduct withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public MarketplaceEngineProduct withUserLicenseAgreement(String userLicenseAgreement) {
        this.userLicenseAgreement = userLicenseAgreement;
        return this;
    }

    /**
     * 用户许可。
     * @return userLicenseAgreement
     */
    public String getUserLicenseAgreement() {
        return userLicenseAgreement;
    }

    public void setUserLicenseAgreement(String userLicenseAgreement) {
        this.userLicenseAgreement = userLicenseAgreement;
    }

    public MarketplaceEngineProduct withAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    public MarketplaceEngineProduct addAgreementsItem(Agreement agreementsItem) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(agreementsItem);
        return this;
    }

    public MarketplaceEngineProduct withAgreements(Consumer<List<Agreement>> agreementsSetter) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        agreementsSetter.accept(this.agreements);
        return this;
    }

    /**
     * 许可详情列表。
     * @return agreements
     */
    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarketplaceEngineProduct that = (MarketplaceEngineProduct) obj;
        return Objects.equals(this.engineId, that.engineId) && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.bpName, that.bpName) && Objects.equals(this.bpDomainId, that.bpDomainId)
            && Objects.equals(this.instanceMode, that.instanceMode) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.userLicenseAgreement, that.userLicenseAgreement)
            && Objects.equals(this.agreements, that.agreements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId,
            engineVersion,
            specCode,
            productId,
            bpName,
            bpDomainId,
            instanceMode,
            imageId,
            userLicenseAgreement,
            agreements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplaceEngineProduct {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    bpName: ").append(toIndentedString(bpName)).append("\n");
        sb.append("    bpDomainId: ").append(toIndentedString(bpDomainId)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    userLicenseAgreement: ").append(toIndentedString(userLicenseAgreement)).append("\n");
        sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
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

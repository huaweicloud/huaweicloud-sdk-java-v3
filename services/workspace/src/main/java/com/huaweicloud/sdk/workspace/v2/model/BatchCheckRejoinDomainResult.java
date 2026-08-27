package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 加域检查桌面信息。
 */
public class BatchCheckRejoinDomainResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_status")

    private Integer domainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rejoin_able")

    private Boolean rejoinAble;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private ProductInfo product;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public BatchCheckRejoinDomainResult withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public BatchCheckRejoinDomainResult withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public BatchCheckRejoinDomainResult withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public BatchCheckRejoinDomainResult withDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * 加域状态。|- 1 正常。 2 脱域。 3 未上报。
     * @return domainStatus
     */
    public Integer getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
    }

    public BatchCheckRejoinDomainResult withRejoinAble(Boolean rejoinAble) {
        this.rejoinAble = rejoinAble;
        return this;
    }

    /**
     * 是否可以加域。
     * @return rejoinAble
     */
    public Boolean getRejoinAble() {
        return rejoinAble;
    }

    public void setRejoinAble(Boolean rejoinAble) {
        this.rejoinAble = rejoinAble;
    }

    public BatchCheckRejoinDomainResult withProduct(ProductInfo product) {
        this.product = product;
        return this;
    }

    public BatchCheckRejoinDomainResult withProduct(Consumer<ProductInfo> productSetter) {
        if (this.product == null) {
            this.product = new ProductInfo();
            productSetter.accept(this.product);
        }

        return this;
    }

    /**
     * Get product
     * @return product
     */
    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

    public BatchCheckRejoinDomainResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BatchCheckRejoinDomainResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCheckRejoinDomainResult that = (BatchCheckRejoinDomainResult) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.domainStatus, that.domainStatus)
            && Objects.equals(this.rejoinAble, that.rejoinAble) && Objects.equals(this.product, that.product)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, desktopName, imageName, domainStatus, rejoinAble, product, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCheckRejoinDomainResult {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    domainStatus: ").append(toIndentedString(domainStatus)).append("\n");
        sb.append("    rejoinAble: ").append(toIndentedString(rejoinAble)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

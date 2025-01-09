package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 产品规则信息,进程名称、产品名称、发布者的各项都需要匹配，为空或者*表示任意匹配。 例如： 发布者：* 产品名称：Huawei 进程名称：* 只要产品名称是Huawei的就可以认为是匹配的。
 */
public class ProductRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identify_condition")

    private String identifyCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private String publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_version")

    private String productVersion;

    public ProductRule withIdentifyCondition(String identifyCondition) {
        this.identifyCondition = identifyCondition;
        return this;
    }

    /**
     * 识别条件。
     * @return identifyCondition
     */
    public String getIdentifyCondition() {
        return identifyCondition;
    }

    public void setIdentifyCondition(String identifyCondition) {
        this.identifyCondition = identifyCondition;
    }

    public ProductRule withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 发布者名称： 1. 名称允许可见字符或空格，不可为全空格。 2. 长度0~1024个字符。 3. 为空或者*号表示任意匹配。
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ProductRule withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品名称： 1. 名称允许可见字符或空格，不可为全空格。 2. 长度0~128个字符。 3. 为空或者*号表示任意匹配。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductRule withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * 进程名称： 1. 名称允许可见字符或空格，不可为全空格。 2. 长度0~128个字符。 3. 为空或者*号表示任意匹配。
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public ProductRule withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * 操作系统类型，仅内置规则存在该字段。 1. 名称允许可见字符或空格，不可为全空格。 2. 长度0~128个字符。
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public ProductRule withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号： 1. 名称允许可见字符或空格，不可为全空格。 2. 长度0~128个字符。 3. 为空或者*号表示任意匹配。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ProductRule withProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    /**
     * 产品版本号： 1. 允许可见字符。 2. 长度0~128个字符。
     * @return productVersion
     */
    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductRule that = (ProductRule) obj;
        return Objects.equals(this.identifyCondition, that.identifyCondition)
            && Objects.equals(this.publisher, that.publisher) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.processName, that.processName) && Objects.equals(this.supportOs, that.supportOs)
            && Objects.equals(this.version, that.version) && Objects.equals(this.productVersion, that.productVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifyCondition, publisher, productName, processName, supportOs, version, productVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductRule {\n");
        sb.append("    identifyCondition: ").append(toIndentedString(identifyCondition)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
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

package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductSpecData
 */
public class ProductSpecData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_uuid")

    private String productUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp_spec")

    private String ispSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_type")

    private Integer specType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_bandwidth")

    private Integer basicBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_bandwidth")

    private Integer elasticBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_bandwidth")

    private Integer serviceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_num")

    private Integer portNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_domain_num")

    private Integer bindDomainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_service_bandwidth")

    private Integer elasticServiceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_service_bandwidth_type")

    private Integer elasticServiceBandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_resource_type")

    private String mainResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_resource_spec_code")

    private String mainResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_resource_product_id")

    private String mainResourceProductId;

    public ProductSpecData withProductUuid(String productUuid) {
        this.productUuid = productUuid;
        return this;
    }

    /**
     * 产品规格UUID
     * @return productUuid
     */
    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid;
    }

    public ProductSpecData withIspSpec(String ispSpec) {
        this.ispSpec = ispSpec;
        return this;
    }

    /**
     * 套餐线路
     * @return ispSpec
     */
    public String getIspSpec() {
        return ispSpec;
    }

    public void setIspSpec(String ispSpec) {
        this.ispSpec = ispSpec;
    }

    public ProductSpecData withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 机房
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public ProductSpecData withSpecType(Integer specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 产品规格类型
     * minimum: 0
     * maximum: 2000
     * @return specType
     */
    public Integer getSpecType() {
        return specType;
    }

    public void setSpecType(Integer specType) {
        this.specType = specType;
    }

    public ProductSpecData withBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
        return this;
    }

    /**
     * 保底带宽值
     * minimum: 0
     * maximum: 2000
     * @return basicBandwidth
     */
    public Integer getBasicBandwidth() {
        return basicBandwidth;
    }

    public void setBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
    }

    public ProductSpecData withElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }

    /**
     * 弹性带宽值
     * minimum: 0
     * maximum: 2000
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return elasticBandwidth;
    }

    public void setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
    }

    public ProductSpecData withServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
        return this;
    }

    /**
     * 业务带宽值
     * minimum: 0
     * maximum: 2000
     * @return serviceBandwidth
     */
    public Integer getServiceBandwidth() {
        return serviceBandwidth;
    }

    public void setServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
    }

    public ProductSpecData withPortNum(Integer portNum) {
        this.portNum = portNum;
        return this;
    }

    /**
     * 端口数
     * minimum: 0
     * maximum: 2000
     * @return portNum
     */
    public Integer getPortNum() {
        return portNum;
    }

    public void setPortNum(Integer portNum) {
        this.portNum = portNum;
    }

    public ProductSpecData withBindDomainNum(Integer bindDomainNum) {
        this.bindDomainNum = bindDomainNum;
        return this;
    }

    /**
     * 域名数
     * minimum: 0
     * maximum: 2000
     * @return bindDomainNum
     */
    public Integer getBindDomainNum() {
        return bindDomainNum;
    }

    public void setBindDomainNum(Integer bindDomainNum) {
        this.bindDomainNum = bindDomainNum;
    }

    public ProductSpecData withElasticServiceBandwidth(Integer elasticServiceBandwidth) {
        this.elasticServiceBandwidth = elasticServiceBandwidth;
        return this;
    }

    /**
     * 弹性业务带宽值
     * minimum: 0
     * maximum: 2000
     * @return elasticServiceBandwidth
     */
    public Integer getElasticServiceBandwidth() {
        return elasticServiceBandwidth;
    }

    public void setElasticServiceBandwidth(Integer elasticServiceBandwidth) {
        this.elasticServiceBandwidth = elasticServiceBandwidth;
    }

    public ProductSpecData withElasticServiceBandwidthType(Integer elasticServiceBandwidthType) {
        this.elasticServiceBandwidthType = elasticServiceBandwidthType;
        return this;
    }

    /**
     * 弹性业务带宽类型
     * minimum: 0
     * maximum: 2000
     * @return elasticServiceBandwidthType
     */
    public Integer getElasticServiceBandwidthType() {
        return elasticServiceBandwidthType;
    }

    public void setElasticServiceBandwidthType(Integer elasticServiceBandwidthType) {
        this.elasticServiceBandwidthType = elasticServiceBandwidthType;
    }

    public ProductSpecData withMainResourceType(String mainResourceType) {
        this.mainResourceType = mainResourceType;
        return this;
    }

    /**
     * 主资源类型
     * @return mainResourceType
     */
    public String getMainResourceType() {
        return mainResourceType;
    }

    public void setMainResourceType(String mainResourceType) {
        this.mainResourceType = mainResourceType;
    }

    public ProductSpecData withMainResourceSpecCode(String mainResourceSpecCode) {
        this.mainResourceSpecCode = mainResourceSpecCode;
        return this;
    }

    /**
     * 主资源规格编码
     * @return mainResourceSpecCode
     */
    public String getMainResourceSpecCode() {
        return mainResourceSpecCode;
    }

    public void setMainResourceSpecCode(String mainResourceSpecCode) {
        this.mainResourceSpecCode = mainResourceSpecCode;
    }

    public ProductSpecData withMainResourceProductId(String mainResourceProductId) {
        this.mainResourceProductId = mainResourceProductId;
        return this;
    }

    /**
     * 主资源产品id
     * @return mainResourceProductId
     */
    public String getMainResourceProductId() {
        return mainResourceProductId;
    }

    public void setMainResourceProductId(String mainResourceProductId) {
        this.mainResourceProductId = mainResourceProductId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductSpecData that = (ProductSpecData) obj;
        return Objects.equals(this.productUuid, that.productUuid) && Objects.equals(this.ispSpec, that.ispSpec)
            && Objects.equals(this.dataCenter, that.dataCenter) && Objects.equals(this.specType, that.specType)
            && Objects.equals(this.basicBandwidth, that.basicBandwidth)
            && Objects.equals(this.elasticBandwidth, that.elasticBandwidth)
            && Objects.equals(this.serviceBandwidth, that.serviceBandwidth)
            && Objects.equals(this.portNum, that.portNum) && Objects.equals(this.bindDomainNum, that.bindDomainNum)
            && Objects.equals(this.elasticServiceBandwidth, that.elasticServiceBandwidth)
            && Objects.equals(this.elasticServiceBandwidthType, that.elasticServiceBandwidthType)
            && Objects.equals(this.mainResourceType, that.mainResourceType)
            && Objects.equals(this.mainResourceSpecCode, that.mainResourceSpecCode)
            && Objects.equals(this.mainResourceProductId, that.mainResourceProductId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productUuid,
            ispSpec,
            dataCenter,
            specType,
            basicBandwidth,
            elasticBandwidth,
            serviceBandwidth,
            portNum,
            bindDomainNum,
            elasticServiceBandwidth,
            elasticServiceBandwidthType,
            mainResourceType,
            mainResourceSpecCode,
            mainResourceProductId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductSpecData {\n");
        sb.append("    productUuid: ").append(toIndentedString(productUuid)).append("\n");
        sb.append("    ispSpec: ").append(toIndentedString(ispSpec)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    basicBandwidth: ").append(toIndentedString(basicBandwidth)).append("\n");
        sb.append("    elasticBandwidth: ").append(toIndentedString(elasticBandwidth)).append("\n");
        sb.append("    serviceBandwidth: ").append(toIndentedString(serviceBandwidth)).append("\n");
        sb.append("    portNum: ").append(toIndentedString(portNum)).append("\n");
        sb.append("    bindDomainNum: ").append(toIndentedString(bindDomainNum)).append("\n");
        sb.append("    elasticServiceBandwidth: ").append(toIndentedString(elasticServiceBandwidth)).append("\n");
        sb.append("    elasticServiceBandwidthType: ")
            .append(toIndentedString(elasticServiceBandwidthType))
            .append("\n");
        sb.append("    mainResourceType: ").append(toIndentedString(mainResourceType)).append("\n");
        sb.append("    mainResourceSpecCode: ").append(toIndentedString(mainResourceSpecCode)).append("\n");
        sb.append("    mainResourceProductId: ").append(toIndentedString(mainResourceProductId)).append("\n");
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

package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RateOnDemandReq
 */
public class RateOnDemandReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inquiry_precision")

    private Integer inquiryPrecision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<DemandProductInfo> productInfos = null;

    public RateOnDemandReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。  说明： 使用客户Token，可以调用通过assume_role方式获取用户token接口获取“regionId”的取值对应的“project id”。具体请参见如何将合作伙伴Token置换为客户Token的步骤2。IAM子用户调用此接口，需要IAM主账号授权，具体请参考创建用户组并授权。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RateOnDemandReq withInquiryPrecision(Integer inquiryPrecision) {
        this.inquiryPrecision = inquiryPrecision;
        return this;
    }

    /**
     * 查询价格结果的精度模式。 0：询价结果默认精度截取，即最长保留到元后6位小数点，如0.000001元1：询价结果保留10位精度，即最长保留到元后10位小数点，如1.0000000001元  说明： 如果询价结果只到元后2位或者3位，那么价格也只到元后2位或者3位，不管传0或者传1都一样，只有询价结果到了小数点后面6位以上，传0和传1才有区别。
     * minimum: 0
     * maximum: 1
     * @return inquiryPrecision
     */
    public Integer getInquiryPrecision() {
        return inquiryPrecision;
    }

    public void setInquiryPrecision(Integer inquiryPrecision) {
        this.inquiryPrecision = inquiryPrecision;
    }

    public RateOnDemandReq withProductInfos(List<DemandProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public RateOnDemandReq addProductInfosItem(DemandProductInfo productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public RateOnDemandReq withProductInfos(Consumer<List<DemandProductInfo>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息列表，询价时要询价产品的信息的列表，具体参见表1。
     * @return productInfos
     */
    public List<DemandProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<DemandProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateOnDemandReq that = (RateOnDemandReq) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.inquiryPrecision, that.inquiryPrecision)
            && Objects.equals(this.productInfos, that.productInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, inquiryPrecision, productInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateOnDemandReq {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    inquiryPrecision: ").append(toIndentedString(inquiryPrecision)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
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

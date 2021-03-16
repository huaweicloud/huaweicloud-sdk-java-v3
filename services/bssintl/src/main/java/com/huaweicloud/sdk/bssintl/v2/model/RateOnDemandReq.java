package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.DemandProductInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RateOnDemandReq
 */
public class RateOnDemandReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inquiry_precision")
    
    private Integer inquiryPrecision;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_infos")
    
    private List<DemandProductInfo> productInfos = null;
    
    public RateOnDemandReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * |参数名称：项目ID| |参数约束及描述：如果使用客户AK/SK或者Token，可以调用“通过assume_role方式获取用户token”接口获取“regionId”取值对应的project id。|
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
     * |参数名称：精度模式| |参数约束及描述：精度模式：0：询价结果默认精度截取，按需最长保留到元后6位小数点，如0.000001元;1：询价结果保留10位精度，即最长保留到分后10位小数点，如：1.0000000001元. 说明：如果定价只到元后2位或者3位，那么价格也只到元后2位或者3位，不管传0或者穿1都一样，只有定价定到了小数点后面6位以上，传0和传1才有区别。|
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
        this.productInfos.add(productInfosItem);
        return this;
    }

    public RateOnDemandReq withProductInfos(Consumer<List<DemandProductInfo>> productInfosSetter) {
        if(this.productInfos == null ){
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * |参数名称：产品信息列表| |参数的约束及描述：询价时要询价产品的信息的列表|
     * @return productInfos
     */
    public List<DemandProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<DemandProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RateOnDemandReq rateOnDemandReq = (RateOnDemandReq) o;
        return Objects.equals(this.projectId, rateOnDemandReq.projectId) &&
            Objects.equals(this.inquiryPrecision, rateOnDemandReq.inquiryPrecision) &&
            Objects.equals(this.productInfos, rateOnDemandReq.productInfos);
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


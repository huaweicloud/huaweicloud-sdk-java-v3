package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.PeriodProductInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RateOnPeriodReq
 */
public class RateOnPeriodReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_infos")
    
    private List<PeriodProductInfo> productInfos = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public RateOnPeriodReq withProductInfos(List<PeriodProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    
    public RateOnPeriodReq addProductInfosItem(PeriodProductInfo productInfosItem) {
        this.productInfos.add(productInfosItem);
        return this;
    }

    public RateOnPeriodReq withProductInfos(Consumer<List<PeriodProductInfo>> productInfosSetter) {
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
    public List<PeriodProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<PeriodProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    public RateOnPeriodReq withProjectId(String projectId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RateOnPeriodReq rateOnPeriodReq = (RateOnPeriodReq) o;
        return Objects.equals(this.productInfos, rateOnPeriodReq.productInfos) &&
            Objects.equals(this.projectId, rateOnPeriodReq.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productInfos, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateOnPeriodReq {\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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


package com.huaweicloud.sdk.bssintl.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.DemandDiscountRatingResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DemandProductRatingResult
 */
public class DemandProductRatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private BigDecimal discountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_rating_results")
    
    private List<DemandDiscountRatingResult> discountRatingResults = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_amount")
    
    private BigDecimal officialWebsiteAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;

    public DemandProductRatingResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：总额| |参数约束及描述：即最终优惠的金额|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DemandProductRatingResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：优惠额（官网价和总价的差）| |参数约束及描述：优惠额（官网价和总价的差）|
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public DemandProductRatingResult withDiscountRatingResults(List<DemandDiscountRatingResult> discountRatingResults) {
        this.discountRatingResults = discountRatingResults;
        return this;
    }

    
    public DemandProductRatingResult addDiscountRatingResultsItem(DemandDiscountRatingResult discountRatingResultsItem) {
        if (this.discountRatingResults == null) {
            this.discountRatingResults = new ArrayList<>();
        }
        this.discountRatingResults.add(discountRatingResultsItem);
        return this;
    }

    public DemandProductRatingResult withDiscountRatingResults(Consumer<List<DemandDiscountRatingResult>> discountRatingResultsSetter) {
        if(this.discountRatingResults == null ){
            this.discountRatingResults = new ArrayList<>();
        }
        discountRatingResultsSetter.accept(this.discountRatingResults);
        return this;
    }

    /**
     * |参数名称：折扣优惠明细| |参数的约束及描述：包含产品本身的促销信息，同时包含商务或者伙伴折扣的优惠信息|
     * @return discountRatingResults
     */
    public List<DemandDiscountRatingResult> getDiscountRatingResults() {
        return discountRatingResults;
    }

    public void setDiscountRatingResults(List<DemandDiscountRatingResult> discountRatingResults) {
        this.discountRatingResults = discountRatingResults;
    }

    public DemandProductRatingResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：ID标识| |参数约束及描述：同一次询价中不能重复，用于标识返回询价结果和请求的映射关系|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DemandProductRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位标识| |参数约束及描述：1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public DemandProductRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价| |参数约束及描述：官网价|
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public DemandProductRatingResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * |参数名称：寻到的产品ID| |参数约束及描述：寻到的产品ID|
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandProductRatingResult demandProductRatingResult = (DemandProductRatingResult) o;
        return Objects.equals(this.amount, demandProductRatingResult.amount) &&
            Objects.equals(this.discountAmount, demandProductRatingResult.discountAmount) &&
            Objects.equals(this.discountRatingResults, demandProductRatingResult.discountRatingResults) &&
            Objects.equals(this.id, demandProductRatingResult.id) &&
            Objects.equals(this.measureId, demandProductRatingResult.measureId) &&
            Objects.equals(this.officialWebsiteAmount, demandProductRatingResult.officialWebsiteAmount) &&
            Objects.equals(this.productId, demandProductRatingResult.productId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, discountAmount, discountRatingResults, id, measureId, officialWebsiteAmount, productId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandProductRatingResult {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountRatingResults: ").append(toIndentedString(discountRatingResults)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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


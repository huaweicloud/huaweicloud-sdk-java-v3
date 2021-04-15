package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.PeriodProductOfficialRatingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OfficialWebsiteRatingResult
 */
public class OfficialWebsiteRatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_amount")
    
    private Double officialWebsiteAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_rating_results")
    
    private List<PeriodProductOfficialRatingResult> productRatingResults = null;
    
    public OfficialWebsiteRatingResult withOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    


    /**
     * 包年/包月产品的官网价。
     * @return officialWebsiteAmount
     */
    public Double getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    

    public OfficialWebsiteRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * 价格度量单位标识。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    

    public OfficialWebsiteRatingResult withProductRatingResults(List<PeriodProductOfficialRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    
    public OfficialWebsiteRatingResult addProductRatingResultsItem(PeriodProductOfficialRatingResult productRatingResultsItem) {
        if(this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public OfficialWebsiteRatingResult withProductRatingResults(Consumer<List<PeriodProductOfficialRatingResult>> productRatingResultsSetter) {
        if(this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * 产品询价结果，具体参见表5。
     * @return productRatingResults
     */
    public List<PeriodProductOfficialRatingResult> getProductRatingResults() {
        return productRatingResults;
    }

    public void setProductRatingResults(List<PeriodProductOfficialRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfficialWebsiteRatingResult officialWebsiteRatingResult = (OfficialWebsiteRatingResult) o;
        return Objects.equals(this.officialWebsiteAmount, officialWebsiteRatingResult.officialWebsiteAmount) &&
            Objects.equals(this.measureId, officialWebsiteRatingResult.measureId) &&
            Objects.equals(this.productRatingResults, officialWebsiteRatingResult.productRatingResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(officialWebsiteAmount, measureId, productRatingResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfficialWebsiteRatingResult {\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    productRatingResults: ").append(toIndentedString(productRatingResults)).append("\n");
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


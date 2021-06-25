package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CcrulesListInfoActionDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 命中规则后采取的动作
 */
public class CcrulesListInfoAction  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private CcrulesListInfoActionDetail detail;

    public CcrulesListInfoAction withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public CcrulesListInfoAction withDetail(CcrulesListInfoActionDetail detail) {
        this.detail = detail;
        return this;
    }

    public CcrulesListInfoAction withDetail(Consumer<CcrulesListInfoActionDetail> detailSetter) {
        if(this.detail == null ){
            this.detail = new CcrulesListInfoActionDetail();
            detailSetter.accept(this.detail);
        }
        
        return this;
    }


    /**
     * Get detail
     * @return detail
     */
    public CcrulesListInfoActionDetail getDetail() {
        return detail;
    }

    public void setDetail(CcrulesListInfoActionDetail detail) {
        this.detail = detail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CcrulesListInfoAction ccrulesListInfoAction = (CcrulesListInfoAction) o;
        return Objects.equals(this.category, ccrulesListInfoAction.category) &&
            Objects.equals(this.detail, ccrulesListInfoAction.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcrulesListInfoAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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


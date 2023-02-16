package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数值范围参数结构体。
 */
public class RangeParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    
    private Double from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    
    private Double to;

    public RangeParam withFrom(Double from) {
        this.from = from;
        return this;
    }

    


    /**
     * 数值下界，默认包含该下界。
     * @return from
     */
    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    

    public RangeParam withTo(Double to) {
        this.to = to;
        return this;
    }

    


    /**
     * 数值上界，默认包含该上界。
     * @return to
     */
    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RangeParam rangeParam = (RangeParam) o;
        return Objects.equals(this.from, rangeParam.from) &&
            Objects.equals(this.to, rangeParam.to);
    }
    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RangeParam {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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


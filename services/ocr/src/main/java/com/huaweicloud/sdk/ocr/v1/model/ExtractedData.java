package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.MathInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ExtractedData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="math_info")
    
    private MathInfo mathInfo;

    public ExtractedData withMathInfo(MathInfo mathInfo) {
        this.mathInfo = mathInfo;
        return this;
    }

    public ExtractedData withMathInfo(Consumer<MathInfo> mathInfoSetter) {
        if(this.mathInfo == null ){
            this.mathInfo = new MathInfo();
            mathInfoSetter.accept(this.mathInfo);
        }
        
        return this;
    }


    /**
     * Get mathInfo
     * @return mathInfo
     */
    public MathInfo getMathInfo() {
        return mathInfo;
    }

    public void setMathInfo(MathInfo mathInfo) {
        this.mathInfo = mathInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtractedData extractedData = (ExtractedData) o;
        return Objects.equals(this.mathInfo, extractedData.mathInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mathInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtractedData {\n");
        sb.append("    mathInfo: ").append(toIndentedString(mathInfo)).append("\n");
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


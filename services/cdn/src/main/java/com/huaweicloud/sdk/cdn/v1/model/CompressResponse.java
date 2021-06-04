package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.CompressRules;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CompressResponse
 */
public class CompressResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compress_switch")
    
    private Integer compressSwitch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compress_rules")
    
    private CompressRules compressRules;

    public CompressResponse withCompressSwitch(Integer compressSwitch) {
        this.compressSwitch = compressSwitch;
        return this;
    }

    


    /**
     * GZIP压缩开关。0关闭。1打开
     * @return compressSwitch
     */
    public Integer getCompressSwitch() {
        return compressSwitch;
    }

    public void setCompressSwitch(Integer compressSwitch) {
        this.compressSwitch = compressSwitch;
    }

    

    public CompressResponse withCompressRules(CompressRules compressRules) {
        this.compressRules = compressRules;
        return this;
    }

    public CompressResponse withCompressRules(Consumer<CompressRules> compressRulesSetter) {
        if(this.compressRules == null ){
            this.compressRules = new CompressRules();
            compressRulesSetter.accept(this.compressRules);
        }
        
        return this;
    }


    /**
     * Get compressRules
     * @return compressRules
     */
    public CompressRules getCompressRules() {
        return compressRules;
    }

    public void setCompressRules(CompressRules compressRules) {
        this.compressRules = compressRules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompressResponse compressResponse = (CompressResponse) o;
        return Objects.equals(this.compressSwitch, compressResponse.compressSwitch) &&
            Objects.equals(this.compressRules, compressResponse.compressRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(compressSwitch, compressRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompressResponse {\n");
        sb.append("    compressSwitch: ").append(toIndentedString(compressSwitch)).append("\n");
        sb.append("    compressRules: ").append(toIndentedString(compressRules)).append("\n");
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


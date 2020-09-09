package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 变更实例规格时必填。
 */
public class ResizeFlavorRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;

    public ResizeFlavorRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeFlavorRequest resizeFlavorRequest = (ResizeFlavorRequest) o;
        return Objects.equals(this.specCode, resizeFlavorRequest.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeFlavorRequest {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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


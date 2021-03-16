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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    
    private Boolean isAutoPay;

    public ResizeFlavorRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。例如：rds.mysql.m1.xlarge。其中，rds代表RDS产品，mysql代表数据库引擎，m1.xlarge代表性能规格，为高内存类型。带\"rr\"的表示只读实例规格，反之表示单实例和HA实例规格。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    public ResizeFlavorRequest withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 变更包周期实例的规格时可指定，表示是否自动从客户的账户中支付。 - true，为自动支付。 - false，为手动支付，默认该方式。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
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
        return Objects.equals(this.specCode, resizeFlavorRequest.specCode) &&
            Objects.equals(this.isAutoPay, resizeFlavorRequest.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specCode, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeFlavorRequest {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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


package com.huaweicloud.sdk.gaussdbfornosql.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResizeInstanceRequestBody
 */
public class ResizeInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize")
    
    private ResizeInstanceOption resize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    
    private String isAutoPay;

    public ResizeInstanceRequestBody withResize(ResizeInstanceOption resize) {
        this.resize = resize;
        return this;
    }

    public ResizeInstanceRequestBody withResize(Consumer<ResizeInstanceOption> resizeSetter) {
        if(this.resize == null ){
            this.resize = new ResizeInstanceOption();
            resizeSetter.accept(this.resize);
        }
        
        return this;
    }


    /**
     * Get resize
     * @return resize
     */
    public ResizeInstanceOption getResize() {
        return resize;
    }

    public void setResize(ResizeInstanceOption resize) {
        this.resize = resize;
    }

    

    public ResizeInstanceRequestBody withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 创建包周期实例时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。 - 对于降低规格场景，该字段无效。 - 对于扩大规格场景：   - true，表示自动从账户中支付。   - false，表示手动从账户中支付，默认为该方式。
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
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
        ResizeInstanceRequestBody resizeInstanceRequestBody = (ResizeInstanceRequestBody) o;
        return Objects.equals(this.resize, resizeInstanceRequestBody.resize) &&
            Objects.equals(this.isAutoPay, resizeInstanceRequestBody.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resize, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceRequestBody {\n");
        sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
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


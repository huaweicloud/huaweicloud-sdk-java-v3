package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlResizeFlavor;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlChangeSpecificationRequest
 */
public class MysqlChangeSpecificationRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resize_flavor")
    

    private MysqlResizeFlavor resizeFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    

    private String isAutoPay;

    public MysqlChangeSpecificationRequest withResizeFlavor(MysqlResizeFlavor resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
        return this;
    }

    public MysqlChangeSpecificationRequest withResizeFlavor(Consumer<MysqlResizeFlavor> resizeFlavorSetter) {
        if(this.resizeFlavor == null ){
            this.resizeFlavor = new MysqlResizeFlavor();
            resizeFlavorSetter.accept(this.resizeFlavor);
        }
        
        return this;
    }


    /**
     * Get resizeFlavor
     * @return resizeFlavor
     */
    public MysqlResizeFlavor getResizeFlavor() {
        return resizeFlavor;
    }

    public void setResizeFlavor(MysqlResizeFlavor resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
    }

    

    public MysqlChangeSpecificationRequest withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 变更包周期实例规格时可指定，表示是否自动从客户的账户中支付。  - true，为自动支付，默认该方式。 - false，为手动支付。
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
        MysqlChangeSpecificationRequest mysqlChangeSpecificationRequest = (MysqlChangeSpecificationRequest) o;
        return Objects.equals(this.resizeFlavor, mysqlChangeSpecificationRequest.resizeFlavor) &&
            Objects.equals(this.isAutoPay, mysqlChangeSpecificationRequest.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resizeFlavor, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlChangeSpecificationRequest {\n");
        sb.append("    resizeFlavor: ").append(toIndentedString(resizeFlavor)).append("\n");
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


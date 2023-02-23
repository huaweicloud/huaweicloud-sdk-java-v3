package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 扩容信息
 */
public class MysqlExtendInstanceVolumeRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    

    private String isAutoPay;

    public MysqlExtendInstanceVolumeRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 扩容后的容量。包周期实例初始最小磁盘规格为40G，实例所选容量大小必须为10的整数倍，且大于实际使用容量，最大为128000GB.  取值范围： 扩容时必须大于等于50G； 缩容时必须大于等于40G。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public MysqlExtendInstanceVolumeRequest withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 表示是否自动从客户的账户中支付。  - true，为自动支付，默认该方式。 - false，为手动支付。
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
        MysqlExtendInstanceVolumeRequest mysqlExtendInstanceVolumeRequest = (MysqlExtendInstanceVolumeRequest) o;
        return Objects.equals(this.size, mysqlExtendInstanceVolumeRequest.size) &&
            Objects.equals(this.isAutoPay, mysqlExtendInstanceVolumeRequest.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlExtendInstanceVolumeRequest {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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


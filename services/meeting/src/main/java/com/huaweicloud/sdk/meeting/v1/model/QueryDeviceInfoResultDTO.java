package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 终端设备型号信息
 */
public class QueryDeviceInfoResultDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="model")
    
    private String model;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deviceSize")
    
    private String deviceSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="purchaseChannel")
    
    private String purchaseChannel;

    public QueryDeviceInfoResultDTO withModel(String model) {
        this.model = model;
        return this;
    }

    


    /**
     * 终端型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public QueryDeviceInfoResultDTO withDeviceSize(String deviceSize) {
        this.deviceSize = deviceSize;
        return this;
    }

    


    /**
     * 设备终端产品尺寸
     * @return deviceSize
     */
    public String getDeviceSize() {
        return deviceSize;
    }

    public void setDeviceSize(String deviceSize) {
        this.deviceSize = deviceSize;
    }

    public QueryDeviceInfoResultDTO withPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel;
        return this;
    }

    


    /**
     * 终端设备购买渠道
     * @return purchaseChannel
     */
    public String getPurchaseChannel() {
        return purchaseChannel;
    }

    public void setPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDeviceInfoResultDTO queryDeviceInfoResultDTO = (QueryDeviceInfoResultDTO) o;
        return Objects.equals(this.model, queryDeviceInfoResultDTO.model) &&
            Objects.equals(this.deviceSize, queryDeviceInfoResultDTO.deviceSize) &&
            Objects.equals(this.purchaseChannel, queryDeviceInfoResultDTO.purchaseChannel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, deviceSize, purchaseChannel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeviceInfoResultDTO {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    deviceSize: ").append(toIndentedString(deviceSize)).append("\n");
        sb.append("    purchaseChannel: ").append(toIndentedString(purchaseChannel)).append("\n");
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


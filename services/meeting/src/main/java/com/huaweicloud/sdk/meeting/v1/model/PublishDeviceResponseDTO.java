package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 发布的设备信息
 */
public class PublishDeviceResponseDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deviceUserId")
    
    private String deviceUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deviceName")
    
    private String deviceName;

    public PublishDeviceResponseDTO withDeviceUserId(String deviceUserId) {
        this.deviceUserId = deviceUserId;
        return this;
    }

    


    /**
     * 设备用户ID
     * @return deviceUserId
     */
    public String getDeviceUserId() {
        return deviceUserId;
    }

    public void setDeviceUserId(String deviceUserId) {
        this.deviceUserId = deviceUserId;
    }

    public PublishDeviceResponseDTO withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 设备名称
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishDeviceResponseDTO publishDeviceResponseDTO = (PublishDeviceResponseDTO) o;
        return Objects.equals(this.deviceUserId, publishDeviceResponseDTO.deviceUserId) &&
            Objects.equals(this.deviceName, publishDeviceResponseDTO.deviceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceUserId, deviceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishDeviceResponseDTO {\n");
        sb.append("    deviceUserId: ").append(toIndentedString(deviceUserId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
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


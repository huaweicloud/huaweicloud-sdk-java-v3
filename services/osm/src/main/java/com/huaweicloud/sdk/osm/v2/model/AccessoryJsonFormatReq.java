package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccessoryJsonFormatReq
 */
public class AccessoryJsonFormatReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessory_name")
    
    private String accessoryName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessory_from")
    
    private String accessoryFrom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="upload_type")
    
    private Integer uploadType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessory_data")
    
    private byte[] accessoryData;

    public AccessoryJsonFormatReq withAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
        return this;
    }

    


    /**
     * 文件名称
     * @return accessoryName
     */
    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public AccessoryJsonFormatReq withAccessoryFrom(String accessoryFrom) {
        this.accessoryFrom = accessoryFrom;
        return this;
    }

    


    /**
     * 文件来源
     * @return accessoryFrom
     */
    public String getAccessoryFrom() {
        return accessoryFrom;
    }

    public void setAccessoryFrom(String accessoryFrom) {
        this.accessoryFrom = accessoryFrom;
    }

    public AccessoryJsonFormatReq withUploadType(Integer uploadType) {
        this.uploadType = uploadType;
        return this;
    }

    


    /**
     * 上传类型
     * minimum: 0
     * maximum: 1
     * @return uploadType
     */
    public Integer getUploadType() {
        return uploadType;
    }

    public void setUploadType(Integer uploadType) {
        this.uploadType = uploadType;
    }

    public AccessoryJsonFormatReq withAccessoryData(byte[] accessoryData) {
        this.accessoryData = accessoryData;
        return this;
    }

    


    /**
     * 文件字节流
     * @return accessoryData
     */
    public byte[] getAccessoryData() {
        return accessoryData;
    }

    public void setAccessoryData(byte[] accessoryData) {
        this.accessoryData = accessoryData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessoryJsonFormatReq accessoryJsonFormatReq = (AccessoryJsonFormatReq) o;
        return Objects.equals(this.accessoryName, accessoryJsonFormatReq.accessoryName) &&
            Objects.equals(this.accessoryFrom, accessoryJsonFormatReq.accessoryFrom) &&
            Objects.equals(this.uploadType, accessoryJsonFormatReq.uploadType) &&
            Objects.equals(this.accessoryData, accessoryJsonFormatReq.accessoryData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessoryName, accessoryFrom, uploadType, accessoryData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessoryJsonFormatReq {\n");
        sb.append("    accessoryName: ").append(toIndentedString(accessoryName)).append("\n");
        sb.append("    accessoryFrom: ").append(toIndentedString(accessoryFrom)).append("\n");
        sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
        sb.append("    accessoryData: ").append(toIndentedString(accessoryData)).append("\n");
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


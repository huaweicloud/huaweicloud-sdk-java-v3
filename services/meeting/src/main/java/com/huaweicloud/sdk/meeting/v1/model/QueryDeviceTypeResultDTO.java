package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 终端类型 */
public class QueryDeviceTypeResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableActiveCode")

    private Boolean enableActiveCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportProjectionCode")

    private Boolean supportProjectionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportSVC")

    private Boolean supportSVC;

    public QueryDeviceTypeResultDTO withType(String type) {
        this.type = type;
        return this;
    }

    /** 终端类型，区分自研和第三方终端
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QueryDeviceTypeResultDTO withModel(String model) {
        this.model = model;
        return this;
    }

    /** 终端型号，枚举类型。当前支持TE系列硬件终端，具体的终端类型可以通过获取所有终端类型接口查询。
     * 
     * @return model */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public QueryDeviceTypeResultDTO withEnableActiveCode(Boolean enableActiveCode) {
        this.enableActiveCode = enableActiveCode;
        return this;
    }

    /** 是否支持激活码
     * 
     * @return enableActiveCode */
    public Boolean getEnableActiveCode() {
        return enableActiveCode;
    }

    public void setEnableActiveCode(Boolean enableActiveCode) {
        this.enableActiveCode = enableActiveCode;
    }

    public QueryDeviceTypeResultDTO withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /** 屏幕分辨率。1080P、720P等。
     * 
     * @return resolution */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public QueryDeviceTypeResultDTO withSupportProjectionCode(Boolean supportProjectionCode) {
        this.supportProjectionCode = supportProjectionCode;
        return this;
    }

    /** 是否支持投影码
     * 
     * @return supportProjectionCode */
    public Boolean getSupportProjectionCode() {
        return supportProjectionCode;
    }

    public void setSupportProjectionCode(Boolean supportProjectionCode) {
        this.supportProjectionCode = supportProjectionCode;
    }

    public QueryDeviceTypeResultDTO withSupportSVC(Boolean supportSVC) {
        this.supportSVC = supportSVC;
        return this;
    }

    /** 是否支持SVC
     * 
     * @return supportSVC */
    public Boolean getSupportSVC() {
        return supportSVC;
    }

    public void setSupportSVC(Boolean supportSVC) {
        this.supportSVC = supportSVC;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDeviceTypeResultDTO queryDeviceTypeResultDTO = (QueryDeviceTypeResultDTO) o;
        return Objects.equals(this.type, queryDeviceTypeResultDTO.type)
            && Objects.equals(this.model, queryDeviceTypeResultDTO.model)
            && Objects.equals(this.enableActiveCode, queryDeviceTypeResultDTO.enableActiveCode)
            && Objects.equals(this.resolution, queryDeviceTypeResultDTO.resolution)
            && Objects.equals(this.supportProjectionCode, queryDeviceTypeResultDTO.supportProjectionCode)
            && Objects.equals(this.supportSVC, queryDeviceTypeResultDTO.supportSVC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, model, enableActiveCode, resolution, supportProjectionCode, supportSVC);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDeviceTypeResultDTO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    enableActiveCode: ").append(toIndentedString(enableActiveCode)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    supportProjectionCode: ").append(toIndentedString(supportProjectionCode)).append("\n");
        sb.append("    supportSVC: ").append(toIndentedString(supportSVC)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

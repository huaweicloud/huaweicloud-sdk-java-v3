package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RegisterImeiReq
 */
public class RegisterImeiReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_type")

    private Integer bindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imei")

    private String imei;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    public RegisterImeiReq withBindType(Integer bindType) {
        this.bindType = bindType;
        return this;
    }

    /**
     * 绑定类型(1:普通机卡重绑，2：固定机卡重绑)
     * minimum: 1
     * maximum: 2
     * @return bindType
     */
    public Integer getBindType() {
        return bindType;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public RegisterImeiReq withImei(String imei) {
        this.imei = imei;
        return this;
    }

    /**
     * 设备IMEI,84584xxxxxx
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public RegisterImeiReq withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * iccid，传入的sim_card_id为0,则根据iccid进行处理
     * @return iccid
     */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterImeiReq that = (RegisterImeiReq) obj;
        return Objects.equals(this.bindType, that.bindType) && Objects.equals(this.imei, that.imei)
            && Objects.equals(this.iccid, that.iccid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindType, imei, iccid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterImeiReq {\n");
        sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
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

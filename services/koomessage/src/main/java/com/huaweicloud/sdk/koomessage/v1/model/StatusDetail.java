package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatusDetail
 */
public class StatusDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier")

    private String carrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public StatusDetail withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * 运营商类型。  - cmcc：中国移动 - cucc：中国联通 - ctcc：中国电信 - oversea：港澳台及国外 - unknown：未知 
     * @return carrier
     */
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public StatusDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态： - 0：正常可用  - 1：审核中  - 2：审核不通过  - 3：模板已禁用  - 4：模板不存在  - 5：模板已过期 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public StatusDetail withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 对模板状态的描述。  > 若状态是审核不通过或被禁用，描述表示的是不通过或禁用的原因。 
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusDetail statusDetail = (StatusDetail) o;
        return Objects.equals(this.carrier, statusDetail.carrier) && Objects.equals(this.status, statusDetail.status)
            && Objects.equals(this.desc, statusDetail.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrier, status, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusDetail {\n");
        sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

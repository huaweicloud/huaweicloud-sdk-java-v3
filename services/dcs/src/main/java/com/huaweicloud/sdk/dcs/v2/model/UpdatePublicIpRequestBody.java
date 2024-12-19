package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePublicIpRequestBody
 */
public class UpdatePublicIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    public UpdatePublicIpRequestBody withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 公网访问绑定的ELB的EIP的ID，当Redis版本为3.0时，该参数为必填参数。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public UpdatePublicIpRequestBody withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 是否开启SSL，仅在开启SSL时有值，当Redis版本为3.0时，该参数为必填参数。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public UpdatePublicIpRequestBody withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * 公网访问绑定的ELB ID，当Redis版本为4.0，5.0，6.0和企业版时，该参数为必填参数。
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePublicIpRequestBody that = (UpdatePublicIpRequestBody) obj;
        return Objects.equals(this.publicipId, that.publicipId) && Objects.equals(this.enableSsl, that.enableSsl)
            && Objects.equals(this.elbId, that.elbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, enableSsl, elbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicIpRequestBody {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
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

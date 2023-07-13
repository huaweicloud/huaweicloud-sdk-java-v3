package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机绑定\\解绑弹性公网IP请求对象。
 */
public class OperateEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip")

    private String publicEip;

    public OperateEipRequestBody withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 弹性公网IP的ID,使用UUID格式。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public OperateEipRequestBody withPublicEip(String publicEip) {
        this.publicEip = publicEip;
        return this;
    }

    /**
     * 弹性公网IP，使用IP地址。
     * @return publicEip
     */
    public String getPublicEip() {
        return publicEip;
    }

    public void setPublicEip(String publicEip) {
        this.publicEip = publicEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateEipRequestBody that = (OperateEipRequestBody) obj;
        return Objects.equals(this.publicipId, that.publicipId) && Objects.equals(this.publicEip, that.publicEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, publicEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateEipRequestBody {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicEip: ").append(toIndentedString(publicEip)).append("\n");
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

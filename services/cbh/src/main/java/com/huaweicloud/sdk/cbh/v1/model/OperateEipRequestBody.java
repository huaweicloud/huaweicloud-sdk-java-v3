package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 管理CBH实例Eip响应对象
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
     * 弹性ip的id
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
     * 弹性ip
     * @return publicEip
     */
    public String getPublicEip() {
        return publicEip;
    }

    public void setPublicEip(String publicEip) {
        this.publicEip = publicEip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateEipRequestBody operateEipRequestBody = (OperateEipRequestBody) o;
        return Objects.equals(this.publicipId, operateEipRequestBody.publicipId)
            && Objects.equals(this.publicEip, operateEipRequestBody.publicEip);
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

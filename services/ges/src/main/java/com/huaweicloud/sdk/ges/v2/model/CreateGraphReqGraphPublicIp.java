package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 公网IP地址，如果未指定，则默认不使用公网连接。
 */
public class CreateGraphReqGraphPublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_bind_type")

    private String publicBindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    public CreateGraphReqGraphPublicIp withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    /**
     * 弹性IP绑定类型，取值如下。  - auto_assign：自动绑定。 - bind_existing：使用已有。
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
    }

    public CreateGraphReqGraphPublicIp withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性IP的id，当publicBindType设置为bind_existing时，该值为用户某个已创建但尚未绑定的EIP的ID；当publicBindType设置为auto_assign时，该值设置为空。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGraphReqGraphPublicIp that = (CreateGraphReqGraphPublicIp) obj;
        return Objects.equals(this.publicBindType, that.publicBindType) && Objects.equals(this.eipId, that.eipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicBindType, eipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReqGraphPublicIp {\n");
        sb.append("    publicBindType: ").append(toIndentedString(publicBindType)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
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

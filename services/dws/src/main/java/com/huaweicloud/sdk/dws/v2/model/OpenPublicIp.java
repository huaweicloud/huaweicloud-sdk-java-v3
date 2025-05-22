package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 弹性公网IP对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class OpenPublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_bind_type")

    private String publicBindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    public OpenPublicIp withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    /**
     * **参数解释**： 弹性IP绑定类型。 **约束限制**： 不涉及。 **取值范围**： - auto_assign：自动绑定 - not_use：暂未使用 - bind_existing ：使用已有  **默认取值**： 不涉及。
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
    }

    public OpenPublicIp withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * **参数解释**： 弹性IP的ID **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
        OpenPublicIp that = (OpenPublicIp) obj;
        return Objects.equals(this.publicBindType, that.publicBindType) && Objects.equals(this.eipId, that.eipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicBindType, eipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenPublicIp {\n");
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

package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Er
 */
public class Er {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_attach_id")

    private String erAttachId;

    public Er withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * **参数解释**： ER ID，创建东西向防护引用的 ID **取值范围**： 不涉及
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public Er withErAttachId(String erAttachId) {
        this.erAttachId = erAttachId;
        return this;
    }

    /**
     * **参数解释**： 企业路由器连接id，该连接用于连接防火墙和企业路由器，此字段可在通过id在ER界面查询指定er后在管理连接界面查询连接，了解连接具体情况。 **取值范围**： 不涉及
     * @return erAttachId
     */
    public String getErAttachId() {
        return erAttachId;
    }

    public void setErAttachId(String erAttachId) {
        this.erAttachId = erAttachId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Er that = (Er) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.erAttachId, that.erAttachId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, erAttachId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Er {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    erAttachId: ").append(toIndentedString(erAttachId)).append("\n");
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

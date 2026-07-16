package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 委托元数据信息
 */
public class AssumedAgency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public AssumedAgency withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * **参数解释**： 委托的唯一身份标识信息，形如： sts::{account_id}::assumed-agency:{agency_name}/{agency_session_name} **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public AssumedAgency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 委托的id属性，形如： {agency_id}:{agency_session_name} **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumedAgency that = (AssumedAgency) obj;
        return Objects.equals(this.urn, that.urn) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urn, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumedAgency {\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPrivateDnatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule_id")

    private String dnatRuleId;

    public ShowPrivateDnatRequest withDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
        return this;
    }

    /**
     * DNAT规则的ID。
     * @return dnatRuleId
     */
    public String getDnatRuleId() {
        return dnatRuleId;
    }

    public void setDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPrivateDnatRequest that = (ShowPrivateDnatRequest) obj;
        return Objects.equals(this.dnatRuleId, that.dnatRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateDnatRequest {\n");
        sb.append("    dnatRuleId: ").append(toIndentedString(dnatRuleId)).append("\n");
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

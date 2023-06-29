package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新DNAT规则的请求体。
 */
public class UpdatePrivateDnatRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule")

    private UpdatePrivateDnatOption dnatRule;

    public UpdatePrivateDnatRequestBody withDnatRule(UpdatePrivateDnatOption dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public UpdatePrivateDnatRequestBody withDnatRule(Consumer<UpdatePrivateDnatOption> dnatRuleSetter) {
        if (this.dnatRule == null) {
            this.dnatRule = new UpdatePrivateDnatOption();
            dnatRuleSetter.accept(this.dnatRule);
        }

        return this;
    }

    /**
     * Get dnatRule
     * @return dnatRule
     */
    public UpdatePrivateDnatOption getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(UpdatePrivateDnatOption dnatRule) {
        this.dnatRule = dnatRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePrivateDnatRequestBody that = (UpdatePrivateDnatRequestBody) obj;
        return Objects.equals(this.dnatRule, that.dnatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateDnatRequestBody {\n");
        sb.append("    dnatRule: ").append(toIndentedString(dnatRule)).append("\n");
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

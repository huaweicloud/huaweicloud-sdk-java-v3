package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建SNAT规则的请求体。
 */
public class CreatePrivateSnatOptionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private CreatePrivateSnatOption snatRule;

    public CreatePrivateSnatOptionBody withSnatRule(CreatePrivateSnatOption snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public CreatePrivateSnatOptionBody withSnatRule(Consumer<CreatePrivateSnatOption> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new CreatePrivateSnatOption();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /**
     * Get snatRule
     * @return snatRule
     */
    public CreatePrivateSnatOption getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(CreatePrivateSnatOption snatRule) {
        this.snatRule = snatRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateSnatOptionBody that = (CreatePrivateSnatOptionBody) obj;
        return Objects.equals(this.snatRule, that.snatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateSnatOptionBody {\n");
        sb.append("    snatRule: ").append(toIndentedString(snatRule)).append("\n");
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

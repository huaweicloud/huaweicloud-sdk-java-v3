package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessPolicy
 */
public class AccessPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed")

    private Integer changed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private Integer eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat")

    private Integer nat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AccessPolicy withChanged(Integer changed) {
        this.changed = changed;
        return this;
    }

    /**
     * **参数解释**： 变化数量 **取值范围**： 不涉及
     * @return changed
     */
    public Integer getChanged() {
        return changed;
    }

    public void setChanged(Integer changed) {
        this.changed = changed;
    }

    public AccessPolicy withEip(Integer eip) {
        this.eip = eip;
        return this;
    }

    /**
     * **参数解释**： EIP访问控制策略 **取值范围**： 不涉及
     * @return eip
     */
    public Integer getEip() {
        return eip;
    }

    public void setEip(Integer eip) {
        this.eip = eip;
    }

    public AccessPolicy withNat(Integer nat) {
        this.nat = nat;
        return this;
    }

    /**
     * **参数解释**： NAT访问控制策略 **取值范围**： 不涉及
     * @return nat
     */
    public Integer getNat() {
        return nat;
    }

    public void setNat(Integer nat) {
        this.nat = nat;
    }

    public AccessPolicy withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总数 **取值范围**： 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessPolicy that = (AccessPolicy) obj;
        return Objects.equals(this.changed, that.changed) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.nat, that.nat) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changed, eip, nat, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicy {\n");
        sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttackEvent
 */
public class AttackEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed")

    private Integer changed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny")

    private Integer deny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AttackEvent withChanged(Integer changed) {
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

    public AttackEvent withDeny(Integer deny) {
        this.deny = deny;
        return this;
    }

    /**
     * **参数解释**： 阻断数量 **取值范围**： 不涉及
     * @return deny
     */
    public Integer getDeny() {
        return deny;
    }

    public void setDeny(Integer deny) {
        this.deny = deny;
    }

    public AttackEvent withTotal(Integer total) {
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
        AttackEvent that = (AttackEvent) obj;
        return Objects.equals(this.changed, that.changed) && Objects.equals(this.deny, that.deny)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changed, deny, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackEvent {\n");
        sb.append("    changed: ").append(toIndentedString(changed)).append("\n");
        sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
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

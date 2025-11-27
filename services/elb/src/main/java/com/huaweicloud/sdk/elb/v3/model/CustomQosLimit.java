package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomQosLimit
 */
public class CustomQosLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4")

    private L4Limit l4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7")

    private L7Limit l7;

    public CustomQosLimit withL4(L4Limit l4) {
        this.l4 = l4;
        return this;
    }

    public CustomQosLimit withL4(Consumer<L4Limit> l4Setter) {
        if (this.l4 == null) {
            this.l4 = new L4Limit();
            l4Setter.accept(this.l4);
        }

        return this;
    }

    /**
     * Get l4
     * @return l4
     */
    public L4Limit getL4() {
        return l4;
    }

    public void setL4(L4Limit l4) {
        this.l4 = l4;
    }

    public CustomQosLimit withL7(L7Limit l7) {
        this.l7 = l7;
        return this;
    }

    public CustomQosLimit withL7(Consumer<L7Limit> l7Setter) {
        if (this.l7 == null) {
            this.l7 = new L7Limit();
            l7Setter.accept(this.l7);
        }

        return this;
    }

    /**
     * Get l7
     * @return l7
     */
    public L7Limit getL7() {
        return l7;
    }

    public void setL7(L7Limit l7) {
        this.l7 = l7;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomQosLimit that = (CustomQosLimit) obj;
        return Objects.equals(this.l4, that.l4) && Objects.equals(this.l7, that.l7);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l4, l7);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomQosLimit {\n");
        sb.append("    l4: ").append(toIndentedString(l4)).append("\n");
        sb.append("    l7: ").append(toIndentedString(l7)).append("\n");
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

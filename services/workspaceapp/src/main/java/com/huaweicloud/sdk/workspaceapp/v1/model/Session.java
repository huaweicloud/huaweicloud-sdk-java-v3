package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Session
 */
public class Session {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sbc")

    private Sbc sbc;

    public Session withSbc(Sbc sbc) {
        this.sbc = sbc;
        return this;
    }

    public Session withSbc(Consumer<Sbc> sbcSetter) {
        if (this.sbc == null) {
            this.sbc = new Sbc();
            sbcSetter.accept(this.sbc);
        }

        return this;
    }

    /**
     * Get sbc
     * @return sbc
     */
    public Sbc getSbc() {
        return sbc;
    }

    public void setSbc(Sbc sbc) {
        this.sbc = sbc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session that = (Session) obj;
        return Objects.equals(this.sbc, that.sbc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sbc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Session {\n");
        sb.append("    sbc: ").append(toIndentedString(sbc)).append("\n");
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

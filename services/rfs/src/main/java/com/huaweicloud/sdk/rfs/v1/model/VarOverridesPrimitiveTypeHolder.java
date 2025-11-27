package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VarOverridesPrimitiveTypeHolder
 */
public class VarOverridesPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_overrides")

    private VarOverridesPrimitiveTypeHolderVarOverrides varOverrides;

    public VarOverridesPrimitiveTypeHolder withVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
        return this;
    }

    public VarOverridesPrimitiveTypeHolder withVarOverrides(
        Consumer<VarOverridesPrimitiveTypeHolderVarOverrides> varOverridesSetter) {
        if (this.varOverrides == null) {
            this.varOverrides = new VarOverridesPrimitiveTypeHolderVarOverrides();
            varOverridesSetter.accept(this.varOverrides);
        }

        return this;
    }

    /**
     * Get varOverrides
     * @return varOverrides
     */
    public VarOverridesPrimitiveTypeHolderVarOverrides getVarOverrides() {
        return varOverrides;
    }

    public void setVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VarOverridesPrimitiveTypeHolder that = (VarOverridesPrimitiveTypeHolder) obj;
        return Objects.equals(this.varOverrides, that.varOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VarOverridesPrimitiveTypeHolder {\n");
        sb.append("    varOverrides: ").append(toIndentedString(varOverrides)).append("\n");
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

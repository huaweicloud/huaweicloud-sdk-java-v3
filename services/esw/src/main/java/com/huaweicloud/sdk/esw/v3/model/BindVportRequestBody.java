package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BindVportRequestBody
 */
public class BindVportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vport")

    private Vport vport;

    public BindVportRequestBody withVport(Vport vport) {
        this.vport = vport;
        return this;
    }

    public BindVportRequestBody withVport(Consumer<Vport> vportSetter) {
        if (this.vport == null) {
            this.vport = new Vport();
            vportSetter.accept(this.vport);
        }

        return this;
    }

    /**
     * Get vport
     * @return vport
     */
    public Vport getVport() {
        return vport;
    }

    public void setVport(Vport vport) {
        this.vport = vport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindVportRequestBody that = (BindVportRequestBody) obj;
        return Objects.equals(this.vport, that.vport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindVportRequestBody {\n");
        sb.append("    vport: ").append(toIndentedString(vport)).append("\n");
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

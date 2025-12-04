package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BareMetalModifyPortRequestBody
 */
public class BareMetalModifyPortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic")

    private BareMetalModifyPortRequest nic;

    public BareMetalModifyPortRequestBody withNic(BareMetalModifyPortRequest nic) {
        this.nic = nic;
        return this;
    }

    public BareMetalModifyPortRequestBody withNic(Consumer<BareMetalModifyPortRequest> nicSetter) {
        if (this.nic == null) {
            this.nic = new BareMetalModifyPortRequest();
            nicSetter.accept(this.nic);
        }

        return this;
    }

    /**
     * Get nic
     * @return nic
     */
    public BareMetalModifyPortRequest getNic() {
        return nic;
    }

    public void setNic(BareMetalModifyPortRequest nic) {
        this.nic = nic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BareMetalModifyPortRequestBody that = (BareMetalModifyPortRequestBody) obj;
        return Objects.equals(this.nic, that.nic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BareMetalModifyPortRequestBody {\n");
        sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
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

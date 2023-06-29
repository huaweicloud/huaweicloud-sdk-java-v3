package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateRoutetableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private Routetable routetable;

    public CreateRoutetableResponse withRoutetable(Routetable routetable) {
        this.routetable = routetable;
        return this;
    }

    public CreateRoutetableResponse withRoutetable(Consumer<Routetable> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new Routetable();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /**
     * Get routetable
     * @return routetable
     */
    public Routetable getRoutetable() {
        return routetable;
    }

    public void setRoutetable(Routetable routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRoutetableResponse that = (CreateRoutetableResponse) obj;
        return Objects.equals(this.routetable, that.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoutetableResponse {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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

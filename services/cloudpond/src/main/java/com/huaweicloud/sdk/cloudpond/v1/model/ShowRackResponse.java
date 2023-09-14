package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack")

    private Rack rack;

    public ShowRackResponse withRack(Rack rack) {
        this.rack = rack;
        return this;
    }

    public ShowRackResponse withRack(Consumer<Rack> rackSetter) {
        if (this.rack == null) {
            this.rack = new Rack();
            rackSetter.accept(this.rack);
        }

        return this;
    }

    /**
     * Get rack
     * @return rack
     */
    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRackResponse that = (ShowRackResponse) obj;
        return Objects.equals(this.rack, that.rack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRackResponse {\n");
        sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
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

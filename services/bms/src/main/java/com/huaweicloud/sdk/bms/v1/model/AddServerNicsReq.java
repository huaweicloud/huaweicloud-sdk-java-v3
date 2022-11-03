package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class AddServerNicsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private ServerNicsReq nics;

    public AddServerNicsReq withNics(ServerNicsReq nics) {
        this.nics = nics;
        return this;
    }

    public AddServerNicsReq withNics(Consumer<ServerNicsReq> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ServerNicsReq();
            nicsSetter.accept(this.nics);
        }

        return this;
    }

    /**
     * Get nics
     * @return nics
     */
    public ServerNicsReq getNics() {
        return nics;
    }

    public void setNics(ServerNicsReq nics) {
        this.nics = nics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddServerNicsReq addServerNicsReq = (AddServerNicsReq) o;
        return Objects.equals(this.nics, addServerNicsReq.nics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServerNicsReq {\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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
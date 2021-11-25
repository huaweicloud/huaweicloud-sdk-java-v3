package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 专属主机上创建的云服务器规格。 */
public class RespInstanceCapacity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    public RespInstanceCapacity withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /** 支持创建的云服务器规格。
     * 
     * @return flavor */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespInstanceCapacity respInstanceCapacity = (RespInstanceCapacity) o;
        return Objects.equals(this.flavor, respInstanceCapacity.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespInstanceCapacity {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

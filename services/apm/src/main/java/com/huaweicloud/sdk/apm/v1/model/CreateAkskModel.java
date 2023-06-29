package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 新增ak-sk入参。
 */
public class CreateAkskModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    public CreateAkskModel withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * 描述信息。
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAkskModel that = (CreateAkskModel) obj;
        return Objects.equals(this.descp, that.descp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAkskModel {\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
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

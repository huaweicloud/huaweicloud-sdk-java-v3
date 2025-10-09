package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyInstancePortRequestBody
 */
public class ModifyInstancePortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public ModifyInstancePortRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 实例设置的数据库端口号。 **约束限制**: 不涉及。 **取值范围**: 1024~39998（其中2378、2379、2380、4999、5000、5999、6000、60001、8097、8098、12016、12017、20049、20050、21731、21732、32122、32123和32124被系统占用不可设置）。 **默认取值**: 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyInstancePortRequestBody that = (ModifyInstancePortRequestBody) obj;
        return Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstancePortRequestBody {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * This is a auto read_weight Body Object
 */
public class ModifyReadAndWriteStrategyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_weight")

    @JacksonXmlProperty(localName = "read_weight")

    private Object readWeight;

    public ModifyReadAndWriteStrategyReq withReadWeight(Object readWeight) {
        this.readWeight = readWeight;
        return this;
    }

    /**
     * 主数据库实例与只读数据库实例的读权重集合。
     * @return readWeight
     */
    public Object getReadWeight() {
        return readWeight;
    }

    public void setReadWeight(Object readWeight) {
        this.readWeight = readWeight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyReadAndWriteStrategyReq modifyReadAndWriteStrategyReq = (ModifyReadAndWriteStrategyReq) o;
        return Objects.equals(this.readWeight, modifyReadAndWriteStrategyReq.readWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readWeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyReadAndWriteStrategyReq {\n");
        sb.append("    readWeight: ").append(toIndentedString(readWeight)).append("\n");
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

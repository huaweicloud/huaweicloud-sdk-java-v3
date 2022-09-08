package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CdmStartClusterReq
 */
public class CdmStartClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Object start;

    public CdmStartClusterReq withStart(Object start) {
        this.start = start;
        return this;
    }

    /**
     * 集群启动操作，定义集群启动标识，为空对象
     * @return start
     */
    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmStartClusterReq cdmStartClusterReq = (CdmStartClusterReq) o;
        return Objects.equals(this.start, cdmStartClusterReq.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmStartClusterReq {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

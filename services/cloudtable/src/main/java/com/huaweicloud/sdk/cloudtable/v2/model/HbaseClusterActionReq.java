package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HbaseClusterActionReq
 */
public class HbaseClusterActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart")

    private Object restart;

    public HbaseClusterActionReq withRestart(Object restart) {
        this.restart = restart;
        return this;
    }

    /**
     * 该请求参数内无其他内容，但是需要该参数作为重启集群入参，示例看下述所示
     * @return restart
     */
    public Object getRestart() {
        return restart;
    }

    public void setRestart(Object restart) {
        this.restart = restart;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HbaseClusterActionReq hbaseClusterActionReq = (HbaseClusterActionReq) o;
        return Objects.equals(this.restart, hbaseClusterActionReq.restart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HbaseClusterActionReq {\n");
        sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
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

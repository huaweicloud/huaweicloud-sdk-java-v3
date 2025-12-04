package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Integer qps;

    public ListUrlResponse withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * 所有请求的每秒请求数
     * @return qps
     */
    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUrlResponse that = (ListUrlResponse) obj;
        return Objects.equals(this.qps, that.qps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUrlResponse {\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
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

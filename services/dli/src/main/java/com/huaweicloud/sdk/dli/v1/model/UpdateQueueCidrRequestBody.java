package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改队列网段的请求body体。
 */
public class UpdateQueueCidrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_in_vpc")

    private String cidrInVpc;

    public UpdateQueueCidrRequestBody withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    /**
     * 队列虚拟私有云网段。  不同CU规格队列支持的网段范围：  - 4cu:  10.0.0.0/8 ~ 10.255.255.192/26  172.16.0.0/12 ~ 172.31.255.192/26  192.168.0.0/16 ~ 192.168.255.192/26  - 16cu:  10.0.0.0/8 ~ 10.255.255.0/24  172.16.0.0/12 ~ 172.31.255.0/24  192.168.0.0/16 ~ 192.168.255.0/24  - 64cu:  10.0.0.0/8 ~ 10.255.252.0/22  172.16.0.0/12 ~ 172.31.252.0/22  192.168.0.0/16 ~ 192.168.252.0/22  - 128cu:  10.0.0.0/8 ~ 10.255.252.0/21  172.16.0.0/12 ~ 172.31.252.0/21  192.168.0.0/16 ~ 192.168.252.0/21
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateQueueCidrRequestBody that = (UpdateQueueCidrRequestBody) obj;
        return Objects.equals(this.cidrInVpc, that.cidrInVpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrInVpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateQueueCidrRequestBody {\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
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

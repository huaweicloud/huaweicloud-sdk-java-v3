package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ListClusterSshStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sshOpsStat")

    private BigDecimal sshOpsStat;

    public ListClusterSshStateResponse withSshOpsStat(BigDecimal sshOpsStat) {
        this.sshOpsStat = sshOpsStat;
        return this;
    }

    /**
     * 查询指定集群节点授权状态 - -1：未开启集群节点授权 - 0：开启集群节点授权失败 - 1：正在开启集群节点授权 - 2：已开启集群节点授权 - 3：集群节点授权即将失效状态 - 4：集群节点授权已失效状态
     * @return sshOpsStat
     */
    public BigDecimal getSshOpsStat() {
        return sshOpsStat;
    }

    public void setSshOpsStat(BigDecimal sshOpsStat) {
        this.sshOpsStat = sshOpsStat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterSshStateResponse that = (ListClusterSshStateResponse) obj;
        return Objects.equals(this.sshOpsStat, that.sshOpsStat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshOpsStat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterSshStateResponse {\n");
        sb.append("    sshOpsStat: ").append(toIndentedString(sshOpsStat)).append("\n");
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

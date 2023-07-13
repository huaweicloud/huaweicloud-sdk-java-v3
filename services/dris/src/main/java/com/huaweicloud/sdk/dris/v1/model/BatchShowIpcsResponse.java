package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchShowIpcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipcs")

    private List<IpcResponseDTO> ipcs = null;

    public BatchShowIpcsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：总数
     * minimum: 0
     * maximum: 2000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchShowIpcsResponse withIpcs(List<IpcResponseDTO> ipcs) {
        this.ipcs = ipcs;
        return this;
    }

    public BatchShowIpcsResponse addIpcsItem(IpcResponseDTO ipcsItem) {
        if (this.ipcs == null) {
            this.ipcs = new ArrayList<>();
        }
        this.ipcs.add(ipcsItem);
        return this;
    }

    public BatchShowIpcsResponse withIpcs(Consumer<List<IpcResponseDTO>> ipcsSetter) {
        if (this.ipcs == null) {
            this.ipcs = new ArrayList<>();
        }
        ipcsSetter.accept(this.ipcs);
        return this;
    }

    /**
     * **参数说明**：IPC列表
     * @return ipcs
     */
    public List<IpcResponseDTO> getIpcs() {
        return ipcs;
    }

    public void setIpcs(List<IpcResponseDTO> ipcs) {
        this.ipcs = ipcs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowIpcsResponse that = (BatchShowIpcsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.ipcs, that.ipcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, ipcs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowIpcsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    ipcs: ").append(toIndentedString(ipcs)).append("\n");
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

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
public class BatchShowRsusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsus")

    private List<RsuDTO> rsus = null;

    public BatchShowRsusResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：返回RSU的总体数量。
     * minimum: 0
     * maximum: 100000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchShowRsusResponse withRsus(List<RsuDTO> rsus) {
        this.rsus = rsus;
        return this;
    }

    public BatchShowRsusResponse addRsusItem(RsuDTO rsusItem) {
        if (this.rsus == null) {
            this.rsus = new ArrayList<>();
        }
        this.rsus.add(rsusItem);
        return this;
    }

    public BatchShowRsusResponse withRsus(Consumer<List<RsuDTO>> rsusSetter) {
        if (this.rsus == null) {
            this.rsus = new ArrayList<>();
        }
        rsusSetter.accept(this.rsus);
        return this;
    }

    /**
     * **参数说明**：RSU数据列表。
     * @return rsus
     */
    public List<RsuDTO> getRsus() {
        return rsus;
    }

    public void setRsus(List<RsuDTO> rsus) {
        this.rsus = rsus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowRsusResponse that = (BatchShowRsusResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.rsus, that.rsus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, rsus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowRsusResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rsus: ").append(toIndentedString(rsus)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数描述**： 资源池统计信息。
 */
public class PoolStatisticsStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PoolStatisticsStatisticsStatus status;

    public PoolStatisticsStatistics withStatus(PoolStatisticsStatisticsStatus status) {
        this.status = status;
        return this;
    }

    public PoolStatisticsStatistics withStatus(Consumer<PoolStatisticsStatisticsStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PoolStatisticsStatisticsStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PoolStatisticsStatisticsStatus getStatus() {
        return status;
    }

    public void setStatus(PoolStatisticsStatisticsStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatisticsStatistics that = (PoolStatisticsStatistics) obj;
        return Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatisticsStatistics {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

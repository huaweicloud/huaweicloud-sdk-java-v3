package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private List<MonthUsed> count = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gbs")

    private List<MonthUsed> gbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_gbs")

    private List<MonthUsed> gpuGbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private ListFunctionStatisticsResponseBody statistics;

    public ListStatisticsResponse withCount(List<MonthUsed> count) {
        this.count = count;
        return this;
    }

    public ListStatisticsResponse addCountItem(MonthUsed countItem) {
        if (this.count == null) {
            this.count = new ArrayList<>();
        }
        this.count.add(countItem);
        return this;
    }

    public ListStatisticsResponse withCount(Consumer<List<MonthUsed>> countSetter) {
        if (this.count == null) {
            this.count = new ArrayList<>();
        }
        countSetter.accept(this.count);
        return this;
    }

    /**
     * 月度调用次数
     * @return count
     */
    public List<MonthUsed> getCount() {
        return count;
    }

    public void setCount(List<MonthUsed> count) {
        this.count = count;
    }

    public ListStatisticsResponse withGbs(List<MonthUsed> gbs) {
        this.gbs = gbs;
        return this;
    }

    public ListStatisticsResponse addGbsItem(MonthUsed gbsItem) {
        if (this.gbs == null) {
            this.gbs = new ArrayList<>();
        }
        this.gbs.add(gbsItem);
        return this;
    }

    public ListStatisticsResponse withGbs(Consumer<List<MonthUsed>> gbsSetter) {
        if (this.gbs == null) {
            this.gbs = new ArrayList<>();
        }
        gbsSetter.accept(this.gbs);
        return this;
    }

    /**
     * 月度资源用量
     * @return gbs
     */
    public List<MonthUsed> getGbs() {
        return gbs;
    }

    public void setGbs(List<MonthUsed> gbs) {
        this.gbs = gbs;
    }

    public ListStatisticsResponse withGpuGbs(List<MonthUsed> gpuGbs) {
        this.gpuGbs = gpuGbs;
        return this;
    }

    public ListStatisticsResponse addGpuGbsItem(MonthUsed gpuGbsItem) {
        if (this.gpuGbs == null) {
            this.gpuGbs = new ArrayList<>();
        }
        this.gpuGbs.add(gpuGbsItem);
        return this;
    }

    public ListStatisticsResponse withGpuGbs(Consumer<List<MonthUsed>> gpuGbsSetter) {
        if (this.gpuGbs == null) {
            this.gpuGbs = new ArrayList<>();
        }
        gpuGbsSetter.accept(this.gpuGbs);
        return this;
    }

    /**
     * 月度gpu资源用量
     * @return gpuGbs
     */
    public List<MonthUsed> getGpuGbs() {
        return gpuGbs;
    }

    public void setGpuGbs(List<MonthUsed> gpuGbs) {
        this.gpuGbs = gpuGbs;
    }

    public ListStatisticsResponse withStatistics(ListFunctionStatisticsResponseBody statistics) {
        this.statistics = statistics;
        return this;
    }

    public ListStatisticsResponse withStatistics(Consumer<ListFunctionStatisticsResponseBody> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ListFunctionStatisticsResponseBody();
            statisticsSetter.accept(this.statistics);
        }

        return this;
    }

    /**
     * Get statistics
     * @return statistics
     */
    public ListFunctionStatisticsResponseBody getStatistics() {
        return statistics;
    }

    public void setStatistics(ListFunctionStatisticsResponseBody statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStatisticsResponse that = (ListStatisticsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.gbs, that.gbs)
            && Objects.equals(this.gpuGbs, that.gpuGbs) && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, gbs, gpuGbs, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    gbs: ").append(toIndentedString(gbs)).append("\n");
        sb.append("    gpuGbs: ").append(toIndentedString(gpuGbs)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

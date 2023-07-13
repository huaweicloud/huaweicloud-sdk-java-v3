package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListDataJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_jobs")

    private List<DataJobRsp> dataJobs = null;

    public ListDataJobResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDataJobResponse withDataJobs(List<DataJobRsp> dataJobs) {
        this.dataJobs = dataJobs;
        return this;
    }

    public ListDataJobResponse addDataJobsItem(DataJobRsp dataJobsItem) {
        if (this.dataJobs == null) {
            this.dataJobs = new ArrayList<>();
        }
        this.dataJobs.add(dataJobsItem);
        return this;
    }

    public ListDataJobResponse withDataJobs(Consumer<List<DataJobRsp>> dataJobsSetter) {
        if (this.dataJobs == null) {
            this.dataJobs = new ArrayList<>();
        }
        dataJobsSetter.accept(this.dataJobs);
        return this;
    }

    /**
     * 数据作业列表
     * @return dataJobs
     */
    public List<DataJobRsp> getDataJobs() {
        return dataJobs;
    }

    public void setDataJobs(List<DataJobRsp> dataJobs) {
        this.dataJobs = dataJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataJobResponse that = (ListDataJobResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.dataJobs, that.dataJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, dataJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataJobResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dataJobs: ").append(toIndentedString(dataJobs)).append("\n");
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

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
public class ShowProjectTraceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datas")

    private List<DataRsp> datas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_size")

    private Long bucketSize;

    public ShowProjectTraceResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数据对象（目录，文件）总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowProjectTraceResponse withDatas(List<DataRsp> datas) {
        this.datas = datas;
        return this;
    }

    public ShowProjectTraceResponse addDatasItem(DataRsp datasItem) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        this.datas.add(datasItem);
        return this;
    }

    public ShowProjectTraceResponse withDatas(Consumer<List<DataRsp>> datasSetter) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        datasSetter.accept(this.datas);
        return this;
    }

    /**
     * 数据对象列表
     * @return datas
     */
    public List<DataRsp> getDatas() {
        return datas;
    }

    public void setDatas(List<DataRsp> datas) {
        this.datas = datas;
    }

    public ShowProjectTraceResponse withBucketSize(Long bucketSize) {
        this.bucketSize = bucketSize;
        return this;
    }

    /**
     * 桶存量
     * @return bucketSize
     */
    public Long getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(Long bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectTraceResponse showProjectTraceResponse = (ShowProjectTraceResponse) o;
        return Objects.equals(this.count, showProjectTraceResponse.count)
            && Objects.equals(this.datas, showProjectTraceResponse.datas)
            && Objects.equals(this.bucketSize, showProjectTraceResponse.bucketSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, datas, bucketSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectTraceResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
        sb.append("    bucketSize: ").append(toIndentedString(bucketSize)).append("\n");
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

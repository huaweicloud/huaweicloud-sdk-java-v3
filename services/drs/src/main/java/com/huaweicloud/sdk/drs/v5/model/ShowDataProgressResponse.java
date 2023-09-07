package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowDataProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_process_info")

    private List<DataProcessInfo> dataProcessInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowDataProgressResponse withDataProcessInfo(List<DataProcessInfo> dataProcessInfo) {
        this.dataProcessInfo = dataProcessInfo;
        return this;
    }

    public ShowDataProgressResponse addDataProcessInfoItem(DataProcessInfo dataProcessInfoItem) {
        if (this.dataProcessInfo == null) {
            this.dataProcessInfo = new ArrayList<>();
        }
        this.dataProcessInfo.add(dataProcessInfoItem);
        return this;
    }

    public ShowDataProgressResponse withDataProcessInfo(Consumer<List<DataProcessInfo>> dataProcessInfoSetter) {
        if (this.dataProcessInfo == null) {
            this.dataProcessInfo = new ArrayList<>();
        }
        dataProcessInfoSetter.accept(this.dataProcessInfo);
        return this;
    }

    /**
     * 数据加工规则响应体
     * @return dataProcessInfo
     */
    public List<DataProcessInfo> getDataProcessInfo() {
        return dataProcessInfo;
    }

    public void setDataProcessInfo(List<DataProcessInfo> dataProcessInfo) {
        this.dataProcessInfo = dataProcessInfo;
    }

    public ShowDataProgressResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数据加工规则总数目
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataProgressResponse that = (ShowDataProgressResponse) obj;
        return Objects.equals(this.dataProcessInfo, that.dataProcessInfo) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataProcessInfo, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataProgressResponse {\n");
        sb.append("    dataProcessInfo: ").append(toIndentedString(dataProcessInfo)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

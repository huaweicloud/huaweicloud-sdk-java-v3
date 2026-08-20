package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项关联外部链接查询结果
 */
public class ThirdPartyAssociatedResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ThirdPartyAssociatedResultData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    public ThirdPartyAssociatedResult withData(ThirdPartyAssociatedResultData data) {
        this.data = data;
        return this;
    }

    public ThirdPartyAssociatedResult withData(Consumer<ThirdPartyAssociatedResultData> dataSetter) {
        if (this.data == null) {
            this.data = new ThirdPartyAssociatedResultData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ThirdPartyAssociatedResultData getData() {
        return data;
    }

    public void setData(ThirdPartyAssociatedResultData data) {
        this.data = data;
    }

    public ThirdPartyAssociatedResult withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 工作项关联外部链接总数。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
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
        ThirdPartyAssociatedResult that = (ThirdPartyAssociatedResult) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdPartyAssociatedResult {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

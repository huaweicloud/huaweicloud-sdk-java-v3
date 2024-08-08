package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunFastaPreprocessResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    public RunFastaPreprocessResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 已知的蛋白序列数量
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public RunFastaPreprocessResponse withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * 文件中是否还有更多氨基酸序列没有处理
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunFastaPreprocessResponse that = (RunFastaPreprocessResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.hasMore, that.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunFastaPreprocessResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

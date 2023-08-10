package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePerformanceResourceReq
 */
public class CreatePerformanceResourceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public CreatePerformanceResourceReq withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * 存储空间，单位GB
     * minimum: 1
     * maximum: 327680
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public CreatePerformanceResourceReq withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买数量
     * minimum: 1
     * maximum: 10
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
        CreatePerformanceResourceReq that = (CreatePerformanceResourceReq) obj;
        return Objects.equals(this.space, that.space) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(space, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePerformanceResourceReq {\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
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

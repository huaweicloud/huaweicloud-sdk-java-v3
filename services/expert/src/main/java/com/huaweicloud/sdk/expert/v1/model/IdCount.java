package com.huaweicloud.sdk.expert.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IdCount */
public class IdCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paper_id")

    private String paperId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public IdCount withPaperId(String paperId) {
        this.paperId = paperId;
        return this;
    }

    /** 问卷ID
     * 
     * @return paperId */
    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public IdCount withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 回收数量
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdCount idCount = (IdCount) o;
        return Objects.equals(this.paperId, idCount.paperId) && Objects.equals(this.count, idCount.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperId, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdCount {\n");
        sb.append("    paperId: ").append(toIndentedString(paperId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

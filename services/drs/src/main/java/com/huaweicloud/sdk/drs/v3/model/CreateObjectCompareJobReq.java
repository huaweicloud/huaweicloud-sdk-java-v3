package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建对象级对比任务请求。
 */
public class CreateObjectCompareJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_num")

    private Integer compareTaskNum;

    public CreateObjectCompareJobReq withCompareTaskNum(Integer compareTaskNum) {
        this.compareTaskNum = compareTaskNum;
        return this;
    }

    /**
     * 对比任务线程数量，当前仅cloudDataGuard-cassandra和cloudDataGuard-gausscassandra-to-gausscassandra链路支持。
     * @return compareTaskNum
     */
    public Integer getCompareTaskNum() {
        return compareTaskNum;
    }

    public void setCompareTaskNum(Integer compareTaskNum) {
        this.compareTaskNum = compareTaskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateObjectCompareJobReq that = (CreateObjectCompareJobReq) obj;
        return Objects.equals(this.compareTaskNum, that.compareTaskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateObjectCompareJobReq {\n");
        sb.append("    compareTaskNum: ").append(toIndentedString(compareTaskNum)).append("\n");
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

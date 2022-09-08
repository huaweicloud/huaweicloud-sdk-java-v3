package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 灾备初始化进度
 */
public class StructProcessResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<StructProcessVO> result = null;

    public StructProcessResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据生成时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StructProcessResp withResult(List<StructProcessVO> result) {
        this.result = result;
        return this;
    }

    public StructProcessResp addResultItem(StructProcessVO resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public StructProcessResp withResult(Consumer<List<StructProcessVO>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 对比结果
     * @return result
     */
    public List<StructProcessVO> getResult() {
        return result;
    }

    public void setResult(List<StructProcessVO> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructProcessResp structProcessResp = (StructProcessResp) o;
        return Objects.equals(this.createTime, structProcessResp.createTime)
            && Objects.equals(this.result, structProcessResp.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructProcessResp {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

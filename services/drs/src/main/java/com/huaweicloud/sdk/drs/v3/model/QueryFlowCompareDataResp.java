package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 灾备初始化对象详情信息
 */
public class QueryFlowCompareDataResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_record")

    @JacksonXmlProperty(localName = "total_record")

    private Long totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    @JacksonXmlProperty(localName = "list")

    private List<StructDetailVO> list = null;

    public QueryFlowCompareDataResp withTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 任务总数
     * @return totalRecord
     */
    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public QueryFlowCompareDataResp withCreateTime(String createTime) {
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

    public QueryFlowCompareDataResp withList(List<StructDetailVO> list) {
        this.list = list;
        return this;
    }

    public QueryFlowCompareDataResp addListItem(StructDetailVO listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public QueryFlowCompareDataResp withList(Consumer<List<StructDetailVO>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 对比结果
     * @return list
     */
    public List<StructDetailVO> getList() {
        return list;
    }

    public void setList(List<StructDetailVO> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryFlowCompareDataResp queryFlowCompareDataResp = (QueryFlowCompareDataResp) o;
        return Objects.equals(this.totalRecord, queryFlowCompareDataResp.totalRecord)
            && Objects.equals(this.createTime, queryFlowCompareDataResp.createTime)
            && Objects.equals(this.list, queryFlowCompareDataResp.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, createTime, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryFlowCompareDataResp {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

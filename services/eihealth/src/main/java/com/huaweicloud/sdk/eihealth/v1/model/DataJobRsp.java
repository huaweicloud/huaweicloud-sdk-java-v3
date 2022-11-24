package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据作业列表item
 */
public class DataJobRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_count")

    private Integer finishCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public DataJobRsp withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 数据作业创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public DataJobRsp withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数据作业结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DataJobRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataJobRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataJobRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DataJobRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataJobRsp withFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }

    /**
     * 数据作业完成数
     * @return finishCount
     */
    public Integer getFinishCount() {
        return finishCount;
    }

    public void setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
    }

    public DataJobRsp withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据作业总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public DataJobRsp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataJobRsp dataJobRsp = (DataJobRsp) o;
        return Objects.equals(this.creator, dataJobRsp.creator) && Objects.equals(this.endTime, dataJobRsp.endTime)
            && Objects.equals(this.id, dataJobRsp.id) && Objects.equals(this.name, dataJobRsp.name)
            && Objects.equals(this.createTime, dataJobRsp.createTime) && Objects.equals(this.status, dataJobRsp.status)
            && Objects.equals(this.finishCount, dataJobRsp.finishCount)
            && Objects.equals(this.totalCount, dataJobRsp.totalCount) && Objects.equals(this.type, dataJobRsp.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, endTime, id, name, createTime, status, finishCount, totalCount, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataJobRsp {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    finishCount: ").append(toIndentedString(finishCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

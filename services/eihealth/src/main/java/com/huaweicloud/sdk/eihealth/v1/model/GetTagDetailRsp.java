package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像版本详情
 */
public class GetTagDetailRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public GetTagDetailRsp withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 镜像版本名称
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public GetTagDetailRsp withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 镜像版本大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public GetTagDetailRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 镜像版本创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public GetTagDetailRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 镜像版本更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTagDetailRsp getTagDetailRsp = (GetTagDetailRsp) o;
        return Objects.equals(this.tag, getTagDetailRsp.tag) && Objects.equals(this.size, getTagDetailRsp.size)
            && Objects.equals(this.createTime, getTagDetailRsp.createTime)
            && Objects.equals(this.updateTime, getTagDetailRsp.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, size, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTagDetailRsp {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

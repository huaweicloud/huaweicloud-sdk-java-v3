package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Notice
 */
public class Notice {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public Notice withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 公告Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Notice withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 公告内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Notice withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Notice withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
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
        Notice notice = (Notice) o;
        return Objects.equals(this.id, notice.id) && Objects.equals(this.content, notice.content)
            && Objects.equals(this.createTime, notice.createTime) && Objects.equals(this.updateTime, notice.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notice {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

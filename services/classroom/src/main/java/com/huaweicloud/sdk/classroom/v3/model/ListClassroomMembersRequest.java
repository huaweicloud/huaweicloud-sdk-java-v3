package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListClassroomMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classroom_id")

    @JacksonXmlProperty(localName = "classroom_id")

    private String classroomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    public ListClassroomMembersRequest withClassroomId(String classroomId) {
        this.classroomId = classroomId;
        return this;
    }

    /**
     * 课堂ID
     * @return classroomId
     */
    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public ListClassroomMembersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 信息记录的起始编号
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListClassroomMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页包含的信息记录数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListClassroomMembersRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 按照条件搜索学生，搜索字段会同时匹配姓名，学号，用户名，班级
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClassroomMembersRequest listClassroomMembersRequest = (ListClassroomMembersRequest) o;
        return Objects.equals(this.classroomId, listClassroomMembersRequest.classroomId)
            && Objects.equals(this.offset, listClassroomMembersRequest.offset)
            && Objects.equals(this.limit, listClassroomMembersRequest.limit)
            && Objects.equals(this.filter, listClassroomMembersRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomId, offset, limit, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomMembersRequest {\n");
        sb.append("    classroomId: ").append(toIndentedString(classroomId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

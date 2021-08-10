package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IdMarkDTO */
public class IdMarkDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark")

    private String mark;

    public IdMarkDTO withId(String id) {
        this.id = id;
        return this;
    }

    /** 唯一标识。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdMarkDTO withMark(String mark) {
        this.mark = mark;
        return this;
    }

    /** id对应的回显描述，一般为名称等。
     * 
     * @return mark */
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdMarkDTO idMarkDTO = (IdMarkDTO) o;
        return Objects.equals(this.id, idMarkDTO.id) && Objects.equals(this.mark, idMarkDTO.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdMarkDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
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

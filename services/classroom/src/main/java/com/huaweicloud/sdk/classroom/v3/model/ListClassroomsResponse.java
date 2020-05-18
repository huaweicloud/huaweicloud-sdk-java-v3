package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.classroom.v3.model.ClassroomCard;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListClassroomsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="classrooms")
    
    private List<ClassroomCard> classrooms = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListClassroomsResponse withClassrooms(List<ClassroomCard> classrooms) {
        this.classrooms = classrooms;
        return this;
    }

    
    public ListClassroomsResponse addClassroomsItem(ClassroomCard classroomsItem) {
        if (this.classrooms == null) {
            this.classrooms = new ArrayList<>();
        }
        this.classrooms.add(classroomsItem);
        return this;
    }

    public ListClassroomsResponse withClassrooms(Consumer<List<ClassroomCard>> classroomsSetter) {
        if(this.classrooms == null ){
            this.classrooms = new ArrayList<>();
        }
        classroomsSetter.accept(this.classrooms);
        return this;
    }

    /**
     * 课堂列表
     * @return classrooms
     */
    public List<ClassroomCard> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<ClassroomCard> classrooms) {
        this.classrooms = classrooms;
    }

    public ListClassroomsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 课堂总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClassroomsResponse listClassroomsResponse = (ListClassroomsResponse) o;
        return Objects.equals(this.classrooms, listClassroomsResponse.classrooms) &&
            Objects.equals(this.total, listClassroomsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(classrooms, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomsResponse {\n");
            sb.append("    classrooms: ").append(toIndentedString(classrooms)).append("\n");
            sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


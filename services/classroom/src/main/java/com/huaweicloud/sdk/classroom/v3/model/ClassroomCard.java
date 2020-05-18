package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ClassroomCard
 */
public class ClassroomCard  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="classroom_id")
    
    private String classroomId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit")
    
    private String credit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ClassroomCard withClassroomId(String classroomId) {
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

    public ClassroomCard withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 课堂名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassroomCard withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 课堂描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClassroomCard withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    


    /**
     * 课堂学分
     * @return credit
     */
    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ClassroomCard withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 课堂当前的状态，normal：课堂处于正常状态，archive：课堂已归档
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassroomCard classroomCard = (ClassroomCard) o;
        return Objects.equals(this.classroomId, classroomCard.classroomId) &&
            Objects.equals(this.name, classroomCard.name) &&
            Objects.equals(this.description, classroomCard.description) &&
            Objects.equals(this.credit, classroomCard.credit) &&
            Objects.equals(this.status, classroomCard.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(classroomId, name, description, credit, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassroomCard {\n");
            sb.append("    classroomId: ").append(toIndentedString(classroomId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


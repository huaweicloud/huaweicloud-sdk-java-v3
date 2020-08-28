package com.huaweicloud.sdk.projectman.v4.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListProjectVersionsV4ResponseBodyIterations
 */
public class ListProjectVersionsV4ResponseBodyIterations  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;

    public ListProjectVersionsV4ResponseBodyIterations withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 迭代描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListProjectVersionsV4ResponseBodyIterations withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 迭代结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListProjectVersionsV4ResponseBodyIterations withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 迭代id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListProjectVersionsV4ResponseBodyIterations withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 迭代标题
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListProjectVersionsV4ResponseBodyIterations withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 迭代开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectVersionsV4ResponseBodyIterations listProjectVersionsV4ResponseBodyIterations = (ListProjectVersionsV4ResponseBodyIterations) o;
        return Objects.equals(this.description, listProjectVersionsV4ResponseBodyIterations.description) &&
            Objects.equals(this.endTime, listProjectVersionsV4ResponseBodyIterations.endTime) &&
            Objects.equals(this.id, listProjectVersionsV4ResponseBodyIterations.id) &&
            Objects.equals(this.name, listProjectVersionsV4ResponseBodyIterations.name) &&
            Objects.equals(this.beginTime, listProjectVersionsV4ResponseBodyIterations.beginTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, endTime, id, name, beginTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectVersionsV4ResponseBodyIterations {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
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


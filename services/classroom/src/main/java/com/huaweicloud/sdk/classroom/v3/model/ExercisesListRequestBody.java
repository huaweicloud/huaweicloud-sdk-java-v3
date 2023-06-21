package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取习题库里习题调用参数
 */
public class ExercisesListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ExerciseFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_index")

    private Integer startIndex;

    public ExercisesListRequestBody withFilter(ExerciseFilter filter) {
        this.filter = filter;
        return this;
    }

    public ExercisesListRequestBody withFilter(Consumer<ExerciseFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new ExerciseFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public ExerciseFilter getFilter() {
        return filter;
    }

    public void setFilter(ExerciseFilter filter) {
        this.filter = filter;
    }

    public ExercisesListRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量
     * minimum: 1
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ExercisesListRequestBody withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * 起始页
     * minimum: 1
     * maximum: 100
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExercisesListRequestBody exercisesListRequestBody = (ExercisesListRequestBody) o;
        return Objects.equals(this.filter, exercisesListRequestBody.filter)
            && Objects.equals(this.pageSize, exercisesListRequestBody.pageSize)
            && Objects.equals(this.startIndex, exercisesListRequestBody.startIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, pageSize, startIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExercisesListRequestBody {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

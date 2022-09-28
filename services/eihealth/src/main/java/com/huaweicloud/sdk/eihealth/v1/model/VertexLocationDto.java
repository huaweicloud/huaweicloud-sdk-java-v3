package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VertexLocationDto
 */
public class VertexLocationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Double x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Double y;

    public VertexLocationDto withX(Double x) {
        this.x = x;
        return this;
    }

    /**
     * 子任务的画布横坐标
     * @return x
     */
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public VertexLocationDto withY(Double y) {
        this.y = y;
        return this;
    }

    /**
     * 子任务的画布纵坐标
     * @return y
     */
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VertexLocationDto vertexLocationDto = (VertexLocationDto) o;
        return Objects.equals(this.x, vertexLocationDto.x) && Objects.equals(this.y, vertexLocationDto.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VertexLocationDto {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

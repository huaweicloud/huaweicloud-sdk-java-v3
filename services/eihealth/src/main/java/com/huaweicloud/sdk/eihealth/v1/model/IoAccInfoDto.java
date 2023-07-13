package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IoAccInfoDto
 */
public class IoAccInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_space")

    private Double freeSpace;

    public IoAccInfoDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * io加速实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IoAccInfoDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * io加速实例类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IoAccInfoDto withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * io加速实例总容量
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public IoAccInfoDto withFreeSpace(Double freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    /**
     * io加速实例空闲容量
     * @return freeSpace
     */
    public Double getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(Double freeSpace) {
        this.freeSpace = freeSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IoAccInfoDto that = (IoAccInfoDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.space, that.space) && Objects.equals(this.freeSpace, that.freeSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, space, freeSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IoAccInfoDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    freeSpace: ").append(toIndentedString(freeSpace)).append("\n");
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

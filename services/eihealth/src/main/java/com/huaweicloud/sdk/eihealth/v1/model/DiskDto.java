package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiskDto
 */
public class DiskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private String space;

    public DiskDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 磁盘类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DiskDto withSpace(String space) {
        this.space = space;
        return this;
    }

    /**
     * 磁盘大小
     * @return space
     */
    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskDto that = (DiskDto) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.space, that.space);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, space);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
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

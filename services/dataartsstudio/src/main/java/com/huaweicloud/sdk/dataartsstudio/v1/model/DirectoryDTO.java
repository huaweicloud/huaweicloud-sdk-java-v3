package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DirectoryDTO
 */
public class DirectoryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private String directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_name")

    private String directoryName;

    public DirectoryDTO withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 目录ID。
     * @return directoryId
     */
    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public DirectoryDTO withDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    /**
     * 目录名称。
     * @return directoryName
     */
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectoryDTO that = (DirectoryDTO) obj;
        return Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.directoryName, that.directoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryId, directoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectoryDTO {\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    directoryName: ").append(toIndentedString(directoryName)).append("\n");
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

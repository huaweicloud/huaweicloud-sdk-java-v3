package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StorageInfoDOV5
 */
public class StorageInfoDOV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_space_length")

    private Long usedSpaceLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_space")

    private String usedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files_count")

    private Long filesCount;

    public StorageInfoDOV5 withUsedSpaceLength(Long usedSpaceLength) {
        this.usedSpaceLength = usedSpaceLength;
        return this;
    }

    /**
     * **参数解释**: 使用空间（字节）。 **取值范围**: 不涉及。 
     * @return usedSpaceLength
     */
    public Long getUsedSpaceLength() {
        return usedSpaceLength;
    }

    public void setUsedSpaceLength(Long usedSpaceLength) {
        this.usedSpaceLength = usedSpaceLength;
    }

    public StorageInfoDOV5 withUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    /**
     * **参数解释**: 使用空间（带单位）。 **取值范围**: 不涉及。 
     * @return usedSpace
     */
    public String getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
    }

    public StorageInfoDOV5 withFilesCount(Long filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
     * **参数解释**: 文件数量。 **取值范围**: 不涉及。 
     * @return filesCount
     */
    public Long getFilesCount() {
        return filesCount;
    }

    public void setFilesCount(Long filesCount) {
        this.filesCount = filesCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageInfoDOV5 that = (StorageInfoDOV5) obj;
        return Objects.equals(this.usedSpaceLength, that.usedSpaceLength)
            && Objects.equals(this.usedSpace, that.usedSpace) && Objects.equals(this.filesCount, that.filesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedSpaceLength, usedSpace, filesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageInfoDOV5 {\n");
        sb.append("    usedSpaceLength: ").append(toIndentedString(usedSpaceLength)).append("\n");
        sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
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

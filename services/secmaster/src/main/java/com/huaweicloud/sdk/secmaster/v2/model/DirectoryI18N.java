package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DirectoryI18N
 */
public class DirectoryI18N {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_en")

    private String directoryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_fr")

    private String directoryFr;

    public DirectoryI18N withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * directory 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public DirectoryI18N withDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
        return this;
    }

    /**
     * directory 目录分组
     * @return directoryEn
     */
    public String getDirectoryEn() {
        return directoryEn;
    }

    public void setDirectoryEn(String directoryEn) {
        this.directoryEn = directoryEn;
    }

    public DirectoryI18N withDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
        return this;
    }

    /**
     * directory 目录分组
     * @return directoryFr
     */
    public String getDirectoryFr() {
        return directoryFr;
    }

    public void setDirectoryFr(String directoryFr) {
        this.directoryFr = directoryFr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectoryI18N that = (DirectoryI18N) obj;
        return Objects.equals(this.directory, that.directory) && Objects.equals(this.directoryEn, that.directoryEn)
            && Objects.equals(this.directoryFr, that.directoryFr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directory, directoryEn, directoryFr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectoryI18N {\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    directoryEn: ").append(toIndentedString(directoryEn)).append("\n");
        sb.append("    directoryFr: ").append(toIndentedString(directoryFr)).append("\n");
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

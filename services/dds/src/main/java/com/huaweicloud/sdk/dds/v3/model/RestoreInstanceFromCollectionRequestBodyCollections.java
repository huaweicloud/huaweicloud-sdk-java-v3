package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * RestoreInstanceFromCollectionRequestBodyCollections
 */
public class RestoreInstanceFromCollectionRequestBodyCollections {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_name")

    @JacksonXmlProperty(localName = "old_name")

    private String oldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_name")

    @JacksonXmlProperty(localName = "new_name")

    private String newName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_collection_time")

    @JacksonXmlProperty(localName = "restore_collection_time")

    private String restoreCollectionTime;

    public RestoreInstanceFromCollectionRequestBodyCollections withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     * 恢复前表名。
     * @return oldName
     */
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public RestoreInstanceFromCollectionRequestBodyCollections withNewName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * 恢复后表名。
     * @return newName
     */
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public RestoreInstanceFromCollectionRequestBodyCollections withRestoreCollectionTime(String restoreCollectionTime) {
        this.restoreCollectionTime = restoreCollectionTime;
        return this;
    }

    /**
     * 数据库集合恢复时间点。UNIX时间戳格式，单位是毫秒，时区是UTC。
     * @return restoreCollectionTime
     */
    public String getRestoreCollectionTime() {
        return restoreCollectionTime;
    }

    public void setRestoreCollectionTime(String restoreCollectionTime) {
        this.restoreCollectionTime = restoreCollectionTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreInstanceFromCollectionRequestBodyCollections restoreInstanceFromCollectionRequestBodyCollections =
            (RestoreInstanceFromCollectionRequestBodyCollections) o;
        return Objects.equals(this.oldName, restoreInstanceFromCollectionRequestBodyCollections.oldName)
            && Objects.equals(this.newName, restoreInstanceFromCollectionRequestBodyCollections.newName)
            && Objects.equals(this.restoreCollectionTime,
                restoreInstanceFromCollectionRequestBodyCollections.restoreCollectionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldName, newName, restoreCollectionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceFromCollectionRequestBodyCollections {\n");
        sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
        sb.append("    restoreCollectionTime: ").append(toIndentedString(restoreCollectionTime)).append("\n");
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

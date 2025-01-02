package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestoreInfo
 */
public class RestoreInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_name")

    private String oldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_name")

    private String newName;

    public RestoreInfo withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     * 需恢复的原库名称
     * @return oldName
     */
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public RestoreInfo withNewName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * 恢复后的新库名称
     * @return newName
     */
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreInfo that = (RestoreInfo) obj;
        return Objects.equals(this.oldName, that.oldName) && Objects.equals(this.newName, that.newName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldName, newName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInfo {\n");
        sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

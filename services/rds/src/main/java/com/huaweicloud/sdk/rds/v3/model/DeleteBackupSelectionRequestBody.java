package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 是否删除或保留自动备份请求体。
 */
public class DeleteBackupSelectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selection")

    private Boolean selection;

    public DeleteBackupSelectionRequestBody withSelection(Boolean selection) {
        this.selection = selection;
        return this;
    }

    /**
     * 选择是否保留自动备份标志
     * @return selection
     */
    public Boolean getSelection() {
        return selection;
    }

    public void setSelection(Boolean selection) {
        this.selection = selection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBackupSelectionRequestBody that = (DeleteBackupSelectionRequestBody) obj;
        return Objects.equals(this.selection, that.selection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBackupSelectionRequestBody {\n");
        sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
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

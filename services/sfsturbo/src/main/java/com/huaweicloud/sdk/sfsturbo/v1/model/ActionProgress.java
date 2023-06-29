package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActionProgress
 */
public class ActionProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATING")

    private String creating;

    public ActionProgress withCreating(String creating) {
        this.creating = creating;
        return this;
    }

    /**
     * 创建文件系统的进度。
     * @return creating
     */
    public String getCreating() {
        return creating;
    }

    public void setCreating(String creating) {
        this.creating = creating;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionProgress that = (ActionProgress) obj;
        return Objects.equals(this.creating, that.creating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creating);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionProgress {\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
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

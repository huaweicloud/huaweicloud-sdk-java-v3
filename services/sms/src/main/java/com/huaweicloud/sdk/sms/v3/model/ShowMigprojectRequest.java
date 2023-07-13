package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMigprojectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mig_project_id")

    private String migProjectId;

    public ShowMigprojectRequest withMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
        return this;
    }

    /**
     * 迁移项目ID
     * @return migProjectId
     */
    public String getMigProjectId() {
        return migProjectId;
    }

    public void setMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigprojectRequest that = (ShowMigprojectRequest) obj;
        return Objects.equals(this.migProjectId, that.migProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigprojectRequest {\n");
        sb.append("    migProjectId: ").append(toIndentedString(migProjectId)).append("\n");
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

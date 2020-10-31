package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteMigprojectRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mig_project_id")
    
    private String migProjectId;

    public DeleteMigprojectRequest withMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
        return this;
    }

    


    /**
     * Get migProjectId
     * @return migProjectId
     */
    public String getMigProjectId() {
        return migProjectId;
    }

    public void setMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMigprojectRequest deleteMigprojectRequest = (DeleteMigprojectRequest) o;
        return Objects.equals(this.migProjectId, deleteMigprojectRequest.migProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(migProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMigprojectRequest {\n");
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


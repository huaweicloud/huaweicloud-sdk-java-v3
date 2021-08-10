package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateMigprojectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mig_project_id")

    private String migProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private MigProject body;

    public UpdateMigprojectRequest withMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
        return this;
    }

    /** 迁移项目id
     * 
     * @return migProjectId */
    public String getMigProjectId() {
        return migProjectId;
    }

    public void setMigProjectId(String migProjectId) {
        this.migProjectId = migProjectId;
    }

    public UpdateMigprojectRequest withBody(MigProject body) {
        this.body = body;
        return this;
    }

    public UpdateMigprojectRequest withBody(Consumer<MigProject> bodySetter) {
        if (this.body == null) {
            this.body = new MigProject();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public MigProject getBody() {
        return body;
    }

    public void setBody(MigProject body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMigprojectRequest updateMigprojectRequest = (UpdateMigprojectRequest) o;
        return Objects.equals(this.migProjectId, updateMigprojectRequest.migProjectId)
            && Objects.equals(this.body, updateMigprojectRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMigprojectRequest {\n");
        sb.append("    migProjectId: ").append(toIndentedString(migProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

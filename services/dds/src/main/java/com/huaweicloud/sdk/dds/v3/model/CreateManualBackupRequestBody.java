package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateManualBackupRequestBody */
public class CreateManualBackupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup")

    private CreateManualBackupOption backup;

    public CreateManualBackupRequestBody withBackup(CreateManualBackupOption backup) {
        this.backup = backup;
        return this;
    }

    public CreateManualBackupRequestBody withBackup(Consumer<CreateManualBackupOption> backupSetter) {
        if (this.backup == null) {
            this.backup = new CreateManualBackupOption();
            backupSetter.accept(this.backup);
        }

        return this;
    }

    /** Get backup
     * 
     * @return backup */
    public CreateManualBackupOption getBackup() {
        return backup;
    }

    public void setBackup(CreateManualBackupOption backup) {
        this.backup = backup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateManualBackupRequestBody createManualBackupRequestBody = (CreateManualBackupRequestBody) o;
        return Objects.equals(this.backup, createManualBackupRequestBody.backup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualBackupRequestBody {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
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

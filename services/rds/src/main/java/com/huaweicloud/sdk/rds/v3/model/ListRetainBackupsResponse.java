package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRetainBackupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private RetainBackup backups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListRetainBackupsResponse withBackups(RetainBackup backups) {
        this.backups = backups;
        return this;
    }

    public ListRetainBackupsResponse withBackups(Consumer<RetainBackup> backupsSetter) {
        if (this.backups == null) {
            this.backups = new RetainBackup();
            backupsSetter.accept(this.backups);
        }

        return this;
    }

    /**
     * Get backups
     * @return backups
     */
    public RetainBackup getBackups() {
        return backups;
    }

    public void setBackups(RetainBackup backups) {
        this.backups = backups;
    }

    public ListRetainBackupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  保留备份总数  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRetainBackupsResponse that = (ListRetainBackupsResponse) obj;
        return Objects.equals(this.backups, that.backups) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRetainBackupsResponse {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

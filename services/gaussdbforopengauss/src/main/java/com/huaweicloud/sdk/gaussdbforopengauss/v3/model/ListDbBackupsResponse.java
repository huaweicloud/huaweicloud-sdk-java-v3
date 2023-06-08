package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BackupsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDbBackupsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backups")
    
    private List<BackupsResult> backups = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Long totalCount;

    public ListDbBackupsResponse withBackups(List<BackupsResult> backups) {
        this.backups = backups;
        return this;
    }

    
    public ListDbBackupsResponse addBackupsItem(BackupsResult backupsItem) {
        if(this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ListDbBackupsResponse withBackups(Consumer<List<BackupsResult>> backupsSetter) {
        if(this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 备份信息。
     * @return backups
     */
    public List<BackupsResult> getBackups() {
        return backups;
    }

    public void setBackups(List<BackupsResult> backups) {
        this.backups = backups;
    }

    

    public ListDbBackupsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 备份文件的总数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDbBackupsResponse listDbBackupsResponse = (ListDbBackupsResponse) o;
        return Objects.equals(this.backups, listDbBackupsResponse.backups) &&
            Objects.equals(this.totalCount, listDbBackupsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backups, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbBackupsResponse {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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


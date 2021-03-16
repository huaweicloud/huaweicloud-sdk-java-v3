package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BackupResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBackupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backups")
    
    private List<BackupResp> backups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListBackupsResponse withBackups(List<BackupResp> backups) {
        this.backups = backups;
        return this;
    }

    
    public ListBackupsResponse addBackupsItem(BackupResp backupsItem) {
        this.backups.add(backupsItem);
        return this;
    }

    public ListBackupsResponse withBackups(Consumer<List<BackupResp>> backupsSetter) {
        if(this.backups == null ){
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 备份列表
     * @return backups
     */
    public List<BackupResp> getBackups() {
        return backups;
    }

    public void setBackups(List<BackupResp> backups) {
        this.backups = backups;
    }

    

    public ListBackupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 备份个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsResponse listBackupsResponse = (ListBackupsResponse) o;
        return Objects.equals(this.backups, listBackupsResponse.backups) &&
            Objects.equals(this.count, listBackupsResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backups, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsResponse {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


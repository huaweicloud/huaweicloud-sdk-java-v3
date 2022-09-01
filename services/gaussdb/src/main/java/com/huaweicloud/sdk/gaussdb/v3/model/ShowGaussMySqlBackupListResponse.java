package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.Backups;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlBackupListResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backups")
    
    @JacksonXmlProperty(localName = "backups")
    
    private List<Backups> backups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    @JacksonXmlProperty(localName = "total_count")
    
    private Long totalCount;

    public ShowGaussMySqlBackupListResponse withBackups(List<Backups> backups) {
        this.backups = backups;
        return this;
    }

    
    public ShowGaussMySqlBackupListResponse addBackupsItem(Backups backupsItem) {
        if(this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ShowGaussMySqlBackupListResponse withBackups(Consumer<List<Backups>> backupsSetter) {
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
    public List<Backups> getBackups() {
        return backups;
    }

    public void setBackups(List<Backups> backups) {
        this.backups = backups;
    }

    

    public ShowGaussMySqlBackupListResponse withTotalCount(Long totalCount) {
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
        ShowGaussMySqlBackupListResponse showGaussMySqlBackupListResponse = (ShowGaussMySqlBackupListResponse) o;
        return Objects.equals(this.backups, showGaussMySqlBackupListResponse.backups) &&
            Objects.equals(this.totalCount, showGaussMySqlBackupListResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backups, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlBackupListResponse {\n");
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


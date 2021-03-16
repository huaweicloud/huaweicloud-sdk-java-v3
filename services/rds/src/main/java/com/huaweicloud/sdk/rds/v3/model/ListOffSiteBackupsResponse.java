package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.OffSiteBackupForList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListOffSiteBackupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offsite_backups")
    
    private List<OffSiteBackupForList> offsiteBackups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListOffSiteBackupsResponse withOffsiteBackups(List<OffSiteBackupForList> offsiteBackups) {
        this.offsiteBackups = offsiteBackups;
        return this;
    }

    
    public ListOffSiteBackupsResponse addOffsiteBackupsItem(OffSiteBackupForList offsiteBackupsItem) {
        this.offsiteBackups.add(offsiteBackupsItem);
        return this;
    }

    public ListOffSiteBackupsResponse withOffsiteBackups(Consumer<List<OffSiteBackupForList>> offsiteBackupsSetter) {
        if(this.offsiteBackups == null ){
            this.offsiteBackups = new ArrayList<>();
        }
        offsiteBackupsSetter.accept(this.offsiteBackups);
        return this;
    }

    /**
     * 跨区域备份信息。
     * @return offsiteBackups
     */
    public List<OffSiteBackupForList> getOffsiteBackups() {
        return offsiteBackups;
    }

    public void setOffsiteBackups(List<OffSiteBackupForList> offsiteBackups) {
        this.offsiteBackups = offsiteBackups;
    }

    

    public ListOffSiteBackupsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
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
        ListOffSiteBackupsResponse listOffSiteBackupsResponse = (ListOffSiteBackupsResponse) o;
        return Objects.equals(this.offsiteBackups, listOffSiteBackupsResponse.offsiteBackups) &&
            Objects.equals(this.totalCount, listOffSiteBackupsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offsiteBackups, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOffSiteBackupsResponse {\n");
        sb.append("    offsiteBackups: ").append(toIndentedString(offsiteBackups)).append("\n");
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


package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.OffsiteBackupInstance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListOffSiteInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offsite_backup_instances")
    
    private List<OffsiteBackupInstance> offsiteBackupInstances = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListOffSiteInstancesResponse withOffsiteBackupInstances(List<OffsiteBackupInstance> offsiteBackupInstances) {
        this.offsiteBackupInstances = offsiteBackupInstances;
        return this;
    }

    
    public ListOffSiteInstancesResponse addOffsiteBackupInstancesItem(OffsiteBackupInstance offsiteBackupInstancesItem) {
        if(this.offsiteBackupInstances == null) {
            this.offsiteBackupInstances = new ArrayList<>();
        }
        this.offsiteBackupInstances.add(offsiteBackupInstancesItem);
        return this;
    }

    public ListOffSiteInstancesResponse withOffsiteBackupInstances(Consumer<List<OffsiteBackupInstance>> offsiteBackupInstancesSetter) {
        if(this.offsiteBackupInstances == null) {
            this.offsiteBackupInstances = new ArrayList<>();
        }
        offsiteBackupInstancesSetter.accept(this.offsiteBackupInstances);
        return this;
    }

    /**
     * 跨区域备份实例信息。
     * @return offsiteBackupInstances
     */
    public List<OffsiteBackupInstance> getOffsiteBackupInstances() {
        return offsiteBackupInstances;
    }

    public void setOffsiteBackupInstances(List<OffsiteBackupInstance> offsiteBackupInstances) {
        this.offsiteBackupInstances = offsiteBackupInstances;
    }

    

    public ListOffSiteInstancesResponse withTotalCount(Integer totalCount) {
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
        ListOffSiteInstancesResponse listOffSiteInstancesResponse = (ListOffSiteInstancesResponse) o;
        return Objects.equals(this.offsiteBackupInstances, listOffSiteInstancesResponse.offsiteBackupInstances) &&
            Objects.equals(this.totalCount, listOffSiteInstancesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offsiteBackupInstances, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOffSiteInstancesResponse {\n");
        sb.append("    offsiteBackupInstances: ").append(toIndentedString(offsiteBackupInstances)).append("\n");
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


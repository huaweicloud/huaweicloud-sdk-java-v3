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
    @JsonProperty(value="offsite_backup_instance")
    
    private List<OffsiteBackupInstance> offsiteBackupInstance = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListOffSiteInstancesResponse withOffsiteBackupInstance(List<OffsiteBackupInstance> offsiteBackupInstance) {
        this.offsiteBackupInstance = offsiteBackupInstance;
        return this;
    }

    
    public ListOffSiteInstancesResponse addOffsiteBackupInstanceItem(OffsiteBackupInstance offsiteBackupInstanceItem) {
        if(this.offsiteBackupInstance == null) {
            this.offsiteBackupInstance = new ArrayList<>();
        }
        this.offsiteBackupInstance.add(offsiteBackupInstanceItem);
        return this;
    }

    public ListOffSiteInstancesResponse withOffsiteBackupInstance(Consumer<List<OffsiteBackupInstance>> offsiteBackupInstanceSetter) {
        if(this.offsiteBackupInstance == null) {
            this.offsiteBackupInstance = new ArrayList<>();
        }
        offsiteBackupInstanceSetter.accept(this.offsiteBackupInstance);
        return this;
    }

    /**
     * 跨区域备份实例信息。
     * @return offsiteBackupInstance
     */
    public List<OffsiteBackupInstance> getOffsiteBackupInstance() {
        return offsiteBackupInstance;
    }

    public void setOffsiteBackupInstance(List<OffsiteBackupInstance> offsiteBackupInstance) {
        this.offsiteBackupInstance = offsiteBackupInstance;
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
        return Objects.equals(this.offsiteBackupInstance, listOffSiteInstancesResponse.offsiteBackupInstance) &&
            Objects.equals(this.totalCount, listOffSiteInstancesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offsiteBackupInstance, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOffSiteInstancesResponse {\n");
        sb.append("    offsiteBackupInstance: ").append(toIndentedString(offsiteBackupInstance)).append("\n");
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


package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.MetadataLock;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMetadataLocksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata_locks")
    
    private List<MetadataLock> metadataLocks = null;
    
    public ListMetadataLocksResponse withMetadataLocks(List<MetadataLock> metadataLocks) {
        this.metadataLocks = metadataLocks;
        return this;
    }

    
    public ListMetadataLocksResponse addMetadataLocksItem(MetadataLock metadataLocksItem) {
        if(this.metadataLocks == null) {
            this.metadataLocks = new ArrayList<>();
        }
        this.metadataLocks.add(metadataLocksItem);
        return this;
    }

    public ListMetadataLocksResponse withMetadataLocks(Consumer<List<MetadataLock>> metadataLocksSetter) {
        if(this.metadataLocks == null) {
            this.metadataLocks = new ArrayList<>();
        }
        metadataLocksSetter.accept(this.metadataLocks);
        return this;
    }

    /**
     * 元数据锁列表
     * @return metadataLocks
     */
    public List<MetadataLock> getMetadataLocks() {
        return metadataLocks;
    }

    public void setMetadataLocks(List<MetadataLock> metadataLocks) {
        this.metadataLocks = metadataLocks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetadataLocksResponse listMetadataLocksResponse = (ListMetadataLocksResponse) o;
        return Objects.equals(this.metadataLocks, listMetadataLocksResponse.metadataLocks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metadataLocks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetadataLocksResponse {\n");
        sb.append("    metadataLocks: ").append(toIndentedString(metadataLocks)).append("\n");
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


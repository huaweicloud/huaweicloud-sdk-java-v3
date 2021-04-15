package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProtectableReplicationCapabilitiesRespRegion
 */
public class ProtectableReplicationCapabilitiesRespRegion  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_destinations")
    
    private List<String> replicationDestinations = null;
    
    public ProtectableReplicationCapabilitiesRespRegion withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云服务所在的区域
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ProtectableReplicationCapabilitiesRespRegion withReplicationDestinations(List<String> replicationDestinations) {
        this.replicationDestinations = replicationDestinations;
        return this;
    }

    
    public ProtectableReplicationCapabilitiesRespRegion addReplicationDestinationsItem(String replicationDestinationsItem) {
        if(this.replicationDestinations == null) {
            this.replicationDestinations = new ArrayList<>();
        }
        this.replicationDestinations.add(replicationDestinationsItem);
        return this;
    }

    public ProtectableReplicationCapabilitiesRespRegion withReplicationDestinations(Consumer<List<String>> replicationDestinationsSetter) {
        if(this.replicationDestinations == null) {
            this.replicationDestinations = new ArrayList<>();
        }
        replicationDestinationsSetter.accept(this.replicationDestinations);
        return this;
    }

    /**
     * 支持复制的目标区域列表
     * @return replicationDestinations
     */
    public List<String> getReplicationDestinations() {
        return replicationDestinations;
    }

    public void setReplicationDestinations(List<String> replicationDestinations) {
        this.replicationDestinations = replicationDestinations;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectableReplicationCapabilitiesRespRegion protectableReplicationCapabilitiesRespRegion = (ProtectableReplicationCapabilitiesRespRegion) o;
        return Objects.equals(this.name, protectableReplicationCapabilitiesRespRegion.name) &&
            Objects.equals(this.replicationDestinations, protectableReplicationCapabilitiesRespRegion.replicationDestinations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, replicationDestinations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableReplicationCapabilitiesRespRegion {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replicationDestinations: ").append(toIndentedString(replicationDestinations)).append("\n");
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


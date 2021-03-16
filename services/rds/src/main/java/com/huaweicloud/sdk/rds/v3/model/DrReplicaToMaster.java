package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DrReplicaToMaster
 */
public class DrReplicaToMaster  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="drreplica_to_master")
    
    private Object drreplicaToMaster;

    public DrReplicaToMaster withDrreplicaToMaster(Object drreplicaToMaster) {
        this.drreplicaToMaster = drreplicaToMaster;
        return this;
    }

    


    /**
     * Get drreplicaToMaster
     * @return drreplicaToMaster
     */
    public Object getDrreplicaToMaster() {
        return drreplicaToMaster;
    }

    public void setDrreplicaToMaster(Object drreplicaToMaster) {
        this.drreplicaToMaster = drreplicaToMaster;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DrReplicaToMaster drReplicaToMaster = (DrReplicaToMaster) o;
        return Objects.equals(this.drreplicaToMaster, drReplicaToMaster.drreplicaToMaster);
    }
    @Override
    public int hashCode() {
        return Objects.hash(drreplicaToMaster);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DrReplicaToMaster {\n");
        sb.append("    drreplicaToMaster: ").append(toIndentedString(drreplicaToMaster)).append("\n");
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


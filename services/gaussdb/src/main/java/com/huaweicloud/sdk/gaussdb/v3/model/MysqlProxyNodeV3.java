package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyAvailable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyNodeV3
 */
public class MysqlProxyNodeV3  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    
    private Integer weight;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    
    private List<MysqlProxyAvailable> availabilityZone = null;
    
    public MysqlProxyNodeV3 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 节点id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public MysqlProxyNodeV3 withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public MysqlProxyNodeV3 withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MysqlProxyNodeV3 withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public MysqlProxyNodeV3 withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    


    /**
     * 节点读写分离读权重。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    public MysqlProxyNodeV3 withAvailabilityZone(List<MysqlProxyAvailable> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    
    public MysqlProxyNodeV3 addAvailabilityZoneItem(MysqlProxyAvailable availabilityZoneItem) {
        if(this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public MysqlProxyNodeV3 withAvailabilityZone(Consumer<List<MysqlProxyAvailable>> availabilityZoneSetter) {
        if(this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * 可用区信息。
     * @return availabilityZone
     */
    public List<MysqlProxyAvailable> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<MysqlProxyAvailable> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxyNodeV3 mysqlProxyNodeV3 = (MysqlProxyNodeV3) o;
        return Objects.equals(this.id, mysqlProxyNodeV3.id) &&
            Objects.equals(this.instanceId, mysqlProxyNodeV3.instanceId) &&
            Objects.equals(this.status, mysqlProxyNodeV3.status) &&
            Objects.equals(this.name, mysqlProxyNodeV3.name) &&
            Objects.equals(this.weight, mysqlProxyNodeV3.weight) &&
            Objects.equals(this.availabilityZone, mysqlProxyNodeV3.availabilityZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, status, name, weight, availabilityZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyNodeV3 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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


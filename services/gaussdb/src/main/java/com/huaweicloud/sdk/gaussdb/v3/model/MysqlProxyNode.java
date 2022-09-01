package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyAvailable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyNode
 */
public class MysqlProxyNode  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    @JacksonXmlProperty(localName = "id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    @JacksonXmlProperty(localName = "instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    @JacksonXmlProperty(localName = "weight")
    
    private Integer weight;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    @JacksonXmlProperty(localName = "available_zones")
    
    private List<MysqlProxyAvailable> availableZones = null;
    
    public MysqlProxyNode withId(String id) {
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

    

    public MysqlProxyNode withInstanceId(String instanceId) {
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

    

    public MysqlProxyNode withStatus(String status) {
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

    

    public MysqlProxyNode withName(String name) {
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

    

    public MysqlProxyNode withWeight(Integer weight) {
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

    

    public MysqlProxyNode withAvailableZones(List<MysqlProxyAvailable> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public MysqlProxyNode addAvailableZonesItem(MysqlProxyAvailable availableZonesItem) {
        if(this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public MysqlProxyNode withAvailableZones(Consumer<List<MysqlProxyAvailable>> availableZonesSetter) {
        if(this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区信息。
     * @return availableZones
     */
    public List<MysqlProxyAvailable> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<MysqlProxyAvailable> availableZones) {
        this.availableZones = availableZones;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxyNode mysqlProxyNode = (MysqlProxyNode) o;
        return Objects.equals(this.id, mysqlProxyNode.id) &&
            Objects.equals(this.instanceId, mysqlProxyNode.instanceId) &&
            Objects.equals(this.status, mysqlProxyNode.status) &&
            Objects.equals(this.name, mysqlProxyNode.name) &&
            Objects.equals(this.weight, mysqlProxyNode.weight) &&
            Objects.equals(this.availableZones, mysqlProxyNode.availableZones);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, status, name, weight, availableZones);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
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


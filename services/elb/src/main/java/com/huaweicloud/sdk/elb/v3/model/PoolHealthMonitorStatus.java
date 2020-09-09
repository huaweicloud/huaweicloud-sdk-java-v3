package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的主机组健康检查器状态信息
 */
public class PoolHealthMonitorStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;

    public PoolHealthMonitorStatus withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型，可以为TCP、UDP_CONNECT或HTTP。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoolHealthMonitorStatus withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 健康检查ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PoolHealthMonitorStatus withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 健康检查名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoolHealthMonitorStatus withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning的状态。 可以为：ACTIVE、PENDING_CREATE 或者ERROR。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PoolHealthMonitorStatus poolHealthMonitorStatus = (PoolHealthMonitorStatus) o;
        return Objects.equals(this.type, poolHealthMonitorStatus.type) &&
            Objects.equals(this.id, poolHealthMonitorStatus.id) &&
            Objects.equals(this.name, poolHealthMonitorStatus.name) &&
            Objects.equals(this.provisioningStatus, poolHealthMonitorStatus.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolHealthMonitorStatus {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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


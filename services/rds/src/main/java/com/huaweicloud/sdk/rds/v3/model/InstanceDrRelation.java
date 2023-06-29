package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 容灾实例信息。
 */
public class InstanceDrRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance")

    private MasterInstance masterInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_instances")

    private List<SlaveInstance> slaveInstances = null;

    public InstanceDrRelation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 当前区域实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDrRelation withMasterInstance(MasterInstance masterInstance) {
        this.masterInstance = masterInstance;
        return this;
    }

    public InstanceDrRelation withMasterInstance(Consumer<MasterInstance> masterInstanceSetter) {
        if (this.masterInstance == null) {
            this.masterInstance = new MasterInstance();
            masterInstanceSetter.accept(this.masterInstance);
        }

        return this;
    }

    /**
     * Get masterInstance
     * @return masterInstance
     */
    public MasterInstance getMasterInstance() {
        return masterInstance;
    }

    public void setMasterInstance(MasterInstance masterInstance) {
        this.masterInstance = masterInstance;
    }

    public InstanceDrRelation withSlaveInstances(List<SlaveInstance> slaveInstances) {
        this.slaveInstances = slaveInstances;
        return this;
    }

    public InstanceDrRelation addSlaveInstancesItem(SlaveInstance slaveInstancesItem) {
        if (this.slaveInstances == null) {
            this.slaveInstances = new ArrayList<>();
        }
        this.slaveInstances.add(slaveInstancesItem);
        return this;
    }

    public InstanceDrRelation withSlaveInstances(Consumer<List<SlaveInstance>> slaveInstancesSetter) {
        if (this.slaveInstances == null) {
            this.slaveInstances = new ArrayList<>();
        }
        slaveInstancesSetter.accept(this.slaveInstances);
        return this;
    }

    /**
     * 容灾实例信息列表。
     * @return slaveInstances
     */
    public List<SlaveInstance> getSlaveInstances() {
        return slaveInstances;
    }

    public void setSlaveInstances(List<SlaveInstance> slaveInstances) {
        this.slaveInstances = slaveInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDrRelation that = (InstanceDrRelation) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.masterInstance, that.masterInstance)
            && Objects.equals(this.slaveInstances, that.slaveInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, masterInstance, slaveInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDrRelation {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    masterInstance: ").append(toIndentedString(masterInstance)).append("\n");
        sb.append("    slaveInstances: ").append(toIndentedString(slaveInstances)).append("\n");
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

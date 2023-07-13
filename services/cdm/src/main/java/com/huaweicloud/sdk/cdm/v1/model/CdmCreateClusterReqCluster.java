package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群对象，请参见cluster参数说明
 */
public class CdmCreateClusterReqCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleBootTime")

    private String scheduleBootTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isScheduleBootOff")

    private Boolean isScheduleBootOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<Instance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_properties")

    private ExtendedProperties extendedProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleOffTime")

    private String scheduleOffTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SysTags> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoOff")

    private Boolean isAutoOff;

    public CdmCreateClusterReqCluster withScheduleBootTime(String scheduleBootTime) {
        this.scheduleBootTime = scheduleBootTime;
        return this;
    }

    /**
     * 定时开机的时间，CDM集群会在每天这个时间开机
     * @return scheduleBootTime
     */
    public String getScheduleBootTime() {
        return scheduleBootTime;
    }

    public void setScheduleBootTime(String scheduleBootTime) {
        this.scheduleBootTime = scheduleBootTime;
    }

    public CdmCreateClusterReqCluster withIsScheduleBootOff(Boolean isScheduleBootOff) {
        this.isScheduleBootOff = isScheduleBootOff;
        return this;
    }

    /**
     * 选择是否启用定时开关机功能。定时开关机功能和自动关机功能不可同时开启
     * @return isScheduleBootOff
     */
    public Boolean getIsScheduleBootOff() {
        return isScheduleBootOff;
    }

    public void setIsScheduleBootOff(Boolean isScheduleBootOff) {
        this.isScheduleBootOff = isScheduleBootOff;
    }

    public CdmCreateClusterReqCluster withInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    public CdmCreateClusterReqCluster addInstancesItem(Instance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public CdmCreateClusterReqCluster withInstances(Consumer<List<Instance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 节点列表，请参见instances参数说明
     * @return instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public CdmCreateClusterReqCluster withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CdmCreateClusterReqCluster withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public CdmCreateClusterReqCluster withExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    public CdmCreateClusterReqCluster withExtendedProperties(Consumer<ExtendedProperties> extendedPropertiesSetter) {
        if (this.extendedProperties == null) {
            this.extendedProperties = new ExtendedProperties();
            extendedPropertiesSetter.accept(this.extendedProperties);
        }

        return this;
    }

    /**
     * Get extendedProperties
     * @return extendedProperties
     */
    public ExtendedProperties getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public CdmCreateClusterReqCluster withScheduleOffTime(String scheduleOffTime) {
        this.scheduleOffTime = scheduleOffTime;
        return this;
    }

    /**
     * 定时关机的时间，定时关机时系统不会等待未完成的作业执行完成
     * @return scheduleOffTime
     */
    public String getScheduleOffTime() {
        return scheduleOffTime;
    }

    public void setScheduleOffTime(String scheduleOffTime) {
        this.scheduleOffTime = scheduleOffTime;
    }

    public CdmCreateClusterReqCluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 指定虚拟私有云ID，用于集群网络配置
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CdmCreateClusterReqCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CdmCreateClusterReqCluster withSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public CdmCreateClusterReqCluster addSysTagsItem(SysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CdmCreateClusterReqCluster withSysTags(Consumer<List<SysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目信息，请参见•sys_tags参数说明
     * @return sysTags
     */
    public List<SysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
    }

    public CdmCreateClusterReqCluster withIsAutoOff(Boolean isAutoOff) {
        this.isAutoOff = isAutoOff;
        return this;
    }

    /**
     * 选择是否启用自动关机功能，自动关机功能和定时开关机功能不可同时开启。如果选择自动关机，则当集群中无作业运行且无定时作业时，等待15分钟后集群将自动关机来帮您节约成本
     * @return isAutoOff
     */
    public Boolean getIsAutoOff() {
        return isAutoOff;
    }

    public void setIsAutoOff(Boolean isAutoOff) {
        this.isAutoOff = isAutoOff;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmCreateClusterReqCluster that = (CdmCreateClusterReqCluster) obj;
        return Objects.equals(this.scheduleBootTime, that.scheduleBootTime)
            && Objects.equals(this.isScheduleBootOff, that.isScheduleBootOff)
            && Objects.equals(this.instances, that.instances) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.extendedProperties, that.extendedProperties)
            && Objects.equals(this.scheduleOffTime, that.scheduleOffTime) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.isAutoOff, that.isAutoOff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleBootTime,
            isScheduleBootOff,
            instances,
            datastore,
            extendedProperties,
            scheduleOffTime,
            vpcId,
            name,
            sysTags,
            isAutoOff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmCreateClusterReqCluster {\n");
        sb.append("    scheduleBootTime: ").append(toIndentedString(scheduleBootTime)).append("\n");
        sb.append("    isScheduleBootOff: ").append(toIndentedString(isScheduleBootOff)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
        sb.append("    scheduleOffTime: ").append(toIndentedString(scheduleOffTime)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    isAutoOff: ").append(toIndentedString(isAutoOff)).append("\n");
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

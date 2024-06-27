package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点信息。
 */
public class ClickHouseNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private ClickHouseNodeInfoVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ClickHouseNodeInfoDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_flag")

    private Integer frozenFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ip")

    private String trafficIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ipv6")

    private String trafficIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_vip")

    private String trafficVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_vipv6")

    private String trafficVipv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_description")

    private String azDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_type")

    private String azType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iass_flavor_ref")

    private String iassFlavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connections")

    private String maxConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    private Boolean needRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sg_id")

    private String sgId;

    public ClickHouseNodeInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClickHouseNodeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例节点名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClickHouseNodeInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例节点类型。 取值范围： - master：主节点 - slave：备节点
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClickHouseNodeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClickHouseNodeInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 实例节点周期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ClickHouseNodeInfo withVolume(ClickHouseNodeInfoVolume volume) {
        this.volume = volume;
        return this;
    }

    public ClickHouseNodeInfo withVolume(Consumer<ClickHouseNodeInfoVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new ClickHouseNodeInfoVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public ClickHouseNodeInfoVolume getVolume() {
        return volume;
    }

    public void setVolume(ClickHouseNodeInfoVolume volume) {
        this.volume = volume;
    }

    public ClickHouseNodeInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 实例节点cpu数量。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ClickHouseNodeInfo withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 实例节点内存大小（GB）。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public ClickHouseNodeInfo withDatastore(ClickHouseNodeInfoDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ClickHouseNodeInfo withDatastore(Consumer<ClickHouseNodeInfoDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ClickHouseNodeInfoDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public ClickHouseNodeInfoDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ClickHouseNodeInfoDatastore datastore) {
        this.datastore = datastore;
    }

    public ClickHouseNodeInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 节点优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ClickHouseNodeInfo withFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
        return this;
    }

    /**
     * 冻结标志。 取值范围： - 0：不冻结 - 1：冻结
     * @return frozenFlag
     */
    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    public ClickHouseNodeInfo withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口号。取值范围：0~65535。
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public ClickHouseNodeInfo withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 支付模式。 取值范围： - 0：按需计费 - 1：包周期
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public ClickHouseNodeInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ClickHouseNodeInfo withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /**
     * 节点数据ip。
     * @return trafficIp
     */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    public ClickHouseNodeInfo withTrafficIpv6(String trafficIpv6) {
        this.trafficIpv6 = trafficIpv6;
        return this;
    }

    /**
     * 节点数据ipv6。
     * @return trafficIpv6
     */
    public String getTrafficIpv6() {
        return trafficIpv6;
    }

    public void setTrafficIpv6(String trafficIpv6) {
        this.trafficIpv6 = trafficIpv6;
    }

    public ClickHouseNodeInfo withTrafficVip(String trafficVip) {
        this.trafficVip = trafficVip;
        return this;
    }

    /**
     * 节点数据vip。
     * @return trafficVip
     */
    public String getTrafficVip() {
        return trafficVip;
    }

    public void setTrafficVip(String trafficVip) {
        this.trafficVip = trafficVip;
    }

    public ClickHouseNodeInfo withTrafficVipv6(String trafficVipv6) {
        this.trafficVipv6 = trafficVipv6;
        return this;
    }

    /**
     * 节点数据vipV6。
     * @return trafficVipv6
     */
    public String getTrafficVipv6() {
        return trafficVipv6;
    }

    public void setTrafficVipv6(String trafficVipv6) {
        this.trafficVipv6 = trafficVipv6;
    }

    public ClickHouseNodeInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ClickHouseNodeInfo withAzDescription(String azDescription) {
        this.azDescription = azDescription;
        return this;
    }

    /**
     * 可用区描述。
     * @return azDescription
     */
    public String getAzDescription() {
        return azDescription;
    }

    public void setAzDescription(String azDescription) {
        this.azDescription = azDescription;
    }

    public ClickHouseNodeInfo withAzType(String azType) {
        this.azType = azType;
        return this;
    }

    /**
     * 可用区类型。
     * @return azType
     */
    public String getAzType() {
        return azType;
    }

    public void setAzType(String azType) {
        this.azType = azType;
    }

    public ClickHouseNodeInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 节点所在区。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ClickHouseNodeInfo withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 节点创建时间。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ClickHouseNodeInfo withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 节点更新时间。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ClickHouseNodeInfo withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 节点规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ClickHouseNodeInfo withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 节点规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ClickHouseNodeInfo withIassFlavorRef(String iassFlavorRef) {
        this.iassFlavorRef = iassFlavorRef;
        return this;
    }

    /**
     * IASS规格码。
     * @return iassFlavorRef
     */
    public String getIassFlavorRef() {
        return iassFlavorRef;
    }

    public void setIassFlavorRef(String iassFlavorRef) {
        this.iassFlavorRef = iassFlavorRef;
    }

    public ClickHouseNodeInfo withMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    /**
     * 公网最大连接数。
     * @return maxConnections
     */
    public String getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
    }

    public ClickHouseNodeInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ClickHouseNodeInfo withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ClickHouseNodeInfo withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * 参数更新是否需要重启。
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    public ClickHouseNodeInfo withSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    /**
     * 安全组
     * @return sgId
     */
    public String getSgId() {
        return sgId;
    }

    public void setSgId(String sgId) {
        this.sgId = sgId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickHouseNodeInfo that = (ClickHouseNodeInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.period, that.period) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.frozenFlag, that.frozenFlag) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.payModel, that.payModel) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.trafficIp, that.trafficIp) && Objects.equals(this.trafficIpv6, that.trafficIpv6)
            && Objects.equals(this.trafficVip, that.trafficVip) && Objects.equals(this.trafficVipv6, that.trafficVipv6)
            && Objects.equals(this.azCode, that.azCode) && Objects.equals(this.azDescription, that.azDescription)
            && Objects.equals(this.azType, that.azType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.iassFlavorRef, that.iassFlavorRef)
            && Objects.equals(this.maxConnections, that.maxConnections) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.needRestart, that.needRestart)
            && Objects.equals(this.sgId, that.sgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            status,
            period,
            volume,
            cpu,
            mem,
            datastore,
            priority,
            frozenFlag,
            dbPort,
            payModel,
            orderId,
            trafficIp,
            trafficIpv6,
            trafficVip,
            trafficVipv6,
            azCode,
            azDescription,
            azType,
            region,
            createAt,
            updateAt,
            flavorId,
            flavorRef,
            iassFlavorRef,
            maxConnections,
            vpcId,
            subnetId,
            needRestart,
            sgId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClickHouseNodeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    frozenFlag: ").append(toIndentedString(frozenFlag)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
        sb.append("    trafficIpv6: ").append(toIndentedString(trafficIpv6)).append("\n");
        sb.append("    trafficVip: ").append(toIndentedString(trafficVip)).append("\n");
        sb.append("    trafficVipv6: ").append(toIndentedString(trafficVipv6)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azDescription: ").append(toIndentedString(azDescription)).append("\n");
        sb.append("    azType: ").append(toIndentedString(azType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    iassFlavorRef: ").append(toIndentedString(iassFlavorRef)).append("\n");
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    sgId: ").append(toIndentedString(sgId)).append("\n");
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

package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：统计数据信息。
 */
public class OpenV2XStatisticsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private StatisticsSourceDTO source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private BigDecimal direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private Integer flow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_speed")

    private BigDecimal averageSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_id")

    private String crossId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_direction")

    private Integer trafficDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "road_kind")

    private Integer roadKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_class_flow")

    private List<ModelFlow> vehicleClassFlow = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occupancy")

    private List<LaneOccupancy> occupancy = null;

    public OpenV2XStatisticsBody withSource(StatisticsSourceDTO source) {
        this.source = source;
        return this;
    }

    public OpenV2XStatisticsBody withSource(Consumer<StatisticsSourceDTO> sourceSetter) {
        if (this.source == null) {
            this.source = new StatisticsSourceDTO();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public StatisticsSourceDTO getSource() {
        return source;
    }

    public void setSource(StatisticsSourceDTO source) {
        this.source = source;
    }

    public OpenV2XStatisticsBody withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数说明**：数据上报的时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'。 例如：2021-01-08T02:03:41Z。 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public OpenV2XStatisticsBody withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * **参数说明**：统计周期，单位秒。
     * minimum: 0
     * maximum: 100000000
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public OpenV2XStatisticsBody withDirection(BigDecimal direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数说明**：道路路的角度，区分道路方向，向东为0度，逆时针增加。
     * minimum: 0
     * maximum: 3.6E+2
     * @return direction
     */
    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
    }

    public OpenV2XStatisticsBody withFlow(Integer flow) {
        this.flow = flow;
        return this;
    }

    /**
     * **参数说明**：统计周期内的车辆数。
     * minimum: 0
     * maximum: 100000000
     * @return flow
     */
    public Integer getFlow() {
        return flow;
    }

    public void setFlow(Integer flow) {
        this.flow = flow;
    }

    public OpenV2XStatisticsBody withAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }

    /**
     * **参数说明**：车辆平均速度，单位km/h。
     * minimum: 0
     * maximum: 1E+3
     * @return averageSpeed
     */
    public BigDecimal getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public OpenV2XStatisticsBody withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：设备编码。 **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。 
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public OpenV2XStatisticsBody withCrossId(String crossId) {
        this.crossId = crossId;
        return this;
    }

    /**
     * **参数说明**：路口id，对应到一组雷视拟合设备，检测一个特定的路口或者路段。
     * @return crossId
     */
    public String getCrossId() {
        return crossId;
    }

    public void setCrossId(String crossId) {
        this.crossId = crossId;
    }

    public OpenV2XStatisticsBody withTrafficDirection(Integer trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }

    /**
     * **参数说明**：路段的交通流方向，交通流方向按照“西北规则”进行定义，即尽量选择西北的点作为正向起点，先西后北。西北规则具体说明请参见 [“西北规则”说明](此处添加support文档的url)。 0：正向 1：逆向 2：正向转逆向的连接线 3：逆向转正向的连接线 9：为方向未确定 
     * minimum: 0
     * maximum: 10
     * @return trafficDirection
     */
    public Integer getTrafficDirection() {
        return trafficDirection;
    }

    public void setTrafficDirection(Integer trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    public OpenV2XStatisticsBody withRoadKind(Integer roadKind) {
        this.roadKind = roadKind;
        return this;
    }

    /**
     * **参数说明**：道路特征，0为主路，1为汇入匝道，2为汇出匝道，3为辅道
     * minimum: 0
     * maximum: 10
     * @return roadKind
     */
    public Integer getRoadKind() {
        return roadKind;
    }

    public void setRoadKind(Integer roadKind) {
        this.roadKind = roadKind;
    }

    public OpenV2XStatisticsBody withVehicleClassFlow(List<ModelFlow> vehicleClassFlow) {
        this.vehicleClassFlow = vehicleClassFlow;
        return this;
    }

    public OpenV2XStatisticsBody addVehicleClassFlowItem(ModelFlow vehicleClassFlowItem) {
        if (this.vehicleClassFlow == null) {
            this.vehicleClassFlow = new ArrayList<>();
        }
        this.vehicleClassFlow.add(vehicleClassFlowItem);
        return this;
    }

    public OpenV2XStatisticsBody withVehicleClassFlow(Consumer<List<ModelFlow>> vehicleClassFlowSetter) {
        if (this.vehicleClassFlow == null) {
            this.vehicleClassFlow = new ArrayList<>();
        }
        vehicleClassFlowSetter.accept(this.vehicleClassFlow);
        return this;
    }

    /**
     * **参数说明**：不同车辆类型的流量统计。
     * @return vehicleClassFlow
     */
    public List<ModelFlow> getVehicleClassFlow() {
        return vehicleClassFlow;
    }

    public void setVehicleClassFlow(List<ModelFlow> vehicleClassFlow) {
        this.vehicleClassFlow = vehicleClassFlow;
    }

    public OpenV2XStatisticsBody withOccupancy(List<LaneOccupancy> occupancy) {
        this.occupancy = occupancy;
        return this;
    }

    public OpenV2XStatisticsBody addOccupancyItem(LaneOccupancy occupancyItem) {
        if (this.occupancy == null) {
            this.occupancy = new ArrayList<>();
        }
        this.occupancy.add(occupancyItem);
        return this;
    }

    public OpenV2XStatisticsBody withOccupancy(Consumer<List<LaneOccupancy>> occupancySetter) {
        if (this.occupancy == null) {
            this.occupancy = new ArrayList<>();
        }
        occupancySetter.accept(this.occupancy);
        return this;
    }

    /**
     * **参数说明**：分车道统计的占有率列表。
     * @return occupancy
     */
    public List<LaneOccupancy> getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(List<LaneOccupancy> occupancy) {
        this.occupancy = occupancy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenV2XStatisticsBody that = (OpenV2XStatisticsBody) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.time, that.time)
            && Objects.equals(this.period, that.period) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.flow, that.flow) && Objects.equals(this.averageSpeed, that.averageSpeed)
            && Objects.equals(this.esn, that.esn) && Objects.equals(this.crossId, that.crossId)
            && Objects.equals(this.trafficDirection, that.trafficDirection)
            && Objects.equals(this.roadKind, that.roadKind)
            && Objects.equals(this.vehicleClassFlow, that.vehicleClassFlow)
            && Objects.equals(this.occupancy, that.occupancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source,
            time,
            period,
            direction,
            flow,
            averageSpeed,
            esn,
            crossId,
            trafficDirection,
            roadKind,
            vehicleClassFlow,
            occupancy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenV2XStatisticsBody {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    crossId: ").append(toIndentedString(crossId)).append("\n");
        sb.append("    trafficDirection: ").append(toIndentedString(trafficDirection)).append("\n");
        sb.append("    roadKind: ").append(toIndentedString(roadKind)).append("\n");
        sb.append("    vehicleClassFlow: ").append(toIndentedString(vehicleClassFlow)).append("\n");
        sb.append("    occupancy: ").append(toIndentedString(occupancy)).append("\n");
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

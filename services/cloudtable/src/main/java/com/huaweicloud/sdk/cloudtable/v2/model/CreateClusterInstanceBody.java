package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateClusterInstanceBody
 */
public class CreateClusterInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    public CreateClusterInstanceBody withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 集群节点类型，hbase有regionserver，hmaster，opentsdb等，doris有be，fe节点，clickhouse有server（计算节点），zookeeper
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public CreateClusterInstanceBody withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 节点个数，hbase取值：2<=num<=10],偶数 doris取值：be[3,100] fe只能是3或5， clickhouse取值：计算节点[2,10000],取偶数，zookeeper节点固定为3
     * minimum: 1
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public CreateClusterInstanceBody withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 节点规格，doris集群、clickhouse集群必选
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public CreateClusterInstanceBody withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 数据盘规格：COMMON、HIGH、ULTRAHIGH，NORMALHIGH, EXTREMEHIGH. doris集群、clickhouse集群必选
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public CreateClusterInstanceBody withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 数据盘大小，doris集群、clickhouse集群必选。 fe[200,2000] be[400,10000] server[500,10000] zookeeper[200,1000]
     * minimum: 1
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public CreateClusterInstanceBody withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 节点入参类型 0：flavor模式 ，1：cu模式，doris、hbase、clickhouse都是flavor模式
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterInstanceBody that = (CreateClusterInstanceBody) obj;
        return Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceNum, that.instanceNum) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeSize, that.volumeSize)
            && Objects.equals(this.flavorType, that.flavorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceType, instanceNum, flavor, volumeType, volumeSize, flavorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInstanceBody {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
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

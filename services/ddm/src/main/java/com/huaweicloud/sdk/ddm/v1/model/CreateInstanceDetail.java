package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例相关信息的集合
 */
public class CreateInstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    @JacksonXmlProperty(localName = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    @JacksonXmlProperty(localName = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    @JacksonXmlProperty(localName = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    @JacksonXmlProperty(localName = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_group_id")

    @JacksonXmlProperty(localName = "param_group_id")

    private String paramGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    @JacksonXmlProperty(localName = "time_zone")

    private String timeZone;

    public CreateInstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * DDM实例名称，命名要求如下。 - 长度为4-64个字符。 - 必须以字母开头。 - 可以包含字母、数字、中划线，不能包含其它特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceDetail withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateInstanceDetail withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点个数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public CreateInstanceDetail withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 引擎ID。
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public CreateInstanceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceDetail withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateInstanceDetail addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateInstanceDetail withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区code。取值非空，请参见地区和终端节点(https://developer.huaweicloud.com/endpoint?DDM)。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateInstanceDetail withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceDetail withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceDetail withSubnetId(String subnetId) {
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

    public CreateInstanceDetail withParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }

    /**
     * 参数组ID.
     * @return paramGroupId
     */
    public String getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    public CreateInstanceDetail withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * UTC时区。默认为UTC。取值范围：\"UTC\",\"UTC-12:00\",\"UTC-11:00\",\"UTC-10:00\",\"UTC-09:00\", \"UTC-08:00\", \"UTC-07:00\", \"UTC-06:00\", \"UTC-05:00\", \"UTC-04:00\", \"UTC-03:00\", \"UTC-02:00\", \"UTC-01:00\", \"UTC+01:00\", \"UTC+02:00\", \"UTC+03:00\", \"UTC+04:00\", \"UTC+05:00\", \"UTC+06:00\", \"UTC+07:00\", \"UTC+08:00\", \"UTC+09:00\", \"UTC+10:00\", \"UTC+11:00\", \"UTC+12:00\"
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceDetail createInstanceDetail = (CreateInstanceDetail) o;
        return Objects.equals(this.name, createInstanceDetail.name)
            && Objects.equals(this.flavorId, createInstanceDetail.flavorId)
            && Objects.equals(this.nodeNum, createInstanceDetail.nodeNum)
            && Objects.equals(this.engineId, createInstanceDetail.engineId)
            && Objects.equals(this.enterpriseProjectId, createInstanceDetail.enterpriseProjectId)
            && Objects.equals(this.availableZones, createInstanceDetail.availableZones)
            && Objects.equals(this.vpcId, createInstanceDetail.vpcId)
            && Objects.equals(this.securityGroupId, createInstanceDetail.securityGroupId)
            && Objects.equals(this.subnetId, createInstanceDetail.subnetId)
            && Objects.equals(this.paramGroupId, createInstanceDetail.paramGroupId)
            && Objects.equals(this.timeZone, createInstanceDetail.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            flavorId,
            nodeNum,
            engineId,
            enterpriseProjectId,
            availableZones,
            vpcId,
            securityGroupId,
            subnetId,
            paramGroupId,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    paramGroupId: ").append(toIndentedString(paramGroupId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IncidentOrderAuthDetailInfoV2 */
public class IncidentOrderAuthDetailInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public IncidentOrderAuthDetailInfoV2 withId(Long id) {
        this.id = id;
        return this;
    }

    /** 授权详情id minimum: 0 maximum: 9223372036854775807
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IncidentOrderAuthDetailInfoV2 withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 端口 minimum: 0 maximum: 65535
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public IncidentOrderAuthDetailInfoV2 withAccount(String account) {
        this.account = account;
        return this;
    }

    /** 账户
     * 
     * @return account */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public IncidentOrderAuthDetailInfoV2 withType(Integer type) {
        this.type = type;
        return this;
    }

    /** 授权详情类型，0控制台 1主机资源 minimum: 0 maximum: 1
     * 
     * @return type */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public IncidentOrderAuthDetailInfoV2 withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例id
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public IncidentOrderAuthDetailInfoV2 withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /** 实例名称
     * 
     * @return instanceName */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public IncidentOrderAuthDetailInfoV2 withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 区域id
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentOrderAuthDetailInfoV2 incidentOrderAuthDetailInfoV2 = (IncidentOrderAuthDetailInfoV2) o;
        return Objects.equals(this.id, incidentOrderAuthDetailInfoV2.id)
            && Objects.equals(this.port, incidentOrderAuthDetailInfoV2.port)
            && Objects.equals(this.account, incidentOrderAuthDetailInfoV2.account)
            && Objects.equals(this.type, incidentOrderAuthDetailInfoV2.type)
            && Objects.equals(this.instanceId, incidentOrderAuthDetailInfoV2.instanceId)
            && Objects.equals(this.instanceName, incidentOrderAuthDetailInfoV2.instanceName)
            && Objects.equals(this.regionId, incidentOrderAuthDetailInfoV2.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, port, account, type, instanceId, instanceName, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentOrderAuthDetailInfoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

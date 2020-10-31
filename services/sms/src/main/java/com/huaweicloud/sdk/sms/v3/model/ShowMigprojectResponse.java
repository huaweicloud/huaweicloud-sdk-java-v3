package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMigprojectResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isdefault")
    
    private Boolean isdefault = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_target_server")
    
    private String startTargetServer = "true";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="speed_limit")
    
    private Integer speedLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_public_ip")
    
    private Boolean usePublicIp = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exist_server")
    
    private Boolean existServer = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project")
    
    private String enterpriseProject = "default";

    public ShowMigprojectResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 迁移项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowMigprojectResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowMigprojectResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 迁移项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowMigprojectResponse withIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
        return this;
    }

    


    /**
     * 是否为默认模板
     * @return isdefault
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    public ShowMigprojectResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowMigprojectResponse withStartTargetServer(String startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    


    /**
     * 迁移后是否启动目的端虚拟机
     * @return startTargetServer
     */
    public String getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(String startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public ShowMigprojectResponse withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    


    /**
     * 限制迁移速率，单位：Mbps
     * minimum: 0
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public ShowMigprojectResponse withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    


    /**
     * 是否使用公网IP迁移
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public ShowMigprojectResponse withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    


    /**
     * 是否是已经存在的服务器
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public ShowMigprojectResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 迁移项目类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowMigprojectResponse withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    


    /**
     * 企业项目名称
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMigprojectResponse showMigprojectResponse = (ShowMigprojectResponse) o;
        return Objects.equals(this.name, showMigprojectResponse.name) &&
            Objects.equals(this.domainId, showMigprojectResponse.domainId) &&
            Objects.equals(this.description, showMigprojectResponse.description) &&
            Objects.equals(this.isdefault, showMigprojectResponse.isdefault) &&
            Objects.equals(this.region, showMigprojectResponse.region) &&
            Objects.equals(this.startTargetServer, showMigprojectResponse.startTargetServer) &&
            Objects.equals(this.speedLimit, showMigprojectResponse.speedLimit) &&
            Objects.equals(this.usePublicIp, showMigprojectResponse.usePublicIp) &&
            Objects.equals(this.existServer, showMigprojectResponse.existServer) &&
            Objects.equals(this.type, showMigprojectResponse.type) &&
            Objects.equals(this.enterpriseProject, showMigprojectResponse.enterpriseProject);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, description, isdefault, region, startTargetServer, speedLimit, usePublicIp, existServer, type, enterpriseProject);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigprojectResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isdefault: ").append(toIndentedString(isdefault)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
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


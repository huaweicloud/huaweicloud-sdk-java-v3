package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.PageLink;
import com.huaweicloud.sdk.dns.v2.model.Router;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPrivateZoneResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zone_type")
    
    private String zoneType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serial")
    
    private Integer serial;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_num")
    
    private Integer recordNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_id")
    
    private String poolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private PageLink links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masters")
    
    private List<String> masters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="routers")
    
    private List<Router> routers = null;
    
    public ShowPrivateZoneResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * zone的ID，uuid形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowPrivateZoneResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * zone名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowPrivateZoneResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 对zone的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowPrivateZoneResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 管理该zone的管理员邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public ShowPrivateZoneResponse withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    


    /**
     * zone类型，公网（public）或者内网（private）。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    

    public ShowPrivateZoneResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * 该zone下SOA记录中的ttl值。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    

    public ShowPrivateZoneResponse withSerial(Integer serial) {
        this.serial = serial;
        return this;
    }

    


    /**
     * 该zone下SOA记录中用于标识zone文件变更的序列值，用于主从节点同步。
     * @return serial
     */
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    

    public ShowPrivateZoneResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowPrivateZoneResponse withRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    


    /**
     * 该zone下的recordset个数。
     * @return recordNum
     */
    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    

    public ShowPrivateZoneResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * 托管该zone的pool，由系统分配。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    public ShowPrivateZoneResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * zone所属的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ShowPrivateZoneResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public ShowPrivateZoneResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public ShowPrivateZoneResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ShowPrivateZoneResponse withLinks(Consumer<PageLink> linksSetter) {
        if(this.links == null ){
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    

    public ShowPrivateZoneResponse withMasters(List<String> masters) {
        this.masters = masters;
        return this;
    }

    
    public ShowPrivateZoneResponse addMastersItem(String mastersItem) {
        this.masters.add(mastersItem);
        return this;
    }

    public ShowPrivateZoneResponse withMasters(Consumer<List<String>> mastersSetter) {
        if(this.masters == null ){
            this.masters = new ArrayList<>();
        }
        mastersSetter.accept(this.masters);
        return this;
    }

    /**
     * 主从模式中，从DNS服务器用以获取DNS信息。
     * @return masters
     */
    public List<String> getMasters() {
        return masters;
    }

    public void setMasters(List<String> masters) {
        this.masters = masters;
    }

    

    public ShowPrivateZoneResponse withRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    
    public ShowPrivateZoneResponse addRoutersItem(Router routersItem) {
        this.routers.add(routersItem);
        return this;
    }

    public ShowPrivateZoneResponse withRouters(Consumer<List<Router>> routersSetter) {
        if(this.routers == null ){
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * 与该zone关联的Router(VPC)列表。
     * @return routers
     */
    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPrivateZoneResponse showPrivateZoneResponse = (ShowPrivateZoneResponse) o;
        return Objects.equals(this.id, showPrivateZoneResponse.id) &&
            Objects.equals(this.name, showPrivateZoneResponse.name) &&
            Objects.equals(this.description, showPrivateZoneResponse.description) &&
            Objects.equals(this.email, showPrivateZoneResponse.email) &&
            Objects.equals(this.zoneType, showPrivateZoneResponse.zoneType) &&
            Objects.equals(this.ttl, showPrivateZoneResponse.ttl) &&
            Objects.equals(this.serial, showPrivateZoneResponse.serial) &&
            Objects.equals(this.status, showPrivateZoneResponse.status) &&
            Objects.equals(this.recordNum, showPrivateZoneResponse.recordNum) &&
            Objects.equals(this.poolId, showPrivateZoneResponse.poolId) &&
            Objects.equals(this.projectId, showPrivateZoneResponse.projectId) &&
            Objects.equals(this.createdAt, showPrivateZoneResponse.createdAt) &&
            Objects.equals(this.updatedAt, showPrivateZoneResponse.updatedAt) &&
            Objects.equals(this.links, showPrivateZoneResponse.links) &&
            Objects.equals(this.masters, showPrivateZoneResponse.masters) &&
            Objects.equals(this.routers, showPrivateZoneResponse.routers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, email, zoneType, ttl, serial, status, recordNum, poolId, projectId, createdAt, updatedAt, links, masters, routers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateZoneResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordNum: ").append(toIndentedString(recordNum)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
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


package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdatePublicZoneStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial")

    private Integer serial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_num")

    private Integer recordNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masters")

    private List<String> masters = null;

    public UpdatePublicZoneStatusResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域名的ID，UUID形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdatePublicZoneStatusResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePublicZoneStatusResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对域名的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePublicZoneStatusResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 管理该域名的管理员邮箱，用于生成该域名的SOA记录。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UpdatePublicZoneStatusResponse withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * 域名类型，公网（public）。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public UpdatePublicZoneStatusResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 该域名下SOA记录中的ttl值。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public UpdatePublicZoneStatusResponse withSerial(Integer serial) {
        this.serial = serial;
        return this;
    }

    /**
     * 该域名下SOA记录中用于标识域名文件变更的序列值，用于主从节点同步。
     * @return serial
     */
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public UpdatePublicZoneStatusResponse withStatus(String status) {
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

    public UpdatePublicZoneStatusResponse withRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    /**
     * 该域名下的记录集个数。
     * @return recordNum
     */
    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    public UpdatePublicZoneStatusResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 托管该域名的pool，由系统分配。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public UpdatePublicZoneStatusResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 域名所属的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdatePublicZoneStatusResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdatePublicZoneStatusResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdatePublicZoneStatusResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public UpdatePublicZoneStatusResponse withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
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

    public UpdatePublicZoneStatusResponse withMasters(List<String> masters) {
        this.masters = masters;
        return this;
    }

    public UpdatePublicZoneStatusResponse addMastersItem(String mastersItem) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        this.masters.add(mastersItem);
        return this;
    }

    public UpdatePublicZoneStatusResponse withMasters(Consumer<List<String>> mastersSetter) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        mastersSetter.accept(this.masters);
        return this;
    }

    /**
     * 主从模式中，从DNS服务器获取DNS信息。目前暂未使用。
     * @return masters
     */
    public List<String> getMasters() {
        return masters;
    }

    public void setMasters(List<String> masters) {
        this.masters = masters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePublicZoneStatusResponse that = (UpdatePublicZoneStatusResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.email, that.email)
            && Objects.equals(this.zoneType, that.zoneType) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.serial, that.serial) && Objects.equals(this.status, that.status)
            && Objects.equals(this.recordNum, that.recordNum) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.links, that.links)
            && Objects.equals(this.masters, that.masters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            email,
            zoneType,
            ttl,
            serial,
            status,
            recordNum,
            poolId,
            projectId,
            createdAt,
            updatedAt,
            links,
            masters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicZoneStatusResponse {\n");
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

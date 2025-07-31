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
public class CreatePrivateZoneResponse extends SdkResponse {

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
    @JsonProperty(value = "proxy_pattern")

    private String proxyPattern;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router")

    private RouterWithStatus router;

    public CreatePrivateZoneResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 域名的ID，UUID形式的一个资源标识。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePrivateZoneResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 域名。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePrivateZoneResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 域名的描述信息。 **取值范围：** 长度不超过255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePrivateZoneResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 管理该域名的管理员邮箱，用于生成该域名的SOA记录。 **取值范围：** 不涉及。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreatePrivateZoneResponse withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * **参数解释：** 域名类型。 **取值范围：** private：内网域名。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public CreatePrivateZoneResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 该域名下SOA记录中的有效缓存时间，以秒为单位。 **取值范围：** 1~2147483647。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CreatePrivateZoneResponse withSerial(Integer serial) {
        this.serial = serial;
        return this;
    }

    /**
     * **参数解释：** 该域名下SOA记录中用于标识域名文件变更的序列值，用于主从节点同步。 该参数暂未使用。 **取值范围：** 不涉及。
     * @return serial
     */
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public CreatePrivateZoneResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 内网域名状态。 **取值范围：** - ACTIVE：正常 - PENDING_CREATE：创建中 - DISABLE：暂停
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreatePrivateZoneResponse withRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    /**
     * **参数解释：** 该域名下的记录集个数。 **取值范围：** 不涉及。
     * @return recordNum
     */
    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    public CreatePrivateZoneResponse withProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }

    /**
     * **参数解释：** 内网域名的子域名递归解析代理模式。 **取值范围：** - AUTHORITY：当前域名未开启递归解析代理 - RECURSIVE：当前域名已开启递归解析代理
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return proxyPattern;
    }

    public void setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
    }

    public CreatePrivateZoneResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 托管该域名的pool，由系统分配。 **取值范围：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public CreatePrivateZoneResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 域名所属的项目ID。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreatePrivateZoneResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 域名的创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreatePrivateZoneResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 域名的最近一次修改时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreatePrivateZoneResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public CreatePrivateZoneResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public CreatePrivateZoneResponse withMasters(List<String> masters) {
        this.masters = masters;
        return this;
    }

    public CreatePrivateZoneResponse addMastersItem(String mastersItem) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        this.masters.add(mastersItem);
        return this;
    }

    public CreatePrivateZoneResponse withMasters(Consumer<List<String>> mastersSetter) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        mastersSetter.accept(this.masters);
        return this;
    }

    /**
     * **参数解释：** 主从模式中，从DNS服务器获取DNS信息。 **取值范围：** 不涉及。
     * @return masters
     */
    public List<String> getMasters() {
        return masters;
    }

    public void setMasters(List<String> masters) {
        this.masters = masters;
    }

    public CreatePrivateZoneResponse withRouter(RouterWithStatus router) {
        this.router = router;
        return this;
    }

    public CreatePrivateZoneResponse withRouter(Consumer<RouterWithStatus> routerSetter) {
        if (this.router == null) {
            this.router = new RouterWithStatus();
            routerSetter.accept(this.router);
        }

        return this;
    }

    /**
     * Get router
     * @return router
     */
    public RouterWithStatus getRouter() {
        return router;
    }

    public void setRouter(RouterWithStatus router) {
        this.router = router;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateZoneResponse that = (CreatePrivateZoneResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.email, that.email)
            && Objects.equals(this.zoneType, that.zoneType) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.serial, that.serial) && Objects.equals(this.status, that.status)
            && Objects.equals(this.recordNum, that.recordNum) && Objects.equals(this.proxyPattern, that.proxyPattern)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.links, that.links) && Objects.equals(this.masters, that.masters)
            && Objects.equals(this.router, that.router);
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
            proxyPattern,
            poolId,
            projectId,
            createdAt,
            updatedAt,
            links,
            masters,
            router);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateZoneResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordNum: ").append(toIndentedString(recordNum)).append("\n");
        sb.append("    proxyPattern: ").append(toIndentedString(proxyPattern)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
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

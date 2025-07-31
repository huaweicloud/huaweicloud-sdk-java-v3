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
public class UpdateRecordSetsResponse extends SdkResponse {

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
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check_id")

    private String healthCheckId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_target")

    private AliasTarget aliasTarget;

    public UpdateRecordSetsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记录集的ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateRecordSetsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 记录集的名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRecordSetsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 记录集的描述信息。 **取值范围：** 长度不超过255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRecordSetsResponse withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释：** 托管该记录的域名ID。 **取值范围：** 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public UpdateRecordSetsResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * **参数解释：** 托管该记录的域名。 **取值范围：** 不涉及。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public UpdateRecordSetsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 记录类型。 **取值范围：** - 公网域名的记录类型: A、AAAA、MX、CNAME、TXT、SRV、NS、SOA、CAA。 - 内网域名的记录类型: A、AAAA、MX、CNAME、TXT、PTR、SRV、NS、SOA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateRecordSetsResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。 **取值范围：** 1~2147483647。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public UpdateRecordSetsResponse withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public UpdateRecordSetsResponse addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public UpdateRecordSetsResponse withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 域名解析后的值。 **取值范围：** 不涉及。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public UpdateRecordSetsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 记录集的创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateRecordSetsResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 记录集的最近一次修改时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateRecordSetsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 记录集状态。 **取值范围：** - PENDING_UPDATE：更新中 - PENDING_DISABLE：暂停中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateRecordSetsResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * **参数解释：** 标识是否由系统默认生成，系统默认生成的记录集不能删除。 **取值范围：** 不涉及。
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public UpdateRecordSetsResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 该记录集所属的项目ID。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateRecordSetsResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public UpdateRecordSetsResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public UpdateRecordSetsResponse withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 解析线路ID。 **取值范围：** 不涉及。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public UpdateRecordSetsResponse withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 解析记录的权重。 **取值范围：** 0~1000。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public UpdateRecordSetsResponse withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * **参数解释：** 健康检查ID。 **取值范围：** 不涉及。
     * @return healthCheckId
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    public UpdateRecordSetsResponse withAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    public UpdateRecordSetsResponse withAliasTarget(Consumer<AliasTarget> aliasTargetSetter) {
        if (this.aliasTarget == null) {
            this.aliasTarget = new AliasTarget();
            aliasTargetSetter.accept(this.aliasTarget);
        }

        return this;
    }

    /**
     * Get aliasTarget
     * @return aliasTarget
     */
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }

    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRecordSetsResponse that = (UpdateRecordSetsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.zoneId, that.zoneId)
            && Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.records, that.records)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.status, that.status) && Objects.equals(this._default, that._default)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.links, that.links)
            && Objects.equals(this.line, that.line) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.healthCheckId, that.healthCheckId)
            && Objects.equals(this.aliasTarget, that.aliasTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            zoneId,
            zoneName,
            type,
            ttl,
            records,
            createdAt,
            updatedAt,
            status,
            _default,
            projectId,
            links,
            line,
            weight,
            healthCheckId,
            aliasTarget);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordSetsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    healthCheckId: ").append(toIndentedString(healthCheckId)).append("\n");
        sb.append("    aliasTarget: ").append(toIndentedString(aliasTarget)).append("\n");
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

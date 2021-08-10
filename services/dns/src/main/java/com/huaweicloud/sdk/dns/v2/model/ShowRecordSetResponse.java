package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowRecordSetResponse extends SdkResponse {

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
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

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

    public ShowRecordSetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** Record Set的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowRecordSetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** Record Set的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowRecordSetResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** Record Set的描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowRecordSetResponse withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /** 托管该记录的zone_id。
     * 
     * @return zoneId */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ShowRecordSetResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /** 托管该记录的zone_name。
     * 
     * @return zoneName */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public ShowRecordSetResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 记录类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowRecordSetResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /** 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * 
     * @return ttl */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public ShowRecordSetResponse withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public ShowRecordSetResponse addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ShowRecordSetResponse withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /** 域名解析后的值。
     * 
     * @return records */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public ShowRecordSetResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createAt */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ShowRecordSetResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updateAt */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public ShowRecordSetResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 资源状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowRecordSetResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /** 标识是否由系统默认生成，系统默认生成的Record Set不能删除。
     * 
     * @return _default */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public ShowRecordSetResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 该Record Set所属的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowRecordSetResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ShowRecordSetResponse withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /** Get links
     * 
     * @return links */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRecordSetResponse showRecordSetResponse = (ShowRecordSetResponse) o;
        return Objects.equals(this.id, showRecordSetResponse.id)
            && Objects.equals(this.name, showRecordSetResponse.name)
            && Objects.equals(this.description, showRecordSetResponse.description)
            && Objects.equals(this.zoneId, showRecordSetResponse.zoneId)
            && Objects.equals(this.zoneName, showRecordSetResponse.zoneName)
            && Objects.equals(this.type, showRecordSetResponse.type)
            && Objects.equals(this.ttl, showRecordSetResponse.ttl)
            && Objects.equals(this.records, showRecordSetResponse.records)
            && Objects.equals(this.createAt, showRecordSetResponse.createAt)
            && Objects.equals(this.updateAt, showRecordSetResponse.updateAt)
            && Objects.equals(this.status, showRecordSetResponse.status)
            && Objects.equals(this._default, showRecordSetResponse._default)
            && Objects.equals(this.projectId, showRecordSetResponse.projectId)
            && Objects.equals(this.links, showRecordSetResponse.links);
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
            createAt,
            updateAt,
            status,
            _default,
            projectId,
            links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecordSetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

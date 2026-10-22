package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建快照一致性组。
 */
public class SnapshotGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ids")

    private List<String> volumeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instant_access")

    private Boolean instantAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    public SnapshotGroup withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释** 云服务器id。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public SnapshotGroup withVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    public SnapshotGroup addVolumeIdsItem(String volumeIdsItem) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        this.volumeIds.add(volumeIdsItem);
        return this;
    }

    public SnapshotGroup withVolumeIds(Consumer<List<String>> volumeIdsSetter) {
        if (this.volumeIds == null) {
            this.volumeIds = new ArrayList<>();
        }
        volumeIdsSetter.accept(this.volumeIds);
        return this;
    }

    /**
     * **参数解释** 云硬盘id列表。 **约束限制** 格式为ids=[\"id1\",\"id2\",...,\"idx\"]。 如果设置了server_id，则该参数只能设置指定实例内已挂载的云硬盘，不再支持设置多个跨实例的云硬盘ID。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return volumeIds
     */
    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    public SnapshotGroup withInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }

    /**
     * **参数解释** 是否开启快照极速可用。 **约束限制** 不涉及。 **取值范围** - true：开启。 - false：关闭。 **默认取值** false
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return instantAccess;
    }

    public void setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
    }

    public SnapshotGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 快照一致性组名称。 **约束限制** 最大支持255个字节。 **取值范围** 最小长度：0 最大长度：255 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 快照一致性组描述。 **约束限制** 最大支持255个字节。 **取值范围** 最小长度：0 最大长度：255 **默认取值** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotGroup withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public SnapshotGroup putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public SnapshotGroup withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 快照一致性组的标签。 标签的value：String类型，最大长度43个字符，可以为空字符串。 由英文字母、数字、下划线、点、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。  标签的value：String类型，最大长度43个字符，可以为空字符串。 由英文字母、数字、下划线、点、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public SnapshotGroup withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 快照一致性组所属的企业项目ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SnapshotGroup withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * **参数解释** 是否创建增量快照。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return incremental
     */
    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotGroup that = (SnapshotGroup) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.volumeIds, that.volumeIds)
            && Objects.equals(this.instantAccess, that.instantAccess) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.incremental, that.incremental);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(serverId, volumeIds, instantAccess, name, description, tags, enterpriseProjectId, incremental);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotGroup {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
        sb.append("    instantAccess: ").append(toIndentedString(instantAccess)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
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

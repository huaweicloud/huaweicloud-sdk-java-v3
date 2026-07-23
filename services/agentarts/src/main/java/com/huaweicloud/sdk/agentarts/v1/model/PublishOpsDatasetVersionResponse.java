package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PublishOpsDatasetVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private Integer versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_count")

    private Integer itemCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_snapshot")

    private List<OpsSchemaInfo> schemaSnapshot = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public PublishOpsDatasetVersionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 版本的内部唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublishOpsDatasetVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 发布的版本显示名称。 **取值范围：** 自定义字符串。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PublishOpsDatasetVersionResponse withVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * **参数解释：** 系统生成的递增版本序号。 **取值范围：** 0到2147483647。
     * minimum: 0
     * maximum: 2147483647
     * @return versionNum
     */
    public Integer getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
    }

    public PublishOpsDatasetVersionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 该版本的详细备注说明。 **取值范围：** 任意字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishOpsDatasetVersionResponse withItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * **参数解释：** 该版本快照中包含的数据条目总数。 **取值范围：** 0到2147483647。
     * minimum: 0
     * maximum: 2147483647
     * @return itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public PublishOpsDatasetVersionResponse withSchemaSnapshot(List<OpsSchemaInfo> schemaSnapshot) {
        this.schemaSnapshot = schemaSnapshot;
        return this;
    }

    public PublishOpsDatasetVersionResponse addSchemaSnapshotItem(OpsSchemaInfo schemaSnapshotItem) {
        if (this.schemaSnapshot == null) {
            this.schemaSnapshot = new ArrayList<>();
        }
        this.schemaSnapshot.add(schemaSnapshotItem);
        return this;
    }

    public PublishOpsDatasetVersionResponse withSchemaSnapshot(Consumer<List<OpsSchemaInfo>> schemaSnapshotSetter) {
        if (this.schemaSnapshot == null) {
            this.schemaSnapshot = new ArrayList<>();
        }
        schemaSnapshotSetter.accept(this.schemaSnapshot);
        return this;
    }

    /**
     * **参数解释：** 发布该版本时的数据结构定义快照。 **取值范围：** OpsSchemaInfo 对象列表。
     * @return schemaSnapshot
     */
    public List<OpsSchemaInfo> getSchemaSnapshot() {
        return schemaSnapshot;
    }

    public void setSchemaSnapshot(List<OpsSchemaInfo> schemaSnapshot) {
        this.schemaSnapshot = schemaSnapshot;
    }

    public PublishOpsDatasetVersionResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 版本的正式发布时间。 **取值范围：** UTC 时间字符串。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishOpsDatasetVersionResponse that = (PublishOpsDatasetVersionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionNum, that.versionNum) && Objects.equals(this.description, that.description)
            && Objects.equals(this.itemCount, that.itemCount)
            && Objects.equals(this.schemaSnapshot, that.schemaSnapshot)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, versionNum, description, itemCount, schemaSnapshot, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishOpsDatasetVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    schemaSnapshot: ").append(toIndentedString(schemaSnapshot)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

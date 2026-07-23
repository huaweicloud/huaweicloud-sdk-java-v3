package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 提供评测集的核心属性摘要，用于列表页面的高效展示。 **取值范围：** 不涉及。 
 */
public class OpsDatasetSummary {

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
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_count")

    private Integer itemCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_uncommitted")

    private Boolean changeUncommitted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<OpsSchemaInfo> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private OpsBaseInfo baseInfo;

    public OpsDatasetSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 评测集的全局唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsDatasetSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评测集的显示名称。 **取值范围：** 中英文、数字及常见特殊字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsDatasetSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 对该评测集用途或内容的详细文字说明。 **取值范围：** 任意字符串。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpsDatasetSummary withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释：** 该评测集当前已发布的最新版本号。 **取值范围：** 版本号格式字符串（如v1.0.0）。 
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public OpsDatasetSummary withItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * **参数解释：** 评测集中包含的总记录条数。 **取值范围：** 0到2147483647。 
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

    public OpsDatasetSummary withChangeUncommitted(Boolean changeUncommitted) {
        this.changeUncommitted = changeUncommitted;
        return this;
    }

    /**
     * **参数解释：** 标识当前草稿态相对于最新发布版本是否有尚未提交的变更。 **取值范围：** - true：有未提交变更 - false：无变更 
     * @return changeUncommitted
     */
    public Boolean getChangeUncommitted() {
        return changeUncommitted;
    }

    public void setChangeUncommitted(Boolean changeUncommitted) {
        this.changeUncommitted = changeUncommitted;
    }

    public OpsDatasetSummary withSchemas(List<OpsSchemaInfo> schemas) {
        this.schemas = schemas;
        return this;
    }

    public OpsDatasetSummary addSchemasItem(OpsSchemaInfo schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public OpsDatasetSummary withSchemas(Consumer<List<OpsSchemaInfo>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释：** 定义评测集内部数据结构的Schema字段定义列表。 **取值范围：** 符合OpsSchemaInfo定义的对象列表。 
     * @return schemas
     */
    public List<OpsSchemaInfo> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<OpsSchemaInfo> schemas) {
        this.schemas = schemas;
    }

    public OpsDatasetSummary withBaseInfo(OpsBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public OpsDatasetSummary withBaseInfo(Consumer<OpsBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new OpsBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public OpsBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(OpsBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsDatasetSummary that = (OpsDatasetSummary) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.itemCount, that.itemCount)
            && Objects.equals(this.changeUncommitted, that.changeUncommitted)
            && Objects.equals(this.schemas, that.schemas) && Objects.equals(this.baseInfo, that.baseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, latestVersion, itemCount, changeUncommitted, schemas, baseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsDatasetSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    changeUncommitted: ").append(toIndentedString(changeUncommitted)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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

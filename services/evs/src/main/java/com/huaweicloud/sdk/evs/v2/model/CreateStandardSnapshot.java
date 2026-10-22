package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateStandardSnapshot
 */
public class CreateStandardSnapshot {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

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
    @JsonProperty(value = "instant_access")

    private Boolean instantAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    public CreateStandardSnapshot withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 云硬盘id。 可通过[查询所有云硬盘详情](evs_04_2006.xml)获取云硬盘ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public CreateStandardSnapshot withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照名称。 可通过[查询云硬盘快照详情列表](evs_04_2021.xml)接口获取云硬盘快照名称。 **约束限制** 不涉及。 **取值范围** 最大支持64个字符。 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateStandardSnapshot withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照描述。 **约束限制** 不涉及。 **取值范围** 最大支持85个字符。 **默认取值** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStandardSnapshot withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateStandardSnapshot putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public CreateStandardSnapshot withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 云硬盘快照的标签。 标签的key：String类型，最大长度36个字符。 由英文字母、数字、下划线、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。  标签的value：String类型，最大长度43个字符，可以为空字符串。 由英文字母、数字、下划线、点、中划线、UNICODE字符（\\u4E00-\\u9FFF）组成。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public CreateStandardSnapshot withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照的企业项目id。  关于企业项目ID的获取及企业项目特性的详细信息，请参考：\"[[企业管理用户指南](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)\"](tag:hws)[[企业管理用户指南](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/zh-cn_topic_0123692049.html)](tag:hws_hk)。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 0，表示default企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateStandardSnapshot withInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }

    /**
     * **参数解释** 是否开启极速可用功能。 **约束限制** 不涉及。 **取值范围** - true：表示开启。 - false：表示不开启。 **默认取值** 默认为false，表示不开启。
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return instantAccess;
    }

    public void setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
    }

    public CreateStandardSnapshot withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * **参数解释** 是否创建增量快照。 **约束限制** 不涉及。 **取值范围** - true：创建增量快照。 - false：创建全量快照。 **默认取值** true
     * @return incremental
     */
    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    public CreateStandardSnapshot withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释** 设置快照的保留时间，单位为天。保留时间到期后快照会被自动释放。 **约束限制** 不涉及。 **取值范围** 1~65536。 **默认取值** 空，表示快照不会被自动释放。
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStandardSnapshot that = (CreateStandardSnapshot) obj;
        return Objects.equals(this.volumeId, that.volumeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.instantAccess, that.instantAccess)
            && Objects.equals(this.incremental, that.incremental)
            && Objects.equals(this.retentionDays, that.retentionDays);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(volumeId, name, description, tags, enterpriseProjectId, instantAccess, incremental, retentionDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStandardSnapshot {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instantAccess: ").append(toIndentedString(instantAccess)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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

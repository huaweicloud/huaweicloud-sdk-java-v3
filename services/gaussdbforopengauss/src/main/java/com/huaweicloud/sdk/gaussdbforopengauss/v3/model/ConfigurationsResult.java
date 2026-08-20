package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 参数模板信息。
 */
public class ConfigurationsResult {

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
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_defined")

    private Boolean userDefined;

    public ConfigurationsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 参数模板ID。参数模板的唯一标识。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 参数模板名称。 **取值范围**: 参数模板名称在1到64个字符之间，区分大小写，可包含字母、数字、英文中划线、下划线或句点，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationsResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 参数模板描述。 **取值范围**: 描述不能超过256个字符，且不能包含回车和 ! < \" = ' > &这些特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationsResult withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**: 引擎版本。 **取值范围**: 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ConfigurationsResult withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * **参数解释**: 引擎名称。 **取值范围**: GaussDB。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ConfigurationsResult withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释**: 节点类型。 **取值范围**: - independent：独立部署。 - ha：集中式。 - combined：混合部署。
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ConfigurationsResult withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * **参数解释**: 实例类型。 **取值范围**: - Enterprise：分布式实例（企业版）。 - centralization_standard：集中式版实例。  区分大小写。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public ConfigurationsResult withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**: 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。例如：2024-07-03T14:18:55。 **取值范围**: 不涉及。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ConfigurationsResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释**: 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。例如：2024-07-03T14:18:55。 **取值范围**: 不涉及。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ConfigurationsResult withUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
        return this;
    }

    /**
     * **参数解释**: 是否是用户自定义参数模板。 **取值范围**: - false：表示为系统默认参数模板。 - true：表示为用户自定义参数模板。
     * @return userDefined
     */
    public Boolean getUserDefined() {
        return userDefined;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationsResult that = (ConfigurationsResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.datastoreName, that.datastoreName) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.haMode, that.haMode) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.userDefined, that.userDefined);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            datastoreVersion,
            datastoreName,
            nodeType,
            haMode,
            created,
            updated,
            userDefined);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

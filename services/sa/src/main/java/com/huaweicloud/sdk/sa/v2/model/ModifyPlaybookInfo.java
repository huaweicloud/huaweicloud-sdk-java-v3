package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Information of playbook
 */
public class ModifyPlaybookInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_version_id")

    private String activeVersionId;

    public ModifyPlaybookInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyPlaybookInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description, display only
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyPlaybookInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * If is enabled, false for disenabled, true for enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ModifyPlaybookInfo withActiveVersionId(String activeVersionId) {
        this.activeVersionId = activeVersionId;
        return this;
    }

    /**
     * 启用的剧本版本ID
     * @return activeVersionId
     */
    public String getActiveVersionId() {
        return activeVersionId;
    }

    public void setActiveVersionId(String activeVersionId) {
        this.activeVersionId = activeVersionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyPlaybookInfo modifyPlaybookInfo = (ModifyPlaybookInfo) o;
        return Objects.equals(this.name, modifyPlaybookInfo.name)
            && Objects.equals(this.description, modifyPlaybookInfo.description)
            && Objects.equals(this.enabled, modifyPlaybookInfo.enabled)
            && Objects.equals(this.activeVersionId, modifyPlaybookInfo.activeVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, enabled, activeVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPlaybookInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    activeVersionId: ").append(toIndentedString(activeVersionId)).append("\n");
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

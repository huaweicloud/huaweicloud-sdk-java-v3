package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ShowRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater")

    private String updater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<RuleContent> content = null;

    public ShowRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规则ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowRuleResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 规则类型。 **取值范围**： - Build：构建。 - Gate：代码检查。 - Test：测试。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowRuleResponse withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释**： 规则是否有效。 **取值范围**： true:有效，false:无效 
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public ShowRuleResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 规则版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowRuleResponse withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * **参数解释**： 扩展插件唯一ID。 **取值范围**： 不涉及。 
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public ShowRuleResponse withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件名称。 **取值范围**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ShowRuleResponse withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**： 扩展插件版本号。 **取值范围**： 不涉及。 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public ShowRuleResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**： 规则创建人。 **取值范围**： 不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowRuleResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 规则创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowRuleResponse withUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    /**
     * **参数解释**： 规则最后更新人。 **取值范围**： 不涉及。 
     * @return updater
     */
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public ShowRuleResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 规则最后更新时间。 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowRuleResponse withContent(List<RuleContent> content) {
        this.content = content;
        return this;
    }

    public ShowRuleResponse addContentItem(RuleContent contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ShowRuleResponse withContent(Consumer<List<RuleContent>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * **参数解释**： 规则详细属性。 **取值范围**： 不涉及。 
     * @return content
     */
    public List<RuleContent> getContent() {
        return content;
    }

    public void setContent(List<RuleContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRuleResponse that = (ShowRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.version, that.version) && Objects.equals(this.pluginId, that.pluginId)
            && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.pluginVersion, that.pluginVersion) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updater, that.updater)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            name,
            isValid,
            version,
            pluginId,
            pluginName,
            pluginVersion,
            creator,
            createTime,
            updater,
            updateTime,
            content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

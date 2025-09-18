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
public class ShowPipelineTemplateDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system")

    private Boolean isSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<CustomVariable> variables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_id")

    private String updaterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collect")

    private String isCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_source")

    private Boolean isShowSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    public ShowPipelineTemplateDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 模板ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowPipelineTemplateDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模板名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPipelineTemplateDetailResponse withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * **参数解释**： 模板图标。 **取值范围**： 不涉及。 
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ShowPipelineTemplateDetailResponse withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * **参数解释**： 版本。 **取值范围**： 默认3.0。 
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public ShowPipelineTemplateDetailResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**： 模板语言。 **取值范围**： - java。 - python。 - nodejs。 - go。 - net。 - cpp。 - php。 - other。 - none。 
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ShowPipelineTemplateDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模板描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPipelineTemplateDetailResponse withIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
        return this;
    }

    /**
     * **参数解释**： 是否系统模板。 **取值范围**： - true：是系统模板。 - false：不是系统模板。 
     * @return isSystem
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public ShowPipelineTemplateDetailResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 模板局点。 **取值范围**： 不涉及。 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowPipelineTemplateDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 模板所属租户ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowPipelineTemplateDetailResponse withVariables(List<CustomVariable> variables) {
        this.variables = variables;
        return this;
    }

    public ShowPipelineTemplateDetailResponse addVariablesItem(CustomVariable variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public ShowPipelineTemplateDetailResponse withVariables(Consumer<List<CustomVariable>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 自定义参数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return variables
     */
    public List<CustomVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<CustomVariable> variables) {
        this.variables = variables;
    }

    public ShowPipelineTemplateDetailResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 模板创建人ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowPipelineTemplateDetailResponse withUpdaterId(String updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
     * **参数解释**： 模板更新人ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return updaterId
     */
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public ShowPipelineTemplateDetailResponse withIsCollect(String isCollect) {
        this.isCollect = isCollect;
        return this;
    }

    /**
     * **参数解释**： 是否收藏。 **取值范围**： - true：收藏。 - false：不收藏。 
     * @return isCollect
     */
    public String getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(String isCollect) {
        this.isCollect = isCollect;
    }

    public ShowPipelineTemplateDetailResponse withIsShowSource(Boolean isShowSource) {
        this.isShowSource = isShowSource;
        return this;
    }

    /**
     * **参数解释**： 是否展示流水线源。 **取值范围**： - true：展示流水线源。 - false：不展示流水线源。 
     * @return isShowSource
     */
    public Boolean getIsShowSource() {
        return isShowSource;
    }

    public void setIsShowSource(Boolean isShowSource) {
        this.isShowSource = isShowSource;
    }

    public ShowPipelineTemplateDetailResponse withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * **参数解释**： 模板编排json，包含stages。 **取值范围**： 不涉及。 
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPipelineTemplateDetailResponse that = (ShowPipelineTemplateDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.icon, that.icon) && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.language, that.language) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isSystem, that.isSystem) && Objects.equals(this.region, that.region)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.updaterId, that.updaterId)
            && Objects.equals(this.isCollect, that.isCollect) && Objects.equals(this.isShowSource, that.isShowSource)
            && Objects.equals(this.definition, that.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            icon,
            manifestVersion,
            language,
            description,
            isSystem,
            region,
            domainId,
            variables,
            creatorId,
            updaterId,
            isCollect,
            isShowSource,
            definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineTemplateDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    isCollect: ").append(toIndentedString(isCollect)).append("\n");
        sb.append("    isShowSource: ").append(toIndentedString(isShowSource)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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

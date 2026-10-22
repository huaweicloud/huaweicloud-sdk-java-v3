package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateBotMTenantPolicyRequestBody
 */
public class UpdateBotMTenantPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_tag")

    private UserTagDTO userTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_annotations")

    private List<ScenarioAnnotationDTO> scenarioAnnotations = null;

    public UpdateBotMTenantPolicyRequestBody withUserTag(UserTagDTO userTag) {
        this.userTag = userTag;
        return this;
    }

    public UpdateBotMTenantPolicyRequestBody withUserTag(Consumer<UserTagDTO> userTagSetter) {
        if (this.userTag == null) {
            this.userTag = new UserTagDTO();
            userTagSetter.accept(this.userTag);
        }

        return this;
    }

    /**
     * Get userTag
     * @return userTag
     */
    public UserTagDTO getUserTag() {
        return userTag;
    }

    public void setUserTag(UserTagDTO userTag) {
        this.userTag = userTag;
    }

    public UpdateBotMTenantPolicyRequestBody withScenarioAnnotations(List<ScenarioAnnotationDTO> scenarioAnnotations) {
        this.scenarioAnnotations = scenarioAnnotations;
        return this;
    }

    public UpdateBotMTenantPolicyRequestBody addScenarioAnnotationsItem(ScenarioAnnotationDTO scenarioAnnotationsItem) {
        if (this.scenarioAnnotations == null) {
            this.scenarioAnnotations = new ArrayList<>();
        }
        this.scenarioAnnotations.add(scenarioAnnotationsItem);
        return this;
    }

    public UpdateBotMTenantPolicyRequestBody withScenarioAnnotations(
        Consumer<List<ScenarioAnnotationDTO>> scenarioAnnotationsSetter) {
        if (this.scenarioAnnotations == null) {
            this.scenarioAnnotations = new ArrayList<>();
        }
        scenarioAnnotationsSetter.accept(this.scenarioAnnotations);
        return this;
    }

    /**
     * 场景标注（登录/注册场景接口的语义标注列表）
     * @return scenarioAnnotations
     */
    public List<ScenarioAnnotationDTO> getScenarioAnnotations() {
        return scenarioAnnotations;
    }

    public void setScenarioAnnotations(List<ScenarioAnnotationDTO> scenarioAnnotations) {
        this.scenarioAnnotations = scenarioAnnotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBotMTenantPolicyRequestBody that = (UpdateBotMTenantPolicyRequestBody) obj;
        return Objects.equals(this.userTag, that.userTag)
            && Objects.equals(this.scenarioAnnotations, that.scenarioAnnotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTag, scenarioAnnotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBotMTenantPolicyRequestBody {\n");
        sb.append("    userTag: ").append(toIndentedString(userTag)).append("\n");
        sb.append("    scenarioAnnotations: ").append(toIndentedString(scenarioAnnotations)).append("\n");
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

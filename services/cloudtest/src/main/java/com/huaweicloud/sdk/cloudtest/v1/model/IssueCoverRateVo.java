package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 看板项目的需求覆盖率
 */
public class IssueCoverRateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epic")

    private CoverRateVo epic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private CoverRateVo feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "story")

    private CoverRateVo story;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private CoverRateVo summary;

    public IssueCoverRateVo withEpic(CoverRateVo epic) {
        this.epic = epic;
        return this;
    }

    public IssueCoverRateVo withEpic(Consumer<CoverRateVo> epicSetter) {
        if (this.epic == null) {
            this.epic = new CoverRateVo();
            epicSetter.accept(this.epic);
        }

        return this;
    }

    /**
     * Get epic
     * @return epic
     */
    public CoverRateVo getEpic() {
        return epic;
    }

    public void setEpic(CoverRateVo epic) {
        this.epic = epic;
    }

    public IssueCoverRateVo withFeature(CoverRateVo feature) {
        this.feature = feature;
        return this;
    }

    public IssueCoverRateVo withFeature(Consumer<CoverRateVo> featureSetter) {
        if (this.feature == null) {
            this.feature = new CoverRateVo();
            featureSetter.accept(this.feature);
        }

        return this;
    }

    /**
     * Get feature
     * @return feature
     */
    public CoverRateVo getFeature() {
        return feature;
    }

    public void setFeature(CoverRateVo feature) {
        this.feature = feature;
    }

    public IssueCoverRateVo withStory(CoverRateVo story) {
        this.story = story;
        return this;
    }

    public IssueCoverRateVo withStory(Consumer<CoverRateVo> storySetter) {
        if (this.story == null) {
            this.story = new CoverRateVo();
            storySetter.accept(this.story);
        }

        return this;
    }

    /**
     * Get story
     * @return story
     */
    public CoverRateVo getStory() {
        return story;
    }

    public void setStory(CoverRateVo story) {
        this.story = story;
    }

    public IssueCoverRateVo withSummary(CoverRateVo summary) {
        this.summary = summary;
        return this;
    }

    public IssueCoverRateVo withSummary(Consumer<CoverRateVo> summarySetter) {
        if (this.summary == null) {
            this.summary = new CoverRateVo();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public CoverRateVo getSummary() {
        return summary;
    }

    public void setSummary(CoverRateVo summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueCoverRateVo that = (IssueCoverRateVo) obj;
        return Objects.equals(this.epic, that.epic) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.story, that.story) && Objects.equals(this.summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epic, feature, story, summary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCoverRateVo {\n");
        sb.append("    epic: ").append(toIndentedString(epic)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    story: ").append(toIndentedString(story)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

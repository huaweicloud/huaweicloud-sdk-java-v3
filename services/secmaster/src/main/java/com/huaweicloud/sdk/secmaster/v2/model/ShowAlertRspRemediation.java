package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 补救措施
 */
public class ShowAlertRspRemediation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommendation")

    private String recommendation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ShowAlertRspRemediation withRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    /**
     * The name, display only
     * @return recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public ShowAlertRspRemediation withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * The name, display only
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlertRspRemediation showAlertRspRemediation = (ShowAlertRspRemediation) o;
        return Objects.equals(this.recommendation, showAlertRspRemediation.recommendation)
            && Objects.equals(this.url, showAlertRspRemediation.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendation, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRspRemediation {\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

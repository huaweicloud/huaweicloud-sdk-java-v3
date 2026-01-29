package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCollectConfigResponseBodySourceList
 */
public class ListCollectConfigResponseBodySourceList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_display")

    private String csvcDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_hzzelp")

    private String csvcHzzelp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_display")

    private String sourceDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_help")

    private String sourceHelp;

    public ListCollectConfigResponseBodySourceList withCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
        return this;
    }

    /**
     * 云产品名称
     * @return csvcDisplay
     */
    public String getCsvcDisplay() {
        return csvcDisplay;
    }

    public void setCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
    }

    public ListCollectConfigResponseBodySourceList withCsvcHzzelp(String csvcHzzelp) {
        this.csvcHzzelp = csvcHzzelp;
        return this;
    }

    /**
     * 云产品描述
     * @return csvcHzzelp
     */
    public String getCsvcHzzelp() {
        return csvcHzzelp;
    }

    public void setCsvcHzzelp(String csvcHzzelp) {
        this.csvcHzzelp = csvcHzzelp;
    }

    public ListCollectConfigResponseBodySourceList withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ListCollectConfigResponseBodySourceList withSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
        return this;
    }

    /**
     * 日志名称
     * @return sourceDisplay
     */
    public String getSourceDisplay() {
        return sourceDisplay;
    }

    public void setSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
    }

    public ListCollectConfigResponseBodySourceList withSourceHelp(String sourceHelp) {
        this.sourceHelp = sourceHelp;
        return this;
    }

    /**
     * 日志描述
     * @return sourceHelp
     */
    public String getSourceHelp() {
        return sourceHelp;
    }

    public void setSourceHelp(String sourceHelp) {
        this.sourceHelp = sourceHelp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodySourceList that = (ListCollectConfigResponseBodySourceList) obj;
        return Objects.equals(this.csvcDisplay, that.csvcDisplay) && Objects.equals(this.csvcHzzelp, that.csvcHzzelp)
            && Objects.equals(this.link, that.link) && Objects.equals(this.sourceDisplay, that.sourceDisplay)
            && Objects.equals(this.sourceHelp, that.sourceHelp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csvcDisplay, csvcHzzelp, link, sourceDisplay, sourceHelp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodySourceList {\n");
        sb.append("    csvcDisplay: ").append(toIndentedString(csvcDisplay)).append("\n");
        sb.append("    csvcHzzelp: ").append(toIndentedString(csvcHzzelp)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    sourceDisplay: ").append(toIndentedString(sourceDisplay)).append("\n");
        sb.append("    sourceHelp: ").append(toIndentedString(sourceHelp)).append("\n");
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

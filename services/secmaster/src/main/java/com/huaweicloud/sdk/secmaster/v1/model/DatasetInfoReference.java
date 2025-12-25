package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据源名称
 */
public class DatasetInfoReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_display")

    private String csvcDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_display")

    private String sourceDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_help")

    private String csvcHelp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_help")

    private String sourceHelp;

    public DatasetInfoReference withCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
        return this;
    }

    /**
     * 云服务描述
     * @return csvcDisplay
     */
    public String getCsvcDisplay() {
        return csvcDisplay;
    }

    public void setCsvcDisplay(String csvcDisplay) {
        this.csvcDisplay = csvcDisplay;
    }

    public DatasetInfoReference withSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
        return this;
    }

    /**
     * 数据源描述
     * @return sourceDisplay
     */
    public String getSourceDisplay() {
        return sourceDisplay;
    }

    public void setSourceDisplay(String sourceDisplay) {
        this.sourceDisplay = sourceDisplay;
    }

    public DatasetInfoReference withLink(String link) {
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

    public DatasetInfoReference withCsvcHelp(String csvcHelp) {
        this.csvcHelp = csvcHelp;
        return this;
    }

    /**
     * 云服务帮助说明
     * @return csvcHelp
     */
    public String getCsvcHelp() {
        return csvcHelp;
    }

    public void setCsvcHelp(String csvcHelp) {
        this.csvcHelp = csvcHelp;
    }

    public DatasetInfoReference withSourceHelp(String sourceHelp) {
        this.sourceHelp = sourceHelp;
        return this;
    }

    /**
     * 数据源帮助说明
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
        DatasetInfoReference that = (DatasetInfoReference) obj;
        return Objects.equals(this.csvcDisplay, that.csvcDisplay)
            && Objects.equals(this.sourceDisplay, that.sourceDisplay) && Objects.equals(this.link, that.link)
            && Objects.equals(this.csvcHelp, that.csvcHelp) && Objects.equals(this.sourceHelp, that.sourceHelp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csvcDisplay, sourceDisplay, link, csvcHelp, sourceHelp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetInfoReference {\n");
        sb.append("    csvcDisplay: ").append(toIndentedString(csvcDisplay)).append("\n");
        sb.append("    sourceDisplay: ").append(toIndentedString(sourceDisplay)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    csvcHelp: ").append(toIndentedString(csvcHelp)).append("\n");
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

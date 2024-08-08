package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 靶点口袋分子优化片段
 */
public class PocketFragment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private DrugFileSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edited")

    private EditedLigand edited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_sites")

    private LabelSite labelSites;

    public PocketFragment withSource(DrugFileSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public DrugFileSource getSource() {
        return source;
    }

    public void setSource(DrugFileSource source) {
        this.source = source;
    }

    public PocketFragment withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件URL，当数据源为外部网络数据时为https地址；用户私有数据中心为项目路径、公共数据场景为obs地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PocketFragment withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 文件格式，支持PDB、SDF、MOL2、SMI，仅数据源为RAW时提供
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public PocketFragment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 原始配体名称，仅RAW类型时用于配体名称标识
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PocketFragment withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 文件原始数据，仅数据源为RAW时提供
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PocketFragment withEdited(EditedLigand edited) {
        this.edited = edited;
        return this;
    }

    public PocketFragment withEdited(Consumer<EditedLigand> editedSetter) {
        if (this.edited == null) {
            this.edited = new EditedLigand();
            editedSetter.accept(this.edited);
        }

        return this;
    }

    /**
     * Get edited
     * @return edited
     */
    public EditedLigand getEdited() {
        return edited;
    }

    public void setEdited(EditedLigand edited) {
        this.edited = edited;
    }

    public PocketFragment withLabelSites(LabelSite labelSites) {
        this.labelSites = labelSites;
        return this;
    }

    public PocketFragment withLabelSites(Consumer<LabelSite> labelSitesSetter) {
        if (this.labelSites == null) {
            this.labelSites = new LabelSite();
            labelSitesSetter.accept(this.labelSites);
        }

        return this;
    }

    /**
     * Get labelSites
     * @return labelSites
     */
    public LabelSite getLabelSites() {
        return labelSites;
    }

    public void setLabelSites(LabelSite labelSites) {
        this.labelSites = labelSites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PocketFragment that = (PocketFragment) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.format, that.format) && Objects.equals(this.name, that.name)
            && Objects.equals(this.data, that.data) && Objects.equals(this.edited, that.edited)
            && Objects.equals(this.labelSites, that.labelSites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, format, name, data, edited, labelSites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PocketFragment {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
        sb.append("    labelSites: ").append(toIndentedString(labelSites)).append("\n");
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

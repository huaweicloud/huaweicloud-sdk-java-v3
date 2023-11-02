package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型数据文件
 */
public class ModelFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private ModelFileSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    public ModelFile withSource(ModelFileSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public ModelFileSource getSource() {
        return source;
    }

    public void setSource(ModelFileSource source) {
        this.source = source;
    }

    public ModelFile withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件URL，用户私有数据中心为项目路径、公共数据场景为obs地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ModelFile withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 模型文件所在项目id，仅文件为数据中心时填写
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelFile that = (ModelFile) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, eihealthProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelFile {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
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

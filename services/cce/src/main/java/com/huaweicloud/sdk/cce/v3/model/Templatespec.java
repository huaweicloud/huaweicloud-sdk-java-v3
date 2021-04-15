package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Versions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 插件模板详细信息
 */
public class Templatespec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private List<String> labels = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logoURL")
    
    private String logoURL;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readmeURL")
    
    private String readmeURL;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="require")
    
    private Boolean require;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="versions")
    
    private List<Versions> versions = null;
    
    public Templatespec withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Templatespec withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    
    public Templatespec addLabelsItem(String labelsItem) {
        if(this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public Templatespec withLabels(Consumer<List<String>> labelsSetter) {
        if(this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 模板所属分组
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    

    public Templatespec withLogoURL(String logoURL) {
        this.logoURL = logoURL;
        return this;
    }

    


    /**
     * Logo图片地址
     * @return logoURL
     */
    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    

    public Templatespec withReadmeURL(String readmeURL) {
        this.readmeURL = readmeURL;
        return this;
    }

    


    /**
     * 插件详情描述及使用说明
     * @return readmeURL
     */
    public String getReadmeURL() {
        return readmeURL;
    }

    public void setReadmeURL(String readmeURL) {
        this.readmeURL = readmeURL;
    }

    

    public Templatespec withRequire(Boolean require) {
        this.require = require;
        return this;
    }

    


    /**
     * 是否为必安装插件
     * @return require
     */
    public Boolean getRequire() {
        return require;
    }

    public void setRequire(Boolean require) {
        this.require = require;
    }

    

    public Templatespec withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 模板类型（helm，static）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Templatespec withVersions(List<Versions> versions) {
        this.versions = versions;
        return this;
    }

    
    public Templatespec addVersionsItem(Versions versionsItem) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public Templatespec withVersions(Consumer<List<Versions>> versionsSetter) {
        if(this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 模板具体版本详情
     * @return versions
     */
    public List<Versions> getVersions() {
        return versions;
    }

    public void setVersions(List<Versions> versions) {
        this.versions = versions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Templatespec templatespec = (Templatespec) o;
        return Objects.equals(this.description, templatespec.description) &&
            Objects.equals(this.labels, templatespec.labels) &&
            Objects.equals(this.logoURL, templatespec.logoURL) &&
            Objects.equals(this.readmeURL, templatespec.readmeURL) &&
            Objects.equals(this.require, templatespec.require) &&
            Objects.equals(this.type, templatespec.type) &&
            Objects.equals(this.versions, templatespec.versions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, labels, logoURL, readmeURL, require, type, versions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Templatespec {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
        sb.append("    readmeURL: ").append(toIndentedString(readmeURL)).append("\n");
        sb.append("    require: ").append(toIndentedString(require)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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


package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件版本相关信息
 */
public class AddonVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Map<String, Object> input = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stable")

    private Boolean stable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "translate")

    private Map<String, Object> translate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportVersions")

    private List<SupportVersion> supportVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    public AddonVersion withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件包版本id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddonVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 插件版本信息
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AddonVersion withInput(Map<String, Object> input) {
        this.input = input;
        return this;
    }

    public AddonVersion putInputItem(String key, Object inputItem) {
        if (this.input == null) {
            this.input = new HashMap<>();
        }
        this.input.put(key, inputItem);
        return this;
    }

    public AddonVersion withInput(Consumer<Map<String, Object>> inputSetter) {
        if (this.input == null) {
            this.input = new HashMap<>();
        }
        inputSetter.accept(this.input);
        return this;
    }

    /**
     * 输入
     * @return input
     */
    public Map<String, Object> getInput() {
        return input;
    }

    public void setInput(Map<String, Object> input) {
        this.input = input;
    }

    public AddonVersion withStable(Boolean stable) {
        this.stable = stable;
        return this;
    }

    /**
     * 是否为稳定版本
     * @return stable
     */
    public Boolean getStable() {
        return stable;
    }

    public void setStable(Boolean stable) {
        this.stable = stable;
    }

    public AddonVersion withTranslate(Map<String, Object> translate) {
        this.translate = translate;
        return this;
    }

    public AddonVersion putTranslateItem(String key, Object translateItem) {
        if (this.translate == null) {
            this.translate = new HashMap<>();
        }
        this.translate.put(key, translateItem);
        return this;
    }

    public AddonVersion withTranslate(Consumer<Map<String, Object>> translateSetter) {
        if (this.translate == null) {
            this.translate = new HashMap<>();
        }
        translateSetter.accept(this.translate);
        return this;
    }

    /**
     * 供界面使用的翻译信息
     * @return translate
     */
    public Map<String, Object> getTranslate() {
        return translate;
    }

    public void setTranslate(Map<String, Object> translate) {
        this.translate = translate;
    }

    public AddonVersion withSupportVersions(List<SupportVersion> supportVersions) {
        this.supportVersions = supportVersions;
        return this;
    }

    public AddonVersion addSupportVersionsItem(SupportVersion supportVersionsItem) {
        if (this.supportVersions == null) {
            this.supportVersions = new ArrayList<>();
        }
        this.supportVersions.add(supportVersionsItem);
        return this;
    }

    public AddonVersion withSupportVersions(Consumer<List<SupportVersion>> supportVersionsSetter) {
        if (this.supportVersions == null) {
            this.supportVersions = new ArrayList<>();
        }
        supportVersionsSetter.accept(this.supportVersions);
        return this;
    }

    /**
     * 支持的集群类型和和支持的集群版本信息
     * @return supportVersions
     */
    public List<SupportVersion> getSupportVersions() {
        return supportVersions;
    }

    public void setSupportVersions(List<SupportVersion> supportVersions) {
        this.supportVersions = supportVersions;
    }

    public AddonVersion withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 记录创建时间
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public AddonVersion withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 记录更新时间
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonVersion that = (AddonVersion) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.input, that.input) && Objects.equals(this.stable, that.stable)
            && Objects.equals(this.translate, that.translate)
            && Objects.equals(this.supportVersions, that.supportVersions)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, input, stable, translate, supportVersions, creationTimestamp, updateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonVersion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    stable: ").append(toIndentedString(stable)).append("\n");
        sb.append("    translate: ").append(toIndentedString(translate)).append("\n");
        sb.append("    supportVersions: ").append(toIndentedString(supportVersions)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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

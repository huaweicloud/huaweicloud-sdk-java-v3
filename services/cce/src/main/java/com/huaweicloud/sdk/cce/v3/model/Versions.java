package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 具体插件版本信息。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class Versions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Object input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stable")

    private Boolean stable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "translate")

    private Object translate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportVersions")

    private List<SupportVersions> supportVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private LocalDate creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private LocalDate updateTimestamp;

    public Versions withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件版本号。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Versions withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * **参数解释**： 插件安装参数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return input
     */
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    public Versions withStable(Boolean stable) {
        this.stable = stable;
        return this;
    }

    /**
     * **参数解释**： 是否为稳定版本。 **约束限制**： 不涉及 **取值范围**： - true：稳定版本 - false：非稳定版本  **默认取值**： 不涉及
     * @return stable
     */
    public Boolean getStable() {
        return stable;
    }

    public void setStable(Boolean stable) {
        this.stable = stable;
    }

    public Versions withTranslate(Object translate) {
        this.translate = translate;
        return this;
    }

    /**
     * **参数解释**： 供界面使用的翻译信息。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return translate
     */
    public Object getTranslate() {
        return translate;
    }

    public void setTranslate(Object translate) {
        this.translate = translate;
    }

    public Versions withSupportVersions(List<SupportVersions> supportVersions) {
        this.supportVersions = supportVersions;
        return this;
    }

    public Versions addSupportVersionsItem(SupportVersions supportVersionsItem) {
        if (this.supportVersions == null) {
            this.supportVersions = new ArrayList<>();
        }
        this.supportVersions.add(supportVersionsItem);
        return this;
    }

    public Versions withSupportVersions(Consumer<List<SupportVersions>> supportVersionsSetter) {
        if (this.supportVersions == null) {
            this.supportVersions = new ArrayList<>();
        }
        supportVersionsSetter.accept(this.supportVersions);
        return this;
    }

    /**
     * **参数解释**： 支持集群版本号。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return supportVersions
     */
    public List<SupportVersions> getSupportVersions() {
        return supportVersions;
    }

    public void setSupportVersions(List<SupportVersions> supportVersions) {
        this.supportVersions = supportVersions;
    }

    public Versions withCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return creationTimestamp
     */
    public LocalDate getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Versions withUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释**： 更新时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return updateTimestamp
     */
    public LocalDate getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDate updateTimestamp) {
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
        Versions that = (Versions) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.input, that.input)
            && Objects.equals(this.stable, that.stable) && Objects.equals(this.translate, that.translate)
            && Objects.equals(this.supportVersions, that.supportVersions)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, input, stable, translate, supportVersions, creationTimestamp, updateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Versions {\n");
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

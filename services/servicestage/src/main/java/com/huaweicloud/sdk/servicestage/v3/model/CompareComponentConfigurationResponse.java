package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CompareComponentConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_envs")

    private List<ComponentConfigEnvs> addEnvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_envs")

    private List<ComponentConfigEnvs> removeEnvs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_envs")

    private List<ComponentConfigCompareResultModifyEnvs> modifyEnvs = null;

    public CompareComponentConfigurationResponse withAddEnvs(List<ComponentConfigEnvs> addEnvs) {
        this.addEnvs = addEnvs;
        return this;
    }

    public CompareComponentConfigurationResponse addAddEnvsItem(ComponentConfigEnvs addEnvsItem) {
        if (this.addEnvs == null) {
            this.addEnvs = new ArrayList<>();
        }
        this.addEnvs.add(addEnvsItem);
        return this;
    }

    public CompareComponentConfigurationResponse withAddEnvs(Consumer<List<ComponentConfigEnvs>> addEnvsSetter) {
        if (this.addEnvs == null) {
            this.addEnvs = new ArrayList<>();
        }
        addEnvsSetter.accept(this.addEnvs);
        return this;
    }

    /**
     * Get addEnvs
     * @return addEnvs
     */
    public List<ComponentConfigEnvs> getAddEnvs() {
        return addEnvs;
    }

    public void setAddEnvs(List<ComponentConfigEnvs> addEnvs) {
        this.addEnvs = addEnvs;
    }

    public CompareComponentConfigurationResponse withRemoveEnvs(List<ComponentConfigEnvs> removeEnvs) {
        this.removeEnvs = removeEnvs;
        return this;
    }

    public CompareComponentConfigurationResponse addRemoveEnvsItem(ComponentConfigEnvs removeEnvsItem) {
        if (this.removeEnvs == null) {
            this.removeEnvs = new ArrayList<>();
        }
        this.removeEnvs.add(removeEnvsItem);
        return this;
    }

    public CompareComponentConfigurationResponse withRemoveEnvs(Consumer<List<ComponentConfigEnvs>> removeEnvsSetter) {
        if (this.removeEnvs == null) {
            this.removeEnvs = new ArrayList<>();
        }
        removeEnvsSetter.accept(this.removeEnvs);
        return this;
    }

    /**
     * Get removeEnvs
     * @return removeEnvs
     */
    public List<ComponentConfigEnvs> getRemoveEnvs() {
        return removeEnvs;
    }

    public void setRemoveEnvs(List<ComponentConfigEnvs> removeEnvs) {
        this.removeEnvs = removeEnvs;
    }

    public CompareComponentConfigurationResponse withModifyEnvs(
        List<ComponentConfigCompareResultModifyEnvs> modifyEnvs) {
        this.modifyEnvs = modifyEnvs;
        return this;
    }

    public CompareComponentConfigurationResponse addModifyEnvsItem(
        ComponentConfigCompareResultModifyEnvs modifyEnvsItem) {
        if (this.modifyEnvs == null) {
            this.modifyEnvs = new ArrayList<>();
        }
        this.modifyEnvs.add(modifyEnvsItem);
        return this;
    }

    public CompareComponentConfigurationResponse withModifyEnvs(
        Consumer<List<ComponentConfigCompareResultModifyEnvs>> modifyEnvsSetter) {
        if (this.modifyEnvs == null) {
            this.modifyEnvs = new ArrayList<>();
        }
        modifyEnvsSetter.accept(this.modifyEnvs);
        return this;
    }

    /**
     * Get modifyEnvs
     * @return modifyEnvs
     */
    public List<ComponentConfigCompareResultModifyEnvs> getModifyEnvs() {
        return modifyEnvs;
    }

    public void setModifyEnvs(List<ComponentConfigCompareResultModifyEnvs> modifyEnvs) {
        this.modifyEnvs = modifyEnvs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareComponentConfigurationResponse that = (CompareComponentConfigurationResponse) obj;
        return Objects.equals(this.addEnvs, that.addEnvs) && Objects.equals(this.removeEnvs, that.removeEnvs)
            && Objects.equals(this.modifyEnvs, that.modifyEnvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addEnvs, removeEnvs, modifyEnvs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareComponentConfigurationResponse {\n");
        sb.append("    addEnvs: ").append(toIndentedString(addEnvs)).append("\n");
        sb.append("    removeEnvs: ").append(toIndentedString(removeEnvs)).append("\n");
        sb.append("    modifyEnvs: ").append(toIndentedString(modifyEnvs)).append("\n");
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

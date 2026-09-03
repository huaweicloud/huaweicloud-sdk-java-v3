package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Update security policy control request.
 */
public class UpdateSecurityPolicyControlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_instances")

    private List<String> enabledInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_tags")

    private List<String> enabledTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_instances")

    private List<String> disabledInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_tags")

    private List<String> disabledTags = null;

    public UpdateSecurityPolicyControlReq withEnabledInstances(List<String> enabledInstances) {
        this.enabledInstances = enabledInstances;
        return this;
    }

    public UpdateSecurityPolicyControlReq addEnabledInstancesItem(String enabledInstancesItem) {
        if (this.enabledInstances == null) {
            this.enabledInstances = new ArrayList<>();
        }
        this.enabledInstances.add(enabledInstancesItem);
        return this;
    }

    public UpdateSecurityPolicyControlReq withEnabledInstances(Consumer<List<String>> enabledInstancesSetter) {
        if (this.enabledInstances == null) {
            this.enabledInstances = new ArrayList<>();
        }
        enabledInstancesSetter.accept(this.enabledInstances);
        return this;
    }

    /**
     * 需要开启安全策略管控的实例 ID 列表。
     * @return enabledInstances
     */
    public List<String> getEnabledInstances() {
        return enabledInstances;
    }

    public void setEnabledInstances(List<String> enabledInstances) {
        this.enabledInstances = enabledInstances;
    }

    public UpdateSecurityPolicyControlReq withEnabledTags(List<String> enabledTags) {
        this.enabledTags = enabledTags;
        return this;
    }

    public UpdateSecurityPolicyControlReq addEnabledTagsItem(String enabledTagsItem) {
        if (this.enabledTags == null) {
            this.enabledTags = new ArrayList<>();
        }
        this.enabledTags.add(enabledTagsItem);
        return this;
    }

    public UpdateSecurityPolicyControlReq withEnabledTags(Consumer<List<String>> enabledTagsSetter) {
        if (this.enabledTags == null) {
            this.enabledTags = new ArrayList<>();
        }
        enabledTagsSetter.accept(this.enabledTags);
        return this;
    }

    /**
     * 需要开启安全策略管控的标签列表，格式为 key:value。
     * @return enabledTags
     */
    public List<String> getEnabledTags() {
        return enabledTags;
    }

    public void setEnabledTags(List<String> enabledTags) {
        this.enabledTags = enabledTags;
    }

    public UpdateSecurityPolicyControlReq withDisabledInstances(List<String> disabledInstances) {
        this.disabledInstances = disabledInstances;
        return this;
    }

    public UpdateSecurityPolicyControlReq addDisabledInstancesItem(String disabledInstancesItem) {
        if (this.disabledInstances == null) {
            this.disabledInstances = new ArrayList<>();
        }
        this.disabledInstances.add(disabledInstancesItem);
        return this;
    }

    public UpdateSecurityPolicyControlReq withDisabledInstances(Consumer<List<String>> disabledInstancesSetter) {
        if (this.disabledInstances == null) {
            this.disabledInstances = new ArrayList<>();
        }
        disabledInstancesSetter.accept(this.disabledInstances);
        return this;
    }

    /**
     * 需要关闭安全策略管控的实例 ID 列表。
     * @return disabledInstances
     */
    public List<String> getDisabledInstances() {
        return disabledInstances;
    }

    public void setDisabledInstances(List<String> disabledInstances) {
        this.disabledInstances = disabledInstances;
    }

    public UpdateSecurityPolicyControlReq withDisabledTags(List<String> disabledTags) {
        this.disabledTags = disabledTags;
        return this;
    }

    public UpdateSecurityPolicyControlReq addDisabledTagsItem(String disabledTagsItem) {
        if (this.disabledTags == null) {
            this.disabledTags = new ArrayList<>();
        }
        this.disabledTags.add(disabledTagsItem);
        return this;
    }

    public UpdateSecurityPolicyControlReq withDisabledTags(Consumer<List<String>> disabledTagsSetter) {
        if (this.disabledTags == null) {
            this.disabledTags = new ArrayList<>();
        }
        disabledTagsSetter.accept(this.disabledTags);
        return this;
    }

    /**
     * 需要关闭安全策略管控的标签列表，格式为 key:value。
     * @return disabledTags
     */
    public List<String> getDisabledTags() {
        return disabledTags;
    }

    public void setDisabledTags(List<String> disabledTags) {
        this.disabledTags = disabledTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityPolicyControlReq that = (UpdateSecurityPolicyControlReq) obj;
        return Objects.equals(this.enabledInstances, that.enabledInstances)
            && Objects.equals(this.enabledTags, that.enabledTags)
            && Objects.equals(this.disabledInstances, that.disabledInstances)
            && Objects.equals(this.disabledTags, that.disabledTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledInstances, enabledTags, disabledInstances, disabledTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPolicyControlReq {\n");
        sb.append("    enabledInstances: ").append(toIndentedString(enabledInstances)).append("\n");
        sb.append("    enabledTags: ").append(toIndentedString(enabledTags)).append("\n");
        sb.append("    disabledInstances: ").append(toIndentedString(disabledInstances)).append("\n");
        sb.append("    disabledTags: ").append(toIndentedString(disabledTags)).append("\n");
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

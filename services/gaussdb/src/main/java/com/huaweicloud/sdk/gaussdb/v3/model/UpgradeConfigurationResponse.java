package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class UpgradeConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_parameters")

    private List<GroupParameterDiffInfo> diffParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_parameter_names")

    private List<String> skippedParameterNames = null;

    public UpgradeConfigurationResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  参数模板名称。  **取值范围**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpgradeConfigurationResponse withDiffParameters(List<GroupParameterDiffInfo> diffParameters) {
        this.diffParameters = diffParameters;
        return this;
    }

    public UpgradeConfigurationResponse addDiffParametersItem(GroupParameterDiffInfo diffParametersItem) {
        if (this.diffParameters == null) {
            this.diffParameters = new ArrayList<>();
        }
        this.diffParameters.add(diffParametersItem);
        return this;
    }

    public UpgradeConfigurationResponse withDiffParameters(
        Consumer<List<GroupParameterDiffInfo>> diffParametersSetter) {
        if (this.diffParameters == null) {
            this.diffParameters = new ArrayList<>();
        }
        diffParametersSetter.accept(this.diffParameters);
        return this;
    }

    /**
     * **参数解释**：  差异参数列表。
     * @return diffParameters
     */
    public List<GroupParameterDiffInfo> getDiffParameters() {
        return diffParameters;
    }

    public void setDiffParameters(List<GroupParameterDiffInfo> diffParameters) {
        this.diffParameters = diffParameters;
    }

    public UpgradeConfigurationResponse withSkippedParameterNames(List<String> skippedParameterNames) {
        this.skippedParameterNames = skippedParameterNames;
        return this;
    }

    public UpgradeConfigurationResponse addSkippedParameterNamesItem(String skippedParameterNamesItem) {
        if (this.skippedParameterNames == null) {
            this.skippedParameterNames = new ArrayList<>();
        }
        this.skippedParameterNames.add(skippedParameterNamesItem);
        return this;
    }

    public UpgradeConfigurationResponse withSkippedParameterNames(Consumer<List<String>> skippedParameterNamesSetter) {
        if (this.skippedParameterNames == null) {
            this.skippedParameterNames = new ArrayList<>();
        }
        skippedParameterNamesSetter.accept(this.skippedParameterNames);
        return this;
    }

    /**
     * **参数解释**：  执行更新操作被跳过的参数名称列表（原值与目标值相同）。
     * @return skippedParameterNames
     */
    public List<String> getSkippedParameterNames() {
        return skippedParameterNames;
    }

    public void setSkippedParameterNames(List<String> skippedParameterNames) {
        this.skippedParameterNames = skippedParameterNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeConfigurationResponse that = (UpgradeConfigurationResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.diffParameters, that.diffParameters)
            && Objects.equals(this.skippedParameterNames, that.skippedParameterNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, diffParameters, skippedParameterNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeConfigurationResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    diffParameters: ").append(toIndentedString(diffParameters)).append("\n");
        sb.append("    skippedParameterNames: ").append(toIndentedString(skippedParameterNames)).append("\n");
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

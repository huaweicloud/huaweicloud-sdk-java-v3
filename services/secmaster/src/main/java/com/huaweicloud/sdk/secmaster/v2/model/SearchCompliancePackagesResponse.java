package com.huaweicloud.sdk.secmaster.v2.model;

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
public class SearchCompliancePackagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_compliance_num")

    private Integer builtinComplianceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customized_compliance_num")

    private Integer customizedComplianceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_compliance_num")

    private Integer disabledComplianceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_compliance_num")

    private Integer enabledComplianceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_packages")

    private List<CompliancePackageModel> compliancePackages = null;

    public SearchCompliancePackagesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 遵从包总数
     * minimum: 0
     * maximum: 10000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SearchCompliancePackagesResponse withBuiltinComplianceNum(Integer builtinComplianceNum) {
        this.builtinComplianceNum = builtinComplianceNum;
        return this;
    }

    /**
     * 内置遵从包数量
     * minimum: 0
     * maximum: 10000
     * @return builtinComplianceNum
     */
    public Integer getBuiltinComplianceNum() {
        return builtinComplianceNum;
    }

    public void setBuiltinComplianceNum(Integer builtinComplianceNum) {
        this.builtinComplianceNum = builtinComplianceNum;
    }

    public SearchCompliancePackagesResponse withCustomizedComplianceNum(Integer customizedComplianceNum) {
        this.customizedComplianceNum = customizedComplianceNum;
        return this;
    }

    /**
     * 自定义遵从包数量
     * minimum: 0
     * maximum: 10000
     * @return customizedComplianceNum
     */
    public Integer getCustomizedComplianceNum() {
        return customizedComplianceNum;
    }

    public void setCustomizedComplianceNum(Integer customizedComplianceNum) {
        this.customizedComplianceNum = customizedComplianceNum;
    }

    public SearchCompliancePackagesResponse withDisabledComplianceNum(Integer disabledComplianceNum) {
        this.disabledComplianceNum = disabledComplianceNum;
        return this;
    }

    /**
     * 停用遵从包数量
     * minimum: 0
     * maximum: 10000
     * @return disabledComplianceNum
     */
    public Integer getDisabledComplianceNum() {
        return disabledComplianceNum;
    }

    public void setDisabledComplianceNum(Integer disabledComplianceNum) {
        this.disabledComplianceNum = disabledComplianceNum;
    }

    public SearchCompliancePackagesResponse withEnabledComplianceNum(Integer enabledComplianceNum) {
        this.enabledComplianceNum = enabledComplianceNum;
        return this;
    }

    /**
     * 启用遵从包数量
     * minimum: 0
     * maximum: 10000
     * @return enabledComplianceNum
     */
    public Integer getEnabledComplianceNum() {
        return enabledComplianceNum;
    }

    public void setEnabledComplianceNum(Integer enabledComplianceNum) {
        this.enabledComplianceNum = enabledComplianceNum;
    }

    public SearchCompliancePackagesResponse withCompliancePackages(List<CompliancePackageModel> compliancePackages) {
        this.compliancePackages = compliancePackages;
        return this;
    }

    public SearchCompliancePackagesResponse addCompliancePackagesItem(CompliancePackageModel compliancePackagesItem) {
        if (this.compliancePackages == null) {
            this.compliancePackages = new ArrayList<>();
        }
        this.compliancePackages.add(compliancePackagesItem);
        return this;
    }

    public SearchCompliancePackagesResponse withCompliancePackages(
        Consumer<List<CompliancePackageModel>> compliancePackagesSetter) {
        if (this.compliancePackages == null) {
            this.compliancePackages = new ArrayList<>();
        }
        compliancePackagesSetter.accept(this.compliancePackages);
        return this;
    }

    /**
     * 遵从包列表
     * @return compliancePackages
     */
    public List<CompliancePackageModel> getCompliancePackages() {
        return compliancePackages;
    }

    public void setCompliancePackages(List<CompliancePackageModel> compliancePackages) {
        this.compliancePackages = compliancePackages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchCompliancePackagesResponse that = (SearchCompliancePackagesResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.builtinComplianceNum, that.builtinComplianceNum)
            && Objects.equals(this.customizedComplianceNum, that.customizedComplianceNum)
            && Objects.equals(this.disabledComplianceNum, that.disabledComplianceNum)
            && Objects.equals(this.enabledComplianceNum, that.enabledComplianceNum)
            && Objects.equals(this.compliancePackages, that.compliancePackages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count,
            builtinComplianceNum,
            customizedComplianceNum,
            disabledComplianceNum,
            enabledComplianceNum,
            compliancePackages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCompliancePackagesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    builtinComplianceNum: ").append(toIndentedString(builtinComplianceNum)).append("\n");
        sb.append("    customizedComplianceNum: ").append(toIndentedString(customizedComplianceNum)).append("\n");
        sb.append("    disabledComplianceNum: ").append(toIndentedString(disabledComplianceNum)).append("\n");
        sb.append("    enabledComplianceNum: ").append(toIndentedString(enabledComplianceNum)).append("\n");
        sb.append("    compliancePackages: ").append(toIndentedString(compliancePackages)).append("\n");
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

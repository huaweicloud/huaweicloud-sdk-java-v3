package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 超参搜索配置。
 */
public class JobAlgorithmResponsePoliciesAutoSearch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_search_params")

    private String skipSearchParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reward_attrs")

    private List<JobAlgorithmResponsePoliciesAutoSearchRewardAttrs> rewardAttrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_params")

    private List<JobAlgorithmResponsePoliciesAutoSearchSearchParams> searchParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algo_configs")

    private List<JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs> algoConfigs = null;

    public JobAlgorithmResponsePoliciesAutoSearch withSkipSearchParams(String skipSearchParams) {
        this.skipSearchParams = skipSearchParams;
        return this;
    }

    /**
     * 需要排除的超参组合。
     * @return skipSearchParams
     */
    public String getSkipSearchParams() {
        return skipSearchParams;
    }

    public void setSkipSearchParams(String skipSearchParams) {
        this.skipSearchParams = skipSearchParams;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withRewardAttrs(
        List<JobAlgorithmResponsePoliciesAutoSearchRewardAttrs> rewardAttrs) {
        this.rewardAttrs = rewardAttrs;
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch addRewardAttrsItem(
        JobAlgorithmResponsePoliciesAutoSearchRewardAttrs rewardAttrsItem) {
        if (this.rewardAttrs == null) {
            this.rewardAttrs = new ArrayList<>();
        }
        this.rewardAttrs.add(rewardAttrsItem);
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withRewardAttrs(
        Consumer<List<JobAlgorithmResponsePoliciesAutoSearchRewardAttrs>> rewardAttrsSetter) {
        if (this.rewardAttrs == null) {
            this.rewardAttrs = new ArrayList<>();
        }
        rewardAttrsSetter.accept(this.rewardAttrs);
        return this;
    }

    /**
     * 搜索指标列表。
     * @return rewardAttrs
     */
    public List<JobAlgorithmResponsePoliciesAutoSearchRewardAttrs> getRewardAttrs() {
        return rewardAttrs;
    }

    public void setRewardAttrs(List<JobAlgorithmResponsePoliciesAutoSearchRewardAttrs> rewardAttrs) {
        this.rewardAttrs = rewardAttrs;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withSearchParams(
        List<JobAlgorithmResponsePoliciesAutoSearchSearchParams> searchParams) {
        this.searchParams = searchParams;
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch addSearchParamsItem(
        JobAlgorithmResponsePoliciesAutoSearchSearchParams searchParamsItem) {
        if (this.searchParams == null) {
            this.searchParams = new ArrayList<>();
        }
        this.searchParams.add(searchParamsItem);
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withSearchParams(
        Consumer<List<JobAlgorithmResponsePoliciesAutoSearchSearchParams>> searchParamsSetter) {
        if (this.searchParams == null) {
            this.searchParams = new ArrayList<>();
        }
        searchParamsSetter.accept(this.searchParams);
        return this;
    }

    /**
     * 搜索参数。
     * @return searchParams
     */
    public List<JobAlgorithmResponsePoliciesAutoSearchSearchParams> getSearchParams() {
        return searchParams;
    }

    public void setSearchParams(List<JobAlgorithmResponsePoliciesAutoSearchSearchParams> searchParams) {
        this.searchParams = searchParams;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withAlgoConfigs(
        List<JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs> algoConfigs) {
        this.algoConfigs = algoConfigs;
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch addAlgoConfigsItem(
        JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs algoConfigsItem) {
        if (this.algoConfigs == null) {
            this.algoConfigs = new ArrayList<>();
        }
        this.algoConfigs.add(algoConfigsItem);
        return this;
    }

    public JobAlgorithmResponsePoliciesAutoSearch withAlgoConfigs(
        Consumer<List<JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs>> algoConfigsSetter) {
        if (this.algoConfigs == null) {
            this.algoConfigs = new ArrayList<>();
        }
        algoConfigsSetter.accept(this.algoConfigs);
        return this;
    }

    /**
     * 搜索算法配置。
     * @return algoConfigs
     */
    public List<JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs> getAlgoConfigs() {
        return algoConfigs;
    }

    public void setAlgoConfigs(List<JobAlgorithmResponsePoliciesAutoSearchAlgoConfigs> algoConfigs) {
        this.algoConfigs = algoConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobAlgorithmResponsePoliciesAutoSearch that = (JobAlgorithmResponsePoliciesAutoSearch) obj;
        return Objects.equals(this.skipSearchParams, that.skipSearchParams)
            && Objects.equals(this.rewardAttrs, that.rewardAttrs)
            && Objects.equals(this.searchParams, that.searchParams)
            && Objects.equals(this.algoConfigs, that.algoConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skipSearchParams, rewardAttrs, searchParams, algoConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobAlgorithmResponsePoliciesAutoSearch {\n");
        sb.append("    skipSearchParams: ").append(toIndentedString(skipSearchParams)).append("\n");
        sb.append("    rewardAttrs: ").append(toIndentedString(rewardAttrs)).append("\n");
        sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
        sb.append("    algoConfigs: ").append(toIndentedString(algoConfigs)).append("\n");
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

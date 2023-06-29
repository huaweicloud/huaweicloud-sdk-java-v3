package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Flow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_pair_rules_filter")

    private List<AttrPairRules> attrPairRulesFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_pair_rules_reserve")

    private List<AttrPairRules> attrPairRulesReserve = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduplication_list")

    private List<Deduplication> deduplicationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_info")

    private AttributeInfo attributeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bloom_filter_conf")

    private BloomFilterConf bloomFilterConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_attr")

    private String groupAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_deal")

    private Boolean preDeal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_setting")

    private String rankSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private Rule rules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_sets")

    private List<String> filterSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_value_rules_filter")

    private List<AttrValueRules> attrValueRulesFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_value_rules_reserve")

    private List<AttrValueRules> attrValueRulesReserve = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctr_job")

    private String ctrJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private Integer ratio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "toppings")

    private List<String> toppings = null;

    public Flow withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * 流程id。
     * @return flowId
     */
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public Flow withAttrPairRulesFilter(List<AttrPairRules> attrPairRulesFilter) {
        this.attrPairRulesFilter = attrPairRulesFilter;
        return this;
    }

    public Flow addAttrPairRulesFilterItem(AttrPairRules attrPairRulesFilterItem) {
        if (this.attrPairRulesFilter == null) {
            this.attrPairRulesFilter = new ArrayList<>();
        }
        this.attrPairRulesFilter.add(attrPairRulesFilterItem);
        return this;
    }

    public Flow withAttrPairRulesFilter(Consumer<List<AttrPairRules>> attrPairRulesFilterSetter) {
        if (this.attrPairRulesFilter == null) {
            this.attrPairRulesFilter = new ArrayList<>();
        }
        attrPairRulesFilterSetter.accept(this.attrPairRulesFilter);
        return this;
    }

    /**
     * 属性对过滤。
     * @return attrPairRulesFilter
     */
    public List<AttrPairRules> getAttrPairRulesFilter() {
        return attrPairRulesFilter;
    }

    public void setAttrPairRulesFilter(List<AttrPairRules> attrPairRulesFilter) {
        this.attrPairRulesFilter = attrPairRulesFilter;
    }

    public Flow withAttrPairRulesReserve(List<AttrPairRules> attrPairRulesReserve) {
        this.attrPairRulesReserve = attrPairRulesReserve;
        return this;
    }

    public Flow addAttrPairRulesReserveItem(AttrPairRules attrPairRulesReserveItem) {
        if (this.attrPairRulesReserve == null) {
            this.attrPairRulesReserve = new ArrayList<>();
        }
        this.attrPairRulesReserve.add(attrPairRulesReserveItem);
        return this;
    }

    public Flow withAttrPairRulesReserve(Consumer<List<AttrPairRules>> attrPairRulesReserveSetter) {
        if (this.attrPairRulesReserve == null) {
            this.attrPairRulesReserve = new ArrayList<>();
        }
        attrPairRulesReserveSetter.accept(this.attrPairRulesReserve);
        return this;
    }

    /**
     * 属性对保留。
     * @return attrPairRulesReserve
     */
    public List<AttrPairRules> getAttrPairRulesReserve() {
        return attrPairRulesReserve;
    }

    public void setAttrPairRulesReserve(List<AttrPairRules> attrPairRulesReserve) {
        this.attrPairRulesReserve = attrPairRulesReserve;
    }

    public Flow withDeduplicationList(List<Deduplication> deduplicationList) {
        this.deduplicationList = deduplicationList;
        return this;
    }

    public Flow addDeduplicationListItem(Deduplication deduplicationListItem) {
        if (this.deduplicationList == null) {
            this.deduplicationList = new ArrayList<>();
        }
        this.deduplicationList.add(deduplicationListItem);
        return this;
    }

    public Flow withDeduplicationList(Consumer<List<Deduplication>> deduplicationListSetter) {
        if (this.deduplicationList == null) {
            this.deduplicationList = new ArrayList<>();
        }
        deduplicationListSetter.accept(this.deduplicationList);
        return this;
    }

    /**
     * 属性去重。
     * @return deduplicationList
     */
    public List<Deduplication> getDeduplicationList() {
        return deduplicationList;
    }

    public void setDeduplicationList(List<Deduplication> deduplicationList) {
        this.deduplicationList = deduplicationList;
    }

    public Flow withAttributeInfo(AttributeInfo attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }

    public Flow withAttributeInfo(Consumer<AttributeInfo> attributeInfoSetter) {
        if (this.attributeInfo == null) {
            this.attributeInfo = new AttributeInfo();
            attributeInfoSetter.accept(this.attributeInfo);
        }

        return this;
    }

    /**
     * Get attributeInfo
     * @return attributeInfo
     */
    public AttributeInfo getAttributeInfo() {
        return attributeInfo;
    }

    public void setAttributeInfo(AttributeInfo attributeInfo) {
        this.attributeInfo = attributeInfo;
    }

    public Flow withBloomFilterConf(BloomFilterConf bloomFilterConf) {
        this.bloomFilterConf = bloomFilterConf;
        return this;
    }

    public Flow withBloomFilterConf(Consumer<BloomFilterConf> bloomFilterConfSetter) {
        if (this.bloomFilterConf == null) {
            this.bloomFilterConf = new BloomFilterConf();
            bloomFilterConfSetter.accept(this.bloomFilterConf);
        }

        return this;
    }

    /**
     * Get bloomFilterConf
     * @return bloomFilterConf
     */
    public BloomFilterConf getBloomFilterConf() {
        return bloomFilterConf;
    }

    public void setBloomFilterConf(BloomFilterConf bloomFilterConf) {
        this.bloomFilterConf = bloomFilterConf;
    }

    public Flow withGroupAttr(String groupAttr) {
        this.groupAttr = groupAttr;
        return this;
    }

    /**
     * 分组打散属性。
     * @return groupAttr
     */
    public String getGroupAttr() {
        return groupAttr;
    }

    public void setGroupAttr(String groupAttr) {
        this.groupAttr = groupAttr;
    }

    public Flow withPreDeal(Boolean preDeal) {
        this.preDeal = preDeal;
        return this;
    }

    /**
     * 在排序前去重。
     * @return preDeal
     */
    public Boolean getPreDeal() {
        return preDeal;
    }

    public void setPreDeal(Boolean preDeal) {
        this.preDeal = preDeal;
    }

    public Flow withRankSetting(String rankSetting) {
        this.rankSetting = rankSetting;
        return this;
    }

    /**
     * 排序配置信息。
     * @return rankSetting
     */
    public String getRankSetting() {
        return rankSetting;
    }

    public void setRankSetting(String rankSetting) {
        this.rankSetting = rankSetting;
    }

    public Flow withRules(Rule rules) {
        this.rules = rules;
        return this;
    }

    public Flow withRules(Consumer<Rule> rulesSetter) {
        if (this.rules == null) {
            this.rules = new Rule();
            rulesSetter.accept(this.rules);
        }

        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    public Rule getRules() {
        return rules;
    }

    public void setRules(Rule rules) {
        this.rules = rules;
    }

    public Flow withFilterSets(List<String> filterSets) {
        this.filterSets = filterSets;
        return this;
    }

    public Flow addFilterSetsItem(String filterSetsItem) {
        if (this.filterSets == null) {
            this.filterSets = new ArrayList<>();
        }
        this.filterSets.add(filterSetsItem);
        return this;
    }

    public Flow withFilterSets(Consumer<List<String>> filterSetsSetter) {
        if (this.filterSets == null) {
            this.filterSets = new ArrayList<>();
        }
        filterSetsSetter.accept(this.filterSets);
        return this;
    }

    /**
     * 过滤配置信息。
     * @return filterSets
     */
    public List<String> getFilterSets() {
        return filterSets;
    }

    public void setFilterSets(List<String> filterSets) {
        this.filterSets = filterSets;
    }

    public Flow withAttrValueRulesFilter(List<AttrValueRules> attrValueRulesFilter) {
        this.attrValueRulesFilter = attrValueRulesFilter;
        return this;
    }

    public Flow addAttrValueRulesFilterItem(AttrValueRules attrValueRulesFilterItem) {
        if (this.attrValueRulesFilter == null) {
            this.attrValueRulesFilter = new ArrayList<>();
        }
        this.attrValueRulesFilter.add(attrValueRulesFilterItem);
        return this;
    }

    public Flow withAttrValueRulesFilter(Consumer<List<AttrValueRules>> attrValueRulesFilterSetter) {
        if (this.attrValueRulesFilter == null) {
            this.attrValueRulesFilter = new ArrayList<>();
        }
        attrValueRulesFilterSetter.accept(this.attrValueRulesFilter);
        return this;
    }

    /**
     * 属性值过滤。
     * @return attrValueRulesFilter
     */
    public List<AttrValueRules> getAttrValueRulesFilter() {
        return attrValueRulesFilter;
    }

    public void setAttrValueRulesFilter(List<AttrValueRules> attrValueRulesFilter) {
        this.attrValueRulesFilter = attrValueRulesFilter;
    }

    public Flow withAttrValueRulesReserve(List<AttrValueRules> attrValueRulesReserve) {
        this.attrValueRulesReserve = attrValueRulesReserve;
        return this;
    }

    public Flow addAttrValueRulesReserveItem(AttrValueRules attrValueRulesReserveItem) {
        if (this.attrValueRulesReserve == null) {
            this.attrValueRulesReserve = new ArrayList<>();
        }
        this.attrValueRulesReserve.add(attrValueRulesReserveItem);
        return this;
    }

    public Flow withAttrValueRulesReserve(Consumer<List<AttrValueRules>> attrValueRulesReserveSetter) {
        if (this.attrValueRulesReserve == null) {
            this.attrValueRulesReserve = new ArrayList<>();
        }
        attrValueRulesReserveSetter.accept(this.attrValueRulesReserve);
        return this;
    }

    /**
     * 属性值保留。
     * @return attrValueRulesReserve
     */
    public List<AttrValueRules> getAttrValueRulesReserve() {
        return attrValueRulesReserve;
    }

    public void setAttrValueRulesReserve(List<AttrValueRules> attrValueRulesReserve) {
        this.attrValueRulesReserve = attrValueRulesReserve;
    }

    public Flow withCtrJob(String ctrJob) {
        this.ctrJob = ctrJob;
        return this;
    }

    /**
     * 排序作业（使用点击率预估时需要提供此参数）。
     * @return ctrJob
     */
    public String getCtrJob() {
        return ctrJob;
    }

    public void setCtrJob(String ctrJob) {
        this.ctrJob = ctrJob;
    }

    public Flow withRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 流量占比。
     * minimum: 1
     * maximum: 100
     * @return ratio
     */
    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Flow withToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Flow addToppingsItem(String toppingsItem) {
        if (this.toppings == null) {
            this.toppings = new ArrayList<>();
        }
        this.toppings.add(toppingsItem);
        return this;
    }

    public Flow withToppings(Consumer<List<String>> toppingsSetter) {
        if (this.toppings == null) {
            this.toppings = new ArrayList<>();
        }
        toppingsSetter.accept(this.toppings);
        return this;
    }

    /**
     * 需要置顶的候选集列表。
     * @return toppings
     */
    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flow that = (Flow) obj;
        return Objects.equals(this.flowId, that.flowId)
            && Objects.equals(this.attrPairRulesFilter, that.attrPairRulesFilter)
            && Objects.equals(this.attrPairRulesReserve, that.attrPairRulesReserve)
            && Objects.equals(this.deduplicationList, that.deduplicationList)
            && Objects.equals(this.attributeInfo, that.attributeInfo)
            && Objects.equals(this.bloomFilterConf, that.bloomFilterConf)
            && Objects.equals(this.groupAttr, that.groupAttr) && Objects.equals(this.preDeal, that.preDeal)
            && Objects.equals(this.rankSetting, that.rankSetting) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.filterSets, that.filterSets)
            && Objects.equals(this.attrValueRulesFilter, that.attrValueRulesFilter)
            && Objects.equals(this.attrValueRulesReserve, that.attrValueRulesReserve)
            && Objects.equals(this.ctrJob, that.ctrJob) && Objects.equals(this.ratio, that.ratio)
            && Objects.equals(this.toppings, that.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId,
            attrPairRulesFilter,
            attrPairRulesReserve,
            deduplicationList,
            attributeInfo,
            bloomFilterConf,
            groupAttr,
            preDeal,
            rankSetting,
            rules,
            filterSets,
            attrValueRulesFilter,
            attrValueRulesReserve,
            ctrJob,
            ratio,
            toppings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flow {\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    attrPairRulesFilter: ").append(toIndentedString(attrPairRulesFilter)).append("\n");
        sb.append("    attrPairRulesReserve: ").append(toIndentedString(attrPairRulesReserve)).append("\n");
        sb.append("    deduplicationList: ").append(toIndentedString(deduplicationList)).append("\n");
        sb.append("    attributeInfo: ").append(toIndentedString(attributeInfo)).append("\n");
        sb.append("    bloomFilterConf: ").append(toIndentedString(bloomFilterConf)).append("\n");
        sb.append("    groupAttr: ").append(toIndentedString(groupAttr)).append("\n");
        sb.append("    preDeal: ").append(toIndentedString(preDeal)).append("\n");
        sb.append("    rankSetting: ").append(toIndentedString(rankSetting)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    filterSets: ").append(toIndentedString(filterSets)).append("\n");
        sb.append("    attrValueRulesFilter: ").append(toIndentedString(attrValueRulesFilter)).append("\n");
        sb.append("    attrValueRulesReserve: ").append(toIndentedString(attrValueRulesReserve)).append("\n");
        sb.append("    ctrJob: ").append(toIndentedString(ctrJob)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    toppings: ").append(toIndentedString(toppings)).append("\n");
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

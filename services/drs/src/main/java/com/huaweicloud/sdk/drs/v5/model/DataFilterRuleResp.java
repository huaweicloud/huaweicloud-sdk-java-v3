package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据过滤规则响应体
 */
public class DataFilterRuleResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    private Long batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_object_list")

    private List<DataFilterObjectResp> filterObjectList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_rules_resp")

    private GeneralDataFilterResp filterRulesResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_setting_resp")

    private DataFilteringAdvancedSetting advancedSettingResp;

    public DataFilterRuleResp withBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 数据过滤规则批次ID，标识同一批次内的多个过滤对象属于同一个规则配置。
     * @return batchId
     */
    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public DataFilterRuleResp withFilterObjectList(List<DataFilterObjectResp> filterObjectList) {
        this.filterObjectList = filterObjectList;
        return this;
    }

    public DataFilterRuleResp addFilterObjectListItem(DataFilterObjectResp filterObjectListItem) {
        if (this.filterObjectList == null) {
            this.filterObjectList = new ArrayList<>();
        }
        this.filterObjectList.add(filterObjectListItem);
        return this;
    }

    public DataFilterRuleResp withFilterObjectList(Consumer<List<DataFilterObjectResp>> filterObjectListSetter) {
        if (this.filterObjectList == null) {
            this.filterObjectList = new ArrayList<>();
        }
        filterObjectListSetter.accept(this.filterObjectList);
        return this;
    }

    /**
     * 过滤对象信息列表，列出此规则下所有需进行数据过滤的具体数据库对象
     * @return filterObjectList
     */
    public List<DataFilterObjectResp> getFilterObjectList() {
        return filterObjectList;
    }

    public void setFilterObjectList(List<DataFilterObjectResp> filterObjectList) {
        this.filterObjectList = filterObjectList;
    }

    public DataFilterRuleResp withFilterRulesResp(GeneralDataFilterResp filterRulesResp) {
        this.filterRulesResp = filterRulesResp;
        return this;
    }

    public DataFilterRuleResp withFilterRulesResp(Consumer<GeneralDataFilterResp> filterRulesRespSetter) {
        if (this.filterRulesResp == null) {
            this.filterRulesResp = new GeneralDataFilterResp();
            filterRulesRespSetter.accept(this.filterRulesResp);
        }

        return this;
    }

    /**
     * Get filterRulesResp
     * @return filterRulesResp
     */
    public GeneralDataFilterResp getFilterRulesResp() {
        return filterRulesResp;
    }

    public void setFilterRulesResp(GeneralDataFilterResp filterRulesResp) {
        this.filterRulesResp = filterRulesResp;
    }

    public DataFilterRuleResp withAdvancedSettingResp(DataFilteringAdvancedSetting advancedSettingResp) {
        this.advancedSettingResp = advancedSettingResp;
        return this;
    }

    public DataFilterRuleResp withAdvancedSettingResp(
        Consumer<DataFilteringAdvancedSetting> advancedSettingRespSetter) {
        if (this.advancedSettingResp == null) {
            this.advancedSettingResp = new DataFilteringAdvancedSetting();
            advancedSettingRespSetter.accept(this.advancedSettingResp);
        }

        return this;
    }

    /**
     * Get advancedSettingResp
     * @return advancedSettingResp
     */
    public DataFilteringAdvancedSetting getAdvancedSettingResp() {
        return advancedSettingResp;
    }

    public void setAdvancedSettingResp(DataFilteringAdvancedSetting advancedSettingResp) {
        this.advancedSettingResp = advancedSettingResp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilterRuleResp that = (DataFilterRuleResp) obj;
        return Objects.equals(this.batchId, that.batchId)
            && Objects.equals(this.filterObjectList, that.filterObjectList)
            && Objects.equals(this.filterRulesResp, that.filterRulesResp)
            && Objects.equals(this.advancedSettingResp, that.advancedSettingResp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId, filterObjectList, filterRulesResp, advancedSettingResp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilterRuleResp {\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    filterObjectList: ").append(toIndentedString(filterObjectList)).append("\n");
        sb.append("    filterRulesResp: ").append(toIndentedString(filterRulesResp)).append("\n");
        sb.append("    advancedSettingResp: ").append(toIndentedString(advancedSettingResp)).append("\n");
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

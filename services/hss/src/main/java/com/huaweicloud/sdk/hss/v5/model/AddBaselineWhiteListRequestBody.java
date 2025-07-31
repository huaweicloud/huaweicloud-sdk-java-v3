package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增基线白名单请求体信息
 */
public class AddBaselineWhiteListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_list")

    private List<AddBaselineWhiteListRequestBodyRuleList> ruleList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddBaselineWhiteListRequestBody withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 基线检查的操作系统 - Linux - Windows
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AddBaselineWhiteListRequestBody withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 基线检查白名单的规则范围 - specific_host 部分主机 - all_host      全部主机
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public AddBaselineWhiteListRequestBody withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public AddBaselineWhiteListRequestBody addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public AddBaselineWhiteListRequestBody withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * rule_type为specific_host时,该字段为待添加的白名单主机id列表, rule_type为all_host时无该字段
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public AddBaselineWhiteListRequestBody withRuleList(List<AddBaselineWhiteListRequestBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    public AddBaselineWhiteListRequestBody addRuleListItem(AddBaselineWhiteListRequestBodyRuleList ruleListItem) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        this.ruleList.add(ruleListItem);
        return this;
    }

    public AddBaselineWhiteListRequestBody withRuleList(
        Consumer<List<AddBaselineWhiteListRequestBodyRuleList>> ruleListSetter) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        ruleListSetter.accept(this.ruleList);
        return this;
    }

    /**
     * 待添加的白名单的检查项列表
     * @return ruleList
     */
    public List<AddBaselineWhiteListRequestBodyRuleList> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<AddBaselineWhiteListRequestBodyRuleList> ruleList) {
        this.ruleList = ruleList;
    }

    public AddBaselineWhiteListRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 基线白名单备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBaselineWhiteListRequestBody that = (AddBaselineWhiteListRequestBody) obj;
        return Objects.equals(this.osType, that.osType) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.ruleList, that.ruleList)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType, ruleType, hostIdList, ruleList, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBaselineWhiteListRequestBody {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

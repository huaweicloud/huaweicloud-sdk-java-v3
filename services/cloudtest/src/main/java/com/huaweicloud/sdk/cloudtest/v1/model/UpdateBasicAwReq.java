package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateBasicAwReq
 */
public class UpdateBasicAwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_check_point_list")

    private List<CheckPoint> dftCheckPointList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_custom_header")

    private List<AwParam> dftCustomHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_retry_interval")

    private String dftRetryInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_retry_times")

    private String dftRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_variable_list")

    private List<AwVariable> dftVariableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type_and_dft_value")

    private List<AwParam> paramTypeAndDftValue = null;

    public UpdateBasicAwReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateBasicAwReq withDftCheckPointList(List<CheckPoint> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
        return this;
    }

    public UpdateBasicAwReq addDftCheckPointListItem(CheckPoint dftCheckPointListItem) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        this.dftCheckPointList.add(dftCheckPointListItem);
        return this;
    }

    public UpdateBasicAwReq withDftCheckPointList(Consumer<List<CheckPoint>> dftCheckPointListSetter) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        dftCheckPointListSetter.accept(this.dftCheckPointList);
        return this;
    }

    /**
     * 默认检查点List
     * @return dftCheckPointList
     */
    public List<CheckPoint> getDftCheckPointList() {
        return dftCheckPointList;
    }

    public void setDftCheckPointList(List<CheckPoint> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
    }

    public UpdateBasicAwReq withDftCustomHeader(List<AwParam> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
        return this;
    }

    public UpdateBasicAwReq addDftCustomHeaderItem(AwParam dftCustomHeaderItem) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        this.dftCustomHeader.add(dftCustomHeaderItem);
        return this;
    }

    public UpdateBasicAwReq withDftCustomHeader(Consumer<List<AwParam>> dftCustomHeaderSetter) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        dftCustomHeaderSetter.accept(this.dftCustomHeader);
        return this;
    }

    /**
     * AW参数类list
     * @return dftCustomHeader
     */
    public List<AwParam> getDftCustomHeader() {
        return dftCustomHeader;
    }

    public void setDftCustomHeader(List<AwParam> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
    }

    public UpdateBasicAwReq withDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
        return this;
    }

    /**
     * 重试间隔时间 (ms) 为空表示不等待(目前内部使用)
     * @return dftRetryInterval
     */
    public String getDftRetryInterval() {
        return dftRetryInterval;
    }

    public void setDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
    }

    public UpdateBasicAwReq withDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
        return this;
    }

    /**
     * 重试次数(目前内部使用)
     * @return dftRetryTimes
     */
    public String getDftRetryTimes() {
        return dftRetryTimes;
    }

    public void setDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
    }

    public UpdateBasicAwReq withDftVariableList(List<AwVariable> dftVariableList) {
        this.dftVariableList = dftVariableList;
        return this;
    }

    public UpdateBasicAwReq addDftVariableListItem(AwVariable dftVariableListItem) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        this.dftVariableList.add(dftVariableListItem);
        return this;
    }

    public UpdateBasicAwReq withDftVariableList(Consumer<List<AwVariable>> dftVariableListSetter) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        dftVariableListSetter.accept(this.dftVariableList);
        return this;
    }

    /**
     * 定义的变量信息
     * @return dftVariableList
     */
    public List<AwVariable> getDftVariableList() {
        return dftVariableList;
    }

    public void setDftVariableList(List<AwVariable> dftVariableList) {
        this.dftVariableList = dftVariableList;
    }

    public UpdateBasicAwReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateBasicAwReq withParamTypeAndDftValue(List<AwParam> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
        return this;
    }

    public UpdateBasicAwReq addParamTypeAndDftValueItem(AwParam paramTypeAndDftValueItem) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        this.paramTypeAndDftValue.add(paramTypeAndDftValueItem);
        return this;
    }

    public UpdateBasicAwReq withParamTypeAndDftValue(Consumer<List<AwParam>> paramTypeAndDftValueSetter) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        paramTypeAndDftValueSetter.accept(this.paramTypeAndDftValue);
        return this;
    }

    /**
     * 参数类型和参数默认值对应List
     * @return paramTypeAndDftValue
     */
    public List<AwParam> getParamTypeAndDftValue() {
        return paramTypeAndDftValue;
    }

    public void setParamTypeAndDftValue(List<AwParam> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBasicAwReq that = (UpdateBasicAwReq) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.dftCheckPointList, that.dftCheckPointList)
            && Objects.equals(this.dftCustomHeader, that.dftCustomHeader)
            && Objects.equals(this.dftRetryInterval, that.dftRetryInterval)
            && Objects.equals(this.dftRetryTimes, that.dftRetryTimes)
            && Objects.equals(this.dftVariableList, that.dftVariableList) && Objects.equals(this.name, that.name)
            && Objects.equals(this.paramTypeAndDftValue, that.paramTypeAndDftValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            dftCheckPointList,
            dftCustomHeader,
            dftRetryInterval,
            dftRetryTimes,
            dftVariableList,
            name,
            paramTypeAndDftValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBasicAwReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dftCheckPointList: ").append(toIndentedString(dftCheckPointList)).append("\n");
        sb.append("    dftCustomHeader: ").append(toIndentedString(dftCustomHeader)).append("\n");
        sb.append("    dftRetryInterval: ").append(toIndentedString(dftRetryInterval)).append("\n");
        sb.append("    dftRetryTimes: ").append(toIndentedString(dftRetryTimes)).append("\n");
        sb.append("    dftVariableList: ").append(toIndentedString(dftVariableList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paramTypeAndDftValue: ").append(toIndentedString(paramTypeAndDftValue)).append("\n");
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

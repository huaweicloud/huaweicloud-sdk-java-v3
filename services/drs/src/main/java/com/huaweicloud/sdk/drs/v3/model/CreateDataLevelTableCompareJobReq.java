package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建数据级对比任务请求
 */
public class CreateDataLevelTableCompareJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_mode")

    private String compareMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_object")

    private List<CompareObjectInfo> compareObject = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Map<String, String> options = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_object_with_token")

    private List<CompareObjectInfoWithToken> compareObjectWithToken = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_num")

    private Integer compareTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_transformation_infos")

    private List<AddDataTransformationReq> compareTransformationInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proportion_value")

    private Double proportionValue;

    public CreateDataLevelTableCompareJobReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对比类型。 - lines：行数对比 - contents：内容对比 - random：抽样对比，当前仅支持gaussdbv5、gaussdbv5-to-postgresql、gaussdbv5ha-to-postgresql链路。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateDataLevelTableCompareJobReq withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 对比任务启动时间，时间戳格式，取值为空代表立即启动。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateDataLevelTableCompareJobReq withCompareMode(String compareMode) {
        this.compareMode = compareMode;
        return this;
    }

    /**
     * 数据级对比模式，取值为空时需要在compare_object或者compare_object_with_token传对象信息，quick_comparison-快速对比。 取值：quick_comparison
     * @return compareMode
     */
    public String getCompareMode() {
        return compareMode;
    }

    public void setCompareMode(String compareMode) {
        this.compareMode = compareMode;
    }

    public CreateDataLevelTableCompareJobReq withCompareObject(List<CompareObjectInfo> compareObject) {
        this.compareObject = compareObject;
        return this;
    }

    public CreateDataLevelTableCompareJobReq addCompareObjectItem(CompareObjectInfo compareObjectItem) {
        if (this.compareObject == null) {
            this.compareObject = new ArrayList<>();
        }
        this.compareObject.add(compareObjectItem);
        return this;
    }

    public CreateDataLevelTableCompareJobReq withCompareObject(Consumer<List<CompareObjectInfo>> compareObjectSetter) {
        if (this.compareObject == null) {
            this.compareObject = new ArrayList<>();
        }
        compareObjectSetter.accept(this.compareObject);
        return this;
    }

    /**
     * 数据级对比的对象。
     * @return compareObject
     */
    public List<CompareObjectInfo> getCompareObject() {
        return compareObject;
    }

    public void setCompareObject(List<CompareObjectInfo> compareObject) {
        this.compareObject = compareObject;
    }

    public CreateDataLevelTableCompareJobReq withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    public CreateDataLevelTableCompareJobReq putOptionsItem(String key, String optionsItem) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        this.options.put(key, optionsItem);
        return this;
    }

    public CreateDataLevelTableCompareJobReq withOptions(Consumer<Map<String, String>> optionsSetter) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        optionsSetter.accept(this.options);
        return this;
    }

    /**
     * 对比配置项，key-value形式。 内容对比支持以下配置项： - 对比方式配置，key：contentCompareType，value：dynamic表示动态对比，static表示静态对比。 - lob字段对比类型配置，key：lobCompare，value：ignore表示忽略，length表示长度对比。  行数对比支持以下配置项： - 对比策略配置，多表归一情况下适用，key：comparePolicy，value：normal表示正常对比，manyToOne表示多对一对比。
     * @return options
     */
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public CreateDataLevelTableCompareJobReq withCompareObjectWithToken(
        List<CompareObjectInfoWithToken> compareObjectWithToken) {
        this.compareObjectWithToken = compareObjectWithToken;
        return this;
    }

    public CreateDataLevelTableCompareJobReq addCompareObjectWithTokenItem(
        CompareObjectInfoWithToken compareObjectWithTokenItem) {
        if (this.compareObjectWithToken == null) {
            this.compareObjectWithToken = new ArrayList<>();
        }
        this.compareObjectWithToken.add(compareObjectWithTokenItem);
        return this;
    }

    public CreateDataLevelTableCompareJobReq withCompareObjectWithToken(
        Consumer<List<CompareObjectInfoWithToken>> compareObjectWithTokenSetter) {
        if (this.compareObjectWithToken == null) {
            this.compareObjectWithToken = new ArrayList<>();
        }
        compareObjectWithTokenSetter.accept(this.compareObjectWithToken);
        return this;
    }

    /**
     * 数据级对比的对象（Cassandra灾备专用，带token信息）。
     * @return compareObjectWithToken
     */
    public List<CompareObjectInfoWithToken> getCompareObjectWithToken() {
        return compareObjectWithToken;
    }

    public void setCompareObjectWithToken(List<CompareObjectInfoWithToken> compareObjectWithToken) {
        this.compareObjectWithToken = compareObjectWithToken;
    }

    public CreateDataLevelTableCompareJobReq withCompareTaskNum(Integer compareTaskNum) {
        this.compareTaskNum = compareTaskNum;
        return this;
    }

    /**
     * 对比任务线程数量，当前仅cloudDataGuard-cassandra和cloudDataGuard-gausscassandra-to-gausscassandra链路支持。
     * @return compareTaskNum
     */
    public Integer getCompareTaskNum() {
        return compareTaskNum;
    }

    public void setCompareTaskNum(Integer compareTaskNum) {
        this.compareTaskNum = compareTaskNum;
    }

    public CreateDataLevelTableCompareJobReq withCompareTransformationInfos(
        List<AddDataTransformationReq> compareTransformationInfos) {
        this.compareTransformationInfos = compareTransformationInfos;
        return this;
    }

    public CreateDataLevelTableCompareJobReq addCompareTransformationInfosItem(
        AddDataTransformationReq compareTransformationInfosItem) {
        if (this.compareTransformationInfos == null) {
            this.compareTransformationInfos = new ArrayList<>();
        }
        this.compareTransformationInfos.add(compareTransformationInfosItem);
        return this;
    }

    public CreateDataLevelTableCompareJobReq withCompareTransformationInfos(
        Consumer<List<AddDataTransformationReq>> compareTransformationInfosSetter) {
        if (this.compareTransformationInfos == null) {
            this.compareTransformationInfos = new ArrayList<>();
        }
        compareTransformationInfosSetter.accept(this.compareTransformationInfos);
        return this;
    }

    /**
     * 过滤数据信息。
     * @return compareTransformationInfos
     */
    public List<AddDataTransformationReq> getCompareTransformationInfos() {
        return compareTransformationInfos;
    }

    public void setCompareTransformationInfos(List<AddDataTransformationReq> compareTransformationInfos) {
        this.compareTransformationInfos = compareTransformationInfos;
    }

    public CreateDataLevelTableCompareJobReq withProportionValue(Double proportionValue) {
        this.proportionValue = proportionValue;
        return this;
    }

    /**
     * 抽样比例，对比类型为抽样对比时填写。
     * @return proportionValue
     */
    public Double getProportionValue() {
        return proportionValue;
    }

    public void setProportionValue(Double proportionValue) {
        this.proportionValue = proportionValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataLevelTableCompareJobReq that = (CreateDataLevelTableCompareJobReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.compareMode, that.compareMode)
            && Objects.equals(this.compareObject, that.compareObject) && Objects.equals(this.options, that.options)
            && Objects.equals(this.compareObjectWithToken, that.compareObjectWithToken)
            && Objects.equals(this.compareTaskNum, that.compareTaskNum)
            && Objects.equals(this.compareTransformationInfos, that.compareTransformationInfos)
            && Objects.equals(this.proportionValue, that.proportionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            startTime,
            compareMode,
            compareObject,
            options,
            compareObjectWithToken,
            compareTaskNum,
            compareTransformationInfos,
            proportionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataLevelTableCompareJobReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    compareMode: ").append(toIndentedString(compareMode)).append("\n");
        sb.append("    compareObject: ").append(toIndentedString(compareObject)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    compareObjectWithToken: ").append(toIndentedString(compareObjectWithToken)).append("\n");
        sb.append("    compareTaskNum: ").append(toIndentedString(compareTaskNum)).append("\n");
        sb.append("    compareTransformationInfos: ").append(toIndentedString(compareTransformationInfos)).append("\n");
        sb.append("    proportionValue: ").append(toIndentedString(proportionValue)).append("\n");
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

package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBasicAwReq
 */
public class CreateBasicAwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_param_type")

    private String bodyParamType;

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
    @JsonProperty(value = "dft_variable_list")

    private List<AwVariable> dftVariableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type_and_dft_value")

    private List<AwParam> paramTypeAndDftValue = null;

    public CreateBasicAwReq withBodyParamType(String bodyParamType) {
        this.bodyParamType = bodyParamType;
        return this;
    }

    /**
     * body请求体的类型：text(包含JSON，参数内部区分)、form
     * @return bodyParamType
     */
    public String getBodyParamType() {
        return bodyParamType;
    }

    public void setBodyParamType(String bodyParamType) {
        this.bodyParamType = bodyParamType;
    }

    public CreateBasicAwReq withDescription(String description) {
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

    public CreateBasicAwReq withDftCheckPointList(List<CheckPoint> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
        return this;
    }

    public CreateBasicAwReq addDftCheckPointListItem(CheckPoint dftCheckPointListItem) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        this.dftCheckPointList.add(dftCheckPointListItem);
        return this;
    }

    public CreateBasicAwReq withDftCheckPointList(Consumer<List<CheckPoint>> dftCheckPointListSetter) {
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

    public CreateBasicAwReq withDftCustomHeader(List<AwParam> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
        return this;
    }

    public CreateBasicAwReq addDftCustomHeaderItem(AwParam dftCustomHeaderItem) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        this.dftCustomHeader.add(dftCustomHeaderItem);
        return this;
    }

    public CreateBasicAwReq withDftCustomHeader(Consumer<List<AwParam>> dftCustomHeaderSetter) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        dftCustomHeaderSetter.accept(this.dftCustomHeader);
        return this;
    }

    /**
     * 默认请求头参数对象
     * @return dftCustomHeader
     */
    public List<AwParam> getDftCustomHeader() {
        return dftCustomHeader;
    }

    public void setDftCustomHeader(List<AwParam> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
    }

    public CreateBasicAwReq withDftVariableList(List<AwVariable> dftVariableList) {
        this.dftVariableList = dftVariableList;
        return this;
    }

    public CreateBasicAwReq addDftVariableListItem(AwVariable dftVariableListItem) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        this.dftVariableList.add(dftVariableListItem);
        return this;
    }

    public CreateBasicAwReq withDftVariableList(Consumer<List<AwVariable>> dftVariableListSetter) {
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

    public CreateBasicAwReq withExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public CreateBasicAwReq withExtraInfo(Consumer<ExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public CreateBasicAwReq withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateBasicAwReq withName(String name) {
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

    public CreateBasicAwReq withParamTypeAndDftValue(List<AwParam> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
        return this;
    }

    public CreateBasicAwReq addParamTypeAndDftValueItem(AwParam paramTypeAndDftValueItem) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        this.paramTypeAndDftValue.add(paramTypeAndDftValueItem);
        return this;
    }

    public CreateBasicAwReq withParamTypeAndDftValue(Consumer<List<AwParam>> paramTypeAndDftValueSetter) {
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
        CreateBasicAwReq that = (CreateBasicAwReq) obj;
        return Objects.equals(this.bodyParamType, that.bodyParamType)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dftCheckPointList, that.dftCheckPointList)
            && Objects.equals(this.dftCustomHeader, that.dftCustomHeader)
            && Objects.equals(this.dftVariableList, that.dftVariableList)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.name, that.name)
            && Objects.equals(this.paramTypeAndDftValue, that.paramTypeAndDftValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyParamType,
            description,
            dftCheckPointList,
            dftCustomHeader,
            dftVariableList,
            extraInfo,
            groupName,
            name,
            paramTypeAndDftValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBasicAwReq {\n");
        sb.append("    bodyParamType: ").append(toIndentedString(bodyParamType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dftCheckPointList: ").append(toIndentedString(dftCheckPointList)).append("\n");
        sb.append("    dftCustomHeader: ").append(toIndentedString(dftCustomHeader)).append("\n");
        sb.append("    dftVariableList: ").append(toIndentedString(dftVariableList)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

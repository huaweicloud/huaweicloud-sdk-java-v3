package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AwVariable
 */
public class AwVariable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_order")

    private Integer byOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentPermission")

    private String currentPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamicParam")

    private String dynamicParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamicParamFlag")

    private Boolean dynamicParamFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functionParams")

    private String functionParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_arg")

    private String functionArg;

    /**
     * 响应提取时要使用什么方法处理参数
     */
    public static final class FunctionTypeEnum {

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final FunctionTypeEnum REGEX = new FunctionTypeEnum("REGEX");

        /**
         * Enum SUBSTRING for value: "SUBSTRING"
         */
        public static final FunctionTypeEnum SUBSTRING = new FunctionTypeEnum("SUBSTRING");

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("REGEX", REGEX);
            map.put("SUBSTRING", SUBSTRING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FunctionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FunctionTypeEnum(value));
        }

        public static FunctionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionTypeEnum) {
                return this.value.equals(((FunctionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_type")

    private FunctionTypeEnum functionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSensitiveInfo")

    private Boolean isSensitiveInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSensitiveModified")

    private Boolean isSensitiveModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_out_put")

    private Boolean isOutPut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private Integer nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oldName")

    private String oldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_node_id")

    private String parentNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveInfoSetterTime")

    private String sensitiveInfoSetterTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveInfoSetterUser")

    private String sensitiveInfoSetterUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variableType")

    private Integer variableType;

    public AwVariable withByOrder(Integer byOrder) {
        this.byOrder = byOrder;
        return this;
    }

    /**
     * 节点顺序
     * @return byOrder
     */
    public Integer getByOrder() {
        return byOrder;
    }

    public void setByOrder(Integer byOrder) {
        this.byOrder = byOrder;
    }

    public AwVariable withCurrentPermission(String currentPermission) {
        this.currentPermission = currentPermission;
        return this;
    }

    /**
     * 当前人员权限
     * @return currentPermission
     */
    public String getCurrentPermission() {
        return currentPermission;
    }

    public void setCurrentPermission(String currentPermission) {
        this.currentPermission = currentPermission;
    }

    public AwVariable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AwVariable withDynamicParam(String dynamicParam) {
        this.dynamicParam = dynamicParam;
        return this;
    }

    /**
     * 动态参数名称
     * @return dynamicParam
     */
    public String getDynamicParam() {
        return dynamicParam;
    }

    public void setDynamicParam(String dynamicParam) {
        this.dynamicParam = dynamicParam;
    }

    public AwVariable withDynamicParamFlag(Boolean dynamicParamFlag) {
        this.dynamicParamFlag = dynamicParamFlag;
        return this;
    }

    /**
     * 动态参数标志,默认为false:true代表动态参数；false代表非动态参数
     * @return dynamicParamFlag
     */
    public Boolean getDynamicParamFlag() {
        return dynamicParamFlag;
    }

    public void setDynamicParamFlag(Boolean dynamicParamFlag) {
        this.dynamicParamFlag = dynamicParamFlag;
    }

    public AwVariable withFunctionParams(String functionParams) {
        this.functionParams = functionParams;
        return this;
    }

    /**
     * 变量参数（[]:空参、[a]:一参，[a,b]:两参）
     * @return functionParams
     */
    public String getFunctionParams() {
        return functionParams;
    }

    public void setFunctionParams(String functionParams) {
        this.functionParams = functionParams;
    }

    public AwVariable withFunctionArg(String functionArg) {
        this.functionArg = functionArg;
        return this;
    }

    /**
     * 响应提取时要使用什么方法处理参数
     * @return functionArg
     */
    public String getFunctionArg() {
        return functionArg;
    }

    public void setFunctionArg(String functionArg) {
        this.functionArg = functionArg;
    }

    public AwVariable withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    /**
     * 响应提取时要使用什么方法处理参数
     * @return functionType
     */
    public FunctionTypeEnum getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
    }

    public AwVariable withIsSensitiveInfo(Boolean isSensitiveInfo) {
        this.isSensitiveInfo = isSensitiveInfo;
        return this;
    }

    /**
     * 是否是敏感字段
     * @return isSensitiveInfo
     */
    public Boolean getIsSensitiveInfo() {
        return isSensitiveInfo;
    }

    public void setIsSensitiveInfo(Boolean isSensitiveInfo) {
        this.isSensitiveInfo = isSensitiveInfo;
    }

    public AwVariable withIsSensitiveModified(Boolean isSensitiveModified) {
        this.isSensitiveModified = isSensitiveModified;
        return this;
    }

    /**
     * 敏感字段是否被修改，不敏感字段不关注此值
     * @return isSensitiveModified
     */
    public Boolean getIsSensitiveModified() {
        return isSensitiveModified;
    }

    public void setIsSensitiveModified(Boolean isSensitiveModified) {
        this.isSensitiveModified = isSensitiveModified;
    }

    public AwVariable withIsOutPut(Boolean isOutPut) {
        this.isOutPut = isOutPut;
        return this;
    }

    /**
     * 是否是组合aw的输出参数，只有组合aw下awInstance的aw变量有该字段
     * @return isOutPut
     */
    public Boolean getIsOutPut() {
        return isOutPut;
    }

    public void setIsOutPut(Boolean isOutPut) {
        this.isOutPut = isOutPut;
    }

    public AwVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AwVariable withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public AwVariable withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 0/null-变量节点;1-目录节点
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public AwVariable withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     * 旧名称
     * @return oldName
     */
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public AwVariable withParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }

    /**
     * 父节点id
     * @return parentNodeId
     */
    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public AwVariable withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 属性
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public AwVariable withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * 内置函数枚举
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public AwVariable withSensitiveInfoSetterTime(String sensitiveInfoSetterTime) {
        this.sensitiveInfoSetterTime = sensitiveInfoSetterTime;
        return this;
    }

    /**
     * 敏感参数设置时间
     * @return sensitiveInfoSetterTime
     */
    public String getSensitiveInfoSetterTime() {
        return sensitiveInfoSetterTime;
    }

    public void setSensitiveInfoSetterTime(String sensitiveInfoSetterTime) {
        this.sensitiveInfoSetterTime = sensitiveInfoSetterTime;
    }

    public AwVariable withSensitiveInfoSetterUser(String sensitiveInfoSetterUser) {
        this.sensitiveInfoSetterUser = sensitiveInfoSetterUser;
        return this;
    }

    /**
     * 敏感参数设置者名称
     * @return sensitiveInfoSetterUser
     */
    public String getSensitiveInfoSetterUser() {
        return sensitiveInfoSetterUser;
    }

    public void setSensitiveInfoSetterUser(String sensitiveInfoSetterUser) {
        this.sensitiveInfoSetterUser = sensitiveInfoSetterUser;
    }

    public AwVariable withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AwVariable withVariableType(Integer variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 变量类型（0：text，10-16：7个内置函数）
     * @return variableType
     */
    public Integer getVariableType() {
        return variableType;
    }

    public void setVariableType(Integer variableType) {
        this.variableType = variableType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AwVariable that = (AwVariable) obj;
        return Objects.equals(this.byOrder, that.byOrder)
            && Objects.equals(this.currentPermission, that.currentPermission)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dynamicParam, that.dynamicParam)
            && Objects.equals(this.dynamicParamFlag, that.dynamicParamFlag)
            && Objects.equals(this.functionParams, that.functionParams)
            && Objects.equals(this.functionArg, that.functionArg)
            && Objects.equals(this.functionType, that.functionType)
            && Objects.equals(this.isSensitiveInfo, that.isSensitiveInfo)
            && Objects.equals(this.isSensitiveModified, that.isSensitiveModified)
            && Objects.equals(this.isOutPut, that.isOutPut) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.oldName, that.oldName) && Objects.equals(this.parentNodeId, that.parentNodeId)
            && Objects.equals(this.property, that.property) && Objects.equals(this.regex, that.regex)
            && Objects.equals(this.sensitiveInfoSetterTime, that.sensitiveInfoSetterTime)
            && Objects.equals(this.sensitiveInfoSetterUser, that.sensitiveInfoSetterUser)
            && Objects.equals(this.type, that.type) && Objects.equals(this.variableType, that.variableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byOrder,
            currentPermission,
            description,
            dynamicParam,
            dynamicParamFlag,
            functionParams,
            functionArg,
            functionType,
            isSensitiveInfo,
            isSensitiveModified,
            isOutPut,
            name,
            nodeId,
            nodeType,
            oldName,
            parentNodeId,
            property,
            regex,
            sensitiveInfoSetterTime,
            sensitiveInfoSetterUser,
            type,
            variableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwVariable {\n");
        sb.append("    byOrder: ").append(toIndentedString(byOrder)).append("\n");
        sb.append("    currentPermission: ").append(toIndentedString(currentPermission)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dynamicParam: ").append(toIndentedString(dynamicParam)).append("\n");
        sb.append("    dynamicParamFlag: ").append(toIndentedString(dynamicParamFlag)).append("\n");
        sb.append("    functionParams: ").append(toIndentedString(functionParams)).append("\n");
        sb.append("    functionArg: ").append(toIndentedString(functionArg)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    isSensitiveInfo: ").append(toIndentedString(isSensitiveInfo)).append("\n");
        sb.append("    isSensitiveModified: ").append(toIndentedString(isSensitiveModified)).append("\n");
        sb.append("    isOutPut: ").append(toIndentedString(isOutPut)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
        sb.append("    parentNodeId: ").append(toIndentedString(parentNodeId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("    sensitiveInfoSetterTime: ").append(toIndentedString(sensitiveInfoSetterTime)).append("\n");
        sb.append("    sensitiveInfoSetterUser: ").append(toIndentedString(sensitiveInfoSetterUser)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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

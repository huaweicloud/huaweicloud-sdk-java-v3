package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BasicAwRes
 */
public class BasicAwRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_code")

    private String awCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_description")

    private String awDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_mark")

    private Integer awMark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_operationid")

    private String awOperationid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_tags")

    private String awTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_type")

    private Integer awType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_uniqueid")

    private String awUniqueid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_order")

    private Integer byOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_string")

    private String createTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private String deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_user")

    private String deleteUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_check_point_list")

    private List<Object> dftCheckPointList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_custom_header")

    private List<Object> dftCustomHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_retry_interval")

    private String dftRetryInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_retry_times")

    private String dftRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dft_variable_list")

    private List<Object> dftVariableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private Object extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_code")

    private Integer hasCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_package")

    private List<String> importPackage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_label")

    private String interfaceLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Integer isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameView")

    private String nameView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_project")

    private String originProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type_and_dft_value")

    private List<Object> paramTypeAndDftValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private String protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_lib")

    private Object publicAwLib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_lib_id")

    private String publicAwLibId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_type")

    private String returnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_type")

    private Integer specialType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmssCaseNumber")

    private String tmssCaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_case_id")

    private String tmssCaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_string")

    private String updateTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warningMsg")

    private String warningMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yamlName")

    private String yamlName;

    public BasicAwRes withAwCode(String awCode) {
        this.awCode = awCode;
        return this;
    }

    /**
     * Get awCode
     * @return awCode
     */
    public String getAwCode() {
        return awCode;
    }

    public void setAwCode(String awCode) {
        this.awCode = awCode;
    }

    public BasicAwRes withAwDescription(String awDescription) {
        this.awDescription = awDescription;
        return this;
    }

    /**
     * Get awDescription
     * @return awDescription
     */
    public String getAwDescription() {
        return awDescription;
    }

    public void setAwDescription(String awDescription) {
        this.awDescription = awDescription;
    }

    public BasicAwRes withAwMark(Integer awMark) {
        this.awMark = awMark;
        return this;
    }

    /**
     * Get awMark
     * @return awMark
     */
    public Integer getAwMark() {
        return awMark;
    }

    public void setAwMark(Integer awMark) {
        this.awMark = awMark;
    }

    public BasicAwRes withAwOperationid(String awOperationid) {
        this.awOperationid = awOperationid;
        return this;
    }

    /**
     * Get awOperationid
     * @return awOperationid
     */
    public String getAwOperationid() {
        return awOperationid;
    }

    public void setAwOperationid(String awOperationid) {
        this.awOperationid = awOperationid;
    }

    public BasicAwRes withAwTags(String awTags) {
        this.awTags = awTags;
        return this;
    }

    /**
     * Get awTags
     * @return awTags
     */
    public String getAwTags() {
        return awTags;
    }

    public void setAwTags(String awTags) {
        this.awTags = awTags;
    }

    public BasicAwRes withAwType(Integer awType) {
        this.awType = awType;
        return this;
    }

    /**
     * Get awType
     * @return awType
     */
    public Integer getAwType() {
        return awType;
    }

    public void setAwType(Integer awType) {
        this.awType = awType;
    }

    public BasicAwRes withAwUniqueid(String awUniqueid) {
        this.awUniqueid = awUniqueid;
        return this;
    }

    /**
     * Get awUniqueid
     * @return awUniqueid
     */
    public String getAwUniqueid() {
        return awUniqueid;
    }

    public void setAwUniqueid(String awUniqueid) {
        this.awUniqueid = awUniqueid;
    }

    public BasicAwRes withByOrder(Integer byOrder) {
        this.byOrder = byOrder;
        return this;
    }

    /**
     * Get byOrder
     * @return byOrder
     */
    public Integer getByOrder() {
        return byOrder;
    }

    public void setByOrder(Integer byOrder) {
        this.byOrder = byOrder;
    }

    public BasicAwRes withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BasicAwRes withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * Get createTimeStamp
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public BasicAwRes withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * Get createTimeString
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public BasicAwRes withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public BasicAwRes withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * Get createUserId
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public BasicAwRes withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 更新时间
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public BasicAwRes withDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser;
        return this;
    }

    /**
     * 删除人
     * @return deleteUser
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser;
    }

    public BasicAwRes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BasicAwRes withDftCheckPointList(List<Object> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
        return this;
    }

    public BasicAwRes addDftCheckPointListItem(Object dftCheckPointListItem) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        this.dftCheckPointList.add(dftCheckPointListItem);
        return this;
    }

    public BasicAwRes withDftCheckPointList(Consumer<List<Object>> dftCheckPointListSetter) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        dftCheckPointListSetter.accept(this.dftCheckPointList);
        return this;
    }

    /**
     * Get dftCheckPointList
     * @return dftCheckPointList
     */
    public List<Object> getDftCheckPointList() {
        return dftCheckPointList;
    }

    public void setDftCheckPointList(List<Object> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
    }

    public BasicAwRes withDftCustomHeader(List<Object> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
        return this;
    }

    public BasicAwRes addDftCustomHeaderItem(Object dftCustomHeaderItem) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        this.dftCustomHeader.add(dftCustomHeaderItem);
        return this;
    }

    public BasicAwRes withDftCustomHeader(Consumer<List<Object>> dftCustomHeaderSetter) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        dftCustomHeaderSetter.accept(this.dftCustomHeader);
        return this;
    }

    /**
     * Get dftCustomHeader
     * @return dftCustomHeader
     */
    public List<Object> getDftCustomHeader() {
        return dftCustomHeader;
    }

    public void setDftCustomHeader(List<Object> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
    }

    public BasicAwRes withDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
        return this;
    }

    /**
     * Get dftRetryInterval
     * @return dftRetryInterval
     */
    public String getDftRetryInterval() {
        return dftRetryInterval;
    }

    public void setDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
    }

    public BasicAwRes withDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
        return this;
    }

    /**
     * Get dftRetryTimes
     * @return dftRetryTimes
     */
    public String getDftRetryTimes() {
        return dftRetryTimes;
    }

    public void setDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
    }

    public BasicAwRes withDftVariableList(List<Object> dftVariableList) {
        this.dftVariableList = dftVariableList;
        return this;
    }

    public BasicAwRes addDftVariableListItem(Object dftVariableListItem) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        this.dftVariableList.add(dftVariableListItem);
        return this;
    }

    public BasicAwRes withDftVariableList(Consumer<List<Object>> dftVariableListSetter) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        dftVariableListSetter.accept(this.dftVariableList);
        return this;
    }

    /**
     * Get dftVariableList
     * @return dftVariableList
     */
    public List<Object> getDftVariableList() {
        return dftVariableList;
    }

    public void setDftVariableList(List<Object> dftVariableList) {
        this.dftVariableList = dftVariableList;
    }

    public BasicAwRes withExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    public BasicAwRes withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get groupName
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BasicAwRes withHasCode(Integer hasCode) {
        this.hasCode = hasCode;
        return this;
    }

    /**
     * Get hasCode
     * @return hasCode
     */
    public Integer getHasCode() {
        return hasCode;
    }

    public void setHasCode(Integer hasCode) {
        this.hasCode = hasCode;
    }

    public BasicAwRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicAwRes withImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
        return this;
    }

    public BasicAwRes addImportPackageItem(String importPackageItem) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        this.importPackage.add(importPackageItem);
        return this;
    }

    public BasicAwRes withImportPackage(Consumer<List<String>> importPackageSetter) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        importPackageSetter.accept(this.importPackage);
        return this;
    }

    /**
     * Get importPackage
     * @return importPackage
     */
    public List<String> getImportPackage() {
        return importPackage;
    }

    public void setImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
    }

    public BasicAwRes withInterfaceLabel(String interfaceLabel) {
        this.interfaceLabel = interfaceLabel;
        return this;
    }

    /**
     * Get interfaceLabel
     * @return interfaceLabel
     */
    public String getInterfaceLabel() {
        return interfaceLabel;
    }

    public void setInterfaceLabel(String interfaceLabel) {
        this.interfaceLabel = interfaceLabel;
    }

    public BasicAwRes withIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * Get isFavorite
     * @return isFavorite
     */
    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    public BasicAwRes withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public BasicAwRes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicAwRes withNameView(String nameView) {
        this.nameView = nameView;
        return this;
    }

    /**
     * Get nameView
     * @return nameView
     */
    public String getNameView() {
        return nameView;
    }

    public void setNameView(String nameView) {
        this.nameView = nameView;
    }

    public BasicAwRes withOriginProject(String originProject) {
        this.originProject = originProject;
        return this;
    }

    /**
     * Get originProject
     * @return originProject
     */
    public String getOriginProject() {
        return originProject;
    }

    public void setOriginProject(String originProject) {
        this.originProject = originProject;
    }

    public BasicAwRes withParamTypeAndDftValue(List<Object> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
        return this;
    }

    public BasicAwRes addParamTypeAndDftValueItem(Object paramTypeAndDftValueItem) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        this.paramTypeAndDftValue.add(paramTypeAndDftValueItem);
        return this;
    }

    public BasicAwRes withParamTypeAndDftValue(Consumer<List<Object>> paramTypeAndDftValueSetter) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        paramTypeAndDftValueSetter.accept(this.paramTypeAndDftValue);
        return this;
    }

    /**
     * Get paramTypeAndDftValue
     * @return paramTypeAndDftValue
     */
    public List<Object> getParamTypeAndDftValue() {
        return paramTypeAndDftValue;
    }

    public void setParamTypeAndDftValue(List<Object> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
    }

    public BasicAwRes withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BasicAwRes withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get protocolType
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public BasicAwRes withPublicAwLib(Object publicAwLib) {
        this.publicAwLib = publicAwLib;
        return this;
    }

    /**
     * Get publicAwLib
     * @return publicAwLib
     */
    public Object getPublicAwLib() {
        return publicAwLib;
    }

    public void setPublicAwLib(Object publicAwLib) {
        this.publicAwLib = publicAwLib;
    }

    public BasicAwRes withPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
        return this;
    }

    /**
     * Get publicAwLibId
     * @return publicAwLibId
     */
    public String getPublicAwLibId() {
        return publicAwLibId;
    }

    public void setPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
    }

    public BasicAwRes withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BasicAwRes withReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * Get returnType
     * @return returnType
     */
    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public BasicAwRes withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * Get rootId
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public BasicAwRes withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BasicAwRes withSpecialType(Integer specialType) {
        this.specialType = specialType;
        return this;
    }

    /**
     * Get specialType
     * @return specialType
     */
    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

    public BasicAwRes withTmssCaseNumber(String tmssCaseNumber) {
        this.tmssCaseNumber = tmssCaseNumber;
        return this;
    }

    /**
     * Get tmssCaseNumber
     * @return tmssCaseNumber
     */
    public String getTmssCaseNumber() {
        return tmssCaseNumber;
    }

    public void setTmssCaseNumber(String tmssCaseNumber) {
        this.tmssCaseNumber = tmssCaseNumber;
    }

    public BasicAwRes withTmssCaseId(String tmssCaseId) {
        this.tmssCaseId = tmssCaseId;
        return this;
    }

    /**
     * Get tmssCaseId
     * @return tmssCaseId
     */
    public String getTmssCaseId() {
        return tmssCaseId;
    }

    public void setTmssCaseId(String tmssCaseId) {
        this.tmssCaseId = tmssCaseId;
    }

    public BasicAwRes withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public BasicAwRes withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * Get updateTimeStamp
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public BasicAwRes withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * Get updateTimeString
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public BasicAwRes withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public BasicAwRes withWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
        return this;
    }

    /**
     * Get warningMsg
     * @return warningMsg
     */
    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
    }

    public BasicAwRes withYamlName(String yamlName) {
        this.yamlName = yamlName;
        return this;
    }

    /**
     * Get yamlName
     * @return yamlName
     */
    public String getYamlName() {
        return yamlName;
    }

    public void setYamlName(String yamlName) {
        this.yamlName = yamlName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicAwRes that = (BasicAwRes) obj;
        return Objects.equals(this.awCode, that.awCode) && Objects.equals(this.awDescription, that.awDescription)
            && Objects.equals(this.awMark, that.awMark) && Objects.equals(this.awOperationid, that.awOperationid)
            && Objects.equals(this.awTags, that.awTags) && Objects.equals(this.awType, that.awType)
            && Objects.equals(this.awUniqueid, that.awUniqueid) && Objects.equals(this.byOrder, that.byOrder)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.deleteTime, that.deleteTime) && Objects.equals(this.deleteUser, that.deleteUser)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dftCheckPointList, that.dftCheckPointList)
            && Objects.equals(this.dftCustomHeader, that.dftCustomHeader)
            && Objects.equals(this.dftRetryInterval, that.dftRetryInterval)
            && Objects.equals(this.dftRetryTimes, that.dftRetryTimes)
            && Objects.equals(this.dftVariableList, that.dftVariableList)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.hasCode, that.hasCode) && Objects.equals(this.id, that.id)
            && Objects.equals(this.importPackage, that.importPackage)
            && Objects.equals(this.interfaceLabel, that.interfaceLabel)
            && Objects.equals(this.isFavorite, that.isFavorite) && Objects.equals(this.method, that.method)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameView, that.nameView)
            && Objects.equals(this.originProject, that.originProject)
            && Objects.equals(this.paramTypeAndDftValue, that.paramTypeAndDftValue)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.publicAwLib, that.publicAwLib)
            && Objects.equals(this.publicAwLibId, that.publicAwLibId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.returnType, that.returnType) && Objects.equals(this.rootId, that.rootId)
            && Objects.equals(this.source, that.source) && Objects.equals(this.specialType, that.specialType)
            && Objects.equals(this.tmssCaseNumber, that.tmssCaseNumber)
            && Objects.equals(this.tmssCaseId, that.tmssCaseId) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser) && Objects.equals(this.warningMsg, that.warningMsg)
            && Objects.equals(this.yamlName, that.yamlName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awCode,
            awDescription,
            awMark,
            awOperationid,
            awTags,
            awType,
            awUniqueid,
            byOrder,
            createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            createUserId,
            deleteTime,
            deleteUser,
            description,
            dftCheckPointList,
            dftCustomHeader,
            dftRetryInterval,
            dftRetryTimes,
            dftVariableList,
            extraInfo,
            groupName,
            hasCode,
            id,
            importPackage,
            interfaceLabel,
            isFavorite,
            method,
            name,
            nameView,
            originProject,
            paramTypeAndDftValue,
            projectId,
            protocolType,
            publicAwLib,
            publicAwLibId,
            region,
            returnType,
            rootId,
            source,
            specialType,
            tmssCaseNumber,
            tmssCaseId,
            updateTime,
            updateTimeStamp,
            updateTimeString,
            updateUser,
            warningMsg,
            yamlName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicAwRes {\n");
        sb.append("    awCode: ").append(toIndentedString(awCode)).append("\n");
        sb.append("    awDescription: ").append(toIndentedString(awDescription)).append("\n");
        sb.append("    awMark: ").append(toIndentedString(awMark)).append("\n");
        sb.append("    awOperationid: ").append(toIndentedString(awOperationid)).append("\n");
        sb.append("    awTags: ").append(toIndentedString(awTags)).append("\n");
        sb.append("    awType: ").append(toIndentedString(awType)).append("\n");
        sb.append("    awUniqueid: ").append(toIndentedString(awUniqueid)).append("\n");
        sb.append("    byOrder: ").append(toIndentedString(byOrder)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    deleteUser: ").append(toIndentedString(deleteUser)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dftCheckPointList: ").append(toIndentedString(dftCheckPointList)).append("\n");
        sb.append("    dftCustomHeader: ").append(toIndentedString(dftCustomHeader)).append("\n");
        sb.append("    dftRetryInterval: ").append(toIndentedString(dftRetryInterval)).append("\n");
        sb.append("    dftRetryTimes: ").append(toIndentedString(dftRetryTimes)).append("\n");
        sb.append("    dftVariableList: ").append(toIndentedString(dftVariableList)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hasCode: ").append(toIndentedString(hasCode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    importPackage: ").append(toIndentedString(importPackage)).append("\n");
        sb.append("    interfaceLabel: ").append(toIndentedString(interfaceLabel)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameView: ").append(toIndentedString(nameView)).append("\n");
        sb.append("    originProject: ").append(toIndentedString(originProject)).append("\n");
        sb.append("    paramTypeAndDftValue: ").append(toIndentedString(paramTypeAndDftValue)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    publicAwLib: ").append(toIndentedString(publicAwLib)).append("\n");
        sb.append("    publicAwLibId: ").append(toIndentedString(publicAwLibId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    specialType: ").append(toIndentedString(specialType)).append("\n");
        sb.append("    tmssCaseNumber: ").append(toIndentedString(tmssCaseNumber)).append("\n");
        sb.append("    tmssCaseId: ").append(toIndentedString(tmssCaseId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    updateTimeString: ").append(toIndentedString(updateTimeString)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    warningMsg: ").append(toIndentedString(warningMsg)).append("\n");
        sb.append("    yamlName: ").append(toIndentedString(yamlName)).append("\n");
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

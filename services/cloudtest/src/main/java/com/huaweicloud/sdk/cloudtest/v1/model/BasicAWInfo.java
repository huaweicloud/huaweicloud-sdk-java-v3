package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BasicAWInfo
 */
public class BasicAWInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_code")

    private String awCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_description")

    private String awDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_ins_list")

    private List<AwInstanceRes> awInsList = null;

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
    @JsonProperty(value = "cata_type")

    private Integer cataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_list")

    private List<BasicAWInfo> childList = null;

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
    @JsonProperty(value = "custom_aw_libs")

    private List<UploadFileRes> customAwLibs = null;

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
    @JsonProperty(value = "extra_info")

    private JsonNode extraInfo;

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
    @JsonProperty(value = "is_folder")

    private String isFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword_variable_value")

    private List<AwVariable> keywordVariableValue = null;

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
    @JsonProperty(value = "output_param_list")

    private List<AwVariable> outputParamList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type_and_dft_value")

    private List<AwParam> paramTypeAndDftValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private String protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_lib")

    private PublicAwLibRes publicAwLib;

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
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Integer totalSize;

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

    public BasicAWInfo withAwCode(String awCode) {
        this.awCode = awCode;
        return this;
    }

    /**
     * aw代码, hasCode为1时有效
     * @return awCode
     */
    public String getAwCode() {
        return awCode;
    }

    public void setAwCode(String awCode) {
        this.awCode = awCode;
    }

    public BasicAWInfo withAwDescription(String awDescription) {
        this.awDescription = awDescription;
        return this;
    }

    /**
     * 模板描述
     * @return awDescription
     */
    public String getAwDescription() {
        return awDescription;
    }

    public void setAwDescription(String awDescription) {
        this.awDescription = awDescription;
    }

    public BasicAWInfo withAwInsList(List<AwInstanceRes> awInsList) {
        this.awInsList = awInsList;
        return this;
    }

    public BasicAWInfo addAwInsListItem(AwInstanceRes awInsListItem) {
        if (this.awInsList == null) {
            this.awInsList = new ArrayList<>();
        }
        this.awInsList.add(awInsListItem);
        return this;
    }

    public BasicAWInfo withAwInsList(Consumer<List<AwInstanceRes>> awInsListSetter) {
        if (this.awInsList == null) {
            this.awInsList = new ArrayList<>();
        }
        awInsListSetter.accept(this.awInsList);
        return this;
    }

    /**
     * 组合aw包含的aw实例信息，awType为2时该字段有效
     * @return awInsList
     */
    public List<AwInstanceRes> getAwInsList() {
        return awInsList;
    }

    public void setAwInsList(List<AwInstanceRes> awInsList) {
        this.awInsList = awInsList;
    }

    public BasicAWInfo withAwMark(Integer awMark) {
        this.awMark = awMark;
        return this;
    }

    /**
     * aw标记 0-normal；1-new；2-update 3-delete
     * @return awMark
     */
    public Integer getAwMark() {
        return awMark;
    }

    public void setAwMark(Integer awMark) {
        this.awMark = awMark;
    }

    public BasicAWInfo withAwOperationid(String awOperationid) {
        this.awOperationid = awOperationid;
        return this;
    }

    /**
     * 接口的operationId
     * @return awOperationid
     */
    public String getAwOperationid() {
        return awOperationid;
    }

    public void setAwOperationid(String awOperationid) {
        this.awOperationid = awOperationid;
    }

    public BasicAWInfo withAwTags(String awTags) {
        this.awTags = awTags;
        return this;
    }

    /**
     * 接口的tags
     * @return awTags
     */
    public String getAwTags() {
        return awTags;
    }

    public void setAwTags(String awTags) {
        this.awTags = awTags;
    }

    public BasicAWInfo withAwType(Integer awType) {
        this.awType = awType;
        return this;
    }

    /**
     * AW类型1-普通aw,2-组合aw,3-导入aw
     * @return awType
     */
    public Integer getAwType() {
        return awType;
    }

    public void setAwType(Integer awType) {
        this.awType = awType;
    }

    public BasicAWInfo withAwUniqueid(String awUniqueid) {
        this.awUniqueid = awUniqueid;
        return this;
    }

    /**
     * awOperationId_awTags的拼接
     * @return awUniqueid
     */
    public String getAwUniqueid() {
        return awUniqueid;
    }

    public void setAwUniqueid(String awUniqueid) {
        this.awUniqueid = awUniqueid;
    }

    public BasicAWInfo withByOrder(Integer byOrder) {
        this.byOrder = byOrder;
        return this;
    }

    /**
     * 顺序
     * @return byOrder
     */
    public Integer getByOrder() {
        return byOrder;
    }

    public void setByOrder(Integer byOrder) {
        this.byOrder = byOrder;
    }

    public BasicAWInfo withCataType(Integer cataType) {
        this.cataType = cataType;
        return this;
    }

    /**
     * 目录层级
     * @return cataType
     */
    public Integer getCataType() {
        return cataType;
    }

    public void setCataType(Integer cataType) {
        this.cataType = cataType;
    }

    public BasicAWInfo withChildList(List<BasicAWInfo> childList) {
        this.childList = childList;
        return this;
    }

    public BasicAWInfo addChildListItem(BasicAWInfo childListItem) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        this.childList.add(childListItem);
        return this;
    }

    public BasicAWInfo withChildList(Consumer<List<BasicAWInfo>> childListSetter) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        childListSetter.accept(this.childList);
        return this;
    }

    /**
     * 新增childList以支持嵌套层级结构
     * @return childList
     */
    public List<BasicAWInfo> getChildList() {
        return childList;
    }

    public void setChildList(List<BasicAWInfo> childList) {
        this.childList = childList;
    }

    public BasicAWInfo withCreateTime(String createTime) {
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

    public BasicAWInfo withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 时间戳字段
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public BasicAWInfo withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * 时间字符串
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public BasicAWInfo withCreateUser(String createUser) {
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

    public BasicAWInfo withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 创建人id
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public BasicAWInfo withCustomAwLibs(List<UploadFileRes> customAwLibs) {
        this.customAwLibs = customAwLibs;
        return this;
    }

    public BasicAWInfo addCustomAwLibsItem(UploadFileRes customAwLibsItem) {
        if (this.customAwLibs == null) {
            this.customAwLibs = new ArrayList<>();
        }
        this.customAwLibs.add(customAwLibsItem);
        return this;
    }

    public BasicAWInfo withCustomAwLibs(Consumer<List<UploadFileRes>> customAwLibsSetter) {
        if (this.customAwLibs == null) {
            this.customAwLibs = new ArrayList<>();
        }
        customAwLibsSetter.accept(this.customAwLibs);
        return this;
    }

    /**
     * aw库的文件列表
     * @return customAwLibs
     */
    public List<UploadFileRes> getCustomAwLibs() {
        return customAwLibs;
    }

    public void setCustomAwLibs(List<UploadFileRes> customAwLibs) {
        this.customAwLibs = customAwLibs;
    }

    public BasicAWInfo withDeleteTime(String deleteTime) {
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

    public BasicAWInfo withDeleteUser(String deleteUser) {
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

    public BasicAWInfo withDescription(String description) {
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

    public BasicAWInfo withDftCheckPointList(List<CheckPoint> dftCheckPointList) {
        this.dftCheckPointList = dftCheckPointList;
        return this;
    }

    public BasicAWInfo addDftCheckPointListItem(CheckPoint dftCheckPointListItem) {
        if (this.dftCheckPointList == null) {
            this.dftCheckPointList = new ArrayList<>();
        }
        this.dftCheckPointList.add(dftCheckPointListItem);
        return this;
    }

    public BasicAWInfo withDftCheckPointList(Consumer<List<CheckPoint>> dftCheckPointListSetter) {
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

    public BasicAWInfo withDftCustomHeader(List<AwParam> dftCustomHeader) {
        this.dftCustomHeader = dftCustomHeader;
        return this;
    }

    public BasicAWInfo addDftCustomHeaderItem(AwParam dftCustomHeaderItem) {
        if (this.dftCustomHeader == null) {
            this.dftCustomHeader = new ArrayList<>();
        }
        this.dftCustomHeader.add(dftCustomHeaderItem);
        return this;
    }

    public BasicAWInfo withDftCustomHeader(Consumer<List<AwParam>> dftCustomHeaderSetter) {
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

    public BasicAWInfo withDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
        return this;
    }

    /**
     * 重试间隔时间 (ms) 为空表示不等待
     * @return dftRetryInterval
     */
    public String getDftRetryInterval() {
        return dftRetryInterval;
    }

    public void setDftRetryInterval(String dftRetryInterval) {
        this.dftRetryInterval = dftRetryInterval;
    }

    public BasicAWInfo withDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
        return this;
    }

    /**
     * 重试次数
     * @return dftRetryTimes
     */
    public String getDftRetryTimes() {
        return dftRetryTimes;
    }

    public void setDftRetryTimes(String dftRetryTimes) {
        this.dftRetryTimes = dftRetryTimes;
    }

    public BasicAWInfo withDftVariableList(List<AwVariable> dftVariableList) {
        this.dftVariableList = dftVariableList;
        return this;
    }

    public BasicAWInfo addDftVariableListItem(AwVariable dftVariableListItem) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        this.dftVariableList.add(dftVariableListItem);
        return this;
    }

    public BasicAWInfo withDftVariableList(Consumer<List<AwVariable>> dftVariableListSetter) {
        if (this.dftVariableList == null) {
            this.dftVariableList = new ArrayList<>();
        }
        dftVariableListSetter.accept(this.dftVariableList);
        return this;
    }

    /**
     * 默认变量信息List
     * @return dftVariableList
     */
    public List<AwVariable> getDftVariableList() {
        return dftVariableList;
    }

    public void setDftVariableList(List<AwVariable> dftVariableList) {
        this.dftVariableList = dftVariableList;
    }

    public BasicAWInfo withExtraInfo(JsonNode extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public BasicAWInfo withExtraInfo(Consumer<JsonNode> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new JsonNode();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public JsonNode getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(JsonNode extraInfo) {
        this.extraInfo = extraInfo;
    }

    public BasicAWInfo withGroupName(String groupName) {
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

    public BasicAWInfo withHasCode(Integer hasCode) {
        this.hasCode = hasCode;
        return this;
    }

    /**
     * 是否自带代码 0-不自带代码，该aw依赖source字段中的源；1-自带代码
     * @return hasCode
     */
    public Integer getHasCode() {
        return hasCode;
    }

    public void setHasCode(Integer hasCode) {
        this.hasCode = hasCode;
    }

    public BasicAWInfo withId(String id) {
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

    public BasicAWInfo withImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
        return this;
    }

    public BasicAWInfo addImportPackageItem(String importPackageItem) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        this.importPackage.add(importPackageItem);
        return this;
    }

    public BasicAWInfo withImportPackage(Consumer<List<String>> importPackageSetter) {
        if (this.importPackage == null) {
            this.importPackage = new ArrayList<>();
        }
        importPackageSetter.accept(this.importPackage);
        return this;
    }

    /**
     * 导入的包
     * @return importPackage
     */
    public List<String> getImportPackage() {
        return importPackage;
    }

    public void setImportPackage(List<String> importPackage) {
        this.importPackage = importPackage;
    }

    public BasicAWInfo withInterfaceLabel(String interfaceLabel) {
        this.interfaceLabel = interfaceLabel;
        return this;
    }

    /**
     * 接口的x-extend
     * @return interfaceLabel
     */
    public String getInterfaceLabel() {
        return interfaceLabel;
    }

    public void setInterfaceLabel(String interfaceLabel) {
        this.interfaceLabel = interfaceLabel;
    }

    public BasicAWInfo withIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * 是否是当前工程的收藏aw，该字段不存数据库，每次获取时实时判断
     * @return isFavorite
     */
    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    public BasicAWInfo withIsFolder(String isFolder) {
        this.isFolder = isFolder;
        return this;
    }

    /**
     * 判断是否为文件夹的标识
     * @return isFolder
     */
    public String getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(String isFolder) {
        this.isFolder = isFolder;
    }

    public BasicAWInfo withKeywordVariableValue(List<AwVariable> keywordVariableValue) {
        this.keywordVariableValue = keywordVariableValue;
        return this;
    }

    public BasicAWInfo addKeywordVariableValueItem(AwVariable keywordVariableValueItem) {
        if (this.keywordVariableValue == null) {
            this.keywordVariableValue = new ArrayList<>();
        }
        this.keywordVariableValue.add(keywordVariableValueItem);
        return this;
    }

    public BasicAWInfo withKeywordVariableValue(Consumer<List<AwVariable>> keywordVariableValueSetter) {
        if (this.keywordVariableValue == null) {
            this.keywordVariableValue = new ArrayList<>();
        }
        keywordVariableValueSetter.accept(this.keywordVariableValue);
        return this;
    }

    /**
     * 关键字局部变量
     * @return keywordVariableValue
     */
    public List<AwVariable> getKeywordVariableValue() {
        return keywordVariableValue;
    }

    public void setKeywordVariableValue(List<AwVariable> keywordVariableValue) {
        this.keywordVariableValue = keywordVariableValue;
    }

    public BasicAWInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public BasicAWInfo withName(String name) {
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

    public BasicAWInfo withNameView(String nameView) {
        this.nameView = nameView;
        return this;
    }

    /**
     * aw在页面上显示的名字
     * @return nameView
     */
    public String getNameView() {
        return nameView;
    }

    public void setNameView(String nameView) {
        this.nameView = nameView;
    }

    public BasicAWInfo withOriginProject(String originProject) {
        this.originProject = originProject;
        return this;
    }

    /**
     * 源工程信息，如果该aw是从其他工程过来的(继承或者copy to local)
     * @return originProject
     */
    public String getOriginProject() {
        return originProject;
    }

    public void setOriginProject(String originProject) {
        this.originProject = originProject;
    }

    public BasicAWInfo withOutputParamList(List<AwVariable> outputParamList) {
        this.outputParamList = outputParamList;
        return this;
    }

    public BasicAWInfo addOutputParamListItem(AwVariable outputParamListItem) {
        if (this.outputParamList == null) {
            this.outputParamList = new ArrayList<>();
        }
        this.outputParamList.add(outputParamListItem);
        return this;
    }

    public BasicAWInfo withOutputParamList(Consumer<List<AwVariable>> outputParamListSetter) {
        if (this.outputParamList == null) {
            this.outputParamList = new ArrayList<>();
        }
        outputParamListSetter.accept(this.outputParamList);
        return this;
    }

    /**
     * 组合aw的输出参数信息，该字段不存数据库，实时获取
     * @return outputParamList
     */
    public List<AwVariable> getOutputParamList() {
        return outputParamList;
    }

    public void setOutputParamList(List<AwVariable> outputParamList) {
        this.outputParamList = outputParamList;
    }

    public BasicAWInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public BasicAWInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public BasicAWInfo withParamTypeAndDftValue(List<AwParam> paramTypeAndDftValue) {
        this.paramTypeAndDftValue = paramTypeAndDftValue;
        return this;
    }

    public BasicAWInfo addParamTypeAndDftValueItem(AwParam paramTypeAndDftValueItem) {
        if (this.paramTypeAndDftValue == null) {
            this.paramTypeAndDftValue = new ArrayList<>();
        }
        this.paramTypeAndDftValue.add(paramTypeAndDftValueItem);
        return this;
    }

    public BasicAWInfo withParamTypeAndDftValue(Consumer<List<AwParam>> paramTypeAndDftValueSetter) {
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

    public BasicAWInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * aw目录父编号
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BasicAWInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * aw目录父编号
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BasicAWInfo withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * 协议类型 (http/dsf/other)
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public BasicAWInfo withPublicAwLib(PublicAwLibRes publicAwLib) {
        this.publicAwLib = publicAwLib;
        return this;
    }

    public BasicAWInfo withPublicAwLib(Consumer<PublicAwLibRes> publicAwLibSetter) {
        if (this.publicAwLib == null) {
            this.publicAwLib = new PublicAwLibRes();
            publicAwLibSetter.accept(this.publicAwLib);
        }

        return this;
    }

    /**
     * Get publicAwLib
     * @return publicAwLib
     */
    public PublicAwLibRes getPublicAwLib() {
        return publicAwLib;
    }

    public void setPublicAwLib(PublicAwLibRes publicAwLib) {
        this.publicAwLib = publicAwLib;
    }

    public BasicAWInfo withPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
        return this;
    }

    /**
     * 所属公共aw库Id
     * @return publicAwLibId
     */
    public String getPublicAwLibId() {
        return publicAwLibId;
    }

    public void setPublicAwLibId(String publicAwLibId) {
        this.publicAwLibId = publicAwLibId;
    }

    public BasicAWInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BasicAWInfo withReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * 返回类型
     * @return returnType
     */
    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public BasicAWInfo withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * root id
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public BasicAWInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BasicAWInfo withSpecialType(Integer specialType) {
        this.specialType = specialType;
        return this;
    }

    /**
     * 特殊AW类型 0-common,10-header,1-beforeHeader
     * @return specialType
     */
    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

    public BasicAWInfo withTmssCaseNumber(String tmssCaseNumber) {
        this.tmssCaseNumber = tmssCaseNumber;
        return this;
    }

    /**
     * 关键字管理的用例编号
     * @return tmssCaseNumber
     */
    public String getTmssCaseNumber() {
        return tmssCaseNumber;
    }

    public void setTmssCaseNumber(String tmssCaseNumber) {
        this.tmssCaseNumber = tmssCaseNumber;
    }

    public BasicAWInfo withTmssCaseId(String tmssCaseId) {
        this.tmssCaseId = tmssCaseId;
        return this;
    }

    /**
     * 关键字aw管理的用例ID
     * @return tmssCaseId
     */
    public String getTmssCaseId() {
        return tmssCaseId;
    }

    public void setTmssCaseId(String tmssCaseId) {
        this.tmssCaseId = tmssCaseId;
    }

    public BasicAWInfo withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public BasicAWInfo withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总条数
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public BasicAWInfo withUpdateTime(String updateTime) {
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

    public BasicAWInfo withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public BasicAWInfo withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * 更新字符串
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public BasicAWInfo withUpdateUser(String updateUser) {
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

    public BasicAWInfo withWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
        return this;
    }

    /**
     * 警告信息
     * @return warningMsg
     */
    public String getWarningMsg() {
        return warningMsg;
    }

    public void setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
    }

    public BasicAWInfo withYamlName(String yamlName) {
        this.yamlName = yamlName;
        return this;
    }

    /**
     * 所属yaml文件名称,该字段不存库，用来记录从哪个yaml文件导入
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
        BasicAWInfo that = (BasicAWInfo) obj;
        return Objects.equals(this.awCode, that.awCode) && Objects.equals(this.awDescription, that.awDescription)
            && Objects.equals(this.awInsList, that.awInsList) && Objects.equals(this.awMark, that.awMark)
            && Objects.equals(this.awOperationid, that.awOperationid) && Objects.equals(this.awTags, that.awTags)
            && Objects.equals(this.awType, that.awType) && Objects.equals(this.awUniqueid, that.awUniqueid)
            && Objects.equals(this.byOrder, that.byOrder) && Objects.equals(this.cataType, that.cataType)
            && Objects.equals(this.childList, that.childList) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.customAwLibs, that.customAwLibs) && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.deleteUser, that.deleteUser) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dftCheckPointList, that.dftCheckPointList)
            && Objects.equals(this.dftCustomHeader, that.dftCustomHeader)
            && Objects.equals(this.dftRetryInterval, that.dftRetryInterval)
            && Objects.equals(this.dftRetryTimes, that.dftRetryTimes)
            && Objects.equals(this.dftVariableList, that.dftVariableList)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.hasCode, that.hasCode) && Objects.equals(this.id, that.id)
            && Objects.equals(this.importPackage, that.importPackage)
            && Objects.equals(this.interfaceLabel, that.interfaceLabel)
            && Objects.equals(this.isFavorite, that.isFavorite) && Objects.equals(this.isFolder, that.isFolder)
            && Objects.equals(this.keywordVariableValue, that.keywordVariableValue)
            && Objects.equals(this.method, that.method) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nameView, that.nameView) && Objects.equals(this.originProject, that.originProject)
            && Objects.equals(this.outputParamList, that.outputParamList) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.paramTypeAndDftValue, that.paramTypeAndDftValue)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.publicAwLib, that.publicAwLib)
            && Objects.equals(this.publicAwLibId, that.publicAwLibId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.returnType, that.returnType) && Objects.equals(this.rootId, that.rootId)
            && Objects.equals(this.source, that.source) && Objects.equals(this.specialType, that.specialType)
            && Objects.equals(this.tmssCaseNumber, that.tmssCaseNumber)
            && Objects.equals(this.tmssCaseId, that.tmssCaseId) && Objects.equals(this.totalPage, that.totalPage)
            && Objects.equals(this.totalSize, that.totalSize) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser) && Objects.equals(this.warningMsg, that.warningMsg)
            && Objects.equals(this.yamlName, that.yamlName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awCode,
            awDescription,
            awInsList,
            awMark,
            awOperationid,
            awTags,
            awType,
            awUniqueid,
            byOrder,
            cataType,
            childList,
            createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            createUserId,
            customAwLibs,
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
            isFolder,
            keywordVariableValue,
            method,
            name,
            nameView,
            originProject,
            outputParamList,
            pageNo,
            pageSize,
            paramTypeAndDftValue,
            parentId,
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
            totalPage,
            totalSize,
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
        sb.append("class BasicAWInfo {\n");
        sb.append("    awCode: ").append(toIndentedString(awCode)).append("\n");
        sb.append("    awDescription: ").append(toIndentedString(awDescription)).append("\n");
        sb.append("    awInsList: ").append(toIndentedString(awInsList)).append("\n");
        sb.append("    awMark: ").append(toIndentedString(awMark)).append("\n");
        sb.append("    awOperationid: ").append(toIndentedString(awOperationid)).append("\n");
        sb.append("    awTags: ").append(toIndentedString(awTags)).append("\n");
        sb.append("    awType: ").append(toIndentedString(awType)).append("\n");
        sb.append("    awUniqueid: ").append(toIndentedString(awUniqueid)).append("\n");
        sb.append("    byOrder: ").append(toIndentedString(byOrder)).append("\n");
        sb.append("    cataType: ").append(toIndentedString(cataType)).append("\n");
        sb.append("    childList: ").append(toIndentedString(childList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    customAwLibs: ").append(toIndentedString(customAwLibs)).append("\n");
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
        sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
        sb.append("    keywordVariableValue: ").append(toIndentedString(keywordVariableValue)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameView: ").append(toIndentedString(nameView)).append("\n");
        sb.append("    originProject: ").append(toIndentedString(originProject)).append("\n");
        sb.append("    outputParamList: ").append(toIndentedString(outputParamList)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    paramTypeAndDftValue: ").append(toIndentedString(paramTypeAndDftValue)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

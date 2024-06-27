package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TmssTestcase
 */
public class TmssTestcase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activity_id")

    private String activityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied_product")

    private String appliedProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_type")

    private String autoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cataId")

    private String cataId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_1")

    private String customField1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_10")

    private String customField10;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_11")

    private String customField11;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_12")

    private String customField12;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_13")

    private String customField13;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_14")

    private String customField14;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_15")

    private String customField15;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_16")

    private String customField16;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_17")

    private String customField17;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_18")

    private String customField18;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_19")

    private String customField19;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_2")

    private String customField2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_20")

    private String customField20;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_21")

    private String customField21;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_22")

    private String customField22;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_23")

    private String customField23;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_24")

    private String customField24;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_25")

    private String customField25;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_3")

    private String customField3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_4")

    private String customField4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_5")

    private String customField5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_6")

    private String customField6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_7")

    private String customField7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_8")

    private String customField8;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_9")

    private String customField9;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_relationid")

    private String drRelationid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private String envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exe_platform")

    private String exePlatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_output")

    private String expectOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_path")

    private String featurePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isKeyWord")

    private Integer isKeyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_contract_testcase")

    private String isContractTestcase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_paraValidator_testcase")

    private String isParaValidatorTestcase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelId")

    private List<String> labelId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modifier")

    private String lastModifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_result")

    private String lastResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market")

    private String market;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moduleId")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkScriptName")

    private String networkScriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "originUri")

    private String originUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerId")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseDev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseId")

    private String releaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<TmssStep> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svnScriptPath")

    private String svnScriptPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_feature")

    private String testFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type")

    private Integer testType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    public TmssTestcase withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * 活动id
     * @return activityId
     */
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public TmssTestcase withAppliedProduct(String appliedProduct) {
        this.appliedProduct = appliedProduct;
        return this;
    }

    /**
     * 应用产品
     * @return appliedProduct
     */
    public String getAppliedProduct() {
        return appliedProduct;
    }

    public void setAppliedProduct(String appliedProduct) {
        this.appliedProduct = appliedProduct;
    }

    public TmssTestcase withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 创建人
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TmssTestcase withAutoType(String autoType) {
        this.autoType = autoType;
        return this;
    }

    /**
     * 自动化类型
     * @return autoType
     */
    public String getAutoType() {
        return autoType;
    }

    public void setAutoType(String autoType) {
        this.autoType = autoType;
    }

    public TmssTestcase withCataId(String cataId) {
        this.cataId = cataId;
        return this;
    }

    /**
     * 用例分类ID
     * @return cataId
     */
    public String getCataId() {
        return cataId;
    }

    public void setCataId(String cataId) {
        this.cataId = cataId;
    }

    public TmssTestcase withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建日期
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TmssTestcase withCustomField1(String customField1) {
        this.customField1 = customField1;
        return this;
    }

    /**
     * Get customField1
     * @return customField1
     */
    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    public TmssTestcase withCustomField10(String customField10) {
        this.customField10 = customField10;
        return this;
    }

    /**
     * Get customField10
     * @return customField10
     */
    public String getCustomField10() {
        return customField10;
    }

    public void setCustomField10(String customField10) {
        this.customField10 = customField10;
    }

    public TmssTestcase withCustomField11(String customField11) {
        this.customField11 = customField11;
        return this;
    }

    /**
     * Get customField11
     * @return customField11
     */
    public String getCustomField11() {
        return customField11;
    }

    public void setCustomField11(String customField11) {
        this.customField11 = customField11;
    }

    public TmssTestcase withCustomField12(String customField12) {
        this.customField12 = customField12;
        return this;
    }

    /**
     * Get customField12
     * @return customField12
     */
    public String getCustomField12() {
        return customField12;
    }

    public void setCustomField12(String customField12) {
        this.customField12 = customField12;
    }

    public TmssTestcase withCustomField13(String customField13) {
        this.customField13 = customField13;
        return this;
    }

    /**
     * Get customField13
     * @return customField13
     */
    public String getCustomField13() {
        return customField13;
    }

    public void setCustomField13(String customField13) {
        this.customField13 = customField13;
    }

    public TmssTestcase withCustomField14(String customField14) {
        this.customField14 = customField14;
        return this;
    }

    /**
     * Get customField14
     * @return customField14
     */
    public String getCustomField14() {
        return customField14;
    }

    public void setCustomField14(String customField14) {
        this.customField14 = customField14;
    }

    public TmssTestcase withCustomField15(String customField15) {
        this.customField15 = customField15;
        return this;
    }

    /**
     * Get customField15
     * @return customField15
     */
    public String getCustomField15() {
        return customField15;
    }

    public void setCustomField15(String customField15) {
        this.customField15 = customField15;
    }

    public TmssTestcase withCustomField16(String customField16) {
        this.customField16 = customField16;
        return this;
    }

    /**
     * Get customField16
     * @return customField16
     */
    public String getCustomField16() {
        return customField16;
    }

    public void setCustomField16(String customField16) {
        this.customField16 = customField16;
    }

    public TmssTestcase withCustomField17(String customField17) {
        this.customField17 = customField17;
        return this;
    }

    /**
     * Get customField17
     * @return customField17
     */
    public String getCustomField17() {
        return customField17;
    }

    public void setCustomField17(String customField17) {
        this.customField17 = customField17;
    }

    public TmssTestcase withCustomField18(String customField18) {
        this.customField18 = customField18;
        return this;
    }

    /**
     * Get customField18
     * @return customField18
     */
    public String getCustomField18() {
        return customField18;
    }

    public void setCustomField18(String customField18) {
        this.customField18 = customField18;
    }

    public TmssTestcase withCustomField19(String customField19) {
        this.customField19 = customField19;
        return this;
    }

    /**
     * Get customField19
     * @return customField19
     */
    public String getCustomField19() {
        return customField19;
    }

    public void setCustomField19(String customField19) {
        this.customField19 = customField19;
    }

    public TmssTestcase withCustomField2(String customField2) {
        this.customField2 = customField2;
        return this;
    }

    /**
     * Get customField2
     * @return customField2
     */
    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    public TmssTestcase withCustomField20(String customField20) {
        this.customField20 = customField20;
        return this;
    }

    /**
     * Get customField20
     * @return customField20
     */
    public String getCustomField20() {
        return customField20;
    }

    public void setCustomField20(String customField20) {
        this.customField20 = customField20;
    }

    public TmssTestcase withCustomField21(String customField21) {
        this.customField21 = customField21;
        return this;
    }

    /**
     * Get customField21
     * @return customField21
     */
    public String getCustomField21() {
        return customField21;
    }

    public void setCustomField21(String customField21) {
        this.customField21 = customField21;
    }

    public TmssTestcase withCustomField22(String customField22) {
        this.customField22 = customField22;
        return this;
    }

    /**
     * Get customField22
     * @return customField22
     */
    public String getCustomField22() {
        return customField22;
    }

    public void setCustomField22(String customField22) {
        this.customField22 = customField22;
    }

    public TmssTestcase withCustomField23(String customField23) {
        this.customField23 = customField23;
        return this;
    }

    /**
     * Get customField23
     * @return customField23
     */
    public String getCustomField23() {
        return customField23;
    }

    public void setCustomField23(String customField23) {
        this.customField23 = customField23;
    }

    public TmssTestcase withCustomField24(String customField24) {
        this.customField24 = customField24;
        return this;
    }

    /**
     * Get customField24
     * @return customField24
     */
    public String getCustomField24() {
        return customField24;
    }

    public void setCustomField24(String customField24) {
        this.customField24 = customField24;
    }

    public TmssTestcase withCustomField25(String customField25) {
        this.customField25 = customField25;
        return this;
    }

    /**
     * Get customField25
     * @return customField25
     */
    public String getCustomField25() {
        return customField25;
    }

    public void setCustomField25(String customField25) {
        this.customField25 = customField25;
    }

    public TmssTestcase withCustomField3(String customField3) {
        this.customField3 = customField3;
        return this;
    }

    /**
     * Get customField3
     * @return customField3
     */
    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    public TmssTestcase withCustomField4(String customField4) {
        this.customField4 = customField4;
        return this;
    }

    /**
     * Get customField4
     * @return customField4
     */
    public String getCustomField4() {
        return customField4;
    }

    public void setCustomField4(String customField4) {
        this.customField4 = customField4;
    }

    public TmssTestcase withCustomField5(String customField5) {
        this.customField5 = customField5;
        return this;
    }

    /**
     * Get customField5
     * @return customField5
     */
    public String getCustomField5() {
        return customField5;
    }

    public void setCustomField5(String customField5) {
        this.customField5 = customField5;
    }

    public TmssTestcase withCustomField6(String customField6) {
        this.customField6 = customField6;
        return this;
    }

    /**
     * Get customField6
     * @return customField6
     */
    public String getCustomField6() {
        return customField6;
    }

    public void setCustomField6(String customField6) {
        this.customField6 = customField6;
    }

    public TmssTestcase withCustomField7(String customField7) {
        this.customField7 = customField7;
        return this;
    }

    /**
     * Get customField7
     * @return customField7
     */
    public String getCustomField7() {
        return customField7;
    }

    public void setCustomField7(String customField7) {
        this.customField7 = customField7;
    }

    public TmssTestcase withCustomField8(String customField8) {
        this.customField8 = customField8;
        return this;
    }

    /**
     * Get customField8
     * @return customField8
     */
    public String getCustomField8() {
        return customField8;
    }

    public void setCustomField8(String customField8) {
        this.customField8 = customField8;
    }

    public TmssTestcase withCustomField9(String customField9) {
        this.customField9 = customField9;
        return this;
    }

    /**
     * Get customField9
     * @return customField9
     */
    public String getCustomField9() {
        return customField9;
    }

    public void setCustomField9(String customField9) {
        this.customField9 = customField9;
    }

    public TmssTestcase withDescription(String description) {
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

    public TmssTestcase withDrRelationid(String drRelationid) {
        this.drRelationid = drRelationid;
        return this;
    }

    /**
     * dr关系ID
     * @return drRelationid
     */
    public String getDrRelationid() {
        return drRelationid;
    }

    public void setDrRelationid(String drRelationid) {
        this.drRelationid = drRelationid;
    }

    public TmssTestcase withEnvType(String envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 环境类型
     * @return envType
     */
    public String getEnvType() {
        return envType;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    public TmssTestcase withExePlatform(String exePlatform) {
        this.exePlatform = exePlatform;
        return this;
    }

    /**
     * 执行平台
     * @return exePlatform
     */
    public String getExePlatform() {
        return exePlatform;
    }

    public void setExePlatform(String exePlatform) {
        this.exePlatform = exePlatform;
    }

    public TmssTestcase withExpectOutput(String expectOutput) {
        this.expectOutput = expectOutput;
        return this;
    }

    /**
     * 内部预期输出
     * @return expectOutput
     */
    public String getExpectOutput() {
        return expectOutput;
    }

    public void setExpectOutput(String expectOutput) {
        this.expectOutput = expectOutput;
    }

    public TmssTestcase withFeaturePath(String featurePath) {
        this.featurePath = featurePath;
        return this;
    }

    /**
     * 特性路径
     * @return featurePath
     */
    public String getFeaturePath() {
        return featurePath;
    }

    public void setFeaturePath(String featurePath) {
        this.featurePath = featurePath;
    }

    public TmssTestcase withIsKeyWord(Integer isKeyWord) {
        this.isKeyWord = isKeyWord;
        return this;
    }

    /**
     * 是否为关键字
     * @return isKeyWord
     */
    public Integer getIsKeyWord() {
        return isKeyWord;
    }

    public void setIsKeyWord(Integer isKeyWord) {
        this.isKeyWord = isKeyWord;
    }

    public TmssTestcase withIsContractTestcase(String isContractTestcase) {
        this.isContractTestcase = isContractTestcase;
        return this;
    }

    /**
     * 是否为合同测试用例
     * @return isContractTestcase
     */
    public String getIsContractTestcase() {
        return isContractTestcase;
    }

    public void setIsContractTestcase(String isContractTestcase) {
        this.isContractTestcase = isContractTestcase;
    }

    public TmssTestcase withIsParaValidatorTestcase(String isParaValidatorTestcase) {
        this.isParaValidatorTestcase = isParaValidatorTestcase;
        return this;
    }

    /**
     * 是否为参数校验测试用例
     * @return isParaValidatorTestcase
     */
    public String getIsParaValidatorTestcase() {
        return isParaValidatorTestcase;
    }

    public void setIsParaValidatorTestcase(String isParaValidatorTestcase) {
        this.isParaValidatorTestcase = isParaValidatorTestcase;
    }

    public TmssTestcase withLabelId(List<String> labelId) {
        this.labelId = labelId;
        return this;
    }

    public TmssTestcase addLabelIdItem(String labelIdItem) {
        if (this.labelId == null) {
            this.labelId = new ArrayList<>();
        }
        this.labelId.add(labelIdItem);
        return this;
    }

    public TmssTestcase withLabelId(Consumer<List<String>> labelIdSetter) {
        if (this.labelId == null) {
            this.labelId = new ArrayList<>();
        }
        labelIdSetter.accept(this.labelId);
        return this;
    }

    /**
     * 标签ID列表
     * @return labelId
     */
    public List<String> getLabelId() {
        return labelId;
    }

    public void setLabelId(List<String> labelId) {
        this.labelId = labelId;
    }

    public TmssTestcase withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public TmssTestcase withLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
        return this;
    }

    /**
     * 最后修改人
     * @return lastModifier
     */
    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public TmssTestcase withLastResult(String lastResult) {
        this.lastResult = lastResult;
        return this;
    }

    /**
     * 最后的结果
     * @return lastResult
     */
    public String getLastResult() {
        return lastResult;
    }

    public void setLastResult(String lastResult) {
        this.lastResult = lastResult;
    }

    public TmssTestcase withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 用例级别
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public TmssTestcase withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * 市场
     * @return market
     */
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public TmssTestcase withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public TmssTestcase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TmssTestcase withNetworkScriptName(String networkScriptName) {
        this.networkScriptName = networkScriptName;
        return this;
    }

    /**
     * 公共aw和项目的关联关系
     * @return networkScriptName
     */
    public String getNetworkScriptName() {
        return networkScriptName;
    }

    public void setNetworkScriptName(String networkScriptName) {
        this.networkScriptName = networkScriptName;
    }

    public TmssTestcase withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TmssTestcase withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TmssTestcase withOriginUri(String originUri) {
        this.originUri = originUri;
        return this;
    }

    /**
     * 原始的uri
     * @return originUri
     */
    public String getOriginUri() {
        return originUri;
    }

    public void setOriginUri(String originUri) {
        this.originUri = originUri;
    }

    public TmssTestcase withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 测试的所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TmssTestcase withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 所有者ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TmssTestcase withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * 测试前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public TmssTestcase withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 新服务新建用例版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public TmssTestcase withReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * 发布ID
     * @return releaseId
     */
    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public TmssTestcase withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TmssTestcase withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 阶段
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public TmssTestcase withSteps(List<TmssStep> steps) {
        this.steps = steps;
        return this;
    }

    public TmssTestcase addStepsItem(TmssStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public TmssTestcase withSteps(Consumer<List<TmssStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 存储测试步骤和预期结果值对象
     * @return steps
     */
    public List<TmssStep> getSteps() {
        return steps;
    }

    public void setSteps(List<TmssStep> steps) {
        this.steps = steps;
    }

    public TmssTestcase withSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
        return this;
    }

    /**
     * 脚本路径
     * @return svnScriptPath
     */
    public String getSvnScriptPath() {
        return svnScriptPath;
    }

    public void setSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
    }

    public TmssTestcase withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public TmssTestcase withTestFeature(String testFeature) {
        this.testFeature = testFeature;
        return this;
    }

    /**
     * 测试特性
     * @return testFeature
     */
    public String getTestFeature() {
        return testFeature;
    }

    public void setTestFeature(String testFeature) {
        this.testFeature = testFeature;
    }

    public TmssTestcase withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 内部测试步骤
     * @return testStep
     */
    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    public TmssTestcase withTestType(Integer testType) {
        this.testType = testType;
        return this;
    }

    /**
     * 测试类型
     * @return testType
     */
    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public TmssTestcase withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 用例基线Uri(BAM 接口覆盖率迭代下用例信息获取用)
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TmssTestcase that = (TmssTestcase) obj;
        return Objects.equals(this.activityId, that.activityId)
            && Objects.equals(this.appliedProduct, that.appliedProduct) && Objects.equals(this.author, that.author)
            && Objects.equals(this.autoType, that.autoType) && Objects.equals(this.cataId, that.cataId)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.customField1, that.customField1)
            && Objects.equals(this.customField10, that.customField10)
            && Objects.equals(this.customField11, that.customField11)
            && Objects.equals(this.customField12, that.customField12)
            && Objects.equals(this.customField13, that.customField13)
            && Objects.equals(this.customField14, that.customField14)
            && Objects.equals(this.customField15, that.customField15)
            && Objects.equals(this.customField16, that.customField16)
            && Objects.equals(this.customField17, that.customField17)
            && Objects.equals(this.customField18, that.customField18)
            && Objects.equals(this.customField19, that.customField19)
            && Objects.equals(this.customField2, that.customField2)
            && Objects.equals(this.customField20, that.customField20)
            && Objects.equals(this.customField21, that.customField21)
            && Objects.equals(this.customField22, that.customField22)
            && Objects.equals(this.customField23, that.customField23)
            && Objects.equals(this.customField24, that.customField24)
            && Objects.equals(this.customField25, that.customField25)
            && Objects.equals(this.customField3, that.customField3)
            && Objects.equals(this.customField4, that.customField4)
            && Objects.equals(this.customField5, that.customField5)
            && Objects.equals(this.customField6, that.customField6)
            && Objects.equals(this.customField7, that.customField7)
            && Objects.equals(this.customField8, that.customField8)
            && Objects.equals(this.customField9, that.customField9)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.drRelationid, that.drRelationid) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.exePlatform, that.exePlatform)
            && Objects.equals(this.expectOutput, that.expectOutput)
            && Objects.equals(this.featurePath, that.featurePath) && Objects.equals(this.isKeyWord, that.isKeyWord)
            && Objects.equals(this.isContractTestcase, that.isContractTestcase)
            && Objects.equals(this.isParaValidatorTestcase, that.isParaValidatorTestcase)
            && Objects.equals(this.labelId, that.labelId) && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifier, that.lastModifier) && Objects.equals(this.lastResult, that.lastResult)
            && Objects.equals(this.level, that.level) && Objects.equals(this.market, that.market)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.networkScriptName, that.networkScriptName)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.number, that.number)
            && Objects.equals(this.originUri, that.originUri) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.preparation, that.preparation)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.releaseId, that.releaseId)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.svnScriptPath, that.svnScriptPath)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.testFeature, that.testFeature)
            && Objects.equals(this.testStep, that.testStep) && Objects.equals(this.testType, that.testType)
            && Objects.equals(this.uri, that.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId,
            appliedProduct,
            author,
            autoType,
            cataId,
            creationDate,
            customField1,
            customField10,
            customField11,
            customField12,
            customField13,
            customField14,
            customField15,
            customField16,
            customField17,
            customField18,
            customField19,
            customField2,
            customField20,
            customField21,
            customField22,
            customField23,
            customField24,
            customField25,
            customField3,
            customField4,
            customField5,
            customField6,
            customField7,
            customField8,
            customField9,
            description,
            drRelationid,
            envType,
            exePlatform,
            expectOutput,
            featurePath,
            isKeyWord,
            isContractTestcase,
            isParaValidatorTestcase,
            labelId,
            lastModified,
            lastModifier,
            lastResult,
            level,
            market,
            moduleId,
            name,
            networkScriptName,
            nodeName,
            number,
            originUri,
            owner,
            ownerId,
            preparation,
            releaseDev,
            releaseId,
            remark,
            stage,
            steps,
            svnScriptPath,
            tags,
            testFeature,
            testStep,
            testType,
            uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmssTestcase {\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    appliedProduct: ").append(toIndentedString(appliedProduct)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    autoType: ").append(toIndentedString(autoType)).append("\n");
        sb.append("    cataId: ").append(toIndentedString(cataId)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
        sb.append("    customField10: ").append(toIndentedString(customField10)).append("\n");
        sb.append("    customField11: ").append(toIndentedString(customField11)).append("\n");
        sb.append("    customField12: ").append(toIndentedString(customField12)).append("\n");
        sb.append("    customField13: ").append(toIndentedString(customField13)).append("\n");
        sb.append("    customField14: ").append(toIndentedString(customField14)).append("\n");
        sb.append("    customField15: ").append(toIndentedString(customField15)).append("\n");
        sb.append("    customField16: ").append(toIndentedString(customField16)).append("\n");
        sb.append("    customField17: ").append(toIndentedString(customField17)).append("\n");
        sb.append("    customField18: ").append(toIndentedString(customField18)).append("\n");
        sb.append("    customField19: ").append(toIndentedString(customField19)).append("\n");
        sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
        sb.append("    customField20: ").append(toIndentedString(customField20)).append("\n");
        sb.append("    customField21: ").append(toIndentedString(customField21)).append("\n");
        sb.append("    customField22: ").append(toIndentedString(customField22)).append("\n");
        sb.append("    customField23: ").append(toIndentedString(customField23)).append("\n");
        sb.append("    customField24: ").append(toIndentedString(customField24)).append("\n");
        sb.append("    customField25: ").append(toIndentedString(customField25)).append("\n");
        sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
        sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
        sb.append("    customField5: ").append(toIndentedString(customField5)).append("\n");
        sb.append("    customField6: ").append(toIndentedString(customField6)).append("\n");
        sb.append("    customField7: ").append(toIndentedString(customField7)).append("\n");
        sb.append("    customField8: ").append(toIndentedString(customField8)).append("\n");
        sb.append("    customField9: ").append(toIndentedString(customField9)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    drRelationid: ").append(toIndentedString(drRelationid)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    exePlatform: ").append(toIndentedString(exePlatform)).append("\n");
        sb.append("    expectOutput: ").append(toIndentedString(expectOutput)).append("\n");
        sb.append("    featurePath: ").append(toIndentedString(featurePath)).append("\n");
        sb.append("    isKeyWord: ").append(toIndentedString(isKeyWord)).append("\n");
        sb.append("    isContractTestcase: ").append(toIndentedString(isContractTestcase)).append("\n");
        sb.append("    isParaValidatorTestcase: ").append(toIndentedString(isParaValidatorTestcase)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifier: ").append(toIndentedString(lastModifier)).append("\n");
        sb.append("    lastResult: ").append(toIndentedString(lastResult)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    market: ").append(toIndentedString(market)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkScriptName: ").append(toIndentedString(networkScriptName)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    originUri: ").append(toIndentedString(originUri)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    svnScriptPath: ").append(toIndentedString(svnScriptPath)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    testFeature: ").append(toIndentedString(testFeature)).append("\n");
        sb.append("    testStep: ").append(toIndentedString(testStep)).append("\n");
        sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

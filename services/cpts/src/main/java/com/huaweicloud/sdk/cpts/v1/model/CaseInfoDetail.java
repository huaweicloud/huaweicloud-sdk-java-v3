package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseInfoDetail
 */
public class CaseInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private Integer caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<Contents> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "for_loop_params")

    private List<Object> forLoopParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increase_setting")

    private List<Object> increaseSetting = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<TestCaseStage> stages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    private Integer tempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Integer sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private Integer directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setup_contents")

    private List<Contents> setupContents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_replicas")

    private Integer userReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_log_policy")

    private Integer collectLogPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_app_list")

    private List<Integer> linkAppList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_info")

    private CaseDoc caseInfo;

    public CaseInfoDetail withCaseId(Integer caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * minimum: 0
     * maximum: 2147483647
     * @return caseId
     */
    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public CaseInfoDetail withName(String name) {
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

    public CaseInfoDetail withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /**
     * 用例类型（0：常规用例；）
     * minimum: 0
     * maximum: 2147483647
     * @return caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public CaseInfoDetail withContents(List<Contents> contents) {
        this.contents = contents;
        return this;
    }

    public CaseInfoDetail addContentsItem(Contents contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CaseInfoDetail withContents(Consumer<List<Contents>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 用例脚本信息
     * @return contents
     */
    public List<Contents> getContents() {
        return contents;
    }

    public void setContents(List<Contents> contents) {
        this.contents = contents;
    }

    public CaseInfoDetail withForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
        return this;
    }

    public CaseInfoDetail addForLoopParamsItem(Object forLoopParamsItem) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        this.forLoopParams.add(forLoopParamsItem);
        return this;
    }

    public CaseInfoDetail withForLoopParams(Consumer<List<Object>> forLoopParamsSetter) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        forLoopParamsSetter.accept(this.forLoopParams);
        return this;
    }

    /**
     * 旧版本逻辑控制器字段，当前已未使用
     * @return forLoopParams
     */
    public List<Object> getForLoopParams() {
        return forLoopParams;
    }

    public void setForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
    }

    public CaseInfoDetail withIncreaseSetting(List<Object> increaseSetting) {
        this.increaseSetting = increaseSetting;
        return this;
    }

    public CaseInfoDetail addIncreaseSettingItem(Object increaseSettingItem) {
        if (this.increaseSetting == null) {
            this.increaseSetting = new ArrayList<>();
        }
        this.increaseSetting.add(increaseSettingItem);
        return this;
    }

    public CaseInfoDetail withIncreaseSetting(Consumer<List<Object>> increaseSettingSetter) {
        if (this.increaseSetting == null) {
            this.increaseSetting = new ArrayList<>();
        }
        increaseSettingSetter.accept(this.increaseSetting);
        return this;
    }

    /**
     * 梯度递增
     * @return increaseSetting
     */
    public List<Object> getIncreaseSetting() {
        return increaseSetting;
    }

    public void setIncreaseSetting(List<Object> increaseSetting) {
        this.increaseSetting = increaseSetting;
    }

    public CaseInfoDetail withStages(List<TestCaseStage> stages) {
        this.stages = stages;
        return this;
    }

    public CaseInfoDetail addStagesItem(TestCaseStage stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public CaseInfoDetail withStages(Consumer<List<TestCaseStage>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 阶段信息
     * @return stages
     */
    public List<TestCaseStage> getStages() {
        return stages;
    }

    public void setStages(List<TestCaseStage> stages) {
        this.stages = stages;
    }

    public CaseInfoDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，0：已删除；1：启用；2：禁用
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CaseInfoDetail withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /**
     * 用例id
     * minimum: 0
     * maximum: 2147483647
     * @return tempId
     */
    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public CaseInfoDetail withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public CaseInfoDetail withDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 用例所属目录id（旧版接口可不传）
     * minimum: 0
     * maximum: 2147483647
     * @return directoryId
     */
    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public CaseInfoDetail withSetupContents(List<Contents> setupContents) {
        this.setupContents = setupContents;
        return this;
    }

    public CaseInfoDetail addSetupContentsItem(Contents setupContentsItem) {
        if (this.setupContents == null) {
            this.setupContents = new ArrayList<>();
        }
        this.setupContents.add(setupContentsItem);
        return this;
    }

    public CaseInfoDetail withSetupContents(Consumer<List<Contents>> setupContentsSetter) {
        if (this.setupContents == null) {
            this.setupContents = new ArrayList<>();
        }
        setupContentsSetter.accept(this.setupContents);
        return this;
    }

    /**
     * 前置步骤
     * @return setupContents
     */
    public List<Contents> getSetupContents() {
        return setupContents;
    }

    public void setSetupContents(List<Contents> setupContents) {
        this.setupContents = setupContents;
    }

    public CaseInfoDetail withUserReplicas(Integer userReplicas) {
        this.userReplicas = userReplicas;
        return this;
    }

    /**
     * 执行器个数
     * minimum: 0
     * maximum: 2147483647
     * @return userReplicas
     */
    public Integer getUserReplicas() {
        return userReplicas;
    }

    public void setUserReplicas(Integer userReplicas) {
        this.userReplicas = userReplicas;
    }

    public CaseInfoDetail withCollectLogPolicy(Integer collectLogPolicy) {
        this.collectLogPolicy = collectLogPolicy;
        return this;
    }

    /**
     * 日志采集策略（0-请求模式；1-用例模式）
     * minimum: 0
     * maximum: 32
     * @return collectLogPolicy
     */
    public Integer getCollectLogPolicy() {
        return collectLogPolicy;
    }

    public void setCollectLogPolicy(Integer collectLogPolicy) {
        this.collectLogPolicy = collectLogPolicy;
    }

    public CaseInfoDetail withLinkAppList(List<Integer> linkAppList) {
        this.linkAppList = linkAppList;
        return this;
    }

    public CaseInfoDetail addLinkAppListItem(Integer linkAppListItem) {
        if (this.linkAppList == null) {
            this.linkAppList = new ArrayList<>();
        }
        this.linkAppList.add(linkAppListItem);
        return this;
    }

    public CaseInfoDetail withLinkAppList(Consumer<List<Integer>> linkAppListSetter) {
        if (this.linkAppList == null) {
            this.linkAppList = new ArrayList<>();
        }
        linkAppListSetter.accept(this.linkAppList);
        return this;
    }

    /**
     * 关联全链路应用列表
     * @return linkAppList
     */
    public List<Integer> getLinkAppList() {
        return linkAppList;
    }

    public void setLinkAppList(List<Integer> linkAppList) {
        this.linkAppList = linkAppList;
    }

    public CaseInfoDetail withCaseInfo(CaseDoc caseInfo) {
        this.caseInfo = caseInfo;
        return this;
    }

    public CaseInfoDetail withCaseInfo(Consumer<CaseDoc> caseInfoSetter) {
        if (this.caseInfo == null) {
            this.caseInfo = new CaseDoc();
            caseInfoSetter.accept(this.caseInfo);
        }

        return this;
    }

    /**
     * Get caseInfo
     * @return caseInfo
     */
    public CaseDoc getCaseInfo() {
        return caseInfo;
    }

    public void setCaseInfo(CaseDoc caseInfo) {
        this.caseInfo = caseInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseInfoDetail that = (CaseInfoDetail) obj;
        return Objects.equals(this.caseId, that.caseId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.caseType, that.caseType) && Objects.equals(this.contents, that.contents)
            && Objects.equals(this.forLoopParams, that.forLoopParams)
            && Objects.equals(this.increaseSetting, that.increaseSetting) && Objects.equals(this.stages, that.stages)
            && Objects.equals(this.status, that.status) && Objects.equals(this.tempId, that.tempId)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.setupContents, that.setupContents)
            && Objects.equals(this.userReplicas, that.userReplicas)
            && Objects.equals(this.collectLogPolicy, that.collectLogPolicy)
            && Objects.equals(this.linkAppList, that.linkAppList) && Objects.equals(this.caseInfo, that.caseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId,
            name,
            caseType,
            contents,
            forLoopParams,
            increaseSetting,
            stages,
            status,
            tempId,
            sort,
            directoryId,
            setupContents,
            userReplicas,
            collectLogPolicy,
            linkAppList,
            caseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseInfoDetail {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    forLoopParams: ").append(toIndentedString(forLoopParams)).append("\n");
        sb.append("    increaseSetting: ").append(toIndentedString(increaseSetting)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    setupContents: ").append(toIndentedString(setupContents)).append("\n");
        sb.append("    userReplicas: ").append(toIndentedString(userReplicas)).append("\n");
        sb.append("    collectLogPolicy: ").append(toIndentedString(collectLogPolicy)).append("\n");
        sb.append("    linkAppList: ").append(toIndentedString(linkAppList)).append("\n");
        sb.append("    caseInfo: ").append(toIndentedString(caseInfo)).append("\n");
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

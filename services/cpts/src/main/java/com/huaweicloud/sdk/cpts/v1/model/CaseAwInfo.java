package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaseAwInfo
 */
public class CaseAwInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw")

    private List<AwInfoDTO> aw = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "awList")

    private List<DetailItem> awList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseAwId")

    private String caseAwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseUri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri_i")

    private String caseUriI;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datumType")

    private Integer datumType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskExecId")

    private String taskExecId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcaseId")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionList")

    private List<DetailItem> transactionList = null;

    public CaseAwInfo withAw(List<AwInfoDTO> aw) {
        this.aw = aw;
        return this;
    }

    public CaseAwInfo addAwItem(AwInfoDTO awItem) {
        if (this.aw == null) {
            this.aw = new ArrayList<>();
        }
        this.aw.add(awItem);
        return this;
    }

    public CaseAwInfo withAw(Consumer<List<AwInfoDTO>> awSetter) {
        if (this.aw == null) {
            this.aw = new ArrayList<>();
        }
        awSetter.accept(this.aw);
        return this;
    }

    /**
     * aw信息
     * @return aw
     */
    public List<AwInfoDTO> getAw() {
        return aw;
    }

    public void setAw(List<AwInfoDTO> aw) {
        this.aw = aw;
    }

    public CaseAwInfo withAwList(List<DetailItem> awList) {
        this.awList = awList;
        return this;
    }

    public CaseAwInfo addAwListItem(DetailItem awListItem) {
        if (this.awList == null) {
            this.awList = new ArrayList<>();
        }
        this.awList.add(awListItem);
        return this;
    }

    public CaseAwInfo withAwList(Consumer<List<DetailItem>> awListSetter) {
        if (this.awList == null) {
            this.awList = new ArrayList<>();
        }
        awListSetter.accept(this.awList);
        return this;
    }

    /**
     * aw详细信息列表
     * @return awList
     */
    public List<DetailItem> getAwList() {
        return awList;
    }

    public void setAwList(List<DetailItem> awList) {
        this.awList = awList;
    }

    public CaseAwInfo withCaseAwId(String caseAwId) {
        this.caseAwId = caseAwId;
        return this;
    }

    /**
     * 数据库中dc_case_aw表中的主键ID
     * @return caseAwId
     */
    public String getCaseAwId() {
        return caseAwId;
    }

    public void setCaseAwId(String caseAwId) {
        this.caseAwId = caseAwId;
    }

    public CaseAwInfo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 数据库中dc_testcase表中的case_uri
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public CaseAwInfo withCaseUriI(String caseUriI) {
        this.caseUriI = caseUriI;
        return this;
    }

    /**
     * 数据库中dc_testcase表中的case_uri_iteration
     * @return caseUriI
     */
    public String getCaseUriI() {
        return caseUriI;
    }

    public void setCaseUriI(String caseUriI) {
        this.caseUriI = caseUriI;
    }

    public CaseAwInfo withDatumType(Integer datumType) {
        this.datumType = datumType;
        return this;
    }

    /**
     * 数据类型（用例/aw/事务）
     * minimum: 0
     * maximum: 1024
     * @return datumType
     */
    public Integer getDatumType() {
        return datumType;
    }

    public void setDatumType(Integer datumType) {
        this.datumType = datumType;
    }

    public CaseAwInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库中dc_case_aw表中的主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CaseAwInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaseAwInfo withTaskExecId(String taskExecId) {
        this.taskExecId = taskExecId;
        return this;
    }

    /**
     * 数据库中dc_testcase表中的testcase_id
     * @return taskExecId
     */
    public String getTaskExecId() {
        return taskExecId;
    }

    public void setTaskExecId(String taskExecId) {
        this.taskExecId = taskExecId;
    }

    public CaseAwInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CaseAwInfo withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 数据库中dc_testcase表中的testcase_id
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public CaseAwInfo withTransactionList(List<DetailItem> transactionList) {
        this.transactionList = transactionList;
        return this;
    }

    public CaseAwInfo addTransactionListItem(DetailItem transactionListItem) {
        if (this.transactionList == null) {
            this.transactionList = new ArrayList<>();
        }
        this.transactionList.add(transactionListItem);
        return this;
    }

    public CaseAwInfo withTransactionList(Consumer<List<DetailItem>> transactionListSetter) {
        if (this.transactionList == null) {
            this.transactionList = new ArrayList<>();
        }
        transactionListSetter.accept(this.transactionList);
        return this;
    }

    /**
     * 事务详细信息列表
     * @return transactionList
     */
    public List<DetailItem> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<DetailItem> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseAwInfo that = (CaseAwInfo) obj;
        return Objects.equals(this.aw, that.aw) && Objects.equals(this.awList, that.awList)
            && Objects.equals(this.caseAwId, that.caseAwId) && Objects.equals(this.caseUri, that.caseUri)
            && Objects.equals(this.caseUriI, that.caseUriI) && Objects.equals(this.datumType, that.datumType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.taskExecId, that.taskExecId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.testcaseId, that.testcaseId)
            && Objects.equals(this.transactionList, that.transactionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aw,
            awList,
            caseAwId,
            caseUri,
            caseUriI,
            datumType,
            id,
            name,
            taskExecId,
            taskId,
            testcaseId,
            transactionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseAwInfo {\n");
        sb.append("    aw: ").append(toIndentedString(aw)).append("\n");
        sb.append("    awList: ").append(toIndentedString(awList)).append("\n");
        sb.append("    caseAwId: ").append(toIndentedString(caseAwId)).append("\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    caseUriI: ").append(toIndentedString(caseUriI)).append("\n");
        sb.append("    datumType: ").append(toIndentedString(datumType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskExecId: ").append(toIndentedString(taskExecId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    transactionList: ").append(toIndentedString(transactionList)).append("\n");
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

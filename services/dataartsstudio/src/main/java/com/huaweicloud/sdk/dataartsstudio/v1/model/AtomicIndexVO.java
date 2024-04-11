package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AtomicIndexVO
 */
public class AtomicIndexVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_exp")

    private String calExp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_fn_ids")

    private List<Long> calFnIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1_id")

    private Long l1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_id")

    private String l2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3_id")

    private String l3Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_name")

    private String tbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_type")

    private String dwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_ids")

    private List<Long> fieldIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_names")

    private List<String> fieldNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private String l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private String l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private String l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_info")

    private ApprovalVO approvalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    public AtomicIndexVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AtomicIndexVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public AtomicIndexVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public AtomicIndexVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AtomicIndexVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public AtomicIndexVO withCalExp(String calExp) {
        this.calExp = calExp;
        return this;
    }

    /**
     * 计算表达式，形如'sum(${fact_column_id})'，其中fact_column_id表示引用事实表中的字段ID
     * @return calExp
     */
    public String getCalExp() {
        return calExp;
    }

    public void setCalExp(String calExp) {
        this.calExp = calExp;
    }

    public AtomicIndexVO withCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
        return this;
    }

    public AtomicIndexVO addCalFnIdsItem(Long calFnIdsItem) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        this.calFnIds.add(calFnIdsItem);
        return this;
    }

    public AtomicIndexVO withCalFnIds(Consumer<List<Long>> calFnIdsSetter) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        calFnIdsSetter.accept(this.calFnIds);
        return this;
    }

    /**
     * 引用函数ID。
     * @return calFnIds
     */
    public List<Long> getCalFnIds() {
        return calFnIds;
    }

    public void setCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
    }

    public AtomicIndexVO withL1Id(Long l1Id) {
        this.l1Id = l1Id;
        return this;
    }

    /**
     * 主题域分组ID。
     * @return l1Id
     */
    public Long getL1Id() {
        return l1Id;
    }

    public void setL1Id(Long l1Id) {
        this.l1Id = l1Id;
    }

    public AtomicIndexVO withL2Id(String l2Id) {
        this.l2Id = l2Id;
        return this;
    }

    /**
     * 主题域ID，只读，创建和更新时无需填写。
     * @return l2Id
     */
    public String getL2Id() {
        return l2Id;
    }

    public void setL2Id(String l2Id) {
        this.l2Id = l2Id;
    }

    public AtomicIndexVO withL3Id(String l3Id) {
        this.l3Id = l3Id;
        return this;
    }

    /**
     * 业务对象guid。
     * @return l3Id
     */
    public String getL3Id() {
        return l3Id;
    }

    public void setL3Id(String l3Id) {
        this.l3Id = l3Id;
    }

    public AtomicIndexVO withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID。
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public AtomicIndexVO withTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }

    /**
     * 表名称。
     * @return tbName
     */
    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public AtomicIndexVO withDwType(String dwType) {
        this.dwType = dwType;
        return this;
    }

    /**
     * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
     * @return dwType
     */
    public String getDwType() {
        return dwType;
    }

    public void setDwType(String dwType) {
        this.dwType = dwType;
    }

    public AtomicIndexVO withFieldIds(List<Long> fieldIds) {
        this.fieldIds = fieldIds;
        return this;
    }

    public AtomicIndexVO addFieldIdsItem(Long fieldIdsItem) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        this.fieldIds.add(fieldIdsItem);
        return this;
    }

    public AtomicIndexVO withFieldIds(Consumer<List<Long>> fieldIdsSetter) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        fieldIdsSetter.accept(this.fieldIds);
        return this;
    }

    /**
     * 字段ID信息。
     * @return fieldIds
     */
    public List<Long> getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(List<Long> fieldIds) {
        this.fieldIds = fieldIds;
    }

    public AtomicIndexVO withFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public AtomicIndexVO addFieldNamesItem(String fieldNamesItem) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.add(fieldNamesItem);
        return this;
    }

    public AtomicIndexVO withFieldNames(Consumer<List<String>> fieldNamesSetter) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        fieldNamesSetter.accept(this.fieldNames);
        return this;
    }

    /**
     * 字段名称信息。
     * @return fieldNames
     */
    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public AtomicIndexVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public AtomicIndexVO withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * Get bizType
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public AtomicIndexVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AtomicIndexVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AtomicIndexVO withL1(String l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 主题域分组中文名，只读，创建和更新时无需填写。
     * @return l1
     */
    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public AtomicIndexVO withL2(String l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 主题域中文名，只读，创建和更新时无需填写。
     * @return l2
     */
    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public AtomicIndexVO withL3(String l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 业务对象中文名，只读，创建和更新时无需填写。
     * @return l3
     */
    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public AtomicIndexVO withApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
        return this;
    }

    public AtomicIndexVO withApprovalInfo(Consumer<ApprovalVO> approvalInfoSetter) {
        if (this.approvalInfo == null) {
            this.approvalInfo = new ApprovalVO();
            approvalInfoSetter.accept(this.approvalInfo);
        }

        return this;
    }

    /**
     * Get approvalInfo
     * @return approvalInfo
     */
    public ApprovalVO getApprovalInfo() {
        return approvalInfo;
    }

    public void setApprovalInfo(ApprovalVO approvalInfo) {
        this.approvalInfo = approvalInfo;
    }

    public AtomicIndexVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public AtomicIndexVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
        if (this.newBiz == null) {
            this.newBiz = new BizVersionManageVO();
            newBizSetter.accept(this.newBiz);
        }

        return this;
    }

    /**
     * Get newBiz
     * @return newBiz
     */
    public BizVersionManageVO getNewBiz() {
        return newBiz;
    }

    public void setNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AtomicIndexVO that = (AtomicIndexVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.calExp, that.calExp)
            && Objects.equals(this.calFnIds, that.calFnIds) && Objects.equals(this.l1Id, that.l1Id)
            && Objects.equals(this.l2Id, that.l2Id) && Objects.equals(this.l3Id, that.l3Id)
            && Objects.equals(this.tableId, that.tableId) && Objects.equals(this.tbName, that.tbName)
            && Objects.equals(this.dwType, that.dwType) && Objects.equals(this.fieldIds, that.fieldIds)
            && Objects.equals(this.fieldNames, that.fieldNames) && Objects.equals(this.status, that.status)
            && Objects.equals(this.bizType, that.bizType) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.l1, that.l1)
            && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.approvalInfo, that.approvalInfo) && Objects.equals(this.newBiz, that.newBiz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            nameCh,
            description,
            createBy,
            calExp,
            calFnIds,
            l1Id,
            l2Id,
            l3Id,
            tableId,
            tbName,
            dwType,
            fieldIds,
            fieldNames,
            status,
            bizType,
            createTime,
            updateTime,
            l1,
            l2,
            l3,
            approvalInfo,
            newBiz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtomicIndexVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    calExp: ").append(toIndentedString(calExp)).append("\n");
        sb.append("    calFnIds: ").append(toIndentedString(calFnIds)).append("\n");
        sb.append("    l1Id: ").append(toIndentedString(l1Id)).append("\n");
        sb.append("    l2Id: ").append(toIndentedString(l2Id)).append("\n");
        sb.append("    l3Id: ").append(toIndentedString(l3Id)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tbName: ").append(toIndentedString(tbName)).append("\n");
        sb.append("    dwType: ").append(toIndentedString(dwType)).append("\n");
        sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
        sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    approvalInfo: ").append(toIndentedString(approvalInfo)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
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

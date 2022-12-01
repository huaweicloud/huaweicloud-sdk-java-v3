package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建技能订单请求体
 */
public class CreateSkillOrderFrom {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<SkillInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commission_flag")

    private Integer commissionFlag;

    public CreateSkillOrderFrom withData(List<SkillInfo> data) {
        this.data = data;
        return this;
    }

    public CreateSkillOrderFrom addDataItem(SkillInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CreateSkillOrderFrom withData(Consumer<List<SkillInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 技能列表
     * @return data
     */
    public List<SkillInfo> getData() {
        return data;
    }

    public void setData(List<SkillInfo> data) {
        this.data = data;
    }

    public CreateSkillOrderFrom withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CreateSkillOrderFrom withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能ID
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public CreateSkillOrderFrom withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 购买个数
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CreateSkillOrderFrom withCommissionFlag(Integer commissionFlag) {
        this.commissionFlag = commissionFlag;
        return this;
    }

    /**
     * 定制技能标识
     * @return commissionFlag
     */
    public Integer getCommissionFlag() {
        return commissionFlag;
    }

    public void setCommissionFlag(Integer commissionFlag) {
        this.commissionFlag = commissionFlag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSkillOrderFrom createSkillOrderFrom = (CreateSkillOrderFrom) o;
        return Objects.equals(this.data, createSkillOrderFrom.data)
            && Objects.equals(this.total, createSkillOrderFrom.total)
            && Objects.equals(this.skillId, createSkillOrderFrom.skillId)
            && Objects.equals(this.amount, createSkillOrderFrom.amount)
            && Objects.equals(this.commissionFlag, createSkillOrderFrom.commissionFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total, skillId, amount, commissionFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillOrderFrom {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    commissionFlag: ").append(toIndentedString(commissionFlag)).append("\n");
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

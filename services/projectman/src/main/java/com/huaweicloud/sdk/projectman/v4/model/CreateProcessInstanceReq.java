package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateProcessInstanceReq
 */
public class CreateProcessInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_approval")

    private Boolean needApproval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private List<String> cc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachWikis")

    private List<String> attachWikis = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachDocuments")

    private List<String> attachDocuments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbs")

    private List<CreateProcessInstanceReqCcbs> ccbs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinions")

    private List<CreateProcessInstanceReqOpinions> opinions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cos")

    private List<CreateProcessInstanceReqCos> cos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_attachment_names")

    private List<String> localAttachmentNames = null;

    public CreateProcessInstanceReq withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateProcessInstanceReq withDescription(String description) {
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

    public CreateProcessInstanceReq withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateProcessInstanceReq withNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
        return this;
    }

    /**
     * 是否需要决策人审批
     * @return needApproval
     */
    public Boolean getNeedApproval() {
        return needApproval;
    }

    public void setNeedApproval(Boolean needApproval) {
        this.needApproval = needApproval;
    }

    public CreateProcessInstanceReq withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划完成日期时间戳，不可早于计划开始日期
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public CreateProcessInstanceReq withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始日期时间戳，不可晚于计划完成日期
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public CreateProcessInstanceReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateProcessInstanceReq withCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    public CreateProcessInstanceReq addCcItem(String ccItem) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    public CreateProcessInstanceReq withCc(Consumer<List<String>> ccSetter) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        ccSetter.accept(this.cc);
        return this;
    }

    /**
     * 抄送人列表
     * @return cc
     */
    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public CreateProcessInstanceReq withAttachWikis(List<String> attachWikis) {
        this.attachWikis = attachWikis;
        return this;
    }

    public CreateProcessInstanceReq addAttachWikisItem(String attachWikisItem) {
        if (this.attachWikis == null) {
            this.attachWikis = new ArrayList<>();
        }
        this.attachWikis.add(attachWikisItem);
        return this;
    }

    public CreateProcessInstanceReq withAttachWikis(Consumer<List<String>> attachWikisSetter) {
        if (this.attachWikis == null) {
            this.attachWikis = new ArrayList<>();
        }
        attachWikisSetter.accept(this.attachWikis);
        return this;
    }

    /**
     * 关联wiki
     * @return attachWikis
     */
    public List<String> getAttachWikis() {
        return attachWikis;
    }

    public void setAttachWikis(List<String> attachWikis) {
        this.attachWikis = attachWikis;
    }

    public CreateProcessInstanceReq withAttachDocuments(List<String> attachDocuments) {
        this.attachDocuments = attachDocuments;
        return this;
    }

    public CreateProcessInstanceReq addAttachDocumentsItem(String attachDocumentsItem) {
        if (this.attachDocuments == null) {
            this.attachDocuments = new ArrayList<>();
        }
        this.attachDocuments.add(attachDocumentsItem);
        return this;
    }

    public CreateProcessInstanceReq withAttachDocuments(Consumer<List<String>> attachDocumentsSetter) {
        if (this.attachDocuments == null) {
            this.attachDocuments = new ArrayList<>();
        }
        attachDocumentsSetter.accept(this.attachDocuments);
        return this;
    }

    /**
     * 关联文件
     * @return attachDocuments
     */
    public List<String> getAttachDocuments() {
        return attachDocuments;
    }

    public void setAttachDocuments(List<String> attachDocuments) {
        this.attachDocuments = attachDocuments;
    }

    public CreateProcessInstanceReq withCcbs(List<CreateProcessInstanceReqCcbs> ccbs) {
        this.ccbs = ccbs;
        return this;
    }

    public CreateProcessInstanceReq addCcbsItem(CreateProcessInstanceReqCcbs ccbsItem) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        this.ccbs.add(ccbsItem);
        return this;
    }

    public CreateProcessInstanceReq withCcbs(Consumer<List<CreateProcessInstanceReqCcbs>> ccbsSetter) {
        if (this.ccbs == null) {
            this.ccbs = new ArrayList<>();
        }
        ccbsSetter.accept(this.ccbs);
        return this;
    }

    /**
     * 决策人
     * @return ccbs
     */
    public List<CreateProcessInstanceReqCcbs> getCcbs() {
        return ccbs;
    }

    public void setCcbs(List<CreateProcessInstanceReqCcbs> ccbs) {
        this.ccbs = ccbs;
    }

    public CreateProcessInstanceReq withOpinions(List<CreateProcessInstanceReqOpinions> opinions) {
        this.opinions = opinions;
        return this;
    }

    public CreateProcessInstanceReq addOpinionsItem(CreateProcessInstanceReqOpinions opinionsItem) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        this.opinions.add(opinionsItem);
        return this;
    }

    public CreateProcessInstanceReq withOpinions(Consumer<List<CreateProcessInstanceReqOpinions>> opinionsSetter) {
        if (this.opinions == null) {
            this.opinions = new ArrayList<>();
        }
        opinionsSetter.accept(this.opinions);
        return this;
    }

    /**
     * 评审专家
     * @return opinions
     */
    public List<CreateProcessInstanceReqOpinions> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<CreateProcessInstanceReqOpinions> opinions) {
        this.opinions = opinions;
    }

    public CreateProcessInstanceReq withCos(List<CreateProcessInstanceReqCos> cos) {
        this.cos = cos;
        return this;
    }

    public CreateProcessInstanceReq addCosItem(CreateProcessInstanceReqCos cosItem) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        this.cos.add(cosItem);
        return this;
    }

    public CreateProcessInstanceReq withCos(Consumer<List<CreateProcessInstanceReqCos>> cosSetter) {
        if (this.cos == null) {
            this.cos = new ArrayList<>();
        }
        cosSetter.accept(this.cos);
        return this;
    }

    /**
     * 评审对象
     * @return cos
     */
    public List<CreateProcessInstanceReqCos> getCos() {
        return cos;
    }

    public void setCos(List<CreateProcessInstanceReqCos> cos) {
        this.cos = cos;
    }

    public CreateProcessInstanceReq withLocalAttachmentNames(List<String> localAttachmentNames) {
        this.localAttachmentNames = localAttachmentNames;
        return this;
    }

    public CreateProcessInstanceReq addLocalAttachmentNamesItem(String localAttachmentNamesItem) {
        if (this.localAttachmentNames == null) {
            this.localAttachmentNames = new ArrayList<>();
        }
        this.localAttachmentNames.add(localAttachmentNamesItem);
        return this;
    }

    public CreateProcessInstanceReq withLocalAttachmentNames(Consumer<List<String>> localAttachmentNamesSetter) {
        if (this.localAttachmentNames == null) {
            this.localAttachmentNames = new ArrayList<>();
        }
        localAttachmentNamesSetter.accept(this.localAttachmentNames);
        return this;
    }

    /**
     * 关联文件名
     * @return localAttachmentNames
     */
    public List<String> getLocalAttachmentNames() {
        return localAttachmentNames;
    }

    public void setLocalAttachmentNames(List<String> localAttachmentNames) {
        this.localAttachmentNames = localAttachmentNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProcessInstanceReq that = (CreateProcessInstanceReq) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.category, that.category) && Objects.equals(this.needApproval, that.needApproval)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.planStartDate, that.planStartDate) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cc, that.cc) && Objects.equals(this.attachWikis, that.attachWikis)
            && Objects.equals(this.attachDocuments, that.attachDocuments) && Objects.equals(this.ccbs, that.ccbs)
            && Objects.equals(this.opinions, that.opinions) && Objects.equals(this.cos, that.cos)
            && Objects.equals(this.localAttachmentNames, that.localAttachmentNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            description,
            category,
            needApproval,
            planEndDate,
            planStartDate,
            status,
            cc,
            attachWikis,
            attachDocuments,
            ccbs,
            opinions,
            cos,
            localAttachmentNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProcessInstanceReq {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    needApproval: ").append(toIndentedString(needApproval)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    attachWikis: ").append(toIndentedString(attachWikis)).append("\n");
        sb.append("    attachDocuments: ").append(toIndentedString(attachDocuments)).append("\n");
        sb.append("    ccbs: ").append(toIndentedString(ccbs)).append("\n");
        sb.append("    opinions: ").append(toIndentedString(opinions)).append("\n");
        sb.append("    cos: ").append(toIndentedString(cos)).append("\n");
        sb.append("    localAttachmentNames: ").append(toIndentedString(localAttachmentNames)).append("\n");
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

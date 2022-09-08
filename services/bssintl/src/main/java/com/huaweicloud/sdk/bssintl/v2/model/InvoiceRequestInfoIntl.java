package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InvoiceRequestInfoIntl
 */
public class InvoiceRequestInfoIntl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestId")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancelReason")

    private String cancelReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "titleType")

    private Integer titleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channelType")

    private Integer channelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceType")

    private Integer invoiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceTitle")

    private String invoiceTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceAmount")

    private Double invoiceAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceMethod")

    private Integer invoiceMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceClass")

    private Integer invoiceClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceState")

    private Integer invoiceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applyOpera")

    private String applyOpera;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addressInfo")

    private PostAddressInfoIntl addressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applyTime")

    private String applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceMode")

    private String invoiceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestMode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "srcRequestId")

    private String srcRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "salesId")

    private String salesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoiceNo")

    private String invoiceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tradeType")

    private Integer tradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billCycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxList")

    private List<TaxInfo> taxList = null;

    public InvoiceRequestInfoIntl withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public InvoiceRequestInfoIntl withCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * 驳回原因。
     * @return cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public InvoiceRequestInfoIntl withTitleType(Integer titleType) {
        this.titleType = titleType;
        return this;
    }

    /**
     * 开票类型。 0：个人1：企业
     * @return titleType
     */
    public Integer getTitleType() {
        return titleType;
    }

    public void setTitleType(Integer titleType) {
        this.titleType = titleType;
    }

    public InvoiceRequestInfoIntl withChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * 渠道类型。 0：华为云
     * @return channelType
     */
    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public InvoiceRequestInfoIntl withInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * 发票种类。 0：增值税专用发票1：增值税普通发票
     * @return invoiceType
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public InvoiceRequestInfoIntl withInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }

    /**
     * 发票抬头。
     * @return invoiceTitle
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public InvoiceRequestInfoIntl withInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }

    /**
     * 已开票金额（美元） 。
     * @return invoiceAmount
     */
    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public InvoiceRequestInfoIntl withInvoiceMethod(Integer invoiceMethod) {
        this.invoiceMethod = invoiceMethod;
        return this;
    }

    /**
     * 开票方式。 0：账期1：到账2：订单
     * @return invoiceMethod
     */
    public Integer getInvoiceMethod() {
        return invoiceMethod;
    }

    public void setInvoiceMethod(Integer invoiceMethod) {
        this.invoiceMethod = invoiceMethod;
    }

    public InvoiceRequestInfoIntl withInvoiceClass(Integer invoiceClass) {
        this.invoiceClass = invoiceClass;
        return this;
    }

    /**
     * 发票类别。 0：税票1：商票
     * @return invoiceClass
     */
    public Integer getInvoiceClass() {
        return invoiceClass;
    }

    public void setInvoiceClass(Integer invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    public InvoiceRequestInfoIntl withInvoiceState(Integer invoiceState) {
        this.invoiceState = invoiceState;
        return this;
    }

    /**
     * 开票状态。 0：草稿1：待审核4：等待导出发票文件5：等待发票文件回填6：等待邮寄确认7：等待回执确认8：完成9：已退票11：等待驳回审核13：退票待审核14：待退票状态回填15：退票失败
     * @return invoiceState
     */
    public Integer getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(Integer invoiceState) {
        this.invoiceState = invoiceState;
    }

    public InvoiceRequestInfoIntl withApplyOpera(String applyOpera) {
        this.applyOpera = applyOpera;
        return this;
    }

    /**
     * 发票申请人员。
     * @return applyOpera
     */
    public String getApplyOpera() {
        return applyOpera;
    }

    public void setApplyOpera(String applyOpera) {
        this.applyOpera = applyOpera;
    }

    public InvoiceRequestInfoIntl withAddressInfo(PostAddressInfoIntl addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }

    public InvoiceRequestInfoIntl withAddressInfo(Consumer<PostAddressInfoIntl> addressInfoSetter) {
        if (this.addressInfo == null) {
            this.addressInfo = new PostAddressInfoIntl();
            addressInfoSetter.accept(this.addressInfo);
        }

        return this;
    }

    /**
     * Get addressInfo
     * @return addressInfo
     */
    public PostAddressInfoIntl getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(PostAddressInfoIntl addressInfo) {
        this.addressInfo = addressInfo;
    }

    public InvoiceRequestInfoIntl withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 申请时间（UTC时间）。
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public InvoiceRequestInfoIntl withInvoiceMode(String invoiceMode) {
        this.invoiceMode = invoiceMode;
        return this;
    }

    /**
     * 发票类型。 0：纸质票
     * @return invoiceMode
     */
    public String getInvoiceMode() {
        return invoiceMode;
    }

    public void setInvoiceMode(String invoiceMode) {
        this.invoiceMode = invoiceMode;
    }

    public InvoiceRequestInfoIntl withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 电子发票寄送地。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InvoiceRequestInfoIntl withRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 申请类型。 0：开票申请1：退票申请2：正向开票已退票
     * @return requestMode
     */
    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public InvoiceRequestInfoIntl withSrcRequestId(String srcRequestId) {
        this.srcRequestId = srcRequestId;
        return this;
    }

    /**
     * 退票时的原申请ID。
     * @return srcRequestId
     */
    public String getSrcRequestId() {
        return srcRequestId;
    }

    public void setSrcRequestId(String srcRequestId) {
        this.srcRequestId = srcRequestId;
    }

    public InvoiceRequestInfoIntl withSalesId(String salesId) {
        this.salesId = salesId;
        return this;
    }

    /**
     * 签约主体ID。
     * @return salesId
     */
    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public InvoiceRequestInfoIntl withInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }

    /**
     * 发票号码。
     * @return invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public InvoiceRequestInfoIntl withTradeType(Integer tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    /**
     * 交易类型。 3：结算信用卡扣减4：结算未结清开票5：先开票后到款6：BP月结开票7：充值开票8：包年/包月在线支付开票10：普通提现开票
     * @return tradeType
     */
    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public InvoiceRequestInfoIntl withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 发票账期。
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public InvoiceRequestInfoIntl withTaxList(List<TaxInfo> taxList) {
        this.taxList = taxList;
        return this;
    }

    public InvoiceRequestInfoIntl addTaxListItem(TaxInfo taxListItem) {
        if (this.taxList == null) {
            this.taxList = new ArrayList<>();
        }
        this.taxList.add(taxListItem);
        return this;
    }

    public InvoiceRequestInfoIntl withTaxList(Consumer<List<TaxInfo>> taxListSetter) {
        if (this.taxList == null) {
            this.taxList = new ArrayList<>();
        }
        taxListSetter.accept(this.taxList);
        return this;
    }

    /**
     * 税务信息列表，参见表4。
     * @return taxList
     */
    public List<TaxInfo> getTaxList() {
        return taxList;
    }

    public void setTaxList(List<TaxInfo> taxList) {
        this.taxList = taxList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceRequestInfoIntl invoiceRequestInfoIntl = (InvoiceRequestInfoIntl) o;
        return Objects.equals(this.requestId, invoiceRequestInfoIntl.requestId)
            && Objects.equals(this.cancelReason, invoiceRequestInfoIntl.cancelReason)
            && Objects.equals(this.titleType, invoiceRequestInfoIntl.titleType)
            && Objects.equals(this.channelType, invoiceRequestInfoIntl.channelType)
            && Objects.equals(this.invoiceType, invoiceRequestInfoIntl.invoiceType)
            && Objects.equals(this.invoiceTitle, invoiceRequestInfoIntl.invoiceTitle)
            && Objects.equals(this.invoiceAmount, invoiceRequestInfoIntl.invoiceAmount)
            && Objects.equals(this.invoiceMethod, invoiceRequestInfoIntl.invoiceMethod)
            && Objects.equals(this.invoiceClass, invoiceRequestInfoIntl.invoiceClass)
            && Objects.equals(this.invoiceState, invoiceRequestInfoIntl.invoiceState)
            && Objects.equals(this.applyOpera, invoiceRequestInfoIntl.applyOpera)
            && Objects.equals(this.addressInfo, invoiceRequestInfoIntl.addressInfo)
            && Objects.equals(this.applyTime, invoiceRequestInfoIntl.applyTime)
            && Objects.equals(this.invoiceMode, invoiceRequestInfoIntl.invoiceMode)
            && Objects.equals(this.email, invoiceRequestInfoIntl.email)
            && Objects.equals(this.requestMode, invoiceRequestInfoIntl.requestMode)
            && Objects.equals(this.srcRequestId, invoiceRequestInfoIntl.srcRequestId)
            && Objects.equals(this.salesId, invoiceRequestInfoIntl.salesId)
            && Objects.equals(this.invoiceNo, invoiceRequestInfoIntl.invoiceNo)
            && Objects.equals(this.tradeType, invoiceRequestInfoIntl.tradeType)
            && Objects.equals(this.billCycle, invoiceRequestInfoIntl.billCycle)
            && Objects.equals(this.taxList, invoiceRequestInfoIntl.taxList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId,
            cancelReason,
            titleType,
            channelType,
            invoiceType,
            invoiceTitle,
            invoiceAmount,
            invoiceMethod,
            invoiceClass,
            invoiceState,
            applyOpera,
            addressInfo,
            applyTime,
            invoiceMode,
            email,
            requestMode,
            srcRequestId,
            salesId,
            invoiceNo,
            tradeType,
            billCycle,
            taxList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceRequestInfoIntl {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
        sb.append("    titleType: ").append(toIndentedString(titleType)).append("\n");
        sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
        sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
        sb.append("    invoiceTitle: ").append(toIndentedString(invoiceTitle)).append("\n");
        sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
        sb.append("    invoiceMethod: ").append(toIndentedString(invoiceMethod)).append("\n");
        sb.append("    invoiceClass: ").append(toIndentedString(invoiceClass)).append("\n");
        sb.append("    invoiceState: ").append(toIndentedString(invoiceState)).append("\n");
        sb.append("    applyOpera: ").append(toIndentedString(applyOpera)).append("\n");
        sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    invoiceMode: ").append(toIndentedString(invoiceMode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    srcRequestId: ").append(toIndentedString(srcRequestId)).append("\n");
        sb.append("    salesId: ").append(toIndentedString(salesId)).append("\n");
        sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
        sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    taxList: ").append(toIndentedString(taxList)).append("\n");
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

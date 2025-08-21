package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VatInvoiceResult
 */
public class VatInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoice_tag")

    private String invoiceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_amount")

    private String sumAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum_tax")

    private String sumTax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribution")

    private String attribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supervision_seal")

    private List<String> supervisionSeal = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "print_code")

    private String printCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_number")

    private String machineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "print_number")

    private String printNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_code")

    private String checkCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_block")

    private String encryptionBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_name")

    private String buyerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_id")

    private String buyerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_address")

    private String buyerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_bank")

    private String buyerBank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_name")

    private String sellerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_id")

    private String sellerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_address")

    private String sellerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_bank")

    private String sellerBank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtotal_amount")

    private String subtotalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtotal_tax")

    private String subtotalTax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_in_words")

    private String totalInWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver")

    private String receiver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_seal")

    private List<String> sellerSeal = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_list")

    private List<ItemList> itemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_buyer_name")

    private String belongBuyerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_seller_name")

    private String belongSellerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_vat_code")

    private String belongVatCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_number")

    private String belongNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_pages")

    private String belongPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_current_page")

    private String belongCurrentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_remarks")

    private String belongRemarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_issue_date")

    private String belongIssueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sales_mark")

    private Boolean salesMark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_sum_amount")

    private String belongSumAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_sum_tax")

    private String belongSumTax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_subtotal_amount")

    private String belongSubtotalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_subtotal_tax")

    private String belongSubtotalTax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_discount_amount")

    private String belongDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_discount_tax")

    private String belongDiscountTax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_item_list")

    private List<BelongItemList> belongItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passenger_travel_item_list")

    private List<PassengerTravelItemList> passengerTravelItemList = null;

    public VatInvoiceResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 增值税发票标题 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VatInvoiceResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 增值税发票类型，取值包括： - special: 增值税专用发票  - normal: 增值税普通发票  - electronic: 增值税电子普通发票  - special_electronic: 增值税电子专用发票  - toll: 增值税电子普通发票（通行费）  - roll: 增值税普通发票（卷票）  - fully_digitalized_special_electronic: 全电专用发票  - fully_digitalized_normal_electronic: 全电普通发票 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VatInvoiceResult withInvoiceTag(String invoiceTag) {
        this.invoiceTag = invoiceTag;
        return this;
    }

    /**
     * 增值税发票左上角标志。取值包含：通行费、代开、成品油、收购、机动车、旅客运输服务。 当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return invoiceTag
     */
    public String getInvoiceTag() {
        return invoiceTag;
    }

    public void setInvoiceTag(String invoiceTag) {
        this.invoiceTag = invoiceTag;
    }

    public VatInvoiceResult withSumAmount(String sumAmount) {
        this.sumAmount = sumAmount;
        return this;
    }

    /**
     * 小计金额，当传入为全电发票时返回此字段。 
     * @return sumAmount
     */
    public String getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(String sumAmount) {
        this.sumAmount = sumAmount;
    }

    public VatInvoiceResult withSumTax(String sumTax) {
        this.sumTax = sumTax;
        return this;
    }

    /**
     * 小计税额，当传入为全电发票时返回此字段。 
     * @return sumTax
     */
    public String getSumTax() {
        return sumTax;
    }

    public void setSumTax(String sumTax) {
        this.sumTax = sumTax;
    }

    public VatInvoiceResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 发票联次。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public VatInvoiceResult withAttribution(String attribution) {
        this.attribution = attribution;
        return this;
    }

    /**
     * 发票归属地。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return attribution
     */
    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public VatInvoiceResult withSupervisionSeal(List<String> supervisionSeal) {
        this.supervisionSeal = supervisionSeal;
        return this;
    }

    public VatInvoiceResult addSupervisionSealItem(String supervisionSealItem) {
        if (this.supervisionSeal == null) {
            this.supervisionSeal = new ArrayList<>();
        }
        this.supervisionSeal.add(supervisionSealItem);
        return this;
    }

    public VatInvoiceResult withSupervisionSeal(Consumer<List<String>> supervisionSealSetter) {
        if (this.supervisionSeal == null) {
            this.supervisionSeal = new ArrayList<>();
        }
        supervisionSealSetter.accept(this.supervisionSeal);
        return this;
    }

    /**
     * 发票监制章。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return supervisionSeal
     */
    public List<String> getSupervisionSeal() {
        return supervisionSeal;
    }

    public void setSupervisionSeal(List<String> supervisionSeal) {
        this.supervisionSeal = supervisionSeal;
    }

    public VatInvoiceResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 发票代码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public VatInvoiceResult withPrintCode(String printCode) {
        this.printCode = printCode;
        return this;
    }

    /**
     * 机打代码。 当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return printCode
     */
    public String getPrintCode() {
        return printCode;
    }

    public void setPrintCode(String printCode) {
        this.printCode = printCode;
    }

    public VatInvoiceResult withMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    /**
     * 机器编号。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return machineNumber
     */
    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public VatInvoiceResult withPrintNumber(String printNumber) {
        this.printNumber = printNumber;
        return this;
    }

    /**
     * 机打号码。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return printNumber
     */
    public String getPrintNumber() {
        return printNumber;
    }

    public void setPrintNumber(String printNumber) {
        this.printNumber = printNumber;
    }

    public VatInvoiceResult withCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    /**
     * 发票校验码，特定类型增值税发票内不存在该信息时返回空字符串。 
     * @return checkCode
     */
    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public VatInvoiceResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 发票号码。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VatInvoiceResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 开票日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public VatInvoiceResult withEncryptionBlock(String encryptionBlock) {
        this.encryptionBlock = encryptionBlock;
        return this;
    }

    /**
     * 密码区。 
     * @return encryptionBlock
     */
    public String getEncryptionBlock() {
        return encryptionBlock;
    }

    public void setEncryptionBlock(String encryptionBlock) {
        this.encryptionBlock = encryptionBlock;
    }

    public VatInvoiceResult withBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    /**
     * 购买方名称。 
     * @return buyerName
     */
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public VatInvoiceResult withBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    /**
     * 购买方纳税人识别号。 
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public VatInvoiceResult withBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
        return this;
    }

    /**
     * 购买方地址、电话。 
     * @return buyerAddress
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public VatInvoiceResult withBuyerBank(String buyerBank) {
        this.buyerBank = buyerBank;
        return this;
    }

    /**
     * 购买方开户行及帐号。 
     * @return buyerBank
     */
    public String getBuyerBank() {
        return buyerBank;
    }

    public void setBuyerBank(String buyerBank) {
        this.buyerBank = buyerBank;
    }

    public VatInvoiceResult withSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    /**
     * 销售方名称。 
     * @return sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public VatInvoiceResult withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * 销售方纳税人识别号。 
     * @return sellerId
     */
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public VatInvoiceResult withSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    /**
     * 销售方地址、电话。 
     * @return sellerAddress
     */
    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public VatInvoiceResult withSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
        return this;
    }

    /**
     * 销售方开户行及帐号。 
     * @return sellerBank
     */
    public String getSellerBank() {
        return sellerBank;
    }

    public void setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
    }

    public VatInvoiceResult withSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
        return this;
    }

    /**
     * 合计金额。 
     * @return subtotalAmount
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    public VatInvoiceResult withSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
        return this;
    }

    /**
     * 合计税额。 
     * @return subtotalTax
     */
    public String getSubtotalTax() {
        return subtotalTax;
    }

    public void setSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
    }

    public VatInvoiceResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 价税合计。 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public VatInvoiceResult withTotalInWords(String totalInWords) {
        this.totalInWords = totalInWords;
        return this;
    }

    /**
     * 价税合计（大写）。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return totalInWords
     */
    public String getTotalInWords() {
        return totalInWords;
    }

    public void setTotalInWords(String totalInWords) {
        this.totalInWords = totalInWords;
    }

    public VatInvoiceResult withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public VatInvoiceResult withReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * 收款人。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public VatInvoiceResult withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 复核。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public VatInvoiceResult withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 开票人。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public VatInvoiceResult withSellerSeal(List<String> sellerSeal) {
        this.sellerSeal = sellerSeal;
        return this;
    }

    public VatInvoiceResult addSellerSealItem(String sellerSealItem) {
        if (this.sellerSeal == null) {
            this.sellerSeal = new ArrayList<>();
        }
        this.sellerSeal.add(sellerSealItem);
        return this;
    }

    public VatInvoiceResult withSellerSeal(Consumer<List<String>> sellerSealSetter) {
        if (this.sellerSeal == null) {
            this.sellerSeal = new ArrayList<>();
        }
        sellerSealSetter.accept(this.sellerSeal);
        return this;
    }

    /**
     * 销售方发票专用章。  当\"advanced_mode\"设置为\"true\"时才返回。 
     * @return sellerSeal
     */
    public List<String> getSellerSeal() {
        return sellerSeal;
    }

    public void setSellerSeal(List<String> sellerSeal) {
        this.sellerSeal = sellerSeal;
    }

    public VatInvoiceResult withItemList(List<ItemList> itemList) {
        this.itemList = itemList;
        return this;
    }

    public VatInvoiceResult addItemListItem(ItemList itemListItem) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        this.itemList.add(itemListItem);
        return this;
    }

    public VatInvoiceResult withItemList(Consumer<List<ItemList>> itemListSetter) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        itemListSetter.accept(this.itemList);
        return this;
    }

    /**
     * 货物或应税劳务列表。 
     * @return itemList
     */
    public List<ItemList> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemList> itemList) {
        this.itemList = itemList;
    }

    public VatInvoiceResult withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 省。 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public VatInvoiceResult withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 市。 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public VatInvoiceResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 当“advanced_mode”设置为“true”时才返回。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public VatInvoiceResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 文本框在原图位置。输出左上、右上、右下、左下四个点坐标。当\"return_text_location\"设置为“true”时才返回。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    public VatInvoiceResult withBelongBuyerName(String belongBuyerName) {
        this.belongBuyerName = belongBuyerName;
        return this;
    }

    /**
     * 销货清单的购买方名称。 当传入图片为发票销货清单时返回此字段。 
     * @return belongBuyerName
     */
    public String getBelongBuyerName() {
        return belongBuyerName;
    }

    public void setBelongBuyerName(String belongBuyerName) {
        this.belongBuyerName = belongBuyerName;
    }

    public VatInvoiceResult withBelongSellerName(String belongSellerName) {
        this.belongSellerName = belongSellerName;
        return this;
    }

    /**
     * 销货清单的销售方名称。 当传入图片为发票销货清单时返回此字段。 
     * @return belongSellerName
     */
    public String getBelongSellerName() {
        return belongSellerName;
    }

    public void setBelongSellerName(String belongSellerName) {
        this.belongSellerName = belongSellerName;
    }

    public VatInvoiceResult withBelongVatCode(String belongVatCode) {
        this.belongVatCode = belongVatCode;
        return this;
    }

    /**
     * 所属的增值税发票代码。 当传入图片为发票销货清单时返回此字段。 
     * @return belongVatCode
     */
    public String getBelongVatCode() {
        return belongVatCode;
    }

    public void setBelongVatCode(String belongVatCode) {
        this.belongVatCode = belongVatCode;
    }

    public VatInvoiceResult withBelongNumber(String belongNumber) {
        this.belongNumber = belongNumber;
        return this;
    }

    /**
     * 销货清单的开票号码。 当传入图片为发票销货清单时返回此字段。 
     * @return belongNumber
     */
    public String getBelongNumber() {
        return belongNumber;
    }

    public void setBelongNumber(String belongNumber) {
        this.belongNumber = belongNumber;
    }

    public VatInvoiceResult withBelongPages(String belongPages) {
        this.belongPages = belongPages;
        return this;
    }

    /**
     * 销货清单的总页码数。 当传入图片为发票销货清单时返回此字段。 
     * @return belongPages
     */
    public String getBelongPages() {
        return belongPages;
    }

    public void setBelongPages(String belongPages) {
        this.belongPages = belongPages;
    }

    public VatInvoiceResult withBelongCurrentPage(String belongCurrentPage) {
        this.belongCurrentPage = belongCurrentPage;
        return this;
    }

    /**
     * 销货清单的当前页码。 当传入图片为发票销货清单时返回此字段。 
     * @return belongCurrentPage
     */
    public String getBelongCurrentPage() {
        return belongCurrentPage;
    }

    public void setBelongCurrentPage(String belongCurrentPage) {
        this.belongCurrentPage = belongCurrentPage;
    }

    public VatInvoiceResult withBelongRemarks(String belongRemarks) {
        this.belongRemarks = belongRemarks;
        return this;
    }

    /**
     * 销货清单的备注。 当传入图片为发票销货清单时返回此字段。 
     * @return belongRemarks
     */
    public String getBelongRemarks() {
        return belongRemarks;
    }

    public void setBelongRemarks(String belongRemarks) {
        this.belongRemarks = belongRemarks;
    }

    public VatInvoiceResult withBelongIssueDate(String belongIssueDate) {
        this.belongIssueDate = belongIssueDate;
        return this;
    }

    /**
     * 销货清单的填开日期。 当传入图片为发票销货清单时返回此字段。 
     * @return belongIssueDate
     */
    public String getBelongIssueDate() {
        return belongIssueDate;
    }

    public void setBelongIssueDate(String belongIssueDate) {
        this.belongIssueDate = belongIssueDate;
    }

    public VatInvoiceResult withSalesMark(Boolean salesMark) {
        this.salesMark = salesMark;
        return this;
    }

    /**
     * 是否是销货清单，可选值为： - true：输入图片是销货清单。 - false：输入图片不是销货清单。 
     * @return salesMark
     */
    public Boolean getSalesMark() {
        return salesMark;
    }

    public void setSalesMark(Boolean salesMark) {
        this.salesMark = salesMark;
    }

    public VatInvoiceResult withBelongSumAmount(String belongSumAmount) {
        this.belongSumAmount = belongSumAmount;
        return this;
    }

    /**
     * 销货清单的小计金额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongSumAmount
     */
    public String getBelongSumAmount() {
        return belongSumAmount;
    }

    public void setBelongSumAmount(String belongSumAmount) {
        this.belongSumAmount = belongSumAmount;
    }

    public VatInvoiceResult withBelongSumTax(String belongSumTax) {
        this.belongSumTax = belongSumTax;
        return this;
    }

    /**
     * 销货清单的小计税额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongSumTax
     */
    public String getBelongSumTax() {
        return belongSumTax;
    }

    public void setBelongSumTax(String belongSumTax) {
        this.belongSumTax = belongSumTax;
    }

    public VatInvoiceResult withBelongSubtotalAmount(String belongSubtotalAmount) {
        this.belongSubtotalAmount = belongSubtotalAmount;
        return this;
    }

    /**
     * 销货清单的总计或者合计金额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongSubtotalAmount
     */
    public String getBelongSubtotalAmount() {
        return belongSubtotalAmount;
    }

    public void setBelongSubtotalAmount(String belongSubtotalAmount) {
        this.belongSubtotalAmount = belongSubtotalAmount;
    }

    public VatInvoiceResult withBelongSubtotalTax(String belongSubtotalTax) {
        this.belongSubtotalTax = belongSubtotalTax;
        return this;
    }

    /**
     * 销货清单的总计税额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongSubtotalTax
     */
    public String getBelongSubtotalTax() {
        return belongSubtotalTax;
    }

    public void setBelongSubtotalTax(String belongSubtotalTax) {
        this.belongSubtotalTax = belongSubtotalTax;
    }

    public VatInvoiceResult withBelongDiscountAmount(String belongDiscountAmount) {
        this.belongDiscountAmount = belongDiscountAmount;
        return this;
    }

    /**
     * 销货清单的折扣金额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongDiscountAmount
     */
    public String getBelongDiscountAmount() {
        return belongDiscountAmount;
    }

    public void setBelongDiscountAmount(String belongDiscountAmount) {
        this.belongDiscountAmount = belongDiscountAmount;
    }

    public VatInvoiceResult withBelongDiscountTax(String belongDiscountTax) {
        this.belongDiscountTax = belongDiscountTax;
        return this;
    }

    /**
     * 销货清单的折扣税额。 当传入图片为发票销货清单时返回此字段。 
     * @return belongDiscountTax
     */
    public String getBelongDiscountTax() {
        return belongDiscountTax;
    }

    public void setBelongDiscountTax(String belongDiscountTax) {
        this.belongDiscountTax = belongDiscountTax;
    }

    public VatInvoiceResult withBelongItemList(List<BelongItemList> belongItemList) {
        this.belongItemList = belongItemList;
        return this;
    }

    public VatInvoiceResult addBelongItemListItem(BelongItemList belongItemListItem) {
        if (this.belongItemList == null) {
            this.belongItemList = new ArrayList<>();
        }
        this.belongItemList.add(belongItemListItem);
        return this;
    }

    public VatInvoiceResult withBelongItemList(Consumer<List<BelongItemList>> belongItemListSetter) {
        if (this.belongItemList == null) {
            this.belongItemList = new ArrayList<>();
        }
        belongItemListSetter.accept(this.belongItemList);
        return this;
    }

    /**
     * 销货清单的货物（劳务）名称列表。 当传入图片为发票销货清单时返回此字段。 
     * @return belongItemList
     */
    public List<BelongItemList> getBelongItemList() {
        return belongItemList;
    }

    public void setBelongItemList(List<BelongItemList> belongItemList) {
        this.belongItemList = belongItemList;
    }

    public VatInvoiceResult withPassengerTravelItemList(List<PassengerTravelItemList> passengerTravelItemList) {
        this.passengerTravelItemList = passengerTravelItemList;
        return this;
    }

    public VatInvoiceResult addPassengerTravelItemListItem(PassengerTravelItemList passengerTravelItemListItem) {
        if (this.passengerTravelItemList == null) {
            this.passengerTravelItemList = new ArrayList<>();
        }
        this.passengerTravelItemList.add(passengerTravelItemListItem);
        return this;
    }

    public VatInvoiceResult withPassengerTravelItemList(
        Consumer<List<PassengerTravelItemList>> passengerTravelItemListSetter) {
        if (this.passengerTravelItemList == null) {
            this.passengerTravelItemList = new ArrayList<>();
        }
        passengerTravelItemListSetter.accept(this.passengerTravelItemList);
        return this;
    }

    /**
     * 旅客运输服务的出行信息列表。 当传入图片为旅客运输服务发票时返回此字段。 
     * @return passengerTravelItemList
     */
    public List<PassengerTravelItemList> getPassengerTravelItemList() {
        return passengerTravelItemList;
    }

    public void setPassengerTravelItemList(List<PassengerTravelItemList> passengerTravelItemList) {
        this.passengerTravelItemList = passengerTravelItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VatInvoiceResult that = (VatInvoiceResult) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.type, that.type)
            && Objects.equals(this.invoiceTag, that.invoiceTag) && Objects.equals(this.sumAmount, that.sumAmount)
            && Objects.equals(this.sumTax, that.sumTax) && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.attribution, that.attribution)
            && Objects.equals(this.supervisionSeal, that.supervisionSeal) && Objects.equals(this.code, that.code)
            && Objects.equals(this.printCode, that.printCode) && Objects.equals(this.machineNumber, that.machineNumber)
            && Objects.equals(this.printNumber, that.printNumber) && Objects.equals(this.checkCode, that.checkCode)
            && Objects.equals(this.number, that.number) && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.encryptionBlock, that.encryptionBlock)
            && Objects.equals(this.buyerName, that.buyerName) && Objects.equals(this.buyerId, that.buyerId)
            && Objects.equals(this.buyerAddress, that.buyerAddress) && Objects.equals(this.buyerBank, that.buyerBank)
            && Objects.equals(this.sellerName, that.sellerName) && Objects.equals(this.sellerId, that.sellerId)
            && Objects.equals(this.sellerAddress, that.sellerAddress)
            && Objects.equals(this.sellerBank, that.sellerBank)
            && Objects.equals(this.subtotalAmount, that.subtotalAmount)
            && Objects.equals(this.subtotalTax, that.subtotalTax) && Objects.equals(this.total, that.total)
            && Objects.equals(this.totalInWords, that.totalInWords) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.receiver, that.receiver) && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.issuer, that.issuer) && Objects.equals(this.sellerSeal, that.sellerSeal)
            && Objects.equals(this.itemList, that.itemList) && Objects.equals(this.province, that.province)
            && Objects.equals(this.city, that.city) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.textLocation, that.textLocation)
            && Objects.equals(this.belongBuyerName, that.belongBuyerName)
            && Objects.equals(this.belongSellerName, that.belongSellerName)
            && Objects.equals(this.belongVatCode, that.belongVatCode)
            && Objects.equals(this.belongNumber, that.belongNumber)
            && Objects.equals(this.belongPages, that.belongPages)
            && Objects.equals(this.belongCurrentPage, that.belongCurrentPage)
            && Objects.equals(this.belongRemarks, that.belongRemarks)
            && Objects.equals(this.belongIssueDate, that.belongIssueDate)
            && Objects.equals(this.salesMark, that.salesMark)
            && Objects.equals(this.belongSumAmount, that.belongSumAmount)
            && Objects.equals(this.belongSumTax, that.belongSumTax)
            && Objects.equals(this.belongSubtotalAmount, that.belongSubtotalAmount)
            && Objects.equals(this.belongSubtotalTax, that.belongSubtotalTax)
            && Objects.equals(this.belongDiscountAmount, that.belongDiscountAmount)
            && Objects.equals(this.belongDiscountTax, that.belongDiscountTax)
            && Objects.equals(this.belongItemList, that.belongItemList)
            && Objects.equals(this.passengerTravelItemList, that.passengerTravelItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            type,
            invoiceTag,
            sumAmount,
            sumTax,
            serialNumber,
            attribution,
            supervisionSeal,
            code,
            printCode,
            machineNumber,
            printNumber,
            checkCode,
            number,
            issueDate,
            encryptionBlock,
            buyerName,
            buyerId,
            buyerAddress,
            buyerBank,
            sellerName,
            sellerId,
            sellerAddress,
            sellerBank,
            subtotalAmount,
            subtotalTax,
            total,
            totalInWords,
            remarks,
            receiver,
            reviewer,
            issuer,
            sellerSeal,
            itemList,
            province,
            city,
            confidence,
            textLocation,
            belongBuyerName,
            belongSellerName,
            belongVatCode,
            belongNumber,
            belongPages,
            belongCurrentPage,
            belongRemarks,
            belongIssueDate,
            salesMark,
            belongSumAmount,
            belongSumTax,
            belongSubtotalAmount,
            belongSubtotalTax,
            belongDiscountAmount,
            belongDiscountTax,
            belongItemList,
            passengerTravelItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VatInvoiceResult {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    invoiceTag: ").append(toIndentedString(invoiceTag)).append("\n");
        sb.append("    sumAmount: ").append(toIndentedString(sumAmount)).append("\n");
        sb.append("    sumTax: ").append(toIndentedString(sumTax)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
        sb.append("    supervisionSeal: ").append(toIndentedString(supervisionSeal)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    printCode: ").append(toIndentedString(printCode)).append("\n");
        sb.append("    machineNumber: ").append(toIndentedString(machineNumber)).append("\n");
        sb.append("    printNumber: ").append(toIndentedString(printNumber)).append("\n");
        sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    encryptionBlock: ").append(toIndentedString(encryptionBlock)).append("\n");
        sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
        sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
        sb.append("    buyerAddress: ").append(toIndentedString(buyerAddress)).append("\n");
        sb.append("    buyerBank: ").append(toIndentedString(buyerBank)).append("\n");
        sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    sellerAddress: ").append(toIndentedString(sellerAddress)).append("\n");
        sb.append("    sellerBank: ").append(toIndentedString(sellerBank)).append("\n");
        sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
        sb.append("    subtotalTax: ").append(toIndentedString(subtotalTax)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalInWords: ").append(toIndentedString(totalInWords)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    sellerSeal: ").append(toIndentedString(sellerSeal)).append("\n");
        sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    belongBuyerName: ").append(toIndentedString(belongBuyerName)).append("\n");
        sb.append("    belongSellerName: ").append(toIndentedString(belongSellerName)).append("\n");
        sb.append("    belongVatCode: ").append(toIndentedString(belongVatCode)).append("\n");
        sb.append("    belongNumber: ").append(toIndentedString(belongNumber)).append("\n");
        sb.append("    belongPages: ").append(toIndentedString(belongPages)).append("\n");
        sb.append("    belongCurrentPage: ").append(toIndentedString(belongCurrentPage)).append("\n");
        sb.append("    belongRemarks: ").append(toIndentedString(belongRemarks)).append("\n");
        sb.append("    belongIssueDate: ").append(toIndentedString(belongIssueDate)).append("\n");
        sb.append("    salesMark: ").append(toIndentedString(salesMark)).append("\n");
        sb.append("    belongSumAmount: ").append(toIndentedString(belongSumAmount)).append("\n");
        sb.append("    belongSumTax: ").append(toIndentedString(belongSumTax)).append("\n");
        sb.append("    belongSubtotalAmount: ").append(toIndentedString(belongSubtotalAmount)).append("\n");
        sb.append("    belongSubtotalTax: ").append(toIndentedString(belongSubtotalTax)).append("\n");
        sb.append("    belongDiscountAmount: ").append(toIndentedString(belongDiscountAmount)).append("\n");
        sb.append("    belongDiscountTax: ").append(toIndentedString(belongDiscountTax)).append("\n");
        sb.append("    belongItemList: ").append(toIndentedString(belongItemList)).append("\n");
        sb.append("    passengerTravelItemList: ").append(toIndentedString(passengerTravelItemList)).append("\n");
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

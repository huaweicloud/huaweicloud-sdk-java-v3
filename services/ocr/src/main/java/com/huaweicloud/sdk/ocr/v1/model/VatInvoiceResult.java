package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.ItemList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VatInvoiceResult
 */
public class VatInvoiceResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serial_number")
    
    private String serialNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attribution")
    
    private String attribution;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="supervision_seal")
    
    private List<String> supervisionSeal = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="machine_number")
    
    private String machineNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="print_number")
    
    private String printNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_code")
    
    private String checkCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number")
    
    private String number;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_date")
    
    private String issueDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption_block")
    
    private String encryptionBlock;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="buyer_name")
    
    private String buyerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="buyer_id")
    
    private String buyerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="buyer_address")
    
    private String buyerAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="buyer_bank")
    
    private String buyerBank;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seller_name")
    
    private String sellerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seller_id")
    
    private String sellerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seller_address")
    
    private String sellerAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seller_bank")
    
    private String sellerBank;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtotal_amount")
    
    private String subtotalAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtotal_tax")
    
    private String subtotalTax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private String total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_in_words")
    
    private String totalInWords;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remarks")
    
    private String remarks;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="receiver")
    
    private String receiver;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reviewer")
    
    private String reviewer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issuer")
    
    private String issuer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seller_seal")
    
    private List<String> sellerSeal = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="item_list")
    
    private List<ItemList> itemList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Object confidence;

    public VatInvoiceResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 增值税发票类型，可选值包括：  - special: 增值税专用发票  - normal: 增值税普通发票  - electronic: 增值税电子普通发票 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public VatInvoiceResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    


    /**
     * 发票联次。 当“advanced_mode”设置为“true”时才返回。 
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
     * 发票归属地。 当“advanced_mode”设置为“true”时才返回。 
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
        if(this.supervisionSeal == null) {
            this.supervisionSeal = new ArrayList<>();
        }
        this.supervisionSeal.add(supervisionSealItem);
        return this;
    }

    public VatInvoiceResult withSupervisionSeal(Consumer<List<String>> supervisionSealSetter) {
        if(this.supervisionSeal == null) {
            this.supervisionSeal = new ArrayList<>();
        }
        supervisionSealSetter.accept(this.supervisionSeal);
        return this;
    }

    /**
     * 发票监制章。 当“advanced_mode”设置为“true”时才返回。 
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

    

    public VatInvoiceResult withMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    


    /**
     * 机器编号。 当“advanced_mode”设置为“true”时才返回。 
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
     * 机打号码。 当“advanced_mode”设置为“true”时才返回 
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
     * 价税合计（大写）。 当“advanced_mode”设置为“true”时才返回。 
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
     * 备注。 当“advanced_mode”设置为“true”时才返回。 
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
     * 收款人。 当“advanced_mode”设置为“true”时才返回。 
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
     * 复核。 当“advanced_mode”设置为“true”时才返回。 
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
     * 开票人。 当“advanced_mode”设置为“true”时才返回。 
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
        if(this.sellerSeal == null) {
            this.sellerSeal = new ArrayList<>();
        }
        this.sellerSeal.add(sellerSealItem);
        return this;
    }

    public VatInvoiceResult withSellerSeal(Consumer<List<String>> sellerSealSetter) {
        if(this.sellerSeal == null) {
            this.sellerSeal = new ArrayList<>();
        }
        sellerSealSetter.accept(this.sellerSeal);
        return this;
    }

    /**
     * 销售方发票专用章。 当“advanced_mode”设置为“true”时才返回。 
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
        if(this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        this.itemList.add(itemListItem);
        return this;
    }

    public VatInvoiceResult withItemList(Consumer<List<ItemList>> itemListSetter) {
        if(this.itemList == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VatInvoiceResult vatInvoiceResult = (VatInvoiceResult) o;
        return Objects.equals(this.type, vatInvoiceResult.type) &&
            Objects.equals(this.serialNumber, vatInvoiceResult.serialNumber) &&
            Objects.equals(this.attribution, vatInvoiceResult.attribution) &&
            Objects.equals(this.supervisionSeal, vatInvoiceResult.supervisionSeal) &&
            Objects.equals(this.code, vatInvoiceResult.code) &&
            Objects.equals(this.machineNumber, vatInvoiceResult.machineNumber) &&
            Objects.equals(this.printNumber, vatInvoiceResult.printNumber) &&
            Objects.equals(this.checkCode, vatInvoiceResult.checkCode) &&
            Objects.equals(this.number, vatInvoiceResult.number) &&
            Objects.equals(this.issueDate, vatInvoiceResult.issueDate) &&
            Objects.equals(this.encryptionBlock, vatInvoiceResult.encryptionBlock) &&
            Objects.equals(this.buyerName, vatInvoiceResult.buyerName) &&
            Objects.equals(this.buyerId, vatInvoiceResult.buyerId) &&
            Objects.equals(this.buyerAddress, vatInvoiceResult.buyerAddress) &&
            Objects.equals(this.buyerBank, vatInvoiceResult.buyerBank) &&
            Objects.equals(this.sellerName, vatInvoiceResult.sellerName) &&
            Objects.equals(this.sellerId, vatInvoiceResult.sellerId) &&
            Objects.equals(this.sellerAddress, vatInvoiceResult.sellerAddress) &&
            Objects.equals(this.sellerBank, vatInvoiceResult.sellerBank) &&
            Objects.equals(this.subtotalAmount, vatInvoiceResult.subtotalAmount) &&
            Objects.equals(this.subtotalTax, vatInvoiceResult.subtotalTax) &&
            Objects.equals(this.total, vatInvoiceResult.total) &&
            Objects.equals(this.totalInWords, vatInvoiceResult.totalInWords) &&
            Objects.equals(this.remarks, vatInvoiceResult.remarks) &&
            Objects.equals(this.receiver, vatInvoiceResult.receiver) &&
            Objects.equals(this.reviewer, vatInvoiceResult.reviewer) &&
            Objects.equals(this.issuer, vatInvoiceResult.issuer) &&
            Objects.equals(this.sellerSeal, vatInvoiceResult.sellerSeal) &&
            Objects.equals(this.itemList, vatInvoiceResult.itemList) &&
            Objects.equals(this.confidence, vatInvoiceResult.confidence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, serialNumber, attribution, supervisionSeal, code, machineNumber, printNumber, checkCode, number, issueDate, encryptionBlock, buyerName, buyerId, buyerAddress, buyerBank, sellerName, sellerId, sellerAddress, sellerBank, subtotalAmount, subtotalTax, total, totalInWords, remarks, receiver, reviewer, issuer, sellerSeal, itemList, confidence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VatInvoiceResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
        sb.append("    supervisionSeal: ").append(toIndentedString(supervisionSeal)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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


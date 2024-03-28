package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MvsInvoiceResult
 */
public class MvsInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_printed_code")

    private String machinePrintedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_printed_number")

    private String machinePrintedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_number")

    private String machineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_name")

    private String buyerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_organization_number")

    private String buyerOrganizationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_id")

    private String buyerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_address")

    private String buyerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buyer_phone")

    private String buyerPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_name")

    private String sellerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_phone")

    private String sellerPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_id")

    private String sellerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_account")

    private String sellerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_address")

    private String sellerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "licence_plate_number")

    private String licencePlateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_number")

    private String registrationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dept_motor_vehicles")

    private String deptMotorVehicles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seller_bank")

    private String sellerBank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand_model")

    private String brandModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturing_location")

    private String manufacturingLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_certificate")

    private String qualityCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_certificate")

    private String importCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_number")

    private String inspectionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_number")

    private String engineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_identification_number")

    private String vehicleIdentificationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tonnage")

    private String tonnage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seating_capacity")

    private String seatingCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_authority")

    private String taxAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_authority_code")

    private String taxAuthorityCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_payment_receipt")

    private String taxPaymentReceipt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_rate")

    private String taxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax")

    private String tax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_exclusive_price")

    private String taxExclusivePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_chinese")

    private String totalChinese;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fiscal_code")

    private String fiscalCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auction_org_name")

    private String auctionOrgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auction_org_address")

    private String auctionOrgAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auction_org_id")

    private String auctionOrgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auction_org_bank_account")

    private String auctionOrgBankAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auction_org_phone")

    private String auctionOrgPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_vehicle_market_name")

    private String usedVehicleMarketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_vehicle_market_id")

    private String usedVehicleMarketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_vehicle_market_address")

    private String usedVehicleMarketAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_vehicle_market_bank_account")

    private String usedVehicleMarketBankAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_vehicle_market_phone")

    private String usedVehicleMarketPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_issue")

    private Boolean reverseIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drawer_name")

    private String drawerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public MvsInvoiceResult withCode(String code) {
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

    public MvsInvoiceResult withNumber(String number) {
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

    public MvsInvoiceResult withMachinePrintedCode(String machinePrintedCode) {
        this.machinePrintedCode = machinePrintedCode;
        return this;
    }

    /**
     * 机打代码。 
     * @return machinePrintedCode
     */
    public String getMachinePrintedCode() {
        return machinePrintedCode;
    }

    public void setMachinePrintedCode(String machinePrintedCode) {
        this.machinePrintedCode = machinePrintedCode;
    }

    public MvsInvoiceResult withMachinePrintedNumber(String machinePrintedNumber) {
        this.machinePrintedNumber = machinePrintedNumber;
        return this;
    }

    /**
     * 机打号码。 
     * @return machinePrintedNumber
     */
    public String getMachinePrintedNumber() {
        return machinePrintedNumber;
    }

    public void setMachinePrintedNumber(String machinePrintedNumber) {
        this.machinePrintedNumber = machinePrintedNumber;
    }

    public MvsInvoiceResult withIssueDate(String issueDate) {
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

    public MvsInvoiceResult withMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    /**
     * 机器编号。 
     * @return machineNumber
     */
    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public MvsInvoiceResult withBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    /**
     * 购买方名称、二手车买方单位/个人 
     * @return buyerName
     */
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public MvsInvoiceResult withBuyerOrganizationNumber(String buyerOrganizationNumber) {
        this.buyerOrganizationNumber = buyerOrganizationNumber;
        return this;
    }

    /**
     * 购买方身份证号码/组织机构代码。 
     * @return buyerOrganizationNumber
     */
    public String getBuyerOrganizationNumber() {
        return buyerOrganizationNumber;
    }

    public void setBuyerOrganizationNumber(String buyerOrganizationNumber) {
        this.buyerOrganizationNumber = buyerOrganizationNumber;
    }

    public MvsInvoiceResult withBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    /**
     * 购买方纳税人识别号、二手车买方单位代码/身份证号 
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public MvsInvoiceResult withBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
        return this;
    }

    /**
     * 二手车买方单位/个人住址。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return buyerAddress
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public MvsInvoiceResult withBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }

    /**
     * 二手车买方单位/个人电话。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return buyerPhone
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public MvsInvoiceResult withSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    /**
     * 销货单位名称、二手车卖方单位/个人 
     * @return sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public MvsInvoiceResult withSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
        return this;
    }

    /**
     * 销售方电话、二手车卖方电话 
     * @return sellerPhone
     */
    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public MvsInvoiceResult withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * 销售方纳税人识别号、二手车卖方单位代码/身份证号 
     * @return sellerId
     */
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public MvsInvoiceResult withSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
        return this;
    }

    /**
     * 销售方账号。 
     * @return sellerAccount
     */
    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public MvsInvoiceResult withSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    /**
     * 销售方地址、二手车卖方单位/个人地址 
     * @return sellerAddress
     */
    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public MvsInvoiceResult withLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
        return this;
    }

    /**
     * 二手车车牌照号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return licencePlateNumber
     */
    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public MvsInvoiceResult withRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    /**
     * 二手车登记证号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public MvsInvoiceResult withDeptMotorVehicles(String deptMotorVehicles) {
        this.deptMotorVehicles = deptMotorVehicles;
        return this;
    }

    /**
     * 二手车转入地车管所名称。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return deptMotorVehicles
     */
    public String getDeptMotorVehicles() {
        return deptMotorVehicles;
    }

    public void setDeptMotorVehicles(String deptMotorVehicles) {
        this.deptMotorVehicles = deptMotorVehicles;
    }

    public MvsInvoiceResult withSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
        return this;
    }

    /**
     * 销售方开户行。 
     * @return sellerBank
     */
    public String getSellerBank() {
        return sellerBank;
    }

    public void setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
    }

    public MvsInvoiceResult withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    /**
     * 车辆类型。 
     * @return vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public MvsInvoiceResult withBrandModel(String brandModel) {
        this.brandModel = brandModel;
        return this;
    }

    /**
     * 厂牌型号。 
     * @return brandModel
     */
    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public MvsInvoiceResult withManufacturingLocation(String manufacturingLocation) {
        this.manufacturingLocation = manufacturingLocation;
        return this;
    }

    /**
     * 产地。 
     * @return manufacturingLocation
     */
    public String getManufacturingLocation() {
        return manufacturingLocation;
    }

    public void setManufacturingLocation(String manufacturingLocation) {
        this.manufacturingLocation = manufacturingLocation;
    }

    public MvsInvoiceResult withQualityCertificate(String qualityCertificate) {
        this.qualityCertificate = qualityCertificate;
        return this;
    }

    /**
     * 合格证号。 
     * @return qualityCertificate
     */
    public String getQualityCertificate() {
        return qualityCertificate;
    }

    public void setQualityCertificate(String qualityCertificate) {
        this.qualityCertificate = qualityCertificate;
    }

    public MvsInvoiceResult withImportCertificate(String importCertificate) {
        this.importCertificate = importCertificate;
        return this;
    }

    /**
     * 进口证明书号。 
     * @return importCertificate
     */
    public String getImportCertificate() {
        return importCertificate;
    }

    public void setImportCertificate(String importCertificate) {
        this.importCertificate = importCertificate;
    }

    public MvsInvoiceResult withInspectionNumber(String inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
        return this;
    }

    /**
     * 商检单号。 
     * @return inspectionNumber
     */
    public String getInspectionNumber() {
        return inspectionNumber;
    }

    public void setInspectionNumber(String inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
    }

    public MvsInvoiceResult withEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }

    /**
     * 发动机号码。 
     * @return engineNumber
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public MvsInvoiceResult withVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        return this;
    }

    /**
     * 车辆识别代号/车架号码。 
     * @return vehicleIdentificationNumber
     */
    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public MvsInvoiceResult withTonnage(String tonnage) {
        this.tonnage = tonnage;
        return this;
    }

    /**
     * 吨位。 
     * @return tonnage
     */
    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    public MvsInvoiceResult withSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    /**
     * 限乘人数。 
     * @return seatingCapacity
     */
    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public MvsInvoiceResult withTaxAuthority(String taxAuthority) {
        this.taxAuthority = taxAuthority;
        return this;
    }

    /**
     * 主管税务机关。 
     * @return taxAuthority
     */
    public String getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(String taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public MvsInvoiceResult withTaxAuthorityCode(String taxAuthorityCode) {
        this.taxAuthorityCode = taxAuthorityCode;
        return this;
    }

    /**
     * 主管税务机关代码。 
     * @return taxAuthorityCode
     */
    public String getTaxAuthorityCode() {
        return taxAuthorityCode;
    }

    public void setTaxAuthorityCode(String taxAuthorityCode) {
        this.taxAuthorityCode = taxAuthorityCode;
    }

    public MvsInvoiceResult withTaxPaymentReceipt(String taxPaymentReceipt) {
        this.taxPaymentReceipt = taxPaymentReceipt;
        return this;
    }

    /**
     * 完税凭证号码。 
     * @return taxPaymentReceipt
     */
    public String getTaxPaymentReceipt() {
        return taxPaymentReceipt;
    }

    public void setTaxPaymentReceipt(String taxPaymentReceipt) {
        this.taxPaymentReceipt = taxPaymentReceipt;
    }

    public MvsInvoiceResult withTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * 增值税税率或征收率。 
     * @return taxRate
     */
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public MvsInvoiceResult withTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * 增值税税额。 
     * @return tax
     */
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public MvsInvoiceResult withTaxExclusivePrice(String taxExclusivePrice) {
        this.taxExclusivePrice = taxExclusivePrice;
        return this;
    }

    /**
     * 不含税价。 
     * @return taxExclusivePrice
     */
    public String getTaxExclusivePrice() {
        return taxExclusivePrice;
    }

    public void setTaxExclusivePrice(String taxExclusivePrice) {
        this.taxExclusivePrice = taxExclusivePrice;
    }

    public MvsInvoiceResult withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 价税合计、二手车车价合计（小写） 
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public MvsInvoiceResult withTotalChinese(String totalChinese) {
        this.totalChinese = totalChinese;
        return this;
    }

    /**
     * 价税合计大写、二手车车价合计（大写） 
     * @return totalChinese
     */
    public String getTotalChinese() {
        return totalChinese;
    }

    public void setTotalChinese(String totalChinese) {
        this.totalChinese = totalChinese;
    }

    public MvsInvoiceResult withFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
        return this;
    }

    /**
     * 税控码。 
     * @return fiscalCode
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public MvsInvoiceResult withAuctionOrgName(String auctionOrgName) {
        this.auctionOrgName = auctionOrgName;
        return this;
    }

    /**
     * 二手车经营拍卖单位名称。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return auctionOrgName
     */
    public String getAuctionOrgName() {
        return auctionOrgName;
    }

    public void setAuctionOrgName(String auctionOrgName) {
        this.auctionOrgName = auctionOrgName;
    }

    public MvsInvoiceResult withAuctionOrgAddress(String auctionOrgAddress) {
        this.auctionOrgAddress = auctionOrgAddress;
        return this;
    }

    /**
     * 二手车经营拍卖单位地址。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return auctionOrgAddress
     */
    public String getAuctionOrgAddress() {
        return auctionOrgAddress;
    }

    public void setAuctionOrgAddress(String auctionOrgAddress) {
        this.auctionOrgAddress = auctionOrgAddress;
    }

    public MvsInvoiceResult withAuctionOrgId(String auctionOrgId) {
        this.auctionOrgId = auctionOrgId;
        return this;
    }

    /**
     * 二手车经营拍卖单位纳税人识别号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return auctionOrgId
     */
    public String getAuctionOrgId() {
        return auctionOrgId;
    }

    public void setAuctionOrgId(String auctionOrgId) {
        this.auctionOrgId = auctionOrgId;
    }

    public MvsInvoiceResult withAuctionOrgBankAccount(String auctionOrgBankAccount) {
        this.auctionOrgBankAccount = auctionOrgBankAccount;
        return this;
    }

    /**
     * 二手车经营拍卖单位银行和账号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return auctionOrgBankAccount
     */
    public String getAuctionOrgBankAccount() {
        return auctionOrgBankAccount;
    }

    public void setAuctionOrgBankAccount(String auctionOrgBankAccount) {
        this.auctionOrgBankAccount = auctionOrgBankAccount;
    }

    public MvsInvoiceResult withAuctionOrgPhone(String auctionOrgPhone) {
        this.auctionOrgPhone = auctionOrgPhone;
        return this;
    }

    /**
     * 二手车经营拍卖单位电话。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return auctionOrgPhone
     */
    public String getAuctionOrgPhone() {
        return auctionOrgPhone;
    }

    public void setAuctionOrgPhone(String auctionOrgPhone) {
        this.auctionOrgPhone = auctionOrgPhone;
    }

    public MvsInvoiceResult withUsedVehicleMarketName(String usedVehicleMarketName) {
        this.usedVehicleMarketName = usedVehicleMarketName;
        return this;
    }

    /**
     * 二手车市场名称。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return usedVehicleMarketName
     */
    public String getUsedVehicleMarketName() {
        return usedVehicleMarketName;
    }

    public void setUsedVehicleMarketName(String usedVehicleMarketName) {
        this.usedVehicleMarketName = usedVehicleMarketName;
    }

    public MvsInvoiceResult withUsedVehicleMarketId(String usedVehicleMarketId) {
        this.usedVehicleMarketId = usedVehicleMarketId;
        return this;
    }

    /**
     * 二手车市场纳税人识别号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return usedVehicleMarketId
     */
    public String getUsedVehicleMarketId() {
        return usedVehicleMarketId;
    }

    public void setUsedVehicleMarketId(String usedVehicleMarketId) {
        this.usedVehicleMarketId = usedVehicleMarketId;
    }

    public MvsInvoiceResult withUsedVehicleMarketAddress(String usedVehicleMarketAddress) {
        this.usedVehicleMarketAddress = usedVehicleMarketAddress;
        return this;
    }

    /**
     * 二手车市场地址。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return usedVehicleMarketAddress
     */
    public String getUsedVehicleMarketAddress() {
        return usedVehicleMarketAddress;
    }

    public void setUsedVehicleMarketAddress(String usedVehicleMarketAddress) {
        this.usedVehicleMarketAddress = usedVehicleMarketAddress;
    }

    public MvsInvoiceResult withUsedVehicleMarketBankAccount(String usedVehicleMarketBankAccount) {
        this.usedVehicleMarketBankAccount = usedVehicleMarketBankAccount;
        return this;
    }

    /**
     * 二手车市场银行和账号。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return usedVehicleMarketBankAccount
     */
    public String getUsedVehicleMarketBankAccount() {
        return usedVehicleMarketBankAccount;
    }

    public void setUsedVehicleMarketBankAccount(String usedVehicleMarketBankAccount) {
        this.usedVehicleMarketBankAccount = usedVehicleMarketBankAccount;
    }

    public MvsInvoiceResult withUsedVehicleMarketPhone(String usedVehicleMarketPhone) {
        this.usedVehicleMarketPhone = usedVehicleMarketPhone;
        return this;
    }

    /**
     * 二手车市场电话。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return usedVehicleMarketPhone
     */
    public String getUsedVehicleMarketPhone() {
        return usedVehicleMarketPhone;
    }

    public void setUsedVehicleMarketPhone(String usedVehicleMarketPhone) {
        this.usedVehicleMarketPhone = usedVehicleMarketPhone;
    }

    public MvsInvoiceResult withReverseIssue(Boolean reverseIssue) {
        this.reverseIssue = reverseIssue;
        return this;
    }

    /**
     * 二手车反向开具标识，True表示是反向开具发票，False表示不是反向开具发票。 当请求参数\"type\"设置为\"auto\"或\"used\"时才返回。 
     * @return reverseIssue
     */
    public Boolean getReverseIssue() {
        return reverseIssue;
    }

    public void setReverseIssue(Boolean reverseIssue) {
        this.reverseIssue = reverseIssue;
    }

    public MvsInvoiceResult withRemark(String remark) {
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

    public MvsInvoiceResult withDrawerName(String drawerName) {
        this.drawerName = drawerName;
        return this;
    }

    /**
     * 开票人 
     * @return drawerName
     */
    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }

    public MvsInvoiceResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 枚举值，机动车销售统一发票或者二手车销售统一发票。 当入参中包含type时返回。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MvsInvoiceResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 检测框对象，内部为字段-框坐标对。如 code:[[x0, y0],[x1,y1],[x2,y2],[x3,y3]], 点的顺序是左上角、右上角、右下角、左下角。如果原图找不到字段，返回空列表。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    public MvsInvoiceResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 字段文字内容置信度，内容为字段-字符置信度对,如code:0.9999。这个数值为字段中每个字符置信度，格式为fp32，保留四位。若字段不存在则返回0.0。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MvsInvoiceResult that = (MvsInvoiceResult) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.number, that.number)
            && Objects.equals(this.machinePrintedCode, that.machinePrintedCode)
            && Objects.equals(this.machinePrintedNumber, that.machinePrintedNumber)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.machineNumber, that.machineNumber)
            && Objects.equals(this.buyerName, that.buyerName)
            && Objects.equals(this.buyerOrganizationNumber, that.buyerOrganizationNumber)
            && Objects.equals(this.buyerId, that.buyerId) && Objects.equals(this.buyerAddress, that.buyerAddress)
            && Objects.equals(this.buyerPhone, that.buyerPhone) && Objects.equals(this.sellerName, that.sellerName)
            && Objects.equals(this.sellerPhone, that.sellerPhone) && Objects.equals(this.sellerId, that.sellerId)
            && Objects.equals(this.sellerAccount, that.sellerAccount)
            && Objects.equals(this.sellerAddress, that.sellerAddress)
            && Objects.equals(this.licencePlateNumber, that.licencePlateNumber)
            && Objects.equals(this.registrationNumber, that.registrationNumber)
            && Objects.equals(this.deptMotorVehicles, that.deptMotorVehicles)
            && Objects.equals(this.sellerBank, that.sellerBank) && Objects.equals(this.vehicleType, that.vehicleType)
            && Objects.equals(this.brandModel, that.brandModel)
            && Objects.equals(this.manufacturingLocation, that.manufacturingLocation)
            && Objects.equals(this.qualityCertificate, that.qualityCertificate)
            && Objects.equals(this.importCertificate, that.importCertificate)
            && Objects.equals(this.inspectionNumber, that.inspectionNumber)
            && Objects.equals(this.engineNumber, that.engineNumber)
            && Objects.equals(this.vehicleIdentificationNumber, that.vehicleIdentificationNumber)
            && Objects.equals(this.tonnage, that.tonnage) && Objects.equals(this.seatingCapacity, that.seatingCapacity)
            && Objects.equals(this.taxAuthority, that.taxAuthority)
            && Objects.equals(this.taxAuthorityCode, that.taxAuthorityCode)
            && Objects.equals(this.taxPaymentReceipt, that.taxPaymentReceipt)
            && Objects.equals(this.taxRate, that.taxRate) && Objects.equals(this.tax, that.tax)
            && Objects.equals(this.taxExclusivePrice, that.taxExclusivePrice) && Objects.equals(this.total, that.total)
            && Objects.equals(this.totalChinese, that.totalChinese) && Objects.equals(this.fiscalCode, that.fiscalCode)
            && Objects.equals(this.auctionOrgName, that.auctionOrgName)
            && Objects.equals(this.auctionOrgAddress, that.auctionOrgAddress)
            && Objects.equals(this.auctionOrgId, that.auctionOrgId)
            && Objects.equals(this.auctionOrgBankAccount, that.auctionOrgBankAccount)
            && Objects.equals(this.auctionOrgPhone, that.auctionOrgPhone)
            && Objects.equals(this.usedVehicleMarketName, that.usedVehicleMarketName)
            && Objects.equals(this.usedVehicleMarketId, that.usedVehicleMarketId)
            && Objects.equals(this.usedVehicleMarketAddress, that.usedVehicleMarketAddress)
            && Objects.equals(this.usedVehicleMarketBankAccount, that.usedVehicleMarketBankAccount)
            && Objects.equals(this.usedVehicleMarketPhone, that.usedVehicleMarketPhone)
            && Objects.equals(this.reverseIssue, that.reverseIssue) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.drawerName, that.drawerName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.textLocation, that.textLocation) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            number,
            machinePrintedCode,
            machinePrintedNumber,
            issueDate,
            machineNumber,
            buyerName,
            buyerOrganizationNumber,
            buyerId,
            buyerAddress,
            buyerPhone,
            sellerName,
            sellerPhone,
            sellerId,
            sellerAccount,
            sellerAddress,
            licencePlateNumber,
            registrationNumber,
            deptMotorVehicles,
            sellerBank,
            vehicleType,
            brandModel,
            manufacturingLocation,
            qualityCertificate,
            importCertificate,
            inspectionNumber,
            engineNumber,
            vehicleIdentificationNumber,
            tonnage,
            seatingCapacity,
            taxAuthority,
            taxAuthorityCode,
            taxPaymentReceipt,
            taxRate,
            tax,
            taxExclusivePrice,
            total,
            totalChinese,
            fiscalCode,
            auctionOrgName,
            auctionOrgAddress,
            auctionOrgId,
            auctionOrgBankAccount,
            auctionOrgPhone,
            usedVehicleMarketName,
            usedVehicleMarketId,
            usedVehicleMarketAddress,
            usedVehicleMarketBankAccount,
            usedVehicleMarketPhone,
            reverseIssue,
            remark,
            drawerName,
            type,
            textLocation,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MvsInvoiceResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    machinePrintedCode: ").append(toIndentedString(machinePrintedCode)).append("\n");
        sb.append("    machinePrintedNumber: ").append(toIndentedString(machinePrintedNumber)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    machineNumber: ").append(toIndentedString(machineNumber)).append("\n");
        sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
        sb.append("    buyerOrganizationNumber: ").append(toIndentedString(buyerOrganizationNumber)).append("\n");
        sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
        sb.append("    buyerAddress: ").append(toIndentedString(buyerAddress)).append("\n");
        sb.append("    buyerPhone: ").append(toIndentedString(buyerPhone)).append("\n");
        sb.append("    sellerName: ").append(toIndentedString(sellerName)).append("\n");
        sb.append("    sellerPhone: ").append(toIndentedString(sellerPhone)).append("\n");
        sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
        sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
        sb.append("    sellerAddress: ").append(toIndentedString(sellerAddress)).append("\n");
        sb.append("    licencePlateNumber: ").append(toIndentedString(licencePlateNumber)).append("\n");
        sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
        sb.append("    deptMotorVehicles: ").append(toIndentedString(deptMotorVehicles)).append("\n");
        sb.append("    sellerBank: ").append(toIndentedString(sellerBank)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    brandModel: ").append(toIndentedString(brandModel)).append("\n");
        sb.append("    manufacturingLocation: ").append(toIndentedString(manufacturingLocation)).append("\n");
        sb.append("    qualityCertificate: ").append(toIndentedString(qualityCertificate)).append("\n");
        sb.append("    importCertificate: ").append(toIndentedString(importCertificate)).append("\n");
        sb.append("    inspectionNumber: ").append(toIndentedString(inspectionNumber)).append("\n");
        sb.append("    engineNumber: ").append(toIndentedString(engineNumber)).append("\n");
        sb.append("    vehicleIdentificationNumber: ")
            .append(toIndentedString(vehicleIdentificationNumber))
            .append("\n");
        sb.append("    tonnage: ").append(toIndentedString(tonnage)).append("\n");
        sb.append("    seatingCapacity: ").append(toIndentedString(seatingCapacity)).append("\n");
        sb.append("    taxAuthority: ").append(toIndentedString(taxAuthority)).append("\n");
        sb.append("    taxAuthorityCode: ").append(toIndentedString(taxAuthorityCode)).append("\n");
        sb.append("    taxPaymentReceipt: ").append(toIndentedString(taxPaymentReceipt)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxExclusivePrice: ").append(toIndentedString(taxExclusivePrice)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalChinese: ").append(toIndentedString(totalChinese)).append("\n");
        sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
        sb.append("    auctionOrgName: ").append(toIndentedString(auctionOrgName)).append("\n");
        sb.append("    auctionOrgAddress: ").append(toIndentedString(auctionOrgAddress)).append("\n");
        sb.append("    auctionOrgId: ").append(toIndentedString(auctionOrgId)).append("\n");
        sb.append("    auctionOrgBankAccount: ").append(toIndentedString(auctionOrgBankAccount)).append("\n");
        sb.append("    auctionOrgPhone: ").append(toIndentedString(auctionOrgPhone)).append("\n");
        sb.append("    usedVehicleMarketName: ").append(toIndentedString(usedVehicleMarketName)).append("\n");
        sb.append("    usedVehicleMarketId: ").append(toIndentedString(usedVehicleMarketId)).append("\n");
        sb.append("    usedVehicleMarketAddress: ").append(toIndentedString(usedVehicleMarketAddress)).append("\n");
        sb.append("    usedVehicleMarketBankAccount: ")
            .append(toIndentedString(usedVehicleMarketBankAccount))
            .append("\n");
        sb.append("    usedVehicleMarketPhone: ").append(toIndentedString(usedVehicleMarketPhone)).append("\n");
        sb.append("    reverseIssue: ").append(toIndentedString(reverseIssue)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    drawerName: ").append(toIndentedString(drawerName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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

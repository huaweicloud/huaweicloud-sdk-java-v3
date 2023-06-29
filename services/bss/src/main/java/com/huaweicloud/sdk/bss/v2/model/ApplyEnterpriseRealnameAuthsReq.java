package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplyEnterpriseRealnameAuthsReq
 */
public class ApplyEnterpriseRealnameAuthsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identify_type")

    private Integer identifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_file_url")

    private List<String> verifiedFileUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corp_name")

    private String corpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_number")

    private String verifiedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_country")

    private String regCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_address")

    private String regAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_type")

    private String xaccountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_person")

    private EnterprisePersonNew enterprisePerson;

    public ApplyEnterpriseRealnameAuthsReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ApplyEnterpriseRealnameAuthsReq withIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
        return this;
    }

    /**
     * 认证方案。 1：单位证件认证
     * minimum: 0
     * maximum: 32
     * @return identifyType
     */
    public Integer getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
    }

    public ApplyEnterpriseRealnameAuthsReq withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 单位证件类型： 0：企业营业执照1：事业单位法人证书2：社会团体法人登记证书3：行政执法主体资格证4：组织机构代码证99：其他
     * minimum: 0
     * maximum: 99
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
        return this;
    }

    public ApplyEnterpriseRealnameAuthsReq addVerifiedFileUrlItem(String verifiedFileUrlItem) {
        if (this.verifiedFileUrl == null) {
            this.verifiedFileUrl = new ArrayList<>();
        }
        this.verifiedFileUrl.add(verifiedFileUrlItem);
        return this;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedFileUrl(Consumer<List<String>> verifiedFileUrlSetter) {
        if (this.verifiedFileUrl == null) {
            this.verifiedFileUrl = new ArrayList<>();
        }
        verifiedFileUrlSetter.accept(this.verifiedFileUrl);
        return this;
    }

    /**
     * 单位证件认证时证件附件的文件URL。附件地址必须按照顺序填写，先填写单位证件的附件，如果请求中填写了单位人员信息，再填写单位人员的身份证附件。 单位证件顺序为： 第1张单位证件照附件， 单位人员的证件顺序为： 第1张个人身份证的人像面 第2张个人身份证的国徽面 以营业执照举例，假设存在法人的情况下，第1张上传的是营业执照扫描件abc.023，第2张是法人的身份证人像面照片def004，第3张是法人的国徽面照片gh007，那么上传顺序需要是： abc023 def004 gh007 文件名称区分大小写。 证件附件目前仅仅支持jpg、jpeg、bmp、png、gif、pdf格式，单个文件最大不超过10M。这个URL是相对URL，不需要包含桶名和download目录，只要包含download目录下的子目录和对应文件名称即可。举例如下：如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/abc023.jpg，该字段填写abc023.jpg； 如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/test/abc023.jpg，该字段填写test/abc023.jpg。
     * @return verifiedFileUrl
     */
    public List<String> getVerifiedFileUrl() {
        return verifiedFileUrl;
    }

    public void setVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
    }

    public ApplyEnterpriseRealnameAuthsReq withCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }

    /**
     * 单位名称。 不能全是数字、特殊字符、空格。
     * @return corpName
     */
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public ApplyEnterpriseRealnameAuthsReq withVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
        return this;
    }

    /**
     * 单位证件号码。
     * @return verifiedNumber
     */
    public String getVerifiedNumber() {
        return verifiedNumber;
    }

    public void setVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
    }

    public ApplyEnterpriseRealnameAuthsReq withRegCountry(String regCountry) {
        this.regCountry = regCountry;
        return this;
    }

    /**
     * 实名认证填写的注册国家。国家的两位字母简码。 例如：注册国家为“中国”请填写“CN”。
     * @return regCountry
     */
    public String getRegCountry() {
        return regCountry;
    }

    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    public ApplyEnterpriseRealnameAuthsReq withRegAddress(String regAddress) {
        this.regAddress = regAddress;
        return this;
    }

    /**
     * 实名认证企业注册地址。
     * @return regAddress
     */
    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public ApplyEnterpriseRealnameAuthsReq withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    /**
     * 华为分给合作伙伴的平台标识。 该标识的具体值由华为分配。获取方法请参见如何获取xaccountType的取值。
     * @return xaccountType
     */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }

    public ApplyEnterpriseRealnameAuthsReq withEnterprisePerson(EnterprisePersonNew enterprisePerson) {
        this.enterprisePerson = enterprisePerson;
        return this;
    }

    public ApplyEnterpriseRealnameAuthsReq withEnterprisePerson(Consumer<EnterprisePersonNew> enterprisePersonSetter) {
        if (this.enterprisePerson == null) {
            this.enterprisePerson = new EnterprisePersonNew();
            enterprisePersonSetter.accept(this.enterprisePerson);
        }

        return this;
    }

    /**
     * Get enterprisePerson
     * @return enterprisePerson
     */
    public EnterprisePersonNew getEnterprisePerson() {
        return enterprisePerson;
    }

    public void setEnterprisePerson(EnterprisePersonNew enterprisePerson) {
        this.enterprisePerson = enterprisePerson;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyEnterpriseRealnameAuthsReq that = (ApplyEnterpriseRealnameAuthsReq) obj;
        return Objects.equals(this.customerId, that.customerId) && Objects.equals(this.identifyType, that.identifyType)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.verifiedFileUrl, that.verifiedFileUrl)
            && Objects.equals(this.corpName, that.corpName) && Objects.equals(this.verifiedNumber, that.verifiedNumber)
            && Objects.equals(this.regCountry, that.regCountry) && Objects.equals(this.regAddress, that.regAddress)
            && Objects.equals(this.xaccountType, that.xaccountType)
            && Objects.equals(this.enterprisePerson, that.enterprisePerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            identifyType,
            certificateType,
            verifiedFileUrl,
            corpName,
            verifiedNumber,
            regCountry,
            regAddress,
            xaccountType,
            enterprisePerson);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyEnterpriseRealnameAuthsReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    identifyType: ").append(toIndentedString(identifyType)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    verifiedFileUrl: ").append(toIndentedString(verifiedFileUrl)).append("\n");
        sb.append("    corpName: ").append(toIndentedString(corpName)).append("\n");
        sb.append("    verifiedNumber: ").append(toIndentedString(verifiedNumber)).append("\n");
        sb.append("    regCountry: ").append(toIndentedString(regCountry)).append("\n");
        sb.append("    regAddress: ").append(toIndentedString(regAddress)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    enterprisePerson: ").append(toIndentedString(enterprisePerson)).append("\n");
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

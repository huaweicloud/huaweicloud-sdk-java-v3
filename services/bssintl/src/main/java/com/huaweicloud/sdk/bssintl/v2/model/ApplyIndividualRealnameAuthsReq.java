package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplyIndividualRealnameAuthsReq
 */
public class ApplyIndividualRealnameAuthsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identify_type")

    private Integer identifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_type")

    private Integer verifiedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_file_url")

    private List<String> verifiedFileUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_number")

    private String verifiedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private Integer changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_type")

    private String xaccountType;

    public ApplyIndividualRealnameAuthsReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用查询客户列表接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ApplyIndividualRealnameAuthsReq withIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
        return this;
    }

    /**
     * 认证方案： 0：个人证件认证
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

    public ApplyIndividualRealnameAuthsReq withVerifiedType(Integer verifiedType) {
        this.verifiedType = verifiedType;
        return this;
    }

    /**
     * |参数名称：证件类型：0：身份证，上传的附件为3张，第1张是身份证人像面，第2张是身份证国徽面，第3张是个人手持身份证人像面；3：护照，上传的附件为3张，第1张是护照个人资料页，第2张是，护照入境盖章页，第3张是手持护照个人资料页；3：护照，上传的附件为2张，第1张是护照个人资料页，第2张是手持护照个人资料页；5：港澳通行证，上传的附件为3张，第1张是港澳居民来往内地通行证正面（人像面），第2张是港澳居民来往内地通行证反面，第3张是手持港澳居民来往内地通行证人像面；6：台湾通行证，上传的附件为3张，第1张是台湾居民来往大陆通行证正面（人像面），第2张是台湾居民来往大陆通行证反面，第3张是手持台湾居民来往大陆通行证人像面；9：港澳居民居住证，上传的附件为3张，第1张是港澳居民居住证人像面，第2张是，港澳居民居住证国徽面，第3张是手持港澳居民居住证人像面照片；10：台湾居民居住证，上传的附件为3张，第1张是台湾居民居住证人像面，第2张是台湾居民居住证国徽面，第3张是手持台湾居民居住证人像面照片。当identifyType=0的时候，该字段需要填写，否则忽略该字段的取值。| |参数的约束及描述：证件类型：0：身份证，上传的附件为3张，第1张是身份证人像面，第2张是身份证国徽面，第3张是个人手持身份证人像面；3：护照，上传的附件为3张，第1张是护照个人资料页，第2张是，护照入境盖章页，第3张是手持护照个人资料页；3：护照，上传的附件为2张，第1张是护照个人资料页，第2张是手持护照个人资料页；5：港澳通行证，上传的附件为3张，第1张是港澳居民来往内地通行证正面（人像面），第2张是港澳居民来往内地通行证反面，第3张是手持港澳居民来往内地通行证人像面；6：台湾通行证，上传的附件为3张，第1张是台湾居民来往大陆通行证正面（人像面），第2张是台湾居民来往大陆通行证反面，第3张是手持台湾居民来往大陆通行证人像面；7：海外驾照，上传的附件为2张，第1张是中国以外驾照正面照片（人像面），第2张是手持中国以外驾照人像面照片；9：港澳居民居住证，上传的附件为3张，第1张是港澳居民居住证人像面，第2张是，港澳居民居住证国徽面，第3张是手持港澳居民居住证人像面照片；10：台湾居民居住证，上传的附件为3张，第1张是台湾居民居住证人像面，第2张是台湾居民居住证国徽面，第3张是手持台湾居民居住证人像面照片。当identifyType=0的时候，该字段需要填写，否则忽略该字段的取值。|
     * minimum: 0
     * maximum: 32
     * @return verifiedType
     */
    public Integer getVerifiedType() {
        return verifiedType;
    }

    public void setVerifiedType(Integer verifiedType) {
        this.verifiedType = verifiedType;
    }

    public ApplyIndividualRealnameAuthsReq withVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
        return this;
    }

    public ApplyIndividualRealnameAuthsReq addVerifiedFileUrlItem(String verifiedFileUrlItem) {
        if (this.verifiedFileUrl == null) {
            this.verifiedFileUrl = new ArrayList<>();
        }
        this.verifiedFileUrl.add(verifiedFileUrlItem);
        return this;
    }

    public ApplyIndividualRealnameAuthsReq withVerifiedFileUrl(Consumer<List<String>> verifiedFileUrlSetter) {
        if (this.verifiedFileUrl == null) {
            this.verifiedFileUrl = new ArrayList<>();
        }
        verifiedFileUrlSetter.accept(this.verifiedFileUrl);
        return this;
    }

    /**
     * 个人证件认证时证件附件的文件URL，该URL地址必须按照顺序填写。以护照举例，譬如护照个人资料页文件名称是abc023，手持护照个人资料页是def004，那么这个地方需要按照 abc023 def004 的顺序填写URL（文件名称区分大小写）。 证件附件目前仅仅支持jpg、jpeg、bmp、png、gif、pdf格式，单个文件最大不超过10M。这个URL是相对URL，不需要包含桶名和download目录，只要包含download目录下的子目录和对应文件名称即可。举例如下：如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/abc023.jpg，该字段填写abc023.jpg； 如果上传的证件附件在桶中的位置是：https://bucketname.obs.Endpoint.myhuaweicloud.com/download/test/abc023.jpg，该字段填写test/abc023.jpg。
     * @return verifiedFileUrl
     */
    public List<String> getVerifiedFileUrl() {
        return verifiedFileUrl;
    }

    public void setVerifiedFileUrl(List<String> verifiedFileUrl) {
        this.verifiedFileUrl = verifiedFileUrl;
    }

    public ApplyIndividualRealnameAuthsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplyIndividualRealnameAuthsReq withVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
        return this;
    }

    /**
     * 证件号码。
     * @return verifiedNumber
     */
    public String getVerifiedNumber() {
        return verifiedNumber;
    }

    public void setVerifiedNumber(String verifiedNumber) {
        this.verifiedNumber = verifiedNumber;
    }

    public ApplyIndividualRealnameAuthsReq withChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型： -1：首次实名认证
     * minimum: -1
     * maximum: -1
     * @return changeType
     */
    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public ApplyIndividualRealnameAuthsReq withXaccountType(String xaccountType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyIndividualRealnameAuthsReq that = (ApplyIndividualRealnameAuthsReq) obj;
        return Objects.equals(this.customerId, that.customerId) && Objects.equals(this.identifyType, that.identifyType)
            && Objects.equals(this.verifiedType, that.verifiedType)
            && Objects.equals(this.verifiedFileUrl, that.verifiedFileUrl) && Objects.equals(this.name, that.name)
            && Objects.equals(this.verifiedNumber, that.verifiedNumber)
            && Objects.equals(this.changeType, that.changeType) && Objects.equals(this.xaccountType, that.xaccountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            identifyType,
            verifiedType,
            verifiedFileUrl,
            name,
            verifiedNumber,
            changeType,
            xaccountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyIndividualRealnameAuthsReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    identifyType: ").append(toIndentedString(identifyType)).append("\n");
        sb.append("    verifiedType: ").append(toIndentedString(verifiedType)).append("\n");
        sb.append("    verifiedFileUrl: ").append(toIndentedString(verifiedFileUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    verifiedNumber: ").append(toIndentedString(verifiedNumber)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
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

package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建个人模板请求体。
 */
public class CreateAimPersonalTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_id")

    private String cardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_id")

    private Integer useId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private Integer subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_example")

    private String smsExample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_signs")

    private List<String> smsSigns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_template")

    private String smsTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private List<AimPersonalTemplatePage> pages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<AimPersonalTemplateParam> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factorys")

    private List<AimPersonalTemplateFactory> factorys = null;

    public CreateAimPersonalTemplateRequestBody withCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }

    /**
     * 布局类型。 - MultipleImageAndText：多图文类 - StandardImageAndText：图文类 - PureText：长文本类 - VideoImageAndText：视频图文类 - Video：视频类 - ECImageAndText：电商类 - RedPacket：红包类 - RedPacketPersonal：个性化红包类 - ImageTextAndVideo：图文视频类 - Notification1：一般通知类 - Notification2：增强通知类 - Carousel：横滑类1 - CarouselTitle：横滑类2 - CarouselSquareImage：图片轮播类（1:1） - CarouselImageSixteenToNine：图片轮播类（16:9） - CarouselVerticalImage：图片轮播类（48:65） - CardVoucher：单卡券 - CardVouchers：多卡券（最多支持四张卡券） - Ecommerce：电商多商品类 - Trip1：机票类 - Trip2：火车票类 - Trip3：汽车票类 - PlaneTrip：增强机票类 - SimplePoster：海报类 - NativePureText：超文本普通类 - NativeImageAndText：超文本增强类 - ShortVideo：短剧视频类 - ShortVideoImage：短剧图片类 - EcommerceCouponVertical：电商领券类竖版  > 当送审厂商包含vivo时，各布局类型上传的图片最小像素要求如下： > - card_id为StandardImageAndText，宽高比为16:9时，图片的最小像素为1088px*612px。 > - card_id为MultipleImageAndText，宽高比为16:9时，图片的最小像素为1088px*612px。 > - card_id为MultipleImageAndText，宽高比为1:1时，图片的最小像素为320px*320px。 > - card_id为Video，宽高比为16:9时，视频封面图片的最小像素为1088px*612px。 > - card_id为RedPacket，宽高比为1:1时，图片的最小像素为320px*320px。 > - card_id为CarouselImageSixteenToNine，宽高比为16:9时，图片的最小像素为1088px*612px。 > - card_id为CarouselSquareImage，宽高比为1:1时，图片的最小像素为1088px*1088px。 > - card_id为CarouselVerticalImage，宽高比为48:65时，图片的最小像素为960px*1300px。 > - card_id为Notification1，宽高比为3:1时，图片的最小像素为576px*192px。 > - card_id为Notification2，宽高比为3:1时，图片的最小像素为576px*192px。 > - card_id为ECImageAndText，宽高比为1:1时，图片的最小像素为1088px*1088px。 
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public CreateAimPersonalTemplateRequestBody withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public CreateAimPersonalTemplateRequestBody withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 模板使用场景类型。
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public CreateAimPersonalTemplateRequestBody withUseId(Integer useId) {
        this.useId = useId;
        return this;
    }

    /**
     * 模板用途。  - 1：表示商用 - 2：表示试商用   > - 模板用途为1，即“商用”时，所有字段中不允许有测试字样，否则影响送审 > - 模板用途为2，即“试商用”时，请在模板名称（tpl_name）、模板主标题中增加测试字样 
     * @return useId
     */
    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public CreateAimPersonalTemplateRequestBody withSubType(Integer subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 版式子类型。 > - 当card_id为RedPacket和RedPacketPersonal时，sub_type用于设置按钮样式，1表示静态按钮，2表示动态按钮。目前仅华为厂商支持动态按钮。 > - 当card_id为ECImageAndText时，sub_type用于设置左右按钮组合颜色，默认值为1，1表示左边按钮为橙色，右边按钮为红色；2表示左边按钮为绿色，右边按钮为黄色；3表示左边按钮为绿色，右边按钮为蓝色；4表示左边按钮为紫色，右边按钮为蓝色；5表示左边按钮为黑色，右边按钮为玫粉色。仅华为厂商支持sub_type取值为2、3、4、5。 > - 当card_id为CarouselVerticalImage时，sub_type用于设置按钮颜色，1表示蓝色(默认颜色)、2表示黑色、3表示紫色、4表示金色、5表示粉色、6表示玫粉。仅华为厂商支持sub_type取值为2、3、4、5、6。 > - 当card_id为CardVoucher时，sub_type用于设置按钮样式，1表示静态按钮，2表示动态按钮。目前仅华为厂商支持动态按钮。 > - 当card_id为ShortVideoImage时，sub_type用于设置是否显示播放图标，1表示不显示，2表示显示。 > - 当card_id为EcommerceCouponVertical和EcommerceCouponHorizontal时，sub_type用于设置卡券区是否隐藏。sub_type设置为1，卡券区（position_number为4~7）的visible设置为1，且卡券区（position_number为7）的button_type设置为static或dynamic时，显示卡券区；sub_type设置为2，卡券区（position_number为4~7）的visible设置为0，且卡券区（position_number为7）的button_type设置为空值或不带该字段时，卡券区被隐藏。
     * @return subType
     */
    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public CreateAimPersonalTemplateRequestBody withSmsExample(String smsExample) {
        this.smsExample = smsExample;
        return this;
    }

    /**
     * 要发送的原始文本消息示例。
     * @return smsExample
     */
    public String getSmsExample() {
        return smsExample;
    }

    public void setSmsExample(String smsExample) {
        this.smsExample = smsExample;
    }

    public CreateAimPersonalTemplateRequestBody withSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }

    public CreateAimPersonalTemplateRequestBody addSmsSignsItem(String smsSignsItem) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        this.smsSigns.add(smsSignsItem);
        return this;
    }

    public CreateAimPersonalTemplateRequestBody withSmsSigns(Consumer<List<String>> smsSignsSetter) {
        if (this.smsSigns == null) {
            this.smsSigns = new ArrayList<>();
        }
        smsSignsSetter.accept(this.smsSigns);
        return this;
    }

    /**
     * 短信签名。最多可以传三个签名，发送短信时，只要能匹配其中一个即可。填写的短信签名为企业绑定的签名，每个签名最多20个字，支持输入中文，英文，数字，符号，单个签名内容不包括中括号。  > 选择厂商包含VIVO时，此参数必填。 
     * @return smsSigns
     */
    public List<String> getSmsSigns() {
        return smsSigns;
    }

    public void setSmsSigns(List<String> smsSigns) {
        this.smsSigns = smsSigns;
    }

    public CreateAimPersonalTemplateRequestBody withSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate;
        return this;
    }

    /**
     * 短信原文模板。参数示例：尊敬的客户，截至[文本0-20]，您本月国内通用流量已使用[数字0-4]GB，使用到[数字0-4]GB ，整体上网速度将不高于[数字0-2]Mbps。您可点击[字母0-20]获取[文本0-20]。  > - 正则类型仅支持文本、字母、数字三种，且长度最大为99，且中括号为英文中括号。静态短信文案加正则动态文案最大值的总字数不超过370个字符 > - 选择厂商包含VIVO时，此参数必填 
     * @return smsTemplate
     */
    public String getSmsTemplate() {
        return smsTemplate;
    }

    public void setSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate;
    }

    public CreateAimPersonalTemplateRequestBody withPages(List<AimPersonalTemplatePage> pages) {
        this.pages = pages;
        return this;
    }

    public CreateAimPersonalTemplateRequestBody addPagesItem(AimPersonalTemplatePage pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    public CreateAimPersonalTemplateRequestBody withPages(Consumer<List<AimPersonalTemplatePage>> pagesSetter) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        pagesSetter.accept(this.pages);
        return this;
    }

    /**
     * 模板协议，最大支持10页协议。
     * @return pages
     */
    public List<AimPersonalTemplatePage> getPages() {
        return pages;
    }

    public void setPages(List<AimPersonalTemplatePage> pages) {
        this.pages = pages;
    }

    public CreateAimPersonalTemplateRequestBody withParams(List<AimPersonalTemplateParam> params) {
        this.params = params;
        return this;
    }

    public CreateAimPersonalTemplateRequestBody addParamsItem(AimPersonalTemplateParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public CreateAimPersonalTemplateRequestBody withParams(Consumer<List<AimPersonalTemplateParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 模板参数集。
     * @return params
     */
    public List<AimPersonalTemplateParam> getParams() {
        return params;
    }

    public void setParams(List<AimPersonalTemplateParam> params) {
        this.params = params;
    }

    public CreateAimPersonalTemplateRequestBody withFactorys(List<AimPersonalTemplateFactory> factorys) {
        this.factorys = factorys;
        return this;
    }

    public CreateAimPersonalTemplateRequestBody addFactorysItem(AimPersonalTemplateFactory factorysItem) {
        if (this.factorys == null) {
            this.factorys = new ArrayList<>();
        }
        this.factorys.add(factorysItem);
        return this;
    }

    public CreateAimPersonalTemplateRequestBody withFactorys(
        Consumer<List<AimPersonalTemplateFactory>> factorysSetter) {
        if (this.factorys == null) {
            this.factorys = new ArrayList<>();
        }
        factorysSetter.accept(this.factorys);
        return this;
    }

    /**
     * 需要提交的厂商列表。
     * @return factorys
     */
    public List<AimPersonalTemplateFactory> getFactorys() {
        return factorys;
    }

    public void setFactorys(List<AimPersonalTemplateFactory> factorys) {
        this.factorys = factorys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAimPersonalTemplateRequestBody that = (CreateAimPersonalTemplateRequestBody) obj;
        return Objects.equals(this.cardId, that.cardId) && Objects.equals(this.tplName, that.tplName)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.useId, that.useId)
            && Objects.equals(this.subType, that.subType) && Objects.equals(this.smsExample, that.smsExample)
            && Objects.equals(this.smsSigns, that.smsSigns) && Objects.equals(this.smsTemplate, that.smsTemplate)
            && Objects.equals(this.pages, that.pages) && Objects.equals(this.params, that.params)
            && Objects.equals(this.factorys, that.factorys);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cardId, tplName, scene, useId, subType, smsExample, smsSigns, smsTemplate, pages, params, factorys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAimPersonalTemplateRequestBody {\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    useId: ").append(toIndentedString(useId)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    smsExample: ").append(toIndentedString(smsExample)).append("\n");
        sb.append("    smsSigns: ").append(toIndentedString(smsSigns)).append("\n");
        sb.append("    smsTemplate: ").append(toIndentedString(smsTemplate)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    factorys: ").append(toIndentedString(factorys)).append("\n");
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

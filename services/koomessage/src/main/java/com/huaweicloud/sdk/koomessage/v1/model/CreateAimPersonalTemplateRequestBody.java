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
    @JsonProperty(value = "sms_example")

    private String smsExample;

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
     * 布局类型。 - MultipleImageAndText：多图文类 - StandardImageAndText：图文类 - PureText：长文本类 - VideoImageAndText：视频图文类 - Video：视频类 - ECImageAndText：电商类 - RedPacket：红包类 - RedPacketPersonal：个性化红包类 - ImageTextAndVideo：图文视频类 - Notification1：一般通知类 - Notification2：增强通知类 - Carousel：横滑类1 - CarouselTitle：横滑类2 - CarouselSquareImage：图片轮播类（1:1） - CarouselImageSixteenToNine：图片轮播类（16:9） - CarouselVerticalImage：图片轮播类（48:65） - CardVoucher：单卡券 - CardVouchers：多卡券（最多支持四张卡券） 
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAimPersonalTemplateRequestBody createAimPersonalTemplateRequestBody =
            (CreateAimPersonalTemplateRequestBody) o;
        return Objects.equals(this.cardId, createAimPersonalTemplateRequestBody.cardId)
            && Objects.equals(this.tplName, createAimPersonalTemplateRequestBody.tplName)
            && Objects.equals(this.scene, createAimPersonalTemplateRequestBody.scene)
            && Objects.equals(this.useId, createAimPersonalTemplateRequestBody.useId)
            && Objects.equals(this.smsExample, createAimPersonalTemplateRequestBody.smsExample)
            && Objects.equals(this.pages, createAimPersonalTemplateRequestBody.pages)
            && Objects.equals(this.params, createAimPersonalTemplateRequestBody.params)
            && Objects.equals(this.factorys, createAimPersonalTemplateRequestBody.factorys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, tplName, scene, useId, smsExample, pages, params, factorys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAimPersonalTemplateRequestBody {\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    useId: ").append(toIndentedString(useId)).append("\n");
        sb.append("    smsExample: ").append(toIndentedString(smsExample)).append("\n");
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

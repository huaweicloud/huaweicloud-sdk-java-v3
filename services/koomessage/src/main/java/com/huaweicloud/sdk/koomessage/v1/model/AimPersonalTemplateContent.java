package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模板协议内容数据结构。
 */
public class AimPersonalTemplateContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_child")

    private String contentChild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_type")

    private Integer srcType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src")

    private String src;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    private String cover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_text_title")

    private String isTextTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_number")

    private Integer positionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Integer visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency_display")

    private Integer currencyDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oppo_background")

    private String oppoBackground;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vivo_background")

    private String vivoBackground;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private String ratio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private AimPersonalTemplateContentAction action;

    public AimPersonalTemplateContent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板资源类型。 - text：表示文本 - image：表示图片 - video：表示视频 - button：表示按钮 - followPub：表示华为服务号，暂不支持  > 图片轮播类模板最多可以放5张图片，即card_id为CarouselSquareImage、CarouselImageSixteenToNine、CarouselVerticalImage时，type为image的资源最多有5个。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AimPersonalTemplateContent withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 资源类型为Text或Button时，为必填。文本长度限制请按智能短信模板版式格式标准。  > 智能信息模板标准版式要求可登录KooMessage控制台，在创建智能信息模板中查看。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AimPersonalTemplateContent withContentChild(String contentChild) {
        this.contentChild = contentChild;
        return this;
    }

    /**
     * 子内容。非必填，文本长度限制请参考智能信息模板标准版式要求。  > 智能信息模板标准版式要求可登录KooMessage控制台，在创建智能信息模板中查看。 
     * @return contentChild
     */
    public String getContentChild() {
        return contentChild;
    }

    public void setContentChild(String contentChild) {
        this.contentChild = contentChild;
    }

    public AimPersonalTemplateContent withSrcType(Integer srcType) {
        this.srcType = srcType;
        return this;
    }

    /**
     * src类型。资源类型为Image或Video时，该项为必填项。 - 1：指资源ID  - 2：指资源地址  > src_type为2，即资源地址时，src或cover内容必须是存储在客户侧服务器上的资源地址。 
     * minimum: 1
     * maximum: 10
     * @return srcType
     */
    public Integer getSrcType() {
        return srcType;
    }

    public void setSrcType(Integer srcType) {
        this.srcType = srcType;
    }

    public AimPersonalTemplateContent withSrc(String src) {
        this.src = src;
        return this;
    }

    /**
     * 资源来源，资源类型为Image或Video时，为必填，通过设置视频模板封面图接口设置视频封面。 > - 如上src_type为1，即资源ID时，参数填入上传模板素材接口中返回的aim_resource_id，如：691996319597764608 > - 如上src_type为2，即资源地址时，参数填写资源完整的URL，最大长度不超过1000个字符  
     * @return src
     */
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public AimPersonalTemplateContent withCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * 视频封面。 > 资源类型为Video时，为必填。 > - 如上src_type为1，即资源ID时，参数填入上传模板素材接口中返回的aim_resource_id，如：691996319597764608 > - 如上src_type为2，即资源地址时，参数填写资源完整的URL，最大长度不超过1000个字符 
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public AimPersonalTemplateContent withIsTextTitle(String isTextTitle) {
        this.isTextTitle = isTextTitle;
        return this;
    }

    /**
     * 是否为文本标题。  - true：是 - false：不是  > 不填默认为false。 
     * @return isTextTitle
     */
    public String getIsTextTitle() {
        return isTextTitle;
    }

    public void setIsTextTitle(String isTextTitle) {
        this.isTextTitle = isTextTitle;
    }

    public AimPersonalTemplateContent withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 功能类型。  - OPEN_URL：表示跳转H5 - OPEN_QUICK：表示跳转快应用 - OPEN_APP：表示跳转APP - DIAL_PHONE：表示拉起拨号盘 - OPEN_SMS：表示新建短信息 - OPEN_EMAIL：表示打开邮箱 - OPEN_SCHEDULE：表示新建日程 - OPEN_MAP：表示位置定位 - OPEN_BROWSER：表示打开浏览器 - OPEN_POPUP：表示弹窗 - COPY_PARAMETER：表示复制 - VIEW_PIC：表示打开大图  > - type为Image和Button时为必填项，必须绑定事件 > - type为其他类型时则不必填 > - OPPO厂商点击事件类型只支持打开浏览器、打开快应用、打开APP、跳转H5 > - VIVO厂商点击事件类型不支持打开邮箱、打开地图 > - MEIZU厂商点击事件类型不支持打开大图 > - 横滑类1、横滑类2版式的图片不支持绑定事件，默认与按钮事件一致  
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public AimPersonalTemplateContent withPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
        return this;
    }

    /**
     * 卡片组件的位置序号。 > 资源在卡片上相对的位置序号，按照优先从左到右，再从上到下的编排原则，统一编号。 
     * @return positionNumber
     */
    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public AimPersonalTemplateContent withVisible(Integer visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 组件是否可见。 - 0：隐藏（某些组件可设置隐藏） - 1：可见  > 目前仅针对电商多商品（Ecommerce）、多卡券（CardVouchers）、增强机票类（PlaneTrip）这三种版式起效。 
     * @return visible
     */
    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public AimPersonalTemplateContent withCurrencyDisplay(Integer currencyDisplay) {
        this.currencyDisplay = currencyDisplay;
        return this;
    }

    /**
     * 是否显示货币符号。  - 0：隐藏  - 1：可见  > 当模板为电商类时是否显示￥符号，默认可见。 
     * @return currencyDisplay
     */
    public Integer getCurrencyDisplay() {
        return currencyDisplay;
    }

    public void setCurrencyDisplay(Integer currencyDisplay) {
        this.currencyDisplay = currencyDisplay;
    }

    public AimPersonalTemplateContent withOppoBackground(String oppoBackground) {
        this.oppoBackground = oppoBackground;
        return this;
    }

    /**
     * OPPO红包背景。  > - 当src_type为1时，即资源ID时，参数填入上传模板素材接口中返回的aim_resource_id，如：691996319597764608 > - 当src_type为2时，即资源地址时，参数填写资源完整的URL，最大长度不超过1000个字符 >- 当模板为红包类，即card_id为RedPacket时用于指定OPPO厂商红包背景图，具体使用可参考创建红包类模板请求示例 
     * @return oppoBackground
     */
    public String getOppoBackground() {
        return oppoBackground;
    }

    public void setOppoBackground(String oppoBackground) {
        this.oppoBackground = oppoBackground;
    }

    public AimPersonalTemplateContent withVivoBackground(String vivoBackground) {
        this.vivoBackground = vivoBackground;
        return this;
    }

    /**
     * VIVO红包背景。  > - 当src_type为1时，即资源ID时，参数填入上传模板素材接口中返回的aim_resource_id，如：691996319597764608 > - 当src_type为2时，即资源地址时，参数填写资源完整的URL，最大长度不超过1000个字符 
     * @return vivoBackground
     */
    public String getVivoBackground() {
        return vivoBackground;
    }

    public void setVivoBackground(String vivoBackground) {
        this.vivoBackground = vivoBackground;
    }

    public AimPersonalTemplateContent withRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 表示短剧视频模板视频和封面的宽高比。即card_id为ShortVideo时，此项有值。 - threeToFour: 宽高比为3:4 - oneToOne: 宽高比为1:1 
     * @return ratio
     */
    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public AimPersonalTemplateContent withAction(AimPersonalTemplateContentAction action) {
        this.action = action;
        return this;
    }

    public AimPersonalTemplateContent withAction(Consumer<AimPersonalTemplateContentAction> actionSetter) {
        if (this.action == null) {
            this.action = new AimPersonalTemplateContentAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public AimPersonalTemplateContentAction getAction() {
        return action;
    }

    public void setAction(AimPersonalTemplateContentAction action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AimPersonalTemplateContent that = (AimPersonalTemplateContent) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.content, that.content)
            && Objects.equals(this.contentChild, that.contentChild) && Objects.equals(this.srcType, that.srcType)
            && Objects.equals(this.src, that.src) && Objects.equals(this.cover, that.cover)
            && Objects.equals(this.isTextTitle, that.isTextTitle) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.positionNumber, that.positionNumber) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.currencyDisplay, that.currencyDisplay)
            && Objects.equals(this.oppoBackground, that.oppoBackground)
            && Objects.equals(this.vivoBackground, that.vivoBackground) && Objects.equals(this.ratio, that.ratio)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            content,
            contentChild,
            srcType,
            src,
            cover,
            isTextTitle,
            actionType,
            positionNumber,
            visible,
            currencyDisplay,
            oppoBackground,
            vivoBackground,
            ratio,
            action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AimPersonalTemplateContent {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentChild: ").append(toIndentedString(contentChild)).append("\n");
        sb.append("    srcType: ").append(toIndentedString(srcType)).append("\n");
        sb.append("    src: ").append(toIndentedString(src)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    isTextTitle: ").append(toIndentedString(isTextTitle)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    positionNumber: ").append(toIndentedString(positionNumber)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    currencyDisplay: ").append(toIndentedString(currencyDisplay)).append("\n");
        sb.append("    oppoBackground: ").append(toIndentedString(oppoBackground)).append("\n");
        sb.append("    vivoBackground: ").append(toIndentedString(vivoBackground)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

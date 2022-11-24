package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 个人模板事件对象。
 */
public class AimPersonalTemplateContentAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floor_url")

    private String floorUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floor_type")

    private Integer floorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private String longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private String latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_button")

    private String textButton;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Integer mode;

    public AimPersonalTemplateContentAction withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 此字段根据action_type对应不同的含义，具体对应如下。  - action_type=OPEN_URL：表示H5访问地址。必须为HTTPS，支持含动态参数。字符长度为1-1000。示例：https://XXXXX/${param1} - action_type=OPEN_QUICK：表示快应用deeplink地址。支持含动态参数，字符长度为1-1000。示例：hap://app/xxx/${param1} - action_type=OPEN_APP：表示APP的deeplink地址。支持含动态参数，字符长度为1-1000。示例：weixin:// - action_type=DIAL_PHONE：表示电话号码。不能超过20个字符。示例：18600000000 - action_type=OPEN_SMS：表示电话号码。不能超过20个字符。示例：18600000000 - action_type=OPEN_EMAIL：表示邮箱地址。不能超过100个字符。示例：1046520406@qq.com。 - action_type=OPEN_SCHEDULE：表示日程标题。不能超过100个字符。示例：日常需求评审 - action_type=OPEN_MAP：表示位置名。不能超过100个字符。示例：龙泰利科技大厦 - action_type=OPEN_BROWSER：表示网址。支持HTTPS或HTTP，支持含动态参数，不能超过1000个字符。示例：https://XXXXX/${param1} - action_type=OPEN_POPUP：表示弹窗标题。不能超过30个字符。参数示例：xxx商品 - action_type=COPY_PARAMETER：表示复制的内容。支持含动态参数，不能超过20个字符。复制验证码示例：83721 - action_type=VIEW_PIC：表示要打开的大图ID。配置在打开大图的资源地址与模板上的图片资源地址一致。如果模板资源类型是ID，则传ID，如果是资源地址，则使用资源地址。最大长度不能超过1000个字符。例如：当src_type为1时，传入ID：691996319597764608。当src_type为2时，使用资源地址：https://www.xxxx.cn/src/image/head.jpg 
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public AimPersonalTemplateContentAction withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 弹窗内容。  > action_type=OPEN_POPUP为必填。不能超过100个字符。示例：是否喜欢该商品。 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AimPersonalTemplateContentAction withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 包名。  > action_type=OPEN_APP为必填。不能超过50个字符。示例：com.xxxx.service.koomsg。 
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public AimPersonalTemplateContentAction withFloorUrl(String floorUrl) {
        this.floorUrl = floorUrl;
        return this;
    }

    /**
     * 兜底URL。支持快应用deeplink或H5的HTTPS网址，不能超过1000个字。  > - action_type=OPEN_APP为选填，其他类型不填 > - 兜底类型为0时，可不填 > - 当兜底类型为2并且提交厂商列表中包含OPPO厂商时为必填 
     * @return floorUrl
     */
    public String getFloorUrl() {
        return floorUrl;
    }

    public void setFloorUrl(String floorUrl) {
        this.floorUrl = floorUrl;
    }

    public AimPersonalTemplateContentAction withFloorType(Integer floorType) {
        this.floorType = floorType;
        return this;
    }

    /**
     * 兜底类型。如果传入的厂商不支持该兜底类型，接口会返回错误。如果不传入厂商，则不对兜底类型进行校。 - 0：打开应用市场 - 1：打开H5页面（通过收件箱内置浏览器打开） - 2：打开浏览器 - 3：打开快应用  > action_type=OPEN_APP为选填，其他类型不填；action_type=OPEN_APP时此参数不填则默认打开应用市场。打开链接为http格式时必须选择打开浏览器；打开链接为https格式且内容只是一个普通页面时，可以使用打开H5页面，当链接中有下载指引或打开小程序由于部分内置浏览器功能不全可能导致打开异常，建议使用打开浏览器，请按需选择兜底类型。 > - 华为：支持以上4种兜底 > - 魅族：支持以上4种兜底 > - 小米：不支持打开H5页面兜底 > - OPPO：不支持打开H5页面和打开快应用兜底 > - VIVO：不支持打开H5页面和打开快应用兜底 
     * minimum: 0
     * maximum: 3
     * @return floorType
     */
    public Integer getFloorType() {
        return floorType;
    }

    public void setFloorType(Integer floorType) {
        this.floorType = floorType;
    }

    public AimPersonalTemplateContentAction withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 邮件标题。  > action_type=OPEN_EMAIL为必填。不能超过100个字符。示例：618活动促销。 
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AimPersonalTemplateContentAction withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 邮件正文/短信正文。  > action_type=OPEN_SMS或OPEN_EMAIL为必填。不能超过100个字符。 > > 短信正文示例1：今天回家吃饭吗； > > 邮件正文示例2：您有一张优惠券领取。 
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AimPersonalTemplateContentAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 日程内容描述。  > action_type=OPEN_SCHEDULE为必填。不能超过100个字符。示例：评审这个月版本需求。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AimPersonalTemplateContentAction withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 日程开始时间。格式为：yyyy-MM-dd HH:mm:ss。  > 当action_type=OPEN_SCHEDULE时为必填。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public AimPersonalTemplateContentAction withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 日程结束时间。格式为：yyyy-MM-dd HH:mm:ss。  > 当action_type=OPEN_SCHEDULE时为必填。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AimPersonalTemplateContentAction withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址的详细说明。  > action_type=OPEN_MAP为必填。不能超过100个字符。示例：高新中四道龙泰利科技大厦。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AimPersonalTemplateContentAction withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 地图经度。  > action_type=OPEN_MAP为必填。不能超过20个字符。示例：113.941618。 
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public AimPersonalTemplateContentAction withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 地图纬度。  > action_type=OPEN_MAP为必填。不能超过20个字符。示例：22.548804。 
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public AimPersonalTemplateContentAction withTextButton(String textButton) {
        this.textButton = textButton;
        return this;
    }

    /**
     * 按钮展示文本。  > action_type=OPEN_POPUP为必填。不能超过12个字符。示例：确定。 
     * @return textButton
     */
    public String getTextButton() {
        return textButton;
    }

    public void setTextButton(String textButton) {
        this.textButton = textButton;
    }

    public AimPersonalTemplateContentAction withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 弹窗模态。  - 0：模态（默认） - 1：非模态（暂不支持）  > action_type=OPEN_POPUP为必填。 
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AimPersonalTemplateContentAction aimPersonalTemplateContentAction = (AimPersonalTemplateContentAction) o;
        return Objects.equals(this.target, aimPersonalTemplateContentAction.target)
            && Objects.equals(this.content, aimPersonalTemplateContentAction.content)
            && Objects.equals(this.packageName, aimPersonalTemplateContentAction.packageName)
            && Objects.equals(this.floorUrl, aimPersonalTemplateContentAction.floorUrl)
            && Objects.equals(this.floorType, aimPersonalTemplateContentAction.floorType)
            && Objects.equals(this.subject, aimPersonalTemplateContentAction.subject)
            && Objects.equals(this.body, aimPersonalTemplateContentAction.body)
            && Objects.equals(this.description, aimPersonalTemplateContentAction.description)
            && Objects.equals(this.beginTime, aimPersonalTemplateContentAction.beginTime)
            && Objects.equals(this.endTime, aimPersonalTemplateContentAction.endTime)
            && Objects.equals(this.address, aimPersonalTemplateContentAction.address)
            && Objects.equals(this.longitude, aimPersonalTemplateContentAction.longitude)
            && Objects.equals(this.latitude, aimPersonalTemplateContentAction.latitude)
            && Objects.equals(this.textButton, aimPersonalTemplateContentAction.textButton)
            && Objects.equals(this.mode, aimPersonalTemplateContentAction.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target,
            content,
            packageName,
            floorUrl,
            floorType,
            subject,
            body,
            description,
            beginTime,
            endTime,
            address,
            longitude,
            latitude,
            textButton,
            mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AimPersonalTemplateContentAction {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    floorUrl: ").append(toIndentedString(floorUrl)).append("\n");
        sb.append("    floorType: ").append(toIndentedString(floorType)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    textButton: ").append(toIndentedString(textButton)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

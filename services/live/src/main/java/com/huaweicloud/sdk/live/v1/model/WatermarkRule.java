package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WatermarkRule
 */
public class WatermarkRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private WatermarkLocation location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transcode_template_name")

    private String transcodeTemplateName;

    public WatermarkRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 水印规则名称，如果不填会使用默认名称。默认名称的构造规则为“域名:应用名:流名”，示例“example.com:live:stream”。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public WatermarkRule withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 水印模板ID，只包含数字字母中划线，创建模板时生成
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public WatermarkRule withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public WatermarkRule withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * APP名。须知：云直播场景是可选配置，媒体直播场景为必选配置。
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public WatermarkRule withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名OTT场景下，可以不填
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public WatermarkRule withLocation(WatermarkLocation location) {
        this.location = location;
        return this;
    }

    public WatermarkRule withLocation(Consumer<WatermarkLocation> locationSetter) {
        if (this.location == null) {
            this.location = new WatermarkLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public WatermarkLocation getLocation() {
        return location;
    }

    public void setLocation(WatermarkLocation location) {
        this.location = location;
    }

    public WatermarkRule withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * OTT场景使用，填对应频道的频ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public WatermarkRule withTranscodeTemplateName(String transcodeTemplateName) {
        this.transcodeTemplateName = transcodeTemplateName;
        return this;
    }

    /**
     * OTT场景时，填频道对应的转码模板名称
     * @return transcodeTemplateName
     */
    public String getTranscodeTemplateName() {
        return transcodeTemplateName;
    }

    public void setTranscodeTemplateName(String transcodeTemplateName) {
        this.transcodeTemplateName = transcodeTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatermarkRule that = (WatermarkRule) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.location, that.location)
            && Objects.equals(this.channelId, that.channelId)
            && Objects.equals(this.transcodeTemplateName, that.transcodeTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, templateId, domain, app, stream, location, channelId, transcodeTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkRule {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    transcodeTemplateName: ").append(toIndentedString(transcodeTemplateName)).append("\n");
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

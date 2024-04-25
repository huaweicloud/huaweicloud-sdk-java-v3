package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AudioStreamCreateRequest
 */
public class AudioStreamCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private AudioStreamCreateRequestData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private String callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed")

    private String seed;

    public AudioStreamCreateRequest withData(AudioStreamCreateRequestData data) {
        this.data = data;
        return this;
    }

    public AudioStreamCreateRequest withData(Consumer<AudioStreamCreateRequestData> dataSetter) {
        if (this.data == null) {
            this.data = new AudioStreamCreateRequestData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public AudioStreamCreateRequestData getData() {
        return data;
    }

    public void setData(AudioStreamCreateRequestData data) {
        this.data = data;
    }

    public AudioStreamCreateRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，可选值如下： default：默认事件 audiobook：有声书 education：教育音频 game：游戏语音房 live：秀场直播 ecommerce：电商直播 voiceroom：交友语音房 private：私密语音聊天
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public AudioStreamCreateRequest withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public AudioStreamCreateRequest addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public AudioStreamCreateRequest withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 需要检测的风险类型，列表不能为空。 porn：涉黄检测 politics: 涉政检测 abuse: 辱骂检测 ad: 广告检测 moan: 娇喘检测
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public AudioStreamCreateRequest withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 回调http接口，服务将根据该字段回调通知用户审核结果，流未结束时，回调审核违规内容，流结束时，审核片段违规或不违规都将回调客户端。 回调内容如下： ``` {     \"job_id\":\"xxxxxx\",     \"status\":\"running\", //running - 审核中，succeeded - 审核完成，failed - 审核失败     \"request_id\":\"2419446b1fe14203f64e4018d12db3dd\",     \"create_time\":\"2022-07-30T08:57:11.011Z\",     \"update_time\":\"2022-07-30T08:57:14.014Z\",     \"result\":{         \"suggestion\":\"block\",         \"details\":[             {                 \"suggestion\":\"block\",                 \"label\":\"politics\",                 \"audio_text\":\"xxxx\",                 \"start_time\":\"2022-07-30T08:57:11.011Z\", // 当前音频片段开始的绝对时间                 \"end_time\":\"2022-07-30T08:57:21.011Z\",     // 当前音频片段结束的绝对时间                 \"segments\":[                     {                         \"segment\":\"xxx\"                     },                     {                         \"segment\":\"xxx\"                     },                     {                         \"segment\":\"xxx\"                     }                 ]             }         ],         \"request_params\":{             \"event_type\":\"default\",             \"data\":{                 \"url\":\"rtmp://xxxx\"             },             \"callback\":\"http://xxx\",             \"categories\":[                 \"porn\",                 \"ad\"             ]         }     } }
     * @return callback
     */
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public AudioStreamCreateRequest withSeed(String seed) {
        this.seed = seed;
        return this;
    }

    /**
     * 用于回调通知时校验请求由华为云内容安全服务发起，由您自定义。随机字符串，由英文字母、数字、下划线组成，不超过64个字符。 说明：当seed非空时，headers中将包含X-Auth-Signature字段，字段的值使用HmacSHA256算法生成，待加密字符串由create_time、job_id、request_id、seed按照顺序拼接而成，密钥为seed。
     * @return seed
     */
    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioStreamCreateRequest that = (AudioStreamCreateRequest) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.categories, that.categories) && Objects.equals(this.callback, that.callback)
            && Objects.equals(this.seed, that.seed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, eventType, categories, callback, seed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioStreamCreateRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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

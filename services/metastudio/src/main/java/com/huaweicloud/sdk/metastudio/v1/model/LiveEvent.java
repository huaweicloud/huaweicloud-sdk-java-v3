package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LiveEvent
 */
public class LiveEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public LiveEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 事件戳。从1970-01-01 00:00:00:000开始的毫秒数
     * minimum: 0
     * maximum: 4102415999000
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public LiveEvent withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 事件类型。 * 1 弹幕信息 * 2 用户入场 * 3 用户点赞 * 4 用户送礼 * 5 用户订阅\\关注 * 6 房间观看人数
     * minimum: 0
     * maximum: 100
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LiveEvent withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 事件内容。<br>事件类型不同，content内容也不同，定义如下： - **type=1 弹幕信息**   content定义：   * user:用户，json   * content: string,弹幕内容    user定义：   * userId：用户id，string   * name：用户姓名，string   * level：用户平台等级，int   * badge：用户牌子名称，string   * badgeLevel：牌子等级，int    举例： ```json {   \"timestamp\": 1694481224245,   \"type\": 1,   \"content\": \"{\\\"user\\\":{\\\"userId\\\":\\\"2027271526\\\",\\\"name\\\":\\\"***\\\",\\\"level\\\":17,\\\"badge\\\":\\\"\\\",\\\"badgeLevel\\\":0},\\\"content\\\":\\\"***\\\"}\" } ``` - **type=2 用户入场**     content定义：   * user:用户，json    举例： ```json {   \"timestamp\": 1694481227655,   \"type\": 2,   \"content\": \"{\\\"user\\\":{\\\"userId\\\":\\\"2978899271\\\",\\\"name\\\":\\\"***\\\",\\\"level\\\":1,\\\"badge\\\":\\\"\\\",\\\"badgeLevel\\\":0}}\" } ``` - **type=3 用户点赞**     content定义：   * user：用户，json    举例： ```json {   \"timestamp\": 1694481227655,   \"type\": 2,   \"content\": \"{\\\"user\\\":{\\\"userId\\\":\\\"2978899271\\\",\\\"name\\\":\\\"***\\\",\\\"level\\\":1,\\\"badge\\\":\\\"\\\",\\\"badgeLevel\\\":0}}\" } ``` - **type=4 用户送礼**     content定义：   * user：用户，json   * gift：礼物信息,json    gift定义：   * giftName：礼物名称，string   * giftNum：礼物数量，int   * totalValue：此处礼物总价值，int   * giftValue：单个礼物价值，int    举例： ```json {   \"timestamp\": 1690531652862,   \"type\": 4,   \"content\": \"{\\\"gift\\\":{\\\"giftName\\\":\\\"小星星\\\",\\\"giftNum\\\":10,\\\"totalValue\\\":10,\\\"giftValue\\\":3},\\\"user\\\":{\\\"userId\\\":\\\"douyin_95882940927\\\",\\\"name\\\":\\\"纯爱战士熙熙\\\",\\\"level\\\":2,\\\"badge\\\":\\\"\\\",\\\"badgeLevel\\\":0}}\" } ``` - **type=5 用户订阅**     暂未使用  - **type=6 房间观看人数**     content定义：   * numberOfViewers：房间观看人数，int    举例： ```json {   \"timestamp\": 1694481236886,   \"type\": 6,   \"content\": \"{\\\"numberOfViewers\\\":5466}\" } ```
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveEvent that = (LiveEvent) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, type, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveEvent {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

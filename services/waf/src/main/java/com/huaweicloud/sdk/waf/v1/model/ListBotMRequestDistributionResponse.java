package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBotMRequestDistributionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_bucket")

    private BotRequestDistributionsNormalBucket normalBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bot_classification_bucket")

    private BotTypeDistributions botClassificationBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_bucket")

    private ActionDistributions actionBucket;

    public ListBotMRequestDistributionResponse withNormalBucket(BotRequestDistributionsNormalBucket normalBucket) {
        this.normalBucket = normalBucket;
        return this;
    }

    public ListBotMRequestDistributionResponse withNormalBucket(
        Consumer<BotRequestDistributionsNormalBucket> normalBucketSetter) {
        if (this.normalBucket == null) {
            this.normalBucket = new BotRequestDistributionsNormalBucket();
            normalBucketSetter.accept(this.normalBucket);
        }

        return this;
    }

    /**
     * Get normalBucket
     * @return normalBucket
     */
    public BotRequestDistributionsNormalBucket getNormalBucket() {
        return normalBucket;
    }

    public void setNormalBucket(BotRequestDistributionsNormalBucket normalBucket) {
        this.normalBucket = normalBucket;
    }

    public ListBotMRequestDistributionResponse withBotClassificationBucket(
        BotTypeDistributions botClassificationBucket) {
        this.botClassificationBucket = botClassificationBucket;
        return this;
    }

    public ListBotMRequestDistributionResponse withBotClassificationBucket(
        Consumer<BotTypeDistributions> botClassificationBucketSetter) {
        if (this.botClassificationBucket == null) {
            this.botClassificationBucket = new BotTypeDistributions();
            botClassificationBucketSetter.accept(this.botClassificationBucket);
        }

        return this;
    }

    /**
     * Get botClassificationBucket
     * @return botClassificationBucket
     */
    public BotTypeDistributions getBotClassificationBucket() {
        return botClassificationBucket;
    }

    public void setBotClassificationBucket(BotTypeDistributions botClassificationBucket) {
        this.botClassificationBucket = botClassificationBucket;
    }

    public ListBotMRequestDistributionResponse withActionBucket(ActionDistributions actionBucket) {
        this.actionBucket = actionBucket;
        return this;
    }

    public ListBotMRequestDistributionResponse withActionBucket(Consumer<ActionDistributions> actionBucketSetter) {
        if (this.actionBucket == null) {
            this.actionBucket = new ActionDistributions();
            actionBucketSetter.accept(this.actionBucket);
        }

        return this;
    }

    /**
     * Get actionBucket
     * @return actionBucket
     */
    public ActionDistributions getActionBucket() {
        return actionBucket;
    }

    public void setActionBucket(ActionDistributions actionBucket) {
        this.actionBucket = actionBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBotMRequestDistributionResponse that = (ListBotMRequestDistributionResponse) obj;
        return Objects.equals(this.normalBucket, that.normalBucket)
            && Objects.equals(this.botClassificationBucket, that.botClassificationBucket)
            && Objects.equals(this.actionBucket, that.actionBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(normalBucket, botClassificationBucket, actionBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMRequestDistributionResponse {\n");
        sb.append("    normalBucket: ").append(toIndentedString(normalBucket)).append("\n");
        sb.append("    botClassificationBucket: ").append(toIndentedString(botClassificationBucket)).append("\n");
        sb.append("    actionBucket: ").append(toIndentedString(actionBucket)).append("\n");
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

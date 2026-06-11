package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowObsUrlOfTrainingJobLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private Shards shards;

    public ShowObsUrlOfTrainingJobLogsResponse withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * 日志OBS临时链接（复制到浏览器可查看当前全量日志）。
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    public ShowObsUrlOfTrainingJobLogsResponse withShards(Shards shards) {
        this.shards = shards;
        return this;
    }

    public ShowObsUrlOfTrainingJobLogsResponse withShards(Consumer<Shards> shardsSetter) {
        if (this.shards == null) {
            this.shards = new Shards();
            shardsSetter.accept(this.shards);
        }

        return this;
    }

    /**
     * Get shards
     * @return shards
     */
    public Shards getShards() {
        return shards;
    }

    public void setShards(Shards shards) {
        this.shards = shards;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowObsUrlOfTrainingJobLogsResponse that = (ShowObsUrlOfTrainingJobLogsResponse) obj;
        return Objects.equals(this.obsUrl, that.obsUrl) && Objects.equals(this.shards, that.shards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsUrl, shards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowObsUrlOfTrainingJobLogsResponse {\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
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

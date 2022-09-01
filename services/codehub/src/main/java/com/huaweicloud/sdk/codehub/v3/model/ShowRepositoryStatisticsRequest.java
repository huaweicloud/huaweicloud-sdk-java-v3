package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowRepositoryStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    @JacksonXmlProperty(localName = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ShowRepositoryStatisticsRequestBody body;

    public ShowRepositoryStatisticsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库的主键id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowRepositoryStatisticsRequest withBody(ShowRepositoryStatisticsRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowRepositoryStatisticsRequest withBody(Consumer<ShowRepositoryStatisticsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ShowRepositoryStatisticsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ShowRepositoryStatisticsRequestBody getBody() {
        return body;
    }

    public void setBody(ShowRepositoryStatisticsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRepositoryStatisticsRequest showRepositoryStatisticsRequest = (ShowRepositoryStatisticsRequest) o;
        return Objects.equals(this.repositoryId, showRepositoryStatisticsRequest.repositoryId)
            && Objects.equals(this.body, showRepositoryStatisticsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryStatisticsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

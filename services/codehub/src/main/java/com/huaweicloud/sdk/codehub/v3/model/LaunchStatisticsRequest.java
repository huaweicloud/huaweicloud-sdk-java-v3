package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.LaunchRepoStatisticsRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class LaunchStatisticsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_id")
    
    private Integer repositoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private LaunchRepoStatisticsRequest body = null;

    public LaunchStatisticsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    


    /**
     * Get repositoryId
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public LaunchStatisticsRequest withBody(LaunchRepoStatisticsRequest body) {
        this.body = body;
        return this;
    }

    public LaunchStatisticsRequest withBody(Consumer<LaunchRepoStatisticsRequest> bodySetter) {
        if(this.body == null ){
            this.body = new LaunchRepoStatisticsRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public LaunchRepoStatisticsRequest getBody() {
        return body;
    }

    public void setBody(LaunchRepoStatisticsRequest body) {
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
        LaunchStatisticsRequest launchStatisticsRequest = (LaunchStatisticsRequest) o;
        return Objects.equals(this.repositoryId, launchStatisticsRequest.repositoryId) &&
            Objects.equals(this.body, launchStatisticsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchStatisticsRequest {\n");
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


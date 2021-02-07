package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.ShowReposResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSharedReposDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<ShowReposResp> body = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Content-Range")
    
    private String contentRange;

    public ListSharedReposDetailsResponse withBody(List<ShowReposResp> body) {
        this.body = body;
        return this;
    }

    
    public ListSharedReposDetailsResponse addBodyItem(ShowReposResp bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListSharedReposDetailsResponse withBody(Consumer<List<ShowReposResp>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<ShowReposResp> getBody() {
        return body;
    }

    public void setBody(List<ShowReposResp> body) {
        this.body = body;
    }

    public ListSharedReposDetailsResponse withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    


    /**
     * Get contentRange
     * @return contentRange
     */
    public String getContentRange() {
        return contentRange;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSharedReposDetailsResponse listSharedReposDetailsResponse = (ListSharedReposDetailsResponse) o;
        return Objects.equals(this.body, listSharedReposDetailsResponse.body) &&
            Objects.equals(this.contentRange, listSharedReposDetailsResponse.contentRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body, contentRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharedReposDetailsResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    contentRange: ").append(toIndentedString(contentRange)).append("\n");
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

